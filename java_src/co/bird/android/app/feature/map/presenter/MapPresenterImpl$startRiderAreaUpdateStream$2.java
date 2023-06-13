package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "geocachingEnabled", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$startRiderAreaUpdateStream$2 extends Lambda implements Function1<Boolean, InterfaceC23496h> {
    final /* synthetic */ MapPresenterImpl this$0;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n1#2:624\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2$1 */
    /* loaded from: classes2.dex */
    public static final class C138151 extends Lambda implements Function1<Pair<? extends List<? extends LatLng>, ? extends Float>, Pair<? extends List<? extends LatLng>, ? extends Float>> {
        public static final C138151 INSTANCE = new C138151();

        public C138151() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends LatLng>, ? extends Float> invoke(Pair<? extends List<? extends LatLng>, ? extends Float> pair) {
            return invoke2((Pair<? extends List<LatLng>, Float>) pair);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<List<LatLng>, Float> invoke2(Pair<? extends List<LatLng>, Float> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (((List) it.component1()).size() > 1) {
                return it;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\t\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LNn;", "areaRefreshRequest", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", "invoke", "(LNn;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2$2 */
    /* loaded from: classes2.dex */
    public static final class C138162 extends Lambda implements Function1<C5691Nn, Pair<? extends List<? extends LatLng>, ? extends Integer>> {
        final /* synthetic */ MapPresenterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138162(MapPresenterImpl mapPresenterImpl) {
            super(1);
            this.this$0 = mapPresenterImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<List<LatLng>, Integer> invoke(C5691Nn areaRefreshRequest) {
            InterfaceC40001dr4 interfaceC40001dr4;
            Intrinsics.checkNotNullParameter(areaRefreshRequest, "areaRefreshRequest");
            Location m93436b = areaRefreshRequest.m93436b();
            if (m93436b == null) {
                interfaceC40001dr4 = this.this$0.locationManager;
                m93436b = interfaceC40001dr4.mo43616p().m73665a();
            }
            Double m93435c = areaRefreshRequest.m93435c();
            return TuplesKt.m28425to(GoogleMap_Kt.points(GoogleMap_Kt.createBounds(C39339cm2.m60885d(m93436b), m93435c != null ? m93435c.doubleValue() : 5000.0d)), 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/location/Location;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2$4 */
    /* loaded from: classes2.dex */
    public static final class C138194 extends Lambda implements Function1<Pair<? extends Location, ? extends Double>, Pair<? extends Location, ? extends Double>> {
        final /* synthetic */ MapPresenterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138194(MapPresenterImpl mapPresenterImpl) {
            super(1);
            this.this$0 = mapPresenterImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends Location, ? extends Double> invoke(Pair<? extends Location, ? extends Double> pair) {
            return invoke2((Pair<? extends Location, Double>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<Location, Double> invoke2(Pair<? extends Location, Double> pair) {
            MapUi mapUi;
            double nearbyRadius;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Location component1 = pair.component1();
            Double component2 = pair.component2();
            if (component2 != null) {
                nearbyRadius = component2.doubleValue();
            } else {
                mapUi = this.this$0.f61617ui;
                nearbyRadius = mapUi.nearbyRadius();
            }
            return TuplesKt.m28425to(component1, Double.valueOf(nearbyRadius));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$startRiderAreaUpdateStream$2(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h invoke$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23496h invoke(Boolean geocachingEnabled) {
        Observable legacyAreaRefreshObservable;
        MapUi mapUi;
        InterfaceC12495bn interfaceC12495bn;
        Intrinsics.checkNotNullParameter(geocachingEnabled, "geocachingEnabled");
        if (geocachingEnabled.booleanValue()) {
            C41318g46.m40163a("geocached area/zone load enabled, listening for view port changes", new Object[0]);
            mapUi = this.this$0.f61617ui;
            Observable m74575T = C37279Yf5.m74575T(mapUi.getViewportChangesObservable(), C138151.INSTANCE);
            interfaceC12495bn = this.this$0.areaManager;
            Observable<C5691Nn> mo64014I = interfaceC12495bn.mo64014I();
            final C138162 c138162 = new C138162(this.this$0);
            Observable observeOn = Observable.merge(m74575T, mo64014I.map(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.presenter.e
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = MapPresenterImpl$startRiderAreaUpdateStream$2.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            })).observeOn(C24542a.m31932c());
            final C138173 c138173 = new C138173(this.this$0);
            return observeOn.switchMapCompletable(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.presenter.f
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = MapPresenterImpl$startRiderAreaUpdateStream$2.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
        }
        C41318g46.m40163a("geocached area/zone load DISABLED, subscribing to legacy area refresh observable", new Object[0]);
        legacyAreaRefreshObservable = this.this$0.legacyAreaRefreshObservable();
        Observable observeOn2 = legacyAreaRefreshObservable.observeOn(C23454a.m33087a());
        final C138194 c138194 = new C138194(this.this$0);
        Observable observeOn3 = observeOn2.map(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.presenter.g
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair invoke$lambda$2;
                invoke$lambda$2 = MapPresenterImpl$startRiderAreaUpdateStream$2.invoke$lambda$2(Function1.this, obj);
                return invoke$lambda$2;
            }
        }).observeOn(C24542a.m31932c());
        final C138205 c138205 = new C138205(this.this$0);
        return observeOn3.switchMapCompletable(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.presenter.h
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h invoke$lambda$3;
                invoke$lambda$3 = MapPresenterImpl$startRiderAreaUpdateStream$2.invoke$lambda$3(Function1.this, obj);
                return invoke$lambda$3;
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2$3 */
    /* loaded from: classes2.dex */
    public static final class C138173 extends Lambda implements Function1<Pair, InterfaceC23496h> {
        final /* synthetic */ MapPresenterImpl this$0;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2$3$1 */
        /* loaded from: classes2.dex */
        public static final class C138181 extends Lambda implements Function1<Throwable, Unit> {
            public static final C138181 INSTANCE = new C138181();

            public C138181() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while loading geocached rider areas/zones", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138173(MapPresenterImpl mapPresenterImpl) {
            super(1);
            this.this$0 = mapPresenterImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<? extends List<LatLng>, ? extends Object> pair) {
            AbstractC23461c loadGeocacheRiderZones;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            loadGeocacheRiderZones = this.this$0.loadGeocacheRiderZones(pair.component1());
            final C138181 c138181 = C138181.INSTANCE;
            return loadGeocacheRiderZones.m33084B(new InterfaceC23484g() { // from class: co.bird.android.app.feature.map.presenter.i
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MapPresenterImpl$startRiderAreaUpdateStream$2.C138173.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair pair) {
            return invoke2((Pair<? extends List<LatLng>, ? extends Object>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Landroid/location/Location;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2$5 */
    /* loaded from: classes2.dex */
    public static final class C138205 extends Lambda implements Function1<Pair<? extends Location, ? extends Double>, InterfaceC23496h> {
        final /* synthetic */ MapPresenterImpl this$0;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startRiderAreaUpdateStream$2$5$1 */
        /* loaded from: classes2.dex */
        public static final class C138211 extends Lambda implements Function1<Throwable, Unit> {
            public static final C138211 INSTANCE = new C138211();

            public C138211() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while loading legacy rider areas", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138205(MapPresenterImpl mapPresenterImpl) {
            super(1);
            this.this$0 = mapPresenterImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<? extends Location, Double> pair) {
            AbstractC23461c loadLegacyRiderAreas;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            double doubleValue = pair.component2().doubleValue();
            loadLegacyRiderAreas = this.this$0.loadLegacyRiderAreas(pair.component1(), doubleValue);
            final C138211 c138211 = C138211.INSTANCE;
            return loadLegacyRiderAreas.m33084B(new InterfaceC23484g() { // from class: co.bird.android.app.feature.map.presenter.j
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MapPresenterImpl$startRiderAreaUpdateStream$2.C138205.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Location, ? extends Double> pair) {
            return invoke2((Pair<? extends Location, Double>) pair);
        }
    }
}
