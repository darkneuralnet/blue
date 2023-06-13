package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.wire.WireLocation;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m28432d2 = {"toLocation", "Lco/bird/android/model/wire/WireLocation;", "Lcom/google/android/gms/maps/model/LatLng;", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiKt */
/* loaded from: classes2.dex */
public final class LocationSelectionUiKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final WireLocation toLocation(LatLng latLng) {
        return new WireLocation(latLng.f71430b, latLng.f71431c, null, null, null, null, false, null, null, 508, null);
    }
}
