package p000;

import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: eN2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40305eN2 {
    /* renamed from: a */
    public static double m42988a(Point point, Point point2) {
        double degrees = Math.toDegrees(Math.atan2(point2.y - point.y, point2.x - point.x));
        return degrees < 0.0d ? degrees + 360.0d : degrees;
    }

    /* renamed from: b */
    public static double m42987b(LatLng latLng, LatLng latLng2) {
        double degrees = Math.toDegrees(Math.atan2(latLng2.f71431c - latLng.f71431c, latLng2.f71430b - latLng.f71430b));
        return degrees < 0.0d ? degrees + 360.0d : degrees;
    }

    /* renamed from: c */
    public static double m42986c(Point point, Point point2) {
        return Math.sqrt(Math.pow(Math.abs(point2.x - point.x), 2.0d) + Math.pow(Math.abs(point2.y - point.y), 2.0d));
    }

    /* renamed from: d */
    public static Point m42985d(Point point, double d, double d2) {
        return new Point((int) (point.x + (Math.cos(d2) * d)), (int) (point.y + (d * Math.sin(d2))));
    }
}
