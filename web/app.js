//Define an angular module for our app
var sampleApp = angular.module('sampleApp', []);

//Define Routing for app
//Uri /AddNewOrder -> template AddOrder.html and Controller AddOrderController
//Uri /ShowOrders -> template ShowOrders.html and Controller AddOrderController
sampleApp.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.when('/ListDaily', {
            templateUrl: 'ListDaily.html',
            controller: 'ReportController'
        }).when('/ListDiscrepancy', {
            templateUrl: 'ListDiscrepancy.html',
            controller: 'ReportController'
        }).when('/GenerateReport', {
            templateUrl: 'GenerateReport.html',
            controller: 'GenerateReportController'
        }).when('/GenerateDiscrepancy', {
            templateUrl: 'GenerateDiscrepancy.html',
            controller: 'GenerateDiscrepancyController'
        }).when('/uploadBiometric', {
            templateUrl: 'uploadBiometric.jsp',
            controller: 'uploadBiometricController'
        }).otherwise({
            redirectTo: '/index.html'
        });

    }]);


sampleApp.controller("ReportController", function ($scope, $http) {
    $http.get("Discrepancies.json").then(function (response) {
        $scope.myWelcome = response.data;
    });

    $scope.checkAll = function () {
        if ($scope.selectedAll) {
            $scope.selectedAll = true;
        } else {
            $scope.selectedAll = false;
        }
        angular.forEach($scope.myWelcome, function (item) {
            item.Selected = $scope.selectedAll;
        });

    };

    $scope.showMe = false;
    $scope.clickFunc = function () {
        $scope.showMe = !$scope.showMe;
    }
});
sampleApp.controller("GenerateDiscrepancyController", function ($scope, $http) {
    $http.get("DescrepanciesOnly.json").then(function (response) {
        $scope.myWelcome = response.data;
    });

    $scope.checkAll = function () {
        if ($scope.selectedAll) {
            $scope.selectedAll = true;
        } else {
            $scope.selectedAll = false;
        }
        angular.forEach($scope.myWelcome, function (item) {
            item.Selected = $scope.selectedAll;
        });

    };

    $scope.showMe = false;
    $scope.clickFunc = function () {
        $scope.showMe = !$scope.showMe;
    }
});
sampleApp.controller("GenerateReportController", function ($scope, $http) {
    $http.get("WebDetails.json").then(function (response) {
        $scope.myWelcome = response.data;
    });

    $scope.checkAll = function () {
        if ($scope.selectedAll) {
            $scope.selectedAll = true;
        } else {
            $scope.selectedAll = false;
        }
        angular.forEach($scope.myWelcome, function (item) {
            item.Selected = $scope.selectedAll;
        });

    };

    $scope.showMe = false;
    $scope.clickFunc = function () {
        $scope.showMe = !$scope.showMe;
    }
});

sampleApp.controller("uploadBiometricController", function ($scope, $http) {
    /*

     $scope.getDataFromServer = function() {

     $http({
     method : 'POST',
     url : '../../BiometricServlet'
     }).success(function(data, status, headers, config) {
     $scope.message = "successful";
     }).error(function(data, status, headers, config) {
     $scope.message = "error";
     alert(data+headers+config);
     document.write(data);
     });

     };
     */
});


