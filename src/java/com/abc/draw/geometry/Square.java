package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

public class Square implements Drawable {
    private Point upperLeft;
    private double width;

    public Square(Point upperLeft, double width) {
        this.upperLeft = upperLeft;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D g2) {
        int x1 = (int) Math.round(upperLeft.getX());
        int y1 = (int) Math.round(upperLeft.getY());
        int intWidth = (int) Math.round(this.width);
        g2.drawLine(x1, y1, x1 + intWidth, y1);
        g2.drawLine(x1, y1, x1, y1 + intWidth);
        g2.drawLine(x1 + intWidth, y1, x1 + intWidth, y1 + intWidth);
        g2.drawLine(x1, y1 + intWidth, x1 + intWidth, y1 + intWidth);

    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
