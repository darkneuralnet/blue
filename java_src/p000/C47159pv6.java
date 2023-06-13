package p000;

import android.hardware.GeomagneticField;
import android.hardware.SensorManager;
import android.location.Location;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Landroid/hardware/SensorManager;", "Landroid/location/Location;", "location", "Landroid/hardware/GeomagneticField;", C17296a.f69688o, "co.bird.android.feature.ar-parking"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: pv6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47159pv6 {
    /* renamed from: a */
    public static final GeomagneticField m18426a(SensorManager sensorManager, Location location) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        return new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), InterfaceC44876m46.f97292a.m26388a().mo26387a());
    }
}
