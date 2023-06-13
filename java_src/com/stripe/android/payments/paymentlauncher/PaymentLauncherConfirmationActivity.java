package com.stripe.android.payments.paymentlauncher;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.utils.AnimationConstants;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b!\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0015J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R!\u0010 \u001a\u00020\u001b8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "setFadeAnimations", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "finishWithResult", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "finish", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "getStarterArgs", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "starterArgs", "Landroidx/lifecycle/u$b;", "viewModelFactory", "Landroidx/lifecycle/u$b;", "getViewModelFactory$payments_core_release", "()Landroidx/lifecycle/u$b;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/u$b;)V", "getViewModelFactory$payments_core_release$annotations", "()V", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "viewModel$delegate", "getViewModel$payments_core_release", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "getViewModel$payments_core_release$annotations", "viewModel", "<init>", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentLauncherConfirmationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncherConfirmationActivity.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,104:1\n75#2,13:105\n*S KotlinDebug\n*F\n+ 1 PaymentLauncherConfirmationActivity.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity\n*L\n31#1:105,13\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentLauncherConfirmationActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    public static final String EMPTY_ARG_ERROR = "PaymentLauncherConfirmationActivity was started without arguments";
    private final Lazy starterArgs$delegate;
    private final Lazy viewModel$delegate;
    private C11759u.InterfaceC11763b viewModelFactory;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;", "", "()V", "EMPTY_ARG_ERROR", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PaymentLauncherConfirmationActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new PaymentLauncherConfirmationActivity$starterArgs$2(this));
        this.starterArgs$delegate = lazy;
        this.viewModelFactory = new PaymentLauncherViewModel.Factory(new PaymentLauncherConfirmationActivity$viewModelFactory$1(this));
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(PaymentLauncherViewModel.class), new C19133x3d3c2d32(this), new PaymentLauncherConfirmationActivity$viewModel$2(this), new C19134x3d3c2d33(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(PaymentResult paymentResult) {
        setResult(-1, new Intent().putExtras(paymentResult.toBundle()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentLauncherContract.Args getStarterArgs() {
        return (PaymentLauncherContract.Args) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewModel$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
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

    public final PaymentLauncherViewModel getViewModel$payments_core_release() {
        return (PaymentLauncherViewModel) this.viewModel$delegate.getValue();
    }

    public final C11759u.InterfaceC11763b getViewModelFactory$payments_core_release() {
        return this.viewModelFactory;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(Bundle bundle) {
        Object m116783constructorimpl;
        PaymentLauncherContract.Args starterArgs;
        super.onCreate(bundle);
        setFadeAnimations();
        try {
            Result.Companion companion = Result.Companion;
            starterArgs = getStarterArgs();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (starterArgs != null) {
            m116783constructorimpl = Result.m116783constructorimpl(starterArgs);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                PaymentLauncherContract.Args args = (PaymentLauncherContract.Args) m116783constructorimpl;
                OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
                Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
                C38677bf3.m64201b(onBackPressedDispatcher, null, false, PaymentLauncherConfirmationActivity$onCreate$1.INSTANCE, 3, null);
                Integer statusBarColor = args.getStatusBarColor();
                if (statusBarColor != null) {
                    getWindow().setStatusBarColor(statusBarColor.intValue());
                }
                C49882uX2<PaymentResult> paymentLauncherResult$payments_core_release = getViewModel$payments_core_release().getPaymentLauncherResult$payments_core_release();
                final PaymentLauncherConfirmationActivity$onCreate$3 paymentLauncherConfirmationActivity$onCreate$3 = new PaymentLauncherConfirmationActivity$onCreate$3(this);
                paymentLauncherResult$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: xM3
                    @Override // p000.InterfaceC41056fe3
                    public final void onChanged(Object obj) {
                        PaymentLauncherConfirmationActivity.onCreate$lambda$4(Function1.this, obj);
                    }
                });
                getViewModel$payments_core_release().register$payments_core_release(this);
                AuthActivityStarterHost create$payments_core_release = AuthActivityStarterHost.Companion.create$payments_core_release(this);
                if (args instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                    getViewModel$payments_core_release().confirmStripeIntent$payments_core_release(((PaymentLauncherContract.Args.IntentConfirmationArgs) args).getConfirmStripeIntentParams(), create$payments_core_release);
                    return;
                } else if (args instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs) {
                    getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.PaymentIntentNextActionArgs) args).getPaymentIntentClientSecret(), create$payments_core_release);
                    return;
                } else if (args instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs) {
                    getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.SetupIntentNextActionArgs) args).getSetupIntentClientSecret(), create$payments_core_release);
                    return;
                } else {
                    return;
                }
            }
            finishWithResult(new PaymentResult.Failed(m116786exceptionOrNullimpl));
            return;
        }
        throw new IllegalArgumentException(EMPTY_ARG_ERROR.toString());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getViewModel$payments_core_release().cleanUp$payments_core_release();
    }

    public final void setViewModelFactory$payments_core_release(C11759u.InterfaceC11763b interfaceC11763b) {
        Intrinsics.checkNotNullParameter(interfaceC11763b, "<set-?>");
        this.viewModelFactory = interfaceC11763b;
    }
}
