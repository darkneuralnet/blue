package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¨\u0006\b"}, m28432d2 = {"Landroid/location/Location;", "Lcom/google/android/gms/maps/model/LatLng;", DateTokenConverter.CONVERTER_KEY, "", "c", "b", C17296a.f69688o, "e", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLatLngExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LatLngExt.kt\nco/bird/android/library/extension/LatLngExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/* renamed from: cm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39339cm2 {
    /* renamed from: a */
    public static final boolean m60888a(Location location) {
        ClosedFloatingPointRange rangeTo;
        Intrinsics.checkNotNullParameter(location, "<this>");
        rangeTo = RangesKt__RangesKt.rangeTo(-1.0d, 1.0d);
        if (rangeTo.contains(Double.valueOf(location.getLatitude())) && rangeTo.contains(Double.valueOf(location.getLongitude()))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m60887b(LatLng latLng) {
        ClosedFloatingPointRange rangeTo;
        Intrinsics.checkNotNullParameter(latLng, "<this>");
        rangeTo = RangesKt__RangesKt.rangeTo(-1.0d, 1.0d);
        if (rangeTo.contains(Double.valueOf(latLng.f71430b)) && rangeTo.contains(Double.valueOf(latLng.f71431c))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m60886c(LatLng latLng) {
        if (latLng != null) {
            if (latLng.f71430b == 0.0d) {
                if (latLng.f71431c == 0.0d) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final LatLng m60885d(Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    /* renamed from: e */
    public static final Location m60884e(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "<this>");
        Location location = new Location("");
        location.setLatitude(latLng.f71430b);
        location.setLongitude(latLng.f71431c);
        return location;
    }
}
