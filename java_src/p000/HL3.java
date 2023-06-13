package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.payment.StripeResolverManagerImpl;
import co.bird.android.model.constant.PaymentActionKind;
import co.bird.android.model.constant.PaymentGatewayKind;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.PaymentAction;
import co.bird.api.response.BaseWirePaymentActionRequiredResponse;
import co.bird.api.response.WirePaymentActionRequiredResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.Stripe;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\bB!\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0016J!\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m28432d2 = {"LHL3;", "LDL3;", "Lco/bird/api/response/WirePaymentActionRequiredResponse;", "T", "Lio/reactivex/F;", "LHM4;", "baseRequest", "Lio/reactivex/p;", C17296a.f69688o, "response", "Lio/reactivex/c;", "e", "(Lco/bird/api/response/WirePaymentActionRequiredResponse;)Lio/reactivex/c;", "Lco/bird/android/manager/payment/StripeResolverManagerImpl;", "Lco/bird/android/manager/payment/StripeResolverManagerImpl;", "stripeResolverManagerImpl", "LpM3;", "b", "LpM3;", "paymentIntentManager", "Lwi2;", "c", "Lwi2;", "deserializer", "<init>", "(Lco/bird/android/manager/payment/StripeResolverManagerImpl;LpM3;Lwi2;)V", DateTokenConverter.CONVERTER_KEY, "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HL3 */
/* loaded from: classes4.dex */
public final class HL3 implements DL3 {

    /* renamed from: d */
    public static final C3129a f13288d = new C3129a(null);

    /* renamed from: a */
    public final StripeResolverManagerImpl f13289a;

    /* renamed from: b */
    public final InterfaceC46820pM3 f13290b;

    /* renamed from: c */
    public final C51174wi2 f13291c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LHL3$a;", "", "", "PAYMENT_ACTION_STATUS_CODE", "I", "<init>", "()V", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HL3$a */
    /* loaded from: classes4.dex */
    public static final class C3129a {
        public /* synthetic */ C3129a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3129a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HL3$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C3130b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentActionKind.values().length];
            try {
                iArr[PaymentActionKind.THREEDS2_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentGatewayKind.values().length];
            try {
                iArr2[PaymentGatewayKind.STRIPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/WirePaymentActionRequiredResponse;", "T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HL3$c */
    /* loaded from: classes4.dex */
    public static final class C3131c extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C3131c() {
            super(1);
        }

        /* renamed from: a */
        public final void m103976a(InterfaceC23465c interfaceC23465c) {
            HL3.this.f13290b.mo8808i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m103976a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "T", "Lco/bird/api/response/WirePaymentActionRequiredResponse;", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HL3$d */
    /* loaded from: classes4.dex */
    public static final class C3132d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3132d f13293g = new C3132d();

        public C3132d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while calling baseRequest in payment auth handler: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/WirePaymentActionRequiredResponse;", "T", "LHM4;", "response", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HL3$e */
    /* loaded from: classes4.dex */
    public static final class C3133e extends Lambda implements Function1<HM4<T>, InterfaceC24574u<? extends HM4<T>>> {
        public C3133e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<T>> invoke(HM4<T> response) {
            boolean z;
            String string;
            BaseWirePaymentActionRequiredResponse baseWirePaymentActionRequiredResponse;
            Intrinsics.checkNotNullParameter(response, "response");
            C41318g46.m40163a("handling response with status code " + response.m103943b() + " in payment authorization handler", new Object[0]);
            int m103943b = response.m103943b();
            if (m103943b == 303) {
                ResponseBody m103940e = response.m103940e();
                if (m103940e != null && (string = m103940e.string()) != null && (baseWirePaymentActionRequiredResponse = (BaseWirePaymentActionRequiredResponse) HL3.this.f13291c.m6459c(string, Reflection.getOrCreateKotlinClass(BaseWirePaymentActionRequiredResponse.class))) != null) {
                    C41318g46.m40163a("encountered a response code of 303, attempting to handle payment action now", new Object[0]);
                    return HL3.this.m103980e(baseWirePaymentActionRequiredResponse).m33053f0();
                }
                return AbstractC24507p.m32023v(new NullPointerException("expected body containing wire payment action required response but none found"));
            }
            if (200 <= m103943b && m103943b < 300) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return AbstractC24507p.m32068G(response);
            }
            RetrofitException m53926d = RetrofitException.m53926d(response, HL3.this.f13291c);
            C41318g46.m40163a("mapping request response to exception to return from payment authorization handler ", new Object[0]);
            return AbstractC24507p.m32023v(m53926d);
        }
    }

    public HL3(StripeResolverManagerImpl stripeResolverManagerImpl, InterfaceC46820pM3 paymentIntentManager, C51174wi2 deserializer) {
        Intrinsics.checkNotNullParameter(stripeResolverManagerImpl, "stripeResolverManagerImpl");
        Intrinsics.checkNotNullParameter(paymentIntentManager, "paymentIntentManager");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f13289a = stripeResolverManagerImpl;
        this.f13290b = paymentIntentManager;
        this.f13291c = deserializer;
    }

    /* renamed from: f */
    public static final void m103979f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m103978g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final InterfaceC24574u m103977h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    @Override // p000.DL3
    /* renamed from: a */
    public <T extends WirePaymentActionRequiredResponse> AbstractC24507p<HM4<T>> mo103984a(AbstractC23442F<HM4<T>> baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        final C3131c c3131c = new C3131c();
        AbstractC23442F<HM4<T>> m33102v = baseRequest.m33102v(new InterfaceC23484g() { // from class: EL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                HL3.m103979f(Function1.this, obj);
            }
        });
        final C3132d c3132d = C3132d.f13293g;
        AbstractC23442F<HM4<T>> m33106t = m33102v.m33106t(new InterfaceC23484g() { // from class: FL3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                HL3.m103978g(Function1.this, obj);
            }
        });
        final C3133e c3133e = new C3133e();
        AbstractC24507p<HM4<T>> abstractC24507p = (AbstractC24507p<HM4<T>>) m33106t.m33163C(new InterfaceC23492o() { // from class: GL3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m103977h;
                m103977h = HL3.m103977h(Function1.this, obj);
                return m103977h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC24507p, "override fun <T : WirePa…  }\n        }\n      }\n  }");
        return abstractC24507p;
    }

    /* renamed from: e */
    public final <T extends WirePaymentActionRequiredResponse> AbstractC23461c m103980e(T t) {
        PaymentGatewayKind paymentGatewayKind;
        int i;
        Map<String, String> actionPayload;
        String str;
        Map<String, String> actionPayload2;
        String str2;
        PaymentAction action = t.getAction();
        PaymentActionKind paymentActionKind = null;
        if (action != null) {
            paymentGatewayKind = action.getGatewayKind();
        } else {
            paymentGatewayKind = null;
        }
        int i2 = -1;
        if (paymentGatewayKind == null) {
            i = -1;
        } else {
            i = C3130b.$EnumSwitchMapping$1[paymentGatewayKind.ordinal()];
        }
        if (i == 1) {
            Pair<String, Stripe> m73665a = this.f13289a.mo55585a().m73665a();
            m73665a.component1();
            m73665a.component2();
            PaymentAction action2 = t.getAction();
            if (action2 != null) {
                paymentActionKind = action2.getActionKind();
            }
            if (paymentActionKind != null) {
                i2 = C3130b.$EnumSwitchMapping$0[paymentActionKind.ordinal()];
            }
            if (i2 == 1) {
                PaymentAction action3 = t.getAction();
                if (action3 != null && (actionPayload = action3.getActionPayload()) != null && (str = actionPayload.get("client_secret")) != null) {
                    PaymentAction action4 = t.getAction();
                    if (action4 != null && (actionPayload2 = action4.getActionPayload()) != null && (str2 = actionPayload2.get("intent_id")) != null) {
                        C41318g46.m40163a("parsed intentId=" + str2 + " to set to payment intent manager", new Object[0]);
                        this.f13290b.mo8809h(str2, str);
                        AbstractC23461c m33039p = AbstractC23461c.m33039p();
                        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
                        return m33039p;
                    }
                    AbstractC23461c m33080F = AbstractC23461c.m33080F(new NullPointerException("missing expected intent_id from api response"));
                    Intrinsics.checkNotNullExpressionValue(m33080F, "error(NullPointerExcepti…t_id from api response\"))");
                    return m33080F;
                }
                AbstractC23461c m33080F2 = AbstractC23461c.m33080F(new NullPointerException("missing expected client_secret from api response"));
                Intrinsics.checkNotNullExpressionValue(m33080F2, "error(NullPointerExcepti…cret from api response\"))");
                return m33080F2;
            }
            AbstractC23461c m33080F3 = AbstractC23461c.m33080F(new IllegalArgumentException("Unknown actionKind returned, cannot handle payment response"));
            Intrinsics.checkNotNullExpressionValue(m33080F3, "error(IllegalArgumentExc…andle payment response\"))");
            return m33080F3;
        }
        AbstractC23461c m33080F4 = AbstractC23461c.m33080F(new IllegalArgumentException("Unknown gatewayKind returned, cannot handle payment response"));
        Intrinsics.checkNotNullExpressionValue(m33080F4, "error(IllegalArgumentExc…andle payment response\"))");
        return m33080F4;
    }
}
