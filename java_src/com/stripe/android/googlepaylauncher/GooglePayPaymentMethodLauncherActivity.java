package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.LiveData;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.utils.AnimationConstants;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0015\u0010\u0010\u001a\u00070\u0011¢\u0006\u0002\b\u00122\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0016\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\"\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010!\u001a\u00020\fH\u0002J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "finish", "", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "googlePayStatusCodeToErrorCode", "", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ErrorCode;", "googlePayStatusCode", "launchGooglePay", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "onActivityResult", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGooglePayResult", "setFadeAnimations", "updateResult", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayPaymentMethodLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayPaymentMethodLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n75#2,13:192\n1#3:205\n*S KotlinDebug\n*F\n+ 1 GooglePayPaymentMethodLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity\n*L\n32#1:192,13\n*E\n"})
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherActivity extends AppCompatActivity {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    private GooglePayPaymentMethodLauncherContract.Args args;
    private final Lazy viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(GooglePayPaymentMethodLauncherViewModel.class), new C18949xa722466f(this), new GooglePayPaymentMethodLauncherActivity$viewModel$2(this), new C18950xa7224670(null, this));

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity$Companion;", "", "()V", "LOAD_PAYMENT_DATA_REQUEST_CODE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(GooglePayPaymentMethodLauncher.Result result) {
        setResult(-1, new Intent().putExtras(C39564d70.m44603a(TuplesKt.m28425to("extra_result", result))));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayPaymentMethodLauncherViewModel getViewModel() {
        return (GooglePayPaymentMethodLauncherViewModel) this.viewModel$delegate.getValue();
    }

    private final int googlePayStatusCodeToErrorCode(int i) {
        if (i != 7) {
            return i != 10 ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchGooglePay(Task<PaymentData> task) {
        C12186at.m65335c(task, this, LOAD_PAYMENT_DATA_REQUEST_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void onGooglePayResult(Intent intent) {
        PaymentData m50525s;
        InterfaceC52943zh2 m73800d;
        if (intent != null && (m50525s = PaymentData.m50525s(intent)) != null) {
            m73800d = Z30.m73800d(C33163Gq2.m104689a(this), null, null, new GooglePayPaymentMethodLauncherActivity$onGooglePayResult$2$1(this, m50525s, null), 3, null);
            if (m73800d != null) {
                return;
            }
        }
        updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(new IllegalArgumentException("Google Pay data was not available"), 1));
        Unit unit = Unit.INSTANCE;
    }

    private final void setFadeAnimations() {
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        overridePendingTransition(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateResult(GooglePayPaymentMethodLauncher.Result result) {
        getViewModel().updateResult(result);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        setFadeAnimations();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == LOAD_PAYMENT_DATA_REQUEST_CODE) {
            if (i2 != -1) {
                if (i2 != 0) {
                    int i3 = 1;
                    if (i2 != 1) {
                        updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException("Google Pay returned an expected result code."), 1));
                        return;
                    }
                    Status m65337a = C12186at.m65337a(intent);
                    Integer num = null;
                    if (m65337a != null) {
                        str = m65337a.getStatusMessage();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (m65337a != null) {
                        num = Integer.valueOf(m65337a.getStatusCode());
                    }
                    RuntimeException runtimeException = new RuntimeException("Google Pay failed with error " + num + ": " + str);
                    if (m65337a != null) {
                        i3 = googlePayStatusCodeToErrorCode(m65337a.getStatusCode());
                    }
                    updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(runtimeException, i3));
                    return;
                }
                updateResult(GooglePayPaymentMethodLauncher.Result.Canceled.INSTANCE);
                return;
            }
            onGooglePayResult(intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("extra_status_bar_color", -1);
        if (intExtra != -1) {
            getWindow().setStatusBarColor(intExtra);
        }
        setFadeAnimations();
        GooglePayPaymentMethodLauncherContract.Args.Companion companion = GooglePayPaymentMethodLauncherContract.Args.Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        GooglePayPaymentMethodLauncherContract.Args fromIntent = companion.fromIntent(intent);
        if (fromIntent == null) {
            finishWithResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.args = fromIntent;
        LiveData<GooglePayPaymentMethodLauncher.Result> googlePayResult$payments_core_release = getViewModel().getGooglePayResult$payments_core_release();
        final GooglePayPaymentMethodLauncherActivity$onCreate$1 googlePayPaymentMethodLauncherActivity$onCreate$1 = new GooglePayPaymentMethodLauncherActivity$onCreate$1(this);
        googlePayResult$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: wD1
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                GooglePayPaymentMethodLauncherActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
        if (!getViewModel().getHasLaunched$payments_core_release()) {
            Z30.m73800d(C33163Gq2.m104689a(this), null, null, new GooglePayPaymentMethodLauncherActivity$onCreate$2(this, null), 3, null);
        }
    }
}
