/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;




//import viewmodels.barCode;
/**
 *
 * @author hungh
 */
public class frm_Banhang extends javax.swing.JPanel implements Runnable, ThreadFactory {

   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panelGradiente1 = new swing.PanelGradiente();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_sanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cb_danhMuc = new javax.swing.JComboBox<>();
        panelBorder1 = new swing.PanelBorder();
        searchText1 = new swing.SearchText();
        jLabel3 = new javax.swing.JLabel();
        panelGradiente2 = new swing.PanelGradiente();
        btn_xoa = new swing.MyButton();
        btn_clear = new swing.MyButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_gioHang = new javax.swing.JTable();
        panelGradiente3 = new swing.PanelGradiente();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_hoaDon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelGradiente4 = new swing.PanelGradiente();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_tienKhachDua = new swing.MyTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_ghiChu = new javax.swing.JTextArea();
        chk_inHoaDon = new javax.swing.JCheckBox();
        btn_thanhToan = new swing.MyButton();
        btn_xacNhan = new swing.MyButton();
        lbl_thanhTien = new javax.swing.JLabel();
        lbl_tienThua = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_tongTien1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_giamGia1 = new javax.swing.JLabel();
        myButton9 = new swing.MyButton();
        lbl_tenKhachHang = new javax.swing.JLabel();
        btn_thayDoi = new swing.MyButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_sdt = new javax.swing.JLabel();
        btn_taoHoaDon = new swing.MyButton();
        jLabel17 = new javax.swing.JLabel();

