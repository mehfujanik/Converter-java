
package converter;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class convert extends javax.swing.JFrame {
    
    String X;

    /**
     * Creates new form convert
     */
    public convert() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Distance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Area");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Weight");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Volume");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Speed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Woodcut", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Visual Tools\\game icon pack 2\\Star Wars The Old Republic_4.png")); // NOI18N
        jLabel1.setText(" MUSE Unit Converter ");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("OK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("View History");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Stencil Std", 0, 24)); // NOI18N
        jLabel2.setText("Results :");

        Save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Save.setText("Save Data ");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Results will be shown here....");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("History Will Be shown here ...");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(" Input Value :");

        jButton8.setText("Temperature");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              
            combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "m", "km", "inc", "ft" }));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                   
         combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mm Square", "Cm Square", "M Square", "Km Square", "Acre", "Ft Square" }));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mg", "G", "Kg", "Ton", "Pound", "Ounce" }));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String a1 = jTextField1.getText();
        Double a=Double.parseDouble(a1);
        
        // for distance
        if (combo.getSelectedItem().equals("mm")) {
            resultmm(a);
            X="mm";
        }
        if (combo.getSelectedItem().equals("cm")) {
            resultcm(a);
            X="cm";
        }
        if (combo.getSelectedItem().equals("m")) {
            resultm(a);
            X="m";            
        }
        if (combo.getSelectedItem().equals("km")) {
            resultkm(a);
            X="km";
        }
        if (combo.getSelectedItem().equals("inc")) {
            resultinc(a);
            X="inch";
        }
        if (combo.getSelectedItem().equals("ft")) {
            resultft(a);
            X="ft";
        }
        
        
        //for Area
        if (combo.getSelectedItem().equals("Mm Square")) {
            resultmms(a);
            X="Mm Square";
        }
        if (combo.getSelectedItem().equals("Cm Square")) {
            resultcms(a);
            X="cm Square";
        }
        if (combo.getSelectedItem().equals("M Square")) {
            resultms(a);
            X="M Square";
        }
        if (combo.getSelectedItem().equals("Km Square")) {
            resultkms(a);
            X="Km Square";
        }
        if (combo.getSelectedItem().equals("Acre")) {
            resultacr(a);
            X="Acre";
        }
        if (combo.getSelectedItem().equals("Ft Square")) {
            resultfts(a);
            X="Ft Square";
        }
        
        // For Weight
        if (combo.getSelectedItem().equals("Mg")) {
            resultmg(a);
            X="Mg";
        }
        if (combo.getSelectedItem().equals("G")) {
            resultg(a);
            X="G";
        }
        if (combo.getSelectedItem().equals("Kg")) {
            resultkg(a);
            X="Kg";
        }
        if (combo.getSelectedItem().equals("Pound")) {
            resultpon(a);
            X="Pound";
        }
        if (combo.getSelectedItem().equals("Ton")) {
            resultton(a);
            X="Ton";
        }
        if (combo.getSelectedItem().equals("Ounce")) {
            resultoz(a);
            X="Ounce";
        }
        
        // For volume
        if (combo.getSelectedItem().equals("Milli lItre")) {
            resultml(a);
            X="Milli Litre";
        }
        if (combo.getSelectedItem().equals("Cubic C.meter")) {
            resultccm(a);
            X="Cubic C.meter";
        }
        if (combo.getSelectedItem().equals("Litre")) {
            resultlt(a);
            X="Litre";
        }
        if (combo.getSelectedItem().equals("Cubic Meter")) {
            resultcmt(a);
            X="Cubic Meter";
        }
        if (combo.getSelectedItem().equals("Cubic Inch")) {
            resultci(a);
            X="Cubic Inch";
        }
        if (combo.getSelectedItem().equals("Cubic Foot")) {
            resultcf(a);
            X="Cubic Foot";
        }
        
        // for speed
        if (combo.getSelectedItem().equals("m/s")) {
            resultmps(a);
            X="m/s";
        }
        if (combo.getSelectedItem().equals("kmph")) {
            resultkmph(a);
            X="kmph";
        }
        if (combo.getSelectedItem().equals("mph")) {
            resultmph(a);
            X="mph";
        }
        if (combo.getSelectedItem().equals("knot")) {
            resultkn(a);
            X="knot";
        }
        if (combo.getSelectedItem().equals("ft/s")) {
            resultfs(a);
            X="ft/s";
        }
        
        // for temperature
        if (combo.getSelectedItem().equals("Kelvin")) {
            resultkl(a);
            X="Kelvin";
        }
        if (combo.getSelectedItem().equals("Celsius")) {
            resultcl(a);
            X="Celcius";
        }
        if (combo.getSelectedItem().equals("Fahrenheit")) {
            resultfh(a);
            X="Fahrenheit";
        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
            
            System.exit(0);        
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
      
        jTextField1.setText(null);
        jTextArea1.setText("Results will be shown here....");
        jTextArea2.setText("History Will Be shown here ...");
        combo.removeAllItems();
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
         combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milli lItre", "Cubic C.meter", "Litre", "Cubic Meter", "Cubic Inch", "Cubic Foot" }));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
         combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s","kmph", "mph", "knot", "ft/s" }));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Celsius", "Fahrenheit"}));
    }//GEN-LAST:event_jButton8ActionPerformed
      
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
                theQuery("insert into converter(input1,input2,output)values('"+jTextField1.getText()+"','"+X+"','"+jTextArea1.getText()+"')" );
                JOptionPane.showMessageDialog(null,"Record Insert Done!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_SaveActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
            try
{
String sql = "select * from converter;" ;
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/converter","root","");
PreparedStatement ps=cn.prepareStatement(sql);
ResultSet rs=ps.executeQuery();
while(rs.next())
            {     
    jTextArea2.setText(rs.getString("input1")+" "+rs.getString("input2")+"\n\n"+rs.getString("output"));  
            }

}catch(Exception ex)
{
JOptionPane.showMessageDialog(null,ex.getMessage());
}     
    }//GEN-LAST:event_jButton7ActionPerformed

