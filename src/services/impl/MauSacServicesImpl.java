/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import models.MauSac;
import repositorys.IMauSacRepository;
import repositorys.impl.MauSacRepositoryImpl;
import services.IMauSacServices;
import viewmodels.Objecttt;

/**
 *
 * @author LE DUONG
 */
public class MauSacServicesImpl implements IMauSacServices {

    private IMauSacRepository mauSacRepository = new MauSacRepositoryImpl();

    @Override
    public List<MauSac> getAll() {
        return mauSacRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        MauSac mauSac = new MauSac(x.getId(), x.getTen());
        int xxx = mauSacRepository.insert(mauSac);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
        MauSac mauSac = new MauSac(x.getId(), x.getTen());
        int xxx = mauSacRepository.update(mauSac, id);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (mauSacRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public MauSac getbyid(int id) {
        return mauSacRepository.getbyid(id);
    }

}
