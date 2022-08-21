package com.epam.rd.autotasks.triangle;

class Triangle {
    Point a;
    Point b;
    Point c;

    double ax, ay, bx, by, cx, cy;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        ax = a.getX();
        ay = a.getY();
        bx = b.getX();
        by = b.getY();
        cx = c.getX();
        cy = c.getY();
        if (this.area() == 0) {
            throw new RuntimeException();
        }
    }

    public double area() {
        double area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2;
        return Math.abs(area);
    }

    public Point centroid(){
        return new Point(((ax + bx + cx) / 3), ((ay + by + cy) / 3));
    }

}
