package co.bird.android.app.feature.map.cluster.zonemarker;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.cluster.MarkerClusterItem;
import co.bird.android.model.persistence.ZoneMarker;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "Lco/bird/android/model/persistence/ZoneMarker;", "marker", "selected", "", "(Lco/bird/android/model/persistence/ZoneMarker;Z)V", "id", "", "getId", "()Ljava/lang/String;", "getMarker", "()Lco/bird/android/model/persistence/ZoneMarker;", "getSelected", "()Z", "setSelected", "(Z)V", "getPosition", "Lcom/google/android/gms/maps/model/LatLng;", "getSnippet", "getTitle", "getZIndex", "", "isSelected", "shouldCluster", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterItem extends MarkerClusterItem<ZoneMarker> {
    private final ZoneMarker marker;
    private boolean selected;

    public /* synthetic */ ZoneMarkerClusterItem(ZoneMarker zoneMarker, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zoneMarker, (i & 2) != 0 ? false : z);
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public String getId() {
        return getMarker().getZoneId();
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public LatLng getPosition() {
        return GoogleMap_Kt.toLatLng(getMarker().getCenterPoint());
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
        return (getSelected() ? 1.0f : 0.0f) + 51.0f;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public boolean isSelected() {
        return getSelected();
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public void setSelected(boolean z) {
        this.selected = z;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public boolean shouldCluster() {
        return false;
    }

    public ZoneMarkerClusterItem(ZoneMarker marker, boolean z) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        this.marker = marker;
        this.selected = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public ZoneMarker getMarker() {
        return this.marker;
    }
}
