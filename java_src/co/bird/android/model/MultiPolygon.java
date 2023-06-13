package co.bird.android.model;

import java.sql.SQLException;
/* loaded from: classes4.dex */
public class MultiPolygon extends ComposedGeom {
    private static final long serialVersionUID = 256;

    public MultiPolygon() {
        super(6);
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry[] createSubGeomArray(int i) {
        return new Polygon[i];
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry createSubGeomInstance(String str, boolean z) throws SQLException {
        return new Polygon(str, z);
    }

    public Polygon getPolygon(int i) {
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
            return (Polygon) geometryArr[i];
        }
        return null;
    }

    public Polygon[] getPolygons() {
        return (Polygon[]) this.subgeoms;
    }

    public int numPolygons() {
        return this.subgeoms.length;
    }

    public MultiPolygon(Polygon[] polygonArr) {
        super(6, polygonArr);
    }

    public MultiPolygon(String str) throws SQLException {
        this(str, false);
    }

    public MultiPolygon(String str, boolean z) throws SQLException {
        super(6, str, z);
    }
}
