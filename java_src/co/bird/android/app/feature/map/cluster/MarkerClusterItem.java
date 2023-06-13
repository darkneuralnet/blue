package co.bird.android.app.feature.map.cluster;

import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "T", "LEl0;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "getMarker", "()Ljava/lang/Object;", "marker", "getSelected", "()Z", "setSelected", "(Z)V", "selected", "", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class MarkerClusterItem<T> implements InterfaceC32648El0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkerClusterItem)) {
            return false;
        }
        return Intrinsics.areEqual(getId(), ((MarkerClusterItem) obj).getId());
    }

    public abstract String getId();

    public abstract T getMarker();

    @Override // p000.InterfaceC32648El0
    public abstract /* synthetic */ LatLng getPosition();

    public abstract boolean getSelected();

    @Override // p000.InterfaceC32648El0
    public abstract /* synthetic */ String getSnippet();

    @Override // p000.InterfaceC32648El0
    public abstract /* synthetic */ String getTitle();

    @Override // p000.InterfaceC32648El0
    public abstract /* synthetic */ float getZIndex();

    public int hashCode() {
        return getId().hashCode();
    }

    public abstract /* synthetic */ boolean isSelected();

    public abstract void setSelected(boolean z);

    @Override // p000.InterfaceC32648El0
    public abstract /* synthetic */ boolean shouldCluster();
}
