package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Balance;
import co.bird.android.model.constant.MapMode;
import co.bird.api.response.BalanceRefundResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C32958Ft4;
import p000.H31;
import p000.InterfaceC44647lh6;
import p000.S74;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"LFt4;", "", "", "m", "n", "i", "o", "LIt4;", C17296a.f69688o, "LIt4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "appPreference", "LTq4;", "e", "LTq4;", "reactiveConfig", "LEa;", "f", "LEa;", "analyticsManager", "LYR4;", "g", "LYR4;", "rideManager", "Llh6;", "h", "Llh6;", "userManager", "<init>", "(LIt4;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LTq4;LEa;LYR4;Llh6;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRefundAccountBalancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefundAccountBalancePresenter.kt\nco/bird/android/feature/selfservepayment/refund/RefundAccountBalancePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,123:1\n199#2:124\n180#2:125\n237#2:126\n*S KotlinDebug\n*F\n+ 1 RefundAccountBalancePresenter.kt\nco/bird/android/feature/selfservepayment/refund/RefundAccountBalancePresenter\n*L\n58#1:124\n72#1:125\n119#1:126\n*E\n"})
/* renamed from: Ft4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32958Ft4 {

    /* renamed from: a */
    public final C33660It4 f10429a;

    /* renamed from: b */
    public final ScopeProvider f10430b;

    /* renamed from: c */
    public final InterfaceC40099e13 f10431c;

    /* renamed from: d */
    public final C22454gl f10432d;

    /* renamed from: e */
    public final C36207Tq4 f10433e;

    /* renamed from: f */
    public final InterfaceC1880Ea f10434f;

    /* renamed from: g */
    public final YR4 f10435g;

    /* renamed from: h */
    public final InterfaceC44647lh6 f10436h;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a:\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/BalanceRefundResponse;", "it", "Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BalanceRefundResponse;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ft4$a */
    /* loaded from: classes3.dex */
    public static final class C2498a extends Lambda implements Function1<BalanceRefundResponse, Triple<? extends String, ? extends String, ? extends Integer>> {

        /* renamed from: g */
        public static final C2498a f10437g = new C2498a();

        public C2498a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<String, String, Integer> invoke(BalanceRefundResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Triple<>(it.getTitle(), it.getDescription(), it.getAmount());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ft4$b */
    /* loaded from: classes3.dex */
    public static final class C2499b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2499b f10438g = new C2499b();

        public C2499b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error querying balance refund, defaulting to fallback ui strings: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052>\u0010\u0004\u001a:\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ft4$c */
    /* loaded from: classes3.dex */
    public static final class C2500c extends Lambda implements Function1<Triple<? extends String, ? extends String, ? extends Integer>, Unit> {
        public C2500c() {
            super(1);
        }

        /* renamed from: a */
        public final void m106297a(Triple<String, String, Integer> triple) {
            int i;
            boolean z;
            String component1 = triple.component1();
            String component2 = triple.component2();
            Integer component3 = triple.component3();
            if (component1 == null) {
                component1 = C32958Ft4.this.f10429a.getString(C45871nl4.refund_account_balance_fallback_title, new Object[0]);
            }
            if (component2 == null) {
                component2 = C32958Ft4.this.f10429a.getString(C45871nl4.refund_account_balance_fallback_description, new Object[0]);
            }
            C32958Ft4.this.f10429a.m101561t(component1);
            C32958Ft4.this.f10429a.m101564Ql(component2);
            C33660It4 c33660It4 = C32958Ft4.this.f10429a;
            if (component3 != null) {
                i = component3.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            c33660It4.m101563Rl(z);
            S74.C7343a.showProgress$default(C32958Ft4.this.f10429a, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends String, ? extends String, ? extends Integer> triple) {
            m106297a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ft4$d */
    /* loaded from: classes3.dex */
    public static final class C2501d extends Lambda implements Function1<Unit, Unit> {
        public C2501d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32958Ft4.this.f10431c.mo37003j0(MapMode.RIDER, C32958Ft4.this.f10433e.m82623f8().m73665a().getPaymentConfig().getSelfBalanceRefund().getZendeskArticleId(), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ft4$e */
    /* loaded from: classes3.dex */
    public static final class C2502e extends Lambda implements Function1<Unit, Unit> {
        public C2502e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            S74.C7343a.showProgress$default(C32958Ft4.this.f10429a, true, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/Balance;", "Lco/bird/api/response/BalanceRefundResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ft4$f */
    /* loaded from: classes3.dex */
    public static final class C2503f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Pair<? extends Balance, ? extends BalanceRefundResponse>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/BalanceRefundResponse;", "balanceRefund", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/BalanceRefundResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ft4$f$a */
        /* loaded from: classes3.dex */
        public static final class C2504a extends Lambda implements Function1<BalanceRefundResponse, InterfaceC23447K<? extends Pair<? extends Balance, ? extends BalanceRefundResponse>>> {

            /* renamed from: g */
            public final /* synthetic */ C32958Ft4 f10443g;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Balance;", "it", "Lkotlin/Pair;", "Lco/bird/api/response/BalanceRefundResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Ft4$f$a$a */
            /* loaded from: classes3.dex */
            public static final class C2505a extends Lambda implements Function1<Balance, Pair<? extends Balance, ? extends BalanceRefundResponse>> {

                /* renamed from: g */
                public final /* synthetic */ BalanceRefundResponse f10444g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2505a(BalanceRefundResponse balanceRefundResponse) {
                    super(1);
                    this.f10444g = balanceRefundResponse;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<Balance, BalanceRefundResponse> invoke(Balance it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return TuplesKt.m28425to(it, this.f10444g);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2504a(C32958Ft4 c32958Ft4) {
                super(1);
                this.f10443g = c32958Ft4;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23447K<? extends Pair<Balance, BalanceRefundResponse>> invoke(BalanceRefundResponse balanceRefund) {
                Intrinsics.checkNotNullParameter(balanceRefund, "balanceRefund");
                AbstractC23442F fetchBalance$default = InterfaceC44647lh6.C25764a.fetchBalance$default(this.f10443g.f10436h, null, 1, null);
                final C2505a c2505a = new C2505a(balanceRefund);
                return fetchBalance$default.m33157I(new InterfaceC23492o() { // from class: Ht4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C32958Ft4.C2503f.C2504a.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
        }

        public C2503f() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<Balance, BalanceRefundResponse>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("sending query balance refund now...", new Object[0]);
            AbstractC23442F<BalanceRefundResponse> mo26957t = C32958Ft4.this.f10436h.mo26957t(C45097mS5.m25591o(C32958Ft4.this.f10433e.m82623f8().m73665a().getRideConfig().getCurrency()), true);
            final C2504a c2504a = new C2504a(C32958Ft4.this);
            return mo26957t.m33165A(new InterfaceC23492o() { // from class: Gt4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C32958Ft4.C2503f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Balance;", "Lco/bird/api/response/BalanceRefundResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRefundAccountBalancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefundAccountBalancePresenter.kt\nco/bird/android/feature/selfservepayment/refund/RefundAccountBalancePresenter$setupClickListeners$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
    /* renamed from: Ft4$g */
    /* loaded from: classes3.dex */
    public static final class C2506g extends Lambda implements Function1<Pair<? extends Balance, ? extends BalanceRefundResponse>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ft4$g$a */
        /* loaded from: classes3.dex */
        public static final class C2507a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32958Ft4 f10446g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2507a(C32958Ft4 c32958Ft4) {
                super(0);
                this.f10446g = c32958Ft4;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f10446g.f10431c.close();
            }
        }

        public C2506g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Balance, ? extends BalanceRefundResponse> pair) {
            invoke2((Pair<Balance, BalanceRefundResponse>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Balance, BalanceRefundResponse> pair) {
            boolean isBlank;
            boolean isBlank2;
            Balance component1 = pair.component1();
            BalanceRefundResponse component2 = pair.component2();
            String title = component2.getTitle();
            if (title != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(title);
                if (!(!isBlank2)) {
                    title = null;
                }
                if (title != null) {
                    C32958Ft4.this.f10429a.m101561t(title);
                }
            }
            String description = component2.getDescription();
            if (description != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(description);
                if (!(!isBlank)) {
                    description = null;
                }
                if (description != null) {
                    C32958Ft4.this.f10429a.m101564Ql(description);
                }
            }
            Integer amount = component2.getAmount();
            boolean z = (amount != null ? amount.intValue() : 0) > 0;
            String m4408d = C51916xx1.f118396a.m4408d(component1.getBalance(), C45097mS5.m25591o(component1.getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
            C32958Ft4.this.f10429a.m101563Rl(!z);
            S74.C7343a.showProgress$default(C32958Ft4.this.f10429a, false, 0, 2, null);
            H31.C3014a.showBirdDialog$default(C32958Ft4.this.f10429a, new C46719pB1(C32958Ft4.this.f10429a.getString(C45871nl4.update_successful, new Object[0]), C32958Ft4.this.f10429a.getString(C45871nl4.your_refund_has_been_applied, m4408d), Integer.valueOf(C45871nl4.general_got_it), null), false, false, new C2507a(C32958Ft4.this), null, null, null, 118, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ft4$h */
    /* loaded from: classes3.dex */
    public static final class C2508h extends Lambda implements Function1<Throwable, Unit> {
        public C2508h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C32958Ft4.this.f10429a.errorGeneric();
            S74.C7343a.showProgress$default(C32958Ft4.this.f10429a, false, 0, 2, null);
        }
    }

    public C32958Ft4(C33660It4 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, YR4 rideManager, InterfaceC44647lh6 userManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.f10429a = ui;
        this.f10430b = scopeProvider;
        this.f10431c = navigator;
        this.f10432d = appPreference;
        this.f10433e = reactiveConfig;
        this.f10434f = analyticsManager;
        this.f10435g = rideManager;
        this.f10436h = userManager;
    }

    /* renamed from: j */
    public static final Triple m106309j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m106308k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m106307l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m106303p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m106302q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m106301r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m106300s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m106299t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public final void m106310i() {
        S74.C7343a.showProgress$default(this.f10429a, true, 0, 2, null);
        AbstractC23442F<BalanceRefundResponse> mo26957t = this.f10436h.mo26957t(C45097mS5.m25591o(this.f10433e.m82623f8().m73665a().getRideConfig().getCurrency()), false);
        final C2498a c2498a = C2498a.f10437g;
        AbstractC23442F<R> m33157I = mo26957t.m33157I(new InterfaceC23492o() { // from class: Ct4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m106309j;
                m106309j = C32958Ft4.m106309j(Function1.this, obj);
                return m106309j;
            }
        });
        final C2499b c2499b = C2499b.f10438g;
        AbstractC23442F m33152N = m33157I.m33106t(new InterfaceC23484g() { // from class: Dt4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32958Ft4.m106308k(Function1.this, obj);
            }
        }).m33148R(new Triple(null, null, null)).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "userManager.queryBalance…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f10430b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2500c c2500c = new C2500c();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Et4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32958Ft4.m106307l(Function1.this, obj);
            }
        });
    }

    /* renamed from: m */
    public final void m106306m() {
    }

    /* renamed from: n */
    public final void m106305n() {
        m106310i();
        m106304o();
    }

    /* renamed from: o */
    public final void m106304o() {
        Object m33094as = this.f10429a.m101562r0().m33094as(AutoDispose.m45239a(this.f10430b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2501d c2501d = new C2501d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xt4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32958Ft4.m106303p(Function1.this, obj);
            }
        });
        Observable<Unit> m101565Pl = this.f10429a.m101565Pl();
        final C2502e c2502e = new C2502e();
        Observable<Unit> observeOn = m101565Pl.doOnNext(new InterfaceC23484g() { // from class: yt4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32958Ft4.m106302q(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C2503f c2503f = new C2503f();
        Observable observeOn2 = observeOn.flatMapSingle(new InterfaceC23492o() { // from class: zt4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106301r;
                m106301r = C32958Ft4.m106301r(Function1.this, obj);
                return m106301r;
            }
        }).observeOn(C23454a.m33087a());
        final C2506g c2506g = new C2506g();
        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: At4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32958Ft4.m106300s(Function1.this, obj);
            }
        });
        final C2508h c2508h = new C2508h();
        AbstractC23461c m33069Q = doOnNext.doOnError(new InterfaceC23484g() { // from class: Bt4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32958Ft4.m106299t(Function1.this, obj);
            }
        }).ignoreElements().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun setupClickLi…r)\n      .subscribe()\n  }");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f10430b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
