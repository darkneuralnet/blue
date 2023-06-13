package p000;

import com.google.android.gms.maps.model.LatLng;
/* renamed from: AQ2 */
/* loaded from: classes6.dex */
public class AQ2 {
    /* renamed from: a */
    public static double m115810a(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.f71430b);
        double radians2 = Math.toRadians(latLng.f71431c);
        double radians3 = Math.toRadians(latLng2.f71430b);
        double pow = Math.pow(Math.sin((radians3 - radians) * 0.5d), 2.0d) + (Math.cos(radians) * Math.cos(radians3) * Math.pow(Math.sin((Math.toRadians(latLng2.f71431c) - radians2) * 0.5d), 2.0d));
        return Math.atan2(Math.sqrt(pow), Math.sqrt(1.0d - pow)) * 2.0d * 6371009.0d;
    }

    /* renamed from: b */
    public static LatLng m115809b(LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.f71430b);
        double radians3 = Math.toRadians(latLng.f71431c);
        double asin = Math.asin((Math.sin(radians2) * Math.cos(d3)) + (Math.cos(radians2) * Math.sin(d3) * Math.cos(radians)));
        return new LatLng(Math.toDegrees(asin), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * Math.sin(d3) * Math.cos(radians2), Math.cos(d3) - (Math.sin(radians2) * Math.sin(asin)))));
    }
}
