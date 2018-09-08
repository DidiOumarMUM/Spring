var phonecatApp = angular.module('phonecatApp', ["ngRoute"]);

// Define the `PhoneListController` controller on the `phonecatApp` module
phonecatApp.config(function($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl : "index.html"
        })

        .when("/phones", {
            templateUrl : "phones.html"
        })
        .when("/users", {
            templateUrl : "users.html"
        }).otherwise({
        template : "index.html"
    });
});