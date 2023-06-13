package p000;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* renamed from: RN5 */
/* loaded from: classes6.dex */
public class RN5 {
    private RN5() {
    }

    /* renamed from: a */
    public static double m86797a(LatLng latLng, LatLng latLng2) {
        return m86790h(Math.toRadians(latLng.f71430b), Math.toRadians(latLng.f71431c), Math.toRadians(latLng2.f71430b), Math.toRadians(latLng2.f71431c));
    }

    /* renamed from: b */
    public static double m86796b(List<LatLng> list) {
        return Math.abs(m86792f(list));
    }

    /* renamed from: c */
    public static double m86795c(LatLng latLng, LatLng latLng2) {
        return m86797a(latLng, latLng2) * 6371009.0d;
    }

    /* renamed from: d */
    public static double m86794d(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.f71430b);
        double radians2 = Math.toRadians(latLng.f71431c);
        double radians3 = Math.toRadians(latLng2.f71430b);
        double radians4 = Math.toRadians(latLng2.f71431c) - radians2;
        return C38509bN2.m64623f(Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))), -180.0d, 180.0d);
    }

    /* renamed from: e */
    public static LatLng m86793e(LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.f71430b);
        double radians3 = Math.toRadians(latLng.f71431c);
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    /* renamed from: f */
    public static double m86792f(List<LatLng> list) {
        return m86791g(list, 6371009.0d);
    }

    /* renamed from: g */
    public static double m86791g(List<LatLng> list, double d) {
        int size = list.size();
        double d2 = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double tan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.f71430b)) / 2.0d);
        double radians = Math.toRadians(latLng.f71431c);
        double d3 = tan;
        double d4 = radians;
        for (LatLng latLng2 : list) {
            double tan2 = Math.tan((1.5707963267948966d - Math.toRadians(latLng2.f71430b)) / 2.0d);
            double radians2 = Math.toRadians(latLng2.f71431c);
            d2 += m86789i(tan2, radians2, d3, d4);
            d3 = tan2;
            d4 = radians2;
        }
        return d2 * d * d;
    }

    /* renamed from: h */
    public static double m86790h(double d, double d2, double d3, double d4) {
        return C38509bN2.m64628a(C38509bN2.m64626c(d, d3, d2 - d4));
    }

    /* renamed from: i */
    public static double m86789i(double d, double d2, double d3, double d4) {
        double d5 = d2 - d4;
        double d6 = d * d3;
        return Math.atan2(Math.sin(d5) * d6, (d6 * Math.cos(d5)) + 1.0d) * 2.0d;
    }
}
