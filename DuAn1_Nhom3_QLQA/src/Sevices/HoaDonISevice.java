/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sevices;

import Reponsitories.*;
import DomainModels.HoaDonDM;
import ViewModels.HoaDonVM;
import java.util.List;

/**
 *
 * @author TRONG NGHIA
 */
public interface HoaDonISevice {

    List<HoaDonVM> findAll();

    List<HoaDonVM> findByTT(Integer trangThai);

    boolean add(HoaDonDM a);

    boolean delete(String ma);

    boolean update(HoaDonDM a, String ma);
}
