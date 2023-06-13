package co.bird.android.app.feature.map.cluster.bird;

import android.app.Application;
import co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManager;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.BirdClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.IconLoader;
import co.bird.android.app.feature.map.renderer.OperatorClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33116Gl0;
@Metadata(m28433d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NBu\b\u0007\u0012\n\u00107\u001a\u000605j\u0002`6\u0012\n\u0010:\u001a\u000608j\u0002`9\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?\u0012\b\b\u0001\u0010B\u001a\u00020A\u0012\b\b\u0001\u0010D\u001a\u00020C\u0012\b\b\u0001\u0010F\u001a\u00020E\u0012\b\b\u0001\u0010H\u001a\u00020G\u0012\b\b\u0001\u0010J\u001a\u00020I\u0012\b\b\u0001\u0010K\u001a\u00020\u0013¢\u0006\u0004\bL\u0010MJ\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003*\u00020\u0002H\u0016J\u001c\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001a\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u001b\u001a\u00020\u00072\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0019H\u0016J\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R \u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006O"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManager;", "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "birdClusterItem", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "mapMarkerState", "", "setMapMarkerStateAndRender", "item", "setInRideMarker", "marker", "", "markerId", "Lcom/google/android/gms/maps/model/LatLng;", "markerPosition", "markerClusterItem", "LDl0;", "cluster", "", "onClusterClick", "reset", TransferTable.COLUMN_STATE, "setInRide", "setMapMarkerState", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClusterItemClickListener", "bird", "getItem$co_bird_android_feature_map", "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "getItem", "closeInfoWindow", "Lco/bird/android/app/feature/map/renderer/IconLoader;", "iconLoader", "Lco/bird/android/app/feature/map/renderer/IconLoader;", "getIconLoader", "()Lco/bird/android/app/feature/map/renderer/IconLoader;", "getIconLoader$annotations", "()V", "LEW0;", "renderer", "LEW0;", "getRenderer", "()LEW0;", "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "markerOverrides", "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "getMarkerOverrides", "()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "", "currentBirdsInRide", "Ljava/util/List;", "Lco/bird/android/app/feature/map/renderer/BirdClusterRendererFactory;", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterRendererFactory;", "birdRendererFactory", "Lco/bird/android/app/feature/map/renderer/OperatorClusterRendererFactory;", "Lco/bird/android/app/feature/map/cluster/bird/OperatorClusterRendererFactory;", "operatorRendererFactory", "LTq4;", "reactiveConfig", "LEa;", "analyticsManager", "LOh;", "buildConfig", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LBK2;", "markerOverridesManager", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lco/bird/android/model/constant/MapMode;", "mode", "hourly", "<init>", "(Lco/bird/android/app/feature/map/renderer/BirdClusterRendererFactory;Lco/bird/android/app/feature/map/renderer/OperatorClusterRendererFactory;LTq4;LEa;LOh;Lco/bird/android/core/mvp/BaseActivity;LBK2;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/model/constant/MapMode;Z)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdClusterManager.kt\nco/bird/android/app/feature/map/cluster/bird/BirdClusterManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1#2:188\n1855#3,2:189\n*S KotlinDebug\n*F\n+ 1 BirdClusterManager.kt\nco/bird/android/app/feature/map/cluster/bird/BirdClusterManager\n*L\n139#1:189,2\n*E\n"})
/* loaded from: classes2.dex */
public final class BirdClusterManager extends BaseBirdMarkerClusterManager<WireBird> {
    public static final Companion Companion = new Companion(null);
    private final List<WireBird> currentBirdsInRide;
    private final IconLoader iconLoader;
    private final UnreadyMarkerOverrides<WireBird> markerOverrides;
    private final EW0<BirdMarkerClusterItem<WireBird>> renderer;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\t"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManager$Companion;", "", "LfM2;", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItem;", "item", "", "showInfoWindow", "<init>", "()V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void showInfoWindow(C40889fM2 c40889fM2, BirdClusterItem item) {
            Intrinsics.checkNotNullParameter(c40889fM2, "<this>");
            Intrinsics.checkNotNullParameter(item, "item");
            c40889fM2.m41518p(item);
            c40889fM2.m41514t();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMode.CHARGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapMode.MERCHANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapMode.SERVICE_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdClusterManager(BirdClusterRendererFactory birdRendererFactory, OperatorClusterRendererFactory operatorRendererFactory, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC6097Oh buildConfig, BaseActivity activity, BK2 markerOverridesManager, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapMode mode, boolean z) {
        super(reactiveConfig, activity, markerOverridesManager, reactiveMapEvent, map, mode);
        EW0<BirdMarkerClusterItem<WireBird>> create;
        Intrinsics.checkNotNullParameter(birdRendererFactory, "birdRendererFactory");
        Intrinsics.checkNotNullParameter(operatorRendererFactory, "operatorRendererFactory");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        IconLoader iconLoader = new IconLoader(application, markerOverridesManager, reactiveConfig, buildConfig);
        this.iconLoader = iconLoader;
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            create = operatorRendererFactory.create(activity, map, getClusterManager());
        } else {
            create = birdRendererFactory.create(iconLoader, activity, map, getClusterManager());
        }
        this.renderer = create;
        this.markerOverrides = new UnreadyMarkerOverrideBirds(markerOverridesManager);
        this.currentBirdsInRide = new ArrayList();
        if (activity.mo58969Q() != EnumC4283Jy.OPERATOR) {
            init();
        }
    }

    public static /* synthetic */ void getIconLoader$annotations() {
    }

    private final void setInRideMarker(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        C40889fM2 marker = getRenderer().getMarker((EW0<BirdMarkerClusterItem<WireBird>>) birdMarkerClusterItem);
        if (marker != null) {
            marker.m41518p(birdMarkerClusterItem);
            getRenderer().renderMapMarkerState(birdMarkerClusterItem, marker);
        }
    }

    private final void setMapMarkerStateAndRender(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, BirdClusterItemState birdClusterItemState) {
        birdMarkerClusterItem.setState(birdClusterItemState);
        C40889fM2 marker = getRenderer().getMarker((EW0<BirdMarkerClusterItem<WireBird>>) birdMarkerClusterItem);
        if (marker != null) {
            marker.m41518p(birdMarkerClusterItem);
            getRenderer().renderMapMarkerState(birdMarkerClusterItem, marker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnClusterItemClickListener$lambda$8(BirdClusterManager this$0, Function2 listener, BirdMarkerClusterItem birdMarkerClusterItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        BirdMarkerClusterItem<WireBird> birdMarkerClusterItem2 = this$0.get(this$0.getClusterManager(), birdMarkerClusterItem.getMarker());
        if (birdMarkerClusterItem2 != null) {
            listener.invoke(birdMarkerClusterItem2.getMarker(), Boolean.valueOf(birdMarkerClusterItem2.isSelected()));
            this$0.setClickedMarker(birdMarkerClusterItem2.getMarker());
        }
        if (this$0.getMode() != MapMode.RIDER) {
            return true;
        }
        return false;
    }

    public final IconLoader getIconLoader() {
        return this.iconLoader;
    }

    public final synchronized BirdMarkerClusterItem<WireBird> getItem$co_bird_android_feature_map(WireBird bird) {
        BirdMarkerClusterItem<WireBird> birdMarkerClusterItem;
        Intrinsics.checkNotNullParameter(bird, "bird");
        birdMarkerClusterItem = get(getClusterManager(), bird);
        if (birdMarkerClusterItem == null) {
            birdMarkerClusterItem = getMarkerOverrides().heldItem(bird);
        }
        return birdMarkerClusterItem;
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public UnreadyMarkerOverrides<WireBird> getMarkerOverrides() {
        return this.markerOverrides;
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public EW0<BirdMarkerClusterItem<WireBird>> getRenderer() {
        return this.renderer;
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager, p000.C33116Gl0.InterfaceC2934b
    public boolean onClusterClick(InterfaceC32414Dl0<BirdMarkerClusterItem<WireBird>> cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        LatLngBounds.C17620a m50670s = LatLngBounds.m50670s();
        Intrinsics.checkNotNullExpressionValue(m50670s, "builder()");
        for (BirdMarkerClusterItem<WireBird> birdMarkerClusterItem : cluster.mo75548b()) {
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
            C41318g46.m40158f(e, "Exception on cluster click while animating camera", new Object[0]);
            return true;
        }
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void setOnClusterItemClickListener(final Function2<? super WireBird, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getClusterManager().m104793s(new C33116Gl0.InterfaceC2936d() { // from class: WK
            @Override // p000.C33116Gl0.InterfaceC2936d
            /* renamed from: a */
            public final boolean mo78587a(InterfaceC32648El0 interfaceC32648El0) {
                boolean onClusterItemClickListener$lambda$8;
                onClusterItemClickListener$lambda$8 = BirdClusterManager.setOnClusterItemClickListener$lambda$8(BirdClusterManager.this, listener, (BirdMarkerClusterItem) interfaceC32648El0);
                return onClusterItemClickListener$lambda$8;
            }
        });
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager, co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void closeInfoWindow(WireBird marker) {
        C40889fM2 marker2;
        Intrinsics.checkNotNullParameter(marker, "marker");
        BirdMarkerClusterItem<WireBird> birdMarkerClusterItem = get(getClusterManager(), marker);
        if (birdMarkerClusterItem == null || (marker2 = getRenderer().getMarker((EW0<BirdMarkerClusterItem<WireBird>>) birdMarkerClusterItem)) == null) {
            return;
        }
        marker2.m41530d();
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public BirdMarkerClusterItem<WireBird> markerClusterItem(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return new BirdClusterItem(wireBird, null, 2, null);
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public String markerId(WireBird marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return marker.getId();
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager
    public LatLng markerPosition(WireBird marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return new LatLng(marker.getLocation().getLatitude(), marker.getLocation().getLongitude());
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void reset(WireBird marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.currentBirdsInRide, (Function1) new BirdClusterManager$reset$1(marker));
        BirdMarkerClusterItem<WireBird> birdMarkerClusterItem = get(getClusterManager(), marker);
        if (birdMarkerClusterItem != null) {
            birdMarkerClusterItem.setState(BirdClusterItemState.AVAILABLE);
            deselectMarker(birdMarkerClusterItem);
            return;
        }
        BirdMarkerClusterItem<WireBird> heldItem = getMarkerOverrides().heldItem(marker);
        if (heldItem != null) {
            heldItem.setState(BirdClusterItemState.AVAILABLE);
        }
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void setInRide(WireBird marker, BirdClusterItemState birdClusterItemState) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (birdClusterItemState == null) {
            birdClusterItemState = BirdClusterItemState.ACTIVE_RIDE;
        }
        this.currentBirdsInRide.add(marker);
        BirdMarkerClusterItem<WireBird> birdMarkerClusterItem = get(getClusterManager(), marker);
        if (birdMarkerClusterItem != null) {
            birdMarkerClusterItem.setState(birdClusterItemState);
            setInRideMarker(birdMarkerClusterItem);
            return;
        }
        BirdMarkerClusterItem<WireBird> heldItem = getMarkerOverrides().heldItem(marker);
        if (heldItem != null) {
            heldItem.setState(birdClusterItemState);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r4 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r4);
     */
    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMapMarkerState(BirdClusterItemState mapMarkerState, WireBird wireBird) {
        List<WireBird> list;
        Intrinsics.checkNotNullParameter(mapMarkerState, "mapMarkerState");
        if (wireBird == null || list == null) {
            list = this.currentBirdsInRide;
        }
        for (WireBird wireBird2 : list) {
            BirdMarkerClusterItem<WireBird> birdMarkerClusterItem = get(getClusterManager(), wireBird2);
            if (birdMarkerClusterItem == null) {
                birdMarkerClusterItem = getMarkerOverrides().heldItem(wireBird2);
            }
            if (birdMarkerClusterItem != null) {
                setMapMarkerStateAndRender(birdMarkerClusterItem, mapMarkerState);
            }
        }
    }
}
