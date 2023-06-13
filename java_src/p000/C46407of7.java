package p000;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: of7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46407of7 {
    /* renamed from: a */
    public static Rect m20681a(List list) {
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
        return new Rect(i2, i3, i, i4);
    }

    /* renamed from: b */
    public static List m20680b(zzf zzfVar) {
        double sin = Math.sin(Math.toRadians(zzfVar.f70980f));
        double cos = Math.cos(Math.toRadians(zzfVar.f70980f));
        double d = zzfVar.f70978d;
        Point point = new Point((int) (zzfVar.f70976b + (d * cos)), (int) (zzfVar.f70977c + (d * sin)));
        int i = zzfVar.f70979e;
        double d2 = i * sin;
        Point point2 = r0[0];
        int i2 = point2.x;
        Point point3 = r0[2];
        int i3 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zzfVar.f70976b, zzfVar.f70977c), point, new Point((int) (point.x - d2), (int) (pointArr[1].y + (i * cos))), new Point(i2 + (i3 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
