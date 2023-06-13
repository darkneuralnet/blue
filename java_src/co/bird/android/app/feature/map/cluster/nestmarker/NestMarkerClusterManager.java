package co.bird.android.app.feature.map.cluster.nestmarker;

import co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.NestMarker;
import com.google.android.gms.maps.model.LatLng;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0014J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014J\f\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0014J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002R\u001a\u0010\u0012\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;", "Lco/bird/android/model/persistence/NestMarker;", "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;", "marker", "newMarker", "existingClusterItem", "updateMarker", "", "id", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "claimProgress", "", "claim", "unclaim", "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;", "renderer", "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;", "getRenderer", "()Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "LTq4;", "reactiveConfig", "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;", "rendererFactory", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,115:1\n180#2:116\n180#2:117\n*S KotlinDebug\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager\n*L\n56#1:116\n66#1:117\n*E\n"})
/* loaded from: classes2.dex */
public final class NestMarkerClusterManager extends AbstractMarkerClusterManager<NestMarker, NestMarkerClusterItem> {
    private final NestMarkerClusterRenderer renderer;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "enabled", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager$1 */
    /* loaded from: classes2.dex */
    public static final class C137981 extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Float>> {
        final /* synthetic */ C36207Tq4 $reactiveConfig;
        final /* synthetic */ ReactiveMapEvent $reactiveMapEvent;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "zoomThreshold", "invoke", "(Lkotlin/Unit;Ljava/lang/Float;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager$1$1 */
        /* loaded from: classes2.dex */
        public static final class C137991 extends Lambda implements Function2<Unit, Float, Float> {
            public static final C137991 INSTANCE = new C137991();

