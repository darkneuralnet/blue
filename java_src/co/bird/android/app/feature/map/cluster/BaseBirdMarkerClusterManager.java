package co.bird.android.app.feature.map.cluster;

import co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItem;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.app.feature.map.infowindow.BirdInfoWindowAdapter;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33116Gl0;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 l*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003:\u0001lB7\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010O\u001a\u00020$¢\u0006\u0004\bj\u0010kJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004*\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0014\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010#\u001a\u00020\u000e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0!H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010\u0017J\b\u0010'\u001a\u00020\u000eH\u0004J\u001c\u0010)\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0010H\u0004J\u001c\u0010*\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0010H\u0004J\u0014\u0010-\u001a\u00020\u000e2\n\u0010,\u001a\u00060\u0006j\u0002`+H\u0004J\u0016\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0004J\u0016\u00100\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0004J0\u00102\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004012\u0006\u0010\u0005\u001a\u00028\u0000H\u0084\u0002¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u000204H\u0004R\u001a\u00107\u001a\u0002068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\u00020;8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR&\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004018\u0004X\u0084\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010W\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u0017R0\u0010\\\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR \u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006m"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;", "T", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager;", "LGl0$b;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "marker", "", "markerId", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/google/android/gms/maps/model/LatLng;", "markerPosition", "(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;", "markerClusterItem", "(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "", "clear", "", "markers", "set", "animateMarkers", "add", "reload", "remove", "(Ljava/lang/Object;)V", "", "selected", "(Ljava/lang/Object;Z)V", "select", "showInfoWindow", "deselect", "latLng", "move", "(Ljava/lang/Object;Lcom/google/android/gms/maps/model/LatLng;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnMarkerInfoItemClick", "Lco/bird/android/model/constant/MapMode;", "mapMode", "closeInfoWindow", "init", "markerItems", "addMarkerItems", "updateMarkerItems", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "overrideId", "setOverrideReadyToRender", "item", "selectMarker", "deselectMarker", "LGl0;", "get", "(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "LfM2;", "notifyInfoWindowClickListener", "LTq4;", "reactiveConfig", "LTq4;", "getReactiveConfig", "()LTq4;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/core/mvp/BaseActivity;", "getActivity", "()Lco/bird/android/core/mvp/BaseActivity;", "LBK2;", "markerOverridesManager", "LBK2;", "getMarkerOverridesManager", "()LBK2;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "getReactiveMapEvent", "()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "LcD1;", "map", "LcD1;", "getMap", "()LcD1;", "mode", "Lco/bird/android/model/constant/MapMode;", "getMode", "()Lco/bird/android/model/constant/MapMode;", "clusterManager", "LGl0;", "getClusterManager", "()LGl0;", "clickedMarker", "Ljava/lang/Object;", "getClickedMarker", "()Ljava/lang/Object;", "setClickedMarker", "currentInfoWindowClickListener", "Lkotlin/jvm/functions/Function1;", "getCurrentInfoWindowClickListener", "()Lkotlin/jvm/functions/Function1;", "setCurrentInfoWindowClickListener", "(Lkotlin/jvm/functions/Function1;)V", "LEW0;", "getRenderer", "()LEW0;", "renderer", "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "getMarkerOverrides", "()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "markerOverrides", "<init>", "(LTq4;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,362:1\n1222#2,4:363\n1855#2,2:367\n1549#2:369\n1620#2,3:370\n1549#2:373\n1620#2,3:374\n288#2,2:382\n1#3:377\n180#4:378\n180#4:379\n180#4:380\n180#4:381\n*S KotlinDebug\n*F\n+ 1 BirdMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager\n*L\n178#1:363,4\n179#1:367,2\n185#1:369\n185#1:370,3\n198#1:373\n198#1:374,3\n352#1:382,2\n277#1:378\n283#1:379\n289#1:380\n297#1:381\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseBirdMarkerClusterManager<T> implements BirdMarkerClusterManager<T>, C33116Gl0.InterfaceC2934b<BirdMarkerClusterItem<T>> {
    public static final Companion Companion = new Companion(null);
    private final BaseActivity activity;
    private T clickedMarker;
    private final C33116Gl0<BirdMarkerClusterItem<T>> clusterManager;
    private Function1<? super T, Unit> currentInfoWindowClickListener;
    private final C39011cD1 map;
    private final BK2 markerOverridesManager;
    private final MapMode mode;
    private final C36207Tq4 reactiveConfig;
    private final ReactiveMapEvent reactiveMapEvent;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¨\u0006\t"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;", "", "LfM2;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "item", "", "showInfoWindow", "<init>", "()V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void showInfoWindow(C40889fM2 c40889fM2, BirdMarkerClusterItem<?> item) {
            Intrinsics.checkNotNullParameter(c40889fM2, "<this>");
            Intrinsics.checkNotNullParameter(item, "item");
            c40889fM2.m41518p(item);
            c40889fM2.m41514t();
        }

        private Companion() {
        }
    }

    public BaseBirdMarkerClusterManager(C36207Tq4 reactiveConfig, BaseActivity activity, BK2 markerOverridesManager, ReactiveMapEvent reactiveMapEvent, C39011cD1 map, MapMode mode) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.reactiveConfig = reactiveConfig;
        this.activity = activity;
        this.markerOverridesManager = markerOverridesManager;
        this.reactiveMapEvent = reactiveMapEvent;
        this.map = map;
        this.mode = mode;
        this.clusterManager = new C33116Gl0<>(activity, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$16(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$17(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$18(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void add(List<? extends T> markers) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(markers, "markers");
        List<? extends T> list = markers;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        List<? extends BirdMarkerClusterItem<T>> arrayList = new ArrayList<>(collectionSizeOrDefault);
        for (T t : list) {
            arrayList.add(markerClusterItem(t));
        }
        addMarkerItems(arrayList);
    }

    public final void addMarkerItems(List<? extends BirdMarkerClusterItem<T>> markerItems) {
        Intrinsics.checkNotNullParameter(markerItems, "markerItems");
        this.clusterManager.m104804h(getMarkerOverrides().holdNonReadyItems(markerItems));
        this.clusterManager.m104802j();
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void animateMarkers() {
        getRenderer().startMarkerAnimation();
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void clear() {
        Collection<BirdMarkerClusterItem<T>> mo72963b = this.clusterManager.m104801k().mo72963b();
        Intrinsics.checkNotNullExpressionValue(mo72963b, "clusterManager.algorithm.items");
        if (!mo72963b.isEmpty()) {
            this.clusterManager.m104803i();
            this.clusterManager.m104802j();
        }
        getMarkerOverrides().clear();
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void closeInfoWindow(T t) {
        C40889fM2 marker;
        BirdMarkerClusterItem<T> birdMarkerClusterItem = get(this.clusterManager, t);
        if (birdMarkerClusterItem == null || (marker = getRenderer().getMarker((EW0<BirdMarkerClusterItem<T>>) birdMarkerClusterItem)) == null) {
            return;
        }
        marker.m41530d();
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void deselect(T t) {
        BirdMarkerClusterItem<T> birdMarkerClusterItem = get(this.clusterManager, t);
        if (birdMarkerClusterItem != null) {
            birdMarkerClusterItem.setState(BirdClusterItemState.AVAILABLE);
            deselectMarker(birdMarkerClusterItem);
            return;
        }
        BirdMarkerClusterItem<T> heldItem = getMarkerOverrides().heldItem(t);
        if (heldItem != null) {
            heldItem.setState(BirdClusterItemState.AVAILABLE);
        }
    }

    public final void deselectMarker(BirdMarkerClusterItem<T> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C40889fM2 marker = getRenderer().getMarker((EW0<BirdMarkerClusterItem<T>>) item);
        if (marker != null) {
            marker.m41518p(item);
            getRenderer().deselectItem(item, marker);
        }
    }

    public final BirdMarkerClusterItem<T> get(C33116Gl0<BirdMarkerClusterItem<T>> c33116Gl0, T t) {
        T t2;
        Intrinsics.checkNotNullParameter(c33116Gl0, "<this>");
        Collection<BirdMarkerClusterItem<T>> mo72963b = c33116Gl0.m104801k().mo72963b();
        Intrinsics.checkNotNullExpressionValue(mo72963b, "algorithm.items");
        Iterator<T> it = mo72963b.iterator();
        while (true) {
            if (it.hasNext()) {
                t2 = it.next();
                if (Intrinsics.areEqual(((BirdMarkerClusterItem) t2).getId(), markerId(t))) {
                    break;
                }
            } else {
                t2 = null;
                break;
            }
        }
        return (BirdMarkerClusterItem) t2;
    }

    public final BaseActivity getActivity() {
        return this.activity;
    }

    public final T getClickedMarker() {
        return this.clickedMarker;
    }

    public final C33116Gl0<BirdMarkerClusterItem<T>> getClusterManager() {
        return this.clusterManager;
    }

    public final Function1<T, Unit> getCurrentInfoWindowClickListener() {
        return (Function1<? super T, Unit>) this.currentInfoWindowClickListener;
    }

    public final C39011cD1 getMap() {
        return this.map;
    }

    public abstract UnreadyMarkerOverrides<T> getMarkerOverrides();

    public final BK2 getMarkerOverridesManager() {
        return this.markerOverridesManager;
    }

    public final MapMode getMode() {
        return this.mode;
    }

    public final C36207Tq4 getReactiveConfig() {
        return this.reactiveConfig;
    }

    public final ReactiveMapEvent getReactiveMapEvent() {
        return this.reactiveMapEvent;
    }

    public abstract EW0<BirdMarkerClusterItem<T>> getRenderer();

    public final void init() {
        this.clusterManager.m104792t(getRenderer());
        this.clusterManager.m104794r(this);
        Object m33094as = this.reactiveMapEvent.cameraIdles().m33094as(AutoDispose.m45239a(this.activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final BaseBirdMarkerClusterManager$init$1 baseBirdMarkerClusterManager$init$1 = new BaseBirdMarkerClusterManager$init$1(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ry
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseBirdMarkerClusterManager.init$lambda$15(Function1.this, obj);
            }
        });
        Object m33094as2 = this.reactiveMapEvent.markerClicks().m33094as(AutoDispose.m45239a(this.activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final BaseBirdMarkerClusterManager$init$2 baseBirdMarkerClusterManager$init$2 = new BaseBirdMarkerClusterManager$init$2(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Sy
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseBirdMarkerClusterManager.init$lambda$16(Function1.this, obj);
            }
        });
        Object m33094as3 = this.reactiveMapEvent.infoWindowClicks().m33094as(AutoDispose.m45239a(this.activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final BaseBirdMarkerClusterManager$init$3 baseBirdMarkerClusterManager$init$3 = new BaseBirdMarkerClusterManager$init$3(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Ty
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseBirdMarkerClusterManager.init$lambda$17(Function1.this, obj);
            }
        });
        Object m33094as4 = this.markerOverridesManager.mo114099b().m33094as(AutoDispose.m45239a(this.activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final BaseBirdMarkerClusterManager$init$4 baseBirdMarkerClusterManager$init$4 = new BaseBirdMarkerClusterManager$init$4(this);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Uy
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BaseBirdMarkerClusterManager.init$lambda$18(Function1.this, obj);
            }
        });
        this.map.m61672p(this.clusterManager.m104798n());
        this.map.m61672p(new BirdInfoWindowAdapter(this.activity, this.mode, this.reactiveConfig.m82623f8().getValue().getRiderMapConfig().getShowRangeInsteadOfBatteryPercentage()));
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public MapMode mapMode() {
        return this.mode;
    }

    public abstract BirdMarkerClusterItem<T> markerClusterItem(T t);

    public abstract String markerId(T t);

    public abstract LatLng markerPosition(T t);

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void move(T t, LatLng latLng) {
        C40889fM2 marker;
        BirdMarkerClusterItem<T> birdMarkerClusterItem = get(this.clusterManager, t);
        if (birdMarkerClusterItem != null && (marker = getRenderer().getMarker((EW0<BirdMarkerClusterItem<T>>) birdMarkerClusterItem)) != null) {
            if (latLng == null) {
                latLng = markerPosition(t);
            }
            marker.m41521m(latLng);
        }
    }

    public final void notifyInfoWindowClickListener(C40889fM2 marker) {
        Object obj;
        Intrinsics.checkNotNullParameter(marker, "marker");
        Function1<? super T, Unit> function1 = this.currentInfoWindowClickListener;
        if (function1 != null && (marker.m41531c() instanceof BirdClusterItem) && (obj = (T) this.clickedMarker) != null) {
            function1.invoke(obj);
        }
    }

    @Override // p000.C33116Gl0.InterfaceC2934b
    public abstract /* synthetic */ boolean onClusterClick(InterfaceC32414Dl0 interfaceC32414Dl0);

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void reload() {
        this.clusterManager.m104797o();
        this.clusterManager.m104802j();
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void remove(T t) {
        Unit unit;
        BirdMarkerClusterItem<T> birdMarkerClusterItem = get(this.clusterManager, t);
        if (birdMarkerClusterItem != null) {
            this.clusterManager.m104796p(birdMarkerClusterItem);
            this.clusterManager.m104802j();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            getMarkerOverrides().removeHeldItem(t);
        }
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void select(T t) {
        BirdMarkerClusterItem<T> birdMarkerClusterItem = get(this.clusterManager, t);
        if (birdMarkerClusterItem != null) {
            birdMarkerClusterItem.setState(BirdClusterItemState.SELECTED);
            selectMarker(birdMarkerClusterItem);
            return;
        }
        BirdMarkerClusterItem<T> heldItem = getMarkerOverrides().heldItem(t);
        if (heldItem != null) {
            heldItem.setState(BirdClusterItemState.SELECTED);
        }
    }

    public final void selectMarker(BirdMarkerClusterItem<T> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C40889fM2 marker = getRenderer().getMarker((EW0<BirdMarkerClusterItem<T>>) item);
        if (marker != null) {
            marker.m41518p(item);
            getRenderer().selectItem(item, marker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void set(List<? extends T> markers) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(markers, "markers");
        LinkedList linkedList = new LinkedList();
        LinkedHashMap linkedHashMap = new LinkedHashMap(markers.size());
        for (T t : markers) {
            linkedHashMap.put(markerId(t), t);
        }
        Collection<BirdMarkerClusterItem<T>> mo72963b = this.clusterManager.m104801k().mo72963b();
        Intrinsics.checkNotNullExpressionValue(mo72963b, "clusterManager.algorithm.items");
        Iterator<T> it = mo72963b.iterator();
        while (it.hasNext()) {
            BirdMarkerClusterItem birdMarkerClusterItem = (BirdMarkerClusterItem) it.next();
            Object obj = linkedHashMap.get(birdMarkerClusterItem.getId());
            if (obj != null) {
                linkedList.add(markerClusterItem(obj));
                linkedHashMap.remove(birdMarkerClusterItem.getId());
            }
        }
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "markerMap.values");
        Collection<T> collection = values;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (T t2 : collection) {
            arrayList.add(markerClusterItem(t2));
        }
        linkedList.addAll(arrayList);
        this.clusterManager.m104803i();
        getMarkerOverrides().clear();
        addMarkerItems(linkedList);
    }

    public final void setClickedMarker(T t) {
        this.clickedMarker = t;
    }

    public final void setCurrentInfoWindowClickListener(Function1<? super T, Unit> function1) {
        this.currentInfoWindowClickListener = function1;
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void setOnMarkerInfoItemClick(Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.currentInfoWindowClickListener = listener;
    }

    public final synchronized void setOverrideReadyToRender(String overrideId) {
        Intrinsics.checkNotNullParameter(overrideId, "overrideId");
        List<BirdMarkerClusterItem<T>> readyAndReleaseItemsFor = getMarkerOverrides().setReadyAndReleaseItemsFor(overrideId);
        if (!readyAndReleaseItemsFor.isEmpty()) {
            updateMarkerItems(readyAndReleaseItemsFor);
        }
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void showInfoWindow() {
        BirdMarkerClusterItem<T> birdMarkerClusterItem;
        C40889fM2 marker;
        T t = this.clickedMarker;
        if (t != null && (birdMarkerClusterItem = get(this.clusterManager, t)) != null && (marker = getRenderer().getMarker((EW0<BirdMarkerClusterItem<T>>) birdMarkerClusterItem)) != null) {
            marker.m41514t();
        }
    }

    public final void updateMarkerItems(List<? extends BirdMarkerClusterItem<T>> markerItems) {
        Intrinsics.checkNotNullParameter(markerItems, "markerItems");
        this.clusterManager.m104791u(getMarkerOverrides().holdNonReadyItems(markerItems));
        this.clusterManager.m104802j();
    }

    @Override // co.bird.android.app.feature.map.cluster.BirdMarkerClusterManager
    public void add(T t, boolean z) {
        BirdMarkerClusterItem<T> markerClusterItem = markerClusterItem(t);
        if (z) {
            markerClusterItem.setState(BirdClusterItemState.SELECTED);
        }
        if (getMarkerOverrides().holdIfNotReady(markerClusterItem)) {
            return;
        }
        this.clusterManager.m104805g(markerClusterItem);
        this.clusterManager.m104802j();
    }
}
