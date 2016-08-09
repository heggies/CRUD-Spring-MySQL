/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  revze
 * Created: Nov 27, 2015
 */
INSERT INTO siswa (id,nama,nis,tempat_lahir,tanggal_lahir,alamat) VALUES
('1','Heggies','1001','Jakarta','01/07/1999','Jakarta'),
('2','Iqbal','1002','Jakarta','02/07/1999','Jakarta');

INSERT INTO `s_security_role` (`id`,`nama`,`description`) VALUES
('admin','admin','Application Admin'),
('user','user','Application User');

INSERT INTO `s_security_permission` (`id`,`permission_label`,`permission_value`) VALUES
('siswa_update','Edit Siswa','ROLE_SISWA_UPDATE'),
('siswa_view','View Siswa','ROLE_SISWA_VIEW'),
('siswa_create','Create Siswa','ROLE_SISWA_CREATE'),
('siswa_delete','Delete Siswa','ROLE_SISWA_DELETE'),
('user_view','View User','ROLE_USER_VIEW');

INSERT INTO `s_security_role_permission` (`id_role`,`id_permission`) VALUES
('admin','siswa_update'),
('admin','siswa_view'),
('admin','siswa_create'),
('admin','siswa_delete'),
('user','siswa_view'),
('user','user_view'),
('admin','user_view');

INSERT INTO `s_security_user` (`id`, `username`, `password`, `active`, `id_role`) VALUES
('1', 'admin', 'admin',true,'admin'),
('2', 'user', 'user', true, 'user');