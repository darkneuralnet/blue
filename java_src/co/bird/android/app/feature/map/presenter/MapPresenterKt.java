package co.bird.android.app.feature.map.presenter;

import android.hardware.GeomagneticField;
import android.hardware.SensorManager;
import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28432d2 = {"getGeoField", "Landroid/hardware/GeomagneticField;", "Landroid/hardware/SensorManager;", "location", "Landroid/location/Location;", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterKt {
    public static final GeomagneticField getGeoField(SensorManager sensorManager, Location location) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        return new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), InterfaceC44876m46.f97292a.m26388a().mo26387a());
    }
}
