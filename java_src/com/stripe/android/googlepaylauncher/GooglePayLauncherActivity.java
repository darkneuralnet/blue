package com.stripe.android.googlepaylauncher;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.LiveData;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.utils.AnimationConstants;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0015J\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0016\u0010\u001a\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\b\u0010\u001e\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "finish", "", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "onActivityResult", "requestCode", "", "resultCode", MessageExtension.FIELD_DATA, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGooglePayResult", "payWithGoogle", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "setFadeAnimations", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n75#2,13:189\n1#3:202\n*S KotlinDebug\n*F\n+ 1 GooglePayLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherActivity\n*L\n36#1:189,13\n*E\n"})
/* loaded from: classes7.dex */
public final class GooglePayLauncherActivity extends AppCompatActivity {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    private GooglePayLauncherContract.Args args;
    private final Lazy viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(GooglePayLauncherViewModel.class), new GooglePayLauncherActivity$special$$inlined$viewModels$default$2(this), new GooglePayLauncherActivity$viewModel$2(this), new GooglePayLauncherActivity$special$$inlined$viewModels$default$3(null, this));

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$Companion;", "", "()V", "LOAD_PAYMENT_DATA_REQUEST_CODE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(GooglePayLauncher.Result result) {
        setResult(-1, new Intent().putExtras(C39564d70.m44603a(TuplesKt.m28425to("extra_result", result))));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayLauncherViewModel getViewModel() {
        return (GooglePayLauncherViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(Function1 tmp0, Object obj) {
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
            getViewModel().updateResult(new GooglePayLauncher.Result.Failed(new IllegalArgumentException("Google Pay data was not available")));
            return;
        }
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new GooglePayLauncherActivity$onGooglePayResult$1(this, AuthActivityStarterHost.Companion.create$payments_core_release(this), PaymentMethodCreateParams.Companion.createFromGooglePay(new JSONObject(paymentData.m50524u())), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void payWithGoogle(Task<PaymentData> task) {
        C12186at.m65335c(task, this, LOAD_PAYMENT_DATA_REQUEST_CODE);
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
        String str = null;
        if (i == LOAD_PAYMENT_DATA_REQUEST_CODE) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        getViewModel().updateResult(new GooglePayLauncher.Result.Failed(new RuntimeException("Google Pay returned an expected result code.")));
                        return;
                    }
                    Status m65337a = C12186at.m65337a(intent);
                    if (m65337a != null) {
                        str = m65337a.getStatusMessage();
                    }
                    if (str == null) {
                        str = "";
                    }
                    GooglePayLauncherViewModel viewModel = getViewModel();
                    viewModel.updateResult(new GooglePayLauncher.Result.Failed(new RuntimeException("Google Pay failed with error: " + str)));
                    return;
                }
                getViewModel().updateResult(GooglePayLauncher.Result.Canceled.INSTANCE);
                return;
            }
            onGooglePayResult(intent);
            return;
        }
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new GooglePayLauncherActivity$onActivityResult$1(this, i, intent, null), 3, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(Bundle bundle) {
        Object m116783constructorimpl;
        GooglePayLauncherContract.Args fromIntent$payments_core_release;
        super.onCreate(bundle);
        setFadeAnimations();
        try {
            Result.Companion companion = Result.Companion;
            GooglePayLauncherContract.Args.Companion companion2 = GooglePayLauncherContract.Args.Companion;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            fromIntent$payments_core_release = companion2.fromIntent$payments_core_release(intent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (fromIntent$payments_core_release != null) {
            m116783constructorimpl = Result.m116783constructorimpl(fromIntent$payments_core_release);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                this.args = (GooglePayLauncherContract.Args) m116783constructorimpl;
                int intExtra = getIntent().getIntExtra("extra_status_bar_color", -1);
                if (intExtra != -1) {
                    getWindow().setStatusBarColor(intExtra);
                }
                LiveData<GooglePayLauncher.Result> googlePayResult$payments_core_release = getViewModel().getGooglePayResult$payments_core_release();
                final GooglePayLauncherActivity$onCreate$3 googlePayLauncherActivity$onCreate$3 = new GooglePayLauncherActivity$onCreate$3(this);
                googlePayResult$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: hD1
                    @Override // p000.InterfaceC41056fe3
                    public final void onChanged(Object obj) {
                        GooglePayLauncherActivity.onCreate$lambda$3(Function1.this, obj);
                    }
                });
                if (!getViewModel().getHasLaunched()) {
                    Z30.m73800d(C33163Gq2.m104689a(this), null, null, new GooglePayLauncherActivity$onCreate$4(this, null), 3, null);
                    return;
                }
                return;
            }
            finishWithResult(new GooglePayLauncher.Result.Failed(m116786exceptionOrNullimpl));
            return;
        }
        throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.".toString());
    }
}
