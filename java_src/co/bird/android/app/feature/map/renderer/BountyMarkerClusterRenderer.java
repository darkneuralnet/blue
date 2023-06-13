package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterItem;
import co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.MarkerOptionProvider;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.FleetMarker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B;\b\u0007\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0014J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;", "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;", "Lco/bird/android/model/persistence/BountyMapMarker;", "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;", "LPT;", "bitmapDescriptor", "Landroid/graphics/PointF;", "anchorPoint", "item", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "", "onBeforeClusterItemRendered", "LfM2;", "marker", "updateItem", "LGl0;", "clusterManager", "LGl0;", "LcD1;", "map", "LcD1;", "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;", "markerOptionProvider", "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;", "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;", "timerMarkerOptionProvider", "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;", "", "", "markersToAnimate", "Ljava/util/Map;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LGl0;LcD1;Landroid/content/Context;Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n180#2:126\n1#3:127\n*S KotlinDebug\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer\n*L\n81#1:126\n*E\n"})
/* loaded from: classes2.dex */
public final class BountyMarkerClusterRenderer extends AbstractMarkerClusterRenderer<BountyMapMarker, BountyMarkerClusterItem> {
    public static final Companion Companion = new Companion(null);
    private static final PointF UNKNOWN_ANCHOR_POINT = new PointF(0.5f, 1.0f);
    private final C33116Gl0<BountyMarkerClusterItem> clusterManager;
    private final C39011cD1 map;
    private final FleetMarkerOptionProvider markerOptionProvider;
    private final Map<String, BountyMapMarker> markersToAnimate;
    private final BountyMarkerWithTimerOptionProvider timerMarkerOptionProvider;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "interval", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BountyMapMarker;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer$1 */
    /* loaded from: classes2.dex */
    public static final class C138361 extends Lambda implements Function1<Long, InterfaceC23434B<? extends Pair<? extends BountyMapMarker, ? extends Long>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BountyMapMarker;", "", "kotlin.jvm.PlatformType", "bountyMarker", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer$1$1 */
        /* loaded from: classes2.dex */
        public static final class C138371 extends Lambda implements Function1<BountyMapMarker, Pair<? extends BountyMapMarker, ? extends Long>> {
            final /* synthetic */ Long $interval;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C138371(Long l) {
                super(1);
                this.$interval = l;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<BountyMapMarker, Long> invoke(BountyMapMarker bountyMarker) {
                Intrinsics.checkNotNullParameter(bountyMarker, "bountyMarker");
                return TuplesKt.m28425to(bountyMarker, this.$interval);
            }
        }

