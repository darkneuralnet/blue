package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.LiveData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherResult;
import com.stripe.android.googlepaylauncher.StripeGooglePayActivity;
import com.stripe.android.googlepaylauncher.StripeGooglePayContract;
import com.stripe.android.model.GooglePayResult;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.utils.AnimationConstants;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\"\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001d\u0010(\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "setFadeAnimations", "Lorg/json/JSONObject;", "paymentDataRequest", "isReadyToPay", "payWithGoogle", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onGooglePayResult", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "onPaymentMethodCreated", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "finishWithResult", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "finish", "", "requestCode", "resultCode", "onActivityResult", "LEP3;", "paymentsClient$delegate", "Lkotlin/Lazy;", "getPaymentsClient", "()LEP3;", "paymentsClient", "", "publishableKey$delegate", "getPublishableKey", "()Ljava/lang/String;", "publishableKey", "stripeAccountId$delegate", "getStripeAccountId", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;", "viewModel", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "args", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "<init>", "()V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripeGooglePayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeGooglePayActivity.kt\ncom/stripe/android/googlepaylauncher/StripeGooglePayActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n75#2,13:232\n1#3:245\n*S KotlinDebug\n*F\n+ 1 StripeGooglePayActivity.kt\ncom/stripe/android/googlepaylauncher/StripeGooglePayActivity\n*L\n38#1:232,13\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeGooglePayActivity extends AppCompatActivity {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    private StripeGooglePayContract.Args args;
    private final Lazy paymentsClient$delegate;
    private final Lazy publishableKey$delegate;
    private final Lazy stripeAccountId$delegate;
    private final Lazy viewModel$delegate;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$Companion;", "", "()V", "LOAD_PAYMENT_DATA_REQUEST_CODE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StripeGooglePayActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new StripeGooglePayActivity$paymentsClient$2(this));
        this.paymentsClient$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new StripeGooglePayActivity$publishableKey$2(this));
        this.publishableKey$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new StripeGooglePayActivity$stripeAccountId$2(this));
        this.stripeAccountId$delegate = lazy3;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(StripeGooglePayViewModel.class), new StripeGooglePayActivity$special$$inlined$viewModels$default$2(this), new StripeGooglePayActivity$viewModel$2(this), new StripeGooglePayActivity$special$$inlined$viewModels$default$3(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(GooglePayLauncherResult googlePayLauncherResult) {
        setResult(-1, new Intent().putExtras(googlePayLauncherResult.toBundle()));
        finish();
    }

    private final EP3 getPaymentsClient() {
        return (EP3) this.paymentsClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPublishableKey() {
        return (String) this.publishableKey$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStripeAccountId() {
        return (String) this.stripeAccountId$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeGooglePayViewModel getViewModel() {
        return (StripeGooglePayViewModel) this.viewModel$delegate.getValue();
    }

    private final void isReadyToPay(final JSONObject jSONObject) {
        getPaymentsClient().m109035i(getViewModel().createIsReadyToPayRequest()).addOnCompleteListener(new OnCompleteListener() { // from class: yS5
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                StripeGooglePayActivity.isReadyToPay$lambda$4(StripeGooglePayActivity.this, jSONObject, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isReadyToPay$lambda$4(StripeGooglePayActivity this$0, JSONObject paymentDataRequest, Task task) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paymentDataRequest, "$paymentDataRequest");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Result.Companion companion = Result.Companion;
            if (task.isSuccessful()) {
                this$0.payWithGoogle(paymentDataRequest);
            } else {
                this$0.getViewModel().updateGooglePayResult(GooglePayLauncherResult.Unavailable.INSTANCE);
            }
            m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this$0.getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(m116786exceptionOrNullimpl, null, null, null, 14, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void onGooglePayResult(Intent intent) {
        PaymentData paymentData;
        if (intent != null) {
            paymentData = PaymentData.m50525s(intent);
        } else {
            paymentData = null;
        }
        if (paymentData == null) {
            getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(new IllegalArgumentException("Google Pay data was not available"), null, null, null, 14, null));
            return;
        }
        JSONObject jSONObject = new JSONObject(paymentData.m50524u());
        ShippingInformation shippingInformation = GooglePayResult.Companion.fromJson(jSONObject).getShippingInformation();
        LiveData<Result<PaymentMethod>> createPaymentMethod = getViewModel().createPaymentMethod(PaymentMethodCreateParams.Companion.createFromGooglePay(jSONObject));
        final StripeGooglePayActivity$onGooglePayResult$1 stripeGooglePayActivity$onGooglePayResult$1 = new StripeGooglePayActivity$onGooglePayResult$1(this, shippingInformation);
        createPaymentMethod.observe(this, new InterfaceC41056fe3() { // from class: zS5
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                StripeGooglePayActivity.onGooglePayResult$lambda$6(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGooglePayResult$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPaymentMethodCreated(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
        getViewModel().setPaymentMethod(paymentMethod);
        getViewModel().updateGooglePayResult(new GooglePayLauncherResult.PaymentData(paymentMethod, shippingInformation));
    }

    private final void payWithGoogle(JSONObject jSONObject) {
        C12186at.m65335c(getPaymentsClient().m109034j(PaymentDataRequest.m50523s(jSONObject.toString())), this, LOAD_PAYMENT_DATA_REQUEST_CODE);
    }

    private final void setFadeAnimations() {
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        overridePendingTransition(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        setFadeAnimations();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == LOAD_PAYMENT_DATA_REQUEST_CODE) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(new RuntimeException("Google Pay returned an expected result code."), null, null, null, 14, null));
                    } else {
                        getViewModel().updateGooglePayResult(new GooglePayLauncherResult.Error(new RuntimeException("Google Pay returned an error. See googlePayStatus property for more information."), C12186at.m65337a(intent), null, null, 12, null));
                    }
                } else {
                    getViewModel().updateGooglePayResult(GooglePayLauncherResult.Canceled.INSTANCE);
                }
            } else {
                onGooglePayResult(intent);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFadeAnimations();
        setResult(-1, new Intent().putExtras(GooglePayLauncherResult.Canceled.INSTANCE.toBundle()));
        StripeGooglePayContract.Args.Companion companion = StripeGooglePayContract.Args.Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        StripeGooglePayContract.Args create$payments_core_release = companion.create$payments_core_release(intent);
        if (create$payments_core_release == null) {
            finishWithResult(new GooglePayLauncherResult.Error(new RuntimeException("StripeGooglePayActivity was started without arguments."), null, null, null, 14, null));
            return;
        }
        this.args = create$payments_core_release;
        Integer statusBarColor = create$payments_core_release.getStatusBarColor();
        if (statusBarColor != null) {
            getWindow().setStatusBarColor(statusBarColor.intValue());
        }
        LiveData<GooglePayLauncherResult> googlePayResult$payments_core_release = getViewModel().getGooglePayResult$payments_core_release();
        final StripeGooglePayActivity$onCreate$2 stripeGooglePayActivity$onCreate$2 = new StripeGooglePayActivity$onCreate$2(this);
        googlePayResult$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: xS5
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                StripeGooglePayActivity.onCreate$lambda$1(Function1.this, obj);
            }
        });
        if (!getViewModel().getHasLaunched()) {
            getViewModel().setHasLaunched(true);
            isReadyToPay(getViewModel().createPaymentDataRequestForPaymentIntentArgs());
        }
    }
}
