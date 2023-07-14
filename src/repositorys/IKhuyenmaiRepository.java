
package repositorys;

import java.util.List;
import models.KhuyenMai;

public interface IKhuyenmaiRepository {

    public List<KhuyenMai> GetAll();

    public boolean Add(KhuyenMai km);

    public boolean Update(KhuyenMai km, String id);

    public boolean Delete(String id);

    public String checktrung(String ten);

   

    public KhuyenMai getbyid(int id);
}
