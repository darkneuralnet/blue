package co.bird.android.app.feature.map.p008ui.renderer;

import android.location.Location;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer$worldPolygonable$2;
import co.bird.android.model.LinearRing;
import co.bird.android.model.Point;
import co.bird.android.model.Polygonable;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.configs.MobileMapConfigView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23450a;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001-\u0018\u0000 52\u00020\u0001:\u000256B1\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b3\u00104J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000e0\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R.\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 #*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00060\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$RF\u0010'\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006 #*\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010&0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002 #*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e0\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u001e\u0010+\u001a\f\u0012\b\u0012\u00060*R\u00020\u00000)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u0006B²\u0006\u0014\u00108\u001a\n #*\u0004\u0018\u000107078\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\u000e\u0010;\u001a\u0004\u0018\u0001078\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\u000e\u0010=\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020>8\nX\u008a\u0084\u0002²\u0006\f\u0010A\u001a\u00020>8\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;", "", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "Lco/bird/android/model/Polygonable;", "resolveClickedPolygonable", "", "polygonables", "", "setPolygonables", "", "key", "setAdditionalPolygonable", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "polygonClicks", "LcD1;", "map", "LcD1;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lcom/uber/autodispose/ScopeProvider;", "Lco/bird/android/model/wire/configs/MobileMapConfigView;", "mapConfig", "Lco/bird/android/model/wire/configs/MobileMapConfigView;", "Ldr4;", "locationManager", "Ldr4;", "Lg46$b;", "logger", "Lg46$b;", "Lma4;", "kotlin.jvm.PlatformType", "Lma4;", "LAG;", "", "additionalPolygonables", "LAG;", "Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;", "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;", "polygonablePolygons", "Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;", "co/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1", "worldPolygonable$delegate", "Lkotlin/Lazy;", "getWorldPolygonable", "()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;", "worldPolygonable", "<init>", "(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V", "Companion", "PolygonWrapper", "LCX3;", "visibleRegionGeom", "", "visibleSize", "geom", "polygonableSize", "zoomModifiedPolygon", "", "visibleRegionIntersects", "polygonRelativeSizeMet", "polygonZoomMet", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,518:1\n161#2:519\n180#2:520\n125#3:521\n152#3,3:522\n1549#4:525\n1620#4,3:526\n766#4:536\n857#4,2:537\n2333#4,14:539\n515#5:529\n500#5,6:530\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer\n*L\n237#1:519\n257#1:520\n270#1:521\n270#1:522,3\n275#1:525\n275#1:526,3\n292#1:536\n292#1:537,2\n293#1:539,14\n290#1:529\n290#1:530,6\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer */
/* loaded from: classes2.dex */
public final class MapPolygonableRenderer {
    private static final long FRAME_RENDER_TIME_US = 8330;
    private static final int POLYGONABLE_BORDER_STROKE_THICKNESS_DP = 1;
    private static final double POLYGONABLE_VISIBILITY_THRESHOLD_PERCENTAGE = 5.0E-4d;
    private static final float POLYGONABLE_ZOOM_LEVEL_ALWAYS_SHOW_THRESHOLD = 15.0f;
    private static final String WORLD_POLYGONABLE_ID;
    private final C0058AG<Map<String, List<Polygonable>>> additionalPolygonables;
    private final InterfaceC40001dr4 locationManager;
    private final C41318g46.AbstractC20723b logger;
    private final C39011cD1 map;
    private final MobileMapConfigView mapConfig;
    private final C45168ma4<Pair<Polygonable, LatLng>> polygonClicks;
    private final PolygonableMap<PolygonWrapper> polygonablePolygons;
    private final C45168ma4<List<Polygonable>> polygonables;
    private final ReactiveMapEvent reactiveMapEvent;
    private final ScopeProvider scope;
    private final Lazy worldPolygonable$delegate;
    public static final Companion Companion = new Companion(null);
    private static final LinearRing WORLD_RING = new LinearRing(new Point[]{new Point(-180.0d, -89.999999999999d), new Point(-180.0d, 89.99999999999d), new Point(179.99999999d, 89.99999999999d), new Point(179.99999999d, -89.99999999999d), new Point(0.0d, -89.99999999999d)});

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/VisibleRegion;", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$1 */
    /* loaded from: classes2.dex */
    public static final class C138751 extends Lambda implements Function1<Unit, Pair<? extends VisibleRegion, ? extends Float>> {
        public C138751() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<VisibleRegion, Float> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TuplesKt.m28425to(MapPolygonableRenderer.this.map.m61677k().m81934b(), Float.valueOf(MapPolygonableRenderer.this.map.m61679i().f71395c));
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u000bH\n¢\u0006\u0002\b\f"}, m28432d2 = {"<anonymous>", "Lkotlin/Triple;", "", "Lco/bird/android/model/Polygonable;", "Lcom/google/android/gms/maps/model/VisibleRegion;", "", "polygonables", "additionalPolygonables", "", "", "pair", "Lkotlin/Pair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$2 */
    /* loaded from: classes2.dex */
    public static final class C138762 extends Lambda implements Function3<List<? extends Polygonable>, Map<String, ? extends List<? extends Polygonable>>, Pair<? extends VisibleRegion, ? extends Float>, Triple<? extends List<? extends Polygonable>, ? extends VisibleRegion, ? extends Float>> {
        public static final C138762 INSTANCE = new C138762();

