package co.bird.android.app.feature.map.cluster.birdmarker;

import co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManager;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.BirdMarkerClusterItemOptionProvider;
import co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.BirdMapMarker;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33116Gl0;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0001\u0010*\u001a\u00020)\u0012\b\b\u0001\u0010,\u001a\u00020+\u0012\b\b\u0001\u0010.\u001a\u00020-\u0012\b\b\u0001\u00100\u001a\u00020/\u0012\b\b\u0001\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b*\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0012H\u0016J\"\u0010\u0018\u001a\u00020\u000b2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u00065"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;", "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;", "Lco/bird/android/model/persistence/BirdMapMarker;", "marker", "", "markerId", "Lcom/google/android/gms/maps/model/LatLng;", "markerPosition", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "markerClusterItem", "bird", "", "reset", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", TransferTable.COLUMN_STATE, "setInRide", "mapMarkerState", "setMapMarkerState", "LDl0;", "cluster", "", "onClusterClick", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClusterItemClickListener", "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;", "renderer", "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;", "getRenderer", "()Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;", "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "markerOverrides", "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "getMarkerOverrides", "()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "LTq4;", "reactiveConfig", "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;", "fleetMarkerProvider", "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;", "rendererFactory", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LBK2;", "markerOverridesManager", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "LcD1;", "map", "Lco/bird/android/model/constant/MapMode;", "mode", "<init>", "(LTq4;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes2.dex */
public final class BirdMarkerClusterManager extends BaseBirdMarkerClusterManager<BirdMapMarker> {
    private final UnreadyMarkerOverrides<BirdMapMarker> markerOverrides;
    private final OperatorBirdMarkerClusterRenderer renderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdMarkerClusterManager(C36207Tq4 reactiveConfig, BirdMarkerClusterItemOptionProvider fleetMarkerProvider, OperatorBirdMarkerClusterRendererFactory rendererFactory, BaseActivity activity, BK2 markerOverridesManager, ReactiveMapEvent reactiveMapEvent, C39011cD1 map, MapMode mode) {
        super(reactiveConfig, activity, markerOverridesManager, reactiveMapEvent, map, mode);
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(fleetMarkerProvider, "fleetMarkerProvider");
        Intrinsics.checkNotNullParameter(rendererFactory, "rendererFactory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.renderer = rendererFactory.create(map, getClusterManager(), fleetMarkerProvider);
        this.markerOverrides = new UnreadyMarkerOverrideBirdMarkers(markerOverridesManager);
        if (activity.mo58969Q() == EnumC4283Jy.OPERATOR) {
            init();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnClusterItemClickListener$lambda$1(BirdMarkerClusterManager this$0, Function2 listener, co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem birdMarkerClusterItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem2 = this$0.get(this$0.getClusterManager(), birdMarkerClusterItem.getMarker());
        if (birdMarkerClusterItem2 != null) {
            listener.invoke(birdMarkerClusterItem2.getMarker(), Boolean.valueOf(birdMarkerClusterItem2.isSelected()));
            this$0.setClickedMarker(birdMarkerClusterItem2.getMarker());
            return true;
        }
        return true;
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public UnreadyMarkerOverrides<BirdMapMarker> getMarkerOverrides() {
        return this.markerOverrides;
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager, p000.C33116Gl0.InterfaceC2934b
    public boolean onClusterClick(InterfaceC32414Dl0<co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker>> cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        LatLngBounds.C17620a m50670s = LatLngBounds.m50670s();
        Intrinsics.checkNotNullExpressionValue(m50670s, "builder()");
        for (co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem : cluster.mo75548b()) {
            LatLng position = birdMarkerClusterItem.getPosition();
            if (position != null) {
                m50670s.m50666b(position);
            }
        }
        LatLngBounds m50667a = m50670s.m50667a();
        Intrinsics.checkNotNullExpressionValue(m50667a, "builder.build()");
        try {
            getMap().m61682f(C48149rc0.m15707c(m50667a, 100));
            return true;
        } catch (Exception e) {
            C41318g46.m40158f(e, "Error in onClusterClick while attempting to animate map", new Object[0]);
            return true;
        }
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void setOnClusterItemClickListener(final Function2<? super BirdMapMarker, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getClusterManager().m104793s(new C33116Gl0.InterfaceC2936d() { // from class: MM
            @Override // p000.C33116Gl0.InterfaceC2936d
            /* renamed from: a */
            public final boolean mo78587a(InterfaceC32648El0 interfaceC32648El0) {
                boolean onClusterItemClickListener$lambda$1;
                onClusterItemClickListener$lambda$1 = BirdMarkerClusterManager.setOnClusterItemClickListener$lambda$1(BirdMarkerClusterManager.this, listener, (BirdMarkerClusterItem) interfaceC32648El0);
                return onClusterItemClickListener$lambda$1;
            }
        });
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public EW0<co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker>> getRenderer() {
        return this.renderer;
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem<BirdMapMarker> markerClusterItem(BirdMapMarker birdMapMarker) {
        Intrinsics.checkNotNullParameter(birdMapMarker, "<this>");
        return new BirdMarkerClusterItem(birdMapMarker, null, 2, null);
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public String markerId(BirdMapMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return marker.getId();
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public LatLng markerPosition(BirdMapMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return UB1.m81890b(marker.getLocation());
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void reset(BirdMapMarker bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C41318g46.m40160d("reset called in BirdMarkerClusterManager but not yet implemented. This is not a true error as this manager should only be used in the operator map currently but we will emit in logs in case it gets called in the future before being implemented.", new Object[0]);
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void setInRide(BirdMapMarker bird, BirdClusterItemState birdClusterItemState) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C41318g46.m40160d("setInRide called in BirdMarkerClusterManager but not yet implemented. This is not a true error as this manager should only be used in the operator map currently but we will emit in logs in case it gets called in the future before being implemented.", new Object[0]);
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void setMapMarkerState(BirdClusterItemState mapMarkerState, BirdMapMarker birdMapMarker) {
        Intrinsics.checkNotNullParameter(mapMarkerState, "mapMarkerState");
        C41318g46.m40160d("setMapMarkerState called in BirdMarkerClusterManager but not yet implemented. This is not a true error as this manager should only be used in the operator map currently but we will emit in logs in case it gets called in the future before being implemented.", new Object[0]);
    }
}
