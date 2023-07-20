/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ChatLieu;
import models.DanhMuc;
import models.KichCo;
import models.MauSac;
import models.NSX;
import models.ThuongHieu;
import services.IChatLieuServces;
import services.IDanhMucService;
import services.IKichCoServices;
import services.IMauSacServices;
import services.INsxService;
import services.IThuongHieuService;
import services.impl.ChatLieuServcesImpl;
import services.impl.DanhMucServiceImpl;
import services.impl.KichCoServicesImpl;
import services.impl.MauSacServicesImpl;
import services.impl.NSXServiceImpl;
import services.impl.ThuongHieuServiceImpl;
import viewmodels.Objecttt;

/**
 *
 * @author hungh
 */
public class frm_themthuoctinh extends javax.swing.JDialog {

    private INsxService iNSXServices;
    private IMauSacServices iMauSacServices;
    private IDanhMucService iDanhMucSPServices;
<<<<<<< HEAD
    private IChatLieuServces iChatLieuServices;
    private IKichCoServices IkichCoServices;
=======
    private IKichCoServices iKichCoServices;
    private IChatLieuServces iChatLieuServices;
>>>>>>> b09cced28f0d0fadfac0887d1033af42a3a0a05b
    private IThuongHieuService iThuongHieuServices;

    public frm_themthuoctinh(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        iChatLieuServices = new ChatLieuServcesImpl();
        iDanhMucSPServices = new DanhMucServiceImpl();
<<<<<<< HEAD
        IkichCoServices = new KichCoServicesImpl();
=======
        iKichCoServices = new KichCoServicesImpl();
>>>>>>> b09cced28f0d0fadfac0887d1033af42a3a0a05b
        iMauSacServices = new MauSacServicesImpl();
        iNSXServices = new NSXServiceImpl();
        iThuongHieuServices = new ThuongHieuServiceImpl();
        initComponents();
        setLocationRelativeTo(null);
        inittable();
        rdoChatlieu.setSelected(true);
        loadtablechatlieu();

    }
    int xx;
    int yy;
<<<<<<< HEAD

    private frm_themthuoctinh() {
       
         iChatLieuServices = new ChatLieuServcesImpl();
        iDanhMucSPServices = new DanhMucServiceImpl();
        IkichCoServices = new KichCoServicesImpl();
        iMauSacServices = new MauSacServicesImpl();
        iNSXServices = new NSXServiceImpl();
        iThuongHieuServices = new ThuongHieuServiceImpl();
        initComponents();
        setLocationRelativeTo(null);
        inittable();
        rdoChatlieu.setSelected(true);
        loadtablechatlieu();
    }

