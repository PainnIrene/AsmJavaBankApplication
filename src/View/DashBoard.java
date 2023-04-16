
package View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.CustomerController;
import Model.ListOfCustomer;

/**
 *
 * @author Irene Duong
 */
public class DashBoard extends javax.swing.JFrame {
    Color DefaultColor, ClickedColor;
    ListOfCustomer list;
    Home home;
    Details detail;
    JPanel panelDetail, panelHome;

    /**
     * Creates new form DashBoard
     */
    public DashBoard(ListOfCustomer list) {
        initComponents();
        this.list = list;
        CustomerController controller = new CustomerController();
        controller.ReadFile(list);
        detail = new Details(list);
        home = new Home(list);
        panelHome = home.getHomeView();
        panelDetail = detail.getDetailView();
        //
        panelHome.setBounds(0, 0, 32000, 32000);
        DashBoardPanel.add(panelHome);
        //
        DefaultColor = new Color(10, 10, 10);
        ClickedColor = new Color(79, 79, 79);

        Home1.setBackground(ClickedColor);
        Home2.setBackground(DefaultColor);
        Home3.setBackground(DefaultColor);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Home1 = new javax.swing.JButton();
        Home2 = new javax.swing.JButton();
        Home3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DashBoardPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(10, 10, 10));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(50, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/flo.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin");

        jPanel5.setBackground(new java.awt.Color(10, 10, 10));

        Home1.setBackground(new java.awt.Color(10, 10, 10));
        Home1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Home1.setForeground(new java.awt.Color(255, 255, 255));
        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/icons8_home_30px.png"))); // NOI18N
        Home1.setText("Home");
        Home1.setAlignmentY(0.0F);
        Home1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Home1.setBorderPainted(false);
        Home1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Home1.setFocusable(false);
        Home1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Home1.setIconTextGap(10);
        Home1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home1MouseClicked(evt);
            }
        });
        Home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home1ActionPerformed(evt);
            }
        });

        Home2.setBackground(new java.awt.Color(10, 10, 10));
        Home2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Home2.setForeground(new java.awt.Color(255, 255, 255));
        Home2.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/icons8_table_of_content_30px.png"))); // NOI18N
        Home2.setText("Customer Details");
        Home2.setAlignmentY(0.0F);
        Home2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Home2.setBorderPainted(false);
        Home2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Home2.setFocusable(false);
        Home2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Home2.setIconTextGap(10);
        Home2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home2MouseClicked(evt);
            }
        });
        Home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home2ActionPerformed(evt);
            }
        });

        Home3.setBackground(new java.awt.Color(10, 10, 10));
        Home3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Home3.setForeground(new java.awt.Color(255, 255, 255));
        Home3.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/Resources/Icons/icons8_logout_rounded_left_30px.png"))); // NOI18N
        Home3.setText("Quit");
        Home3.setAlignmentY(0.0F);
        Home3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Home3.setBorderPainted(false);
        Home3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Home3.setFocusable(false);
        Home3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Home3.setIconTextGap(10);
        Home3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home3MouseClicked(evt);
            }
        });
        Home3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 319,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Home1, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Home2, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap()));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Home1, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Home2, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Home3, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jLabel4.setBackground(new java.awt.Color(10, 10, 10));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("@HoangTran");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(45, 45, 45)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addGap(22, 22, 22)))))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(267, Short.MAX_VALUE)));

        jPanel1.add(jPanel2);

        DashBoardPanel.setBackground(new java.awt.Color(255, 0, 0));
        DashBoardPanel.setPreferredSize(new java.awt.Dimension(900, 900));

        javax.swing.GroupLayout DashBoardPanelLayout = new javax.swing.GroupLayout(DashBoardPanel);
        DashBoardPanel.setLayout(DashBoardPanelLayout);
        DashBoardPanelLayout.setHorizontalGroup(
                DashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1002, Short.MAX_VALUE));
        DashBoardPanelLayout.setVerticalGroup(
                DashBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 722, Short.MAX_VALUE));

        jPanel1.add(DashBoardPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1203, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Home1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Home1MouseClicked
        Home1.setBackground(ClickedColor);
        Home2.setBackground(DefaultColor);
        Home3.setBackground(DefaultColor);

    }// GEN-LAST:event_Home1MouseClicked

    private void Home2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Home2MouseClicked
        Home1.setBackground(DefaultColor);
        Home2.setBackground(ClickedColor);
        Home3.setBackground(DefaultColor);

    }// GEN-LAST:event_Home2MouseClicked

    private void Home3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Home3MouseClicked
        Home1.setBackground(DefaultColor);
        Home2.setBackground(DefaultColor);
        Home3.setBackground(ClickedColor);
    }// GEN-LAST:event_Home3MouseClicked

    private void Home1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Home1ActionPerformed
        home.totalAccount();
        home.countAverage();
        DashBoardPanel.removeAll();
        DashBoardPanel.add(panelHome);
        DashBoardPanel.revalidate();
        DashBoardPanel.repaint();
    }// GEN-LAST:event_Home1ActionPerformed

    private void Home2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Home2ActionPerformed
        // remove Home panel
        DashBoardPanel.removeAll();
        panelDetail.setBounds(0, 0, 1350, 900);
        DashBoardPanel.add(panelDetail);
        DashBoardPanel.revalidate();
        DashBoardPanel.repaint();
    }// GEN-LAST:event_Home2ActionPerformed

    private void Home3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Home3ActionPerformed
        System.exit(0);

    }// GEN-LAST:event_Home3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashBoardPanel;
    private javax.swing.JButton Home1;
    private javax.swing.JButton Home2;
    private javax.swing.JButton Home3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
