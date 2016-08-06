/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heggies.dataSiswa.service;

import com.heggies.dataSiswa.domain.Siswa;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author heggies
 */
public interface SiswaDao extends PagingAndSortingRepository<Siswa, String> {
    
}
