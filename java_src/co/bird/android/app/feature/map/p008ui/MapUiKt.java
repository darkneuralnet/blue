package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a6\u0010\u000e\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001a\b\u0002\u0010\f\u001a\u0014\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¨\u0006\u000f"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "toGeolocation", "LcD1;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "", "padding", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "safeAnimateCamera", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapUiKt */
/* loaded from: classes2.dex */
public final class MapUiKt {
    public static final void safeAnimateCamera(C39011cD1 c39011cD1, LatLngBounds bounds, int i, Function1<? super Exception, String> message) {
        Intrinsics.checkNotNullParameter(c39011cD1, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            c39011cD1.m61682f(C48149rc0.m15707c(bounds, i));
        } catch (Exception e) {
            C41318g46.m40158f(e, message.invoke(e), new Object[0]);
        }
    }

    public static /* synthetic */ void safeAnimateCamera$default(C39011cD1 c39011cD1, LatLngBounds latLngBounds, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = MapUiKt$safeAnimateCamera$1.INSTANCE;
        }
        safeAnimateCamera(c39011cD1, latLngBounds, i, function1);
    }

    public static final Geolocation toGeolocation(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "<this>");
        return new Geolocation(latLng.f71430b, latLng.f71431c, null, null, null, null, false, null, null, 508, null);
    }
}
