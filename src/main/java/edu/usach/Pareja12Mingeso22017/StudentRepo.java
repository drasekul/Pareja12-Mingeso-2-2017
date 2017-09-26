package edu.usach.Pareja12Mingeso22017;

import edu.usach.Pareja12Mingeso22017.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mario on 26-09-17.
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    public Student findByName(String name);

}