            public C137991() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Float invoke(Unit unit, Float zoomThreshold) {
                Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(zoomThreshold, "zoomThreshold");
                return zoomThreshold;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137981(ReactiveMapEvent reactiveMapEvent, C36207Tq4 c36207Tq4) {
            super(1);
            this.$reactiveMapEvent = reactiveMapEvent;
            this.$reactiveConfig = c36207Tq4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float invoke$lambda$0(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Float) tmp0.invoke(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Float> invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            if (enabled.booleanValue()) {
                Observable<Unit> cameraMoves = this.$reactiveMapEvent.cameraMoves();
                Observable<Float> m82645d8 = this.$reactiveConfig.m82645d8();
                final C137991 c137991 = C137991.INSTANCE;
                return Observable.combineLatest(cameraMoves, m82645d8, new InterfaceC23480c() { // from class: co.bird.android.app.feature.map.cluster.nestmarker.a
                    @Override // io.reactivex.functions.InterfaceC23480c
                    public final Object apply(Object obj, Object obj2) {
                        Float invoke$lambda$0;
                        invoke$lambda$0 = NestMarkerClusterManager.C137981.invoke$lambda$0(Function2.this, obj, obj2);
                        return invoke$lambda$0;
                    }
                });
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "zoomThreshold", "", "invoke", "(Ljava/lang/Float;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager$2 */
    /* loaded from: classes2.dex */
    public static final class C138002 extends Lambda implements Function1<Float, Boolean> {
        final /* synthetic */ C39011cD1 $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138002(C39011cD1 c39011cD1) {
            super(1);
            this.$map = c39011cD1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Float zoomThreshold) {
            Intrinsics.checkNotNullParameter(zoomThreshold, "zoomThreshold");
            return Boolean.valueOf(this.$map.m61679i().f71395c < zoomThreshold.floatValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNestMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n766#2:116\n857#2,2:117\n1855#2,2:119\n*S KotlinDebug\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3\n*L\n59#1:116\n59#1:117,2\n60#1:119,2\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager$3 */
    /* loaded from: classes2.dex */
    public static final class C138013 extends Lambda implements Function1<Boolean, Unit> {
        public C138013() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            Collection mo72963b = NestMarkerClusterManager.this.getClusterManager().m104801k().mo72963b();
            Intrinsics.checkNotNullExpressionValue(mo72963b, "clusterManager.algorithm.items");
            ArrayList<NestMarkerClusterItem> arrayList = new ArrayList();
            for (Object obj : mo72963b) {
                if (!((NestMarkerClusterItem) obj).getMarker().getAvailableSpaceDetails().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            NestMarkerClusterManager nestMarkerClusterManager = NestMarkerClusterManager.this;
            for (NestMarkerClusterItem nestMarkerClusterItem : arrayList) {
                nestMarkerClusterManager.safeUpdateItem(nestMarkerClusterItem);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "enabled", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager$4 */
    /* loaded from: classes2.dex */
    public static final class C138024 extends Lambda implements Function1<Boolean, Boolean> {
        public static final C138024 INSTANCE = new C138024();

        public C138024() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            return Boolean.valueOf(!enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNestMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n766#2:116\n857#2,2:117\n1855#2,2:119\n*S KotlinDebug\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$5\n*L\n69#1:116\n69#1:117,2\n70#1:119,2\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager$5 */
    /* loaded from: classes2.dex */
    public static final class C138035 extends Lambda implements Function1<Boolean, Unit> {
        public C138035() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            Collection mo72963b = NestMarkerClusterManager.this.getClusterManager().m104801k().mo72963b();
            Intrinsics.checkNotNullExpressionValue(mo72963b, "clusterManager.algorithm.items");
            ArrayList<NestMarkerClusterItem> arrayList = new ArrayList();
            for (Object obj : mo72963b) {
                if (!((NestMarkerClusterItem) obj).getMarker().getAvailableSpaceDetails().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            NestMarkerClusterManager nestMarkerClusterManager = NestMarkerClusterManager.this;
            for (NestMarkerClusterItem nestMarkerClusterItem : arrayList) {
                nestMarkerClusterManager.safeUpdateItem(nestMarkerClusterItem);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestMarkerClusterManager(BaseActivity activity, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, C36207Tq4 reactiveConfig, NestMarkerClusterRendererFactory rendererFactory) {
        super(activity, map, reactiveMapEvent);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rendererFactory, "rendererFactory");
        this.renderer = rendererFactory.create(getClusterManager(), map);
        init();
        Observable<Boolean> m82753T3 = reactiveConfig.m82753T3();
        final C137981 c137981 = new C137981(reactiveMapEvent, reactiveConfig);
        Observable<R> switchMap = m82753T3.switchMap(new InterfaceC23492o() { // from class: V33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B _init_$lambda$0;
                _init_$lambda$0 = NestMarkerClusterManager._init_$lambda$0(Function1.this, obj);
                return _init_$lambda$0;
            }
        });
        final C138002 c138002 = new C138002(map);
        Observable observeOn = switchMap.map(new InterfaceC23492o() { // from class: W33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean _init_$lambda$1;
                _init_$lambda$1 = NestMarkerClusterManager._init_$lambda$1(Function1.this, obj);
                return _init_$lambda$1;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.enableExp…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138013 c138013 = new C138013();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: X33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                NestMarkerClusterManager._init_$lambda$2(Function1.this, obj);
            }
        });
        Observable<Boolean> m82753T32 = reactiveConfig.m82753T3();
        final C138024 c138024 = C138024.INSTANCE;
        Observable<Boolean> filter = m82753T32.filter(new InterfaceC23494q() { // from class: Y33
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean _init_$lambda$3;
                _init_$lambda$3 = NestMarkerClusterManager._init_$lambda$3(Function1.this, obj);
                return _init_$lambda$3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "reactiveConfig.enableExp…r { enabled -> !enabled }");
        Object m33094as2 = filter.m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138035 c138035 = new C138035();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Z33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                NestMarkerClusterManager._init_$lambda$4(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean _init_$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void claim(NestMarker marker, int i) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        NestMarkerClusterItem nestMarkerClusterItem = get(getClusterManager(), marker);
        if (nestMarkerClusterItem == null) {
            return;
        }
        nestMarkerClusterItem.setClaimedProgress(i);
        safeUpdateItem(nestMarkerClusterItem);
    }

    public final void unclaim(NestMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        NestMarkerClusterItem nestMarkerClusterItem = get(getClusterManager(), marker);
        if (nestMarkerClusterItem == null) {
            return;
        }
        nestMarkerClusterItem.setClaimedProgress(0);
        safeUpdateItem(nestMarkerClusterItem);
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public AbstractMarkerClusterRenderer<NestMarker, NestMarkerClusterItem> getRenderer() {
        return this.renderer;
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    /* renamed from: id  reason: avoid collision after fix types in other method */
    public String mo60514id(NestMarker nestMarker) {
        Intrinsics.checkNotNullParameter(nestMarker, "<this>");
        return nestMarker.getId();
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public LatLng latLng(NestMarker nestMarker) {
        Intrinsics.checkNotNullParameter(nestMarker, "<this>");
        return LB0.m97610a(nestMarker.getLocation());
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public NestMarkerClusterItem newMarker(NestMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return new NestMarkerClusterItem(marker, false, 0, 6, null);
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public NestMarkerClusterItem updateMarker(NestMarker marker, NestMarkerClusterItem existingClusterItem) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(existingClusterItem, "existingClusterItem");
        return new NestMarkerClusterItem(marker, existingClusterItem.getSelected(), existingClusterItem.getClaimedProgress());
    }
}
