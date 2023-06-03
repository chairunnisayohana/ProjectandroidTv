package com.example.bondanss.model;

import java.io.Serializable;

public class ItemModel implements Serializable {

    // string course_name for storing course_name
    // and imgid for storing image id.
    private String nama;
    private String harga;
    private int imgid;

    public ItemModel(String course_name, String harga, int imgid) {
        this.nama = course_name;
        this.harga = harga;
        this.imgid = imgid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
