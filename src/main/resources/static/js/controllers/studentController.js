var studentApp = angular.module('studentApp',[]);
studentApp.controller('studentController',['$scope','$http', function($scope,$http){
    $scope.students=[];

    $scope.loadStudents = function(){
        $http.get('/students').then(function(response){
            $scope.students = response.data._embedded.students;
        });
    }
    $scope.loadStudents();

}]);

studentApp.controller('addstudentController',['$scope','$http', function($scope,$http){
    $scope.newStudent={
        "name": "",
        "rut": "",
        "email": "",
        "career": "",
        "income_year": ""
    };

    $scope.resetNewStudent = function() {
        $scope.newStudent = {
            "name": "",
            "rut": "",
            "email": "",
            "career": "",
            "income_year": ""
        }
    }

    $scope.send = function() {
        console.log($scope.newStudent);
        var student = {
            "name": $scope.newStudent.name,
            "rut": $scope.newStudent.rut,
            "email": $scope.newStudent.email,
            "career": $scope.newStudent.career,
            "income_year": $scope.newStudent.income_year
        }
        $http.post('/students', student).then(function (response) {
            console.log(response);
            $scope.resetNewStudent();
            var status = response.status;
            if(status === 201){
                alert("Se ha agregado al estudiante satisfactoriamente.");
            }
            else {
                alert("Hubo un error al agregar al estudiante, por favor intente más tarde");
            }

        })


    }



}]);