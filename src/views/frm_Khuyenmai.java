/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.KhuyenMai;
import repositorys.IKhuyenmaiRepository;
import repositorys.impl.KhuyenmaiReponsitory;

import services.IKhuyenmaiService;
import services.impl.KhuyenmaiService;


import viewmodels.KhuyenmaiViewmodel;

/**
 *
 * @author hungh
 */
public class frm_Khuyenmai extends javax.swing.JPanel {

    DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel1;
    private IKhuyenmaiService khuyenmaiService;
   

    /**
     * Creates new form khuyenmai
     */
    public frm_Khuyenmai() {
        initComponents();
        defaultTableModel = (DefaultTableModel) tb_khuyenmai.getModel();
        defaultTableModel1 = (DefaultTableModel) tb_sp.getModel();
        khuyenmaiService = new KhuyenmaiService();
     
        LoadData();
      
    }

    void LoadData() {
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for (KhuyenmaiViewmodel x : khuyenmaiService.GetALL()) {
            defaultTableModel.addRow(new Object[]{
                stt,
                x.getTenKM(),
                x.getNgayBatDau(),
                x.getNgayKetThuc(),
                String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM(),
                x.getTrangthai() == 0 ? "Còn hạn" : "Hết hạn"
            });
            stt++;
        }
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        txt_tenkm = new swing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rd_VND = new javax.swing.JRadioButton();
        rd_phantram = new javax.swing.JRadioButton();
        date_BD = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        date_KT = new com.toedter.calendar.JDateChooser();
        txt_giatrgiam = new swing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_them = new swing.MyButton();
        btn_sua = new swing.MyButton();
        btn_clear = new swing.MyButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_sp = new javax.swing.JTable();
        cb_selectAll = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_khuyenmai = new javax.swing.JTable();
        panelBorder2 = new swing.PanelBorder();
        src_timkiem = new swing.SearchText();
        lbl_timkiem = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateTK_KT = new com.toedter.calendar.JDateChooser();
        dateTK_BD = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setBackground(new java.awt.Color(242, 242, 242));
        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ngày bắt đầu");
        panelBorder1.add(jLabel2);
        jLabel2.setBounds(390, 0, 260, 20);
        panelBorder1.add(txt_tenkm);
        txt_tenkm.setBounds(60, 20, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên khuyễn mãi");
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(60, 0, 260, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hình thức giảm giá");
        panelBorder1.add(jLabel4);
        jLabel4.setBounds(390, 130, 130, 30);

        buttonGroup1.add(rd_VND);
        rd_VND.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_VND.setText("VND");
        panelBorder1.add(rd_VND);
        rd_VND.setBounds(530, 130, 50, 30);

        buttonGroup1.add(rd_phantram);
        rd_phantram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_phantram.setText("%");
        panelBorder1.add(rd_phantram);
        rd_phantram.setBounds(600, 130, 50, 30);

        date_BD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        date_BD.setDateFormatString("dd/MM/yyyy");
        panelBorder1.add(date_BD);
        date_BD.setBounds(390, 20, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ngày kết thúc");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(60, 60, 260, 20);

        date_KT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        date_KT.setDateFormatString("dd/MM/yyyy");
        panelBorder1.add(date_KT);
        date_KT.setBounds(60, 80, 260, 40);
        panelBorder1.add(txt_giatrgiam);
        txt_giatrgiam.setBounds(390, 80, 260, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Giá trị giảm");
        panelBorder1.add(jLabel8);
        jLabel8.setBounds(390, 60, 260, 20);

        btn_them.setBackground(new java.awt.Color(125, 224, 237));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_them);
        btn_them.setBounds(750, 30, 130, 40);

        btn_sua.setBackground(new java.awt.Color(125, 224, 237));
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        btn_sua.setText("Cập nhật");
        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_sua);
        btn_sua.setBounds(750, 100, 130, 40);

        btn_clear.setBackground(new java.awt.Color(125, 224, 237));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btn_clear.setText("Làm mới");
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_clear);
        btn_clear.setBounds(750, 170, 130, 40);

        tb_sp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Mã sản phẩm", "Tên sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_sp);
        tb_sp.getAccessibleContext().setAccessibleParent(panelBorder1);

        panelBorder1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 160, 580, 130);

