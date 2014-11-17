/**
 * Created by ceasaro on 17-11-14.
 */
"use strict";

(function () {
    var SHOW_REST_API_URL = 'http://127.0.0.1:8080/shows/v1.0/';
    var showsApp = angular.module('showsApp', []);

    showsApp.controller('ShowsCtrl', function ($scope, $http) {
        $scope.shows = {};
        $scope.error= "";
        $http.get(SHOW_REST_API_URL).
            success(function(data) {
                $scope.shows = data;
            }).error(function(data) {
                $scope.error = "Unable to retrieve shows data, excuses for the inconvenience.";
            });
    });
})();
