package p000;

import com.google.android.gms.maps.model.LatLng;
/* renamed from: QN5 */
/* loaded from: classes6.dex */
public class QN5 {

    /* renamed from: a */
    public final double f30293a;

    public QN5(double d) {
        this.f30293a = d;
    }

    /* renamed from: a */
    public LatLng m88535a(GW3 gw3) {
        double d = gw3.f12013a;
        double d2 = this.f30293a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (gw3.f12014b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    /* renamed from: b */
    public EW3 m88534b(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.f71430b));
        double d = this.f30293a;
        return new EW3(((latLng.f71431c / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * d);
    }
}