// Functions of Distance
    
    public void resultmm(double a2)
    {
        
        Double km = a2/1000000;
        Double cm =a2/100; 
        Double  m =a2/1000;
        Double ft = a2*0.00328084;
        Double inc = a2*0.0393700787;        
        String mm1= Double.toString(km);
        String mm2= Double.toString(cm);
        String mm3= Double.toString(m);
        String mm4= Double.toString(ft);
        String mm5= Double.toString(inc);
        jTextArea1.setText("Km\t= "+mm1+"\nCm\t= "+mm2+"\n M\t ="+mm3+"\nFt\t ="+mm4+"\nInc\t= "+mm5);
        
    }
    public void resultcm(double a2)
    {
        Double mm=a2*10;
        Double m1=a2/100;
        Double km1= a2/100000;
        Double ft1 = a2*0.032808399;
        Double inc1=a2*0.03937007874;
        String cm1 = Double.toString(mm);
        String cm2 = Double.toString(m1);
        String cm3= Double.toString(km1);
        String cm4= Double.toString(ft1)   ;    
        String cm5= Double.toString(inc1);
      jTextArea1.setText("Km\t= "+cm3+"\nM\t= "+cm2+"\nMm\t ="+cm1+"\nFt\t ="+cm4+"\nInc\t= "+cm5);
    }
    public void resultm(double a2) 
    {
    Double mm2=a2*1000;
    Double cm2 =a2*100;
    Double km2 =a2/1000;
    Double ft2 =a2*3.280839895;
    Double inc2=a2*39.37007874;
    String m1 = Double.toString(mm2);
    String m2 = Double.toString(cm2);
    String m3 = Double.toString(km2);
    String m4 = Double.toString(ft2);
    String m5 = Double.toString(inc2);
    jTextArea1.setText("Mm\t= "+m1+"\nKm\t= "+m3+"\nCm\t ="+m2+"\nFt\t ="+m4+"\nInc\t= "+m5);
    }
    public void resultkm(double a2) 
    {
    Double mm2=a2*1000000;
    Double cm2 =a2*100000;
    Double M2 =a2*1000;
    Double ft2 =a2*3280.839895;
    Double inc2=a2*39370.07874;
    String m1 = Double.toString(mm2);
    String m2 = Double.toString(cm2);
    String m3 = Double.toString(M2);
    String m4 = Double.toString(ft2);
    String m5 = Double.toString(inc2);
    jTextArea1.setText("Mm\t= "+m1+"\nM\t= "+m3+"\nCm\t ="+m2+"\nFt\t ="+m4+"\nInc\t= "+m5);
    }
    public void resultft(double a2) 
    {
    Double mm2=a2*304.8;
    Double cm2 =a2*30.48;
    Double M2 =a2*0.3048;
    Double M1 =a2*0.0003048;
    Double inc2=a2*12;
    String m1 = Double.toString(mm2);
    String m2 = Double.toString(cm2);
    String m3 = Double.toString(M2);
    String m4 = Double.toString(M1);
    String m5 = Double.toString(inc2);
    jTextArea1.setText("Mm\t= "+m1+"\nM\t= "+m3+"\nCm\t ="+m2+"\nKm\t ="+m4+"\nInc\t= "+m5);
    }
    public void resultinc(double a2) 
     {
      Double mm2=a2*25.4;
    Double cm2 =a2*2.54;
    Double km2 =a2*0.0000254;
    Double ft2 =a2*0.083333333;
    Double M2=a2*0.0254;
    String m1 = Double.toString(mm2);
    String m2 = Double.toString(cm2);
    String m3 = Double.toString(km2);
    String m4 = Double.toString(ft2);
    String m5 = Double.toString(M2);
    jTextArea1.setText("Mm\t= "+m1+"\nKm\t= "+m3+"\nCm\t ="+m2+"\nFt\t ="+m4+"\nM\t= "+m5);
     }
     // Until this line 
     
 //Functions of area
    
    public void resultmms(double a3)
    {
      
        Double kms = a3/100000;
        kms=kms/10000000;
        Double ms=a3/1000000;
        Double cms=a3/100;
        Double acr=a3/404685.6422;
        acr=acr/10000;
        Double fts= a3/92903.04;
        
        String skm= Double.toString(kms);
        String sms= Double.toString(ms);
        String scms= Double.toString(cms);
        String sacr= Double.toString(acr);
        String sfts= Double.toString(fts);
        jTextArea1.setText("Km Square\t ="+skm+"\nM Square \t ="+ms+"\nCm Square\t ="+cms+"\nAcre    \t ="+acr+"\nFoot Square\t ="+fts);
        
    }
     public void resultcms(double a3)
    {
      
        Double kms = a3/100000;
        kms=kms/100000;
        Double ms=a3/10000;
        Double mms=a3*100;
        Double acr=a3/404685.6422;
        acr=acr/100;
        Double fts= a3*0.001076391;
        
        String skm= Double.toString(kms);
        String sms= Double.toString(ms);
        String scms= Double.toString(mms);
        String sacr= Double.toString(acr);
        String sfts= Double.toString(fts);
        jTextArea1.setText("Km Square\t ="+skm+"\nM Square \t ="+ms+"\nMm Square\t ="+mms+"\nAcre    \t ="+acr+"\nFoot Square\t ="+fts);
        
    }
     public void resultms(double a3)
    {
      
        Double kms = a3/1000000;
       
        Double mms=a3*1000000;
        Double cms=a3*1000;
        Double acr=a3*0.0002571054;
        Double fts= a3*10.763910417;
        
        String skm= Double.toString(kms);
        String sms= Double.toString(mms);
        String scms= Double.toString(cms);
        String sacr= Double.toString(acr);
        String sfts= Double.toString(fts);
        jTextArea1.setText("Km Square\t ="+skm+"\nMm Square \t ="+mms+"\nCm Square\t ="+cms+"\nAcre    \t ="+acr+"\nFoot Square\t ="+fts);
        
    }
     public void resultkms(double a3)
    {
      
        Double mms = a3*1000000;
        mms=mms*1000000;
        Double ms=a3*1000000;
        Double cms=a3*100000;
        cms=cms*100000;
        Double acr=a3*247.10538147;
        
        Double fts= a3*10763910.417;
        
        String skm= Double.toString(mms);
        String sms= Double.toString(ms);
        String scms= Double.toString(cms);
        String sacr= Double.toString(acr);
        String sfts= Double.toString(fts);
        jTextArea1.setText("Mm Square\t ="+skm+"\nM Square \t ="+ms+"\nCm Square\t ="+cms+"\nAcre    \t ="+acr+"\nFoot Square\t ="+fts);
        
    }
     public void resultacr(double a3)
    {
      
        Double kms = a3*0.0040468564;
        Double ms=a3*4046.8564224;
        Double cms=a3*40468564.224;
        Double mms=a3*4046856422.4;
        
        Double fts= a3*43560;
        
        
        jTextArea1.setText("Km Square\t ="+kms+"\nM Square \t ="+ms+"\nCm Square\t ="+cms+"\nMm Square\t ="+mms+"\nFoot Square\t ="+fts);
        
    }
       public void resultfts(double a3)
    {
      
        Double kms = a3/10763910.417;
        Double ms=a3*0.09290304;
        Double cms=a3*929.0304;
        Double mms=a3*92903.04;
        
        Double acr= a3/43560;
        
        
        jTextArea1.setText("Km Square\t ="+kms+"\nM Square \t ="+ms+"\nCm Square\t ="+cms+"\nMm Square\t ="+mms+"\nAcre     \t ="+acr);
        
    }
       // until this
       
       // Functions of weight
       public void resultmg(double a4)
       {
           Double g=a4/1000;
           Double kg=a4/1000000;
           Double ton=a4/100000;
           ton=ton/10000;
           Double oz=a4/28349.523125;
           Double pn=a4/453592.37;
           
           jTextArea1.setText("G  \t = "+g+"\nKg \t = "+kg+"\nTon\t = "+ton+"\nLb \t = "+pn+"\nOunce \t= "+oz);
       }
        public void resultg(double a4)
       {
           Double mg=a4*1000;
           Double kg=a4/1000;
           Double ton=kg/1000;
           
           Double oz=a4/28.349523125;
           Double pn=a4/453.59237;
           
           jTextArea1.setText("Mg  \t = "+mg+"\nKg \t = "+kg+"\nTon\t = "+ton+"\nLb \t = "+pn+"\nOunce \t= "+oz);
       }
          public void resultkg(double a4)
       {
           Double mg=a4*1000000;
           Double g=a4*1000;
           
           Double ton=a4/1000;
           Double oz=a4*35.27396195;
           Double pn=a4*2.2046226218;
           
           jTextArea1.setText("Mg  \t = "+mg+"\nG \t = "+g+"\nTon\t = "+ton+"\nLb \t = "+pn+"\nOunce \t= "+oz);
       }
            public void resultton(double a4)
       {
           Double mg=a4*1000*1000*1000;
           Double kg=a4*1000;
           Double g=kg*1000;
           
           Double oz=a4*35273.96195;
           Double pn=a4*2204.6226218;
           
           jTextArea1.setText("Mg  \t = "+mg+"\nKg \t = "+kg+"\nG\t = "+g+"\nLb \t = "+pn+"\nOunce \t= "+oz);
       }
             public void resultpon(double a4)
       {
           Double mg=a4*453592.37;
           Double kg=a4*0.45359237;
           Double g =a4*453.59237;
           
           Double oz=a4*16;
           Double ton=a4*0.0005;
           
           jTextArea1.setText("Mg  \t = "+mg+"\nKg \t = "+kg+"\nG\t = "+g+"\nTon \t = "+ton+"\nOunce \t= "+oz);
       } 
           public void resultoz(double a4)
       {
           Double mg=a4*28349.523125;
           Double kg=a4*0.0283495231;
           Double g =a4*28.3495231;
           
           Double pon=a4*0.0625;
           Double ton=a4/35273.96195;
           
           
           jTextArea1.setText("Mg  \t = "+mg+"\nKg \t = "+kg+"\nG\t = "+g+"\nTon \t = "+ton+"\nLb \t= "+pon);
       } 
       // Untill this line
           
        public void resultml(double a5)
        {
            Double cm= a5;
            Double l= a5/1000;
            Double m= a5/1000000;
            Double in = a5*0.0610237441;
            Double ft = a5/28316.846592;
            
            jTextArea1.setText("Cm Cube\t = "+cm+"\nLitre\t = "+l+"\nMitre Cube\t = "+m+"\nCubic Inch\t = "+in+"\nCubic Foot\t = "+ft);
           }      
        public void resultccm(double a5)
        {
            Double ml= a5;
            Double l= a5/1000;
            Double m= a5/1000000;
            Double in = a5*0.0610237441;
            Double ft = a5/28316.846592;
            
            jTextArea1.setText("Milli Litre\t = "+ml+"\nLitre\t = "+l+"\nMitre Cube\t = "+m+"\nCubic Inch\t = "+in+"\nCubic Foot\t = "+ft);
           }   
        public void resultlt(double a5)
        {
            Double cm= a5*1000;
            Double ml= a5*1000;
            Double m= a5/1000;
            Double in = a5*61.023744;
            Double ft = a5*0.0353146667;
            
            jTextArea1.setText("Cm Cube\t = "+cm+"\nMilli Litre\t = "+ml+"\nMitre Cube\t = "+m+"\nCubic Inch\t = "+in+"\nCubic Foot\t = "+ft);
           }   
        public void resultcmt(double a5)
        {
            Double cm= a5*1000000;
            Double ml= a5*1000000;
            Double l= a5*1000;
            Double in = a5*61023.7441;
            Double ft = a5*35.314666721;
            
            jTextArea1.setText("Cm Cube\t = "+cm+"\nLitre\t = "+l+"\nMilli Litre\t = "+ml+"\nCubic Inch\t = "+in+"\nCubic Foot\t = "+ft);
           }   
        public void resultci(double a5)
        {
            Double cm= a5*16.387064;
            Double ml= a5*16.387064;
            Double l= a5*0.016387064;
            Double m = a5/61023.7441;
            Double ft = a5/1728;
            
            jTextArea1.setText("Cm Cube\t = "+cm+"\nLitre\t = "+l+"\nMilli Litre\t = "+ml+"\nCubic Meter\t = "+m+"\nCubic Foot\t = "+ft);
           }  
        public void resultcf(double a5)
        {
            Double cm= a5*28316.846592;
            Double ml= a5*28316.846592;
            Double l= a5*28.316846592;
            Double in = a5*1728;
            Double m = a5*0.0283168466;
            
            jTextArea1.setText("Cm Cube\t = "+cm+"\nLitre\t = "+l+"\nMilli Litre\t = "+ml+"\nCubic Inch\t = "+in+"\nCubic Meter\t = "+m);
           }  
        // until this line ;
        
        public void resultmps(double a6)
        {
            Double kh=a6*0.06;
            Double mh=a6*2.2369362921;
            Double kn=a6*1.94384449;
            Double ft=a6*3.280839;
            
            jTextArea1.setText("Kmph\t = "+kh+"\nmph\t = "+mh+"\nknot\t = "+kn+"\nft/s\t = "+ft);
        }
        public void resultkmph(double a6)
        {
            Double mps=a6*0.2777777;
            Double mh=a6*0.62137119;
            Double kn=a6*0.5399568;
            Double ft=a6*0.911344415;
            
            jTextArea1.setText("m/s\t = "+mps+"\nmph\t = "+mh+"\nknot\t = "+kn+"\nft/s\t = "+ft);
        }
        public void resultmph(double a6)
        {
            Double kh=a6*1.6093;
            Double mps=a6*0.44704;
            Double kn=a6*0.8689762;
            Double ft=a6*1.46666666;
            
            jTextArea1.setText("Kmph\t = "+kh+"\nm/s\t = "+mps+"\nknot\t = "+kn+"\nft/s\t = "+ft);
        }
        public void resultkn(double a6)
        {
            Double kh=a6*1.852;
            Double mh=a6*1.15077944;
            Double mps=a6*0.51444444;
            Double ft=a6*1.6878098;
            
            jTextArea1.setText("Kmph\t = "+kh+"\nmph\t = "+mh+"\nm/s\t = "+mps+"\nft/s\t = "+ft);
        }
        public void resultfs(double a6)
        {
            Double mps=a6*0.3048;
            Double mh=a6*0.6818181818;
            Double kh=a6*1.0972;
            Double kn=a6*0.5924838013;
            
            jTextArea1.setText("Kmph\t = "+kh+"\nmph\t = "+mh+"\nm/s\t = "+mps+"\nknot/s\t = "+kn);
        }
        // untill this line
        
        public void resultkl(double a7)
        {
            Double cl=a7-273;
            Double fh=9/5*(a7 - 273) + 32;
            jTextArea1.setText("Celsius\t = "+cl+"\nFahrenheit\t = "+fh);
                    
        }
        public void resultcl(double a7)
        {
            Double kl=a7+273;
            Double fh=9/5*a7 + 32;
            jTextArea1.setText("Kelvin\t = "+kl+"\nFahrenheit\t = "+fh);
        }
        public void resultfh(double a7)
        {
            Double kl=5/9 *(a7 - 32) + 273;
            Double cl=(a7-32)*5/9;
            jTextArea1.setText("Kelvin\t = "+kl+"\nCelsius\t = "+cl);
        }
        
        
        
        public void theQuery(String query) throws SQLException
        {
            Connection con = null;
            Statement st = null;
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/converter","root","");
                st = con.createStatement();
                st.executeUpdate(query);
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
        
       
        
        
        
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
            java.util.logging.Logger.getLogger(convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
