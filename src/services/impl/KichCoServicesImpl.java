/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import models.KichCo;
import repositorys.IKichCoRepository;
import repositorys.impl.KichCoRepositoryImpl;
import services.IKichCoServices;
import viewmodels.Objecttt;

/**
 *
 * @author LE DUONG
 */
public class KichCoServicesImpl implements IKichCoServices {

    private IKichCoRepository kichCoRepository = new KichCoRepositoryImpl();

    @Override
    public List<KichCo> getAll() {
        return kichCoRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        KichCo kichco = new KichCo(x.getId(), x.getTen());
        int xxx = kichCoRepository.insert(kichco);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
        KichCo kichCo = new KichCo(x.getId(), x.getTen());
        int xxx = kichCoRepository.update(kichCo, id);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (kichCoRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public KichCo getbyid(int id) {
        return kichCoRepository.getbyid(id);
    }

}
