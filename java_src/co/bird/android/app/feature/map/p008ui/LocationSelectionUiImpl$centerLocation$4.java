package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$centerLocation$4 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$centerLocation$4 extends Lambda implements Function1<LatLng, Location> {
    public static final LocationSelectionUiImpl$centerLocation$4 INSTANCE = new LocationSelectionUiImpl$centerLocation$4();

    public LocationSelectionUiImpl$centerLocation$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Location invoke(LatLng it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C37429Yw2.f47648a.m73962i(it);
    }
}
