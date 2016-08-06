/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  revze
 * Created: Nov 26, 2015
 */

DROP TABLE IF EXISTS `siswa`;
CREATE TABLE `siswa` (
`id` varchar(255) NOT NULL,
`nama` varchar(255) NOT NULL,
`nis` varchar(255) NOT NULL,
`tempat_lahir` varchar(255) NOT NULL,
`tanggal_lahir` varchar(255) NOT NULL,
`alamat` varchar(255) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;