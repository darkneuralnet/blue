package co.bird.android.app.feature.map.cluster;

import co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.MarkerClusterItem;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33116Gl0;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 G*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004:\u0002GHB\u001f\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\bE\u0010FJ\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H$¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00028\u0000H$¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u0015\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0006\u0010\u0016\u001a\u00020\u0013J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001d\u001a\u00020\u00132\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00028\u0001H\u0004¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u0013H\u0004J$\u0010#\u001a\u0004\u0018\u00018\u0001*\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0005\u001a\u00028\u0000H\u0084\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020%H\u0014R\u001a\u0010(\u001a\u00020'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 ;*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010<R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R \u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A8$X¤\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006I"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;", "K", "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "T", "", "marker", "newMarker", "(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "existingClusterItem", "updateMarker", "(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "", "id", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;", "", "markers", "", "add", "set", "clear", "select", "(Ljava/lang/Object;)V", "deselect", "Lkotlin/Function2;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClusterItemClickListener", "item", "safeUpdateItem", "(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V", "init", "LGl0;", "get", "(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;", "LfM2;", "filterClickable", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/core/mvp/BaseActivity;", "getActivity", "()Lco/bird/android/core/mvp/BaseActivity;", "LcD1;", "map", "LcD1;", "getMap", "()LcD1;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "getReactiveMapEvent", "()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "clusterManager", "LGl0;", "getClusterManager", "()LGl0;", "LAG;", "kotlin.jvm.PlatformType", "LAG;", "Lg46$b;", "getLogger", "()Lg46$b;", "logger", "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;", "getRenderer", "()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;", "renderer", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)V", "Companion", "MarkerAction", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbstractMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n180#2:226\n161#2:227\n288#3,2:228\n*S KotlinDebug\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager\n*L\n112#1:226\n195#1:227\n209#1:228,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class AbstractMarkerClusterManager<K, T extends MarkerClusterItem<K>> {
    public static final Companion Companion = new Companion(null);
    private static final long FRAME_RENDER_DURATION_MS = 100;
    private final BaseActivity activity;
    private final C33116Gl0<T> clusterManager;
    private final C39011cD1 map;
    private final C0058AG<List<K>> markers;
    private final ReactiveMapEvent reactiveMapEvent;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$Companion;", "", "()V", "FRAME_RENDER_DURATION_MS", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;", "K", "", "()V", "AddMarkers", "ClearMarkers", "RemoveMarkers", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$ClearMarkers;", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$RemoveMarkers;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class MarkerAction<K> {

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004HÆ\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;", "K", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;", "markers", "", "(Ljava/util/List;)V", "getMarkers", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes2.dex */
        public static final class AddMarkers<K> extends MarkerAction<K> {
            private final List<K> markers;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AddMarkers(List<? extends K> markers) {
                super(null);
                Intrinsics.checkNotNullParameter(markers, "markers");
                this.markers = markers;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AddMarkers copy$default(AddMarkers addMarkers, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = addMarkers.markers;
                }
                return addMarkers.copy(list);
            }

            public final List<K> component1() {
                return this.markers;
            }

            public final AddMarkers<K> copy(List<? extends K> markers) {
                Intrinsics.checkNotNullParameter(markers, "markers");
                return new AddMarkers<>(markers);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddMarkers) && Intrinsics.areEqual(this.markers, ((AddMarkers) obj).markers);
            }

            public final List<K> getMarkers() {
                return this.markers;
            }

            public int hashCode() {
                return this.markers.hashCode();
            }

            public String toString() {
                List<K> list = this.markers;
                return "AddMarkers(markers=" + list + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$ClearMarkers;", "K", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;", "()V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes2.dex */
        public static final class ClearMarkers<K> extends MarkerAction<K> {
            public ClearMarkers() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004HÆ\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$RemoveMarkers;", "K", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;", "markers", "", "(Ljava/util/List;)V", "getMarkers", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes2.dex */
        public static final class RemoveMarkers<K> extends MarkerAction<K> {
            private final List<K> markers;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public RemoveMarkers(List<? extends K> markers) {
                super(null);
                Intrinsics.checkNotNullParameter(markers, "markers");
                this.markers = markers;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RemoveMarkers copy$default(RemoveMarkers removeMarkers, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = removeMarkers.markers;
                }
                return removeMarkers.copy(list);
            }

            public final List<K> component1() {
                return this.markers;
            }

            public final RemoveMarkers<K> copy(List<? extends K> markers) {
                Intrinsics.checkNotNullParameter(markers, "markers");
                return new RemoveMarkers<>(markers);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveMarkers) && Intrinsics.areEqual(this.markers, ((RemoveMarkers) obj).markers);
            }

            public final List<K> getMarkers() {
                return this.markers;
            }

            public int hashCode() {
                return this.markers.hashCode();
            }

            public String toString() {
                List<K> list = this.markers;
                return "RemoveMarkers(markers=" + list + ")";
            }
        }

        public /* synthetic */ MarkerAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MarkerAction() {
        }
    }

    public AbstractMarkerClusterManager(BaseActivity activity, C39011cD1 map, ReactiveMapEvent reactiveMapEvent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        this.activity = activity;
        this.map = map;
        this.reactiveMapEvent = reactiveMapEvent;
        this.clusterManager = new C33116Gl0<>(activity, map);
        C0058AG<List<K>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<List<K>>()");
        this.markers = m115951g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C41318g46.AbstractC20723b getLogger() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k(String.valueOf(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName()));
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"${this::class.simpleName}\")");
        return m40153k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VisibleRegion init$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (VisibleRegion) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair init$lambda$4(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC45761na4 init$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnClusterItemClickListener$lambda$0(Function2 listener, MarkerClusterItem markerClusterItem) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.invoke(markerClusterItem.getMarker(), Boolean.valueOf(markerClusterItem.getSelected()));
        return true;
    }

    public final void add(List<? extends K> markers) {
        List<K> plus;
        Intrinsics.checkNotNullParameter(markers, "markers");
        C0058AG<List<K>> c0058ag = this.markers;
        List<K> value = c0058ag.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) value, (Iterable) markers);
        c0058ag.accept(plus);
    }

    public final void clear() {
        List<K> emptyList;
        Collection<T> mo72963b = this.clusterManager.m104801k().mo72963b();
        Intrinsics.checkNotNullExpressionValue(mo72963b, "clusterManager.algorithm.items");
        if (!mo72963b.isEmpty()) {
            C0058AG<List<K>> c0058ag = this.markers;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            c0058ag.accept(emptyList);
        }
    }

    public final void deselect(K k) {
        T t = get(this.clusterManager, k);
        if (t == null) {
            return;
        }
        t.setSelected(false);
        safeUpdateItem(t);
    }

    public boolean filterClickable(C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return true;
    }

    public final T get(C33116Gl0<T> c33116Gl0, K k) {
        Object obj;
        Intrinsics.checkNotNullParameter(c33116Gl0, "<this>");
        Collection<T> mo72963b = c33116Gl0.m104801k().mo72963b();
        Intrinsics.checkNotNullExpressionValue(mo72963b, "algorithm.items");
        Iterator<T> it = mo72963b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((MarkerClusterItem) obj).getId(), mo60514id(k))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (T) obj;
    }

    public final BaseActivity getActivity() {
        return this.activity;
    }

    public final C33116Gl0<T> getClusterManager() {
        return this.clusterManager;
    }

    public final C39011cD1 getMap() {
        return this.map;
    }

    public final ReactiveMapEvent getReactiveMapEvent() {
        return this.reactiveMapEvent;
    }

    public abstract AbstractMarkerClusterRenderer<K, T> getRenderer();

    /* renamed from: id */
    public abstract String mo60514id(K k);

    public final void init() {
        this.clusterManager.m104792t(getRenderer());
        Observable<C40889fM2> markerClicks = this.reactiveMapEvent.markerClicks();
        final AbstractMarkerClusterManager$init$1 abstractMarkerClusterManager$init$1 = new AbstractMarkerClusterManager$init$1(this);
        Observable<C40889fM2> filter = markerClicks.filter(new InterfaceC23494q() { // from class: Q0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean init$lambda$1;
                init$lambda$1 = AbstractMarkerClusterManager.init$lambda$1(Function1.this, obj);
                return init$lambda$1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "protected fun init() {\n …ger.cluster()\n      }\n  }");
        Object m33094as = filter.m33094as(AutoDispose.m45239a(this.activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final AbstractMarkerClusterManager$init$2 abstractMarkerClusterManager$init$2 = new AbstractMarkerClusterManager$init$2(this.clusterManager);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: R0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractMarkerClusterManager.init$lambda$2(Function1.this, obj);
            }
        });
        C0058AG<List<K>> c0058ag = this.markers;
        Observable<Unit> cameraMoves = this.reactiveMapEvent.cameraMoves();
        final AbstractMarkerClusterManager$init$3 abstractMarkerClusterManager$init$3 = new AbstractMarkerClusterManager$init$3(this);
        Observable<R> map = cameraMoves.map(new InterfaceC23492o() { // from class: S0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                VisibleRegion init$lambda$3;
                init$lambda$3 = AbstractMarkerClusterManager.init$lambda$3(Function1.this, obj);
                return init$lambda$3;
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable throttleLatest = map.throttleLatest(100L, timeUnit);
        final AbstractMarkerClusterManager$init$4 abstractMarkerClusterManager$init$4 = AbstractMarkerClusterManager$init$4.INSTANCE;
        AbstractC24490k flowable = Observable.combineLatest(c0058ag, throttleLatest, new InterfaceC23480c() { // from class: T0
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair init$lambda$4;
                init$lambda$4 = AbstractMarkerClusterManager.init$lambda$4(Function2.this, obj, obj2);
                return init$lambda$4;
            }
        }).delay(100L, timeUnit).subscribeOn(C24542a.m31933b(Executors.newSingleThreadExecutor())).toFlowable(EnumC23460b.LATEST);
        final AbstractMarkerClusterManager$init$5 abstractMarkerClusterManager$init$5 = new AbstractMarkerClusterManager$init$5(this);
        AbstractC24490k m32111s0 = flowable.m32157b1(new InterfaceC23492o() { // from class: U0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 init$lambda$5;
                init$lambda$5 = AbstractMarkerClusterManager.init$lambda$5(Function1.this, obj);
                return init$lambda$5;
            }
        }).m32209B().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "K, T: MarkerClusterItem<…ger.cluster()\n      }\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.activity));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final AbstractMarkerClusterManager$init$6 abstractMarkerClusterManager$init$6 = new AbstractMarkerClusterManager$init$6(this);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: V0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractMarkerClusterManager.init$lambda$6(Function1.this, obj);
            }
        });
    }

    public abstract LatLng latLng(K k);

    public abstract T newMarker(K k);

    public final void safeUpdateItem(T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        try {
            AbstractMarkerClusterRenderer<K, T> renderer = getRenderer();
            C40889fM2 marker = getRenderer().getMarker((AbstractMarkerClusterRenderer<K, T>) item);
            Intrinsics.checkNotNullExpressionValue(marker, "renderer.getMarker(item)");
            renderer.updateItem(item, marker);
        } catch (Exception unused) {
        }
    }

    public final void select(K k) {
        T t = get(this.clusterManager, k);
        if (t == null) {
            return;
        }
        t.setSelected(true);
        safeUpdateItem(t);
    }

    public final void set(List<? extends K> markers) {
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.markers.accept(markers);
    }

    public final void setOnClusterItemClickListener(final Function2<? super K, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.clusterManager.m104793s(new C33116Gl0.InterfaceC2936d() { // from class: W0
            @Override // p000.C33116Gl0.InterfaceC2936d
            /* renamed from: a */
            public final boolean mo78587a(InterfaceC32648El0 interfaceC32648El0) {
                boolean onClusterItemClickListener$lambda$0;
                onClusterItemClickListener$lambda$0 = AbstractMarkerClusterManager.setOnClusterItemClickListener$lambda$0(Function2.this, (MarkerClusterItem) interfaceC32648El0);
                return onClusterItemClickListener$lambda$0;
            }
        });
    }

    public abstract T updateMarker(K k, T t);
}
