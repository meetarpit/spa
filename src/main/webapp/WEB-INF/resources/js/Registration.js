/**
 * 
 */
var app=angular.module("registration",[]);
app.controller("ctrl",function($scope,$http){
	$scope.registrationForm={id:-1,name:"",password:"",gender:"",address:""};
	$scope.userList=[];
	
	 getAll();
	 
	$scope.register=function(){
		
		var method="";
		var url="";
		
		if($scope.registrationForm.id==-1){
			method="POST";
			url="save";
		}
		else{
		
			method="PUT";
			url="edit/"+$scope.registrationForm.id;
		}
		
		$http({
			method:method,
			url:url,
			data:angular.toJson($scope.registrationForm),
			header:{
				'Content-Type':'application/json'
			}
		}).then(_success,error);
	
	}
	
	function _success(){
		getAll();
		clearForm();
		console.log("right");
	}
	function error(){
		console.log("Fails");
	}
	
	function getAll(){
		$http({
			method:"GET",
			url:"list"
		}).then(function success(response){
			$scope.userList=response.data;
		},error);
	}
	
	function clearForm(){
		$scope.registrationForm.id="";
		$scope.registrationForm.name="";
		$scope.registrationForm.gender="";
		$scope.registrationForm.password="";
		$scope.registrationForm.address="";
	}
	
	$scope.editEmployee=function(emp){
		$scope.registrationForm.id=emp.id;
		$scope.registrationForm.name=emp.name;
		$scope.registrationForm.gender=emp.gender;
		$scope.registrationForm.password=emp.password;
		$scope.registrationForm.address=emp.address;
	}
	$scope.deleteEmp=function(emp,i){
		alert("ARE YOU SURE YOU WANT TO DELETE?")
		$http({
			method:"DELETE",
			url:"delete/"+emp.id
		}).then(_success,error);
		$scope.userList.splice(1,i);	
	}
	
});