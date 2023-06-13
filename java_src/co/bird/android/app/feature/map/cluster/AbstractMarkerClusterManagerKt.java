package co.bird.android.app.feature.map.cluster;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0002¨\u0006\u0005"}, m28432d2 = {"contains", "", "Lcom/google/android/gms/maps/model/VisibleRegion;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class AbstractMarkerClusterManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean contains(VisibleRegion visibleRegion, LatLng latLng) {
        Intrinsics.checkNotNullParameter(visibleRegion, "<this>");
        return visibleRegion.f71509f.m50669u(latLng);
    }
}
