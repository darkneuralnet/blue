package co.bird.android.app.feature.map.p008ui;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEventImpl;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C37791a94;
import p000.C39011cD1;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J,\u0010\n\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u0005 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00020\u0002H\u0016J,\u0010\f\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00020\u0002H\u0016J,\u0010\u000e\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r\u0018\u00010\u00020\u0002H\u0016J,\u0010\u000f\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r\u0018\u00010\u00020\u0002H\u0016J,\u0010\u0010\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r\u0018\u00010\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016R)\u0010\u001a\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\"\u0010\b\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\"\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\"\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00120\u00120\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "Lio/reactivex/Observable;", "Lcom/google/android/gms/maps/model/LatLng;", "mapClicks", "", "cameraMoveCancels", "cameraIdles", "cameraMoves", "kotlin.jvm.PlatformType", "cameraMoveStarts", "LfE1;", "groundOverlayClicks", "LfM2;", "markerClicks", "infoWindowCloses", "infoWindowClicks", "mapLongClicks", "LDX3;", "polygonClicks", "LZ84;", "", "cameraMoving$delegate", "Lkotlin/Lazy;", "getCameraMoving", "()LZ84;", "cameraMoving", "Lma4;", "Lma4;", "La94;", "mutableCameraMoving", "La94;", "LcD1;", "map", "<init>", "(LcD1;)V", "core-basemap_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.ReactiveMapEventImpl */
/* loaded from: classes2.dex */
public final class ReactiveMapEventImpl implements ReactiveMapEvent {
    private final C45168ma4<Unit> cameraIdles;
    private final C45168ma4<Unit> cameraMoveCancels;
    private final C45168ma4<Unit> cameraMoveStarts;
    private final C45168ma4<Unit> cameraMoves;
    private final Lazy cameraMoving$delegate;
    private final C45168ma4<C40816fE1> groundOverlayClicks;
    private final C45168ma4<C40889fM2> infoWindowClicks;
    private final C45168ma4<C40889fM2> infoWindowCloses;
    private final C45168ma4<LatLng> mapClicks;
    private final C45168ma4<LatLng> mapLongClicks;
    private final C45168ma4<C40889fM2> markerClicks;
    private final C37791a94<Boolean> mutableCameraMoving;
    private final C45168ma4<DX3> polygonClicks;

