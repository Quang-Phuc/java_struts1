/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.TaiKhoan;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author KenhLapTrinh
 */
public class TestTaiKhoan {
    public static void main(String[] args) {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        TaiKhoan taiKhoan=new TaiKhoan();
        taiKhoan.setHoTen("Nguyễn Văn A");
        taiKhoan.setTenTaiKhoan("KenhLapTrinh");
        taiKhoan.setMatKhau("12345");
        session.save(taiKhoan);
        transaction.commit();
    }
}