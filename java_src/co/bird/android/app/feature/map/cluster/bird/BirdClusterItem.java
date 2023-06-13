package co.bird.android.app.feature.map.cluster.bird;

import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.wire.WireBird;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItem;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/wire/WireBird;", "bird", TransferTable.COLUMN_STATE, "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V", "getZIndex", "", "shouldCluster", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class BirdClusterItem extends BirdMarkerClusterItem<WireBird> {
    public /* synthetic */ BirdClusterItem(WireBird wireBird, BirdClusterItemState birdClusterItemState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireBird, (i & 2) != 0 ? BirdClusterItemState.AVAILABLE : birdClusterItemState);
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem, p000.InterfaceC32648El0
    public float getZIndex() {
        boolean z;
        String brandName = getMarker().getBrandName();
        if (brandName == null) {
            brandName = "";
        }
        boolean z2 = false;
        if (!Intrinsics.areEqual(brandName, "") && !Intrinsics.areEqual(brandName, "Bird")) {
            z = false;
        } else {
            z = true;
        }
        if (getMarker().getPrivateBird() != null) {
            z2 = true;
        }
        boolean isScanlessRideEligible = getMarker().isScanlessRideEligible();
        if (z2) {
            return 99.0f;
        }
        if (isScanlessRideEligible) {
            return 55.0f;
        }
        if (z) {
            return 50.0f;
        }
        return 49.0f;
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem, p000.InterfaceC32648El0
    public boolean shouldCluster() {
        return getMarker().getPrivateBird() == null && getState() == BirdClusterItemState.AVAILABLE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdClusterItem(WireBird bird, BirdClusterItemState state) {
        super(bird.getId(), bird, state, new LatLng(bird.getLocation().getLatitude(), bird.getLocation().getLongitude()));
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
