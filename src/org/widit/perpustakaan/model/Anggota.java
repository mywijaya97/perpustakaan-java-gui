/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.widit.perpustakaan.model;

/**
 *
 * @author PCL-B00-00
 */
public class Anggota extends Pengguna {
    
    public Anggota(String nama, long id, String email) {
        super(nama, id, email);
    }
    
    public boolean pinjamBuku(){
        return true;
    }
    
    public boolean kembalikanBuku(){
        return true;
    }
    
    public boolean lihatBukuDipinjam(){
        return true;
    }
}
