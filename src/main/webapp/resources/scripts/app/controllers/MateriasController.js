app.controller("MateriasController", ['$scope', 'DataService',
                function ($scope, DataService) {
	
	$scope.loadMateria = function(id){
		var onSuccess = function(data){
			$scope.materia = data;
		};
		var onError = function(data, error){
			console.error(data);
			console.error(error);
		}
		DataService.getMateria(id, onSuccess, onError);
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
	
	$scope.deleteMateria = function(id){
		var onSuccess = function(data){
			alert("Materia deleted");
			loadMaterias();
		};
		var onError = function(data, error){
			console.error(data);
			console.error(error);
		}
		DataService.removeMateria(id, onSuccess, onError);
	};
	
	$scope.saveMateria = function(){
		var onSuccess = function(data){
			console.info("materia added");
			$scope.materia = data;
			loadMaterias();
		};
		var onError = function(data, error){
			console.error(data);
			console.error(error);
		}
		DataService.addMateria($scope.materia, onSuccess, onError);
	};
	$scope.clear = function(){
		$scope.materia.id = null;
		$scope.materia.subjectName = null;
		$scope.materia.semester = null;
	}
	var init = function (){
		loadMaterias();
	};
	
	init();
}]);