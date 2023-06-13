package co.bird.android.app.feature.map.cluster.birdmarker;

import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.model.persistence.BirdMapMarker;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterItem;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/persistence/BirdMapMarker;", "birdMarker", TransferTable.COLUMN_STATE, "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V", "getZIndex", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class BirdMarkerClusterItem extends co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker> {
    public /* synthetic */ BirdMarkerClusterItem(BirdMapMarker birdMapMarker, BirdClusterItemState birdClusterItemState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(birdMapMarker, (i & 2) != 0 ? BirdClusterItemState.AVAILABLE : birdClusterItemState);
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem, p000.InterfaceC32648El0
    public float getZIndex() {
        int i;
        float prominence = 50.0f - getMarker().getFleetMarker().getProminence();
        if (isSelected()) {
            i = 100;
        } else {
            i = 0;
        }
        return prominence + i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdMarkerClusterItem(BirdMapMarker birdMarker, BirdClusterItemState state) {
        super(birdMarker.getId(), birdMarker, state, UB1.m81890b(birdMarker.getLocation()));
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
