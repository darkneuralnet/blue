package co.bird.android.app.feature.map.cluster.nestmarker;

import co.bird.android.app.feature.map.cluster.MarkerClusterItem;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.persistence.NestMarker;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "Lco/bird/android/model/persistence/NestMarker;", "marker", "selected", "", "claimedProgress", "", "(Lco/bird/android/model/persistence/NestMarker;ZI)V", "getClaimedProgress", "()I", "setClaimedProgress", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "getMarker", "()Lco/bird/android/model/persistence/NestMarker;", "getSelected", "()Z", "setSelected", "(Z)V", "getPosition", "Lcom/google/android/gms/maps/model/LatLng;", "getSnippet", "getTitle", "getZIndex", "", "isSelected", "shouldCluster", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class NestMarkerClusterItem extends MarkerClusterItem<NestMarker> {
    private int claimedProgress;

    /* renamed from: id */
    private final String f61613id;
    private final NestMarker marker;
    private boolean selected;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NestIcon.values().length];
            try {
                iArr[NestIcon.GOLD_STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NestIcon.SILVER_STAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NestIcon.HEART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NestIcon.LOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ NestMarkerClusterItem(NestMarker nestMarker, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nestMarker, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i);
    }

    public final int getClaimedProgress() {
        return this.claimedProgress;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public String getId() {
        return this.f61613id;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public LatLng getPosition() {
        return LB0.m97610a(getMarker().getLocation());
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
        int i;
        int i2;
        int i3;
        if (getSelected()) {
            i3 = 100;
        } else {
            if (this.claimedProgress > 0) {
                i2 = 5;
            } else {
                NestIcon icon = getMarker().getIcon();
                int i4 = -1;
                if (icon == null) {
                    i = -1;
                } else {
                    i = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                i4 = 0;
                            }
                        } else {
                            i4 = 2;
                        }
                    } else {
                        i4 = 3;
                    }
                } else {
                    i4 = 4;
                }
                i2 = i4 + 0;
            }
            i3 = i2 + 0;
        }
        return 51.0f + i3;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public boolean isSelected() {
        return getSelected();
    }

    public final void setClaimedProgress(int i) {
        this.claimedProgress = i;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public void setSelected(boolean z) {
        this.selected = z;
    }

    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem, p000.InterfaceC32648El0
    public boolean shouldCluster() {
        return false;
    }

    public NestMarkerClusterItem(NestMarker marker, boolean z, int i) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        this.marker = marker;
        this.selected = z;
        this.claimedProgress = i;
        this.f61613id = getMarker().getId();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // co.bird.android.app.feature.map.cluster.MarkerClusterItem
    public NestMarker getMarker() {
        return this.marker;
    }
}
