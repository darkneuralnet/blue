package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.SQLException;
import java.util.List;
/* loaded from: classes4.dex */
public class Point extends Geometry {
    public static final boolean CUTINTS = true;
    private static final long serialVersionUID = 256;

    /* renamed from: m */
    public double f66610m;
    @JsonProperty("longitude")
    @InterfaceC41208ft5("longitude")

    /* renamed from: x */
    public double f66611x;
    @JsonProperty("latitude")
    @InterfaceC41208ft5("latitude")

    /* renamed from: y */
    public double f66612y;

    /* renamed from: z */
    public double f66613z;

    public Point() {
        super(1);
        this.f66610m = 0.0d;
    }

    private static void cutint(StringBuilder sb) {
        int length = sb.length() - 2;
        if (sb.charAt(length + 1) == '0' && sb.charAt(length) == '.') {
            sb.setLength(length);
        }
    }

    public static boolean double_equals(double d, double d2) {
        return (Double.isNaN(d) && Double.isNaN(d2)) || d == d2;
    }

    private Point findClosestPointToLine(Point point, Point point2) {
        double d;
        double d2 = this.f66611x;
        double d3 = this.f66612y;
        double d4 = point.f66611x;
        double d5 = point.f66612y;
        double d6 = point2.f66611x;
        double d7 = point2.f66612y;
        double d8 = d6 - d4;
        double d9 = d7 - d5;
        double d10 = ((d2 - d4) * d8) + ((d3 - d5) * d9);
        double d11 = (d8 * d8) + (d9 * d9);
        if (d11 != 0.0d) {
            d = d10 / d11;
        } else {
            d = -1.0d;
        }
        if (d >= 0.0d) {
            if (d > 1.0d) {
                d5 = d7;
                d4 = d6;
            } else {
                d4 += d8 * d;
                d5 += d * d9;
            }
        }
        double d12 = d2 - d4;
        double d13 = d3 - d5;
        return new Point(d12, d13, (d12 * d12) + (d13 * d13));
    }

    @Override // co.bird.android.model.Geometry
    public boolean checkConsistency() {
        return super.checkConsistency() && (this.dimension == 3 || this.f66613z == 0.0d) && (this.haveMeasure || this.f66610m == 0.0d);
    }