        jMenuItem1.setText("Thêm");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));
        setName(""); // NOI18N

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 204, 204));
        panelGradiente1.setColorSecundario(new java.awt.Color(204, 204, 204));

        tb_sanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Mằu Sắc", "Giảm Giá", "Hình Thức Giảm", "Chất Liệu", "Kích Cỡ", "Giá Bán", "Số Lượng"
            }
        ));
        tb_sanPham.setGridColor(new java.awt.Color(255, 255, 255));
        tb_sanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_sanPham);

        panelGradiente1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 60, 560, 190);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sản phẩm");
        panelGradiente1.add(jLabel1);
        jLabel1.setBounds(20, 0, 100, 15);

        cb_danhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        cb_danhMuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        cb_danhMuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_danhMucItemStateChanged(evt);
            }
        });
        panelGradiente1.add(cb_danhMuc);
        cb_danhMuc.setBounds(270, 20, 200, 30);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        searchText1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchText1CaretUpdate(evt);
            }
        });
        panelBorder1.add(searchText1);
        searchText1.setBounds(10, 0, 180, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(194, 0, 40, 30);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 20, 230, 30);

        panelGradiente2.setColorPrimario(new java.awt.Color(204, 204, 204));
        panelGradiente2.setColorSecundario(new java.awt.Color(204, 204, 204));

        btn_xoa.setBackground(new java.awt.Color(125, 224, 237));
        btn_xoa.setText("Xóa");
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        panelGradiente2.add(btn_xoa);
        btn_xoa.setBounds(490, 50, 100, 30);

        btn_clear.setBackground(new java.awt.Color(125, 224, 237));
        btn_clear.setText("Xoá Tất Cả");
        btn_clear.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        panelGradiente2.add(btn_clear);
        btn_clear.setBounds(490, 100, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Giỏ hàng");
        panelGradiente2.add(jLabel2);
        jLabel2.setBounds(10, 0, 55, 15);

        tb_gioHang.setBackground(new java.awt.Color(242, 242, 242));
        tb_gioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Màu Sắc", "Size", "Số Lượng", "Đơn Giá", "Được giảm", "Thành Tiền"
            }
        ));
        tb_gioHang.setComponentPopupMenu(jPopupMenu1);
        tb_gioHang.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tb_gioHang);

        panelGradiente2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 20, 470, 150);

        panelGradiente3.setColorPrimario(new java.awt.Color(204, 204, 204));
        panelGradiente3.setColorSecundario(new java.awt.Color(204, 204, 204));

        tb_hoaDon.setBackground(new java.awt.Color(242, 242, 242));
        tb_hoaDon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tb_hoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Ngày Tạo", "Nhân Viên", "Trạng Thái"
            }
        ));
        tb_hoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb_hoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        tb_hoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_hoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tb_hoaDonMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tb_hoaDon);

        panelGradiente3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 370, 150);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hóa đơn chờ");
        jLabel4.setToolTipText("");
        panelGradiente3.add(jLabel4);
        jLabel4.setBounds(10, 0, 90, 15);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelGradiente3.add(jPanel1);
        jPanel1.setBounds(380, 20, 220, 150);

        panelGradiente4.setColorPrimario(new java.awt.Color(204, 204, 204));
        panelGradiente4.setColorSecundario(new java.awt.Color(204, 204, 204));
        panelGradiente4.setMinimumSize(new java.awt.Dimension(1010, 640));
        panelGradiente4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Thanh toán");
        jLabel5.setToolTipText("");
        panelGradiente4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tên khách hàng");
        panelGradiente4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("SĐT khách hàng");
        panelGradiente4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 210, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Khách Cần Trả");
        panelGradiente4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 250, 20));

        txt_tienKhachDua.setBackground(new java.awt.Color(244, 244, 254));
        txt_tienKhachDua.setForeground(new java.awt.Color(255, 51, 51));
        txt_tienKhachDua.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_tienKhachDuaCaretUpdate(evt);
            }
        });
        panelGradiente4.add(txt_tienKhachDua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Tiền khách đưa");
        panelGradiente4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 250, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("Ghi chú");
        panelGradiente4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 60, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Tiền thừa");
        panelGradiente4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, 20));

        txt_ghiChu.setBackground(new java.awt.Color(244, 244, 254));
        txt_ghiChu.setColumns(20);
        txt_ghiChu.setRows(3);
        txt_ghiChu.setTabSize(0);
        txt_ghiChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jScrollPane4.setViewportView(txt_ghiChu);
        txt_ghiChu.getAccessibleContext().setAccessibleDescription("");

        panelGradiente4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 240, 90));

        chk_inHoaDon.setBackground(new java.awt.Color(204, 204, 204));
        chk_inHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chk_inHoaDon.setText("In hóa đơn");
        chk_inHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_inHoaDonActionPerformed(evt);
            }
        });
        panelGradiente4.add(chk_inHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 100, -1));

        btn_thanhToan.setBackground(new java.awt.Color(125, 224, 237));
        btn_thanhToan.setForeground(new java.awt.Color(0, 51, 102));
        btn_thanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/credit-card 3.png"))); // NOI18N
        btn_thanhToan.setText("Thanh toán");
        btn_thanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });
        panelGradiente4.add(btn_thanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 310, 50));

        btn_xacNhan.setBackground(new java.awt.Color(125, 224, 237));
        btn_xacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-mark.png"))); // NOI18N
        btn_xacNhan.setText("Xác Nhận");
        btn_xacNhan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xacNhan.setRolloverEnabled(false);
        btn_xacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xacNhanActionPerformed(evt);
            }
        });
        panelGradiente4.add(btn_xacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, 30));

        lbl_thanhTien.setForeground(new java.awt.Color(255, 51, 51));
        lbl_thanhTien.setText("0");
        panelGradiente4.add(lbl_thanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 260, 20));

        lbl_tienThua.setForeground(new java.awt.Color(0, 153, 153));
        panelGradiente4.add(lbl_tienThua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 240, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Tổng tiền");
        panelGradiente4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 60, 20));

        lbl_tongTien1.setForeground(new java.awt.Color(255, 51, 51));
        lbl_tongTien1.setText("0");
        panelGradiente4.add(lbl_tongTien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 240, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Giảm Giá");
        panelGradiente4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 20));

        lbl_giamGia1.setForeground(new java.awt.Color(255, 51, 51));
        lbl_giamGia1.setText("0");
        panelGradiente4.add(lbl_giamGia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 250, 20));

        myButton9.setBackground(new java.awt.Color(125, 224, 237));
        myButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        myButton9.setText("Làm Mới");
        myButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        myButton9.setMaximumSize(new java.awt.Dimension(101, 25));
        myButton9.setMinimumSize(new java.awt.Dimension(101, 25));
        myButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton9ActionPerformed(evt);
            }
        });
        panelGradiente4.add(myButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 140, 40));

        lbl_tenKhachHang.setForeground(new java.awt.Color(0, 153, 153));
        panelGradiente4.add(lbl_tenKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, 20));

        btn_thayDoi.setBackground(new java.awt.Color(125, 224, 237));
        btn_thayDoi.setText("Khách Hàng");
        btn_thayDoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_thayDoi.setRolloverEnabled(false);
        btn_thayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thayDoiActionPerformed(evt);
            }
        });
        panelGradiente4.add(btn_thayDoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 110, 40));
        panelGradiente4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 160, 20));

        lbl_sdt.setForeground(new java.awt.Color(0, 153, 153));
        panelGradiente4.add(lbl_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 20));

        btn_taoHoaDon.setBackground(new java.awt.Color(125, 224, 237));
        btn_taoHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill (2).png"))); // NOI18N
        btn_taoHoaDon.setText("Tạo Hoá Đơn");
        btn_taoHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_taoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoHoaDonActionPerformed(evt);
            }
        });
        panelGradiente4.add(btn_taoHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 140, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel (1).png"))); // NOI18N
        panelGradiente4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelGradiente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGradiente4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGradiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(panelGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelGradiente4, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_sanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sanPhamMouseClicked
       
    }//GEN-LAST:event_tb_sanPhamMouseClicked

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed
       
    }//GEN-LAST:event_btn_thanhToanActionPerformed

    private void btn_taoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoHoaDonActionPerformed
     
    }//GEN-LAST:event_btn_taoHoaDonActionPerformed

    private void tb_hoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_hoaDonMouseClicked
      
    }//GEN-LAST:event_tb_hoaDonMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed

    
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
      
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void searchText1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchText1CaretUpdate
        
    }//GEN-LAST:event_searchText1CaretUpdate

    private void myButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton9ActionPerformed
       
    }//GEN-LAST:event_myButton9ActionPerformed

    private void btn_xacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xacNhanActionPerformed
    
    }//GEN-LAST:event_btn_xacNhanActionPerformed

    private void txt_tienKhachDuaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_tienKhachDuaCaretUpdate
        

    }//GEN-LAST:event_txt_tienKhachDuaCaretUpdate

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    private void btn_thayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thayDoiActionPerformed
       
    }//GEN-LAST:event_btn_thayDoiActionPerformed

    private void cb_danhMucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_danhMucItemStateChanged
      
    }//GEN-LAST:event_cb_danhMucItemStateChanged

    private void tb_hoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_hoaDonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_hoaDonMouseEntered

    private void chk_inHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_inHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_inHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btn_clear;
    private swing.MyButton btn_taoHoaDon;
    private swing.MyButton btn_thanhToan;
    private swing.MyButton btn_thayDoi;
    private swing.MyButton btn_xacNhan;
    private swing.MyButton btn_xoa;
    private javax.swing.JComboBox<String> cb_danhMuc;
    private javax.swing.JCheckBox chk_inHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_giamGia1;
    private javax.swing.JLabel lbl_sdt;
    private javax.swing.JLabel lbl_tenKhachHang;
    private javax.swing.JLabel lbl_thanhTien;
    private javax.swing.JLabel lbl_tienThua;
    private javax.swing.JLabel lbl_tongTien1;
    private swing.MyButton myButton9;
    private swing.PanelBorder panelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelGradiente panelGradiente2;
    private swing.PanelGradiente panelGradiente3;
    private swing.PanelGradiente panelGradiente4;
    private swing.SearchText searchText1;
    private javax.swing.JTable tb_gioHang;
    private javax.swing.JTable tb_hoaDon;
    private javax.swing.JTable tb_sanPham;
    private javax.swing.JTextArea txt_ghiChu;
    private swing.MyTextField txt_tienKhachDua;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Thread newThread(Runnable r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
