package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.PaymentController;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.utils.CreationExtrasKtxKt;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 N2\u00020\u0001:\u0002NOBG\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bL\u0010MJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\bJ#\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!J#\u0010&\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0081@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010B\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u00020\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010K\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "LOr6;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "updateResult", "", "isReadyToPay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "args", "Lorg/json/JSONObject;", "createPaymentDataRequest", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "", "currencyCode", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "createTransactionInfo$payments_core_release", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "createTransactionInfo", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "createLoadPaymentDataTask", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "params", "confirmStripeIntent", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requestCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onConfirmResult", "getResultFromConfirmation$payments_core_release", "(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultFromConfirmation", "LEP3;", "paymentsClient", "LEP3;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/PaymentController;", "paymentController", "Lcom/stripe/android/PaymentController;", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "googlePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "LuX2;", "_googleResult", "LuX2;", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "googlePayResult", "Landroidx/lifecycle/LiveData;", "getGooglePayResult$payments_core_release", "()Landroidx/lifecycle/LiveData;", "value", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "hasLaunched", "<init>", "(LEP3;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/p;)V", "Companion", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGooglePayLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel\n+ 2 Transformations.kt\nandroidx/lifecycle/TransformationsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n92#2:294\n1#3:295\n*S KotlinDebug\n*F\n+ 1 GooglePayLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel\n*L\n62#1:294\n*E\n"})
/* loaded from: classes7.dex */
public final class GooglePayLauncherViewModel extends AbstractC35048Or6 {
    public static final Companion Companion = new Companion(null);
    public static final String HAS_LAUNCHED_KEY = "has_launched";
    private final C49882uX2<GooglePayLauncher.Result> _googleResult;
    private final GooglePayLauncherContract.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final GooglePayRepository googlePayRepository;
    private final LiveData<GooglePayLauncher.Result> googlePayResult;
    private final PaymentController paymentController;
    private final EP3 paymentsClient;
    private final ApiRequest.Options requestOptions;
    private final C11747p savedStateHandle;
    private final StripeRepository stripeRepository;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;", "", "()V", "HAS_LAUNCHED_KEY", "", "getHAS_LAUNCHED_KEY$annotations", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getHAS_LAUNCHED_KEY$annotations() {
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "", NamedConstantsKt.ENABLE_LOGGING, "Z", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final GooglePayLauncherContract.Args args;
        private final boolean enableLogging;
        private final CoroutineContext workContext;

        public Factory(GooglePayLauncherContract.Args args, boolean z, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.args = args;
            this.enableLogging = z;
            this.workContext = workContext;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Set of;
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            GooglePayEnvironment environment = this.args.getConfig$payments_core_release().getEnvironment();
            Logger companion = Logger.Companion.getInstance(this.enableLogging);
            PaymentConfiguration companion2 = PaymentConfiguration.Companion.getInstance(requireApplication);
            String publishableKey = companion2.getPublishableKey();
            String stripeAccountId = companion2.getStripeAccountId();
            of = SetsKt__SetsJVMKt.setOf(GooglePayLauncher.PRODUCT_USAGE);
            StripeApiRepository stripeApiRepository = new StripeApiRepository(requireApplication, new GooglePayLauncherViewModel$Factory$create$stripeRepository$1(publishableKey), null, companion, this.workContext, of, null, null, null, null, new PaymentAnalyticsRequestFactory(requireApplication, publishableKey, of), null, null, null, null, 31684, null);
            return new GooglePayLauncherViewModel(new PaymentsClientFactory(requireApplication).create(environment), new ApiRequest.Options(publishableKey, stripeAccountId, null, 4, null), this.args, stripeApiRepository, new StripePaymentController(requireApplication, new GooglePayLauncherViewModel$Factory$create$1(publishableKey), stripeApiRepository, this.enableLogging, this.workContext, null, null, null, null, 480, null), new GooglePayJsonFactory(new com.stripe.android.GooglePayConfig(publishableKey, stripeAccountId), this.args.getConfig$payments_core_release().isJcbEnabled$payments_core_release()), new DefaultGooglePayRepository(requireApplication, this.args.getConfig$payments_core_release().getEnvironment(), ConvertKt.convert(this.args.getConfig$payments_core_release().getBillingAddressConfig()), this.args.getConfig$payments_core_release().getExistingPaymentMethodRequired(), this.args.getConfig$payments_core_release().getAllowCreditCards(), companion), C11750q.m66936a(extras));
        }

