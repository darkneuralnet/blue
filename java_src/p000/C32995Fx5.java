package p000;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.SetupIntentStatus;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import co.bird.api.request.ConfirmCardSetupIntentRequest;
import co.bird.api.response.CreateCardSetupIntentResponse;
import com.adyen.checkout.components.model.payments.response.Action;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.Stripe;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.StripeIntent;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.schedulers.C24542a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import p000.C32995Fx5;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D¢\u0006\u0004\bT\u0010UJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H\u0016J\u001a\u0010$\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\"\u0010'\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010)\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010L\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\u001f0\u001f0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010P¨\u0006V"}, m28432d2 = {"LFx5;", "Lpx5;", "Lio/reactivex/F;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodSingle", "Lio/reactivex/c;", "B", "", "requestCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/model/StripeIntent;", "I", "intent", "L", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "card", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "z", "Lcom/google/android/gms/wallet/PaymentData;", Action.PAYMENT_DATA, "x", "", "intentId", "Lio/reactivex/p;", "Ltg1;", "w", "", "P", "Lio/reactivex/Observable;", "Lco/bird/android/model/SetupIntentStatus;", C17296a.f69688o, "Landroidx/appcompat/app/AppCompatActivity;", "activity", "c", "e", "", "attachAndSetDefault", "b", "f", DateTokenConverter.CONVERTER_KEY, "LRh6;", "LRh6;", "userStream", "LLL3;", "LLL3;", "paymentClient", "Lcom/stripe/android/Stripe;", "Lcom/stripe/android/Stripe;", "stripe", "LAM3;", "LAM3;", "paymentManagerV2", "Llh6;", "Llh6;", "userManager", "LTq4;", "LTq4;", "reactiveConfig", "LEa;", "g", "LEa;", "analyticsManager", "Lgl;", "h", "Lgl;", "preference", "LfL;", "i", "LfL;", "birdDeviceCheckManager", "Lma4;", "kotlin.jvm.PlatformType", "j", "Lma4;", "setupStatus", "La94;", "Lco/bird/android/buava/Optional;", "k", "La94;", "clientSecret", "l", "defaultPaymentMethodId", "<init>", "(LRh6;LLL3;Lcom/stripe/android/Stripe;LAM3;Llh6;LTq4;LEa;Lgl;LfL;)V", "stripe-intent_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSetupIntentManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntentManagerImpl.kt\nco/bird/android/manager/stripe/SetupIntentManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,265:1\n180#2:266\n*S KotlinDebug\n*F\n+ 1 SetupIntentManagerImpl.kt\nco/bird/android/manager/stripe/SetupIntentManagerImpl\n*L\n68#1:266\n*E\n"})
/* renamed from: Fx5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32995Fx5 implements InterfaceC47178px5 {

    /* renamed from: a */
    public final InterfaceC35660Rh6 f10546a;

    /* renamed from: b */
    public final LL3 f10547b;

    /* renamed from: c */
    public final Stripe f10548c;

    /* renamed from: d */
    public final AM3 f10549d;

    /* renamed from: e */
    public final InterfaceC44647lh6 f10550e;

    /* renamed from: f */
    public final C36207Tq4 f10551f;

    /* renamed from: g */
    public final InterfaceC1880Ea f10552g;

    /* renamed from: h */
    public final C22454gl f10553h;

    /* renamed from: i */
    public final InterfaceC20357fL f10554i;

    /* renamed from: j */
    public final C45168ma4<SetupIntentStatus> f10555j;

    /* renamed from: k */
    public final C37791a94<Optional<String>> f10556k;

    /* renamed from: l */
    public final C37791a94<Optional<String>> f10557l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$a */
    /* loaded from: classes4.dex */
    public static final class C2517a extends Lambda implements Function1<User, Unit> {
        public C2517a() {
            super(1);
        }

        /* renamed from: a */
        public final void m106172a(User user) {
            C32995Fx5.this.m106194P();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m106172a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fx5$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C2518b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.Canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lcom/stripe/android/model/PaymentMethod;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$c */
    /* loaded from: classes4.dex */
    public static final class C2519c extends Lambda implements Function1<InterfaceC23444H<PaymentMethod>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ PaymentData f10560h;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"Fx5$c$a", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/model/PaymentMethod;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "Ljava/lang/Exception;", "e", "onError", "stripe-intent_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Fx5$c$a */
        /* loaded from: classes4.dex */
        public static final class C2520a implements ApiResultCallback<PaymentMethod> {

            /* renamed from: a */
            public final /* synthetic */ C32995Fx5 f10561a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC23444H<PaymentMethod> f10562b;

            public C2520a(C32995Fx5 c32995Fx5, InterfaceC23444H<PaymentMethod> interfaceC23444H) {
                this.f10561a = c32995Fx5;
                this.f10562b = interfaceC23444H;
            }

            @Override // com.stripe.android.ApiResultCallback
            /* renamed from: a */
            public void onSuccess(PaymentMethod result) {
                Intrinsics.checkNotNullParameter(result, "result");
                C37791a94 c37791a94 = this.f10561a.f10557l;
                Optional.C14443a c14443a = Optional.f63040c;
                String str = result.f75358id;
                Intrinsics.checkNotNull(str);
                c37791a94.accept(c14443a.m59032c(str));
                this.f10562b.onSuccess(result);
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.f10562b.onError(e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2519c(PaymentData paymentData) {
            super(1);
            this.f10560h = paymentData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<PaymentMethod> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<PaymentMethod> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Stripe.createPaymentMethod$default(C32995Fx5.this.f10548c, PaymentMethodCreateParams.Companion.createFromGooglePay(new JSONObject(this.f10560h.m50524u())), null, null, new C2520a(C32995Fx5.this, emitter), 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/model/PaymentMethod;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSetupIntentManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntentManagerImpl.kt\nco/bird/android/manager/stripe/SetupIntentManagerImpl$createGooglePayPaymentMethod$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
    /* renamed from: Fx5$d */
    /* loaded from: classes4.dex */
    public static final class C2521d extends Lambda implements Function1<PaymentMethod, Unit> {

        /* renamed from: h */
        public final /* synthetic */ PaymentAddSource f10564h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2521d(PaymentAddSource paymentAddSource) {
            super(1);
            this.f10564h = paymentAddSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
            invoke2(paymentMethod);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(PaymentMethod paymentMethod) {
            String str;
            Boolean bool;
            Long l;
            Integer autoPayIncentiveAmount;
            Integer autoPayRefillAmount;
            Object obj;
            Balance m59035e = C32995Fx5.this.f10550e.mo26977K().getValue().m59035e();
            InterfaceC1880Ea interfaceC1880Ea = C32995Fx5.this.f10552g;
            Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(C32995Fx5.this.f10553h.m37750B0()));
            PaymentAddSource paymentAddSource = this.f10564h;
            String name = paymentAddSource != null ? paymentAddSource.name() : null;
            Boolean autoPayActive = m59035e != null ? m59035e.getAutoPayActive() : null;
            List<AutoPayPlanConfig> autoPayPlans = C32995Fx5.this.f10551f.m82623f8().m73665a().getRideConfig().getAutoPayPlans();
            if (autoPayPlans != null) {
                Iterator<T> it = autoPayPlans.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
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
                }
                AutoPayPlanConfig autoPayPlanConfig2 = (AutoPayPlanConfig) obj;
                if (autoPayPlanConfig2 != null) {
                    str = autoPayPlanConfig2.getId();
                    Long valueOf2 = (m59035e != null || (autoPayRefillAmount = m59035e.getAutoPayRefillAmount()) == null) ? null : Long.valueOf(autoPayRefillAmount.intValue());
                    String currency = m59035e == null ? m59035e.getCurrency() : null;
                    if (m59035e != null || (autoPayIncentiveAmount = m59035e.getAutoPayIncentiveAmount()) == null) {
                        bool = valueOf;
                        l = null;
                    } else {
                        bool = valueOf;
                        l = Long.valueOf(autoPayIncentiveAmount.intValue());
                    }
                    interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, bool, name, "stripe", "google_pay", autoPayActive, str, valueOf2, currency, l, String.valueOf(C32995Fx5.this.f10551f.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), C32995Fx5.this.f10554i.mo21336c(), 7, null));
                }
            }
            str = null;
            if (m59035e != null) {
            }
            if (m59035e == null) {
            }
            if (m59035e != null) {
            }
            bool = valueOf;
            l = null;
            interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, bool, name, "stripe", "google_pay", autoPayActive, str, valueOf2, currency, l, String.valueOf(C32995Fx5.this.f10551f.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), C32995Fx5.this.f10554i.mo21336c(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lcom/stripe/android/model/PaymentMethod;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$e */
    /* loaded from: classes4.dex */
    public static final class C2522e extends Lambda implements Function1<InterfaceC23444H<PaymentMethod>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ PaymentMethodCreateParams f10566h;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"Fx5$e$a", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/model/PaymentMethod;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "Ljava/lang/Exception;", "e", "onError", "stripe-intent_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Fx5$e$a */
        /* loaded from: classes4.dex */
        public static final class C2523a implements ApiResultCallback<PaymentMethod> {

            /* renamed from: a */
            public final /* synthetic */ C32995Fx5 f10567a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC23444H<PaymentMethod> f10568b;

            public C2523a(C32995Fx5 c32995Fx5, InterfaceC23444H<PaymentMethod> interfaceC23444H) {
                this.f10567a = c32995Fx5;
                this.f10568b = interfaceC23444H;
            }

            @Override // com.stripe.android.ApiResultCallback
            /* renamed from: a */
            public void onSuccess(PaymentMethod result) {
                Intrinsics.checkNotNullParameter(result, "result");
                C37791a94 c37791a94 = this.f10567a.f10557l;
                Optional.C14443a c14443a = Optional.f63040c;
                String str = result.f75358id;
                Intrinsics.checkNotNull(str);
                c37791a94.accept(c14443a.m59032c(str));
                this.f10568b.onSuccess(result);
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.f10568b.onError(e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2522e(PaymentMethodCreateParams paymentMethodCreateParams) {
            super(1);
            this.f10566h = paymentMethodCreateParams;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<PaymentMethod> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<PaymentMethod> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Stripe.createPaymentMethod$default(C32995Fx5.this.f10548c, this.f10566h, null, null, new C2523a(C32995Fx5.this, emitter), 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/model/PaymentMethod;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSetupIntentManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntentManagerImpl.kt\nco/bird/android/manager/stripe/SetupIntentManagerImpl$createPaymentMethod$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
    /* renamed from: Fx5$f */
    /* loaded from: classes4.dex */
    public static final class C2524f extends Lambda implements Function1<PaymentMethod, Unit> {

        /* renamed from: h */
        public final /* synthetic */ PaymentAddSource f10570h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2524f(PaymentAddSource paymentAddSource) {
            super(1);
            this.f10570h = paymentAddSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
            invoke2(paymentMethod);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(PaymentMethod paymentMethod) {
            String str;
            Boolean bool;
            Long l;
            Integer autoPayIncentiveAmount;
            Integer autoPayRefillAmount;
            Object obj;
            Balance m59035e = C32995Fx5.this.f10550e.mo26977K().getValue().m59035e();
            InterfaceC1880Ea interfaceC1880Ea = C32995Fx5.this.f10552g;
            Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(C32995Fx5.this.f10553h.m37750B0()));
            PaymentAddSource paymentAddSource = this.f10570h;
            String name = paymentAddSource != null ? paymentAddSource.name() : null;
            Boolean autoPayActive = m59035e != null ? m59035e.getAutoPayActive() : null;
            List<AutoPayPlanConfig> autoPayPlans = C32995Fx5.this.f10551f.m82623f8().m73665a().getRideConfig().getAutoPayPlans();
            if (autoPayPlans != null) {
                Iterator<T> it = autoPayPlans.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
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
                }
                AutoPayPlanConfig autoPayPlanConfig2 = (AutoPayPlanConfig) obj;
                if (autoPayPlanConfig2 != null) {
                    str = autoPayPlanConfig2.getId();
                    Long valueOf2 = (m59035e != null || (autoPayRefillAmount = m59035e.getAutoPayRefillAmount()) == null) ? null : Long.valueOf(autoPayRefillAmount.intValue());
                    String currency = m59035e == null ? m59035e.getCurrency() : null;
                    if (m59035e != null || (autoPayIncentiveAmount = m59035e.getAutoPayIncentiveAmount()) == null) {
                        bool = autoPayActive;
                        l = null;
                    } else {
                        bool = autoPayActive;
                        l = Long.valueOf(autoPayIncentiveAmount.intValue());
                    }
                    interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, valueOf, name, "stripe", null, bool, str, valueOf2, currency, l, String.valueOf(C32995Fx5.this.f10551f.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), C32995Fx5.this.f10554i.mo21336c(), 71, null));
                }
            }
            str = null;
            if (m59035e != null) {
            }
            if (m59035e == null) {
            }
            if (m59035e != null) {
            }
            bool = autoPayActive;
            l = null;
            interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, valueOf, name, "stripe", null, bool, str, valueOf2, currency, l, String.valueOf(C32995Fx5.this.f10551f.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), C32995Fx5.this.f10554i.mo21336c(), 71, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003 \u0005*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/api/response/CreateCardSetupIntentResponse;", "kotlin.jvm.PlatformType", "Lcom/stripe/android/model/PaymentMethod;", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$g */
    /* loaded from: classes4.dex */
    public static final class C2525g extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Pair<? extends CreateCardSetupIntentResponse, ? extends PaymentMethod>>> {

        /* renamed from: h */
        public final /* synthetic */ AbstractC23442F<PaymentMethod> f10572h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2525g(AbstractC23442F<PaymentMethod> abstractC23442F) {
            super(1);
            this.f10572h = abstractC23442F;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<CreateCardSetupIntentResponse, PaymentMethod>> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C24530g.f91174a.m31946a(C32995Fx5.this.f10547b.m97045i(), this.f10572h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/api/response/CreateCardSetupIntentResponse;", "kotlin.jvm.PlatformType", "Lcom/stripe/android/model/PaymentMethod;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fx5$h */
    /* loaded from: classes4.dex */
    public static final class C2526h extends Lambda implements Function1<Pair<? extends CreateCardSetupIntentResponse, ? extends PaymentMethod>, Unit> {
        public C2526h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends CreateCardSetupIntentResponse, ? extends PaymentMethod> pair) {
            invoke2((Pair<CreateCardSetupIntentResponse, PaymentMethod>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<CreateCardSetupIntentResponse, PaymentMethod> pair) {
            C32995Fx5.this.f10556k.accept(Optional.f63040c.m59032c(pair.component1().getSecretId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u00012\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/api/response/CreateCardSetupIntentResponse;", "Lcom/stripe/android/model/PaymentMethod;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fx5$i */
    /* loaded from: classes4.dex */
    public static final class C2527i extends Lambda implements Function1<Pair<? extends CreateCardSetupIntentResponse, ? extends PaymentMethod>, Pair<? extends String, ? extends String>> {

        /* renamed from: g */
        public static final C2527i f10574g = new C2527i();

        public C2527i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends String, ? extends String> invoke(Pair<? extends CreateCardSetupIntentResponse, ? extends PaymentMethod> pair) {
            return invoke2((Pair<CreateCardSetupIntentResponse, PaymentMethod>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<String, String> invoke2(Pair<CreateCardSetupIntentResponse, PaymentMethod> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return TuplesKt.m28425to(pair.component1().getSecretId(), pair.component2().f75358id);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004 \u0005*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lcom/stripe/android/model/SetupIntent;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$j */
    /* loaded from: classes4.dex */
    public static final class C2528j extends Lambda implements Function1<Pair<? extends String, ? extends String>, InterfaceC23447K<? extends SetupIntent>> {
        public C2528j() {
            super(1);
        }

        /* renamed from: c */
        public static final SetupIntent m106166c(C32995Fx5 this$0, String str, String clientSecret) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(clientSecret, "$clientSecret");
            Stripe stripe = this$0.f10548c;
            ConfirmSetupIntentParams.Companion companion = ConfirmSetupIntentParams.Companion;
            Intrinsics.checkNotNull(str);
            ConfirmSetupIntentParams create$default = ConfirmSetupIntentParams.Companion.create$default(companion, str, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
            String str2 = (String) ((Optional) this$0.f10556k.getValue()).m59035e();
            if (str2 == null) {
                str2 = this$0.f10546a.mo76575j().getValue().m59038b();
            }
            return stripe.confirmSetupIntentSynchronous(create$default, str2);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends SetupIntent> invoke(Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final String component1 = pair.component1();
            final String component2 = pair.component2();
            final C32995Fx5 c32995Fx5 = C32995Fx5.this;
            return AbstractC23442F.m33161E(new Callable() { // from class: Gx5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SetupIntent m106166c;
                    m106166c = C32995Fx5.C2528j.m106166c(C32995Fx5.this, component2, component1);
                    return m106166c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/SetupIntent;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/stripe/android/model/SetupIntent;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$k */
    /* loaded from: classes4.dex */
    public static final class C2529k extends Lambda implements Function1<SetupIntent, InterfaceC23496h> {
        public C2529k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(SetupIntent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C32995Fx5.this.m106198L(it).m33049i(C32995Fx5.this.f10549d.mo85667i((String) ((Optional) C32995Fx5.this.f10557l.getValue()).m59038b()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fx5$l */
    /* loaded from: classes4.dex */
    public static final class C2530l extends Lambda implements Function1<Throwable, Unit> {
        public C2530l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            SetupIntentStatus setupIntentStatus;
            C41318g46.m40159e(th);
            C45168ma4 c45168ma4 = C32995Fx5.this.f10555j;
            if (th instanceof InvalidRequestException) {
                setupIntentStatus = SetupIntentStatus.SETUP_INTENT_ERROR;
            } else {
                setupIntentStatus = SetupIntentStatus.UNEXPECTED;
            }
            c45168ma4.accept(setupIntentStatus);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lcom/stripe/android/model/StripeIntent;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$m */
    /* loaded from: classes4.dex */
    public static final class C2531m extends Lambda implements Function1<InterfaceC23444H<StripeIntent>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f10579h;

        /* renamed from: i */
        public final /* synthetic */ Intent f10580i;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"Fx5$m$a", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/SetupIntentResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "Ljava/lang/Exception;", "e", "onError", "stripe-intent_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Fx5$m$a */
        /* loaded from: classes4.dex */
        public static final class C2532a implements ApiResultCallback<SetupIntentResult> {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23444H<StripeIntent> f10581a;

            public C2532a(InterfaceC23444H<StripeIntent> interfaceC23444H) {
                this.f10581a = interfaceC23444H;
            }

            @Override // com.stripe.android.ApiResultCallback
            /* renamed from: a */
            public void onSuccess(SetupIntentResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.f10581a.onSuccess(result.getIntent());
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.f10581a.onError(e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2531m(int i, Intent intent) {
            super(1);
            this.f10579h = i;
            this.f10580i = intent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<StripeIntent> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<StripeIntent> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C32995Fx5.this.f10548c.onSetupResult(this.f10579h, this.f10580i, new C2532a(emitter));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fx5$n */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C2533n extends FunctionReferenceImpl implements Function1<StripeIntent, AbstractC23461c> {
        public C2533n(Object obj) {
            super(1, obj, C32995Fx5.class, "processStripeSetupIntent", "processStripeSetupIntent(Lcom/stripe/android/model/StripeIntent;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(StripeIntent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C32995Fx5) this.receiver).m106198L(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fx5$o */
    /* loaded from: classes4.dex */
    public static final class C2534o extends Lambda implements Function1<Throwable, Unit> {
        public C2534o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C32995Fx5.this.f10555j.accept(SetupIntentStatus.UNEXPECTED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "kotlin.jvm.PlatformType", "errorResponse", "", C17296a.f69688o, "(Ltg1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$p */
    /* loaded from: classes4.dex */
    public static final class C2535p extends Lambda implements Function1<C49375tg1, Unit> {
        public C2535p() {
            super(1);
        }

        /* renamed from: a */
        public final void m106162a(C49375tg1 c49375tg1) {
            int m11933b = c49375tg1.m11933b();
            String m11932c = c49375tg1.m11932c();
            C41318g46.m40160d("attachPaymentMethod failed " + m11933b + " " + m11932c, new Object[0]);
            C32995Fx5.this.f10555j.accept(SetupIntentStatus.ATTACH_PAYMENT_ERROR);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C49375tg1 c49375tg1) {
            m106162a(c49375tg1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fx5$q */
    /* loaded from: classes4.dex */
    public static final class C2536q extends Lambda implements Function1<Throwable, Unit> {
        public C2536q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String message = th.getMessage();
            C41318g46.m40160d("attachPaymentMethod failed - " + message, new Object[0]);
            C32995Fx5.this.f10555j.accept(SetupIntentStatus.ATTACH_PAYMENT_ERROR);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fx5$r */
    /* loaded from: classes4.dex */
    public static final class C2537r extends Lambda implements Function1<PaymentMethod, String> {

        /* renamed from: g */
        public static final C2537r f10585g = new C2537r();

        public C2537r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(PaymentMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = it.f75358id;
            Intrinsics.checkNotNull(str);
            return str;
        }
    }

    public C32995Fx5(InterfaceC35660Rh6 userStream, LL3 paymentClient, Stripe stripe, AM3 paymentManagerV2, InterfaceC44647lh6 userManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, C22454gl preference, InterfaceC20357fL birdDeviceCheckManager) {
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(paymentClient, "paymentClient");
        Intrinsics.checkNotNullParameter(stripe, "stripe");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(birdDeviceCheckManager, "birdDeviceCheckManager");
        this.f10546a = userStream;
        this.f10547b = paymentClient;
        this.f10548c = stripe;
        this.f10549d = paymentManagerV2;
        this.f10550e = userManager;
        this.f10551f = reactiveConfig;
        this.f10552g = analyticsManager;
        this.f10553h = preference;
        this.f10554i = birdDeviceCheckManager;
        C45168ma4<SetupIntentStatus> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<SetupIntentStatus>()");
        this.f10555j = m25409g;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f10556k = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f10557l = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2517a c2517a = new C2517a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qx5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32995Fx5.m106177v(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m106209A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23447K m106207C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m106206D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final Pair m106205E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m106204F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23496h m106203G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m106202H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23496h m106200J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m106199K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m106197M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m106196N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m106195O(C32995Fx5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10555j.accept(SetupIntentStatus.COMPLETE);
    }

    /* renamed from: Q */
    public static final String m106193Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m106177v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m106174y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final AbstractC23461c m106208B(AbstractC23442F<PaymentMethod> abstractC23442F) {
        Observable<Boolean> mo21337b = this.f10554i.mo21337b();
        final C2525g c2525g = new C2525g(abstractC23442F);
        AbstractC23442F m33152N = mo21337b.switchMapSingle(new InterfaceC23492o() { // from class: Ax5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106207C;
                m106207C = C32995Fx5.m106207C(Function1.this, obj);
                return m106207C;
            }
        }).firstOrError().m33152N(C24542a.m31932c());
        final C2526h c2526h = new C2526h();
        AbstractC23442F m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: Bx5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32995Fx5.m106206D(Function1.this, obj);
            }
        });
        final C2527i c2527i = C2527i.f10574g;
        AbstractC23442F m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: Cx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m106205E;
                m106205E = C32995Fx5.m106205E(Function1.this, obj);
                return m106205E;
            }
        });
        final C2528j c2528j = new C2528j();
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: Dx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106204F;
                m106204F = C32995Fx5.m106204F(Function1.this, obj);
                return m106204F;
            }
        });
        final C2529k c2529k = new C2529k();
        AbstractC23461c m33164B = m33165A.m33164B(new InterfaceC23492o() { // from class: Ex5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m106203G;
                m106203G = C32995Fx5.m106203G(Function1.this, obj);
                return m106203G;
            }
        });
        final C2530l c2530l = new C2530l();
        AbstractC23461c m33069Q = m33164B.m33084B(new InterfaceC23484g() { // from class: rx5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32995Fx5.m106202H(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun createSetupI…   .onErrorComplete()\n  }");
        return m33069Q;
    }

    /* renamed from: I */
    public final AbstractC23442F<StripeIntent> m106201I(int i, Intent intent) {
        return C45832nh5.m23305k(new C2531m(i, intent));
    }

    /* renamed from: L */
    public final AbstractC23461c m106198L(StripeIntent stripeIntent) {
        int i;
        if (stripeIntent.getStatus() == StripeIntent.Status.Succeeded && stripeIntent.getId() != null) {
            String id = stripeIntent.getId();
            Intrinsics.checkNotNull(id);
            AbstractC24507p<C49375tg1> m106176w = m106176w(id);
            final C2535p c2535p = new C2535p();
            AbstractC24507p<C49375tg1> m32026s = m106176w.m32026s(new InterfaceC23484g() { // from class: wx5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32995Fx5.m106197M(Function1.this, obj);
                }
            });
            final C2536q c2536q = new C2536q();
            AbstractC23461c m32069F = m32026s.m32029p(new InterfaceC23484g() { // from class: xx5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32995Fx5.m106196N(Function1.this, obj);
                }
            }).m32031n(new InterfaceC23478a() { // from class: yx5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C32995Fx5.m106195O(C32995Fx5.this);
                }
            }).m32069F();
            Intrinsics.checkNotNullExpressionValue(m32069F, "private fun processStrip…able.complete()\n    }\n  }");
            return m32069F;
        }
        StripeIntent.Status status = stripeIntent.getStatus();
        if (status == null) {
            i = -1;
        } else {
            i = C2518b.$EnumSwitchMapping$0[status.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                this.f10555j.accept(SetupIntentStatus.UNEXPECTED);
            } else {
                this.f10555j.accept(SetupIntentStatus.SETUP_INTENT_ERROR);
            }
        } else {
            this.f10555j.accept(SetupIntentStatus.REQUIRES_AUTHENTICATION);
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      when (intent.sta…pletable.complete()\n    }");
        return m33039p;
    }

    /* renamed from: P */
    public final void m106194P() {
        this.f10556k.m71836j();
        this.f10557l.m71836j();
    }

    @Override // p000.InterfaceC47178px5
    /* renamed from: a */
    public Observable<SetupIntentStatus> mo18388a() {
        Observable<SetupIntentStatus> hide = this.f10555j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "setupStatus.hide()");
        return hide;
    }

    @Override // p000.InterfaceC47178px5
    /* renamed from: b */
    public AbstractC23461c mo18387b(PaymentData paymentData, boolean z, PaymentAddSource paymentAddSource) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return m106208B(m106175x(paymentData, paymentAddSource));
    }

    @Override // p000.InterfaceC47178px5
    /* renamed from: c */
    public void mo18386c(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f10556k.getValue().m59037c()) {
            Stripe.handleNextActionForSetupIntent$default(this.f10548c, activity, this.f10556k.getValue().m59038b(), (String) null, 4, (Object) null);
        } else {
            this.f10555j.accept(SetupIntentStatus.UNEXPECTED);
        }
    }

    @Override // p000.InterfaceC47178px5
    /* renamed from: d */
    public AbstractC23461c mo18385d(int i, Intent intent) {
        AbstractC23442F<StripeIntent> m106201I = m106201I(i, intent);
        final C2533n c2533n = new C2533n(this);
        AbstractC23461c m33164B = m106201I.m33164B(new InterfaceC23492o() { // from class: sx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m106200J;
                m106200J = C32995Fx5.m106200J(Function1.this, obj);
                return m106200J;
            }
        });
        final C2534o c2534o = new C2534o();
        AbstractC23461c m33069Q = m33164B.m33084B(new InterfaceC23484g() { // from class: tx5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32995Fx5.m106199K(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "override fun processSetu…   .onErrorComplete()\n  }");
        return m33069Q;
    }

    @Override // p000.InterfaceC47178px5
    /* renamed from: e */
    public AbstractC23461c mo18384e(PaymentMethodCreateParams card, PaymentAddSource paymentAddSource) {
        Intrinsics.checkNotNullParameter(card, "card");
        return m106208B(m106173z(card, paymentAddSource));
    }

    @Override // p000.InterfaceC47178px5
    /* renamed from: f */
    public AbstractC23442F<String> mo18383f(PaymentMethodCreateParams card, PaymentAddSource paymentAddSource) {
        Intrinsics.checkNotNullParameter(card, "card");
        AbstractC23442F<PaymentMethod> m106173z = m106173z(card, paymentAddSource);
        final C2537r c2537r = C2537r.f10585g;
        AbstractC23442F m33157I = m106173z.m33157I(new InterfaceC23492o() { // from class: vx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m106193Q;
                m106193Q = C32995Fx5.m106193Q(Function1.this, obj);
                return m106193Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "createPaymentMethod(card, source).map { it.id!! }");
        return m33157I;
    }

    /* renamed from: w */
    public final AbstractC24507p<C49375tg1> m106176w(String str) {
        AbstractC24507p<C49375tg1> m32066I = NM4.m94019b(this.f10547b.m97046h(new ConfirmCardSetupIntentRequest("stripe", str))).m32056T(C24542a.m31932c()).m32066I(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32066I, "paymentClient.confirmCar…dSchedulers.mainThread())");
        return m32066I;
    }

    /* renamed from: x */
    public final AbstractC23442F<PaymentMethod> m106175x(PaymentData paymentData, PaymentAddSource paymentAddSource) {
        AbstractC23442F m23305k = C45832nh5.m23305k(new C2519c(paymentData));
        final C2521d c2521d = new C2521d(paymentAddSource);
        AbstractC23442F<PaymentMethod> m33101w = m23305k.m33101w(new InterfaceC23484g() { // from class: zx5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32995Fx5.m106174y(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun createGoogle…),\n        ))\n      }\n  }");
        return m33101w;
    }

    /* renamed from: z */
    public final AbstractC23442F<PaymentMethod> m106173z(PaymentMethodCreateParams paymentMethodCreateParams, PaymentAddSource paymentAddSource) {
        AbstractC23442F m23305k = C45832nh5.m23305k(new C2522e(paymentMethodCreateParams));
        final C2524f c2524f = new C2524f(paymentAddSource);
        AbstractC23442F<PaymentMethod> m33101w = m23305k.m33101w(new InterfaceC23484g() { // from class: ux5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32995Fx5.m106209A(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun createPaymen…),\n        ))\n      }\n  }");
        return m33101w;
    }
}
