package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

public class Rectangle extends Square implements Drawable {
    private double height;

    public Rectangle(Point upperLeft, double width, double height) {
        super(upperLeft, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g2) {
        int x1 = (int) Math.round(this.getUpperLeft().getX());
        int y1 = (int) Math.round(this.getUpperLeft().getY());
        int intWidth = (int) Math.round(this.getWidth());
        int intHeight = (int) Math.round(height);
        g2.drawLine(x1, y1, x1 + intWidth, y1);
        g2.drawLine(x1, y1, x1, y1 + intHeight);
        g2.drawLine(x1 + intWidth, y1, x1 + intWidth, y1 + intHeight);
        g2.drawLine(x1, y1 + intHeight, x1 + intWidth, y1 + intHeight);
    }

}
