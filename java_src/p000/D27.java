package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: D27 */
/* loaded from: classes6.dex */
public final class D27 {
    /* renamed from: a */
    public static Rect m111019a(List list, Matrix matrix) {
        Iterator it = list.iterator();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        RectF rectF = new RectF(i2, i3, i, i4);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    /* renamed from: b */
    public static C44917m87 m111018b(C41531gR6 c41531gR6) {
        if (c41531gR6.m39460K()) {
            return c41531gR6.m39465F().m41953G();
        }
        if (c41531gR6.m39466E()) {
            return c41531gR6.m39463H().m41365E();
        }
        return c41531gR6.m39464G();
    }

    /* renamed from: c */
    public static List m111017c(C44917m87 c44917m87) {
        double sin = Math.sin(Math.toRadians(c44917m87.m26290E()));
        double cos = Math.cos(Math.toRadians(c44917m87.m26290E()));
        Point point = new Point((int) (c44917m87.m26288G() + (c44917m87.m26286I() * cos)), (int) (c44917m87.m26287H() + (c44917m87.m26286I() * sin)));
        double d = point.x;
        double m26289F = c44917m87.m26289F() * sin;
        Point point2 = r0[0];
        int i = point2.x;
        Point point3 = r0[2];
        int i2 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(c44917m87.m26288G(), c44917m87.m26287H()), point, new Point((int) (d - m26289F), (int) (pointArr[1].y + (c44917m87.m26289F() * cos))), new Point(i + (i2 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
