/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heggies.dataSiswa.service;

import com.heggies.dataSiswa.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author heggies
 */
public interface UserDao extends PagingAndSortingRepository<User, String>{
    public User findByUsername(String username);
}
