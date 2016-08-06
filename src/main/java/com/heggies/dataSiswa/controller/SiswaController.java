/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heggies.dataSiswa.controller;

import com.heggies.dataSiswa.domain.Siswa;
import com.heggies.dataSiswa.service.SiswaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author heggies
 */

@RestController
@RequestMapping("/api/siswa")
public class SiswaController {
    @Autowired
    private SiswaDao siswaDao;
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Siswa findSiswaById(@PathVariable String id)
    {
        return siswaDao.findOne(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Siswa siswa)
    {
        siswaDao.save(siswa);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Page<Siswa> findAll(Pageable pageable)
    {
        return siswaDao.findAll(pageable);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable String id)
    {
        Siswa siswa = siswaDao.findOne(id);
        if(siswa != null) {
            siswaDao.delete(siswa);
        }
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void edit(@PathVariable String id, @RequestBody Siswa c)
    {
        Siswa siswa = siswaDao.findOne(id);
        if(siswa != null) {
            siswa.setId(id);
            siswaDao.save(siswa);
        }
    }
}
