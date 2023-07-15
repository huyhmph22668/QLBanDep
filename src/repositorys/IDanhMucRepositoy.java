/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.DanhMuc;

/**
 *
 * @author Admin 88
 */
public interface IDanhMucRepositoy {
    public List<DanhMuc> getAll();

    public int insert(DanhMuc x);

    public int update(DanhMuc dmsp, int id);

    public int delete(int id);

    public DanhMuc getdanhmucbyid(int id);
}
