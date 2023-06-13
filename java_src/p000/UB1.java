package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.WireCoordinate;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "Lco/bird/android/model/wire/WireLocation;", "c", "Landroid/location/Location;", C17296a.f69688o, "Lcom/google/android/gms/maps/model/LatLng;", "b", "Lco/bird/android/model/wire/WireCoordinate;", DateTokenConverter.CONVERTER_KEY, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGeolocation+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Geolocation+.kt\nco/bird/android/library/extension/Geolocation_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* renamed from: UB1 */
/* loaded from: classes3.dex */
public final class UB1 {
    /* renamed from: a */
    public static final Location m81891a(Geolocation geolocation) {
        Intrinsics.checkNotNullParameter(geolocation, "<this>");
        Location location = new Location("");
        location.setLatitude(geolocation.getLatitude());
        location.setLongitude(geolocation.getLongitude());
        location.setTime(geolocation.getTime().getMillis());
        Double speed = geolocation.getSpeed();
        if (speed != null) {
            location.setSpeed((float) speed.doubleValue());
        }
        Double altitude = geolocation.getAltitude();
        if (altitude != null) {
            location.setAltitude(altitude.doubleValue());
        }
        Double accuracy = geolocation.getAccuracy();
        if (accuracy != null) {
            location.setAccuracy((float) accuracy.doubleValue());
        }
        location.setProvider(geolocation.getSource());
        return location;
    }

    /* renamed from: b */
    public static final LatLng m81890b(Geolocation geolocation) {
        Intrinsics.checkNotNullParameter(geolocation, "<this>");
        return new LatLng(geolocation.getLatitude(), geolocation.getLongitude());
    }

    /* renamed from: c */
    public static final WireLocation m81889c(Geolocation geolocation) {
        Intrinsics.checkNotNullParameter(geolocation, "<this>");
        double latitude = geolocation.getLatitude();
        double longitude = geolocation.getLongitude();
        Double heading = geolocation.getHeading();
        Double speed = geolocation.getSpeed();
        Double altitude = geolocation.getAltitude();
        Double accuracy = geolocation.getAccuracy();
        boolean mocked = geolocation.getMocked();
        DateTime time = geolocation.getTime();
        String source = geolocation.getSource();
        if (source == null) {
            source = "";
        }
        return new WireLocation(latitude, longitude, heading, speed, altitude, accuracy, mocked, time, source);
    }

    /* renamed from: d */
    public static final WireCoordinate m81888d(Geolocation geolocation) {
        Intrinsics.checkNotNullParameter(geolocation, "<this>");
        return new WireCoordinate(geolocation.getLatitude(), geolocation.getLongitude());
    }
}
