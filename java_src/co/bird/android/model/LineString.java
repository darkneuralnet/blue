package co.bird.android.model;

import java.sql.SQLException;
/* loaded from: classes4.dex */
public class LineString extends PointComposedGeom {
    private static final long serialVersionUID = 256;
    double len;

    public LineString() {
        super(2);
        this.len = -1.0d;
    }

    public LineString concat(LineString lineString) {
        int i;
        Point[] points = getPoints();
        Point[] points2 = lineString.getPoints();
        int i2 = 0;
        if (getLastPoint() != null && !getLastPoint().equals(lineString.getFirstPoint())) {
            i = 0;
        } else {
            i = 1;
        }
        Point[] pointArr = new Point[(points.length + points2.length) - i];
        while (i2 < points.length) {
            pointArr[i2] = points[i2];
            i2++;
        }
        if (i == 0) {
            pointArr[i2] = lineString.getFirstPoint();
            i2++;
        }
        int i3 = 1;
        while (i3 < points2.length) {
            pointArr[i2] = points2[i3];
            i3++;
            i2++;
        }
        return new LineString(pointArr);
    }

    public double length() {
        double d = 0.0d;
        if (this.len < 0.0d) {
            Point[] points = getPoints();
            if (points != null && points.length >= 2) {
                for (int i = 1; i < points.length; i++) {
                    d += points[i - 1].distance(points[i]);
                }
                this.len = d;
            } else {
                this.len = 0.0d;
            }
        }
        return this.len;
    }

    public LineString reverse() {
        Point[] points = getPoints();
        int length = points.length;
        Point[] pointArr = new Point[length];
        int i = length - 1;
        int i2 = 0;
        while (i2 < length) {
            pointArr[i2] = points[i];
            i2++;
            i--;
        }
        return new LineString(pointArr);
    }

    public LineString(Point[] pointArr) {
        super(2, pointArr);
        this.len = -1.0d;
    }

    public LineString(String str) throws SQLException {
        super(2, str);
        this.len = -1.0d;
    }

    public LineString(String str, boolean z) throws SQLException {
        super(2, str, z);
        this.len = -1.0d;
    }
}
