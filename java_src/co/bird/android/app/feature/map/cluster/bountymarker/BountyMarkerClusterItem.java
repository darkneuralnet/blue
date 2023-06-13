package co.bird.android.app.feature.map.cluster.bountymarker;

import co.bird.android.app.feature.map.cluster.MarkerClusterItem;
import co.bird.android.model.persistence.BountyMapMarker;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "Lco/bird/android/model/persistence/BountyMapMarker;", "marker", "(Lco/bird/android/model/persistence/BountyMapMarker;)V", "id", "", "getId", "()Ljava/lang/String;", "getMarker", "()Lco/bird/android/model/persistence/BountyMapMarker;", "selected", "", "getSelected", "()Z", "setSelected", "(Z)V", "getPosition", "Lcom/google/android/gms/maps/model/LatLng;", "getSnippet", "getTitle", "getZIndex", "", "isSelected", "shouldCluster", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class BountyMarkerClusterItem extends MarkerClusterItem<BountyMapMarker> {

    /* renamed from: id */
    private final String f61612id;
    private final BountyMapMarker marker;
    private boolean selected;

    public BountyMarkerClusterItem(BountyMapMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        this.marker = marker;
        this.f61612id = getMarker().getId();
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public String getId() {
        return this.f61612id;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public LatLng getPosition() {
        return UB1.m81890b(getMarker().getLocation());
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public boolean getSelected() {
        return this.selected;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public String getSnippet() {
        return null;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public String getTitle() {
        return null;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public float getZIndex() {
        return 52.0f;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public boolean isSelected() {
        return false;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public void setSelected(boolean z) {
        this.selected = z;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public boolean shouldCluster() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public BountyMapMarker getMarker() {
        return this.marker;
    }
}
