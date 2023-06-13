package co.bird.android.model;

import java.sql.SQLException;
/* loaded from: classes4.dex */
public class Polygon extends ComposedGeom {
    private static final long serialVersionUID = 256;

    public Polygon() {
        super(3);
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry[] createSubGeomArray(int i) {
        return new LinearRing[i];
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry createSubGeomInstance(String str, boolean z) throws SQLException {
        return new LinearRing(str, z);
    }

    public LinearRing getRing(int i) {
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
            return (LinearRing) geometryArr[i];
        }
        return null;
    }

    public int numRings() {
        return this.subgeoms.length;
    }

    public Polygon(LinearRing[] linearRingArr) {
        super(3, linearRingArr);
    }

    public Polygon(String str) throws SQLException {
        this(str, false);
    }

    public Polygon(String str, boolean z) throws SQLException {
        super(3, str, z);
    }
}
