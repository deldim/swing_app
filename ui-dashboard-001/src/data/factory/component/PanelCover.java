package data.factory.component;

import data.factory.swing.ButtonOutLine;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelCover extends javax.swing.JPanel {

    private ActionListener event;
    private MigLayout layout;
    private JLabel title;
    private JLabel description;

    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap,fill", "", "[]push[]10[]25[]push");
        setLayout(layout);
        init();

    }

    private void init() {
        JLabel bnp_icon = new javax.swing.JLabel();
        bnp_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/factory/icon/bnp.png"))); // NOI18N
        bnp_icon.setText("");
        add(bnp_icon);
        title = new JLabel("Access Management Tool");
        title.setFont(new Font("sansserif", 1, 20));
        title.setForeground(new Color(245, 245, 245));
        add(title,"center");
        description = new JLabel("Data Factory homemade solution");
        description.setForeground(new Color(245, 245, 245));
        add(description,"center");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gra = new GradientPaint(0, 0, new Color(50, 156, 148), 0, getHeight(), new Color(0, 187, 160));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    public void addEvent(ActionListener event) {
        this.event = event;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
