/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author KenhLapTrinh
 */
@Entity(name = "taikhoan")
public class TaiKhoan implements Serializable {
    @Id
    @GeneratedValue
    private long idTaiKhoan;
    private String hoTen;
    private String tenTaiKhoan;
    private String matKhau;

    public TaiKhoan() {
    }

    public long getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(long idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "idTaiKhoan=" + idTaiKhoan + ", hoTen=" + hoTen + ", tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + '}';
    }
    
}