package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.StripeGooglePayContract;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001:BC\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00102\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00040\u00040\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;", "Lie;", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "createIsReadyToPayRequest", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "updateGooglePayResult", "Lorg/json/JSONObject;", "createPaymentDataRequestForPaymentIntentArgs", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "params", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "", "publishableKey", "Ljava/lang/String;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "args", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", com.stripe.android.payments.core.injection.NamedConstantsKt.APP_NAME, "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "", "hasLaunched", "Z", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "setPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "LuX2;", "_googleResult", "LuX2;", "kotlin.jvm.PlatformType", "googlePayResult", "Landroidx/lifecycle/LiveData;", "getGooglePayResult$payments_core_release", "()Landroidx/lifecycle/LiveData;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripeGooglePayViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeGooglePayViewModel.kt\ncom/stripe/android/googlepaylauncher/StripeGooglePayViewModel\n+ 2 Transformations.kt\nandroidx/lifecycle/TransformationsKt\n*L\n1#1,113:1\n92#2:114\n*S KotlinDebug\n*F\n+ 1 StripeGooglePayViewModel.kt\ncom/stripe/android/googlepaylauncher/StripeGooglePayViewModel\n*L\n37#1:114\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeGooglePayViewModel extends C23294ie {
    private final C49882uX2<GooglePayLauncherResult> _googleResult;
    private final String appName;
    private final StripeGooglePayContract.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final LiveData<GooglePayLauncherResult> googlePayResult;
    private boolean hasLaunched;
    private PaymentMethod paymentMethod;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "", "publishableKey", "Ljava/lang/String;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "args", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final Application application;
        private final StripeGooglePayContract.Args args;
        private final String publishableKey;
        private final String stripeAccountId;

        public Factory(Application application, String publishableKey, String str, StripeGooglePayContract.Args args) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(args, "args");
            this.application = application;
            this.publishableKey = publishableKey;
            this.stripeAccountId = str;
            this.args = args;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new StripeGooglePayViewModel(this.application, this.publishableKey, this.stripeAccountId, this.args, new StripeApiRepository(this.application, new StripeGooglePayViewModel$Factory$create$1(this), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), this.application.getApplicationInfo().loadLabel(this.application.getPackageManager()).toString(), T41.m84377b());
        }

        public /* synthetic */ Factory(Application application, String str, String str2, StripeGooglePayContract.Args args, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(application, str, (i & 4) != 0 ? null : str2, args);
        }
    }

    public /* synthetic */ StripeGooglePayViewModel(Application application, String str, String str2, StripeGooglePayContract.Args args, StripeRepository stripeRepository, String str3, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, (i & 4) != 0 ? null : str2, args, stripeRepository, str3, coroutineContext);
    }

    public final IsReadyToPayRequest createIsReadyToPayRequest() {
        IsReadyToPayRequest m50531s = IsReadyToPayRequest.m50531s(GooglePayJsonFactory.createIsReadyToPayRequest$default(this.googlePayJsonFactory, null, null, null, 7, null).toString());
        Intrinsics.checkNotNullExpressionValue(m50531s, "fromJson(\n            go…st().toString()\n        )");
        return m50531s;
    }

    public final JSONObject createPaymentDataRequestForPaymentIntentArgs() {
        GooglePayJsonFactory googlePayJsonFactory = this.googlePayJsonFactory;
        GooglePayJsonFactory.TransactionInfo transactionInfo = new GooglePayJsonFactory.TransactionInfo(this.args.getConfig().getCurrencyCode$payments_core_release(), GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final, this.args.getConfig().getCountryCode$payments_core_release(), this.args.getConfig().getTransactionId$payments_core_release(), this.args.getConfig().getAmount$payments_core_release(), null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase, 32, null);
        String merchantName$payments_core_release = this.args.getConfig().getMerchantName$payments_core_release();
        if (merchantName$payments_core_release == null) {
            merchantName$payments_core_release = this.appName;
        }
        return GooglePayJsonFactory.createPaymentDataRequest$default(googlePayJsonFactory, transactionInfo, new GooglePayJsonFactory.BillingAddressParameters(true, GooglePayJsonFactory.BillingAddressParameters.Format.Min, false), null, this.args.getConfig().isEmailRequired$payments_core_release(), new GooglePayJsonFactory.MerchantInfo(merchantName$payments_core_release), null, 36, null);
    }

    public final LiveData<Result<PaymentMethod>> createPaymentMethod(PaymentMethodCreateParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return WC0.m78736b(null, 0L, new StripeGooglePayViewModel$createPaymentMethod$1(this, params, null), 3, null);
    }

    public final LiveData<GooglePayLauncherResult> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final boolean getHasLaunched() {
        return this.hasLaunched;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final void setHasLaunched(boolean z) {
        this.hasLaunched = z;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public final void updateGooglePayResult(GooglePayLauncherResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this._googleResult.setValue(result);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel(Application application, String publishableKey, String str, StripeGooglePayContract.Args args, StripeRepository stripeRepository, String appName, CoroutineContext workContext) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.appName = appName;
        this.workContext = workContext;
        this.googlePayJsonFactory = new GooglePayJsonFactory((Context) application, false, 2, (DefaultConstructorMarker) null);
        C49882uX2<GooglePayLauncherResult> c49882uX2 = new C49882uX2<>();
        this._googleResult = c49882uX2;
        LiveData<GooglePayLauncherResult> m10730a = C49669u96.m10730a(c49882uX2);
        Intrinsics.checkNotNullExpressionValue(m10730a, "distinctUntilChanged(this)");
        this.googlePayResult = m10730a;
    }
}
