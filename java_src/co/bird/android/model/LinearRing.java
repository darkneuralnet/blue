package co.bird.android.model;

import ch.qos.logback.core.CoreConstants;
import java.sql.SQLException;
import java.util.List;
/* loaded from: classes4.dex */
public class LinearRing extends PointComposedGeom {
    private static final long serialVersionUID = 256;

    public LinearRing(Point[] pointArr) {
        super(0, pointArr);
    }

    public LinearRing(String str) throws SQLException {
        this(str, false);
    }

    public LinearRing(String str, boolean z) throws SQLException {
        super(0);
        List<String> list = GeometryTokenizer.tokenize(GeometryTokenizer.removeLeadingAndTrailingStrings(str.trim(), "(", ")"), CoreConstants.COMMA_CHAR);
        int size = list.size();
        Point[] pointArr = new Point[size];
        for (int i = 0; i < size; i++) {
            pointArr[i] = new Point(list.get(i), z);
        }
        Point point = pointArr[0];
        this.dimension = point.dimension;
        this.haveMeasure = point.haveMeasure;
        this.subgeoms = pointArr;
    }
}