        public C138762() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Triple<? extends List<? extends Polygonable>, ? extends VisibleRegion, ? extends Float> invoke(List<? extends Polygonable> list, Map<String, ? extends List<? extends Polygonable>> map, Pair<? extends VisibleRegion, ? extends Float> pair) {
            return invoke2(list, map, (Pair<VisibleRegion, Float>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Triple<List<Polygonable>, VisibleRegion, Float> invoke2(List<? extends Polygonable> polygonables, Map<String, ? extends List<? extends Polygonable>> additionalPolygonables, Pair<VisibleRegion, Float> pair) {
            List flatten;
            List plus;
            Intrinsics.checkNotNullParameter(polygonables, "polygonables");
            Intrinsics.checkNotNullParameter(additionalPolygonables, "additionalPolygonables");
            Intrinsics.checkNotNullParameter(pair, "pair");
            flatten = CollectionsKt__IterablesKt.flatten(additionalPolygonables.values());
            plus = CollectionsKt___CollectionsKt.plus((Collection) polygonables, (Iterable) flatten);
            return new Triple<>(plus, pair.getFirst(), pair.getSecond());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Polygonable;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1855#2:519\n1856#2:521\n1855#2,2:522\n1#3:520\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4\n*L\n240#1:519\n240#1:521\n246#1:522,2\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$4 */
    /* loaded from: classes2.dex */
    public static final class C138814 extends Lambda implements Function1<Pair<? extends List<? extends Polygonable>, ? extends List<? extends Polygonable>>, Unit> {
        public C138814() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends Polygonable>, ? extends List<? extends Polygonable>> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<? extends Polygonable>, ? extends List<? extends Polygonable>> pair) {
            List<? extends Polygonable> polygonablesToAdd = pair.component1();
            List<? extends Polygonable> polygonablesToRemove = pair.component2();
            Intrinsics.checkNotNullExpressionValue(polygonablesToAdd, "polygonablesToAdd");
            MapPolygonableRenderer mapPolygonableRenderer = MapPolygonableRenderer.this;
            for (Polygonable polygonable : polygonablesToAdd) {
                PolygonWrapper polygonWrapper = (PolygonWrapper) mapPolygonableRenderer.polygonablePolygons.get((Object) polygonable);
                if (polygonWrapper == null) {
                    polygonWrapper = new PolygonWrapper(mapPolygonableRenderer, polygonable);
                    mapPolygonableRenderer.polygonablePolygons.putIfAbsent(polygonable, (Polygonable) polygonWrapper);
                }
                polygonWrapper.addToMap();
            }
            Intrinsics.checkNotNullExpressionValue(polygonablesToRemove, "polygonablesToRemove");
            MapPolygonableRenderer mapPolygonableRenderer2 = MapPolygonableRenderer.this;
            for (Polygonable polygonable2 : polygonablesToRemove) {
                PolygonWrapper polygonWrapper2 = (PolygonWrapper) mapPolygonableRenderer2.polygonablePolygons.get((Object) polygonable2);
                if (polygonWrapper2 != null) {
                    polygonWrapper2.removeFromMap();
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/Polygonable;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "latLng", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$5 */
    /* loaded from: classes2.dex */
    public static final class C138825 extends Lambda implements Function1<LatLng, Pair<? extends Polygonable, ? extends LatLng>> {
        public C138825() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<Polygonable, LatLng> invoke(LatLng latLng) {
            Intrinsics.checkNotNullParameter(latLng, "latLng");
            return TuplesKt.m28425to(MapPolygonableRenderer.this.resolveClickedPolygonable(latLng), latLng);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Polygonable;", "Lcom/google/android/gms/maps/model/LatLng;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$6 */
    /* loaded from: classes2.dex */
    public static final class C138836 extends Lambda implements Function1<Pair<? extends Polygonable, ? extends LatLng>, Boolean> {
        public static final C138836 INSTANCE = new C138836();

        public C138836() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends Polygonable, LatLng> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1() != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Polygonable, ? extends LatLng> pair) {
            return invoke2((Pair<? extends Polygonable, LatLng>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/Polygonable;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "pair", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$7 */
    /* loaded from: classes2.dex */
    public static final class C138847 extends Lambda implements Function1<Pair<? extends Polygonable, ? extends LatLng>, Pair<? extends Polygonable, ? extends LatLng>> {
        public static final C138847 INSTANCE = new C138847();

        public C138847() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<Polygonable, LatLng> invoke2(Pair<? extends Polygonable, LatLng> pair) {
            Intrinsics.checkNotNullParameter(pair, "pair");
            return pair;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends Polygonable, ? extends LatLng> invoke(Pair<? extends Polygonable, ? extends LatLng> pair) {
            return invoke2((Pair<? extends Polygonable, LatLng>) pair);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$8 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138858 extends FunctionReferenceImpl implements Function1<Pair<? extends Polygonable, ? extends LatLng>, Unit> {
        public C138858(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Polygonable, ? extends LatLng> pair) {
            invoke2((Pair<? extends Polygonable, LatLng>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Polygonable, LatLng> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$Companion;", "", "()V", "FRAME_RENDER_TIME_US", "", "POLYGONABLE_BORDER_STROKE_THICKNESS_DP", "", "POLYGONABLE_VISIBILITY_THRESHOLD_PERCENTAGE", "", "POLYGONABLE_ZOOM_LEVEL_ALWAYS_SHOW_THRESHOLD", "", "WORLD_POLYGONABLE_ID", "", "WORLD_RING", "Lco/bird/android/model/LinearRing;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0014\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b%\u0010&*\u0004\b'\u0010(R$\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00100\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010\u0013R\u0011\u00101\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b1\u0010\u0013¨\u00064"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;", "", "", "setModified", "", "LWB1;", "holes", "simplifyHoles", "Lco/bird/android/model/persistence/Area;", "areas", "setHolesFromAreas", "addToMap", "removeFromMap", "Lco/bird/android/model/Polygonable;", "_polygonable", "Lco/bird/android/model/Polygonable;", "", "isModified", "Z", "()Z", "(Z)V", "", "size", "D", "getSize", "()D", "LDX3;", "polygon", "LDX3;", "", "LCX3;", "Ljava/util/List;", "areasToCut", "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;", "Lcom/google/android/gms/maps/model/PolygonOptions;", "resettableOptions", "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;", "getOption", "()Lcom/google/android/gms/maps/model/PolygonOptions;", "getOption$delegate", "(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;)Ljava/lang/Object;", "option", "value", "getPolygonable", "()Lco/bird/android/model/Polygonable;", "setPolygonable", "(Lco/bird/android/model/Polygonable;)V", "polygonable", "isAdded", "isLatestRendered", "<init>", "(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/model/Polygonable;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n11335#2:519\n11670#2,3:520\n1549#3:523\n1620#3,3:524\n1549#3:527\n1620#3,3:528\n1549#3:531\n1620#3,3:532\n1054#3:536\n1789#3,3:537\n1#4:535\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper\n*L\n313#1:519\n313#1:520,3\n353#1:523\n353#1:524,3\n362#1:527\n362#1:528,3\n364#1:531\n364#1:532,3\n396#1:536\n412#1:537,3\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$PolygonWrapper */
    /* loaded from: classes2.dex */
    public final class PolygonWrapper {
        private Polygonable _polygonable;
        private final List<Polygonable> areasToCut;
        private final List<CX3> holes;
        private boolean isModified;
        private DX3 polygon;
        private final MutableLazy<PolygonOptions> resettableOptions;
        private final double size;
        final /* synthetic */ MapPolygonableRenderer this$0;

        public PolygonWrapper(MapPolygonableRenderer mapPolygonableRenderer, Polygonable _polygonable) {
            Intrinsics.checkNotNullParameter(_polygonable, "_polygonable");
            this.this$0 = mapPolygonableRenderer;
            this._polygonable = _polygonable;
            Point[] points = getPolygonable().getRegion().getRing(0).getPoints();
            Intrinsics.checkNotNullExpressionValue(points, "polygonable.region.getRing(0).points");
            ArrayList arrayList = new ArrayList(points.length);
            for (Point point : points) {
                Intrinsics.checkNotNullExpressionValue(point, "point");
                arrayList.add(GoogleMap_Kt.toLatLng(point));
            }
            this.size = RN5.m86796b(arrayList);
            this.holes = new ArrayList();
            this.areasToCut = new ArrayList();
            this.resettableOptions = MutableLazy.Companion.resettableLazy(new MapPolygonableRenderer$PolygonWrapper$resettableOptions$1(this));
        }

        private final PolygonOptions getOption() {
            return this.resettableOptions.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v8, types: [WB1, java.lang.Object] */
        private final List<WB1> simplifyHoles(List<? extends WB1> list) {
            List sortedWith;
            Sequence asSequence;
            Sequence mapIndexedNotNull;
            Object firstOrNull;
            List listOf;
            Set union;
            List list2;
            Object first;
            List<? extends WB1> plus;
            if (list.size() == 1) {
                return list;
            }
            List<? extends WB1> list3 = list;
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(list3, new Comparator() { // from class: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$PolygonWrapper$simplifyHoles$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compareValues;
                    compareValues = ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(((WB1) t2).mo77242M()), Double.valueOf(((WB1) t).mo77242M()));
                    return compareValues;
                }
            });
            asSequence = CollectionsKt___CollectionsKt.asSequence(sortedWith);
            mapIndexedNotNull = SequencesKt___SequencesKt.mapIndexedNotNull(asSequence, new C13892x325e1987(list));
            firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapIndexedNotNull);
            Pair pair = (Pair) firstOrNull;
            if (pair != null) {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new WB1[]{(WB1) pair.component1(), (WB1) pair.component2()});
                union = CollectionsKt___CollectionsKt.union(listOf, list3);
                list2 = CollectionsKt___CollectionsKt.toList(union);
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
                    for (WB1 wb1 : list2.subList(1, list.size() - 1)) {
                        first = (WB1) first;
                        if (!first.m78751o(wb1)) {
                            if (!first.m78748q(wb1) && !first.m78764H0(wb1)) {
                                arrayList.add(wb1);
                            } else {
                                first = first.m78763I0(wb1);
                                Intrinsics.checkNotNullExpressionValue(first, "geometry.union(hole)");
                            }
                        }
                    }
                    plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WB1>) ((Collection<? extends Object>) arrayList), (WB1) first);
                    return simplifyHoles(plus);
                }
                return list;
            }
            return list;
        }

        public final void addToMap() {
            if (isLatestRendered()) {
                return;
            }
            if (isAdded()) {
                removeFromMap();
            }
            DX3 m61684d = this.this$0.map.m61684d(getOption());
            m61684d.m110282d(getPolygonable());
            this.polygon = m61684d;
            this.isModified = false;
        }

        public final Polygonable getPolygonable() {
            return this._polygonable;
        }

        public final double getSize() {
            return this.size;
        }

        public final boolean isAdded() {
            return this.polygon != null;
        }

        public final boolean isLatestRendered() {
            return isAdded() && !this.isModified;
        }

        public final boolean isModified() {
            return this.isModified;
        }

        public final void removeFromMap() {
            DX3 dx3 = this.polygon;
            if (dx3 != null) {
                dx3.m110283c();
                Unit unit = Unit.INSTANCE;
                this.polygon = null;
            }
        }

        public final void setHolesFromAreas(List<Area> areas) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            int collectionSizeOrDefault4;
            Intrinsics.checkNotNullParameter(areas, "areas");
            if (this.areasToCut.size() == areas.size()) {
                List<Polygonable> list = this.areasToCut;
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault3);
                for (Polygonable polygonable : list) {
                    arrayList.add(polygonable.getId());
                }
                List<Area> list2 = areas;
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault4);
                for (Area area : list2) {
                    arrayList2.add(area.getId());
                }
                if (arrayList.containsAll(arrayList2)) {
                    return;
                }
            }
            this.areasToCut.clear();
            this.areasToCut.addAll(areas);
            List<Area> list3 = areas;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (Area area2 : list3) {
                arrayList3.add(area2.getJtsRegion());
            }
            List<WB1> simplifyHoles = simplifyHoles(arrayList3);
            this.holes.clear();
            List<CX3> list4 = this.holes;
            List<WB1> list5 = simplifyHoles;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
            for (WB1 wb1 : list5) {
                Intrinsics.checkNotNull(wb1, "null cannot be cast to non-null type org.locationtech.jts.geom.Polygon");
                arrayList4.add((CX3) wb1);
            }
            list4.addAll(arrayList4);
            setModified();
        }

        public final void setModified(boolean z) {
            this.isModified = z;
        }

        public final void setPolygonable(Polygonable value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(value, this._polygonable)) {
                setModified();
            }
            this._polygonable = value;
        }

        private final void setModified() {
            this.isModified = true;
            this.resettableOptions.reset();
        }
    }

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        WORLD_POLYGONABLE_ID = uuid;
    }

    public MapPolygonableRenderer(C39011cD1 map, ReactiveMapEvent reactiveMapEvent, ScopeProvider scope, MobileMapConfigView mobileMapConfigView, InterfaceC40001dr4 locationManager) {
        Lazy lazy;
        Map<String, List<Polygonable>> emptyMap;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.map = map;
        this.reactiveMapEvent = reactiveMapEvent;
        this.scope = scope;
        this.mapConfig = mobileMapConfigView;
        this.locationManager = locationManager;
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("MapPolygonableRenderer");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"MapPolygonableRenderer\")");
        this.logger = m40153k;
        C45168ma4<List<Polygonable>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<Polygonable>>()");
        this.polygonables = m25409g;
        C0058AG<Map<String, List<Polygonable>>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Map<String, List<Polygonable>>>()");
        this.additionalPolygonables = m115951g;
        C45168ma4<Pair<Polygonable, LatLng>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Pair<Polygonable, LatLng>>()");
        this.polygonClicks = m25409g2;
        this.polygonablePolygons = new PolygonableMap<>();
        lazy = LazyKt__LazyJVMKt.lazy(new MapPolygonableRenderer$worldPolygonable$2(this));
        this.worldPolygonable$delegate = lazy;
        emptyMap = MapsKt__MapsKt.emptyMap();
        Observable<Map<String, List<Polygonable>>> startWith = m115951g.startWith((C0058AG<Map<String, List<Polygonable>>>) emptyMap);
        Observable<Unit> startWith2 = reactiveMapEvent.cameraMoves().startWith(Observable.just(Unit.INSTANCE).observeOn(C23454a.m33087a()));
        final C138751 c138751 = new C138751();
        Observable throttleLatest = startWith2.map(new InterfaceC23492o() { // from class: DK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair _init_$lambda$0;
                _init_$lambda$0 = MapPolygonableRenderer._init_$lambda$0(Function1.this, obj);
                return _init_$lambda$0;
            }
        }).throttleLatest(FRAME_RENDER_TIME_US, TimeUnit.MICROSECONDS);
        final C138762 c138762 = C138762.INSTANCE;
        AbstractC24490k flowable = Observable.combineLatest(m25409g, startWith, throttleLatest, new InterfaceC23485h() { // from class: EK2
            @Override // io.reactivex.functions.InterfaceC23485h
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Triple _init_$lambda$1;
                _init_$lambda$1 = MapPolygonableRenderer._init_$lambda$1(Function3.this, obj, obj2, obj3);
                return _init_$lambda$1;
            }
        }).subscribeOn(C24542a.m31933b(Executors.newSingleThreadExecutor())).toFlowable(EnumC23460b.LATEST);
        final C138773 c138773 = new C138773();
        AbstractC24490k m32111s0 = flowable.m32157b1(new InterfaceC23492o() { // from class: FK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 _init_$lambda$2;
                _init_$lambda$2 = MapPolygonableRenderer._init_$lambda$2(Function1.this, obj);
                return _init_$lambda$2;
            }
        }).m32100w0(120L, null, EnumC23450a.DROP_LATEST).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "combineLatest(\n      pol…dSchedulers.mainThread())");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(scope));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138814 c138814 = new C138814();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: GK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPolygonableRenderer._init_$lambda$3(Function1.this, obj);
            }
        });
        Observable<LatLng> observeOn = reactiveMapEvent.mapClicks().observeOn(C24542a.m31934a());
        final C138825 c138825 = new C138825();
        Observable<R> map2 = observeOn.map(new InterfaceC23492o() { // from class: HK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair _init_$lambda$4;
                _init_$lambda$4 = MapPolygonableRenderer._init_$lambda$4(Function1.this, obj);
                return _init_$lambda$4;
            }
        });
        final C138836 c138836 = C138836.INSTANCE;
        Observable filter = map2.filter(new InterfaceC23494q() { // from class: IK2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean _init_$lambda$5;
                _init_$lambda$5 = MapPolygonableRenderer._init_$lambda$5(Function1.this, obj);
                return _init_$lambda$5;
            }
        });
        final C138847 c138847 = C138847.INSTANCE;
        Observable map3 = filter.map(new InterfaceC23492o() { // from class: JK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair _init_$lambda$6;
                _init_$lambda$6 = MapPolygonableRenderer._init_$lambda$6(Function1.this, obj);
                return _init_$lambda$6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "reactiveMapEvent.mapClic…ygonable, LatLng>\n      }");
        Object m33094as = map3.m33094as(AutoDispose.m45239a(scope));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138858 c138858 = new C138858(m25409g2);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: KK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPolygonableRenderer._init_$lambda$7(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple _init_$lambda$1(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC45761na4 _init_$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair _init_$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair _init_$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapPolygonableRenderer$worldPolygonable$2.C138941 getWorldPolygonable() {
        return (MapPolygonableRenderer$worldPolygonable$2.C138941) this.worldPolygonable$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Polygonable resolveClickedPolygonable(LatLng latLng) {
        Object obj;
        PolygonableMap<PolygonWrapper> polygonableMap = this.polygonablePolygons;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Polygonable, PolygonWrapper> entry : polygonableMap.entrySet()) {
            if (entry.getValue().isAdded()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : keySet) {
            if (GoogleMap_Kt.contains(((Polygonable) obj2).getRegion(), latLng)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                double m86796b = RN5.m86796b(GoogleMap_Kt.toPoints(((Polygonable) next).getRegion()));
                do {
                    Object next2 = it.next();
                    double m86796b2 = RN5.m86796b(GoogleMap_Kt.toPoints(((Polygonable) next2).getRegion()));
                    if (Double.compare(m86796b, m86796b2) > 0) {
                        next = next2;
                        m86796b = m86796b2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Polygonable) obj;
    }

    public final Observable<Pair<Polygonable, LatLng>> polygonClicks() {
        Observable<Pair<Polygonable, LatLng>> hide = this.polygonClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "polygonClicks.hide()");
        return hide;
    }

    public final void setAdditionalPolygonable(String key, List<? extends Polygonable> polygonables) {
        int collectionSizeOrDefault;
        Collection plus;
        Map<String, List<Polygonable>> map;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(polygonables, "polygonables");
        Map<String, List<Polygonable>> value = this.additionalPolygonables.getValue();
        if (value == null) {
            value = MapsKt__MapsKt.emptyMap();
        }
        C0058AG<Map<String, List<Polygonable>>> c0058ag = this.additionalPolygonables;
        if (value.containsKey(key)) {
            plus = new ArrayList(value.size());
            for (Map.Entry<String, List<Polygonable>> entry : value.entrySet()) {
                String key2 = entry.getKey();
                List<Polygonable> value2 = entry.getValue();
                if (Intrinsics.areEqual(key, key2)) {
                    value2 = polygonables;
                }
                plus.add(TuplesKt.m28425to(key2, value2));
            }
        } else {
            Set<Map.Entry<String, List<Polygonable>>> entrySet = value.entrySet();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                arrayList.add(TuplesKt.m28425to((String) entry2.getKey(), (List) entry2.getValue()));
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends Pair>) ((Collection<? extends Object>) arrayList), TuplesKt.m28425to(key, polygonables));
        }
        map = MapsKt__MapsKt.toMap(plus);
        c0058ag.accept(map);
    }

    public final void setPolygonables(List<? extends Polygonable> polygonables) {
        Intrinsics.checkNotNullParameter(polygonables, "polygonables");
        this.polygonables.accept(polygonables);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \b*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00070\u0007 \b*D\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \b*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/Polygonable;", "Lcom/google/android/gms/maps/model/VisibleRegion;", "", "<name for destructuring parameter 0>", "Lna4;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Triple;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n3190#2,10:519\n766#2:529\n857#2,2:530\n1549#2:532\n1620#2,3:533\n766#2:536\n857#2,2:537\n766#2:539\n857#2,2:540\n766#2:542\n857#2,2:543\n1603#2,9:545\n1855#2:554\n1856#2:556\n1612#2:557\n1#3:555\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3\n*L\n187#1:519,10\n195#1:529\n195#1:530,2\n200#1:532\n200#1:533,3\n204#1:536\n204#1:537,2\n205#1:539\n205#1:540,2\n207#1:542\n207#1:543,2\n130#1:545,9\n130#1:554\n130#1:556\n130#1:557\n130#1:555\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3 */
    /* loaded from: classes2.dex */
    public static final class C138773 extends Lambda implements Function1<Triple<? extends List<? extends Polygonable>, ? extends VisibleRegion, ? extends Float>, InterfaceC45761na4<? extends Pair<? extends List<? extends Polygonable>, ? extends List<? extends Polygonable>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/Polygonable;", "polygonablesToAdd", "<anonymous parameter 1>", "", "invoke", "(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$1 */
        /* loaded from: classes2.dex */
        public static final class C138781 extends Lambda implements Function2<List<? extends Polygonable>, Long, List<? extends Polygonable>> {
            public static final C138781 INSTANCE = new C138781();

            public C138781() {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final List<Polygonable> invoke(List<? extends Polygonable> polygonablesToAdd, Long l) {
                Intrinsics.checkNotNullParameter(polygonablesToAdd, "polygonablesToAdd");
                Intrinsics.checkNotNullParameter(l, "<anonymous parameter 1>");
                return polygonablesToAdd;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/Polygonable;", "polygonablesToRemove", "<anonymous parameter 1>", "", "invoke", "(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$2 */
        /* loaded from: classes2.dex */
        public static final class C138792 extends Lambda implements Function2<List<? extends Polygonable>, Long, List<? extends Polygonable>> {
            public static final C138792 INSTANCE = new C138792();

            public C138792() {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final List<Polygonable> invoke(List<? extends Polygonable> polygonablesToRemove, Long l) {
                Intrinsics.checkNotNullParameter(polygonablesToRemove, "polygonablesToRemove");
                Intrinsics.checkNotNullParameter(l, "<anonymous parameter 1>");
                return polygonablesToRemove;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Polygonable;", "polygonablesToAdd", "polygonablesToRemove", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$3 */
        /* loaded from: classes2.dex */
        public static final class C138803 extends Lambda implements Function2<List<? extends Polygonable>, List<? extends Polygonable>, Pair<? extends List<? extends Polygonable>, ? extends List<? extends Polygonable>>> {
            public static final C138803 INSTANCE = new C138803();

            public C138803() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Pair<List<Polygonable>, List<Polygonable>> invoke(List<? extends Polygonable> polygonablesToAdd, List<? extends Polygonable> polygonablesToRemove) {
                Intrinsics.checkNotNullParameter(polygonablesToAdd, "polygonablesToAdd");
                Intrinsics.checkNotNullParameter(polygonablesToRemove, "polygonablesToRemove");
                return TuplesKt.m28425to(polygonablesToAdd, polygonablesToRemove);
            }
        }

        public C138773() {
            super(1);
        }

        private static final List<Polygonable> invoke$filterVisiblePolygonables(List<? extends Polygonable> list, boolean z, Location location, float f, MapPolygonableRenderer mapPolygonableRenderer, VisibleRegion visibleRegion, Lazy<Double> lazy) {
            Lazy lazy2;
            Lazy lazy3;
            Lazy lazy4;
            Lazy lazy5;
            Lazy lazy6;
            Lazy lazy7;
            Polygonable polygonable;
            ArrayList arrayList = new ArrayList();
            for (Polygonable polygonable2 : list) {
                boolean z2 = false;
                Point[] points = polygonable2.getRegion().getRing(0).getPoints();
                lazy2 = LazyKt__LazyJVMKt.lazy(new MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2(polygonable2));
                lazy3 = LazyKt__LazyJVMKt.lazy(new C13889x29e9ecb(points, lazy2));
                lazy4 = LazyKt__LazyJVMKt.lazy(new C13891x3d7c66b4(polygonable2, location, f, mapPolygonableRenderer));
                lazy5 = LazyKt__LazyJVMKt.lazy(new C13890x17c86bb0(points, visibleRegion));
                lazy6 = LazyKt__LazyJVMKt.lazy(new C13887x7ed1f9b(lazy3, lazy));
                lazy7 = LazyKt__LazyJVMKt.lazy(new C13888x68c9e275(f));
                if ((z && Intrinsics.areEqual(polygonable2.getId(), MapPolygonableRenderer.WORLD_POLYGONABLE_ID)) || (invoke$filterVisiblePolygonables$lambda$8$lambda$5(lazy5) && (invoke$filterVisiblePolygonables$lambda$8$lambda$6(lazy6) || invoke$filterVisiblePolygonables$lambda$8$lambda$7(lazy7)))) {
                    z2 = true;
                }
                if (z2) {
                    polygonable = invoke$filterVisiblePolygonables$lambda$8$lambda$4(lazy4);
                } else {
                    polygonable = null;
                }
                if (polygonable != null) {
                    arrayList.add(polygonable);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CX3 invoke$filterVisiblePolygonables$lambda$8$lambda$2(Lazy<? extends CX3> lazy) {
            return lazy.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double invoke$filterVisiblePolygonables$lambda$8$lambda$3(Lazy<Double> lazy) {
            return lazy.getValue().doubleValue();
        }

        private static final Polygonable invoke$filterVisiblePolygonables$lambda$8$lambda$4(Lazy<? extends Polygonable> lazy) {
            return lazy.getValue();
        }

        private static final boolean invoke$filterVisiblePolygonables$lambda$8$lambda$5(Lazy<Boolean> lazy) {
            return lazy.getValue().booleanValue();
        }

        private static final boolean invoke$filterVisiblePolygonables$lambda$8$lambda$6(Lazy<Boolean> lazy) {
            return lazy.getValue().booleanValue();
        }

        private static final boolean invoke$filterVisiblePolygonables$lambda$8$lambda$7(Lazy<Boolean> lazy) {
            return lazy.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CX3 invoke$lambda$0(Lazy<? extends CX3> lazy) {
            return lazy.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double invoke$lambda$1(Lazy<Double> lazy) {
            return lazy.getValue().doubleValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$15(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List invoke$lambda$16(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj, obj2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List invoke$lambda$17(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj, obj2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair invoke$lambda$18(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj, obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x017e A[LOOP:1: B:35:0x0178->B:37:0x017e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0232 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01ff A[SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC45761na4<? extends Pair<List<Polygonable>, List<Polygonable>>> invoke2(Triple<? extends List<? extends Polygonable>, VisibleRegion, Float> triple) {
            Lazy lazy;
            Lazy lazy2;
            boolean z;
            List filterIsInstance;
            List plus;
            List<Polygonable> invoke$filterVisiblePolygonables;
            int collectionSizeOrDefault;
            Set set;
            List plus2;
            List chunked;
            List emptyList;
            List chunked2;
            List emptyList2;
            boolean z2;
            boolean shouldInvert;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<? extends Polygonable> component1 = triple.component1();
            VisibleRegion component2 = triple.component2();
            float floatValue = triple.component3().floatValue();
            lazy = LazyKt__LazyJVMKt.lazy(new MapPolygonableRenderer$3$visibleRegionGeom$2(component2));
            lazy2 = LazyKt__LazyJVMKt.lazy(new MapPolygonableRenderer$3$visibleSize$2(component2, lazy));
            Location m73665a = MapPolygonableRenderer.this.locationManager.mo43616p().m73665a();
            MobileMapConfigView mobileMapConfigView = MapPolygonableRenderer.this.mapConfig;
            if (mobileMapConfigView != null) {
                shouldInvert = MapPolygonableRendererKt.shouldInvert(mobileMapConfigView, floatValue);
                if (shouldInvert) {
                    z = true;
                    MapPolygonableRenderer.this.logger.mo7228a("Operational Polygonables Inverted: " + z, new Object[0]);
                    if (z) {
                        invoke$filterVisiblePolygonables = invoke$filterVisiblePolygonables(component1, z, m73665a, floatValue, MapPolygonableRenderer.this, component2, lazy2);
                    } else {
                        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(component1, Area.class);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : filterIsInstance) {
                            if (((Area) obj).getOperational()) {
                                arrayList.add(obj);
                            } else {
                                arrayList2.add(obj);
                            }
                        }
                        Pair pair = new Pair(arrayList, arrayList2);
                        List<Area> list = (List) pair.component1();
                        List list2 = (List) pair.component2();
                        PolygonWrapper polygonWrapper = (PolygonWrapper) MapPolygonableRenderer.this.polygonablePolygons.get((Object) MapPolygonableRenderer.this.getWorldPolygonable());
                        if (polygonWrapper != null) {
                            polygonWrapper.setHolesFromAreas(list);
                        }
                        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends MapPolygonableRenderer$worldPolygonable$2.C138941>) ((Collection<? extends Object>) list2), MapPolygonableRenderer.this.getWorldPolygonable());
                        invoke$filterVisiblePolygonables = invoke$filterVisiblePolygonables(plus, z, m73665a, floatValue, MapPolygonableRenderer.this, component2, lazy2);
                    }
                    MapPolygonableRenderer.this.logger.mo7228a("Number of visible polygonables: " + invoke$filterVisiblePolygonables.size() + " out of total " + component1.size() + " Polygonables returned from API. " + ((invoke$filterVisiblePolygonables.size() / component1.size()) * 100.0f) + "% visible", new Object[0]);
                    List<Polygonable> list3 = invoke$filterVisiblePolygonables;
                    MapPolygonableRenderer mapPolygonableRenderer = MapPolygonableRenderer.this;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list3) {
                        PolygonWrapper polygonWrapper2 = (PolygonWrapper) mapPolygonableRenderer.polygonablePolygons.get((Object) ((Polygonable) obj2));
                        if (!(polygonWrapper2 != null && polygonWrapper2.isLatestRendered())) {
                            arrayList3.add(obj2);
                        }
                    }
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
                    for (Polygonable polygonable : list3) {
                        arrayList4.add(polygonable.getId());
                    }
                    set = CollectionsKt___CollectionsKt.toSet(arrayList4);
                    Set<Polygonable> polygonables = MapPolygonableRenderer.this.polygonablePolygons.getPolygonables();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : component1) {
                        if (!set.contains(((Polygonable) obj3).getId())) {
                            arrayList5.add(obj3);
                        }
                    }
                    MapPolygonableRenderer mapPolygonableRenderer2 = MapPolygonableRenderer.this;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : arrayList5) {
                        PolygonWrapper polygonWrapper3 = (PolygonWrapper) mapPolygonableRenderer2.polygonablePolygons.get((Object) ((Polygonable) obj4));
                        if (polygonWrapper3 != null && polygonWrapper3.isAdded()) {
                            arrayList6.add(obj4);
                        }
                    }
                    MapPolygonableRenderer mapPolygonableRenderer3 = MapPolygonableRenderer.this;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj5 : polygonables) {
                        Polygonable polygonable2 = (Polygonable) obj5;
                        if (!set.contains(polygonable2.getId())) {
                            PolygonWrapper polygonWrapper4 = (PolygonWrapper) mapPolygonableRenderer3.polygonablePolygons.get((Object) polygonable2);
                            if (polygonWrapper4 != null && polygonWrapper4.isAdded()) {
                                z2 = true;
                                if (!z2) {
                                    arrayList7.add(obj5);
                                }
                            }
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    }
                    plus2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList6, (Iterable) arrayList7);
                    MapPolygonableRenderer.this.logger.mo7228a("Queueing " + arrayList3.size() + " Polygonables to render", new Object[0]);
                    MapPolygonableRenderer.this.logger.mo7228a("Queueing " + plus2.size() + " Polygonables to remove", new Object[0]);
                    AbstractC24490k<Long> m32126n0 = AbstractC24490k.m32126n0(MapPolygonableRenderer.FRAME_RENDER_TIME_US, TimeUnit.MICROSECONDS);
                    final MapPolygonableRenderer$3$timer$1 mapPolygonableRenderer$3$timer$1 = MapPolygonableRenderer$3$timer$1.INSTANCE;
                    AbstractC24490k<Long> m32176R0 = m32126n0.m32175S(new InterfaceC23494q() { // from class: co.bird.android.app.feature.map.ui.renderer.a
                        @Override // io.reactivex.functions.InterfaceC23494q
                        public final boolean test(Object obj6) {
                            boolean invoke$lambda$15;
                            invoke$lambda$15 = MapPolygonableRenderer.C138773.invoke$lambda$15(Function1.this, obj6);
                            return invoke$lambda$15;
                        }
                    }).m32176R0();
                    chunked = CollectionsKt___CollectionsKt.chunked(arrayList3, 2);
                    AbstractC24490k m32141i0 = AbstractC24490k.m32141i0(chunked);
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    AbstractC24490k m32106u = m32141i0.m32106u(emptyList);
                    final C138781 c138781 = C138781.INSTANCE;
                    AbstractC24490k m32104u1 = AbstractC24490k.m32104u1(m32106u, m32176R0, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.ui.renderer.b
                        @Override // io.reactivex.functions.InterfaceC23480c
                        public final Object apply(Object obj6, Object obj7) {
                            List invoke$lambda$16;
                            invoke$lambda$16 = MapPolygonableRenderer.C138773.invoke$lambda$16(Function2.this, obj6, obj7);
                            return invoke$lambda$16;
                        }
                    });
                    chunked2 = CollectionsKt___CollectionsKt.chunked(plus2, 2);
                    AbstractC24490k m32141i02 = AbstractC24490k.m32141i0(chunked2);
                    emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    AbstractC24490k m32106u2 = m32141i02.m32106u(emptyList2);
                    final C138792 c138792 = C138792.INSTANCE;
                    AbstractC24490k m32104u12 = AbstractC24490k.m32104u1(m32106u2, m32176R0, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.ui.renderer.c
                        @Override // io.reactivex.functions.InterfaceC23480c
                        public final Object apply(Object obj6, Object obj7) {
                            List invoke$lambda$17;
                            invoke$lambda$17 = MapPolygonableRenderer.C138773.invoke$lambda$17(Function2.this, obj6, obj7);
                            return invoke$lambda$17;
                        }
                    });
                    final C138803 c138803 = C138803.INSTANCE;
                    return AbstractC24490k.m32136k(m32104u1, m32104u12, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.ui.renderer.d
                        @Override // io.reactivex.functions.InterfaceC23480c
                        public final Object apply(Object obj6, Object obj7) {
                            Pair invoke$lambda$18;
                            invoke$lambda$18 = MapPolygonableRenderer.C138773.invoke$lambda$18(Function2.this, obj6, obj7);
                            return invoke$lambda$18;
                        }
                    });
                }
            }
            z = false;
            MapPolygonableRenderer.this.logger.mo7228a("Operational Polygonables Inverted: " + z, new Object[0]);
            if (z) {
            }
            MapPolygonableRenderer.this.logger.mo7228a("Number of visible polygonables: " + invoke$filterVisiblePolygonables.size() + " out of total " + component1.size() + " Polygonables returned from API. " + ((invoke$filterVisiblePolygonables.size() / component1.size()) * 100.0f) + "% visible", new Object[0]);
            List<Polygonable> list32 = invoke$filterVisiblePolygonables;
            MapPolygonableRenderer mapPolygonableRenderer4 = MapPolygonableRenderer.this;
            ArrayList arrayList32 = new ArrayList();
            while (r3.hasNext()) {
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10);
            ArrayList arrayList42 = new ArrayList(collectionSizeOrDefault);
            while (r13.hasNext()) {
            }
            set = CollectionsKt___CollectionsKt.toSet(arrayList42);
            Set<Polygonable> polygonables2 = MapPolygonableRenderer.this.polygonablePolygons.getPolygonables();
            ArrayList arrayList52 = new ArrayList();
            while (r0.hasNext()) {
            }
            MapPolygonableRenderer mapPolygonableRenderer22 = MapPolygonableRenderer.this;
            ArrayList arrayList62 = new ArrayList();
            while (r3.hasNext()) {
            }
            MapPolygonableRenderer mapPolygonableRenderer32 = MapPolygonableRenderer.this;
            ArrayList arrayList72 = new ArrayList();
            while (r1.hasNext()) {
            }
            plus2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList62, (Iterable) arrayList72);
            MapPolygonableRenderer.this.logger.mo7228a("Queueing " + arrayList32.size() + " Polygonables to render", new Object[0]);
            MapPolygonableRenderer.this.logger.mo7228a("Queueing " + plus2.size() + " Polygonables to remove", new Object[0]);
            AbstractC24490k<Long> m32126n02 = AbstractC24490k.m32126n0(MapPolygonableRenderer.FRAME_RENDER_TIME_US, TimeUnit.MICROSECONDS);
            final Function1 mapPolygonableRenderer$3$timer$12 = MapPolygonableRenderer$3$timer$1.INSTANCE;
            AbstractC24490k<Long> m32176R02 = m32126n02.m32175S(new InterfaceC23494q() { // from class: co.bird.android.app.feature.map.ui.renderer.a
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj6) {
                    boolean invoke$lambda$15;
                    invoke$lambda$15 = MapPolygonableRenderer.C138773.invoke$lambda$15(Function1.this, obj6);
                    return invoke$lambda$15;
                }
            }).m32176R0();
            chunked = CollectionsKt___CollectionsKt.chunked(arrayList32, 2);
            AbstractC24490k m32141i03 = AbstractC24490k.m32141i0(chunked);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            AbstractC24490k m32106u3 = m32141i03.m32106u(emptyList);
            final Function2 c1387812 = C138781.INSTANCE;
            AbstractC24490k m32104u13 = AbstractC24490k.m32104u1(m32106u3, m32176R02, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.ui.renderer.b
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj6, Object obj7) {
                    List invoke$lambda$16;
                    invoke$lambda$16 = MapPolygonableRenderer.C138773.invoke$lambda$16(Function2.this, obj6, obj7);
                    return invoke$lambda$16;
                }
            });
            chunked2 = CollectionsKt___CollectionsKt.chunked(plus2, 2);
            AbstractC24490k m32141i022 = AbstractC24490k.m32141i0(chunked2);
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            AbstractC24490k m32106u22 = m32141i022.m32106u(emptyList2);
            final Function2 c1387922 = C138792.INSTANCE;
            AbstractC24490k m32104u122 = AbstractC24490k.m32104u1(m32106u22, m32176R02, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.ui.renderer.c
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj6, Object obj7) {
                    List invoke$lambda$17;
                    invoke$lambda$17 = MapPolygonableRenderer.C138773.invoke$lambda$17(Function2.this, obj6, obj7);
                    return invoke$lambda$17;
                }
            });
            final Function2 c1388032 = C138803.INSTANCE;
            return AbstractC24490k.m32136k(m32104u13, m32104u122, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.ui.renderer.d
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj6, Object obj7) {
                    Pair invoke$lambda$18;
                    invoke$lambda$18 = MapPolygonableRenderer.C138773.invoke$lambda$18(Function2.this, obj6, obj7);
                    return invoke$lambda$18;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC45761na4<? extends Pair<? extends List<? extends Polygonable>, ? extends List<? extends Polygonable>>> invoke(Triple<? extends List<? extends Polygonable>, ? extends VisibleRegion, ? extends Float> triple) {
            return invoke2((Triple<? extends List<? extends Polygonable>, VisibleRegion, Float>) triple);
        }
    }
}
