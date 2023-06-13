package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdPayment;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34862Nx0;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J>\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b0\u0007J\b\u0010\r\u001a\u00020\u000bH\u0002J\"\u0010\u000e\u001a\u00020\u000b2\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002J&\u0010\u000f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006%"}, m28432d2 = {"LNx0;", "", "", "", "metadata", "LTx0;", "confirmPurchaseOnClickListener", "", "Lkotlin/Pair;", "", "lineItems", "", "l", "f", "e", "h", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LRx0;", "b", "LRx0;", "ui", "LTq4;", "c", "LTq4;", "reactiveConfig", "LzN3;", DateTokenConverter.CONVERTER_KEY, "LzN3;", "paymentMethodManager", "Le13;", "Le13;", "navigator", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LRx0;LTq4;LzN3;Le13;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfirmPurchaseDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPurchaseDialogPresenter.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseDialogPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n180#2:102\n180#2:107\n180#2:108\n1549#3:103\n1620#3,3:104\n*S KotlinDebug\n*F\n+ 1 ConfirmPurchaseDialogPresenter.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseDialogPresenter\n*L\n43#1:102\n75#1:107\n97#1:108\n50#1:103\n50#1:104,3\n*E\n"})
/* renamed from: Nx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34862Nx0 {

    /* renamed from: a */
    public final ScopeProvider f25388a;

    /* renamed from: b */
    public final C35798Rx0 f25389b;

    /* renamed from: c */
    public final C36207Tq4 f25390c;

    /* renamed from: d */
    public final InterfaceC52757zN3 f25391d;

    /* renamed from: e */
    public final InterfaceC40099e13 f25392e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nx0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5745a extends FunctionReferenceImpl implements Function1<BirdPayment, Unit> {
        public C5745a(Object obj) {
            super(1, obj, C35798Rx0.class, "setPaymentMethodInfo", "setPaymentMethodInfo(Lco/bird/android/model/BirdPayment;)V", 0);
        }

        /* renamed from: a */
        public final void m93173a(BirdPayment p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C35798Rx0) this.receiver).m86176Rl(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdPayment birdPayment) {
            m93173a(birdPayment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nx0$b */
    /* loaded from: classes3.dex */
    public static final class C5746b extends Lambda implements Function1<Unit, Unit> {
        public C5746b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34862Nx0.this.f25392e.mo37118O1(10070);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nx0$c */
    /* loaded from: classes3.dex */
    public static final class C5747c extends Lambda implements Function1<Unit, Unit> {
        public C5747c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34862Nx0.this.f25389b.m86175Sl(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nx0$d */
    /* loaded from: classes3.dex */
    public static final class C5748d extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Unit>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC36266Tx0 f25395g;

        /* renamed from: h */
        public final /* synthetic */ Map<String, Object> f25396h;

        /* renamed from: i */
        public final /* synthetic */ C34862Nx0 f25397i;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Nx0$d$a */
        /* loaded from: classes3.dex */
        public static final class C5749a extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34862Nx0 f25398g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC36266Tx0 f25399h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5749a(C34862Nx0 c34862Nx0, InterfaceC36266Tx0 interfaceC36266Tx0) {
                super(1);
                this.f25398g = c34862Nx0;
                this.f25399h = interfaceC36266Tx0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                this.f25398g.f25389b.dismiss();
                this.f25399h.mo57713c(true);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Nx0$d$b */
        /* loaded from: classes3.dex */
        public static final class C5750b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34862Nx0 f25400g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5750b(C34862Nx0 c34862Nx0) {
                super(1);
                this.f25400g = c34862Nx0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                C35798Rx0 c35798Rx0 = this.f25400g.f25389b;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                c35798Rx0.error(it);
                this.f25400g.f25389b.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5748d(InterfaceC36266Tx0 interfaceC36266Tx0, Map<String, ? extends Object> map, C34862Nx0 c34862Nx0) {
            super(1);
            this.f25395g = interfaceC36266Tx0;
            this.f25396h = map;
            this.f25397i = c34862Nx0;
        }

        /* renamed from: d */
        public static final void m93169d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC24507p<Unit> mo57714b = this.f25395g.mo57714b(this.f25396h);
            final C5749a c5749a = new C5749a(this.f25397i, this.f25395g);
            AbstractC24507p<Unit> m32066I = mo57714b.m32026s(new InterfaceC23484g() { // from class: Ox0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34862Nx0.C5748d.invoke$lambda$0(Function1.this, obj);
                }
            }).m32066I(C23454a.m33087a());
            final C5750b c5750b = new C5750b(this.f25397i);
            return m32066I.m32029p(new InterfaceC23484g() { // from class: Px0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34862Nx0.C5748d.m93169d(Function1.this, obj);
                }
            });
        }
    }

    public C34862Nx0(ScopeProvider scopeProvider, C35798Rx0 ui, C36207Tq4 reactiveConfig, InterfaceC52757zN3 paymentMethodManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f25388a = scopeProvider;
        this.f25389b = ui;
        this.f25390c = reactiveConfig;
        this.f25391d = paymentMethodManager;
        this.f25392e = navigator;
    }

    /* renamed from: g */
    public static final void m93179g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m93177i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m93176j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final InterfaceC24574u m93175k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onCreate$default(C34862Nx0 c34862Nx0, Map map, InterfaceC36266Tx0 interfaceC36266Tx0, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        c34862Nx0.m93174l(map, interfaceC36266Tx0, list);
    }

    /* renamed from: e */
    public final void m93181e(List<Pair<String, Long>> list) {
        int collectionSizeOrDefault;
        Currency m25591o = C45097mS5.m25591o(this.f25390c.m82623f8().m73665a().getRideConfig().getCurrency());
        List<Pair<String, Long>> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list2.iterator();
        long j = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            long longValue = ((Number) pair.component2()).longValue();
            j += longValue;
            arrayList.add(TuplesKt.m28425to((String) pair.component1(), C51916xx1.f118396a.m4408d(longValue, m25591o, EnumC36501Ux1.SHOW_ALWAYS)));
        }
        this.f25389b.m86177Ql(arrayList, C51916xx1.f118396a.m4408d(j, m25591o, EnumC36501Ux1.SHOW_ALWAYS));
    }

    /* renamed from: f */
    public final void m93180f() {
        Observable observeOn = C37279Yf5.m74576S(this.f25391d.mo1484a()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "paymentMethodManager.def…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f25388a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5745a c5745a = new C5745a(this.f25389b);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Mx0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34862Nx0.m93179g(Function1.this, obj);
            }
        });
    }

    /* renamed from: h */
    public final void m93178h(Map<String, ? extends Object> map, InterfaceC36266Tx0 interfaceC36266Tx0) {
        Object m33094as = this.f25389b.m86178Pl().m33094as(AutoDispose.m45239a(this.f25388a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5746b c5746b = new C5746b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Jx0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34862Nx0.m93177i(Function1.this, obj);
            }
        });
        Observable<Unit> m86174f = this.f25389b.m86174f();
        final C5747c c5747c = new C5747c();
        Observable<Unit> doOnNext = m86174f.doOnNext(new InterfaceC23484g() { // from class: Kx0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34862Nx0.m93176j(Function1.this, obj);
            }
        });
        final C5748d c5748d = new C5748d(interfaceC36266Tx0, map, this);
        Observable retry = doOnNext.flatMapMaybe(new InterfaceC23492o() { // from class: Lx0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93175k;
                m93175k = C34862Nx0.m93175k(Function1.this, obj);
                return m93175k;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun initListener…r)\n      .subscribe()\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f25388a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
    }

    /* renamed from: l */
    public final void m93174l(Map<String, ? extends Object> metadata, InterfaceC36266Tx0 confirmPurchaseOnClickListener, List<Pair<String, Long>> lineItems) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(confirmPurchaseOnClickListener, "confirmPurchaseOnClickListener");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        m93178h(metadata, confirmPurchaseOnClickListener);
        m93181e(lineItems);
        m93180f();
    }
}
