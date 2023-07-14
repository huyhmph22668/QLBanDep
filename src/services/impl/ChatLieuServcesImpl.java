/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import models.ChatLieu;
import org.bridj.cpp.std.list;
import repositorys.IChatLieuRepository;
import repositorys.impl.ChatLieuRepositoryImpl;
import services.IChatLieuServces;
import viewmodels.Objecttt;

/**
 *
 * @author LE DUONG
 */
public class ChatLieuServcesImpl implements IChatLieuServces {

    private IChatLieuRepository chatLieuRepository = new ChatLieuRepositoryImpl();

    @Override
    public List<ChatLieu> getAll() {
        return chatLieuRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        ChatLieu chatlieu = new ChatLieu(x.getId(), x.getTen());
        int them = chatLieuRepository.insert(chatlieu);
        if (them == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
        ChatLieu chatlieu = new ChatLieu(x.getId(), x.getTen());
        int them = chatLieuRepository.update(chatlieu, id);
        if (them == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (chatLieuRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public ChatLieu getbyid(int id) {
        return chatLieuRepository.getByid(id);
    }

}