        public /* synthetic */ Factory(GooglePayLauncherContract.Args args, boolean z, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(args, (i & 2) != 0 ? false : z, (i & 4) != 0 ? T41.m84377b() : coroutineContext);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GooglePayLauncher.BillingAddressConfig.Format.values().length];
            try {
                iArr[GooglePayLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GooglePayLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GooglePayLauncherViewModel(EP3 paymentsClient, ApiRequest.Options requestOptions, GooglePayLauncherContract.Args args, StripeRepository stripeRepository, PaymentController paymentController, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, C11747p savedStateHandle) {
        Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(googlePayJsonFactory, "googlePayJsonFactory");
        Intrinsics.checkNotNullParameter(googlePayRepository, "googlePayRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        this.savedStateHandle = savedStateHandle;
        C49882uX2<GooglePayLauncher.Result> c49882uX2 = new C49882uX2<>();
        this._googleResult = c49882uX2;
        LiveData<GooglePayLauncher.Result> m10730a = C49669u96.m10730a(c49882uX2);
        Intrinsics.checkNotNullExpressionValue(m10730a, "distinctUntilChanged(this)");
        this.googlePayResult = m10730a;
    }

    public final Object confirmStripeIntent(AuthActivityStarterHost authActivityStarterHost, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Unit> continuation) {
        ConfirmStripeIntentParams create$default;
        Object coroutine_suspended;
        GooglePayLauncherContract.Args args = this.args;
        if (args instanceof GooglePayLauncherContract.PaymentIntentArgs) {
            create$default = ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.Companion, paymentMethodCreateParams, args.getClientSecret$payments_core_release(), null, null, null, null, null, null, 252, null);
        } else if (args instanceof GooglePayLauncherContract.SetupIntentArgs) {
            create$default = ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, paymentMethodCreateParams, args.getClientSecret$payments_core_release(), (MandateDataParams) null, (String) null, 12, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object startConfirmAndAuth = this.paymentController.startConfirmAndAuth(authActivityStarterHost, create$default, this.requestOptions, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (startConfirmAndAuth == coroutine_suspended) {
            return startConfirmAndAuth;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLoadPaymentDataTask(Continuation<? super Task<PaymentData>> continuation) {
        GooglePayLauncherViewModel$createLoadPaymentDataTask$1 googlePayLauncherViewModel$createLoadPaymentDataTask$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        GooglePayLauncherViewModel googlePayLauncherViewModel;
        EP3 ep3;
        if (continuation instanceof GooglePayLauncherViewModel$createLoadPaymentDataTask$1) {
            googlePayLauncherViewModel$createLoadPaymentDataTask$1 = (GooglePayLauncherViewModel$createLoadPaymentDataTask$1) continuation;
            int i2 = googlePayLauncherViewModel$createLoadPaymentDataTask$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel$createLoadPaymentDataTask$1.label = i2 - Integer.MIN_VALUE;
                obj = googlePayLauncherViewModel$createLoadPaymentDataTask$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = googlePayLauncherViewModel$createLoadPaymentDataTask$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ep3 = (EP3) googlePayLauncherViewModel$createLoadPaymentDataTask$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            Task<PaymentData> m109034j = ep3.m109034j(PaymentDataRequest.m50523s(((JSONObject) obj).toString()));
                            Intrinsics.checkNotNullExpressionValue(m109034j, "paymentsClient.loadPayme…)\n            )\n        )");
                            return m109034j;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel$createLoadPaymentDataTask$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    googlePayLauncherViewModel$createLoadPaymentDataTask$1.L$0 = this;
                    googlePayLauncherViewModel$createLoadPaymentDataTask$1.label = 1;
                    obj = isReadyToPay(googlePayLauncherViewModel$createLoadPaymentDataTask$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    googlePayLauncherViewModel = this;
                }
                if (!((Boolean) obj).booleanValue()) {
                    EP3 ep32 = googlePayLauncherViewModel.paymentsClient;
                    GooglePayLauncherContract.Args args = googlePayLauncherViewModel.args;
                    googlePayLauncherViewModel$createLoadPaymentDataTask$1.L$0 = ep32;
                    googlePayLauncherViewModel$createLoadPaymentDataTask$1.label = 2;
                    Object createPaymentDataRequest = googlePayLauncherViewModel.createPaymentDataRequest(args, googlePayLauncherViewModel$createLoadPaymentDataTask$1);
                    if (createPaymentDataRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ep3 = ep32;
                    obj = createPaymentDataRequest;
                    Task<PaymentData> m109034j2 = ep3.m109034j(PaymentDataRequest.m50523s(((JSONObject) obj).toString()));
                    Intrinsics.checkNotNullExpressionValue(m109034j2, "paymentsClient.loadPayme…)\n            )\n        )");
                    return m109034j2;
                }
                throw new IllegalStateException("Google Pay is unavailable.".toString());
            }
        }
        googlePayLauncherViewModel$createLoadPaymentDataTask$1 = new GooglePayLauncherViewModel$createLoadPaymentDataTask$1(this, continuation);
        obj = googlePayLauncherViewModel$createLoadPaymentDataTask$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = googlePayLauncherViewModel$createLoadPaymentDataTask$1.label;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentDataRequest(GooglePayLauncherContract.Args args, Continuation<? super JSONObject> continuation) {
        GooglePayLauncherViewModel$createPaymentDataRequest$1 googlePayLauncherViewModel$createPaymentDataRequest$1;
        Object coroutine_suspended;
        int i;
        GooglePayLauncherViewModel googlePayLauncherViewModel;
        GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release;
        int i2;
        GooglePayJsonFactory.BillingAddressParameters.Format format;
        GooglePayLauncherContract.Args args2 = args;
        if (continuation instanceof GooglePayLauncherViewModel$createPaymentDataRequest$1) {
            googlePayLauncherViewModel$createPaymentDataRequest$1 = (GooglePayLauncherViewModel$createPaymentDataRequest$1) continuation;
            int i3 = googlePayLauncherViewModel$createPaymentDataRequest$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel$createPaymentDataRequest$1.label = i3 - Integer.MIN_VALUE;
                GooglePayLauncherViewModel$createPaymentDataRequest$1 googlePayLauncherViewModel$createPaymentDataRequest$12 = googlePayLauncherViewModel$createPaymentDataRequest$1;
                Object obj = googlePayLauncherViewModel$createPaymentDataRequest$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = googlePayLauncherViewModel$createPaymentDataRequest$12.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            args2 = (GooglePayLauncherContract.Args) googlePayLauncherViewModel$createPaymentDataRequest$12.L$1;
                            googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel$createPaymentDataRequest$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                                createTransactionInfo$payments_core_release = googlePayLauncherViewModel.createTransactionInfo$payments_core_release((SetupIntent) obj, ((GooglePayLauncherContract.SetupIntentArgs) args2).getCurrencyCode$payments_core_release());
                            } else {
                                throw new IllegalArgumentException("Could not retrieve SetupIntent.".toString());
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        args2 = (GooglePayLauncherContract.Args) googlePayLauncherViewModel$createPaymentDataRequest$12.L$1;
                        googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel$createPaymentDataRequest$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (obj == null) {
                            PaymentIntent paymentIntent = (PaymentIntent) obj;
                            String currency = paymentIntent.getCurrency();
                            if (currency == null) {
                                currency = "";
                            }
                            createTransactionInfo$payments_core_release = googlePayLauncherViewModel.createTransactionInfo$payments_core_release(paymentIntent, currency);
                        } else {
                            throw new IllegalArgumentException("Could not retrieve PaymentIntent.".toString());
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (args2 instanceof GooglePayLauncherContract.PaymentIntentArgs) {
                        StripeRepository stripeRepository = this.stripeRepository;
                        String clientSecret$payments_core_release = args.getClientSecret$payments_core_release();
                        ApiRequest.Options options = this.requestOptions;
                        googlePayLauncherViewModel$createPaymentDataRequest$12.L$0 = this;
                        googlePayLauncherViewModel$createPaymentDataRequest$12.L$1 = args2;
                        googlePayLauncherViewModel$createPaymentDataRequest$12.label = 1;
                        obj = StripeRepository.retrievePaymentIntent$default(stripeRepository, clientSecret$payments_core_release, options, null, googlePayLauncherViewModel$createPaymentDataRequest$12, 4, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        googlePayLauncherViewModel = this;
                        if (obj == null) {
                        }
                    } else if (args2 instanceof GooglePayLauncherContract.SetupIntentArgs) {
                        StripeRepository stripeRepository2 = this.stripeRepository;
                        String clientSecret$payments_core_release2 = args.getClientSecret$payments_core_release();
                        ApiRequest.Options options2 = this.requestOptions;
                        googlePayLauncherViewModel$createPaymentDataRequest$12.L$0 = this;
                        googlePayLauncherViewModel$createPaymentDataRequest$12.L$1 = args2;
                        googlePayLauncherViewModel$createPaymentDataRequest$12.label = 2;
                        obj = StripeRepository.retrieveSetupIntent$default(stripeRepository2, clientSecret$payments_core_release2, options2, null, googlePayLauncherViewModel$createPaymentDataRequest$12, 4, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        googlePayLauncherViewModel = this;
                        if (obj == null) {
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                GooglePayLauncherViewModel googlePayLauncherViewModel2 = googlePayLauncherViewModel;
                GooglePayJsonFactory.TransactionInfo transactionInfo = createTransactionInfo$payments_core_release;
                GooglePayJsonFactory googlePayJsonFactory = googlePayLauncherViewModel2.googlePayJsonFactory;
                GooglePayJsonFactory.MerchantInfo merchantInfo = new GooglePayJsonFactory.MerchantInfo(args2.getConfig$payments_core_release().getMerchantName());
                boolean isRequired$payments_core_release = args2.getConfig$payments_core_release().getBillingAddressConfig().isRequired$payments_core_release();
                i2 = WhenMappings.$EnumSwitchMapping$0[args2.getConfig$payments_core_release().getBillingAddressConfig().getFormat$payments_core_release().ordinal()];
                if (i2 == 1) {
                    if (i2 == 2) {
                        format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
                }
                return GooglePayJsonFactory.createPaymentDataRequest$default(googlePayJsonFactory, transactionInfo, new GooglePayJsonFactory.BillingAddressParameters(isRequired$payments_core_release, format, args2.getConfig$payments_core_release().getBillingAddressConfig().isPhoneNumberRequired$payments_core_release()), null, args2.getConfig$payments_core_release().isEmailRequired(), merchantInfo, Boxing.boxBoolean(args2.getConfig$payments_core_release().getAllowCreditCards()), 4, null);
            }
        }
        googlePayLauncherViewModel$createPaymentDataRequest$1 = new GooglePayLauncherViewModel$createPaymentDataRequest$1(this, continuation);
        GooglePayLauncherViewModel$createPaymentDataRequest$1 googlePayLauncherViewModel$createPaymentDataRequest$122 = googlePayLauncherViewModel$createPaymentDataRequest$1;
        Object obj2 = googlePayLauncherViewModel$createPaymentDataRequest$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = googlePayLauncherViewModel$createPaymentDataRequest$122.label;
        if (i == 0) {
        }
        GooglePayLauncherViewModel googlePayLauncherViewModel22 = googlePayLauncherViewModel;
        GooglePayJsonFactory.TransactionInfo transactionInfo2 = createTransactionInfo$payments_core_release;
        GooglePayJsonFactory googlePayJsonFactory2 = googlePayLauncherViewModel22.googlePayJsonFactory;
        GooglePayJsonFactory.MerchantInfo merchantInfo2 = new GooglePayJsonFactory.MerchantInfo(args2.getConfig$payments_core_release().getMerchantName());
        boolean isRequired$payments_core_release2 = args2.getConfig$payments_core_release().getBillingAddressConfig().isRequired$payments_core_release();
        i2 = WhenMappings.$EnumSwitchMapping$0[args2.getConfig$payments_core_release().getBillingAddressConfig().getFormat$payments_core_release().ordinal()];
        if (i2 == 1) {
        }
        return GooglePayJsonFactory.createPaymentDataRequest$default(googlePayJsonFactory2, transactionInfo2, new GooglePayJsonFactory.BillingAddressParameters(isRequired$payments_core_release2, format, args2.getConfig$payments_core_release().getBillingAddressConfig().isPhoneNumberRequired$payments_core_release()), null, args2.getConfig$payments_core_release().isEmailRequired(), merchantInfo2, Boxing.boxBoolean(args2.getConfig$payments_core_release().getAllowCreditCards()), 4, null);
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(StripeIntent stripeIntent, String currencyCode) {
        Integer num;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        if (stripeIntent instanceof PaymentIntent) {
            GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus = GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final;
            String merchantCountryCode = this.args.getConfig$payments_core_release().getMerchantCountryCode();
            String id = stripeIntent.getId();
            Long amount = ((PaymentIntent) stripeIntent).getAmount();
            if (amount != null) {
                num = Integer.valueOf((int) amount.longValue());
            } else {
                num = null;
            }
            return new GooglePayJsonFactory.TransactionInfo(currencyCode, totalPriceStatus, merchantCountryCode, id, num, null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase, 32, null);
        } else if (stripeIntent instanceof SetupIntent) {
            return new GooglePayJsonFactory.TransactionInfo(currencyCode, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, this.args.getConfig$payments_core_release().getMerchantCountryCode(), stripeIntent.getId(), 0, null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default, 32, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final LiveData<GooglePayLauncher.Result> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final boolean getHasLaunched() {
        return Intrinsics.areEqual(this.savedStateHandle.m66947f("has_launched"), Boolean.TRUE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(2:11|12)(2:20|21))(2:22|23))(3:24|25|(3:27|(1:29)|23)(2:30|(3:32|(1:34)|12)(2:35|36)))|13|14|(1:19)(2:16|17)))|39|6|7|(0)(0)|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        r7 = kotlin.Result.Companion;
        r6 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getResultFromConfirmation$payments_core_release(int i, Intent intent, Continuation<? super GooglePayLauncher.Result> continuation) {
        GooglePayLauncherViewModel$getResultFromConfirmation$1 googlePayLauncherViewModel$getResultFromConfirmation$1;
        Object coroutine_suspended;
        int i2;
        Throwable m116786exceptionOrNullimpl;
        GooglePayLauncher.Result.Completed completed;
        if (continuation instanceof GooglePayLauncherViewModel$getResultFromConfirmation$1) {
            googlePayLauncherViewModel$getResultFromConfirmation$1 = (GooglePayLauncherViewModel$getResultFromConfirmation$1) continuation;
            int i3 = googlePayLauncherViewModel$getResultFromConfirmation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel$getResultFromConfirmation$1.label = i3 - Integer.MIN_VALUE;
                Object obj = googlePayLauncherViewModel$getResultFromConfirmation$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = googlePayLauncherViewModel$getResultFromConfirmation$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            completed = GooglePayLauncher.Result.Completed.INSTANCE;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        completed = GooglePayLauncher.Result.Completed.INSTANCE;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    if (this.paymentController.shouldHandlePaymentResult(i, intent)) {
                        PaymentController paymentController = this.paymentController;
                        googlePayLauncherViewModel$getResultFromConfirmation$1.label = 1;
                        if (paymentController.getPaymentIntentResult(intent, googlePayLauncherViewModel$getResultFromConfirmation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        completed = GooglePayLauncher.Result.Completed.INSTANCE;
                    } else if (this.paymentController.shouldHandleSetupResult(i, intent)) {
                        PaymentController paymentController2 = this.paymentController;
                        googlePayLauncherViewModel$getResultFromConfirmation$1.label = 2;
                        if (paymentController2.getSetupIntentResult(intent, googlePayLauncherViewModel$getResultFromConfirmation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        completed = GooglePayLauncher.Result.Completed.INSTANCE;
                    } else {
                        throw new IllegalStateException("Unexpected confirmation result.");
                    }
                }
                Object m116783constructorimpl = Result.m116783constructorimpl(completed);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl == null) {
                    return new GooglePayLauncher.Result.Failed(m116786exceptionOrNullimpl);
                }
                return m116783constructorimpl;
            }
        }
        googlePayLauncherViewModel$getResultFromConfirmation$1 = new GooglePayLauncherViewModel$getResultFromConfirmation$1(this, continuation);
        Object obj2 = googlePayLauncherViewModel$getResultFromConfirmation$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = googlePayLauncherViewModel$getResultFromConfirmation$1.label;
        if (i2 == 0) {
        }
        Object m116783constructorimpl2 = Result.m116783constructorimpl(completed);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl == null) {
        }
    }

    public final Object isReadyToPay(Continuation<? super Boolean> continuation) {
        return C36708Vu1.m79248w(this.googlePayRepository.isReady(), continuation);
    }

    public final void onConfirmResult(int i, Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new GooglePayLauncherViewModel$onConfirmResult$1(this, i, data, null), 3, null);
    }

    public final void setHasLaunched(boolean z) {
        this.savedStateHandle.m66940m("has_launched", Boolean.valueOf(z));
    }

    public final void updateResult(GooglePayLauncher.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this._googleResult.setValue(result);
    }
}
