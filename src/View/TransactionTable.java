/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.ListOfCustomer;

/**
 *
 * @author Irene Duong
 */
public class TransactionTable extends javax.swing.JFrame {

    /**
     * Creates new form TransactionTable
     */
    public TransactionTable() {
        initComponents();
    }

    public JTable getTable() {
        return TransactionTable;
    }

    public void insertDateIntoJtable(ListOfCustomer list, int index) {
        DefaultTableModel modelTran = (DefaultTableModel) TransactionTable.getModel();
        for (int i = 0; i < list.getListCusi(index).getListTransaction().size(); i++) {
            Object[] transact = new Object[] {
                    list.getListCusi(index).getListTransaction().get(i)
                            .getTypeOfTransaction(),
                    list.getListCusi(index).getListTransaction().get(i)
                            .getFromPhoneNum(),
                    list.getListCusi(index).getListTransaction().get(i)
                            .getToPhoneNum(),
                    list.getListCusi(index).getListTransaction().get(i).getValue(),
                    list.getListCusi(index).getListTransaction().get(i)
                            .getAfterBalance(),
                    list.getListCusi(index).getListTransaction().get(i).getDate()

            };
            modelTran.addRow(transact);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransactionTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Transaction Table");

        TransactionTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Type", "From Phone Number", "To Phone Number", "Value($)", "Balance After Transaction", "Date"
                }));
        jScrollPane1.setViewportView(TransactionTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(325, 325, 325))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TransactionTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