    public ReactiveMapEventImpl(C39011cD1 map) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(map, "map");
        lazy = LazyKt__LazyJVMKt.lazy(new ReactiveMapEventImpl$cameraMoving$2(this));
        this.cameraMoving$delegate = lazy;
        C45168ma4<LatLng> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<LatLng>()");
        this.mapClicks = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.cameraMoveCancels = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.cameraIdles = m25409g3;
        C45168ma4<Unit> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Unit>()");
        this.cameraMoves = m25409g4;
        C45168ma4<Unit> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<Unit>()");
        this.cameraMoveStarts = m25409g5;
        C45168ma4<C40816fE1> m25409g6 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g6, "create<GroundOverlay>()");
        this.groundOverlayClicks = m25409g6;
        C45168ma4<C40889fM2> m25409g7 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g7, "create<Marker>()");
        this.markerClicks = m25409g7;
        C45168ma4<C40889fM2> m25409g8 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g8, "create<Marker>()");
        this.infoWindowCloses = m25409g8;
        C45168ma4<C40889fM2> m25409g9 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g9, "create<Marker>()");
        this.infoWindowClicks = m25409g9;
        C45168ma4<LatLng> m25409g10 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g10, "create<LatLng>()");
        this.mapLongClicks = m25409g10;
        final C45168ma4<DX3> m25409g11 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g11, "create<Polygon>()");
        this.polygonClicks = m25409g11;
        this.mutableCameraMoving = C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.FALSE, null, 2, null);
        map.m61662z(new C39011cD1.InterfaceC13468j() { // from class: Fr4
            @Override // p000.C39011cD1.InterfaceC13468j
            /* renamed from: a */
            public final void mo61655a(LatLng latLng) {
                ReactiveMapEventImpl._init_$lambda$0(ReactiveMapEventImpl.this, latLng);
            }
        });
        map.m61667u(new C39011cD1.InterfaceC13463e() { // from class: Ir4
            @Override // p000.C39011cD1.InterfaceC13463e
            /* renamed from: a */
            public final void mo61659a() {
                ReactiveMapEventImpl._init_$lambda$1(ReactiveMapEventImpl.this);
            }
        });
        map.m61666v(new C39011cD1.InterfaceC13464f() { // from class: Jr4
            @Override // p000.C39011cD1.InterfaceC13464f
            /* renamed from: a */
            public final void mo61658a(int i) {
                ReactiveMapEventImpl._init_$lambda$2(ReactiveMapEventImpl.this, i);
            }
        });
        map.m61669s(new C39011cD1.InterfaceC13461c() { // from class: Kr4
            @Override // p000.C39011cD1.InterfaceC13461c
            /* renamed from: a */
            public final void mo61661a() {
                ReactiveMapEventImpl._init_$lambda$3(ReactiveMapEventImpl.this);
            }
        });
        map.m61668t(new C39011cD1.InterfaceC13462d() { // from class: Lr4
            @Override // p000.C39011cD1.InterfaceC13462d
            /* renamed from: a */
            public final void mo61660a() {
                ReactiveMapEventImpl._init_$lambda$4(ReactiveMapEventImpl.this);
            }
        });
        map.m61665w(new C39011cD1.InterfaceC13465g() { // from class: Mr4
            @Override // p000.C39011cD1.InterfaceC13465g
            /* renamed from: a */
            public final void mo61657a(C40816fE1 c40816fE1) {
                ReactiveMapEventImpl._init_$lambda$5(ReactiveMapEventImpl.this, c40816fE1);
            }
        });
        map.m61692B(new C39011cD1.InterfaceC13470l() { // from class: Nr4
            @Override // p000.C39011cD1.InterfaceC13470l
            /* renamed from: c */
            public final boolean mo27413c(C40889fM2 c40889fM2) {
                boolean _init_$lambda$6;
                _init_$lambda$6 = ReactiveMapEventImpl._init_$lambda$6(ReactiveMapEventImpl.this, c40889fM2);
                return _init_$lambda$6;
            }
        });
        map.m61663y(new C39011cD1.InterfaceC13467i() { // from class: Or4
            @Override // p000.C39011cD1.InterfaceC13467i
            /* renamed from: a */
            public final void mo61656a(C40889fM2 c40889fM2) {
                ReactiveMapEventImpl._init_$lambda$7(ReactiveMapEventImpl.this, c40889fM2);
            }
        });
        map.m61664x(new C39011cD1.InterfaceC13466h() { // from class: Pr4
            @Override // p000.C39011cD1.InterfaceC13466h
            /* renamed from: b */
            public final void mo27414b(C40889fM2 c40889fM2) {
                ReactiveMapEventImpl._init_$lambda$8(ReactiveMapEventImpl.this, c40889fM2);
            }
        });
        map.m61693A(new C39011cD1.InterfaceC13469k() { // from class: Gr4
            @Override // p000.C39011cD1.InterfaceC13469k
            /* renamed from: a */
            public final void mo61654a(LatLng latLng) {
                ReactiveMapEventImpl._init_$lambda$9(ReactiveMapEventImpl.this, latLng);
            }
        });
        map.m61690D(new C39011cD1.InterfaceC13472n() { // from class: Hr4
            @Override // p000.C39011cD1.InterfaceC13472n
            /* renamed from: a */
            public final void mo61653a(DX3 dx3) {
                C45168ma4.this.accept(dx3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ReactiveMapEventImpl this$0, LatLng it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mapClicks.accept(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ReactiveMapEventImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cameraMoves.accept(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ReactiveMapEventImpl this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cameraMoveStarts.accept(Unit.INSTANCE);
        this$0.mutableCameraMoving.accept(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ReactiveMapEventImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cameraIdles.accept(Unit.INSTANCE);
        this$0.mutableCameraMoving.accept(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ReactiveMapEventImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cameraMoveCancels.accept(Unit.INSTANCE);
        this$0.mutableCameraMoving.accept(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ReactiveMapEventImpl this$0, C40816fE1 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.groundOverlayClicks.accept(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$6(ReactiveMapEventImpl this$0, C40889fM2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.markerClicks.accept(it);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(ReactiveMapEventImpl this$0, C40889fM2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.infoWindowCloses.accept(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(ReactiveMapEventImpl this$0, C40889fM2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.infoWindowClicks.accept(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(ReactiveMapEventImpl this$0, LatLng it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mapLongClicks.accept(it);
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<Unit> cameraIdles() {
        Observable<Unit> hide = this.cameraIdles.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "cameraIdles.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<Unit> cameraMoveCancels() {
        Observable<Unit> hide = this.cameraMoveCancels.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "cameraMoveCancels.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<Unit> cameraMoveStarts() {
        return this.cameraMoveStarts.hide();
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<Unit> cameraMoves() {
        Observable<Unit> hide = this.cameraMoves.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "cameraMoves.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Z84<Boolean> getCameraMoving() {
        return (Z84) this.cameraMoving$delegate.getValue();
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<C40816fE1> groundOverlayClicks() {
        return this.groundOverlayClicks.hide();
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<C40889fM2> infoWindowClicks() {
        return this.infoWindowClicks.hide();
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<C40889fM2> infoWindowCloses() {
        return this.infoWindowCloses.hide();
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<LatLng> mapClicks() {
        Observable<LatLng> hide = this.mapClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "mapClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<LatLng> mapLongClicks() {
        Observable<LatLng> hide = this.mapLongClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "mapLongClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<C40889fM2> markerClicks() {
        return this.markerClicks.hide();
    }

    @Override // co.bird.android.app.feature.map.p008ui.ReactiveMapEvent
    public Observable<DX3> polygonClicks() {
        Observable<DX3> hide = this.polygonClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "polygonClicks.hide()");
        return hide;
    }
}
