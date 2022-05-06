/*
 * ReceiveBook.java
 *
 * Created on August 19, 2012, 11:12 PM
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author  Administrator
 */
public class ReceiveBook extends javax.swing.JFrame {
    
    /** Creates new form ReceiveBook */
    public ReceiveBook() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtMemberID = new javax.swing.JTextField();
        CmdMemberDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtMemberName = new javax.swing.JTextField();
        CmdReset = new javax.swing.JButton();
        CmdReceiveBook = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        TxtBookDetails = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LblBookID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(": Receive Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("- Receive Book");

        jLabel3.setText("Member ID :");

        TxtMemberID.setText("jTextField1");

        CmdMemberDetails.setText("Details");
        CmdMemberDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdMemberDetailsActionPerformed(evt);
            }
        });

        jLabel2.setText("Name :");

        TxtMemberName.setEditable(false);
        TxtMemberName.setText("jTextField1");

        CmdReset.setText("Reset");
        CmdReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdResetActionPerformed(evt);
            }
        });

        CmdReceiveBook.setText("Receive Book");
        CmdReceiveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdReceiveBookActionPerformed(evt);
            }
        });

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        TxtBookDetails.setEditable(false);
        TxtBookDetails.setText("jTextField1");

        jLabel4.setText("Book :");

        LblBookID.setFont(new java.awt.Font("Tahoma", 0, 8));
        LblBookID.setForeground(java.awt.Color.lightGray);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(CmdReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdReceiveBook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdClose))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(TxtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtBookDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblBookID)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CmdMemberDetails)
                                        .addComponent(TxtMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdMemberDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBookDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(LblBookID)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdReset)
                    .addComponent(CmdReceiveBook)
                    .addComponent(CmdClose))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdMemberDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdMemberDetailsActionPerformed
        //get member deatils
        try {
            //get database connection details
            MainClass mc=new MainClass();
            
            //open connection
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            String str="";
            str="select * from lib_member_master where mem_id =? ";
            PreparedStatement pst=connection.prepareStatement(str);
            pst.setString(1, TxtMemberID.getText());
            
            ResultSet rs;
            rs=pst.executeQuery();
            if (rs.next()) {
                TxtMemberName.setText(rs.getString("mem_name"));
                
                //get mem status
                str="select * from lib_transaction, lib_book_master where book_id=trn_book_id and trn_mem_id =? and (trn_receive_dt is null  or trn_receive_dt='')";
                PreparedStatement pst1=connection.prepareStatement(str);
                pst1.setString(1, TxtMemberID.getText());
                
                ResultSet rs1;
                rs1=pst1.executeQuery();
                if (rs1.next()) {
                    TxtBookDetails.setText("Available Book : " + rs1.getString("book_title"));
                    CmdReceiveBook.setEnabled(true);
                    LblBookID.setText(rs1.getString("book_id"));

                } else {
                    TxtBookDetails.setText("No book available.");
                    CmdReceiveBook.setEnabled(false);
                    LblBookID.setText("");
                    
                }
            } else {
                JOptionPane.showMessageDialog(null,"Invalid member id.");
                TxtMemberID.setText("");
                TxtMemberName.setText("");
                TxtBookDetails.setText("");
                CmdReceiveBook.setEnabled(false);
                LblBookID.setText("");
                return;
            }
            
            
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }//GEN-LAST:event_CmdMemberDetailsActionPerformed

    private void CmdResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdResetActionPerformed
        ClearText();
    }//GEN-LAST:event_CmdResetActionPerformed

    private void CmdReceiveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdReceiveBookActionPerformed
        //issue book
        try {
            
            
            if (TxtMemberID.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter member id.");
                return;
            }

            MainClass mc=new MainClass();
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            
            String sql = "update  lib_transaction set trn_receive_dt = sysdate() where trn_mem_id= " + TxtMemberID.getText() + " and trn_receive_dt is null and trn_book_id=" + LblBookID.getText();
            PreparedStatement pst=connection.prepareStatement(sql);
            pst.executeUpdate(sql);
            
            sql = "update  lib_book_master set book_status='Available' where book_id=" + LblBookID.getText();
            pst=connection.prepareStatement(sql);
            pst.executeUpdate(sql);
            
            
            JOptionPane.showMessageDialog(null,"Book Received");
            ClearText();
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
}//GEN-LAST:event_CmdReceiveBookActionPerformed
    
    private void ClearText()
    {
        TxtMemberID.setText("");
        TxtMemberName.setText("");
        TxtBookDetails.setText("");
        LblBookID.setText("");

        CmdReceiveBook.setEnabled(false);

    }
    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               ClearText();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiveBook().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdMemberDetails;
    private javax.swing.JButton CmdReceiveBook;
    private javax.swing.JButton CmdReset;
    private javax.swing.JLabel LblBookID;
    private javax.swing.JTextField TxtBookDetails;
    private javax.swing.JTextField TxtMemberID;
    private javax.swing.JTextField TxtMemberName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    
}