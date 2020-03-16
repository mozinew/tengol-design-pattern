package com.tengol.design.pattern.mooc.structural.decorator.d1;

import javax.swing.*;
import java.awt.*;

/**
 * OriginalMorrigan
 *
 * @author dongrui
 * @date 2020/2/25 22:27
 */
public class OriginalMorrigan extends JFrame implements Morrigan {
    private static final long serialVersionUID = 1L;

    private String t = "Morrigan0.jpg";

    public OriginalMorrigan() {
        super("《恶魔战士》中的莫莉卡·安斯卡");
    }

    public void setImage(String t) {
        this.t = t;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel label = new JLabel(new ImageIcon("image/" + t));
        this.add(label);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
