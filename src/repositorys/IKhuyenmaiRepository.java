/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorys;

import java.util.List;
import models.KhuyenMai;

/**
 *
 * @author ADMIN
 */
public interface IKhuyenmaiRepository {

    public List<KhuyenMai> GetAll();

    public boolean Add(KhuyenMai km);

    public boolean Update(KhuyenMai km, String id);

    public boolean Delete(String id);

    public String checktrung(String ten);

   

    public KhuyenMai getbyid(int id);
}