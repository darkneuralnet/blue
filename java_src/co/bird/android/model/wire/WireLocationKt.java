package co.bird.android.model.wire;

import android.location.Location;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0007¨\u0006\b"}, m28432d2 = {"getLatLngString", "", "Lco/bird/android/model/wire/WireLocation;", "toLocation", "Landroid/location/Location;", Stripe3ds2AuthParams.FIELD_SOURCE, "toWKTPolygonString", "", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLocationKt {
    public static final String getLatLngString(WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(wireLocation, "<this>");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(wireLocation.getLatitude()), Double.valueOf(wireLocation.getLongitude())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    public static final WireLocation toLocation(Location location, String source) {
        Double d;
        Double d2;
        Intrinsics.checkNotNullParameter(location, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        Double d3 = null;
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
        }
        return new WireLocation(latitude, longitude, null, d, d2, d3, location.isFromMockProvider(), new DateTime(location.getTime()), source, 4, null);
    }

    public static /* synthetic */ WireLocation toLocation$default(Location location, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = WireLocation.DEFAULT_SOURCE;
        }
        return toLocation(location, str);
    }

    public static final String toWKTPolygonString(List<WireLocation> list) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(list, "<this>");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, WireLocationKt$toWKTPolygonString$1.INSTANCE, 31, null);
        return "POLYGON((" + joinToString$default + "))";
    }
}
