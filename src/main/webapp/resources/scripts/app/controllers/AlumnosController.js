app.controller("AlumnosController", ['$scope', 'DataService',
                function ($scope, DataService) {
	
	var loadAlumnos = function(){
		var onSuccess = function(data){
			console.info(data);
			$scope.alumnos = data;
		};
		var onError = function(data, error){
			console.error(data);
			console.error(error);
		}
		DataService.getAlumnos(onSuccess, onError);
	};
	
	var loadMaterias = function(){
		var onSuccess = function(data){
			$scope.materias = data;
			console.info($scope.materias);
		};
		var onError = function(data, error){
			console.error(data);
			console.error(error);
		}
		DataService.getMaterias(onSuccess, onError);
	};
	
	var init = function (){
		loadAlumnos();
		loadMaterias();
	};
	
	init();
}]);