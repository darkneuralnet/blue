package co.bird.android.model;

import ch.qos.logback.core.CoreConstants;
import java.sql.SQLException;
/* loaded from: classes4.dex */
public class GeometryCollection extends ComposedGeom {
    public static final String GeoCollID = "GEOMETRYCOLLECTION";
    private static final long serialVersionUID = 256;

    public GeometryCollection() {
        super(7);
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry[] createSubGeomArray(int i) {
        return new Geometry[i];
    }

    @Override // co.bird.android.model.ComposedGeom
    public Geometry createSubGeomInstance(String str, boolean z) throws SQLException {
        return GeometryBuilder.geomFromString(str, z);
    }

    public Geometry[] getGeometries() {
        return this.subgeoms;
    }

    @Override // co.bird.android.model.ComposedGeom, co.bird.android.model.Geometry
    public void innerWKT(StringBuilder sb) {
        this.subgeoms[0].outerWKT(sb, true);
        for (int i = 1; i < this.subgeoms.length; i++) {
            sb.append(CoreConstants.COMMA_CHAR);
            this.subgeoms[i].outerWKT(sb, true);
        }
    }

    public GeometryCollection(Geometry[] geometryArr) {
        super(7, geometryArr);
    }

    public GeometryCollection(String str) throws SQLException {
        this(str, false);
    }

    public GeometryCollection(String str, boolean z) throws SQLException {
        super(7, str, z);
    }
}