    private void inittable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnCount(0);
        model.addColumn("ID");
        model.addColumn("Tên");
    }

    private void loadtablechatlieu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (ChatLieu x : iChatLieuServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablensx() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (NSX x : iNSXServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablemausac() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (MauSac x : iMauSacServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablesize() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (KichCo x : IkichCoServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtabledanhmuc() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (DanhMuc x : iDanhMucSPServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablethuonghieu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (ThuongHieu x : iThuongHieuServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private Objecttt getdatdtb(int row) {
        if (row == -1) {
            return null;
        }
        int id = (int) jTable1.getValueAt(row, 0);
        String ten = (String) jTable1.getValueAt(row, 1);
        return new Objecttt(id, ten);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
=======

    private void inittable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnCount(0);
        model.addColumn("ID");
        model.addColumn("Tên");
    }

    private void loadtablechatlieu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (ChatLieu x : iChatLieuServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablensx() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (NSX x : iNSXServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablemausac() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (MauSac x : iMauSacServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablesize() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (KichCo x : iKichCoServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtabledanhmuc() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (DanhMuc x : iDanhMucSPServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablethuonghieu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (ThuongHieu x : iThuongHieuServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private Objecttt getdatdtb(int row) {
        if (row == -1) {
            return null;
        }
        int id = (int) jTable1.getValueAt(row, 0);
        String ten = (String) jTable1.getValueAt(row, 1);
        return new Objecttt(id, ten);
    }

>>>>>>> b09cced28f0d0fadfac0887d1033af42a3a0a05b
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        panelBorder3 = new swing.PanelBorder();
        rdoThuonghieu = new javax.swing.JRadioButton();
        rdoChatlieu = new javax.swing.JRadioButton();
        rdoNSX = new javax.swing.JRadioButton();
        rdoMausac = new javax.swing.JRadioButton();
        rdoSize = new javax.swing.JRadioButton();
        rdodanhmuc = new javax.swing.JRadioButton();
        panelBorder4 = new swing.PanelBorder();
        jTextField1 = new javax.swing.JTextField();
        btn_them = new swing.MyButton();
        btn_LamMoi = new swing.MyButton();
        Btn_capNhat = new swing.MyButton();
        panelBorder2 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBorder5 = new swing.PanelBorder();
        searchText1 = new swing.SearchText();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm thuộc tính phụ");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(" Nhập Tên");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(60, 60, 250, 30);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        rdoThuonghieu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoThuonghieu);
        rdoThuonghieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoThuonghieu.setText("Thương hiệu");
        rdoThuonghieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoThuonghieuActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoThuonghieu);
        rdoThuonghieu.setBounds(270, 100, 110, 40);

        rdoChatlieu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoChatlieu);
        rdoChatlieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoChatlieu.setText("Chất liệu");
        rdoChatlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChatlieuActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoChatlieu);
        rdoChatlieu.setBounds(30, 30, 110, 40);

        rdoNSX.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNSX);
        rdoNSX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNSX.setText("Nhà sản xuất");
        rdoNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNSXActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoNSX);
        rdoNSX.setBounds(150, 30, 110, 40);

        rdoMausac.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoMausac);
        rdoMausac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoMausac.setText("Màu sắc");
        rdoMausac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMausacActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoMausac);
        rdoMausac.setBounds(270, 30, 110, 40);

        rdoSize.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoSize);
        rdoSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoSize.setText("Size");
        rdoSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSizeActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoSize);
        rdoSize.setBounds(30, 100, 110, 40);

        rdodanhmuc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdodanhmuc);
        rdodanhmuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdodanhmuc.setText("Danh mục");
        rdodanhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdodanhmucActionPerformed(evt);
            }
        });
        panelBorder3.add(rdodanhmuc);
        rdodanhmuc.setBounds(150, 100, 110, 40);

        panelBorder1.add(panelBorder3);
        panelBorder3.setBounds(370, 20, 450, 170);

        panelBorder4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setBorder(null);
        panelBorder4.add(jTextField1);
        jTextField1.setBounds(10, 0, 230, 50);

        panelBorder1.add(panelBorder4);
        panelBorder4.setBounds(60, 90, 250, 50);

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
        btn_them.setBounds(1010, 50, 120, 40);

        btn_LamMoi.setBackground(new java.awt.Color(125, 224, 237));
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_LamMoi);
        btn_LamMoi.setBounds(860, 50, 120, 40);

        Btn_capNhat.setBackground(new java.awt.Color(125, 224, 237));
        Btn_capNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        Btn_capNhat.setText("Cập nhật");
        Btn_capNhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_capNhatActionPerformed(evt);
            }
        });
        panelBorder1.add(Btn_capNhat);
        Btn_capNhat.setBounds(860, 130, 120, 40);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 50, 1160, 230);

        panelBorder2.setBackground(new java.awt.Color(242, 242, 242));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 1160, 250);

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));

        searchText1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelBorder5.add(searchText1);
        searchText1.setBounds(10, 0, 240, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder5.add(jLabel2);
        jLabel2.setBounds(260, 0, 40, 50);

        panelBorder2.add(panelBorder5);
        panelBorder5.setBounds(840, 10, 300, 50);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 300, 1160, 320);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panelGradiente1.add(jLabel3);
        jLabel3.setBounds(1140, 0, 40, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelGradiente1.add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        clearfrom();
        if (rdoChatlieu.isSelected() == true) {
            loadtablechatlieu();
        } else if (rdoNSX.isSelected() == true) {
            loadtablensx();
        } else if (rdoMausac.isSelected() == true) {
            loadtablemausac();
        } else if (rdoSize.isSelected() == true) {
            loadtablesize();
        } else if (rdodanhmuc.isSelected() == true) {
            loadtabledanhmuc();
        } else if (rdoThuonghieu.isSelected() == true) {
            loadtablethuonghieu();
        }
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (getdatafrom() == null) {

            return;
        }
        if (rdoChatlieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iChatLieuServices.Add(getdatafrom()));
            loadtablechatlieu();
        } else if (rdoNSX.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iNSXServices.Add(getdatafrom()));
            loadtablensx();
        } else if (rdoMausac.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iMauSacServices.Add(getdatafrom()));
            loadtablemausac();
        } else if (rdoSize.isSelected() == true) {
<<<<<<< HEAD
            JOptionPane.showMessageDialog(this, IkichCoServices.Add(getdatafrom()));
=======
            JOptionPane.showMessageDialog(this, iKichCoServices.Add(getdatafrom()));
>>>>>>> b09cced28f0d0fadfac0887d1033af42a3a0a05b
            loadtablesize();
        } else if (rdodanhmuc.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iDanhMucSPServices.Add(getdatafrom()));
            loadtabledanhmuc();
        } else if (rdoThuonghieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iThuongHieuServices.Add(getdatafrom()));
            loadtablethuonghieu();
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void Btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_capNhatActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn 1 dòng để sửa");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa không") != JOptionPane.YES_OPTION) {
            return;
        }
        int id = (int) jTable1.getValueAt(row, 0);
        if (rdoChatlieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iChatLieuServices.Update(getdatafrom(), id));
            loadtablechatlieu();
        } else if (rdoNSX.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iNSXServices.Update(getdatafrom(), id));
            loadtablensx();
        } else if (rdoMausac.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iMauSacServices.Update(getdatafrom(), id));
            loadtablemausac();
        } else if (rdoSize.isSelected() == true) {
<<<<<<< HEAD
            JOptionPane.showMessageDialog(this, IkichCoServices.Update(getdatafrom(), id));
=======
            JOptionPane.showMessageDialog(this, iKichCoServices.Update(getdatafrom(), id));
>>>>>>> b09cced28f0d0fadfac0887d1033af42a3a0a05b
            loadtablesize();
        } else if (rdodanhmuc.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iDanhMucSPServices.Update(getdatafrom(), id));
            loadtabledanhmuc();
        } else if (rdoThuonghieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iThuongHieuServices.Update(getdatafrom(), id));
            loadtablethuonghieu();
        }
    }//GEN-LAST:event_Btn_capNhatActionPerformed

    private void rdoChatlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChatlieuActionPerformed
        if (rdoChatlieu.isSelected() == true) {
            loadtablechatlieu();
        }
    }//GEN-LAST:event_rdoChatlieuActionPerformed

    private void rdoNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNSXActionPerformed
        if (rdoNSX.isSelected() == true) {
            loadtablensx();
        }
    }//GEN-LAST:event_rdoNSXActionPerformed

    private void rdoMausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMausacActionPerformed
        if (rdoMausac.isSelected() == true) {
            loadtablemausac();
        }
    }//GEN-LAST:event_rdoMausacActionPerformed

    private void rdoSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSizeActionPerformed
        if (rdoSize.isSelected() == true) {
            loadtablesize();
        }
    }//GEN-LAST:event_rdoSizeActionPerformed

    private void rdodanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdodanhmucActionPerformed
        if (rdodanhmuc.isSelected() == true) {
            loadtabledanhmuc();
        }
    }//GEN-LAST:event_rdodanhmucActionPerformed

    private void rdoThuonghieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoThuonghieuActionPerformed
        if (rdoThuonghieu.isSelected() == true) {
            loadtablethuonghieu();
        }
    }//GEN-LAST:event_rdoThuonghieuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            return;
        }
        Objecttt x = getdatdtb(row);
        jTextField1.setText(x.getTen());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new frm_Sanpham().initcbo();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel1MouseDragged


      public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_themthuoctinh().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton Btn_capNhat;
    private swing.MyButton btn_LamMoi;
    private swing.MyButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private swing.PanelBorder panelBorder4;
    private swing.PanelBorder panelBorder5;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rdoChatlieu;
    private javax.swing.JRadioButton rdoMausac;
    private javax.swing.JRadioButton rdoNSX;
    private javax.swing.JRadioButton rdoSize;
    private javax.swing.JRadioButton rdoThuonghieu;
    private javax.swing.JRadioButton rdodanhmuc;
    private swing.SearchText searchText1;
    // End of variables declaration//GEN-END:variables
<<<<<<< HEAD
  private Objecttt getdatafrom() {
=======
 private Objecttt getdatafrom() {
>>>>>>> b09cced28f0d0fadfac0887d1033af42a3a0a05b
        Pattern p = Pattern.compile("^[0-9]+$");
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Bạn chưa nhập tên thuộc tính!");
            jTextField1.requestFocus();
            return null;
        }

        if (jTextField1.getText().length() > 30) {
            JOptionPane.showMessageDialog(this, "Tên thuộc tính sản phẩm không quá 30 kí tự!");
            jTextField1.requestFocus();
            return null;
        }

        if (p.matcher(jTextField1.getText()).find() == true) {
            JOptionPane.showMessageDialog(this, "Tên thuộc tính sản phẩm phải là chữ!");
            jTextField1.requestFocus();
            return null;
        }
        return new Objecttt(0, jTextField1.getText());

    }

    private void clearfrom() {
        jTextField1.setText("");
    }
}