        public C138361() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<BountyMapMarker, Long>> invoke(Long interval) {
            Intrinsics.checkNotNullParameter(interval, "interval");
            Observable fromIterable = Observable.fromIterable(BountyMarkerClusterRenderer.this.markersToAnimate.values());
            final C138371 c138371 = new C138371(interval);
            return fromIterable.map(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.renderer.a
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = BountyMarkerClusterRenderer.C138361.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BountyMapMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBountyMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n288#2,2:126\n*S KotlinDebug\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2\n*L\n54#1:126,2\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer$2 */
    /* loaded from: classes2.dex */
    public static final class C138382 extends Lambda implements Function1<Pair<? extends BountyMapMarker, ? extends Long>, Unit> {
        public C138382() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BountyMapMarker, ? extends Long> pair) {
            invoke2((Pair<BountyMapMarker, Long>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BountyMapMarker, Long> pair) {
            Object obj;
            BountyMapMarker bountyMarker = pair.component1();
            Long component2 = pair.component2();
            Collection mo72963b = BountyMarkerClusterRenderer.this.clusterManager.m104801k().mo72963b();
            Intrinsics.checkNotNullExpressionValue(mo72963b, "clusterManager.algorithm.items");
            Iterator it = mo72963b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((BountyMarkerClusterItem) obj).getId(), bountyMarker.getId())) {
                    break;
                }
            }
            BountyMarkerClusterItem bountyMarkerClusterItem = (BountyMarkerClusterItem) obj;
            if (bountyMarkerClusterItem == null) {
                BountyMarkerClusterRenderer.this.markersToAnimate.remove(bountyMarker.getId());
                return;
            }
            C40889fM2 marker = BountyMarkerClusterRenderer.this.getMarker((BountyMarkerClusterRenderer) bountyMarkerClusterItem);
            DateTime countdownUntil = bountyMarker.getCountdownUntil();
            if (countdownUntil != null && countdownUntil.isAfterNow()) {
                if (marker != null) {
                    marker.m41523k(BountyMarkerClusterRenderer.this.bitmapDescriptor(bountyMarkerClusterItem));
                }
            } else if (marker != null) {
                BountyMarkerWithTimerOptionProvider bountyMarkerWithTimerOptionProvider = BountyMarkerClusterRenderer.this.timerMarkerOptionProvider;
                Intrinsics.checkNotNullExpressionValue(bountyMarker, "bountyMarker");
                marker.m41523k(bountyMarkerWithTimerOptionProvider.bitmapDescriptorFlashing(bountyMarker, true, component2.longValue() % 2 == 0));
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer$3 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138393 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public static final C138393 INSTANCE = new C138393();

        public C138393() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BountyMapMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer$4 */
    /* loaded from: classes2.dex */
    public static final class C138404 extends Lambda implements Function1<Pair<? extends BountyMapMarker, ? extends Long>, Unit> {
        public static final C138404 INSTANCE = new C138404();

        public C138404() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BountyMapMarker, Long> pair) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BountyMapMarker, ? extends Long> pair) {
            invoke2((Pair<BountyMapMarker, Long>) pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.renderer.BountyMarkerClusterRenderer$5 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138415 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public static final C138415 INSTANCE = new C138415();

        public C138415() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$Companion;", "", "()V", "UNKNOWN_ANCHOR_POINT", "Landroid/graphics/PointF;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BountyMarkerClusterRenderer(C33116Gl0<BountyMarkerClusterItem> clusterManager, C39011cD1 map, Context context, FleetMarkerOptionProvider markerOptionProvider, BountyMarkerWithTimerOptionProvider timerMarkerOptionProvider) {
        super(context, map, clusterManager);
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(markerOptionProvider, "markerOptionProvider");
        Intrinsics.checkNotNullParameter(timerMarkerOptionProvider, "timerMarkerOptionProvider");
        this.clusterManager = clusterManager;
        this.map = map;
        this.markerOptionProvider = markerOptionProvider;
        this.timerMarkerOptionProvider = timerMarkerOptionProvider;
        this.markersToAnimate = new LinkedHashMap();
        Observable<Long> observeOn = Observable.interval(1L, TimeUnit.SECONDS).subscribeOn(C24542a.m31934a()).observeOn(C23454a.m33087a());
        final C138361 c138361 = new C138361();
        Observable<R> flatMap = observeOn.flatMap(new InterfaceC23492o() { // from class: O00
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B _init_$lambda$0;
                _init_$lambda$0 = BountyMarkerClusterRenderer._init_$lambda$0(Function1.this, obj);
                return _init_$lambda$0;
            }
        });
        final C138382 c138382 = new C138382();
        Observable doOnNext = flatMap.doOnNext(new InterfaceC23484g() { // from class: P00
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BountyMarkerClusterRenderer._init_$lambda$1(Function1.this, obj);
            }
        });
        final C138393 c138393 = C138393.INSTANCE;
        Observable retry = doOnNext.doOnError(new InterfaceC23484g() { // from class: Q00
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BountyMarkerClusterRenderer._init_$lambda$2(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "interval(1L, TimeUnit.SE…Timber::e)\n      .retry()");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138404 c138404 = C138404.INSTANCE;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: R00
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BountyMarkerClusterRenderer._init_$lambda$3(Function1.this, obj);
            }
        };
        final C138415 c138415 = C138415.INSTANCE;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: S00
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BountyMarkerClusterRenderer._init_$lambda$4(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final PointF anchorPoint(BountyMarkerClusterItem bountyMarkerClusterItem) {
        PointF anchorPoint;
        if (bountyMarkerClusterItem.getMarker().getCountdownUntil() != null) {
            return this.timerMarkerOptionProvider.anchorPoint(bountyMarkerClusterItem.getMarker());
        }
        FleetMarker marker = bountyMarkerClusterItem.getMarker().getMarker();
        if (marker == null || (anchorPoint = this.markerOptionProvider.anchorPoint(marker)) == null) {
            return UNKNOWN_ANCHOR_POINT;
        }
        return anchorPoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized C6378PT bitmapDescriptor(BountyMarkerClusterItem bountyMarkerClusterItem) {
        C6378PT c6378pt;
        c6378pt = null;
        if (bountyMarkerClusterItem.getMarker().getCountdownUntil() != null) {
            this.markersToAnimate.put(bountyMarkerClusterItem.getMarker().getId(), bountyMarkerClusterItem.getMarker());
            c6378pt = MarkerOptionProvider.DefaultImpls.bitmapDescriptor$default(this.timerMarkerOptionProvider, bountyMarkerClusterItem.getMarker(), false, 2, null);
        } else {
            FleetMarker marker = bountyMarkerClusterItem.getMarker().getMarker();
            if (marker != null) {
                c6378pt = MarkerOptionProvider.DefaultImpls.bitmapDescriptor$default(this.markerOptionProvider, marker, false, 2, null);
            }
        }
        return c6378pt;
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(BountyMarkerClusterItem item, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        super.onBeforeClusterItemRendered((BountyMarkerClusterRenderer) item, markerOptions);
        C6378PT bitmapDescriptor = bitmapDescriptor(item);
        PointF anchorPoint = anchorPoint(item);
        markerOptions.m50657N0(bitmapDescriptor).m50644u(anchorPoint.x, anchorPoint.y);
    }

    @Override // co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer
    public void updateItem(BountyMarkerClusterItem item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        C6378PT bitmapDescriptor = bitmapDescriptor(item);
        PointF anchorPoint = anchorPoint(item);
        marker.m41523k(bitmapDescriptor);
        marker.m41526h(anchorPoint.x, anchorPoint.y);
        marker.m41515s(item.getZIndex());
    }
}
