package co.bird.android.model;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
/* loaded from: classes4.dex */
public abstract class Geometry implements Serializable {
    public static final String[] ALLTYPES = {"", "POINT", "LINESTRING", "POLYGON", "MULTIPOINT", "MULTILINESTRING", "MULTIPOLYGON", GeometryCollection.GeoCollID};
    public static final int GEOMETRYCOLLECTION = 7;
    public static final int LINEARRING = 0;
    public static final int LINESTRING = 2;
    public static final int MULTILINESTRING = 5;
    public static final int MULTIPOINT = 4;
    public static final int MULTIPOLYGON = 6;
    public static final int POINT = 1;
    public static final int POLYGON = 3;
    public static final int UNKNOWN_SRID = 0;
    private static final long serialVersionUID = 256;
    public int dimension;
    public boolean haveMeasure = false;
    public int srid = 0;
    public final int type;

    public Geometry(int i) {
        this.type = i;
    }

    public static String getTypeString(int i) {
        if (i >= 0 && i <= 7) {
            return ALLTYPES[i];
        }
        throw new IllegalArgumentException("Unknown Geometry type" + i);
    }

    public static int parseSRID(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public boolean checkConsistency() {
        int i;
        int i2 = this.dimension;
        return i2 >= 2 && i2 <= 3 && (i = this.type) >= 0 && i <= 7;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Geometry) && equals((Geometry) obj);
    }

    public abstract boolean equalsintern(Geometry geometry);

    public int getDimension() {
        return this.dimension;
    }

    public abstract Point getFirstPoint();

    public abstract Point getLastPoint();

    public abstract Point getPoint(int i);

    public int getSrid() {
        return this.srid;
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        StringBuilder sb = new StringBuilder();
        mediumWKT(sb);
        return sb.toString();
    }

    public int hashCode() {
        return this.dimension | (this.type * 4) | (this.srid * 32);
    }

    public String initSRID(String str) {
        String trim = str.trim();
        if (trim.startsWith(GeometryBuilder.SRIDPREFIX)) {
            int indexOf = trim.indexOf(59, 5);
            if (indexOf != -1) {
                this.srid = Integer.parseInt(trim.substring(5, indexOf));
                return trim.substring(indexOf + 1).trim();
            }
            throw new IllegalArgumentException("Error parsing Geometry - SRID not delimited with ';' ");
        }
        return trim;
    }

    public abstract void innerWKT(StringBuilder sb);

    public boolean isMeasured() {
        return this.haveMeasure;
    }

    public void mediumWKT(StringBuilder sb) {
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        innerWKT(sb);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public abstract int numPoints();

    public void outerWKT(StringBuilder sb, boolean z) {
        sb.append(getTypeString());
        if (z && this.haveMeasure && this.dimension == 2) {
            sb.append('M');
        }
        mediumWKT(sb);
    }

    public void setSrid(int i) {
        this.srid = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.srid != 0) {
            sb.append(GeometryBuilder.SRIDPREFIX);
            sb.append(this.srid);
            sb.append(';');
        }
        outerWKT(sb, true);
        return sb.toString();
    }

    public boolean equals(Geometry geometry) {
        return geometry != null && this.dimension == geometry.dimension && this.type == geometry.type && this.srid == geometry.srid && this.haveMeasure == geometry.haveMeasure && geometry.getClass().equals(getClass()) && equalsintern(geometry);
    }

    public String getTypeString() {
        return getTypeString(this.type);
    }

    public final void outerWKT(StringBuilder sb) {
        outerWKT(sb, true);
    }
}
