package co.bird.android.app.feature.map.cluster;

import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "T", "LEl0;", "Lcom/google/android/gms/maps/model/LatLng;", "getPosition", "", "getTitle", "getSnippet", "", "isSelected", "shouldCluster", "", "getZIndex", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "marker", "Ljava/lang/Object;", "getMarker", "()Ljava/lang/Object;", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", TransferTable.COLUMN_STATE, "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "getState", "()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "setState", "(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V", "position", "Lcom/google/android/gms/maps/model/LatLng;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lcom/google/android/gms/maps/model/LatLng;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class BirdMarkerClusterItem<T> implements InterfaceC32648El0 {

    /* renamed from: id */
    private final String f61610id;
    private final T marker;
    private LatLng position;
    private BirdClusterItemState state;

    public BirdMarkerClusterItem(String id, T t, BirdClusterItemState state, LatLng position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f61610id = id;
        this.marker = t;
        this.state = state;
        this.position = position;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BirdMarkerClusterItem)) {
            return false;
        }
        return Intrinsics.areEqual(this.f61610id, ((BirdMarkerClusterItem) obj).f61610id);
    }

    public final String getId() {
        return this.f61610id;
    }

    public final T getMarker() {
        return this.marker;
    }

    @Override // p000.InterfaceC32648El0
    public LatLng getPosition() {
        return this.position;
    }

    @Override // p000.InterfaceC32648El0
    public String getSnippet() {
        return null;
    }

    public final BirdClusterItemState getState() {
        return this.state;
    }

    @Override // p000.InterfaceC32648El0
    public String getTitle() {
        return null;
    }

    @Override // p000.InterfaceC32648El0
    public float getZIndex() {
        return 50.0f;
    }

    public int hashCode() {
        return this.f61610id.hashCode();
    }

    public boolean isSelected() {
        return this.state == BirdClusterItemState.SELECTED;
    }

    public final void setState(BirdClusterItemState birdClusterItemState) {
        Intrinsics.checkNotNullParameter(birdClusterItemState, "<set-?>");
        this.state = birdClusterItemState;
    }

    @Override // p000.InterfaceC32648El0
    public boolean shouldCluster() {
        return true;
    }

    public /* synthetic */ BirdMarkerClusterItem(String str, Object obj, BirdClusterItemState birdClusterItemState, LatLng latLng, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? BirdClusterItemState.AVAILABLE : birdClusterItemState, latLng);
    }
}
