package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.databinding.ActivityPaymentOptionsBinding;
import com.stripe.android.paymentsheet.p047ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b,\u0010\u0011J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016R!\u0010\u0012\u001a\u00020\u000b8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010'¨\u0006."}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "initializeStarterArgs", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "setActivityResult", "Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentOptionsBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "getViewBinding$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentOptionsBinding;", "getViewBinding$paymentsheet_release$annotations", "()V", "viewBinding", "Landroidx/lifecycle/u$b;", "viewModelFactory", "Landroidx/lifecycle/u$b;", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/u$b;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/u$b;)V", "getViewModelFactory$paymentsheet_release$annotations", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel", "starterArgs$delegate", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "starterArgs", "Landroid/view/ViewGroup;", "rootView$delegate", "getRootView", "()Landroid/view/ViewGroup;", "rootView", "bottomSheet$delegate", "getBottomSheet", "bottomSheet", "<init>", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentOptionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsActivity.kt\ncom/stripe/android/paymentsheet/PaymentOptionsActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,80:1\n75#2,13:81\n16#3,11:94\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsActivity.kt\ncom/stripe/android/paymentsheet/PaymentOptionsActivity\n*L\n29#1:81,13\n52#1:94,11\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionsActivity extends BaseSheetActivity<PaymentOptionResult> {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    private final Lazy bottomSheet$delegate;
    private final Lazy rootView$delegate;
    private final Lazy starterArgs$delegate;
    private final Lazy viewBinding$delegate;
    private final Lazy viewModel$delegate;
    private C11759u.InterfaceC11763b viewModelFactory;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity$Companion;", "", "()V", "EXTRA_STARTER_ARGS", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PaymentOptionsActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        lazy = LazyKt__LazyJVMKt.lazy(new PaymentOptionsActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
        this.viewModelFactory = new PaymentOptionsViewModel.Factory(new PaymentOptionsActivity$viewModelFactory$1(this));
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(PaymentOptionsViewModel.class), new PaymentOptionsActivity$special$$inlined$viewModels$default$2(this), new PaymentOptionsActivity$viewModel$2(this), new PaymentOptionsActivity$special$$inlined$viewModels$default$3(null, this));
        lazy2 = LazyKt__LazyJVMKt.lazy(new PaymentOptionsActivity$starterArgs$2(this));
        this.starterArgs$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new PaymentOptionsActivity$rootView$2(this));
        this.rootView$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new PaymentOptionsActivity$bottomSheet$2(this));
        this.bottomSheet$delegate = lazy4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionContract.Args getStarterArgs() {
        return (PaymentOptionContract.Args) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    private final PaymentOptionContract.Args initializeStarterArgs() {
        boolean z;
        PaymentSheetState.Full state;
        PaymentSheet.Configuration config;
        PaymentSheet.Appearance appearance;
        PaymentOptionContract.Args starterArgs = getStarterArgs();
        if (starterArgs != null && (state = starterArgs.getState()) != null && (config = state.getConfig()) != null && (appearance = config.getAppearance()) != null) {
            PaymentSheetConfigurationKtxKt.parseAppearance(appearance);
        }
        if (getStarterArgs() == null) {
            z = true;
        } else {
            z = false;
        }
        setEarlyExitDueToIllegalState(z);
        return getStarterArgs();
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity
    public ViewGroup getBottomSheet() {
        Object value = this.bottomSheet$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bottomSheet>(...)");
        return (ViewGroup) value;
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity
    public ViewGroup getRootView() {
        Object value = this.rootView$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-rootView>(...)");
        return (ViewGroup) value;
    }

    public final ActivityPaymentOptionsBinding getViewBinding$paymentsheet_release() {
        return (ActivityPaymentOptionsBinding) this.viewBinding$delegate.getValue();
    }

    public final C11759u.InterfaceC11763b getViewModelFactory$paymentsheet_release() {
        return this.viewModelFactory;
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PaymentOptionContract.Args initializeStarterArgs = initializeStarterArgs();
        super.onCreate(bundle);
        if (initializeStarterArgs == null) {
            finish();
            return;
        }
        Integer statusBarColor = initializeStarterArgs.getStatusBarColor();
        if (statusBarColor != null) {
            getWindow().setStatusBarColor(statusBarColor.intValue());
        }
        setContentView(getViewBinding$paymentsheet_release().getRoot());
        InterfaceC36280Ty5<PaymentOptionResult> paymentOptionResult$paymentsheet_release = getViewModel().getPaymentOptionResult$paymentsheet_release();
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new C19142x7b71cea6(this, AbstractC11719f.EnumC11724b.STARTED, paymentOptionResult$paymentsheet_release, null, this), 3, null);
        getViewBinding$paymentsheet_release().content.setContent(C43575jt0.m29790c(1495711407, true, new PaymentOptionsActivity$onCreate$3(this)));
    }

    public final void setViewModelFactory$paymentsheet_release(C11759u.InterfaceC11763b interfaceC11763b) {
        Intrinsics.checkNotNullParameter(interfaceC11763b, "<set-?>");
        this.viewModelFactory = interfaceC11763b;
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity
    public PaymentOptionsViewModel getViewModel() {
        return (PaymentOptionsViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity
    public void setActivityResult(PaymentOptionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setResult(result.getResultCode(), new Intent().putExtras(result.toBundle()));
    }
}
