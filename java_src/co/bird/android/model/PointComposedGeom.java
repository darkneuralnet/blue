package co.bird.android.model;

import ch.qos.logback.core.CoreConstants;
import java.sql.SQLException;
/* loaded from: classes4.dex */
public abstract class PointComposedGeom extends ComposedGeom {
    private static final long serialVersionUID = 256;

    public PointComposedGeom(int i) {
        super(i);
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry[] createSubGeomArray(int i) {
        return new Point[i];
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry createSubGeomInstance(String str, boolean z) throws SQLException {
        return new Point(str, z);
    }

    @Override // co.bird.android.model.ComposedGeom, co.bird.android.model.Geometry
    public Point getPoint(int i) {
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
            return (Point) geometryArr[i];
        }
        return null;
    }

    public Point[] getPoints() {
        return (Point[]) this.subgeoms;
    }

    @Override // co.bird.android.model.ComposedGeom, co.bird.android.model.Geometry
    public void innerWKT(StringBuilder sb) {
        this.subgeoms[0].innerWKT(sb);
        for (int i = 1; i < this.subgeoms.length; i++) {
            sb.append(CoreConstants.COMMA_CHAR);
            this.subgeoms[i].innerWKT(sb);
        }
    }

    @Override // co.bird.android.model.ComposedGeom, co.bird.android.model.Geometry
    public int numPoints() {
        return this.subgeoms.length;
    }

    public PointComposedGeom(int i, Point[] pointArr) {
        super(i, pointArr);
    }

    public PointComposedGeom(int i, String str) throws SQLException {
        this(i, str, false);
    }

    public PointComposedGeom(int i, String str, boolean z) throws SQLException {
        super(i, str, z);
    }
}
