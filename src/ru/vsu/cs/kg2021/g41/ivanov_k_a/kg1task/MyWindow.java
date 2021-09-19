package ru.vsu.cs.kg2021.g41.ivanov_k_a.kg1task;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private final DrawPanel dp;

    public MyWindow() throws HeadlessException {
        dp = new DrawPanel();
        add(dp);
    }
}
