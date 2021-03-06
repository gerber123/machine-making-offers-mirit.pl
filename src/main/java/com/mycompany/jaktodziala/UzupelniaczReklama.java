/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaktodziala;

import com.aspose.pdf.Document;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.omg.CORBA_2_3.portable.InputStream;


/**
 *
 * @author marci
 */
public class UzupelniaczReklama extends javax.swing.JFrame {

   
//	public static final String SRC = "ofertaReklama.pdf";
//    public static final String DEST = "C:/katalog/";
    public UzupelniaczReklama() {
        initComponents();
               this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NazwaText = new javax.swing.JTextField();
        FejsText = new javax.swing.JTextField();
        CenaText = new javax.swing.JTextField();
        InstagramText = new javax.swing.JTextField();
        BlogText = new javax.swing.JTextField();
        ReklamaText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Stworz = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        AutorText = new javax.swing.JTextField();
        DataText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GeneratorOfert-Reklama");

        NazwaText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        NazwaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazwaTextActionPerformed(evt);
            }
        });

        FejsText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        FejsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FejsTextActionPerformed(evt);
            }
        });

        CenaText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        CenaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenaTextActionPerformed(evt);
            }
        });

        InstagramText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        InstagramText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstagramTextActionPerformed(evt);
            }
        });

        BlogText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        BlogText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlogTextActionPerformed(evt);
            }
        });

        ReklamaText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        ReklamaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReklamaTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel1.setText("Nazwa Firmy:");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel2.setText("Cena:");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel3.setText("Facebook:");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel4.setText("Instagram:");

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel5.setText("Blog:");

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel6.setText("Platna Reklama:");

        Stworz.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        Stworz.setText("Stwórz Oferte");
        Stworz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StworzActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel7.setText("Autor Oferty:");

        AutorText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        AutorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorTextActionPerformed(evt);
            }
        });

        DataText.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        DataText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel8.setText("Data Oferty");

        jLabel9.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel9.setText("Mirit- oferta Promowanie");
        jLabel9.setToolTipText("");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NazwaText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Stworz, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CenaText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FejsText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(InstagramText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BlogText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ReklamaText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AutorText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DataText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NazwaText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CenaText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FejsText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstagramText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlogText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReklamaText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AutorText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Stworz)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NazwaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazwaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NazwaTextActionPerformed

    private void FejsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FejsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FejsTextActionPerformed

    private void CenaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CenaTextActionPerformed

    private void InstagramTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstagramTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstagramTextActionPerformed

    private void BlogTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlogTextActionPerformed

    
    }//GEN-LAST:event_BlogTextActionPerformed

    private void ReklamaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReklamaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReklamaTextActionPerformed

    private void StworzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StworzActionPerformed
        String nazwa = NazwaText.getText();
        String cena = CenaText.getText();
        String blog = BlogText.getText();
        String facebook = FejsText.getText();
        String instagram = InstagramText.getText();
        String PlatnaReklama = ReklamaText.getText();
        String autor = AutorText.getText();
        String data = DataText.getText();
        
        if(NazwaText.getText().equalsIgnoreCase("")||CenaText.getText().equalsIgnoreCase("")||
                BlogText.getText().equalsIgnoreCase("")||
                FejsText.getText().equalsIgnoreCase("")
                ||InstagramText.getText().equalsIgnoreCase("")||
                ReklamaText.getText().equalsIgnoreCase("")
                ||AutorText.getText().equalsIgnoreCase("")
                ||DataText.getText().equalsIgnoreCase("")
                
                )
        {
               JOptionPane.showMessageDialog(null, "Uzupełnij wszystkie pola zanim stworzysz Oferte"); 
        }
        else{
            
        Document pdfDocument = new Document("ofertaReklama.pdf");
        MetodyWczytujaceOfertyReklamy.NazwaFirmy(pdfDocument,nazwa);
        MetodyWczytujaceOfertyReklamy.Cena(pdfDocument,cena);
        MetodyWczytujaceOfertyReklamy.Fejs(pdfDocument,facebook);
        MetodyWczytujaceOfertyReklamy.Instagram(pdfDocument,instagram);
        MetodyWczytujaceOfertyReklamy.Blog(pdfDocument,blog);
        MetodyWczytujaceOfertyReklamy.platnaReklama(pdfDocument,PlatnaReklama);
        MetodyWczytujaceOfertyReklamy.AutorOferty(pdfDocument,autor);
        MetodyWczytujaceOfertyReklamy.DataOferty(pdfDocument,data);
        
        pdfDocument.save("./OfertyReklamowe/"+MetodyWczytujaceOfertyReklamy.nazwaFirmy+"Oferta.pdf");
        JOptionPane.showMessageDialog(null, "Oferta została Stworzona");
        }
      
    }//GEN-LAST:event_StworzActionPerformed

    private void AutorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorTextActionPerformed

    private void DataTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UzupelniaczReklama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UzupelniaczReklama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UzupelniaczReklama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UzupelniaczReklama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UzupelniaczReklama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AutorText;
    private javax.swing.JTextField BlogText;
    private javax.swing.JTextField CenaText;
    private javax.swing.JTextField DataText;
    private javax.swing.JTextField FejsText;
    private javax.swing.JTextField InstagramText;
    private javax.swing.JTextField NazwaText;
    private javax.swing.JTextField ReklamaText;
    private javax.swing.JButton Stworz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
