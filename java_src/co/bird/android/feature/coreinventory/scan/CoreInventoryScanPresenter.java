package co.bird.android.feature.coreinventory.scan;

import co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b)\u0010*J1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fRJ\u0010(\u001a8\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00060# %*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00060#\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;", "Lf1;", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", "T", "Lio/reactivex/F;", "", "processEnabled", "d0", "(Lio/reactivex/F;Ljava/lang/Boolean;)Lio/reactivex/F;", "renderer", "", "J", "LTB0;", "e", "LTB0;", "coreInventoryManager", "Llh6;", "f", "Llh6;", "userManager", "LSy6;", "g", "LSy6;", "warehouseManager", "LTq4;", "h", "LTq4;", "reactiveConfig", "Le13;", "i", "Le13;", "navigator", "Lma4;", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "kotlin.jvm.PlatformType", "j", "Lma4;", "coreInventoryRelay", "<init>", "(LTB0;Llh6;LSy6;LTq4;Le13;)V", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,261:1\n52#2,2:262\n52#2,2:265\n180#3:264\n180#3:267\n180#3:268\n180#3:269\n180#3:271\n180#3:272\n180#3:273\n180#3:274\n180#3:275\n180#3:276\n233#4:270\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter\n*L\n34#1:262,2\n49#1:265,2\n38#1:264\n53#1:267\n95#1:268\n125#1:269\n139#1:271\n191#1:272\n200#1:273\n213#1:274\n222#1:275\n238#1:276\n136#1:270\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter extends AbstractC20169f1<CoreInventoryScanRenderer, CoreInventoryScanState> {

    /* renamed from: e */
    public final TB0 f63831e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f63832f;

    /* renamed from: g */
    public final InterfaceC36047Sy6 f63833g;

    /* renamed from: h */
    public final C36207Tq4 f63834h;

    /* renamed from: i */
    public final InterfaceC40099e13 f63835i;

    /* renamed from: j */
    public final C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>> f63836j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter(TB0 coreInventoryManager, InterfaceC44647lh6 userManager, InterfaceC36047Sy6 warehouseManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator) {
        super(new UpdateUi(null, null, null, null, null, null, null, null, null, null, false, null, 0, 0, null, 32767, null));
        Intrinsics.checkNotNullParameter(coreInventoryManager, "coreInventoryManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(warehouseManager, "warehouseManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f63831e = coreInventoryManager;
        this.f63832f = userManager;
        this.f63833g = warehouseManager;
        this.f63834h = reactiveConfig;
        this.f63835i = navigator;
        C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<Pair<WireVeh…entoryScan, Boolean?>>>()");
        this.f63836j = m25409g;
    }

    /* renamed from: K */
    public static final void m58336K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23447K m58335L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final List m58334M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m58333N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m58332O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final List m58331P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m58330Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final List m58329R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m58328S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final Integer m58327T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m58326U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m58325V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m58324W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final List m58323X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m58322Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m58321Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m58320a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m58319b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m58318c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static /* synthetic */ AbstractC23442F m58316e0(CoreInventoryScanPresenter coreInventoryScanPresenter, AbstractC23442F abstractC23442F, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return coreInventoryScanPresenter.m58317d0(abstractC23442F, bool);
    }

    /* renamed from: f */
    public static final void m58315f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m58314f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m58313g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m58312g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: J */
    public void consume(CoreInventoryScanRenderer renderer) {
        List<Pair<WireVehicleInventoryScan, Boolean>> emptyList;
        List<Pair<WireVehicleInventoryScan, Boolean>> emptyList2;
        List<Pair<WireVehicleInventoryScan, Boolean>> emptyList3;
        List<Pair<WireVehicleInventoryScan, Boolean>> emptyList4;
        List<Pair<WireVehicleInventoryScan, Boolean>> emptyList5;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f63834h.m82627f4(), this.f63834h.m82691Z5(), CoreInventoryScanPresenter$consume$$inlined$combineLatest$1.f63837a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$1 coreInventoryScanPresenter$consume$1 = new CoreInventoryScanPresenter$consume$1(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: lC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58315f(Function1.this, obj);
            }
        });
        C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>> c45168ma4 = this.f63836j;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<Pair<WireVehicleInventoryScan, Boolean>>> startWith = c45168ma4.startWith((C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "coreInventoryRelay.start…entoryScan, Boolean?>>())");
        Observable combineLatest2 = Observable.combineLatest(startWith, renderer.mo58269K1(), CoreInventoryScanPresenter$consume$$inlined$combineLatest$2.f63838a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Object m33094as2 = combineLatest2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$2 coreInventoryScanPresenter$consume$2 = new CoreInventoryScanPresenter$consume$2(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: nC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58313g(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(renderer.mo54815T(), renderer.mo58269K1());
        final CoreInventoryScanPresenter$consume$3 coreInventoryScanPresenter$consume$3 = new CoreInventoryScanPresenter$consume$3(this);
        Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: pC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m58326U;
                m58326U = CoreInventoryScanPresenter.m58326U(Function1.this, obj);
                return m58326U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun consume(ren…{ navigator.close() }\n  }");
        C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>> c45168ma42 = this.f63836j;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<Pair<WireVehicleInventoryScan, Boolean>>> startWith2 = c45168ma42.startWith((C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>>) emptyList2);
        Intrinsics.checkNotNullExpressionValue(startWith2, "coreInventoryRelay.start…entoryScan, Boolean?>>())");
        Observable m31950a2 = C24527f.m31950a(flatMapSingle, startWith2);
        final CoreInventoryScanPresenter$consume$4 coreInventoryScanPresenter$consume$4 = CoreInventoryScanPresenter$consume$4.f63860g;
        Observable map = m31950a2.map(new InterfaceC23492o() { // from class: qC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m58323X;
                m58323X = CoreInventoryScanPresenter.m58323X(Function1.this, obj);
                return m58323X;
            }
        });
        final CoreInventoryScanPresenter$consume$5 coreInventoryScanPresenter$consume$5 = new CoreInventoryScanPresenter$consume$5(this);
        Observable retry = map.doOnError(new InterfaceC23484g() { // from class: rC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58322Y(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…{ navigator.close() }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$6 coreInventoryScanPresenter$consume$6 = new CoreInventoryScanPresenter$consume$6(this.f63836j);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: sC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58321Z(Function1.this, obj);
            }
        });
        Observable m31950a3 = C24527f.m31950a(renderer.mo58265c1(), renderer.mo58269K1());
        final CoreInventoryScanPresenter$consume$7 coreInventoryScanPresenter$consume$7 = new CoreInventoryScanPresenter$consume$7(this);
        Observable flatMapSingle2 = m31950a3.flatMapSingle(new InterfaceC23492o() { // from class: tC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m58320a0;
                m58320a0 = CoreInventoryScanPresenter.m58320a0(Function1.this, obj);
                return m58320a0;
            }
        });
        final CoreInventoryScanPresenter$consume$8 coreInventoryScanPresenter$consume$8 = new CoreInventoryScanPresenter$consume$8(this);
        Observable retry2 = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: uC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58319b0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "override fun consume(ren…{ navigator.close() }\n  }");
        Object m33094as4 = retry2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$9 coreInventoryScanPresenter$consume$9 = new CoreInventoryScanPresenter$consume$9(this);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: vC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58318c0(Function1.this, obj);
            }
        });
        Observable<Unit> mo58270I2 = renderer.mo58270I2();
        C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>> c45168ma43 = this.f63836j;
        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<Pair<WireVehicleInventoryScan, Boolean>>> startWith3 = c45168ma43.startWith((C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>>) emptyList3);
        Intrinsics.checkNotNullExpressionValue(startWith3, "coreInventoryRelay.start…entoryScan, Boolean?>>())");
        Observable<R> withLatestFrom = mo58270I2.withLatestFrom(startWith3, new InterfaceC23480c<Unit, List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>, R>() { // from class: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$$inlined$withLatestFrom$1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final R apply(Unit unit, List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>> list) {
                return (R) list;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Object m33094as5 = withLatestFrom.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$11 coreInventoryScanPresenter$consume$11 = new CoreInventoryScanPresenter$consume$11(this);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: xC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58336K(Function1.this, obj);
            }
        });
        Observable<Unit> mo58266b8 = renderer.mo58266b8();
        C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>> c45168ma44 = this.f63836j;
        emptyList4 = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<Pair<WireVehicleInventoryScan, Boolean>>> startWith4 = c45168ma44.startWith((C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>>) emptyList4);
        Intrinsics.checkNotNullExpressionValue(startWith4, "coreInventoryRelay.start…entoryScan, Boolean?>>())");
        Observable m31949b = C24527f.m31949b(mo58266b8, startWith4, renderer.mo58269K1());
        final CoreInventoryScanPresenter$consume$12 coreInventoryScanPresenter$consume$12 = new CoreInventoryScanPresenter$consume$12(this);
        Observable flatMapSingle3 = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: wC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m58335L;
                m58335L = CoreInventoryScanPresenter.m58335L(Function1.this, obj);
                return m58335L;
            }
        });
        final CoreInventoryScanPresenter$consume$13 coreInventoryScanPresenter$consume$13 = CoreInventoryScanPresenter$consume$13.f63847g;
        Observable map2 = flatMapSingle3.map(new InterfaceC23492o() { // from class: AC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m58334M;
                m58334M = CoreInventoryScanPresenter.m58334M(Function1.this, obj);
                return m58334M;
            }
        });
        final CoreInventoryScanPresenter$consume$14 coreInventoryScanPresenter$consume$14 = new CoreInventoryScanPresenter$consume$14(this);
        Observable retry3 = map2.doOnError(new InterfaceC23484g() { // from class: BC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58333N(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry3, "override fun consume(ren…{ navigator.close() }\n  }");
        Object m33094as6 = retry3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$15 coreInventoryScanPresenter$consume$15 = new CoreInventoryScanPresenter$consume$15(this.f63836j);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: CC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58332O(Function1.this, obj);
            }
        });
        Observable m31950a4 = C24527f.m31950a(renderer.mo58271A1(), this.f63836j);
        final CoreInventoryScanPresenter$consume$16 coreInventoryScanPresenter$consume$16 = CoreInventoryScanPresenter$consume$16.f63850g;
        Observable map3 = m31950a4.map(new InterfaceC23492o() { // from class: DC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m58331P;
                m58331P = CoreInventoryScanPresenter.m58331P(Function1.this, obj);
                return m58331P;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "renderer.itemSwiped()\n  ….scanIdentifier }\n      }");
        Object m33094as7 = map3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$17 coreInventoryScanPresenter$consume$17 = new CoreInventoryScanPresenter$consume$17(this.f63836j);
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: EC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58330Q(Function1.this, obj);
            }
        });
        Observable m31950a5 = C24527f.m31950a(renderer.mo58268V(), this.f63836j);
        final CoreInventoryScanPresenter$consume$18 coreInventoryScanPresenter$consume$18 = CoreInventoryScanPresenter$consume$18.f63851g;
        Observable map4 = m31950a5.map(new InterfaceC23492o() { // from class: FC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m58329R;
                m58329R = CoreInventoryScanPresenter.m58329R(Function1.this, obj);
                return m58329R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "renderer.undoDeleteClick…Array()\n        )\n      }");
        Object m33094as8 = map4.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$19 coreInventoryScanPresenter$consume$19 = new CoreInventoryScanPresenter$consume$19(this.f63836j);
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: GC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58328S(Function1.this, obj);
            }
        });
        Observable<Unit> mo58264z1 = renderer.mo58264z1();
        C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>> c45168ma45 = this.f63836j;
        emptyList5 = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<Pair<WireVehicleInventoryScan, Boolean>>> startWith5 = c45168ma45.startWith((C45168ma4<List<Pair<WireVehicleInventoryScan, Boolean>>>) emptyList5);
        Intrinsics.checkNotNullExpressionValue(startWith5, "coreInventoryRelay.start…entoryScan, Boolean?>>())");
        Observable m31950a6 = C24527f.m31950a(mo58264z1, startWith5);
        final CoreInventoryScanPresenter$consume$20 coreInventoryScanPresenter$consume$20 = CoreInventoryScanPresenter$consume$20.f63855g;
        Observable map5 = m31950a6.map(new InterfaceC23492o() { // from class: HC0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m58327T;
                m58327T = CoreInventoryScanPresenter.m58327T(Function1.this, obj);
                return m58327T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "renderer.backPresses()\n …cle not processed\n      }");
        Object m33094as9 = map5.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$21 coreInventoryScanPresenter$consume$21 = new CoreInventoryScanPresenter$consume$21(this);
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: mC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58325V(Function1.this, obj);
            }
        });
        Object m33094as10 = renderer.mo58267W().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final CoreInventoryScanPresenter$consume$22 coreInventoryScanPresenter$consume$22 = new CoreInventoryScanPresenter$consume$22(this);
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: oC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58324W(Function1.this, obj);
            }
        });
    }

    /* renamed from: d0 */
    public final <T> AbstractC23442F<T> m58317d0(AbstractC23442F<T> abstractC23442F, Boolean bool) {
        final CoreInventoryScanPresenter$progress$1 coreInventoryScanPresenter$progress$1 = new CoreInventoryScanPresenter$progress$1(this, bool);
        AbstractC23442F<T> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: yC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58314f0(Function1.this, obj);
            }
        });
        final CoreInventoryScanPresenter$progress$2 coreInventoryScanPresenter$progress$2 = new CoreInventoryScanPresenter$progress$2(this);
        AbstractC23442F<T> m33101w = m33102v.m33101w(new InterfaceC23484g() { // from class: zC0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CoreInventoryScanPresenter.m58312g0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun <T>Single<T>…  )\n        }\n      }\n  }");
        return m33101w;
    }
}
