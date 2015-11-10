app.factory('DataService',  ['$http', function ($http) {
		var baseApp = 'api';
	
	    var factory =
	    {
    		getAlumnos: function (callback,errorCallback) {
    			return $http.get(baseApp+'/alumnos').success(callback).error(errorCallback);
    		},
    		getAlumno: function (id, callback,errorCallback) {
    			return $http.get(baseApp+'/alumnos/'+id).success(callback).error(errorCallback);
    		},
    		addAlumno: function (params, callback,errorCallback) {
    			return $http.post(baseApp+'/alumnos', params).success(callback).error(errorCallback);
    		},
    		removeAlumno: function (id, callback,errorCallback) {
    			return $http.delete(baseApp+'/alumnos/'+id).success(callback).error(errorCallback);
    		}
	    		
	    };
	    return factory;
	    
}]);
