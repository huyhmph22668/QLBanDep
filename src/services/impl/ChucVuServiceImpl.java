/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import java.util.List;
import models.ChucVu;
import repositorys.IChucVuRepository;
import repositorys.impl.ChucVuRepositoryImpl;
import services.IChucVuService;

/**
 *
 * @author Admin 88
 */
public class ChucVuServiceImpl implements IChucVuService{
    IChucVuRepository icvrepo=new ChucVuRepositoryImpl();
    List<ChucVu> listCV=new ArrayList<>();

    @Override
    public List<ChucVu> getAllChucVu() {
         listCV = new ArrayList<>();
        for (ChucVu cv : icvrepo.getAllChucVu()) {
            listCV.add(new ChucVu(cv.getId(), cv.getTen()));
        }
        return listCV;
    }
}
