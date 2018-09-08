angular.
module('phonecatApp').
component('userList', {
    template:
    '<tr ng-repeat="user in $ctrl.users  ">' +
    '<td>{{user.firstName}}</td> ' +
    '<td>{{user.lastName}}</td>' +
    '<td>{{user.email}}</td>' +
    '<td>{{user.userCredentials.userName}}</td>' +
    '</tr>' +
    '</table>'+
    '<li ng-click="$ctrl.printname()">{{$ctrl.name}} </li> '+
    '<select ng-model="selectedName"> <option ng-repeat="x in $ctrl.users">{{x.firstName}}</option>\n' +
    '</select>  {{selectedName}}'+
    '<button ng-click="$ctrl.showOrHide()"> ShowOrHide</button>' +
    '<div ng-show="$ctrl.showMe"> <h1> Pasta</h1> <h1>Spagetti </h1> <h1> Maccarona </h1></div>'
    ,
    controller: function PhoneListController($scope ,UserService ) {
        var self = this ;
        this.name="ismail" ;
        this.showMe=true ;
        this.showOrHide = function()
        {    console.log("he");
            this.showMe=!this.showMe ;
        }
        UserService.getUsers().
        then(function(response) {
            self.users = response.data;
            console.log(self.users) ;
        } , function(response) {
            //Second function handles error
            self.message = "Something went wrong";
        });
        this.printname = function()
        {
            self.name="didi" ;
        } ;


    }
});