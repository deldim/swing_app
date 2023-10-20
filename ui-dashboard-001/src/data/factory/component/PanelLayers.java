/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package data.factory.component;

import data.factory.swing.ScrollBar;
import data.factory.swing.Spinner;
import data.factory.swing.Table;
import data.factory.swing.ToggleButton;
import data.factory.swing.ToggleListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author macintosh
 */
public class PanelLayers extends javax.swing.JPanel implements ChangeListener,ToggleListener {

    @Override
    public void onSelected(boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void onAnimated(float animated) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private javax.swing.JLabel meta_data_label;
    private javax.swing.JLabel reference_label;
    private javax.swing.JLabel data_source_label;
    private javax.swing.JLabel refined_label;
    private javax.swing.JLabel optimized_label;
    private ToggleButton meta_data_toggle;
    private ToggleButton reference_toggle;
    private ToggleButton data_source_toggle;
    private ToggleButton refined_toggle;
    private ToggleButton optimized_toggle;
    private Spinner optimezed_count_spinner;
    private JScrollPane spTable;
    private Table business_uc_table;
    private ArrayList spinner_tmp;

    /**
     * Creates new form NewJPanel
     */
    public PanelLayers() {
           initComponents();
           init();
          
    }
    
    private void init(){
        setBackground(Color.WHITE);
        setLayout(new java.awt.GridBagLayout());
        meta_data_label = new javax.swing.JLabel();
        meta_data_label.setFont(new java.awt.Font("sansserif", 0, 14));
        meta_data_label.setForeground(new java.awt.Color(127, 127, 127));
        meta_data_label.setText("Meta Data");

        reference_label = new javax.swing.JLabel();
        reference_label.setFont(new java.awt.Font("sansserif", 0, 14));
        reference_label.setForeground(new java.awt.Color(127, 127, 127));
        reference_label.setText("Reference");

        data_source_label = new javax.swing.JLabel();
        data_source_label.setFont(new java.awt.Font("sansserif", 0, 14));
        data_source_label.setForeground(new java.awt.Color(127, 127, 127));
        data_source_label.setText("Data Source");

        refined_label = new javax.swing.JLabel();
        refined_label.setFont(new java.awt.Font("sansserif", 0, 14));
        refined_label.setForeground(new java.awt.Color(127, 127, 127));
        refined_label.setText("Refined");

        optimized_label = new javax.swing.JLabel();
        optimized_label.setFont(new java.awt.Font("sansserif", 0, 14));
        optimized_label.setForeground(new java.awt.Color(127, 127, 127));
        optimized_label.setText("Optimized");

        meta_data_toggle = new ToggleButton();
        reference_toggle = new ToggleButton();
        data_source_toggle = new ToggleButton();
        refined_toggle = new ToggleButton();
        optimized_toggle = new ToggleButton();
        
        optimezed_count_spinner= new Spinner();
        optimezed_count_spinner.setEnabled(false);
        optimezed_count_spinner.setLabelText("");
        optimezed_count_spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

       
        business_uc_table=new Table();
        business_uc_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Business UC"
            }
        ));
        spTable = new JScrollPane();
        spTable.setBorder(null);
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel container = new JPanel(new BorderLayout());
        spTable.setPreferredSize(new Dimension(100, 120));
        container.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, container);
        spTable.setViewportView(business_uc_table);
        spTable.setVisible(false);
        JPanel table_container = new JPanel();
        table_container.setBackground(Color.WHITE);
        table_container.add(spTable);
        //container.add(header, BorderLayout.NORTH);
        //container.add(business_uc_table, BorderLayout.CENTER);
        spinner_tmp = new ArrayList();
        spinner_tmp.add(1);
        
        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(meta_data_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(reference_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(data_source_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(refined_label, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(optimized_label, gridBagConstraints);
        
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(meta_data_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(reference_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(data_source_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(refined_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(optimized_toggle, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        add(optimezed_count_spinner, gridBagConstraints);
        
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth=1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        add(table_container, gridBagConstraints);

       
        optimezed_count_spinner.addChangeListener(this);
        optimized_toggle.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                boolean selected = optimized_toggle.isSelected();
                if (!selected) {
                    optimezed_count_spinner.setEnabled(true);
                }else{
                    optimezed_count_spinner.setValue(1);
                    optimezed_count_spinner.setEnabled(false);
                    DefaultTableModel dtm = (DefaultTableModel) business_uc_table.getModel();
                    dtm.setRowCount(0);
                    
                    spTable.setVisible(false);
                    revalidate();
                }  
            }
        });
    }
    
    public void stateChanged(ChangeEvent e) {
        int current = (Integer) optimezed_count_spinner.getValue();
        System.out.println("current"+current);
        int old=(int)spinner_tmp.get(spinner_tmp.size()-1);
        System.out.println("old"+old);
        if (current>old) {
            business_uc_table.addRow(new Object[]{""});
            if(old==1 && current==2){
                business_uc_table.addRow(new Object[]{""});
                spTable.setVisible(true);
                revalidate();
            }
        }else{
            business_uc_table.removeRow();
            if(old==2 && current==1){
                DefaultTableModel dtm = (DefaultTableModel) business_uc_table.getModel();
                dtm.setRowCount(0);
                spTable.setVisible(false);
                revalidate();
            }
        }

        spinner_tmp.add(current);

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