    public double distance(Point point) {
        int i = this.dimension;
        if (i == point.dimension) {
            double d = this.f66611x - point.f66611x;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        double d2 = this.f66612y - point.f66612y;
                        double d3 = this.f66613z - point.f66613z;
                        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
                    }
                    int i2 = this.dimension;
                    throw new IllegalArgumentException("Illegal dimension of Point" + i2);
                }
                double d4 = this.f66612y - point.f66612y;
                return Math.sqrt((d * d) + (d4 * d4));
            }
            return Math.sqrt(d * d);
        }
        throw new IllegalArgumentException("Points have different dimensions!");
    }

    public final boolean equals(Point point) {
        boolean z;
        boolean z2;
        boolean double_equals = double_equals(this.f66611x, point.f66611x);
        boolean double_equals2 = double_equals(this.f66612y, point.f66612y);
        if (this.dimension != 2 && !double_equals(this.f66613z, point.f66613z)) {
            z = false;
        } else {
            z = true;
        }
        if (this.haveMeasure && !double_equals(this.f66610m, point.f66610m)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!double_equals || !double_equals2 || !z || !z2) {
            return false;
        }
        return true;
    }

    @Override // co.bird.android.model.Geometry
    public boolean equalsintern(Geometry geometry) {
        return equals((Point) geometry);
    }

    public Point findClosestPointInPolygons(List<Polygon> list) {
        Point point = null;
        double d = Double.MAX_VALUE;
        for (Polygon polygon : list) {
            for (int i = 0; i < polygon.numRings(); i++) {
                LinearRing ring = polygon.getRing(i);
                int length = ring.subgeoms.length;
                for (int i2 = 1; i2 < length; i2++) {
                    Point findClosestPointToLine = findClosestPointToLine(ring.getPoint(i2), ring.getPoint(i2 - 1));
                    double d2 = findClosestPointToLine.f66613z;
                    if (d > d2) {
                        point = findClosestPointToLine;
                        d = d2;
                    }
                }
            }
        }
        if (point != null) {
            return new Point(this.f66611x - point.f66611x, this.f66612y - point.f66612y);
        }
        return point;
    }

    @Override // co.bird.android.model.Geometry
    public Point getFirstPoint() {
        return this;
    }

    @Override // co.bird.android.model.Geometry
    public Point getLastPoint() {
        return this;
    }

    public double getM() {
        return this.f66610m;
    }

    @Override // co.bird.android.model.Geometry
    public Point getPoint(int i) {
        if (i == 0) {
            return this;
        }
        throw new ArrayIndexOutOfBoundsException("Point only has a single Point! " + i);
    }

    public double getX() {
        return this.f66611x;
    }

    public double getY() {
        return this.f66612y;
    }

    public double getZ() {
        return this.f66613z;
    }

    @Override // co.bird.android.model.Geometry
    public int hashCode() {
        return (((super.hashCode() ^ hashCode(this.f66611x)) ^ hashCode(this.f66612y)) ^ hashCode(this.f66613z)) ^ hashCode(this.f66610m);
    }

    @Override // co.bird.android.model.Geometry
    public void innerWKT(StringBuilder sb) {
        sb.append(this.f66611x);
        cutint(sb);
        sb.append(' ');
        sb.append(this.f66612y);
        cutint(sb);
        if (this.dimension == 3) {
            sb.append(' ');
            sb.append(this.f66613z);
            cutint(sb);
        }
        if (this.haveMeasure) {
            sb.append(' ');
            sb.append(this.f66610m);
            cutint(sb);
        }
    }

    @Override // co.bird.android.model.Geometry
    public int numPoints() {
        return 1;
    }

    public void setM(double d) {
        this.haveMeasure = true;
        this.f66610m = d;
    }

    public void setX(double d) {
        this.f66611x = d;
    }

    public void setY(double d) {
        this.f66612y = d;
    }

    public void setZ(double d) {
        this.f66613z = d;
    }

    public static int hashCode(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public void setX(int i) {
        this.f66611x = i;
    }

    public void setY(int i) {
        this.f66612y = i;
    }

    public void setZ(int i) {
        this.f66613z = i;
    }

    public Point(double d, double d2, double d3) {
        this();
        this.f66611x = d;
        this.f66612y = d2;
        this.f66613z = d3;
        this.dimension = 3;
    }

    public Point(double d, double d2) {
        this();
        this.f66611x = d;
        this.f66612y = d2;
        this.f66613z = 0.0d;
        this.dimension = 2;
    }

    public Point(String str) throws SQLException {
        this(str, false);
    }

    public Point(String str, boolean z) throws SQLException {
        this();
        String initSRID = initSRID(str);
        boolean z2 = true;
        if (initSRID.indexOf("POINTM") == 0) {
            initSRID = initSRID.substring(6).trim();
            z = true;
        } else if (initSRID.indexOf("POINT") == 0) {
            initSRID = initSRID.substring(5).trim();
        }
        List<String> list = GeometryTokenizer.tokenize(GeometryTokenizer.removeLeadingAndTrailingStrings(initSRID, "(", ")"), ' ');
        try {
            this.f66611x = Double.valueOf(list.get(0)).doubleValue();
            this.f66612y = Double.valueOf(list.get(1)).doubleValue();
            if (list.size() != 4) {
                z2 = false;
            }
            boolean z3 = z | z2;
            if ((list.size() == 3 && !z3) || list.size() == 4) {
                this.f66613z = Double.valueOf(list.get(2)).doubleValue();
                this.dimension = 3;
            } else {
                this.dimension = 2;
            }
            if (z3) {
                this.f66610m = Double.valueOf(list.get(this.dimension)).doubleValue();
            }
            this.haveMeasure = z3;
        } catch (NumberFormatException e) {
            throw new SQLException("Error parsing Point: " + e.toString());
        }
    }
}
