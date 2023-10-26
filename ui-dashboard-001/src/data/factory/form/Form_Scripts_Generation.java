package data.factory.form;

import data.factory.swing.ScrollBar;
import data.factory.swing.ToggleButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class Form_Scripts_Generation extends javax.swing.JLayeredPane {

    private javax.swing.JLabel add_row_button;
    private javax.swing.JLabel data_source_panel_label;
    private data.factory.swing.Table data_sources_table;
    private data.factory.swing.PanelBorder environments_panel;
    private javax.swing.JLabel environments_panel_label;
    private data.factory.swing.PanelBorder layers_panel;
    private javax.swing.JLabel layers_panel_label;
    private data.factory.component.PanelEnvironments panelEnvironments;
    private data.factory.component.PanelLayers panelLayers;
    private data.factory.component.PanelParametters panelParametters;
    private javax.swing.JPanel panel_inputs1;
    private data.factory.swing.PanelBorder panel_inputs2;
    private data.factory.swing.PanelBorder parametters_panel;
    private javax.swing.JLabel parametters_panel_label;
    private javax.swing.JLabel remove_row_button;
    private javax.swing.JScrollPane spTable;
    private data.factory.swing.Button submit_button;
     
    public Form_Scripts_Generation() {
        init();
    }

    private void init(){

        panel_inputs1 = new javax.swing.JPanel();
        parametters_panel = new data.factory.swing.PanelBorder();
        parametters_panel_label = new javax.swing.JLabel();
        panelParametters = new data.factory.component.PanelParametters();
        environments_panel = new data.factory.swing.PanelBorder();
        environments_panel_label = new javax.swing.JLabel();
        panelEnvironments = new data.factory.component.PanelEnvironments();
        layers_panel = new data.factory.swing.PanelBorder();
        layers_panel_label = new javax.swing.JLabel();
        panelLayers = new data.factory.component.PanelLayers();
        panel_inputs2 = new data.factory.swing.PanelBorder();
        spTable = new javax.swing.JScrollPane();
        data_sources_table = new data.factory.swing.Table();
        data_source_panel_label = new javax.swing.JLabel();
        submit_button = new data.factory.swing.Button();
        add_row_button = new javax.swing.JLabel();
        remove_row_button = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(915, 592));

        panel_inputs1.setOpaque(false);
        panel_inputs1.setLayout(new java.awt.GridLayout(0, 3, 10, 0));

        parametters_panel.setBackground(new java.awt.Color(255, 255, 255));
        parametters_panel.setPreferredSize(new java.awt.Dimension(240, 215));
        parametters_panel.setLayout(new java.awt.FlowLayout());

        parametters_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        parametters_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        parametters_panel_label.setText("Input UC Parametters");
        parametters_panel.add(parametters_panel_label);

        panelParametters.setAlignmentX(0.0F);
        parametters_panel.add(panelParametters);

        panel_inputs1.add(parametters_panel);

        environments_panel.setBackground(new java.awt.Color(255, 255, 255));
        environments_panel.setLayout(new java.awt.FlowLayout());

        environments_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        environments_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        environments_panel_label.setText("Select target Environment(s)");
        environments_panel.add(environments_panel_label);
        environments_panel.add(panelEnvironments);

        panel_inputs1.add(environments_panel);

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

        panel_inputs2.setBackground(new java.awt.Color(255, 255, 255));

        spTable.setBorder(null);
        spTable.setPreferredSize(new java.awt.Dimension(600, 400));

        data_sources_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Source", "Trigram", "Apcode", "Data Family"
            }
        ));
        spTable.setViewportView(data_sources_table);
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        data_sources_table.addRow(new Object[]{"", "", "", ""});
        data_source_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        data_source_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        data_source_panel_label.setText("Input Data Source(s) Details");

        submit_button.setText("Submit");
        
        add_row_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/factory/icon/add.png"))); // NOI18N
        add_row_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_row_buttonMouseClicked(evt);
            }
        });

        remove_row_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/factory/icon/minus.png"))); // NOI18N
        remove_row_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_row_buttonMouseClicked(evt);
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
                        .addComponent(data_source_panel_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_inputs2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(remove_row_button, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add_row_button, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_inputs2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))))
        );
        panel_inputs2Layout.setVerticalGroup(
            panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputs2Layout.createSequentialGroup()
                .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(add_row_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_row_button)
                        .addGap(57, 57, 57)
                        .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(data_source_panel_label)
                        .addGap(18, 18, 18)
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_inputs1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_inputs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_inputs1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panel_inputs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_inputs1 = new javax.swing.JPanel();
        parametters_panel = new data.factory.swing.PanelBorder();
        parametters_panel_label = new javax.swing.JLabel();
        panelParametters = new data.factory.component.PanelParametters();
        environments_panel = new data.factory.swing.PanelBorder();
        environments_panel_label = new javax.swing.JLabel();
        panelEnvironments = new data.factory.component.PanelEnvironments();
        layers_panel = new data.factory.swing.PanelBorder();
        layers_panel_label = new javax.swing.JLabel();
        panelLayers = new data.factory.component.PanelLayers();
        panel_inputs2 = new data.factory.swing.PanelBorder();
        spTable = new javax.swing.JScrollPane();
        data_sources_table = new data.factory.swing.Table();
        data_source_panel_label = new javax.swing.JLabel();
        submit_button = new data.factory.swing.Button();
        add_row_button = new javax.swing.JLabel();
        remove_row_button = new javax.swing.JLabel();
        panelLoading1 = new data.factory.component.PanelLoading();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(915, 592));

        panel_inputs1.setOpaque(false);
        panel_inputs1.setLayout(new java.awt.GridLayout(0, 3, 10, 0));

        parametters_panel.setBackground(new java.awt.Color(255, 255, 255));
        parametters_panel.setPreferredSize(new java.awt.Dimension(240, 215));
        parametters_panel.setLayout(new java.awt.FlowLayout());

        parametters_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        parametters_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        parametters_panel_label.setText("Input UC Parametters");
        parametters_panel.add(parametters_panel_label);

        panelParametters.setAlignmentX(0.0F);
        parametters_panel.add(panelParametters);

        panel_inputs1.add(parametters_panel);

        environments_panel.setBackground(new java.awt.Color(255, 255, 255));
        environments_panel.setLayout(new java.awt.FlowLayout());

        environments_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        environments_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        environments_panel_label.setText("Select target Environment(s)");
        environments_panel.add(environments_panel_label);
        environments_panel.add(panelEnvironments);

        panel_inputs1.add(environments_panel);

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

        panel_inputs2.setBackground(new java.awt.Color(255, 255, 255));

        spTable.setBorder(null);
        spTable.setPreferredSize(new java.awt.Dimension(600, 400));

        data_sources_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Source", "Trigram", "Apcode", "Data Family"
            }
        ));
        spTable.setViewportView(data_sources_table);

        data_source_panel_label.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        data_source_panel_label.setForeground(new java.awt.Color(127, 127, 127));
        data_source_panel_label.setText("Input Data Source(s) Details");

        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        add_row_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/add.png"))); // NOI18N
        add_row_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_row_buttonMouseClicked(evt);
            }
        });

        remove_row_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/minus.png"))); // NOI18N
        remove_row_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_row_buttonMouseClicked(evt);
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
                        .addComponent(data_source_panel_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_inputs2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(remove_row_button, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add_row_button, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_inputs2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))))
        );
        panel_inputs2Layout.setVerticalGroup(
            panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputs2Layout.createSequentialGroup()
                .addGroup(panel_inputs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(add_row_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_row_button)
                        .addGap(57, 57, 57)
                        .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_inputs2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(data_source_panel_label)
                        .addGap(18, 18, 18)
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setLayer(panel_inputs1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(panel_inputs2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(panelLoading1, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_inputs1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_inputs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 56, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(193, Short.MAX_VALUE)
                    .addComponent(panelLoading1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_inputs1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panel_inputs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(panelLoading1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(103, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_row_buttonMouseClicked(java.awt.event.MouseEvent evt) {                                            
        data_sources_table.addRow(new Object[]{"", "", "", ""});
    }

    private void remove_row_buttonMouseClicked(java.awt.event.MouseEvent evt) {                                               
        data_sources_table.removeRow();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_row_button;
    private javax.swing.JLabel data_source_panel_label;
    private data.factory.swing.Table data_sources_table;
    private data.factory.swing.PanelBorder environments_panel;
    private javax.swing.JLabel environments_panel_label;
    private data.factory.swing.PanelBorder layers_panel;
    private javax.swing.JLabel layers_panel_label;
    private data.factory.component.PanelEnvironments panelEnvironments;
    private data.factory.component.PanelLayers panelLayers;
    private data.factory.component.PanelLoading panelLoading1;
    private data.factory.component.PanelParametters panelParametters;
    private javax.swing.JPanel panel_inputs1;
    private data.factory.swing.PanelBorder panel_inputs2;
    private data.factory.swing.PanelBorder parametters_panel;
    private javax.swing.JLabel parametters_panel_label;
    private javax.swing.JLabel remove_row_button;
    private javax.swing.JScrollPane spTable;
    private data.factory.swing.Button submit_button;
    // End of variables declaration//GEN-END:variables
}
