package co.bird.android.app.feature.map.cluster.birdmarker;

import co.bird.android.app.feature.map.cluster.BaseUnreadyMarkerOverrides;
import co.bird.android.model.persistence.BirdMapMarker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;", "Lco/bird/android/model/persistence/BirdMapMarker;", "it", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class UnreadyMarkerOverrideBirdMarkers$holdNonReadyItems$1 extends Lambda implements Function1<co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker>, BaseUnreadyMarkerOverrides.HeldClusterItem<BirdMapMarker>> {
    final /* synthetic */ UnreadyMarkerOverrideBirdMarkers this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadyMarkerOverrideBirdMarkers$holdNonReadyItems$1(UnreadyMarkerOverrideBirdMarkers unreadyMarkerOverrideBirdMarkers) {
        super(1);
        this.this$0 = unreadyMarkerOverrideBirdMarkers;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BaseUnreadyMarkerOverrides.HeldClusterItem<BirdMapMarker> invoke(co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker> it) {
        BK2 markerOverridesManager;
        Intrinsics.checkNotNullParameter(it, "it");
        markerOverridesManager = this.this$0.getMarkerOverridesManager();
        return new BaseUnreadyMarkerOverrides.HeldClusterItem<>(it, markerOverridesManager.mo114097d(it.getMarker()));
    }
}
