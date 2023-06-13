package p000;

import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: EG */
/* loaded from: classes6.dex */
public class C1768EG {
    /* renamed from: a */
    public static C38746bm2 m109268a(double d, LatLng latLng, LatLng latLng2) {
        double d2;
        double d3 = 90.0d * d;
        double m115810a = AQ2.m115810a(latLng, latLng2);
        double m42987b = C40305eN2.m42987b(latLng, latLng2);
        double m42987b2 = C40305eN2.m42987b(latLng2, latLng);
        double d4 = 0.0d;
        int i = (m42987b > 0.0d ? 1 : (m42987b == 0.0d ? 0 : -1));
        if (i == 0 && m42987b2 == 180.0d) {
            d4 = m42987b + d3;
            d3 = -d3;
        } else {
            int i2 = (m42987b > 180.0d ? 1 : (m42987b == 180.0d ? 0 : -1));
            if (i2 == 0 && m42987b2 == 0.0d) {
                d4 = (-d3) + m42987b;
            } else {
                if (i > 0 && m42987b2 > 180.0d) {
                    d4 = (-d3) + m42987b;
                    d2 = d3 + m42987b2;
                    if (d2 >= 360.0d) {
                        d2 -= 360.0d;
                    }
                } else if (i2 > 0 && m42987b2 > 0.0d) {
                    d4 = m42987b + d3;
                    d2 = (-d3) + m42987b2;
                    if (d4 >= 360.0d) {
                        d4 -= 360.0d;
                    }
                } else {
                    d2 = 0.0d;
                }
                double d5 = m115810a / 3.0d;
                return new C38746bm2(AQ2.m115809b(latLng, d5, d4), AQ2.m115809b(latLng2, d5, d2));
            }
        }
        d2 = d3 + m42987b2;
        double d52 = m115810a / 3.0d;
        return new C38746bm2(AQ2.m115809b(latLng, d52, d4), AQ2.m115809b(latLng2, d52, d2));
    }

    /* renamed from: b */
    public static UT3 m109267b(double d, Point point, Point point2) {
        double d2;
        double d3;
        double d4 = d * 90.0d;
        double m42986c = C40305eN2.m42986c(point, point2);
        double m42988a = C40305eN2.m42988a(point, point2);
        double m42988a2 = C40305eN2.m42988a(point2, point);
        if (m42988a >= 90.0d || m42988a2 >= 270.0d) {
            if ((m42988a < 270.0d && m42988a2 < 90.0d) || (m42988a >= 90.0d && m42988a2 >= 270.0d)) {
                d2 = m42988a + d4;
                d4 = -d4;
                d3 = m42988a2 + d4;
                double d5 = m42986c / 3.0d;
                return new UT3(C40305eN2.m42985d(point, d5, Math.toRadians(d2)), C40305eN2.m42985d(point2, d5, Math.toRadians(d3)));
            } else if (m42988a < 270.0d || m42988a2 < 90.0d) {
                d2 = 0.0d;
                d3 = 0.0d;
                double d52 = m42986c / 3.0d;
                return new UT3(C40305eN2.m42985d(point, d52, Math.toRadians(d2)), C40305eN2.m42985d(point2, d52, Math.toRadians(d3)));
            }
        }
        d2 = m42988a + (-d4);
        d3 = m42988a2 + d4;
        double d522 = m42986c / 3.0d;
        return new UT3(C40305eN2.m42985d(point, d522, Math.toRadians(d2)), C40305eN2.m42985d(point2, d522, Math.toRadians(d3)));
    }

    /* renamed from: c */
    public static Point m109266c(Point point, Point point2, Point point3, Point point4, double d) {
        double d2 = 1.0d - d;
        double d3 = d2 * d2 * d2;
        double d4 = 3.0d * d2;
        double d5 = d2 * d4 * d;
        double d6 = d4 * d * d;
        double d7 = d * d * d;
        return new Point((int) ((point.x * d3) + (point2.x * d5) + (point3.x * d6) + (point4.x * d7)), (int) ((d3 * point.y) + (d5 * point2.y) + (d6 * point3.y) + (d7 * point4.y)));
    }

    /* renamed from: d */
    public static LatLng m109265d(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, double d) {
        double d2 = 1.0d - d;
        double d3 = d2 * d2 * d2;
        double d4 = 3.0d * d2;
        double d5 = d2 * d4 * d;
        double d6 = d4 * d * d;
        double d7 = d * d * d;
        return new LatLng((latLng.f71430b * d3) + (latLng2.f71430b * d5) + (latLng3.f71430b * d6) + (latLng4.f71430b * d7), (d3 * latLng.f71431c) + (d5 * latLng2.f71431c) + (d6 * latLng3.f71431c) + (d7 * latLng4.f71431c));
    }
}
