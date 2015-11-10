app.controller("AlumnosController", ['$scope', 'DataService',
                function ($scope, DataService) {
	
	var loadAlumnos = function(){
		var onSuccess = function(data){
			console.info(data);
		};
		var onError = function(data, error){
			console.error(data);
			console.error(error);
		}
		DataService.getAlumnos(onSuccess, onError);
	};
	
	var init = function (){
		loadAlumnos();
	};
	
	init();
}]);