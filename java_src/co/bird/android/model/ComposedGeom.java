package co.bird.android.model;

import ch.qos.logback.core.CoreConstants;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class ComposedGeom extends Geometry {
    public static final Geometry[] EMPTY = new Geometry[0];
    private static final long serialVersionUID = 256;
    int hashcode;
    boolean nohash;
    protected Geometry[] subgeoms;

    public ComposedGeom(int i) {
        super(i);
        this.subgeoms = EMPTY;
        this.nohash = true;
        this.hashcode = 0;
    }

    @Override // co.bird.android.model.Geometry
    public boolean checkConsistency() {
        if (!super.checkConsistency()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        int i = this.dimension;
        boolean z = this.haveMeasure;
        int i2 = this.srid;
        int i3 = 0;
        while (true) {
            Geometry[] geometryArr = this.subgeoms;
            if (i3 >= geometryArr.length) {
                return true;
            }
            Geometry geometry = geometryArr[i3];
            if (!geometry.checkConsistency() || geometry.dimension != i || geometry.haveMeasure != z || geometry.srid != i2) {
                break;
            }
            i3++;
        }
        return false;
    }

    public abstract Geometry[] createSubGeomArray(int i);

    public abstract Geometry createSubGeomInstance(String str, boolean z) throws SQLException;

    @Override // co.bird.android.model.Geometry
    public boolean equalsintern(Geometry geometry) {
        Geometry[] geometryArr;
        ComposedGeom composedGeom = (ComposedGeom) geometry;
        Geometry[] geometryArr2 = composedGeom.subgeoms;
        if (geometryArr2 == null && this.subgeoms == null) {
            return true;
        }
        if (geometryArr2 == null || (geometryArr = this.subgeoms) == null || geometryArr2.length != geometryArr.length) {
            return false;
        }
        if (geometryArr.length == 0) {
            return true;
        }
        int i = 0;
        while (true) {
            Geometry[] geometryArr3 = this.subgeoms;
            if (i >= geometryArr3.length) {
                return true;
            }
            if (!composedGeom.subgeoms[i].equalsintern(geometryArr3[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // co.bird.android.model.Geometry
    public Point getFirstPoint() {
        Geometry[] geometryArr = this.subgeoms;
        if (geometryArr != null && geometryArr.length != 0) {
            return geometryArr[0].getFirstPoint();
        }
        throw new ArrayIndexOutOfBoundsException("Empty Geometry has no Points!");
    }

    @Override // co.bird.android.model.Geometry
    public Point getLastPoint() {
        Geometry[] geometryArr = this.subgeoms;
        if (geometryArr != null && geometryArr.length != 0) {
            return geometryArr[geometryArr.length - 1].getLastPoint();
        }
        throw new ArrayIndexOutOfBoundsException("Empty Geometry has no Points!");
    }

    @Override // co.bird.android.model.Geometry
    public Point getPoint(int i) {
        if (i >= 0) {
            Geometry[] geometryArr = this.subgeoms;
            if (geometryArr != null && geometryArr.length != 0) {
                int i2 = 0;
                while (true) {
                    Geometry[] geometryArr2 = this.subgeoms;
                    if (i2 < geometryArr2.length) {
                        Geometry geometry = geometryArr2[i2];
                        int numPoints = geometry.numPoints();
                        if (i < numPoints) {
                            return geometry.getPoint(i);
                        }
                        i -= numPoints;
                        i2++;
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Index too large!");
                    }
                }
            } else {
                throw new ArrayIndexOutOfBoundsException("Empty Geometry has no Points!");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Negative index not allowed");
        }
    }

    public Geometry getSubGeometry(int i) {
        return this.subgeoms[i];
    }

    @Override // co.bird.android.model.Geometry
    public int hashCode() {
        if (this.nohash) {
            this.hashcode = super.hashCode() ^ this.subgeoms.hashCode();
            this.nohash = false;
        }
        return this.hashcode;
    }

    @Override // co.bird.android.model.Geometry
    public void innerWKT(StringBuilder sb) {
        this.subgeoms[0].mediumWKT(sb);
        for (int i = 1; i < this.subgeoms.length; i++) {
            sb.append(CoreConstants.COMMA_CHAR);
            this.subgeoms[i].mediumWKT(sb);
        }
    }

    public boolean isEmpty() {
        Geometry[] geometryArr = this.subgeoms;
        return geometryArr == null || geometryArr.length == 0;
    }

    public Iterator iterator() {
        return Arrays.asList(this.subgeoms).iterator();
    }

    public int numGeoms() {
        return this.subgeoms.length;
    }

    @Override // co.bird.android.model.Geometry
    public int numPoints() {
        Geometry[] geometryArr = this.subgeoms;
        int i = 0;
        if (geometryArr == null || geometryArr.length == 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            Geometry[] geometryArr2 = this.subgeoms;
            if (i < geometryArr2.length) {
                i2 += geometryArr2[i].numPoints();
                i++;
            } else {
                return i2;
            }
        }
    }

    @Override // co.bird.android.model.Geometry
    public void setSrid(int i) {
        super.setSrid(i);
        int i2 = 0;
        while (true) {
            Geometry[] geometryArr = this.subgeoms;
            if (i2 < geometryArr.length) {
                geometryArr[i2].setSrid(i);
                i2++;
            } else {
                return;
            }
        }
    }

    public ComposedGeom(int i, Geometry[] geometryArr) {
        this(i);
        this.subgeoms = geometryArr;
        if (geometryArr.length > 0) {
            Geometry geometry = geometryArr[0];
            this.dimension = geometry.dimension;
            this.haveMeasure = geometry.haveMeasure;
            return;
        }
        this.dimension = 0;
    }

    public ComposedGeom(int i, String str, boolean z) throws SQLException {
        super(i);
        this.subgeoms = EMPTY;
        this.nohash = true;
        this.hashcode = 0;
        String initSRID = initSRID(str);
        String typeString = getTypeString();
        if (initSRID.indexOf(typeString) == 0) {
            int length = typeString.length();
            if (initSRID.charAt(length) == 'M') {
                length++;
                z = true;
            }
            initSRID = initSRID.substring(length).trim();
        } else if (initSRID.charAt(0) != '(') {
            throw new SQLException("Error parsing a " + typeString + " out of " + initSRID);
        }
        if (initSRID.equals("(EMPTY)")) {
            return;
        }
        List<String> list = GeometryTokenizer.tokenize(GeometryTokenizer.removeLeadingAndTrailingStrings(initSRID, "(", ")"), CoreConstants.COMMA_CHAR);
        int size = list.size();
        this.subgeoms = createSubGeomArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.subgeoms[i2] = createSubGeomInstance(list.get(i2), z);
        }
        Geometry geometry = this.subgeoms[0];
        this.dimension = geometry.dimension;
        this.haveMeasure = geometry.haveMeasure;
    }
}
