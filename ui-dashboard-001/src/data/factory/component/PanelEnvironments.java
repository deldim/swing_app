/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package data.factory.component;


import data.factory.swing.ToggleButton;
import java.awt.Color;
import java.awt.GridBagConstraints;



/**
 *
 * @author macintosh
 */
public class PanelEnvironments extends javax.swing.JPanel {


    private javax.swing.JLabel dev_label;
    private javax.swing.JLabel ist_label;
    private javax.swing.JLabel uat_label;
    private javax.swing.JLabel ppd_label;
    private javax.swing.JLabel prd_label;
    private ToggleButton dev_toggle;
    private ToggleButton ist_toggle;
    private ToggleButton uat_toggle;
    private ToggleButton ppd_toggle;
    private ToggleButton prd_toggle;

    /**
     * Creates new form NewJPanel
     */
    public PanelEnvironments() {
           initComponents();
           init();
          
    }
    
    private void init(){
        setBackground(Color.WHITE);
        setLayout(new java.awt.GridBagLayout());
        dev_label = new javax.swing.JLabel();
        dev_label.setFont(new java.awt.Font("sansserif", 0, 14));
        dev_label.setForeground(new java.awt.Color(127, 127, 127));
        dev_label.setText("DEV");

        ist_label = new javax.swing.JLabel();
        ist_label.setFont(new java.awt.Font("sansserif", 0, 14));
        ist_label.setForeground(new java.awt.Color(127, 127, 127));
        ist_label.setText("IST");

        uat_label = new javax.swing.JLabel();
        uat_label.setFont(new java.awt.Font("sansserif", 0, 14));
        uat_label.setForeground(new java.awt.Color(127, 127, 127));
        uat_label.setText("UAT");

        ppd_label = new javax.swing.JLabel();
        ppd_label.setFont(new java.awt.Font("sansserif", 0, 14));
        ppd_label.setForeground(new java.awt.Color(127, 127, 127));
        ppd_label.setText("PPD");

        prd_label = new javax.swing.JLabel();
        prd_label.setFont(new java.awt.Font("sansserif", 0, 14));
        prd_label.setForeground(new java.awt.Color(127, 127, 127));
        prd_label.setText("PRD");

        dev_toggle = new ToggleButton();
        ist_toggle = new ToggleButton();
        uat_toggle = new ToggleButton();
        ppd_toggle = new ToggleButton();
        prd_toggle = new ToggleButton();
        
        
        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(dev_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(ist_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(uat_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(ppd_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(prd_label, gridBagConstraints);
        
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(dev_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(ist_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(uat_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(ppd_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(prd_toggle, gridBagConstraints);

    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
