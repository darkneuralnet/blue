package p000;

import android.location.Location;
import android.os.Build;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Landroid/location/Location;", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "b", "", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;", "isMockSafe", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Xw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37195Xw2 {
    /* renamed from: a */
    public static final Boolean m76041a(Location location) {
        boolean isMock;
        Intrinsics.checkNotNullParameter(location, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            isMock = location.isMock();
            return Boolean.valueOf(isMock);
        }
        return null;
    }

    /* renamed from: b */
    public static final Geolocation m76040b(Location location) {
        Double d;
        Double d2;
        Double d3;
        Intrinsics.checkNotNullParameter(location, "<this>");
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (location.hasSpeed()) {
            d = Double.valueOf(location.getSpeed());
        } else {
            d = null;
        }
        if (location.hasAltitude()) {
            d2 = Double.valueOf(location.getAltitude());
        } else {
            d2 = null;
        }
        if (location.hasAccuracy()) {
            d3 = Double.valueOf(location.getAccuracy());
        } else {
            d3 = null;
        }
        return new Geolocation(latitude, longitude, null, d, d2, d3, location.isFromMockProvider(), new DateTime(location.getTime()), location.getProvider(), 4, null);
    }
}
