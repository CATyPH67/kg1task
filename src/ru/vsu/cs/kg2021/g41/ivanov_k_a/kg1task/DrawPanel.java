package ru.vsu.cs.kg2021.g41.ivanov_k_a.kg1task;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    public DrawPanel() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Color prevColor = g2.getColor();

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 450, 1000, 50);

        GradientPaint gradient = new GradientPaint(
            0f, 0f, new Color(242, 158, 46, 255),
            1000f, 0f, new Color(233, 81, 44, 255)
        );
        g2.setPaint(gradient);
        g2.fillRect(0, 0, 1000, 450);

        gradient = new GradientPaint(
            0f, 0f, new Color(18, 62, 87, 255),
            1000f, 0f, new Color(1, 141, 142, 255)
        );
        g2.setPaint(gradient);
        g2.fillRect(0, 500, 1000, 300);

        int y = 450;
        int yReverse = 502;
        int count = 2;

        Color reverseBuildColor = new Color(4, 51, 57);

        Random r = new Random();

        while (count > -1) {
            Color buildColor = new Color(64 * count, 64 * count, 64 * count);
            int x = 0;
            int gap = r.nextInt(11);
            x += gap;
            int width = 0;

            while (x + width < 1000) {
                gap = r.nextInt(11);
                width = r.nextInt(101) + 20;
                int height = r.nextInt(101) + 100 + 40 * count;
                int keyBuild = r.nextInt(4);
                if (count == 0) {
                    switch (keyBuild) {
                        case 0: {
                            drawBuild1(x, y, width, height, g2, buildColor);
                            drawReverseBuild1(x, yReverse, width, height, g2, reverseBuildColor);
                            break;
                        }

                        case 1: {
                            drawBuild2(x, y, width, height, g2, buildColor);
                            drawReverseBuild2(x, yReverse, width, height, g2, reverseBuildColor);
                            break;
                        }

                        case 2: {
                            drawBuild3(x, y, width, height, g2, buildColor);
                            drawReverseBuild3(x, yReverse, width, height, g2, reverseBuildColor);
                            break;
                        }

                        case 3: {
                            drawBuild4(x, y, width, height, g2, buildColor);
                            drawReverseBuild4(x, yReverse, width, height, g2, reverseBuildColor);
                            break;
                        }

                        default:
                            break;
                    }
                } else {
                    switch (keyBuild) {
                        case 0: {
                            drawBuild1(x, y, width, height, g2, buildColor);
                            break;
                        }

                        case 1: {
                            drawBuild2(x, y, width, height, g2, buildColor);
                            break;
                        }

                        case 2: {
                            drawBuild3(x, y, width, height, g2, buildColor);
                            break;
                        }

                        case 3: {
                            drawBuild4(x, y, width, height, g2, buildColor);
                            break;
                        }

                        default:
                            break;
                    }
                }
                x += gap + width;
            }
            count--;
        }


        g2.setColor(prevColor);
    }

    public static void drawBuild1(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) Math.ceil(height * 0.8);
        int widthSecondFloor = (int) Math.ceil(width * 0.6);
        int heightSecondFloor = (int) Math.ceil(height * 0.15);
        int heightThirdFloor = (int) Math.ceil(height * 0.05);
        int widthThirdFloor = (int) Math.ceil(width * 0.2);

        g.fillRect(x, y - heightFirstFloor, width, heightFirstFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2, y - heightFirstFloor - heightSecondFloor, widthSecondFloor, heightSecondFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2, y - height, widthThirdFloor, heightThirdFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2 + widthSecondFloor - widthThirdFloor, y - height, widthThirdFloor, heightThirdFloor);

        g.setColor(prevColor);
    }

    public static void drawReverseBuild1(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) Math.ceil(height * 0.8);
        int widthSecondFloor = (int) Math.ceil(width * 0.6);
        int heightSecondFloor = (int) Math.ceil(height * 0.15);
        int heightThirdFloor = (int) Math.ceil(height * 0.05);
        int widthThirdFloor = (int) Math.ceil(width * 0.2);

        g.fillRect(x, y, width, heightFirstFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2, y + heightFirstFloor, widthSecondFloor, heightSecondFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2, y + height - heightThirdFloor, widthThirdFloor, heightThirdFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2 + widthSecondFloor - widthThirdFloor, y + height - heightThirdFloor, widthThirdFloor, heightThirdFloor);

        g.setColor(prevColor);
    }

    public static void drawBuild2(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) (height * 0.8);

        g.fillRect(x, y - heightFirstFloor, width, heightFirstFloor);
        g.fillPolygon(new int[] {x, x, x + width}, new int[] {y - heightFirstFloor, y - height, y - heightFirstFloor}, 3);

        g.setColor(prevColor);
    }

    public static void drawReverseBuild2(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) (height * 0.8);

        g.fillRect(x, y, width, heightFirstFloor);
        g.fillPolygon(new int[] {x, x, x + width}, new int[] {y + heightFirstFloor, y + height, y + heightFirstFloor}, 3);

        g.setColor(prevColor);
    }

    public static void drawBuild3(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) (height * 0.8);

        g.fillRect(x, y - heightFirstFloor, width, heightFirstFloor);
        g.fillPolygon(new int[] {x, x + width, x + width}, new int[] {y - heightFirstFloor, y - height, y - heightFirstFloor}, 3);

        g.setColor(prevColor);
    }

    public static void drawReverseBuild3(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) (height * 0.8);

        g.fillRect(x, y, width, heightFirstFloor);
        g.fillPolygon(new int[] {x, x + width, x + width}, new int[] {y + heightFirstFloor, y + height, y + heightFirstFloor}, 3);

        g.setColor(prevColor);
    }

    public static void drawBuild4(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) Math.ceil(height * 0.5);
        int widthSecondFloor = (int) Math.ceil(width * 0.7);
        int heightSecondFloor = (int) Math.ceil(height * 0.3);
        int widthThirdFloor = (int) Math.ceil(width * 0.5);
        int heightThirdFloor = (int) Math.ceil(height * 0.2);

        g.fillRect(x, y - heightFirstFloor, width, heightFirstFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2, y - heightFirstFloor - heightSecondFloor, widthSecondFloor, heightSecondFloor);
        g.fillRect(x + (width - widthThirdFloor) / 2, y - height, widthThirdFloor, heightThirdFloor);

        g.setColor(prevColor);
    }

    public static void drawReverseBuild4(int x, int y, int width, int height, Graphics2D g, Color c) {
        Color prevColor = g.getColor();
        g.setColor(c);

        int heightFirstFloor = (int) Math.ceil(height * 0.5);
        int widthSecondFloor = (int) Math.ceil(width * 0.7);
        int heightSecondFloor = (int) Math.ceil(height * 0.3);
        int widthThirdFloor = (int) Math.ceil(width * 0.5);
        int heightThirdFloor = (int) Math.ceil(height * 0.2);

        g.fillRect(x, y, width, heightFirstFloor);
        g.fillRect(x + (width - widthSecondFloor) / 2, y + heightFirstFloor, widthSecondFloor, heightSecondFloor);
        g.fillRect(x + (width - widthThirdFloor) / 2, y + heightFirstFloor + heightThirdFloor, widthThirdFloor, heightThirdFloor);

        g.setColor(prevColor);
    }
}
