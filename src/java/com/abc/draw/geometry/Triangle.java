package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

public class Triangle implements Drawable{

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle (Point point, Point point2, Point point3) {
        this.p1 = point;
        this.p2 = point2;
        this.p3 = point3;
    }

    public Point getPoint() {
        return p1;
    }

    public Point getPoint2() {
        return p2;
    }

    public Point getPoint3() {
        return p3;
    }

    @Override
    public void draw(Graphics2D g2) {
        int x1 = (int) Math.round(p1.getX());
        int y1 = (int) Math.round(p1.getY());
        int x2 = (int) Math.round(p2.getX());
        int y2 = (int) Math.round(p2.getY());
        int x3 = (int) Math.round(p3.getX());
        int y3 = (int) Math.round(p3.getY());

        g2.drawLine(x1, y1, x2, y2);
        g2.drawLine(x1, y1, x3, y3);
        g2.drawLine(x3, y3, x2, y2);
    }

}
