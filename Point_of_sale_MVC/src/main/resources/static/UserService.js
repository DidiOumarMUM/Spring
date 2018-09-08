phonecatApp.service('UserService' , function ($http)
{
  this.getUsers = function ()
  {
      return $http.get('http://localhost:8080/users') ;
  }
}) ;