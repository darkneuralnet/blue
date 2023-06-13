package co.bird.android.model;

import java.sql.SQLException;
/* loaded from: classes4.dex */
public class MultiPoint extends PointComposedGeom {
    private static final long serialVersionUID = 256;

    public MultiPoint() {
        super(4);
    }

    public MultiPoint(Point[] pointArr) {
        super(4, pointArr);
    }

    public MultiPoint(String str) throws SQLException {
        this(str, false);
    }

    public MultiPoint(String str, boolean z) throws SQLException {
        super(4, str, z);
    }
}
