package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.injection.DaggerGooglePayPaymentMethodLauncherComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u00ad\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001.\b\u0007\u0018\u0000 F2\u00020\u0001:\u0007GFHIJKLBÁ\u0001\b\u0001\u0012\b\b\u0001\u00102\u001a\u000201\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u00104\u001a\u000203\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e\u0012\u0010\b\u0001\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001e\u0012\b\b\u0003\u0010\"\u001a\u00020\u0013\u0012\b\b\u0003\u0010$\u001a\u00020#\u0012\b\b\u0002\u00106\u001a\u000205\u0012\b\b\u0002\u00108\u001a\u000207\u0012\b\b\u0002\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<B)\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\b;\u0010AB)\b\u0016\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\b;\u0010DB7\b\u0012\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00102\u001a\u000201\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b;\u0010EJ&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b*\u0010+\u0012\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u0006M"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "", "", "currencyCode", "", "amount", "transactionId", "", "present", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "LB5;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "activityResultLauncher", "LB5;", "", "skipReadyCheck", "Z", "Lkotlin/Function1;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "googlePayRepositoryFactory", "Lkotlin/jvm/functions/Function1;", "", NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "Lkotlin/Function0;", "publishableKeyProvider", "Lkotlin/jvm/functions/Function0;", "stripeAccountIdProvider", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "Lkotlin/coroutines/CoroutineContext;", "ioContext", "Lkotlin/coroutines/CoroutineContext;", "isReady", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherComponent;", "launcherComponent", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherComponent;", "injectorKey", "Ljava/lang/String;", "getInjectorKey$annotations", "()V", "com/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$injector$1", "injector", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$injector$1;", "LZC0;", "lifecycleScope", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "<init>", "(LZC0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;LB5;ZLandroid/content/Context;Lkotlin/jvm/functions/Function1;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;)V", "Landroidx/activity/ComponentActivity;", "activity", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "resultCallback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V", "(Landroid/content/Context;LZC0;LB5;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;)V", "Companion", "BillingAddressConfig", "Config", "ErrorCode", "ReadyCallback", com.paypal.android.sdk.onetouch.core.Result.f74995h, "ResultCallback", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmSuppressWildcards
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncher {
    public static final int DEVELOPER_ERROR = 2;
    public static final int INTERNAL_ERROR = 1;
    public static final int NETWORK_ERROR = 3;
    public static final String PRODUCT_USAGE_TOKEN = "GooglePayPaymentMethodLauncher";
    private final AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher;
    private final Config config;
    private final boolean enableLogging;
    private final Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private final GooglePayPaymentMethodLauncher$injector$1 injector;
    private final String injectorKey;
    private final CoroutineContext ioContext;
    private boolean isReady;
    private final GooglePayPaymentMethodLauncherComponent launcherComponent;
    private final Set<String> productUsage;
    private final Function0<String> publishableKeyProvider;
    private final ReadyCallback readyCallback;
    private final boolean skipReadyCheck;
    private final Function0<String> stripeAccountIdProvider;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "it", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$3 */
    /* loaded from: classes7.dex */
    public static final class C189433 extends Lambda implements Function1<GooglePayEnvironment, GooglePayRepository> {
        final /* synthetic */ Config $config;
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189433(Context context, Config config) {
            super(1);
            this.$context = context;
            this.$config = config;
        }

        @Override // kotlin.jvm.functions.Function1
        public final GooglePayRepository invoke(GooglePayEnvironment it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new DefaultGooglePayRepository(this.$context, this.$config.getEnvironment(), ConvertKt.convert(this.$config.getBillingAddressConfig()), this.$config.getExistingPaymentMethodRequired(), this.$config.getAllowCreditCards(), null, 32, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$4 */
    /* loaded from: classes7.dex */
    public static final class C189444 extends Lambda implements Function0<String> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189444(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return PaymentConfiguration.Companion.getInstance(this.$context).getPublishableKey();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$5 */
    /* loaded from: classes7.dex */
    public static final class C189455 extends Lambda implements Function0<String> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189455(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return PaymentConfiguration.Companion.getInstance(this.$context).getStripeAccountId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$6", m28418f = "GooglePayPaymentMethodLauncher.kt", m28417i = {}, m28416l = {213}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$6 */
    /* loaded from: classes7.dex */
    public static final class C189466 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C189466(Continuation<C189466> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C189466(continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<Unit> continuation) {
            return ((C189466) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ReadyCallback readyCallback;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    readyCallback = (ReadyCallback) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ReadyCallback readyCallback2 = GooglePayPaymentMethodLauncher.this.readyCallback;
                InterfaceC32730Eu1<Boolean> isReady = ((GooglePayRepository) GooglePayPaymentMethodLauncher.this.googlePayRepositoryFactory.invoke(GooglePayPaymentMethodLauncher.this.config.getEnvironment())).isReady();
                this.L$0 = readyCallback2;
                this.label = 1;
                obj = C36708Vu1.m79248w(isReady, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                readyCallback = readyCallback2;
            }
            Boolean bool = (Boolean) obj;
            GooglePayPaymentMethodLauncher.this.isReady = bool.booleanValue();
            readyCallback.onReady(bool.booleanValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, (Continuation<Unit>) continuation);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "Landroid/os/Parcelable;", "isRequired", "", "format", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "isPhoneNumberRequired", "(ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;Z)V", "getFormat", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Format", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BillingAddressConfig implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BillingAddressConfig> CREATOR = new Creator();
        private final Format format;
        private final boolean isPhoneNumberRequired;
        private final boolean isRequired;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<BillingAddressConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingAddressConfig(parcel.readInt() != 0, Format.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressConfig[] newArray(int i) {
                return new BillingAddressConfig[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Format {
            Min("MIN"),
            Full("FULL");
            
            private final String code;

            Format(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        @JvmOverloads
        public BillingAddressConfig() {
            this(false, null, false, 7, null);
        }

        public static /* synthetic */ BillingAddressConfig copy$default(BillingAddressConfig billingAddressConfig, boolean z, Format format, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = billingAddressConfig.isRequired;
            }
            if ((i & 2) != 0) {
                format = billingAddressConfig.format;
            }
            if ((i & 4) != 0) {
                z2 = billingAddressConfig.isPhoneNumberRequired;
            }
            return billingAddressConfig.copy(z, format, z2);
        }

        public final boolean component1() {
            return this.isRequired;
        }

        public final Format component2() {
            return this.format;
        }

        public final boolean component3() {
            return this.isPhoneNumberRequired;
        }

        public final BillingAddressConfig copy(boolean z, Format format, boolean z2) {
            Intrinsics.checkNotNullParameter(format, "format");
            return new BillingAddressConfig(z, format, z2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingAddressConfig) {
                BillingAddressConfig billingAddressConfig = (BillingAddressConfig) obj;
                return this.isRequired == billingAddressConfig.isRequired && this.format == billingAddressConfig.format && this.isPhoneNumberRequired == billingAddressConfig.isPhoneNumberRequired;
            }
            return false;
        }

        public final Format getFormat() {
            return this.format;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.isRequired;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((r0 * 31) + this.format.hashCode()) * 31;
            boolean z2 = this.isPhoneNumberRequired;
            return hashCode + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final boolean isPhoneNumberRequired() {
            return this.isPhoneNumberRequired;
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public String toString() {
            boolean z = this.isRequired;
            Format format = this.format;
            boolean z2 = this.isPhoneNumberRequired;
            return "BillingAddressConfig(isRequired=" + z + ", format=" + format + ", isPhoneNumberRequired=" + z2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.isRequired ? 1 : 0);
            out.writeString(this.format.name());
            out.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        @JvmOverloads
        public BillingAddressConfig(boolean z) {
            this(z, null, false, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public BillingAddressConfig(boolean z, Format format) {
            this(z, format, false, 4, null);
            Intrinsics.checkNotNullParameter(format, "format");
        }

        @JvmOverloads
        public BillingAddressConfig(boolean z, Format format, boolean z2) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.isRequired = z;
            this.format = format;
            this.isPhoneNumberRequired = z2;
        }

        public /* synthetic */ BillingAddressConfig(boolean z, Format format, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Format.Min : format, (i & 4) != 0 ? false : z2);
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion;", "", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "resultCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "rememberLauncher", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;LEt0;I)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "", "DEVELOPER_ERROR", "I", "INTERNAL_ERROR", "NETWORK_ERROR", "", "PRODUCT_USAGE_TOKEN", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nGooglePayPaymentMethodLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayPaymentMethodLauncher.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,425:1\n76#2:426\n76#2:427\n36#3:428\n955#4,6:429\n89#5:435\n*S KotlinDebug\n*F\n+ 1 GooglePayPaymentMethodLauncher.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion\n*L\n404#1:426\n405#1:427\n411#1:428\n411#1:429,6\n402#1:435\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReadyCallback rememberLauncher$lambda$0(InterfaceC48627sP5<ReadyCallback> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue();
        }

        public final GooglePayPaymentMethodLauncher rememberLauncher(Config config, ReadyCallback readyCallback, ResultCallback resultCallback, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            interfaceC32720Et0.mo89638F(1407609479);
            final InterfaceC48627sP5 m105193n = GM5.m105193n(readyCallback, interfaceC32720Et0, (i >> 3) & 14);
            Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
            AbstractC53033zq2 m104689a = C33163Gq2.m104689a((LifecycleOwner) interfaceC32720Et0.mo89572c(C11411h.m68322i()));
            TH2 m110957a = C1362D5.m110957a(new GooglePayPaymentMethodLauncherContract(), new C18947x49c2996c(resultCallback), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-3686930);
            boolean mo89539n = interfaceC32720Et0.mo89539n(config);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new GooglePayPaymentMethodLauncher(context, m104689a, m110957a, config, new ReadyCallback() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Companion$rememberLauncher$1$1
                    @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback
                    public final void onReady(boolean z) {
                        GooglePayPaymentMethodLauncher.ReadyCallback rememberLauncher$lambda$0;
                        rememberLauncher$lambda$0 = GooglePayPaymentMethodLauncher.Companion.rememberLauncher$lambda$0(m105193n);
                        rememberLauncher$lambda$0.onReady(z);
                    }
                }, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher = (GooglePayPaymentMethodLauncher) mo89635G;
            interfaceC32720Et0.mo89605Q();
            return googlePayPaymentMethodLauncher;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)HÖ\u0001R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00064"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "merchantCountryCode", "", "merchantName", "isEmailRequired", "", "billingAddressConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "existingPaymentMethodRequired", "allowCreditCards", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;ZZ)V", "getAllowCreditCards", "()Z", "setAllowCreditCards", "(Z)V", "getBillingAddressConfig", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "setBillingAddressConfig", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;)V", "getEnvironment", "()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "getExistingPaymentMethodRequired", "setExistingPaymentMethodRequired", "setEmailRequired", "isJcbEnabled", "isJcbEnabled$payments_core_release", "getMerchantCountryCode", "()Ljava/lang/String;", "getMerchantName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Config implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        private boolean allowCreditCards;
        private BillingAddressConfig billingAddressConfig;
        private final GooglePayEnvironment environment;
        private boolean existingPaymentMethodRequired;
        private boolean isEmailRequired;
        private final String merchantCountryCode;
        private final String merchantName;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Config(GooglePayEnvironment.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, BillingAddressConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i) {
                return new Config[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName) {
            this(environment, merchantCountryCode, merchantName, false, null, false, false, 120, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        }

        public static /* synthetic */ Config copy$default(Config config, GooglePayEnvironment googlePayEnvironment, String str, String str2, boolean z, BillingAddressConfig billingAddressConfig, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                googlePayEnvironment = config.environment;
            }
            if ((i & 2) != 0) {
                str = config.merchantCountryCode;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = config.merchantName;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                z = config.isEmailRequired;
            }
            boolean z4 = z;
            if ((i & 16) != 0) {
                billingAddressConfig = config.billingAddressConfig;
            }
            BillingAddressConfig billingAddressConfig2 = billingAddressConfig;
            if ((i & 32) != 0) {
                z2 = config.existingPaymentMethodRequired;
            }
            boolean z5 = z2;
            if ((i & 64) != 0) {
                z3 = config.allowCreditCards;
            }
            return config.copy(googlePayEnvironment, str3, str4, z4, billingAddressConfig2, z5, z3);
        }

        public final GooglePayEnvironment component1() {
            return this.environment;
        }

        public final String component2() {
            return this.merchantCountryCode;
        }

        public final String component3() {
            return this.merchantName;
        }

        public final boolean component4() {
            return this.isEmailRequired;
        }

        public final BillingAddressConfig component5() {
            return this.billingAddressConfig;
        }

        public final boolean component6() {
            return this.existingPaymentMethodRequired;
        }

        public final boolean component7() {
            return this.allowCreditCards;
        }

        public final Config copy(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
            return new Config(environment, merchantCountryCode, merchantName, z, billingAddressConfig, z2, z3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Config) {
                Config config = (Config) obj;
                return this.environment == config.environment && Intrinsics.areEqual(this.merchantCountryCode, config.merchantCountryCode) && Intrinsics.areEqual(this.merchantName, config.merchantName) && this.isEmailRequired == config.isEmailRequired && Intrinsics.areEqual(this.billingAddressConfig, config.billingAddressConfig) && this.existingPaymentMethodRequired == config.existingPaymentMethodRequired && this.allowCreditCards == config.allowCreditCards;
            }
            return false;
        }

        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        public final BillingAddressConfig getBillingAddressConfig() {
            return this.billingAddressConfig;
        }

        public final GooglePayEnvironment getEnvironment() {
            return this.environment;
        }

        public final boolean getExistingPaymentMethodRequired() {
            return this.existingPaymentMethodRequired;
        }

        public final String getMerchantCountryCode() {
            return this.merchantCountryCode;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.environment.hashCode() * 31) + this.merchantCountryCode.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
            boolean z = this.isEmailRequired;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode2 = (((hashCode + i) * 31) + this.billingAddressConfig.hashCode()) * 31;
            boolean z2 = this.existingPaymentMethodRequired;
            int i2 = z2;
            if (z2 != 0) {
                i2 = 1;
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z3 = this.allowCreditCards;
            return i3 + (z3 ? 1 : z3 ? 1 : 0);
        }

        public final boolean isEmailRequired() {
            return this.isEmailRequired;
        }

        public final boolean isJcbEnabled$payments_core_release() {
            boolean equals;
            equals = StringsKt__StringsJVMKt.equals(this.merchantCountryCode, Locale.JAPAN.getCountry(), true);
            return equals;
        }

        public final void setAllowCreditCards(boolean z) {
            this.allowCreditCards = z;
        }

        public final void setBillingAddressConfig(BillingAddressConfig billingAddressConfig) {
            Intrinsics.checkNotNullParameter(billingAddressConfig, "<set-?>");
            this.billingAddressConfig = billingAddressConfig;
        }

        public final void setEmailRequired(boolean z) {
            this.isEmailRequired = z;
        }

        public final void setExistingPaymentMethodRequired(boolean z) {
            this.existingPaymentMethodRequired = z;
        }

        public String toString() {
            GooglePayEnvironment googlePayEnvironment = this.environment;
            String str = this.merchantCountryCode;
            String str2 = this.merchantName;
            boolean z = this.isEmailRequired;
            BillingAddressConfig billingAddressConfig = this.billingAddressConfig;
            boolean z2 = this.existingPaymentMethodRequired;
            boolean z3 = this.allowCreditCards;
            return "Config(environment=" + googlePayEnvironment + ", merchantCountryCode=" + str + ", merchantName=" + str2 + ", isEmailRequired=" + z + ", billingAddressConfig=" + billingAddressConfig + ", existingPaymentMethodRequired=" + z2 + ", allowCreditCards=" + z3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.environment.name());
            out.writeString(this.merchantCountryCode);
            out.writeString(this.merchantName);
            out.writeInt(this.isEmailRequired ? 1 : 0);
            this.billingAddressConfig.writeToParcel(out, i);
            out.writeInt(this.existingPaymentMethodRequired ? 1 : 0);
            out.writeInt(this.allowCreditCards ? 1 : 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z) {
            this(environment, merchantCountryCode, merchantName, z, null, false, false, 112, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig) {
            this(environment, merchantCountryCode, merchantName, z, billingAddressConfig, false, false, 96, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig, boolean z2) {
            this(environment, merchantCountryCode, merchantName, z, billingAddressConfig, z2, false, 64, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
        }

        @JvmOverloads
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
            this.environment = environment;
            this.merchantCountryCode = merchantCountryCode;
            this.merchantName = merchantName;
            this.isEmailRequired = z;
            this.billingAddressConfig = billingAddressConfig;
            this.existingPaymentMethodRequired = z2;
            this.allowCreditCards = z3;
        }

        public /* synthetic */ Config(GooglePayEnvironment googlePayEnvironment, String str, String str2, boolean z, BillingAddressConfig billingAddressConfig, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(googlePayEnvironment, str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new BillingAddressConfig(false, null, false, 7, null) : billingAddressConfig, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? true : z3);
        }
    }

    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ErrorCode;", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes7.dex */
    public @interface ErrorCode {
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "", "onReady", "", "isReady", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface ReadyCallback {
        void onReady(boolean z);
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "Landroid/os/Parcelable;", "()V", "Canceled", "Completed", "Failed", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Result implements Parcelable {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Canceled extends Result {
            public static final int $stable = 0;
            public static final Canceled INSTANCE = new Canceled();
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Canceled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Canceled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i) {
                    return new Canceled[i];
                }
            }

            private Canceled() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeInt(1);
            }
        }

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Completed extends Result {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();
            private final PaymentMethod paymentMethod;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Completed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Completed(PaymentMethod.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed[] newArray(int i) {
                    return new Completed[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Completed(PaymentMethod paymentMethod) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            public static /* synthetic */ Completed copy$default(Completed completed, PaymentMethod paymentMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod = completed.paymentMethod;
                }
                return completed.copy(paymentMethod);
            }

            public final PaymentMethod component1() {
                return this.paymentMethod;
            }

            public final Completed copy(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                return new Completed(paymentMethod);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Completed) && Intrinsics.areEqual(this.paymentMethod, ((Completed) obj).paymentMethod);
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                PaymentMethod paymentMethod = this.paymentMethod;
                return "Completed(paymentMethod=" + paymentMethod + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                this.paymentMethod.writeToParcel(out, i);
            }
        }

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "error", "", "errorCode", "", "(Ljava/lang/Throwable;I)V", "getError", "()Ljava/lang/Throwable;", "getErrorCode", "()I", "component1", "component2", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Failed extends Result {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Failed> CREATOR = new Creator();
            private final Throwable error;
            private final int errorCode;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Failed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Failed((Throwable) parcel.readSerializable(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failed[] newArray(int i) {
                    return new Failed[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable error, @ErrorCode int i) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.errorCode = i;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    th = failed.error;
                }
                if ((i2 & 2) != 0) {
                    i = failed.errorCode;
                }
                return failed.copy(th, i);
            }

            public final Throwable component1() {
                return this.error;
            }

            public final int component2() {
                return this.errorCode;
            }

            public final Failed copy(Throwable error, @ErrorCode int i) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Failed(error, i);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    return Intrinsics.areEqual(this.error, failed.error) && this.errorCode == failed.errorCode;
                }
                return false;
            }

            public final Throwable getError() {
                return this.error;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + Integer.hashCode(this.errorCode);
            }

            public String toString() {
                Throwable th = this.error;
                int i = this.errorCode;
                return "Failed(error=" + th + ", errorCode=" + i + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeSerializable(this.error);
                out.writeInt(this.errorCode);
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "", "onResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface ResultCallback {
        void onResult(Result result);
    }

    public /* synthetic */ GooglePayPaymentMethodLauncher(Context context, ZC0 zc0, AbstractC0407B5 abstractC0407B5, Config config, ReadyCallback readyCallback, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, zc0, abstractC0407B5, config, readyCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ResultCallback resultCallback, Result it) {
        Intrinsics.checkNotNullParameter(resultCallback, "$resultCallback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        resultCallback.onResult(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ResultCallback resultCallback, Result it) {
        Intrinsics.checkNotNullParameter(resultCallback, "$resultCallback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        resultCallback.onResult(it);
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    public static /* synthetic */ void present$default(GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        googlePayPaymentMethodLauncher.present(str, i, str2);
    }

    @JvmOverloads
    public final void present(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        present$default(this, currencyCode, 0, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.stripe.android.core.injection.Injector, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$injector$1] */
    public GooglePayPaymentMethodLauncher(ZC0 lifecycleScope, Config config, ReadyCallback readyCallback, AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher, boolean z, Context context, Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, Set<String> productUsage, Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider, boolean z2, @IOContext CoroutineContext ioContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(ioContext, "ioContext");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.config = config;
        this.readyCallback = readyCallback;
        this.activityResultLauncher = activityResultLauncher;
        this.skipReadyCheck = z;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.productUsage = productUsage;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.enableLogging = z2;
        this.ioContext = ioContext;
        this.launcherComponent = DaggerGooglePayPaymentMethodLauncherComponent.builder().context(context).ioContext(ioContext).analyticsRequestFactory(paymentAnalyticsRequestFactory).stripeRepository(stripeRepository).googlePayConfig(config).enableLogging(z2).publishableKeyProvider(publishableKeyProvider).stripeAccountIdProvider(stripeAccountIdProvider).build();
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String simpleName = Reflection.getOrCreateKotlinClass(GooglePayPaymentMethodLauncher.class).getSimpleName();
        if (simpleName != null) {
            String nextKey = weakMapInjectorRegistry.nextKey(simpleName);
            this.injectorKey = nextKey;
            ?? r3 = new Injector() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$injector$1
                @Override // com.stripe.android.core.injection.Injector
                public void inject(Injectable<?> injectable) {
                    GooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent;
                    Intrinsics.checkNotNullParameter(injectable, "injectable");
                    if (injectable instanceof GooglePayPaymentMethodLauncherViewModel.Factory) {
                        googlePayPaymentMethodLauncherComponent = GooglePayPaymentMethodLauncher.this.launcherComponent;
                        googlePayPaymentMethodLauncherComponent.inject((GooglePayPaymentMethodLauncherViewModel.Factory) injectable);
                        return;
                    }
                    throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
                }
            };
            this.injector = r3;
            weakMapInjectorRegistry.register(r3, nextKey);
            analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.GooglePayPaymentMethodLauncherInit, null, null, null, null, 30, null));
            if (z) {
                return;
            }
            Z30.m73800d(lifecycleScope, null, null, new C189466(null), 3, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @JvmOverloads
    public final void present(String currencyCode, int i) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        present$default(this, currencyCode, i, null, 4, null);
    }

    @JvmOverloads
    public final void present(String currencyCode, int i, String str) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        if (this.skipReadyCheck || this.isReady) {
            this.activityResultLauncher.m114705a(new GooglePayPaymentMethodLauncherContract.Args(this.config, currencyCode, i, str, new GooglePayPaymentMethodLauncherContract.Args.InjectionParams(this.injectorKey, this.productUsage, this.enableLogging, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke())));
            return;
        }
        throw new IllegalStateException("present() may only be called when Google Pay is available on this device.".toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GooglePayPaymentMethodLauncher(ZC0 zc0, Config config, ReadyCallback readyCallback, AbstractC0407B5 abstractC0407B5, boolean z, Context context, Function1 function1, Set set, Function0 function0, Function0 function02, boolean z2, CoroutineContext coroutineContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zc0, config, readyCallback, abstractC0407B5, z, context, function1, set, function0, function02, r22, r18, r19, r20, r15);
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        boolean z3;
        StripeApiRepository stripeApiRepository;
        Set of;
        Set of2;
        boolean z4 = (i & 1024) != 0 ? false : z2;
        SC0 m84377b = (i & 2048) != 0 ? T41.m84377b() : coroutineContext;
        if ((i & 4096) != 0) {
            String publishableKey = PaymentConfiguration.Companion.getInstance(context).getPublishableKey();
            of2 = SetsKt__SetsJVMKt.setOf(PRODUCT_USAGE_TOKEN);
            paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(context, publishableKey, of2);
        } else {
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
        }
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = (i & 8192) != 0 ? new DefaultAnalyticsRequestExecutor() : analyticsRequestExecutor;
        if ((i & 16384) != 0) {
            Logger companion = Logger.Companion.getInstance(z4);
            of = SetsKt__SetsJVMKt.setOf(PRODUCT_USAGE_TOKEN);
            z3 = z4;
            stripeApiRepository = new StripeApiRepository(context, function0, null, companion, m84377b, of, null, null, null, null, paymentAnalyticsRequestFactory2, null, null, null, null, 31684, null);
        } else {
            z3 = z4;
            stripeApiRepository = stripeRepository;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GooglePayPaymentMethodLauncher(ComponentActivity activity, Config config, ReadyCallback readyCallback, final ResultCallback resultCallback) {
        this(activity, r3, r4, config, readyCallback);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        AbstractC53033zq2 m104689a = C33163Gq2.m104689a(activity);
        AbstractC0407B5 registerForActivityResult = activity.registerForActivityResult(new GooglePayPaymentMethodLauncherContract(), new InterfaceC28515t5() { // from class: uD1
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                GooglePayPaymentMethodLauncher._init_$lambda$0(GooglePayPaymentMethodLauncher.ResultCallback.this, (GooglePayPaymentMethodLauncher.Result) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…ck.onResult(it)\n        }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GooglePayPaymentMethodLauncher(Fragment fragment, Config config, ReadyCallback readyCallback, final ResultCallback resultCallback) {
        this(r2, r3, r4, config, readyCallback);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        Context requireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "fragment.requireContext()");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        AbstractC53033zq2 m104689a = C33163Gq2.m104689a(viewLifecycleOwner);
        AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new GooglePayPaymentMethodLauncherContract(), new InterfaceC28515t5() { // from class: vD1
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                GooglePayPaymentMethodLauncher._init_$lambda$1(GooglePayPaymentMethodLauncher.ResultCallback.this, (GooglePayPaymentMethodLauncher.Result) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…ck.onResult(it)\n        }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private GooglePayPaymentMethodLauncher(Context context, ZC0 zc0, AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> abstractC0407B5, Config config, ReadyCallback readyCallback) {
        this(zc0, config, readyCallback, abstractC0407B5, false, context, r8, r8, new C189444(context), new C189455(context), false, null, null, null, null, 31744, null);
        Set of;
        C189433 c189433 = new C189433(context, config);
        of = SetsKt__SetsJVMKt.setOf(PRODUCT_USAGE_TOKEN);
    }
}
