package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Balance;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.UserKt;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import co.bird.api.request.BirdCustomer;
import co.bird.api.request.BraintreeTokenResponse;
import co.bird.api.request.CreateCustomerBody;
import co.bird.api.request.GeneratePaymentTokenBody;
import co.bird.api.request.SetDefaultProviderBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52547z10;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016JJ\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0004\u0012\u00020\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"Lz10;", "Lw10;", "", "userId", "Lco/bird/android/model/constant/PaymentProvider;", "kind", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", DateTokenConverter.CONVERTER_KEY, "email", "nonce", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lkotlin/Pair;", "Lco/bird/api/request/SetDefaultProviderBody;", "c", "g", "LLL3;", C17296a.f69688o, "LLL3;", "paymentClient", "LEa;", "b", "LEa;", "analyticsManager", "Lgl;", "Lgl;", "preference", "LTq4;", "LTq4;", "reactiveConfig", "Llh6;", "e", "Llh6;", "userManager", "LfL;", "f", "LfL;", "birdDeviceCheckManager", "<init>", "(LLL3;LEa;Lgl;LTq4;Llh6;LfL;)V", "braintree_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: z10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52547z10 implements InterfaceC50768w10 {

    /* renamed from: a */
    public final LL3 f120523a;

    /* renamed from: b */
    public final InterfaceC1880Ea f120524b;

    /* renamed from: c */
    public final C22454gl f120525c;

    /* renamed from: d */
    public final C36207Tq4 f120526d;

    /* renamed from: e */
    public final InterfaceC44647lh6 f120527e;

    /* renamed from: f */
    public final InterfaceC20357fL f120528f;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/BirdCustomer;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBrainTreeManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrainTreeManagerImpl.kt\nco/bird/android/manager/braintree/BrainTreeManagerImpl$createBraintreeCustomerAndSetDefault$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    /* renamed from: z10$a */
    /* loaded from: classes4.dex */
    public static final class C30811a extends Lambda implements Function1<HM4<BirdCustomer>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ PaymentAddSource f120530h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30811a(PaymentAddSource paymentAddSource) {
            super(1);
            this.f120530h = paymentAddSource;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m2102a(HM4<BirdCustomer> hm4) {
            String str;
            Boolean bool;
            String str2;
            Long l;
            String str3;
            Boolean bool2;
            Long l2;
            Integer autoPayIncentiveAmount;
            Integer autoPayRefillAmount;
            Object obj;
            Balance m59035e = C52547z10.this.f120527e.mo26977K().getValue().m59035e();
            InterfaceC1880Ea interfaceC1880Ea = C52547z10.this.f120524b;
            Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(C52547z10.this.f120525c.m37750B0()));
            PaymentAddSource paymentAddSource = this.f120530h;
            if (paymentAddSource != null) {
                str = paymentAddSource.name();
            } else {
                str = null;
            }
            if (m59035e != null) {
                bool = m59035e.getAutoPayActive();
            } else {
                bool = null;
            }
            List<AutoPayPlanConfig> autoPayPlans = C52547z10.this.f120526d.m82623f8().m73665a().getRideConfig().getAutoPayPlans();
            if (autoPayPlans != null) {
                Iterator<T> it = autoPayPlans.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        AutoPayPlanConfig autoPayPlanConfig = (AutoPayPlanConfig) obj;
                        boolean z = false;
                        if (m59035e != null) {
                            int refillAmount = autoPayPlanConfig.getRefillAmount();
                            Integer autoPayRefillAmount2 = m59035e.getAutoPayRefillAmount();
                            if (autoPayRefillAmount2 != null && refillAmount == autoPayRefillAmount2.intValue()) {
                                z = true;
                                continue;
                            }
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AutoPayPlanConfig autoPayPlanConfig2 = (AutoPayPlanConfig) obj;
                if (autoPayPlanConfig2 != null) {
                    str2 = autoPayPlanConfig2.getId();
                    if (m59035e == null && (autoPayRefillAmount = m59035e.getAutoPayRefillAmount()) != null) {
                        l = Long.valueOf(autoPayRefillAmount.intValue());
                    } else {
                        l = null;
                    }
                    if (m59035e == null) {
                        str3 = m59035e.getCurrency();
                    } else {
                        str3 = null;
                    }
                    if (m59035e == null && (autoPayIncentiveAmount = m59035e.getAutoPayIncentiveAmount()) != null) {
                        bool2 = valueOf;
                        l2 = Long.valueOf(autoPayIncentiveAmount.intValue());
                    } else {
                        bool2 = valueOf;
                        l2 = null;
                    }
                    interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, bool2, str, "paypal", "paypal", bool, str2, l, str3, l2, String.valueOf(C52547z10.this.f120526d.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), C52547z10.this.f120528f.mo21336c(), 7, null));
                }
            }
            str2 = null;
            if (m59035e == null) {
            }
            l = null;
            if (m59035e == null) {
            }
            if (m59035e == null) {
            }
            bool2 = valueOf;
            l2 = null;
            interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, bool2, str, "paypal", "paypal", bool, str2, l, str3, l2, String.valueOf(C52547z10.this.f120526d.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), C52547z10.this.f120528f.mo21336c(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BirdCustomer> hm4) {
            m2102a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/BirdCustomer;", "response", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/api/request/SetDefaultProviderBody;", "", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z10$b */
    /* loaded from: classes4.dex */
    public static final class C30812b extends Lambda implements Function1<HM4<BirdCustomer>, InterfaceC23447K<? extends Pair<? extends HM4<SetDefaultProviderBody>, ? extends String>>> {

        /* renamed from: h */
        public final /* synthetic */ String f120532h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/SetDefaultProviderBody;", "response", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: z10$b$a */
        /* loaded from: classes4.dex */
        public static final class C30813a extends Lambda implements Function1<HM4<SetDefaultProviderBody>, Pair<? extends HM4<SetDefaultProviderBody>, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ BirdCustomer f120533g;

            /* renamed from: h */
            public final /* synthetic */ String f120534h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30813a(BirdCustomer birdCustomer, String str) {
                super(1);
                this.f120533g = birdCustomer;
                this.f120534h = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<HM4<SetDefaultProviderBody>, String> invoke(HM4<SetDefaultProviderBody> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                String email = this.f120533g.getEmail();
                if (email == null) {
                    email = this.f120534h;
                }
                return new Pair<>(response, email);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30812b(String str) {
            super(1);
            this.f120532h = str;
        }

        /* renamed from: c */
        public static final Pair m2099c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<HM4<SetDefaultProviderBody>, String>> invoke(HM4<BirdCustomer> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                BirdCustomer m103944a = response.m103944a();
                if (m103944a != null) {
                    C52547z10 c52547z10 = C52547z10.this;
                    String str = this.f120532h;
                    AbstractC23442F m2103g = c52547z10.m2103g(PaymentProvider.BRAINTREE, m103944a.getUserId());
                    final C30813a c30813a = new C30813a(m103944a, str);
                    return m2103g.m33157I(new InterfaceC23492o() { // from class: A10
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair m2099c;
                            m2099c = C52547z10.C30812b.m2099c(Function1.this, obj);
                            return m2099c;
                        }
                    });
                }
                return null;
            }
            return AbstractC23442F.m33100x(AE0.f300b);
        }
    }

    public C52547z10(LL3 paymentClient, InterfaceC1880Ea analyticsManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager, InterfaceC20357fL birdDeviceCheckManager) {
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(birdDeviceCheckManager, "birdDeviceCheckManager");
        this.f120523a = paymentClient;
        this.f120524b = analyticsManager;
        this.f120525c = preference;
        this.f120526d = reactiveConfig;
        this.f120527e = userManager;
        this.f120528f = birdDeviceCheckManager;
    }

    /* renamed from: e */
    public static final void m2105e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final InterfaceC23447K m2104f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC50768w10
    /* renamed from: c */
    public AbstractC23442F<Pair<HM4<SetDefaultProviderBody>, String>> mo2107c(String userId, String email, String nonce, PaymentProvider kind, PaymentAddSource paymentAddSource) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(kind, "kind");
        AbstractC23442F<HM4<BirdCustomer>> m97041m = this.f120523a.m97041m(new CreateCustomerBody(userId, email, nonce, kind));
        final C30811a c30811a = new C30811a(paymentAddSource);
        AbstractC23442F<HM4<BirdCustomer>> m33101w = m97041m.m33101w(new InterfaceC23484g() { // from class: x10
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52547z10.m2105e(Function1.this, obj);
            }
        });
        final C30812b c30812b = new C30812b(email);
        AbstractC23442F<Pair<HM4<SetDefaultProviderBody>, String>> m33142Y = m33101w.m33165A(new InterfaceC23492o() { // from class: y10
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m2104f;
                m2104f = C52547z10.m2104f(Function1.this, obj);
                return m2104f;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "override fun createBrain…beOn(Schedulers.io())\n  }");
        return m33142Y;
    }

    @Override // p000.InterfaceC50768w10
    /* renamed from: d */
    public AbstractC23442F<HM4<BraintreeTokenResponse>> mo2106d(String userId, PaymentProvider kind) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        AbstractC23442F<HM4<BraintreeTokenResponse>> m33152N = this.f120523a.m97049e(new GeneratePaymentTokenBody(userId, kind)).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "paymentClient.generateTo…dSchedulers.mainThread())");
        return m33152N;
    }

    /* renamed from: g */
    public final AbstractC23442F<HM4<SetDefaultProviderBody>> m2103g(PaymentProvider paymentProvider, String str) {
        return this.f120523a.m97042l(new SetDefaultProviderBody(paymentProvider, str, null, 4, null));
    }
}
