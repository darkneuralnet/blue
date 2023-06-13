package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lwd4;", "", "", "Lco/bird/android/model/constant/PaymentMethod;", "", "paymentMethodExclusion", "", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lyd4;", "b", "Lyd4;", "ui", "LTq4;", "c", "LTq4;", "reactiveConfig", "LZg3;", "LZg3;", "onPaymentMethodSelectedListener", "LiD1;", "e", "LiD1;", "googlePayManager", "<init>", "(Lcom/uber/autodispose/ScopeProvider;Lyd4;LTq4;LZg3;LiD1;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuickPaymentDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickPaymentDialogPresenter.kt\nco/bird/android/feature/payment/bottomsheet/QuickPaymentDialogPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,48:1\n61#2,2:49\n180#3:51\n180#3:52\n*S KotlinDebug\n*F\n+ 1 QuickPaymentDialogPresenter.kt\nco/bird/android/feature/payment/bottomsheet/QuickPaymentDialogPresenter\n*L\n24#1:49,2\n30#1:51\n42#1:52\n*E\n"})
/* renamed from: wd4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51126wd4 {

    /* renamed from: a */
    public final ScopeProvider f116279a;

    /* renamed from: b */
    public final C52312yd4 f116280b;

    /* renamed from: c */
    public final C36207Tq4 f116281c;

    /* renamed from: d */
    public final InterfaceC37520Zg3 f116282d;

    /* renamed from: e */
    public final InterfaceC42586iD1 f116283e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: wd4$a */
    /* loaded from: classes3.dex */
    public static final class C29925a<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C29925a<T1, T2, T3, R> f116284a = new C29925a<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0005*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/constant/PaymentMethod;", "Lco/bird/android/model/constant/PaymentProvider;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wd4$b */
    /* loaded from: classes3.dex */
    public static final class C29926b extends Lambda implements Function1<Map<PaymentMethod, ? extends PaymentProvider>, List<? extends PaymentMethod>> {

        /* renamed from: g */
        public static final C29926b f116285g = new C29926b();

        public C29926b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<PaymentMethod> invoke(Map<PaymentMethod, ? extends PaymentProvider> it) {
            List<PaymentMethod> list;
            Intrinsics.checkNotNullParameter(it, "it");
            list = CollectionsKt___CollectionsKt.toList(it.keySet());
            return list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062j\u0010\u0005\u001af\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0004 \u0003*2\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/constant/PaymentMethod;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wd4$c */
    /* loaded from: classes3.dex */
    public static final class C29927c extends Lambda implements Function1<Triple<? extends List<? extends PaymentMethod>, ? extends Boolean, ? extends Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Map<PaymentMethod, String> f116287h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29927c(Map<PaymentMethod, String> map) {
            super(1);
            this.f116287h = map;
        }

        /* renamed from: a */
        public final void m6577a(Triple<? extends List<? extends PaymentMethod>, Boolean, Boolean> triple) {
            List<? extends PaymentMethod> paymentMethodToProvider = triple.component1();
            Boolean googlePayAvailable = triple.component2();
            boolean booleanValue = triple.component3().booleanValue();
            C52312yd4 c52312yd4 = C51126wd4.this.f116280b;
            Intrinsics.checkNotNullExpressionValue(paymentMethodToProvider, "paymentMethodToProvider");
            Intrinsics.checkNotNullExpressionValue(googlePayAvailable, "googlePayAvailable");
            c52312yd4.m3150b(paymentMethodToProvider, googlePayAvailable.booleanValue(), booleanValue, this.f116287h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends PaymentMethod>, ? extends Boolean, ? extends Boolean> triple) {
            m6577a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethod;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/PaymentMethod;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wd4$d */
    /* loaded from: classes3.dex */
    public static final class C29928d extends Lambda implements Function1<PaymentMethod, Unit> {
        public C29928d() {
            super(1);
        }

        /* renamed from: a */
        public final void m6576a(PaymentMethod it) {
            InterfaceC37520Zg3 interfaceC37520Zg3 = C51126wd4.this.f116282d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC37520Zg3.mo15688a(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
            m6576a(paymentMethod);
            return Unit.INSTANCE;
        }
    }

    public C51126wd4(ScopeProvider scopeProvider, C52312yd4 ui, C36207Tq4 reactiveConfig, InterfaceC37520Zg3 onPaymentMethodSelectedListener, InterfaceC42586iD1 googlePayManager) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(onPaymentMethodSelectedListener, "onPaymentMethodSelectedListener");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        this.f116279a = scopeProvider;
        this.f116280b = ui;
        this.f116281c = reactiveConfig;
        this.f116282d = onPaymentMethodSelectedListener;
        this.f116283e = googlePayManager;
    }

    /* renamed from: e */
    public static final List m6582e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m6581f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m6580g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m6583d(Map<PaymentMethod, String> paymentMethodExclusion) {
        Intrinsics.checkNotNullParameter(paymentMethodExclusion, "paymentMethodExclusion");
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Map<PaymentMethod, PaymentProvider>> m82778Q8 = this.f116281c.m82778Q8();
        final C29926b c29926b = C29926b.f116285g;
        InterfaceC23434B map = m82778Q8.map(new InterfaceC23492o() { // from class: td4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m6582e;
                m6582e = C51126wd4.m6582e(Function1.this, obj);
                return m6582e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "reactiveConfig.paymentMe….map { it.keys.toList() }");
        Observable<Boolean> m33123k0 = this.f116283e.mo16237g().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "googlePayManager.googlePayReady().toObservable()");
        Observable combineLatest = Observable.combineLatest(map, m33123k0, this.f116281c.m82810N6(), C29925a.f116284a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f116279a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29927c c29927c = new C29927c(paymentMethodExclusion);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ud4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51126wd4.m6581f(Function1.this, obj);
            }
        });
        Observable<PaymentMethod> observeOn2 = this.f116280b.m3151a().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.paymentMethodClicks()…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f116279a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29928d c29928d = new C29928d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: vd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51126wd4.m6580g(Function1.this, obj);
            }
        });
    }
}
