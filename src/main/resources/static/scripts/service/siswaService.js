/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


angular.module('aplikasiDataSiswa')
        .factory('siswaService', function ($http) {
            return {
                getSiswa: function() {
                    return $http.get("/siswa");
                },
                getListSiswa: function() {
                    return $http.get("/listSiswa");
                },
                save: function(data) {
                    return $http.post("/api/siswa",data);
                },
                getSiswaFromDb: function() {
                    return $http.get("/api/siswa");
                },
                delete: function(id) {
                    return $http.delete("/api/siswa/"+id);
                },
                update: function(id, data) {
                    return $http.put("/api/siswa/"+id,data);
                }
            };
});