        cb_selectAll.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cb_selectAll.setForeground(new java.awt.Color(102, 102, 255));
        cb_selectAll.setText("Select All");
        cb_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_selectAllActionPerformed(evt);
            }
        });
        panelBorder1.add(cb_selectAll);
        cb_selectAll.setBounds(20, 130, 130, 24);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 0, 990, 300);

        tb_khuyenmai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên khuyến mãi", "Ngày bắt đầu", "Ngày kết thúc", "Giá trị giảm", "Trạng thái"
            }
        ));
        tb_khuyenmai.setRowHeight(25);
        tb_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_khuyenmaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_khuyenmai);

        panelGradiente1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 370, 990, 260);

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        src_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                src_timkiemCaretUpdate(evt);
            }
        });
        panelBorder2.add(src_timkiem);
        src_timkiem.setBounds(10, 0, 240, 40);

        lbl_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        lbl_timkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_timkiemMouseClicked(evt);
            }
        });
        panelBorder2.add(lbl_timkiem);
        lbl_timkiem.setBounds(250, 0, 40, 40);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(660, 310, 290, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ngày kết thúc");
        panelGradiente1.add(jLabel7);
        jLabel7.setBounds(370, 300, 260, 20);

        dateTK_KT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        dateTK_KT.setDateFormatString("dd/MM/yyyy");
        panelGradiente1.add(dateTK_KT);
        dateTK_KT.setBounds(370, 320, 260, 40);

        dateTK_BD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        dateTK_BD.setDateFormatString("dd/MM/yyyy");
        panelGradiente1.add(dateTK_BD);
        dateTK_BD.setBounds(50, 320, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ngày bắt đầu");
        panelGradiente1.add(jLabel5);
        jLabel5.setBounds(50, 300, 260, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        Pattern p = Pattern.compile("^[0-9]+$");
        try {
            if (txt_tenkm.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên khuyến mãi");
                return;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            if (date_BD.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày bắt đầu");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (date_KT.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày kết thúc");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (!rd_VND.isSelected() && !rd_phantram.isSelected()) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn hình thức giảm giá");
                return;
            }
        } catch (Exception e) {
        }

        try {
            if (txt_giatrgiam.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá trị giảm");
                return;
            }
        } catch (Exception e) {
        }

        try {
            Integer.valueOf(txt_giatrgiam.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị giảm phải là số!");
            return;
        }

        try {
            if (date_KT.getDate().before(date_BD.getDate())) {
                JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu");
                return;
            }
        } catch (Exception e) {
        }
        if (p.matcher(txt_tenkm.getText()).find() == true) {
            JOptionPane.showMessageDialog(this, "Tên không được nhập số");
            return;
        }
        if (txt_tenkm.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "Tên không được quá 50 kí tự");
            return;
        }
        if (khuyenmaiService.checktrung(txt_tenkm.getText()) != null) {
            JOptionPane.showMessageDialog(this, "Tên khuyến mãi đã tồn tại");
            return;
        }
        
             if (rd_phantram.isSelected()) {
            if (Integer.parseInt(txt_giatrgiam.getText().trim()) >= 100) {
                JOptionPane.showMessageDialog(this, "Giá trị khuyến mãi phải nhỏ hơn 100% !!!");
                return;
            }
        }
             
                 if (Integer.parseInt(txt_giatrgiam.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(this, "Giá trị khuyến mãi không được phép âm");
                return;
            }
                 if (Integer.parseInt(txt_giatrgiam.getText().trim()) == 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải nhập giá trị khuyến mãi lớn hơn 0");
                return;
            }
        
        IKhuyenmaiRepository repository = new KhuyenmaiReponsitory();
        List<KhuyenMai> lst = repository.GetAll();
        long time = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(time);

        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Add", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            KhuyenmaiViewmodel km = new KhuyenmaiViewmodel();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date_BD.getDate());
            String date2 = sdf.format(date_KT.getDate());
            km.setNgayBatDau(date1);
            km.setNgayKetThuc(date2);
            km.setTenKM(txt_tenkm.getText());
            if (rd_VND.isSelected()) {
                km.setHinhThucKM("VND");
            } else if (rd_phantram.isSelected()) {
                km.setHinhThucKM("%");
            }
            km.setGiaTriGiam(Double.parseDouble(txt_giatrgiam.getText()));
            khuyenmaiService.Add(km);
            LoadData();
            
            for (int i = 0; i < tb_sp.getRowCount(); i++) {
                boolean ischeckbox = (boolean) tb_sp.getValueAt(i, 0);
               
            }
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int r = tb_khuyenmai.getSelectedRow();
        IKhuyenmaiRepository repository = new KhuyenmaiReponsitory();
        List<KhuyenMai> lst = repository.GetAll();

        if (r < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng nào");
            return;
        }
              if (rd_phantram.isSelected()) {
            if (Integer.parseInt(txt_giatrgiam.getText().trim()) >= 100) {
                JOptionPane.showMessageDialog(this, "Giá trị khuyến mãi phải nhỏ hơn 100% !!!");
                return;
            }
        }
                          if (Integer.parseInt(txt_giatrgiam.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(this, "Giá trị khuyến mãi không được phép âm");
                return;
            }
                 if (Integer.parseInt(txt_giatrgiam.getText().trim()) == 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải nhập giá trị khuyến mãi lớn hơn 0");
                return;
            }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Update", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            KhuyenmaiViewmodel km = new KhuyenmaiViewmodel();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date_BD.getDate());
            String date2 = sdf.format(date_KT.getDate());
            km.setNgayBatDau(date1);
            km.setNgayKetThuc(date2);
            km.setTenKM(txt_tenkm.getText());
            if (rd_VND.isSelected()) {
                km.setHinhThucKM("VND");
            } else if (rd_phantram.isSelected()) {
                km.setHinhThucKM("%");
            }
            km.setGiaTriGiam(Double.parseDouble(txt_giatrgiam.getText()));
            if (date_KT.getDate().before(date_BD.getDate())) {
                JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu");
                return;
            }
            
            
           
            khuyenmaiService.Update(km, lst.get(r).getID());
          
            LoadData();
            JOptionPane.showMessageDialog(this, "Sửa thành công ");

        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_tenkm.setText("");
        txt_giatrgiam.setText("");
        date_BD.setCalendar(null);
        date_KT.setCalendar(null);
        dateTK_BD.setCalendar(null);
        dateTK_KT.setCalendar(null);
        buttonGroup1.clearSelection();
        src_timkiem.setText("");
 
        LoadData();


    }//GEN-LAST:event_btn_clearActionPerformed

    private void tb_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_khuyenmaiMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int r = tb_khuyenmai.getSelectedRow();
            txt_tenkm.setText((String) tb_khuyenmai.getValueAt(r, 1));
//            txt_giatrgiam.setText((String) tb_khuyenmai.getValueAt(r, 4));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse((String) tb_khuyenmai.getValueAt(r, 2));
            Date date2 = sdf.parse((String) tb_khuyenmai.getValueAt(r, 3));
            date_BD.setDate(date1);
            date_KT.setDate(date2);
            String hinhthuc = tb_khuyenmai.getValueAt(r, 4).toString();
            String giatri = tb_khuyenmai.getValueAt(r, 4).toString();
            if (hinhthuc.contains("%")) {
                rd_phantram.setSelected(true);
            } else if (hinhthuc.contains("VND")) {
                rd_VND.setSelected(true);
            }
            if (giatri.contains("%")) {
                int index = giatri.indexOf("%");
                txt_giatrgiam.setText(giatri.substring(0, index).trim());
            } else if (giatri.contains("VND")) {
                int index = giatri.indexOf("VND");
                txt_giatrgiam.setText(giatri.substring(0, index).trim());
            }
        } catch (ParseException ex) {
//            Logger.getLogger(FrmKhuyenmai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_khuyenmaiMouseClicked

    private void lbl_timkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_timkiemMouseClicked
        // TODO add your handling code here:
        if (dateTK_BD.getDate() == null && dateTK_KT.getDate() == null && src_timkiem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày bắt đầu hoặc ngày kết thúc hoặc tên khuyến mãi để tìm kiếm");
            return;
        }
      
       
    }//GEN-LAST:event_lbl_timkiemMouseClicked

    private void src_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_src_timkiemCaretUpdate
        // TODO add your handling code here:
     
    }//GEN-LAST:event_src_timkiemCaretUpdate

    private void cb_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_selectAllActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tb_sp.getRowCount(); i++) {
            if (cb_selectAll.isSelected() == true) {
                tb_sp.setValueAt(true, i, 0);
            } else {
                tb_sp.setValueAt(false, i, 0);
            }
        }
    }//GEN-LAST:event_cb_selectAllActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // ...

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1010, 640);
                frame.getContentPane().add(new frm_Khuyenmai());
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btn_clear;
    private swing.MyButton btn_sua;
    private swing.MyButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_selectAll;
    private com.toedter.calendar.JDateChooser dateTK_BD;
    private com.toedter.calendar.JDateChooser dateTK_KT;
    private com.toedter.calendar.JDateChooser date_BD;
    private com.toedter.calendar.JDateChooser date_KT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_timkiem;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rd_VND;
    private javax.swing.JRadioButton rd_phantram;
    private swing.SearchText src_timkiem;
    private javax.swing.JTable tb_khuyenmai;
    private javax.swing.JTable tb_sp;
    private swing.MyTextField txt_giatrgiam;
    private swing.MyTextField txt_tenkm;
    // End of variables declaration//GEN-END:variables
}