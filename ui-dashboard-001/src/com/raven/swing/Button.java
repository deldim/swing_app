package com.raven.swing;

import com.raven.model.StatusType;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class Button extends JButton {

    
    public Button() {
        setForeground(new Color(250, 250, 250));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g;
        g = new GradientPaint(0, 0, new Color(50, 156, 148), 0, getHeight(), new Color(0, 187, 160));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);     
        super.paintComponent(grphcs);
    }

}
