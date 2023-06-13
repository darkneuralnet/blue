package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireHydratedRoute;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J2\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\"\u0010'\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010)\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R.\u0010-\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020+ $*\n\u0012\u0004\u0012\u00020+\u0018\u00010*0*0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&¨\u00060"}, m28432d2 = {"LG46;", "Lz46;", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "refresh", "T", "Lio/reactivex/F;", "LHM4;", "Lio/reactivex/Observable;", "resume", "j", "", "e", "l", "LaM;", "LaM;", "birdManager", "Ltc5;", "b", "Ltc5;", "routingManager", "LH46;", "c", "LH46;", "ui", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lt46;", "Lt46;", "converter", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/a;", "summarySubject", "g", "birdSubject", "", "Lco/bird/android/model/wire/WireHydratedRoute;", "h", "timelineSubject", "<init>", "(LaM;Ltc5;LH46;Lcom/uber/autodispose/ScopeProvider;Lt46;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelinePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelinePresenter.kt\nco/bird/android/feature/commandcenter/timeline/TimelinePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n180#2:88\n199#2:89\n9#3,4:90\n1#4:94\n*S KotlinDebug\n*F\n+ 1 TimelinePresenter.kt\nco/bird/android/feature/commandcenter/timeline/TimelinePresenterImpl\n*L\n49#1:88\n69#1:89\n84#1:90,4\n*E\n"})
/* renamed from: G46 */
/* loaded from: classes3.dex */
public final class G46 implements InterfaceC52583z46 {

    /* renamed from: a */
    public final InterfaceC10636aM f10868a;

    /* renamed from: b */
    public final InterfaceC49339tc5 f10869b;

    /* renamed from: c */
    public final H46 f10870c;

    /* renamed from: d */
    public final ScopeProvider f10871d;

    /* renamed from: e */
    public final InterfaceC49026t46 f10872e;

    /* renamed from: f */
    public final C24552a<BirdSummaryBody> f10873f;

    /* renamed from: g */
    public final C24552a<WireBird> f10874g;

    /* renamed from: h */
    public final C24552a<List<WireHydratedRoute>> f10875h;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireHydratedRoute;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G46$a */
    /* loaded from: classes3.dex */
    public static final class C2627a extends Lambda implements Function1<Pair<? extends BirdSummaryBody, ? extends List<? extends WireHydratedRoute>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C2627a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<BirdSummaryBody, ? extends List<WireHydratedRoute>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BirdSummaryBody summary = pair.component1();
            List<WireHydratedRoute> timeline = pair.component2();
            InterfaceC49026t46 interfaceC49026t46 = G46.this.f10872e;
            Intrinsics.checkNotNullExpressionValue(summary, "summary");
            Intrinsics.checkNotNullExpressionValue(timeline, "timeline");
            return interfaceC49026t46.mo9214a(summary, timeline);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G46$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2628b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C2628b(Object obj) {
            super(1, obj, H46.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((H46) this.receiver).mo103001b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G46$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2629c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C2629c(Object obj) {
            super(1, obj, G46.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((G46) this.receiver).m105846l(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aÊ\u0001\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003 \u0005*d\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireHydratedRoute;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G46$d */
    /* loaded from: classes3.dex */
    public static final class C2630d extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends Pair<? extends BirdSummaryBody, ? extends List<? extends WireHydratedRoute>>>> {
        public C2630d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<BirdSummaryBody, List<WireHydratedRoute>>> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C24530g c24530g = C24530g.f91174a;
            G46 g46 = G46.this;
            AbstractC23442F m105848j = g46.m105848j(g46.f10868a.mo71571o(bird.getId()), G46.this.f10873f);
            G46 g462 = G46.this;
            return c24530g.m31946a(m105848j, g462.m105848j(g462.f10869b.mo9966b(bird.getId()), G46.this.f10875h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireHydratedRoute;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G46$e */
    /* loaded from: classes3.dex */
    public static final class C2631e extends Lambda implements Function1<Pair<? extends BirdSummaryBody, ? extends List<? extends WireHydratedRoute>>, Unit> {
        public C2631e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BirdSummaryBody, ? extends List<? extends WireHydratedRoute>> pair) {
            invoke2((Pair<BirdSummaryBody, ? extends List<WireHydratedRoute>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BirdSummaryBody, ? extends List<WireHydratedRoute>> pair) {
            G46.this.f10873f.onNext(pair.component1());
            G46.this.f10875h.onNext(pair.component2());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G46$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2632f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C2632f(Object obj) {
            super(1, obj, G46.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((G46) this.receiver).m105846l(p0);
        }
    }

    public G46(InterfaceC10636aM birdManager, InterfaceC49339tc5 routingManager, H46 ui, ScopeProvider scopeProvider, InterfaceC49026t46 converter) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(routingManager, "routingManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f10868a = birdManager;
        this.f10869b = routingManager;
        this.f10870c = ui;
        this.f10871d = scopeProvider;
        this.f10872e = converter;
        C24552a<BirdSummaryBody> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<BirdSummaryBody>()");
        this.f10873f = m31922e;
        C24552a<WireBird> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<WireBird>()");
        this.f10874g = m31922e2;
        C24552a<List<WireHydratedRoute>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<List<WireHydratedRoute>>()");
        this.f10875h = m31922e3;
        Observable m31956a = C24523e.f91168a.m31956a(m31922e, m31922e3);
        final C2627a c2627a = new C2627a();
        Observable observeOn = m31956a.switchMapSingle(new InterfaceC23492o() { // from class: E46
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105850h;
                m105850h = G46.m105850h(Function1.this, obj);
                return m105850h;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2628b c2628b = new C2628b(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: F46
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G46.m105849i(Function1.this, obj);
            }
        });
    }

    /* renamed from: h */
    public static final InterfaceC23447K m105850h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m105849i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m105847k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final InterfaceC23447K m105845m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m105844n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m105843o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC52583z46
    /* renamed from: a */
    public void mo1847a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f10874g.onNext(bird);
        refresh();
    }

    /* renamed from: j */
    public final <T> AbstractC23442F<T> m105848j(AbstractC23442F<HM4<T>> abstractC23442F, Observable<T> observable) {
        AbstractC23442F m70883l = C38096ag5.m70883l(abstractC23442F);
        final C2629c c2629c = new C2629c(this);
        AbstractC23442F<T> m33151O = m70883l.m33106t(new InterfaceC23484g() { // from class: D46
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G46.m105847k(Function1.this, obj);
            }
        }).m33151O(observable.firstOrError());
        Intrinsics.checkNotNullExpressionValue(m33151O, "getResponseBody()\n      …xt(resume.firstOrError())");
        return m33151O;
    }

    /* renamed from: l */
    public final void m105846l(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f10870c.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f10870c.errorGeneric();
        }
    }

    @Override // p000.InterfaceC52583z46
    public void refresh() {
        AbstractC23442F<WireBird> firstOrError = this.f10874g.firstOrError();
        final C2630d c2630d = new C2630d();
        AbstractC23442F<R> m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: A46
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105845m;
                m105845m = G46.m105845m(Function1.this, obj);
                return m105845m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun refresh() {…)\n      }, ::onError)\n  }");
        Object m33135e = C28237sD.progress$default(m33165A, this.f10870c, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f10871d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2631e c2631e = new C2631e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: B46
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G46.m105844n(Function1.this, obj);
            }
        };
        final C2632f c2632f = new C2632f(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: C46
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G46.m105843o(Function1.this, obj);
            }
        });
    }
}
