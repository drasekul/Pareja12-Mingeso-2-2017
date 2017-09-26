package edu.usach.Pareja12Mingeso22017.controllers;

/**
 * Created by mario on 26-09-17.
 */
import edu.usach.Pareja12Mingeso22017.StudentRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.*;
import edu.usach.Pareja12Mingeso22017.models.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StudentTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private StudentRepo sRepo;

    @Test
    public void getStudentsTest(){
        //Test DB
        Student test1 = new Student("DVA","11111111-1","dva@gmail.com","Pro Player",2022);
        entityManager.persist(test1);
        Student test2 = new Student("Winston","22222222-2","winston@gmail.com","Scientist",2048);
        entityManager.persist(test2);
        Student test3 = new Student("Hanzo","33333333-3","hanzo@gmail.com","Main",2056);
        entityManager.persist(test3);
        entityManager.flush();

        //Search All
        Iterable<Student> students = sRepo.findAll();

        int i = 1;
        System.out.println("+++++++++++++++TEST FINDALL+++++++++++++++");
        for (Student student:students){
            System.out.println("NOMBRE "+i+": "+student.getName());
            i++;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        //Assert
        assertThat(students).hasSize(3).contains(test1, test2, test3);
    }

    @Test
    public void createStudentTest(){
        // Insert
        Student test = new Student("Juan Perez","12345678-9","JPerez@gmail.com","Medicina",2013);
        entityManager.persist(test);
        entityManager.flush();

        // Search.
        Student found = sRepo.findByName(test.getName());
        System.out.println("++++++++++++++++TEST CREATE+++++++++++++++");
        System.out.println("NOMBRE: "+found.getName());
        System.out.println("RUT: "+found.getRut());
        System.out.println("MAIL: "+found.getEmail());
        System.out.println("CARRERA: "+found.getCareer());
        System.out.println("INGRESO: "+found.getIncome_year());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        // Assert
        assertThat(found.getName())
                .isEqualTo(test.getName());
    }

}
