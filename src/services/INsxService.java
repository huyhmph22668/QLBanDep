/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;
import java.util.List;
import models.NSX;
import viewmodels.Objecttt;
/**
 *
 * @author Admin 88
 */
public interface INsxService {
     List<NSX> getAll();
     
    String Add(Objecttt x);

    String Update(Objecttt x, int id);

    String Delete(int id);

    NSX getbyid(int id);
}
