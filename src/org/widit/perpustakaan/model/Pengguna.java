/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.widit.perpustakaan.model;

/**
 *
 * @author maulana
 */
public class Pengguna {
    private String nama;
    private long id;
    private String email;

    public Pengguna(String nama, long id, String email) {
        this.nama = nama;
        this.id = id;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
