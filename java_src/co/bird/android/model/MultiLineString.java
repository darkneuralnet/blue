package co.bird.android.model;

import java.sql.SQLException;
/* loaded from: classes4.dex */
public class MultiLineString extends ComposedGeom {
    private static final long serialVersionUID = 256;
    double len;

    public MultiLineString() {
        super(5);
        this.len = -1.0d;
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry[] createSubGeomArray(int i) {
        return new LineString[i];
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry createSubGeomInstance(String str, boolean z) throws SQLException {
        return new LineString(str, z);
    }

    public LineString getLine(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Geometry[] geometryArr = this.subgeoms;
        if (i >= geometryArr.length) {
            z2 = false;
        }
        if (z2 & z) {
            return (LineString) geometryArr[i];
        }
        return null;
    }

    public LineString[] getLines() {
        return (LineString[]) this.subgeoms.clone();
    }

    @Override // co.bird.android.model.ComposedGeom, co.bird.android.model.Geometry
    public int hashCode() {
        return super.hashCode() ^ ((int) length());
    }

    public double length() {
        double d = 0.0d;
        if (this.len < 0.0d) {
            LineString[] lineStringArr = (LineString[]) this.subgeoms;
            if (lineStringArr.length < 1) {
                this.len = 0.0d;
            } else {
                for (LineString lineString : lineStringArr) {
                    d += lineString.length();
                }
                this.len = d;
            }
        }
        return this.len;
    }

    public int numLines() {
        return this.subgeoms.length;
    }

    public MultiLineString(LineString[] lineStringArr) {
        super(5, lineStringArr);
        this.len = -1.0d;
    }

    public MultiLineString(String str) throws SQLException {
        this(str, false);
    }

    public MultiLineString(String str, boolean z) throws SQLException {
        super(5, str, z);
        this.len = -1.0d;
    }
}
