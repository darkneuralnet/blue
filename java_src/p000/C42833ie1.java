package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.AdyenCard;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.SetupIntentStatus;
import co.bird.android.model.User;
import co.bird.android.model.constant.CardScannerStyle;
import co.bird.android.model.constant.DeviceVerificationMethod;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.android.model.constant.Permission;
import co.bird.api.request.BraintreeTokenResponse;
import co.bird.api.response.DeviceCheckSendResponse;
import co.bird.api.response.SavedPaymentMethodResponse;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.components.model.paymentmethods.Configuration;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.core.api.Environment;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C42833ie1;
@Metadata(m28433d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ~2\u00020\u0001:\u0001\u000fB\u0089\u0001\b\u0007\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020>\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M\u0012\b\b\u0001\u0010T\u001a\u00020Q\u0012\u000e\b\u0001\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U\u0012\b\b\u0001\u0010]\u001a\u00020Z\u0012\b\b\u0001\u0010a\u001a\u00020^\u0012\b\b\u0001\u0010e\u001a\u00020b¢\u0006\u0004\b|\u0010}J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u0014\u001a\u00020\u00042\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J$\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u0004H\u0002J\u0018\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0002J\u001e\u00100\u001a\u00020/2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0006\u0010.\u001a\u00020\u001eH\u0002R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bf\u0010\u0015R\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010{\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010t\u001a\u0004\by\u0010z¨\u0006\u007f"}, m28432d2 = {"Lie1;", "LQd1;", "Landroid/content/Intent;", "intent", "", "M", "onResume", "e", "", "requestCode", "resultCode", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onActivityResult", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", C17296a.f69688o, "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", DateTokenConverter.CONVERTER_KEY, "I", "Lcom/braintreepayments/api/models/PayPalAccountNonce;", "Lco/bird/android/model/User;", "user", "Lio/reactivex/c;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "Lco/bird/android/model/AdyenCard;", "adyenCard", "", "dob", "passcode", "v", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "card", "y", "T", "Y", "publicKey", "Lcom/adyen/checkout/core/api/Environment;", "environment", "Lcom/adyen/checkout/card/CardConfiguration;", "G", "", "supportedBrands", Action.PAYMENT_METHOD_TYPE, "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;", "H", "LfL;", "LfL;", "birdDeviceCheckManager", "Lpx5;", "b", "Lpx5;", "setupIntentManager", "LpM3;", "LpM3;", "paymentIntentManager", "LAM3;", "LAM3;", "paymentManagerV2", "LVM3;", "LVM3;", "paymentManagerV3", "LTq4;", "f", "LTq4;", "reactiveConfig", "Lw10;", "g", "Lw10;", "brainTreeManager", "LRh6;", "h", "LRh6;", "userStream", "LEa;", "i", "LEa;", "analyticsManager", "Lco/bird/android/core/mvp/BaseActivity;", "j", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "k", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lpe1;", "l", "Lpe1;", "ui", "Le13;", "m", "Le13;", "navigator", "LDQ3;", "n", "LDQ3;", "permissionManager", "o", "scanRequestCode", "", "p", "Z", "updating", "q", "Ljava/lang/Boolean;", "useSetupIntent", "Lco/bird/android/model/PaymentAddSource;", "r", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "s", "Lkotlin/Lazy;", "E", "()Lcom/adyen/checkout/card/CardConfiguration;", "cardConfiguration", "t", "F", "()Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;", "paymentMethod", "<init>", "(LfL;Lpx5;LpM3;LAM3;LVM3;LTq4;Lw10;LRh6;LEa;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lpe1;Le13;LDQ3;)V", "u", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnterCardPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterCardPresenter.kt\nco/bird/android/app/feature/prepay/EnterCardPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,507:1\n180#2:508\n180#2:509\n237#2:510\n237#2:511\n199#2:512\n237#2:513\n199#2:514\n180#2:515\n199#2:516\n*S KotlinDebug\n*F\n+ 1 EnterCardPresenter.kt\nco/bird/android/app/feature/prepay/EnterCardPresenterImpl\n*L\n163#1:508\n233#1:509\n308#1:510\n322#1:511\n382#1:512\n407#1:513\n416#1:514\n455#1:515\n268#1:516\n*E\n"})
/* renamed from: ie1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42833ie1 implements InterfaceC35385Qd1 {

    /* renamed from: u */
    public static final C23295a f87577u = new C23295a(null);

    /* renamed from: v */
    public static final int f87578v = 8;

    /* renamed from: w */
    public static final Set<String> f87579w;

    /* renamed from: x */
    public static final String f87580x;

    /* renamed from: a */
    public final InterfaceC20357fL f87581a;

    /* renamed from: b */
    public final InterfaceC47178px5 f87582b;

    /* renamed from: c */
    public final InterfaceC46820pM3 f87583c;

    /* renamed from: d */
    public final AM3 f87584d;

    /* renamed from: e */
    public final VM3 f87585e;

    /* renamed from: f */
    public final C36207Tq4 f87586f;

    /* renamed from: g */
    public final InterfaceC50768w10 f87587g;

    /* renamed from: h */
    public final InterfaceC35660Rh6 f87588h;

    /* renamed from: i */
    public final InterfaceC1880Ea f87589i;

    /* renamed from: j */
    public final BaseActivity f87590j;

    /* renamed from: k */
    public final LifecycleScopeProvider<EnumC7097RE> f87591k;

    /* renamed from: l */
    public final InterfaceC46984pe1 f87592l;

    /* renamed from: m */
    public final InterfaceC40099e13 f87593m;

    /* renamed from: n */
    public final DQ3 f87594n;

    /* renamed from: o */
    public final int f87595o;

    /* renamed from: p */
    public boolean f87596p;

    /* renamed from: q */
    public Boolean f87597q;

    /* renamed from: r */
    public PaymentAddSource f87598r;

    /* renamed from: s */
    public final Lazy f87599s;

    /* renamed from: t */
    public final Lazy f87600t;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lie1$a;", "", "", "ADYEN_PAYMENT_TYPE", "Ljava/lang/String;", "", "ADYEN_SUPPORTED_CARDS", "Ljava/util/Set;", "", "PROMPT_DOB_CORP_NUMBER", "I", "PROMPT_FULL_ADDRESS", "PROMPT_PASSWORD", "PROMPT_ZIPCODE", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ie1$a */
    /* loaded from: classes2.dex */
    public static final class C23295a {
        public /* synthetic */ C23295a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C23295a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23296b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentProvider.values().length];
            try {
                iArr[PaymentProvider.ADYEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentProvider.STRIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DeviceVerificationMethod.values().length];
            try {
                iArr2[DeviceVerificationMethod.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DeviceVerificationMethod.PUSH_TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SavedPaymentMethodResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/SavedPaymentMethodResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$c */
    /* loaded from: classes2.dex */
    public static final class C23297c extends Lambda implements Function1<SavedPaymentMethodResponse, Unit> {
        public C23297c() {
            super(1);
        }

        /* renamed from: a */
        public final void m33665a(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            C42833ie1.this.f87596p = false;
            C42833ie1.this.f87590j.setResult(-1);
            C42833ie1.this.f87590j.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            m33665a(savedPaymentMethodResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$d */
    /* loaded from: classes2.dex */
    public static final class C23298d extends Lambda implements Function1<Throwable, Unit> {
        public C23298d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C42833ie1.this.f87596p = false;
            InterfaceC46984pe1 interfaceC46984pe1 = C42833ie1.this.f87592l;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC46984pe1.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "paymentMethodId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$e */
    /* loaded from: classes2.dex */
    public static final class C23299e extends Lambda implements Function1<String, Unit> {
        public C23299e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String paymentMethodId) {
            InterfaceC46820pM3 interfaceC46820pM3 = C42833ie1.this.f87583c;
            Intrinsics.checkNotNullExpressionValue(paymentMethodId, "paymentMethodId");
            interfaceC46820pM3.mo8805l(paymentMethodId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$f */
    /* loaded from: classes2.dex */
    public static final class C23300f extends Lambda implements Function1<String, Unit> {
        public C23300f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C42833ie1.this.f87590j.setResult(-1);
            C42833ie1.this.f87590j.finish();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$g */
    /* loaded from: classes2.dex */
    public static final class C23301g extends Lambda implements Function1<Throwable, Unit> {
        public C23301g() {
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
            C42833ie1.this.f87596p = false;
            C42833ie1.this.f87592l.error(C45871nl4.payment_error_title);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/adyen/checkout/card/CardConfiguration;", "b", "()Lcom/adyen/checkout/card/CardConfiguration;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$h */
    /* loaded from: classes2.dex */
    public static final class C23302h extends Lambda implements Function0<CardConfiguration> {
        public C23302h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final CardConfiguration invoke() {
            C42833ie1 c42833ie1 = C42833ie1.this;
            return c42833ie1.m33711G(c42833ie1.f87585e.mo25741g(C42833ie1.this.f87590j), C42833ie1.this.f87585e.mo25743f());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DeviceCheckSendResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/response/DeviceCheckSendResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$i */
    /* loaded from: classes2.dex */
    public static final class C23303i extends Lambda implements Function1<DeviceCheckSendResponse, Unit> {

        /* renamed from: g */
        public static final C23303i f87607g = new C23303i();

        public C23303i() {
            super(1);
        }

        /* renamed from: a */
        public final void m33663a(DeviceCheckSendResponse deviceCheckSendResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeviceCheckSendResponse deviceCheckSendResponse) {
            m33663a(deviceCheckSendResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$j */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23304j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C23304j f87608b = new C23304j();

        public C23304j() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$k */
    /* loaded from: classes2.dex */
    public static final class C23305k extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C23305k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C42833ie1.this.f87594n.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "permissionResponse", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$l */
    /* loaded from: classes2.dex */
    public static final class C23306l extends Lambda implements Function1<FQ3, Unit> {
        public C23306l() {
            super(1);
        }

        /* renamed from: a */
        public final void m33662a(FQ3 fq3) {
            if (fq3.m107154a()) {
                C42833ie1.this.f87593m.mo36910y3(C42833ie1.this.f87595o);
            } else {
                C41318g46.m40151m("User deny camera to scan card", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m33662a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/SetupIntentStatus;", "setupIntentStatus", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/SetupIntentStatus;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$m */
    /* loaded from: classes2.dex */
    public static final class C23307m extends Lambda implements Function1<SetupIntentStatus, InterfaceC24574u<? extends SetupIntentStatus>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/SetupIntentStatus;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ie1$m$a */
        /* loaded from: classes2.dex */
        public static final class C23308a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends SetupIntentStatus>> {

            /* renamed from: g */
            public final /* synthetic */ C42833ie1 f87612g;

            /* renamed from: h */
            public final /* synthetic */ SetupIntentStatus f87613h;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "brainTreeResponse", "Lio/reactivex/u;", "Lco/bird/android/model/SetupIntentStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: ie1$m$a$a */
            /* loaded from: classes2.dex */
            public static final class C23309a extends Lambda implements Function1<HM4<BraintreeTokenResponse>, InterfaceC24574u<? extends SetupIntentStatus>> {

                /* renamed from: g */
                public final /* synthetic */ C42833ie1 f87614g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23309a(C42833ie1 c42833ie1) {
                    super(1);
                    this.f87614g = c42833ie1;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC24574u<? extends SetupIntentStatus> invoke(HM4<BraintreeTokenResponse> brainTreeResponse) {
                    String token;
                    Intrinsics.checkNotNullParameter(brainTreeResponse, "brainTreeResponse");
                    BraintreeTokenResponse m103944a = brainTreeResponse.m103944a();
                    if (m103944a != null && (token = m103944a.getToken()) != null) {
                        G10 mo17303R = this.f87614g.f87592l.mo17303R(token);
                        C42833ie1 c42833ie1 = this.f87614g;
                        PayPalRequest payPalRequest = new PayPalRequest();
                        if (mo17303R != null) {
                            C40881fL3.m41541t(mo17303R, payPalRequest);
                            c42833ie1.f87589i.mo55905y(new WP3(null, null, null, 7, null));
                            return AbstractC24507p.m32024u();
                        }
                        return AbstractC24507p.m32023v(new NullPointerException("Braintree fragment found"));
                    }
                    return AbstractC24507p.m32068G(SetupIntentStatus.UNEXPECTED);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23308a(C42833ie1 c42833ie1, SetupIntentStatus setupIntentStatus) {
                super(1);
                this.f87612g = c42833ie1;
                this.f87613h = setupIntentStatus;
            }

            /* renamed from: c */
            public static final InterfaceC24574u m33654c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC24574u) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends SetupIntentStatus> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.CANCEL) {
                    String mo76580e = this.f87612g.f87588h.mo76580e();
                    if (mo76580e == null) {
                        return AbstractC24507p.m32068G(SetupIntentStatus.UNEXPECTED);
                    }
                    AbstractC23442F<HM4<BraintreeTokenResponse>> mo2106d = this.f87612g.f87587g.mo2106d(mo76580e, PaymentProvider.BRAINTREE);
                    final C23309a c23309a = new C23309a(this.f87612g);
                    return mo2106d.m33163C(new InterfaceC23492o() { // from class: le1
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m33654c;
                            m33654c = C42833ie1.C23307m.C23308a.m33654c(Function1.this, obj);
                            return m33654c;
                        }
                    });
                }
                return AbstractC24507p.m32068G(this.f87613h);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/android/model/SetupIntentStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/SetupIntentStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ie1$m$b */
        /* loaded from: classes2.dex */
        public static final class C23310b extends Lambda implements Function1<DialogResponse, SetupIntentStatus> {

            /* renamed from: g */
            public final /* synthetic */ SetupIntentStatus f87615g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23310b(SetupIntentStatus setupIntentStatus) {
                super(1);
                this.f87615g = setupIntentStatus;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final SetupIntentStatus invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f87615g;
            }
        }

        public C23307m() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC24574u m33658d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final SetupIntentStatus m33657e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (SetupIntentStatus) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends SetupIntentStatus> invoke(SetupIntentStatus setupIntentStatus) {
            Intrinsics.checkNotNullParameter(setupIntentStatus, "setupIntentStatus");
            if (setupIntentStatus != SetupIntentStatus.SETUP_INTENT_ERROR && setupIntentStatus != SetupIntentStatus.ATTACH_PAYMENT_ERROR && setupIntentStatus != SetupIntentStatus.UNEXPECTED) {
                return C42833ie1.this.f87584d.mo85670h().m33042m(AbstractC23442F.m33158H(setupIntentStatus)).m33125j0();
            }
            if (C42833ie1.this.f87586f.m82623f8().m73665a().getPaymentConfig().getEnablePaypal() && C42833ie1.this.f87586f.m82623f8().m73665a().getPaymentConfig().getSuggestPaypalOnPaymentAddError()) {
                AbstractC23442F<DialogResponse> birdDialog = C42833ie1.this.f87592l.birdDialog(C50978wN3.f115872d, true, true);
                final C23308a c23308a = new C23308a(C42833ie1.this, setupIntentStatus);
                return birdDialog.m33163C(new InterfaceC23492o() { // from class: je1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m33658d;
                        m33658d = C42833ie1.C23307m.m33658d(Function1.this, obj);
                        return m33658d;
                    }
                });
            }
            AbstractC23442F<DialogResponse> birdDialog2 = C42833ie1.this.f87592l.birdDialog(C43262jM3.f92601d, true, true);
            final C23310b c23310b = new C23310b(setupIntentStatus);
            return birdDialog2.m33157I(new InterfaceC23492o() { // from class: ke1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    SetupIntentStatus m33657e;
                    m33657e = C42833ie1.C23307m.m33657e(Function1.this, obj);
                    return m33657e;
                }
            }).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/SetupIntentStatus;", "kotlin.jvm.PlatformType", "setupIntentStatus", "", C17296a.f69688o, "(Lco/bird/android/model/SetupIntentStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$n */
    /* loaded from: classes2.dex */
    public static final class C23311n extends Lambda implements Function1<SetupIntentStatus, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ie1$n$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C23312a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SetupIntentStatus.values().length];
                try {
                    iArr[SetupIntentStatus.COMPLETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SetupIntentStatus.REQUIRES_AUTHENTICATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SetupIntentStatus.SETUP_INTENT_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SetupIntentStatus.ATTACH_PAYMENT_ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SetupIntentStatus.UNEXPECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C23311n() {
            super(1);
        }

        /* renamed from: a */
        public final void m33651a(SetupIntentStatus setupIntentStatus) {
            int i;
            if (setupIntentStatus == null) {
                i = -1;
            } else {
                i = C23312a.$EnumSwitchMapping$0[setupIntentStatus.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4 && i != 5) {
                        C42833ie1.this.f87592l.error(C45871nl4.payment_error_title);
                    }
                } else {
                    C42833ie1.this.f87582b.mo18386c(C42833ie1.this.f87590j);
                }
            } else {
                C42833ie1.this.f87590j.setResult(-1);
                C42833ie1.this.f87590j.finish();
            }
            if (setupIntentStatus != SetupIntentStatus.COMPLETE && setupIntentStatus != SetupIntentStatus.REQUIRES_AUTHENTICATION) {
                C42833ie1.this.f87596p = false;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SetupIntentStatus setupIntentStatus) {
            m33651a(setupIntentStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$o */
    /* loaded from: classes2.dex */
    public static final class C23313o extends Lambda implements Function1<Throwable, Unit> {
        public C23313o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C42833ie1.this.f87592l.error(C45871nl4.error_generic_body);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;", "b", "()Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$p */
    /* loaded from: classes2.dex */
    public static final class C23314p extends Lambda implements Function0<PaymentMethod> {
        public C23314p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final PaymentMethod invoke() {
            List list;
            C42833ie1 c42833ie1 = C42833ie1.this;
            list = CollectionsKt___CollectionsKt.toList(C42833ie1.f87579w);
            return c42833ie1.m33710H(list, C42833ie1.f87580x);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LCf0;", "t1", "t2", "", C17296a.f69688o, "(LCf0;LCf0;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$q */
    /* loaded from: classes2.dex */
    public static final class C23315q extends Lambda implements Function2<C32126Cf0, C32126Cf0, Boolean> {

        /* renamed from: g */
        public static final C23315q f87619g = new C23315q();

        public C23315q() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(C32126Cf0 t1, C32126Cf0 t2) {
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            return Boolean.valueOf(Intrinsics.areEqual(t1.m111925c(), t2.m111925c()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LCf0;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LCf0;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ie1$r */
    /* loaded from: classes2.dex */
    public static final class C23316r extends Lambda implements Function1<C32126Cf0, InterfaceC23447K<? extends Boolean>> {
        public C23316r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Boolean> invoke(C32126Cf0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C42833ie1.this.f87585e.mo25778B(C42833ie1.this.f87590j, it, C42833ie1.this.m33713E());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "birthdayAndPasscodeRequired", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$s */
    /* loaded from: classes2.dex */
    public static final class C23317s extends Lambda implements Function1<Boolean, Unit> {
        public C23317s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean birthdayAndPasscodeRequired) {
            InterfaceC46984pe1 interfaceC46984pe1 = C42833ie1.this.f87592l;
            Intrinsics.checkNotNullExpressionValue(birthdayAndPasscodeRequired, "birthdayAndPasscodeRequired");
            interfaceC46984pe1.mo17296kg(birthdayAndPasscodeRequired.booleanValue());
            C42833ie1.this.f87592l.mo17306K9(birthdayAndPasscodeRequired.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ie1$t */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23318t extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C23318t f87622b = new C23318t();

        public C23318t() {
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nEnterCardPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterCardPresenter.kt\nco/bird/android/app/feature/prepay/EnterCardPresenterImpl$setupStripe$requiresZipOverride$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,507:1\n1747#2,3:508\n*S KotlinDebug\n*F\n+ 1 EnterCardPresenter.kt\nco/bird/android/app/feature/prepay/EnterCardPresenterImpl$setupStripe$requiresZipOverride$2\n*L\n470#1:508,3\n*E\n"})
    /* renamed from: ie1$u */
    /* loaded from: classes2.dex */
    public static final class C23319u extends Lambda implements Function0<Boolean> {
        public C23319u() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean equals;
            boolean z;
            String country = Locale.getDefault().getCountry();
            List<String> deviceRegionsRequiringCreditPostalCode = C42833ie1.this.f87586f.m82623f8().m73665a().getPaymentConfig().getDeviceRegionsRequiringCreditPostalCode();
            boolean z2 = false;
            if (deviceRegionsRequiringCreditPostalCode != null) {
                List<String> list = deviceRegionsRequiringCreditPostalCode;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str : list) {
                        equals = StringsKt__StringsJVMKt.equals(str, country, true);
                        if (equals) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"amex", "bcmc", "diners", "discover", "korean_local_card", "maestro", "mc", "visa"});
        f87579w = of;
        f87580x = CardPaymentMethod.PAYMENT_METHOD_TYPE;
    }

    public C42833ie1(InterfaceC20357fL birdDeviceCheckManager, InterfaceC47178px5 setupIntentManager, InterfaceC46820pM3 paymentIntentManager, AM3 paymentManagerV2, VM3 paymentManagerV3, C36207Tq4 reactiveConfig, InterfaceC50768w10 brainTreeManager, InterfaceC35660Rh6 userStream, InterfaceC1880Ea analyticsManager, BaseActivity activity, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC46984pe1 ui, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(birdDeviceCheckManager, "birdDeviceCheckManager");
        Intrinsics.checkNotNullParameter(setupIntentManager, "setupIntentManager");
        Intrinsics.checkNotNullParameter(paymentIntentManager, "paymentIntentManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f87581a = birdDeviceCheckManager;
        this.f87582b = setupIntentManager;
        this.f87583c = paymentIntentManager;
        this.f87584d = paymentManagerV2;
        this.f87585e = paymentManagerV3;
        this.f87586f = reactiveConfig;
        this.f87587g = brainTreeManager;
        this.f87588h = userStream;
        this.f87589i = analyticsManager;
        this.f87590j = activity;
        this.f87591k = scopeProvider;
        this.f87592l = ui;
        this.f87593m = navigator;
        this.f87594n = permissionManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C23302h());
        this.f87599s = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C23314p());
        this.f87600t = lazy2;
    }

    /* renamed from: A */
    public static final void m33717A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m33716B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m33708J(C42833ie1 c42833ie1, DeviceVerificationMethod deviceVerificationMethod) {
        Object m33135e = c42833ie1.f87581a.mo21335d(deviceVerificationMethod).m33135e(AutoDispose.m45239a(c42833ie1.f87591k));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23303i c23303i = C23303i.f87607g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Rd1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42833ie1.m33707K(Function1.this, obj);
            }
        };
        final C23304j c23304j = C23304j.f87608b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Zd1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42833ie1.m33706L(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public static final void m33707K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m33706L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC23447K m33704N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m33703O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC24574u m33702P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m33701Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m33700R(C42833ie1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f87593m.mo37050b1(-1);
    }

    /* renamed from: S */
    public static final void m33699S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final boolean m33697U(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: V */
    public static final InterfaceC23447K m33696V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m33695W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m33694X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final boolean m33692Z(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    /* renamed from: w */
    public static final void m33669w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m33668x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m33666z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final AbstractC23461c m33715C(PayPalAccountNonce payPalAccountNonce, User user) {
        AM3 am3 = this.f87584d;
        String id = user.getId();
        String m53365i = payPalAccountNonce.m53365i();
        Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
        String m53327c = payPalAccountNonce.m53327c();
        Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
        return am3.mo85680c(id, m53365i, m53327c, PaymentProvider.BRAINTREE, PaymentAddSource.PAYMENT_SETTINGS_SCREEN);
    }

    /* renamed from: D */
    public final AbstractC23461c m33714D(PayPalAccountNonce payPalAccountNonce, User user) {
        VM3 vm3 = this.f87585e;
        String m53327c = payPalAccountNonce.m53327c();
        Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
        String m53365i = payPalAccountNonce.m53365i();
        Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
        AbstractC23461c m33159G = vm3.mo25721q(m53327c, m53365i).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "paymentManagerV3.addPayp… )\n      .ignoreElement()");
        return m33159G;
    }

    /* renamed from: E */
    public final CardConfiguration m33713E() {
        return (CardConfiguration) this.f87599s.getValue();
    }

    /* renamed from: F */
    public final PaymentMethod m33712F() {
        return (PaymentMethod) this.f87600t.getValue();
    }

    /* renamed from: G */
    public final CardConfiguration m33711G(String str, Environment environment) {
        CardConfiguration m10726a = new CardConfiguration.C16794b(this.f87590j, str).m53693q(environment).m53692r(false).m10726a();
        Intrinsics.checkNotNullExpressionValue(m10726a, "Builder(activity, public…eld(false)\n      .build()");
        return m10726a;
    }

    /* renamed from: H */
    public final PaymentMethod m33710H(List<String> list, String str) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setBrands(list);
        paymentMethod.setType(str);
        Configuration configuration = new Configuration();
        configuration.setKoreanAuthenticationRequired("true");
        paymentMethod.setConfiguration(configuration);
        return paymentMethod;
    }

    /* renamed from: I */
    public final void m33709I() {
        int i;
        DeviceVerificationMethod deviceVerificationMethod = this.f87586f.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod();
        if (deviceVerificationMethod == null) {
            i = -1;
        } else {
            i = C23296b.$EnumSwitchMapping$1[deviceVerificationMethod.ordinal()];
        }
        if (i == 1 || i == 2) {
            m33708J(this, deviceVerificationMethod);
        }
    }

    /* renamed from: M */
    public void m33705M(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean booleanExtra = intent.getBooleanExtra("save_card_without_charge", false);
        this.f87598r = (PaymentAddSource) intent.getSerializableExtra("card_entry_source");
        this.f87592l.reset();
        int i = C23296b.$EnumSwitchMapping$0[this.f87585e.mo25723p(co.bird.android.model.constant.PaymentMethod.CARD).ordinal()];
        if (i != 1) {
            if (i != 2) {
                m33693Y();
            } else {
                m33693Y();
            }
        } else {
            m33698T();
        }
        Observable<Unit> mo17297he = this.f87592l.mo17297he();
        final C23305k c23305k = new C23305k();
        Observable<R> flatMapSingle = mo17297he.flatMapSingle(new InterfaceC23492o() { // from class: ae1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m33704N;
                m33704N = C42833ie1.m33704N(Function1.this, obj);
                return m33704N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate(in…    }\n        }\n    }\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f87591k));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23306l c23306l = new C23306l();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: be1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42833ie1.m33703O(Function1.this, obj);
            }
        });
        Boolean valueOf = Boolean.valueOf(booleanExtra);
        this.f87597q = valueOf;
        Intrinsics.checkNotNull(valueOf);
        if (valueOf.booleanValue()) {
            Observable<SetupIntentStatus> observeOn = this.f87582b.mo18388a().observeOn(C23454a.m33087a());
            final C23307m c23307m = new C23307m();
            Observable<R> flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: ce1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m33702P;
                    m33702P = C42833ie1.m33702P(Function1.this, obj);
                    return m33702P;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun onCreate(in…    }\n        }\n    }\n  }");
            Object m33094as2 = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f87591k));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23311n c23311n = new C23311n();
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: de1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42833ie1.m33701Q(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: T */
    public final void m33698T() {
        this.f87592l.mo17299ck(m33713E(), m33712F());
        Observable<C32126Cf0> mo17301V4 = this.f87592l.mo17301V4();
        final C23315q c23315q = C23315q.f87619g;
        Observable<C32126Cf0> distinctUntilChanged = mo17301V4.distinctUntilChanged(new InterfaceC23481d() { // from class: Vd1
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m33697U;
                m33697U = C42833ie1.m33697U(Function2.this, obj, obj2);
                return m33697U;
            }
        });
        final C23316r c23316r = new C23316r();
        Observable retry = distinctUntilChanged.flatMapSingle(new InterfaceC23492o() { // from class: Wd1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m33696V;
                m33696V = C42833ie1.m33696V(Function1.this, obj);
                return m33696V;
            }
        }).observeOn(C23454a.m33087a()).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun setupAdyen()…)\n      }, Timber::e)\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f87591k));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23317s c23317s = new C23317s();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Xd1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42833ie1.m33695W(Function1.this, obj);
            }
        };
        final C23318t c23318t = C23318t.f87622b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Yd1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42833ie1.m33694X(Function1.this, obj);
            }
        });
    }

    /* renamed from: Y */
    public final void m33693Y() {
        boolean z;
        Lazy lazy;
        if (this.f87586f.m82623f8().m73665a().getPaymentConfig().getCardScannerStyle() == CardScannerStyle.CARD_IO) {
            z = true;
        } else {
            z = false;
        }
        this.f87592l.mo17295pe(z);
        lazy = LazyKt__LazyJVMKt.lazy(new C23319u());
        int billingAddressRequirement = this.f87586f.m82623f8().m73665a().getBillingAddressRequirement();
        if (billingAddressRequirement != 0) {
            if (billingAddressRequirement != 1) {
                if (billingAddressRequirement == 2) {
                    this.f87592l.mo17294ql(m33692Z(lazy));
                    return;
                }
                return;
            }
            this.f87592l.mo17292si();
            return;
        }
        this.f87592l.mo17298fl(m33692Z(lazy));
    }

    @Override // p000.InterfaceC35385Qd1
    /* renamed from: a */
    public void mo33691a(PaymentMethodNonce paymentMethodNonce) {
        Integer num;
        AbstractC23461c m33715C;
        Intrinsics.checkNotNullParameter(paymentMethodNonce, "paymentMethodNonce");
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            User mo76584a = this.f87588h.mo76584a();
            InterfaceC23465c interfaceC23465c = null;
            if (mo76584a != null) {
                Map<PaymentProvider, Integer> paymentProviderEndpointVersions = this.f87586f.m82623f8().m73665a().getPaymentConfig().getPaymentProviderEndpointVersions();
                if (paymentProviderEndpointVersions != null) {
                    num = paymentProviderEndpointVersions.get(PaymentProvider.BRAINTREE);
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 3) {
                    m33715C = m33714D((PayPalAccountNonce) paymentMethodNonce, mo76584a);
                } else {
                    m33715C = m33715C((PayPalAccountNonce) paymentMethodNonce, mo76584a);
                }
                AbstractC23461c m33070P = C28237sD.progress$default(m33715C, this.f87592l, 0, 2, (Object) null).m33070P(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m33070P, "when (reactiveConfig.con…dSchedulers.mainThread())");
                Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f87591k));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: he1
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C42833ie1.m33700R(C42833ie1.this);
                    }
                };
                final C23313o c23313o = new C23313o();
                interfaceC23465c = ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Sd1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C42833ie1.m33699S(Function1.this, obj);
                    }
                });
            }
            if (interfaceC23465c == null) {
                this.f87589i.mo55905y(new GP3(null, null, null, 7, null));
                C41318g46.m40160d("User was null when creating Braintree payment nonce.", new Object[0]);
                this.f87592l.error(C45871nl4.error_generic_body);
                return;
            }
            return;
        }
        this.f87589i.mo55905y(new GP3(null, null, null, 7, null));
        C41318g46.m40160d("The paymentMethodNonce returned is not a PayPalAccountNonce.", new Object[0]);
        this.f87592l.error(C45871nl4.error_generic_body);
    }

    @Override // p000.InterfaceC35385Qd1
    /* renamed from: c */
    public void mo33689c(int i) {
        this.f87593m.mo37050b1(0);
    }

    @Override // p000.InterfaceC35385Qd1
    /* renamed from: d */
    public void mo33688d(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f87589i.mo55905y(new GP3(null, null, null, 7, null));
        C41318g46.m40158f(error, "Error with Paypal", new Object[0]);
        if (error instanceof ErrorWithResponse) {
            this.f87592l.error(((ErrorWithResponse) error).m53411c());
        } else {
            this.f87593m.mo37050b1(0);
        }
    }

    @Override // p000.InterfaceC35385Qd1
    /* renamed from: e */
    public void mo33687e() {
        AdyenCard mo25712v;
        this.f87592l.hideKeyboard();
        PaymentMethodCreateParams mo17307B5 = this.f87592l.mo17307B5();
        if (mo17307B5 != null) {
            m33667y(mo17307B5);
        }
        C32126Cf0 mo17291zh = this.f87592l.mo17291zh();
        if (mo17291zh != null && (mo25712v = this.f87585e.mo25712v(mo17291zh)) != null) {
            m33670v(mo25712v, this.f87592l.mo17293r3(), this.f87592l.mo17300Vb());
        }
    }

    @Override // p000.InterfaceC35385Qd1
    public void onActivityResult(int i, int i2, Intent intent) {
        CreditCard creditCard;
        if (i == this.f87595o) {
            if (intent != null && intent.hasExtra(CardIOActivity.EXTRA_SCAN_RESULT) && (creditCard = (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT)) != null) {
                m33667y(JE0.m100942a(creditCard));
                return;
            }
            return;
        }
        Object m33041n = C28237sD.progress$default(this.f87582b.mo18385d(i, intent), this.f87592l, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f87591k));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.InterfaceC35385Qd1
    public void onResume() {
        m33709I();
    }

    /* renamed from: v */
    public final void m33670v(AdyenCard adyenCard, String str, String str2) {
        if (!this.f87596p) {
            this.f87596p = true;
            Object m33135e = C28237sD.progress$default(this.f87585e.mo25708z(adyenCard, str, str2), this.f87592l, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f87591k));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23297c c23297c = new C23297c();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Td1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42833ie1.m33669w(Function1.this, obj);
                }
            };
            final C23298d c23298d = new C23298d();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ud1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42833ie1.m33668x(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: y */
    public final void m33667y(PaymentMethodCreateParams paymentMethodCreateParams) {
        if (!this.f87596p) {
            this.f87596p = true;
            Boolean bool = this.f87597q;
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                Object m33041n = C28237sD.progress$default(this.f87582b.mo18384e(paymentMethodCreateParams, this.f87598r), this.f87592l, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f87591k));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                ((CompletableSubscribeProxy) m33041n).subscribe();
                return;
            }
            AbstractC23442F<String> mo18383f = this.f87582b.mo18383f(paymentMethodCreateParams, this.f87598r);
            final C23299e c23299e = new C23299e();
            AbstractC23442F<String> m33101w = mo18383f.m33101w(new InterfaceC23484g() { // from class: ee1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42833ie1.m33666z(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33101w, "private fun addCard(card…     })\n      }\n    }\n  }");
            Object m33135e = C28237sD.progress$default(m33101w, this.f87592l, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f87591k));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23300f c23300f = new C23300f();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: fe1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42833ie1.m33717A(Function1.this, obj);
                }
            };
            final C23301g c23301g = new C23301g();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ge1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42833ie1.m33716B(Function1.this, obj);
                }
            });
        }
    }
}
