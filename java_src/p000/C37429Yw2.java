package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0013J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u001e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0005J\n\u0010\u001c\u001a\u00020\u0007*\u00020\u0013J&\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007¨\u0006$"}, m28432d2 = {"LYw2;", "", "", "lat", "lng", "Landroid/location/Location;", "h", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "i", "fromLat", "fromLng", "toLat", "toLng", "", "b", "from", "to", "c", "Lco/bird/android/model/wire/WireLocation;", DateTokenConverter.CONVERTER_KEY, "e", "f", "toStart", "toEnd", C17296a.f69688o, "location", "j", "k", "vStart", "vEnd", "wStart", "wEnd", "g", "<init>", "()V", "location_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yw2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37429Yw2 {

    /* renamed from: a */
    public static final C37429Yw2 f47648a = new C37429Yw2();

    private C37429Yw2() {
    }

    /* renamed from: a */
    public final LatLng m73970a(LatLng from, LatLng toStart, LatLng toEnd) {
        boolean z;
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(toStart, "toStart");
        Intrinsics.checkNotNullParameter(toEnd, "toEnd");
        double m86795c = RN5.m86795c(toStart, toEnd);
        double pow = Math.pow(m86795c, 2);
        if (pow == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return toStart;
        }
        LatLng m86793e = RN5.m86793e(toStart, Math.max(0.0d, Math.min(1.0d, m73964g(toEnd, toStart, from, toStart) / pow)) * m86795c, RN5.m86794d(toStart, toEnd));
        Intrinsics.checkNotNullExpressionValue(m86793e, "computeOffset(toStart, t…eHeading(toStart, toEnd))");
        return m86793e;
    }

    /* renamed from: b */
    public final float m73969b(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return fArr[0];
    }

    /* renamed from: c */
    public final float m73968c(Location from, Location to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return m73969b(from.getLatitude(), from.getLongitude(), to.getLatitude(), to.getLongitude());
    }

    /* renamed from: d */
    public final float m73967d(Location from, WireLocation to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return m73969b(from.getLatitude(), from.getLongitude(), to.getLatitude(), to.getLongitude());
    }

    /* renamed from: e */
    public final float m73966e(WireLocation from, WireLocation to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return m73969b(from.getLatitude(), from.getLongitude(), to.getLatitude(), to.getLongitude());
    }

    /* renamed from: f */
    public final float m73965f(LatLng from, LatLng to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        float[] fArr = new float[1];
        Location.distanceBetween(from.f71430b, from.f71431c, to.f71430b, to.f71431c, fArr);
        return fArr[0];
    }

    /* renamed from: g */
    public final float m73964g(LatLng vStart, LatLng vEnd, LatLng wStart, LatLng wEnd) {
        Intrinsics.checkNotNullParameter(vStart, "vStart");
        Intrinsics.checkNotNullParameter(vEnd, "vEnd");
        Intrinsics.checkNotNullParameter(wStart, "wStart");
        Intrinsics.checkNotNullParameter(wEnd, "wEnd");
        return (float) (RN5.m86795c(vStart, vEnd) * RN5.m86795c(wStart, wEnd) * Math.cos(((RN5.m86794d(wEnd, wStart) - RN5.m86794d(vEnd, vStart)) * 3.141592653589793d) / 180.0d));
    }

    /* renamed from: h */
    public final Location m73963h(double d, double d2) {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }

    /* renamed from: i */
    public final Location m73962i(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Location location = new Location("");
        location.setLatitude(latLng.f71430b);
        location.setLongitude(latLng.f71431c);
        return location;
    }

    /* renamed from: j */
    public final WireLocation m73961j(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return WireLocationKt.toLocation$default(location, null, 1, null);
    }

    /* renamed from: k */
    public final LatLng m73960k(WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(wireLocation, "<this>");
        return new LatLng(wireLocation.getLatitude(), wireLocation.getLongitude());
    }
}
