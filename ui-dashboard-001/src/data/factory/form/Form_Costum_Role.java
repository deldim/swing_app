package data.factory.form;

import data.factory.swing.ScrollBar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Form_Costum_Role extends javax.swing.JLayeredPane {

    private javax.swing.JLabel add_row_button;
    private data.factory.swing.Table data_sources_table;
    private javax.swing.JLabel remove_row_button;
    private javax.swing.JScrollPane spTable;
     
    public Form_Costum_Role() {
        initComponents();
        init();
    }
    
    public void init(){
    JTextArea ta=new JTextArea(5,50);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
    JPanel p2=new JPanel();  
    JPanel p3=new JPanel();  
    tabbedPane1.setBounds(50,50,200,200);  
    tabbedPane1.add("visit",p2);  
    tabbedPane1.add("help",p3);  
    JTextArea tarea=new JTextArea("toto");
    spTable = new JScrollPane();
    spTable.setBorder(null);
    spTable.setVerticalScrollBar(new ScrollBar());
    spTable.getVerticalScrollBar().setBackground(Color.WHITE);
    spTable.getViewport().setBackground(Color.WHITE);
    spTable.setViewportView(tarea);
    tabbedPane1.setComponentAt(tabbedPane1.getTabCount() - 1, spTable); 
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel_inputs1 = new javax.swing.JPanel();
        panelBorder1 = new data.factory.swing.PanelBorder();
        parametters_panel = new data.factory.swing.PanelBorder();
        parametters_panel_label = new javax.swing.JLabel();
        panelRoleType1 = new data.factory.component.PanelRoleType();
        parametters_panel1 = new data.factory.swing.PanelBorder();
        parametters_panel_label1 = new javax.swing.JLabel();
        panelParametters1 = new data.factory.component.PanelParametters();
        layers_panel = new data.factory.swing.PanelBorder();
        layers_panel_label = new javax.swing.JLabel();
        panelLayers = new data.factory.component.PanelLayers();
        environments_panel = new data.factory.swing.PanelBorder();
        environments_panel_label = new javax.swing.JLabel();
        panelEnvironments = new data.factory.component.PanelEnvironments();
        panel_inputs2 = new data.factory.swing.PanelBorder();
        data_source_panel_label = new javax.swing.JLabel();
        submit_button = new data.factory.swing.Button();
        tabbedPane1 = new data.factory.swing.TabbedPane();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(915, 592));

        panel_inputs1.setOpaque(false);
        panel_inputs1.setLayout(new java.awt.GridLayout(0, 3, 10, 0));

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));
        panelBorder1.setMinimumSize(new java.awt.Dimension(305, 250));
        panelBorder1.setOpaque(false);
        java.awt.GridBagLayout panelBorder1Layout = new java.awt.GridBagLayout();
        panelBorder1Layout.columnWidths = new int[] {0};
        panelBorder1Layout.rowHeights = new int[] {0, 10, 0};
        panelBorder1.setLayout(panelBorder1Layout);

        parametters_panel.setBackground(new java.awt.Color(255, 255, 255));
        parametters_panel.setMinimumSize(new java.awt.Dimension(270, 100));
        parametters_panel.setPreferredSize(new java.awt.Dimension(260, 215));
        parametters_panel.setLayout(new java.awt.FlowLayout());

        parametters_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        parametters_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        parametters_panel_label.setText("Select Role Type");
        parametters_panel.add(parametters_panel_label);
        parametters_panel.add(panelRoleType1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelBorder1.add(parametters_panel, gridBagConstraints);

        parametters_panel1.setBackground(new java.awt.Color(255, 255, 255));
        parametters_panel1.setMinimumSize(new java.awt.Dimension(270, 130));
        parametters_panel1.setName(""); // NOI18N
        parametters_panel1.setPreferredSize(new java.awt.Dimension(240, 215));
        parametters_panel1.setLayout(new java.awt.FlowLayout());

        parametters_panel_label1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        parametters_panel_label1.setForeground(new java.awt.Color(127, 127, 127));
        parametters_panel_label1.setText("Input UC Parametters");
        parametters_panel1.add(parametters_panel_label1);

        panelParametters1.setAlignmentX(0.0F);
        parametters_panel1.add(panelParametters1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelBorder1.add(parametters_panel1, gridBagConstraints);

        panel_inputs1.add(panelBorder1);

        layers_panel.setBackground(new java.awt.Color(255, 255, 255));
        layers_panel.setPreferredSize(new java.awt.Dimension(240, 215));

        layers_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        layers_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        layers_panel_label.setText("Select Data Layer(s)");

        javax.swing.GroupLayout layers_panelLayout = new javax.swing.GroupLayout(layers_panel);
        layers_panel.setLayout(layers_panelLayout);
        layers_panelLayout.setHorizontalGroup(
            layers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layers_panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(layers_panel_label))
            .addGroup(layers_panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panelLayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layers_panelLayout.setVerticalGroup(
            layers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layers_panelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(layers_panel_label)
                .addGap(5, 5, 5)
                .addComponent(panelLayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_inputs1.add(layers_panel);

        environments_panel.setBackground(new java.awt.Color(255, 255, 255));
        environments_panel.setLayout(new java.awt.FlowLayout());

        environments_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        environments_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        environments_panel_label.setText("Select target Environment(s)");
        environments_panel.add(environments_panel_label);
        environments_panel.add(panelEnvironments);

        panel_inputs1.add(environments_panel);

        panel_inputs2.setBackground(new java.awt.Color(255, 255, 255));

        data_source_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        data_source_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        data_source_panel_label.setText("Input script(s)");

        submit_button.setText("Submit");
        submit_button.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                submit_buttonAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_inputs2Layout = new javax.swing.GroupLayout(panel_inputs2);
        panel_inputs2.setLayout(panel_inputs2Layout);
        panel_inputs2Layout.setHorizontalGroup(
            panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputs2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addComponent(data_source_panel_label)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inputs2Layout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addComponent(tabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(186, Short.MAX_VALUE)))
        );
        panel_inputs2Layout.setVerticalGroup(
            panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputs2Layout.createSequentialGroup()
                .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(data_source_panel_label)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inputs2Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(tabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        setLayer(panel_inputs1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(panel_inputs2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_inputs1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_inputs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_inputs1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_inputs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void submit_buttonAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_submit_buttonAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_submit_buttonAncestorAdded

    private void add_row_buttonMouseClicked(java.awt.event.MouseEvent evt) {                                            
        data_sources_table.addRow(new Object[]{"", "", "", ""});
    }

    private void remove_row_buttonMouseClicked(java.awt.event.MouseEvent evt) {                                               
        data_sources_table.removeRow();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data_source_panel_label;
    private data.factory.swing.PanelBorder environments_panel;
    private javax.swing.JLabel environments_panel_label;
    private data.factory.swing.PanelBorder layers_panel;
    private javax.swing.JLabel layers_panel_label;
    private data.factory.swing.PanelBorder panelBorder1;
    private data.factory.component.PanelEnvironments panelEnvironments;
    private data.factory.component.PanelLayers panelLayers;
    private data.factory.component.PanelParametters panelParametters1;
    private data.factory.component.PanelRoleType panelRoleType1;
    private javax.swing.JPanel panel_inputs1;
    private data.factory.swing.PanelBorder panel_inputs2;
    private data.factory.swing.PanelBorder parametters_panel;
    private data.factory.swing.PanelBorder parametters_panel1;
    private javax.swing.JLabel parametters_panel_label;
    private javax.swing.JLabel parametters_panel_label1;
    private data.factory.swing.Button submit_button;
    private data.factory.swing.TabbedPane tabbedPane1;
    // End of variables declaration//GEN-END:variables
}
