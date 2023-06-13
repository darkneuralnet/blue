package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u001b*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LS7;", "LJ7;", "", "refresh", "LU7;", C17296a.f69688o, "LU7;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "LfF;", DateTokenConverter.CONVERTER_KEY, "LfF;", "batchManager", "LE7;", "e", "LE7;", "converter", "Lio/reactivex/subjects/a;", "", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/a;", "batchesSubject", "<init>", "(LU7;Lcom/uber/autodispose/ScopeProvider;Le13;LfF;LE7;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddToBatchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToBatchPresenter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,63:1\n52#2,2:64\n180#3:66\n161#3:67\n180#3:68\n199#3:69\n*S KotlinDebug\n*F\n+ 1 AddToBatchPresenter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchPresenterImpl\n*L\n32#1:64,2\n40#1:66\n44#1:67\n49#1:68\n59#1:69\n*E\n"})
/* renamed from: S7 */
/* loaded from: classes3.dex */
public final class C7333S7 implements InterfaceC3894J7 {

    /* renamed from: a */
    public final InterfaceC8198U7 f33170a;

    /* renamed from: b */
    public final ScopeProvider f33171b;

    /* renamed from: c */
    public final InterfaceC40099e13 f33172c;

    /* renamed from: d */
    public final InterfaceC20340fF f33173d;

    /* renamed from: e */
    public final InterfaceC1738E7 f33174e;

    /* renamed from: f */
    public final C24552a<List<WireBatch>> f33175f;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S7$a */
    /* loaded from: classes3.dex */
    public static final class C7334a extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C7334a f33176g = new C7334a();

        public C7334a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String it) {
            CharSequence trim;
            Intrinsics.checkNotNullParameter(it, "it");
            trim = StringsKt__StringsKt.trim((CharSequence) it);
            return trim.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireBatch;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: S7$b */
    /* loaded from: classes3.dex */
    public static final class C7335b extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends WireBatch>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C7335b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<String, ? extends List<WireBatch>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String searchTerm = pair.component1();
            List<WireBatch> batches = pair.component2();
            InterfaceC1738E7 interfaceC1738E7 = C7333S7.this.f33174e;
            Intrinsics.checkNotNullExpressionValue(searchTerm, "searchTerm");
            Intrinsics.checkNotNullExpressionValue(batches, "batches");
            return interfaceC1738E7.mo105774a(searchTerm, batches);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S7$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7336c extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C7336c(Object obj) {
            super(1, obj, InterfaceC8198U7.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m85982a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC8198U7) this.receiver).mo75668o(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m85982a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S7$d */
    /* loaded from: classes3.dex */
    public static final class C7337d extends Lambda implements Function1<Unit, Unit> {
        public C7337d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C7333S7.this.f33172c.mo37070X2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "batch", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBatch;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: S7$e */
    /* loaded from: classes3.dex */
    public static final class C7338e extends Lambda implements Function1<WireBatch, Unit> {
        public C7338e() {
            super(1);
        }

        /* renamed from: a */
        public final void m85981a(WireBatch batch) {
            InterfaceC40099e13 interfaceC40099e13 = C7333S7.this.f33172c;
            Intrinsics.checkNotNullExpressionValue(batch, "batch");
            interfaceC40099e13.mo36940t3(batch);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBatch wireBatch) {
            m85981a(wireBatch);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S7$f */
    /* loaded from: classes3.dex */
    public static final class C7339f extends Lambda implements Function1<Throwable, Unit> {
        public C7339f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7333S7.this.f33170a.error(th.getMessage());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S7$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7340g extends FunctionReferenceImpl implements Function1<List<? extends WireBatch>, Unit> {
        public C7340g(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBatch> list) {
            invoke2((List<WireBatch>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBatch> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S7$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7341h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C7341h f33181b = new C7341h();

        public C7341h() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: S7$i */
    /* loaded from: classes3.dex */
    public static final class C7342i<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C7342i<T1, T2, R> f33182a = new C7342i<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    public C7333S7(InterfaceC8198U7 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC20340fF batchManager, InterfaceC1738E7 converter) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(batchManager, "batchManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f33170a = ui;
        this.f33171b = scopeProvider;
        this.f33172c = navigator;
        this.f33173d = batchManager;
        this.f33174e = converter;
        C24552a<List<WireBatch>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<WireBatch>>()");
        this.f33175f = m31922e;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<String> mo75677H = ui.mo75677H();
        final C7334a c7334a = C7334a.f33176g;
        InterfaceC23434B map = mo75677H.map(new InterfaceC23492o() { // from class: N7
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m85991i;
                m85991i = C7333S7.m85991i(Function1.this, obj);
                return m85991i;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.searchTermChanges().map { it.trim() }");
        Observable combineLatest = Observable.combineLatest(map, m31922e, C7342i.f33182a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C7335b c7335b = new C7335b();
        Observable observeOn = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: O7
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m85990j;
                m85990j = C7333S7.m85990j(Function1.this, obj);
                return m85990j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7336c c7336c = new C7336c(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: P7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7333S7.m85989k(Function1.this, obj);
            }
        });
        Object m32150f = ui.mo75670eg().m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7337d c7337d = new C7337d();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: Q7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7333S7.m85988l(Function1.this, obj);
            }
        });
        Observable<WireBatch> observeOn2 = ui.mo75669j1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.batchClicks()\n      .…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7338e c7338e = new C7338e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: R7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7333S7.m85987m(Function1.this, obj);
            }
        });
    }

    /* renamed from: i */
    public static final String m85991i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23447K m85990j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m85989k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m85988l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m85987m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m85986n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m85985o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m85984p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC3894J7
    public void refresh() {
        AbstractC23442F<List<WireBatch>> m33152N = this.f33173d.mo34294c().m33152N(C23454a.m33087a());
        final C7339f c7339f = new C7339f();
        AbstractC23442F<List<WireBatch>> m33106t = m33152N.m33106t(new InterfaceC23484g() { // from class: K7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7333S7.m85986n(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun refresh() {…t::onNext, Timber::e)\n  }");
        Object m33135e = m33106t.m33135e(AutoDispose.m45239a(this.f33171b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7340g c7340g = new C7340g(this.f33175f);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: L7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7333S7.m85985o(Function1.this, obj);
            }
        };
        final C7341h c7341h = C7341h.f33181b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: M7
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7333S7.m85984p(Function1.this, obj);
            }
        });
    }
}
