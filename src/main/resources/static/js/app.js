var app = angular.module('student', ['ngRoute']);

app.config(function ($routeProvider) {
    $routeProvider
        .when('/studentsList', {
            templateUrl: '/js/views/studentsList.html',
            controller: 'studentController'
        })

        .when('/addStudent', {
            templateUrl: 'js/views/addStudent.html',
            controller: ''
        })

        .otherwise({
            redirectTo: '/index'
        });
    $locationProvider.html5Mode(true);

});