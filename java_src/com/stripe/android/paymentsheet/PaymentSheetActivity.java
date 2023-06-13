package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.databinding.ActivityPaymentSheetBinding;
import com.stripe.android.paymentsheet.p047ui.BaseSheetActivity;
import java.security.InvalidParameterException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b6\u0010\u001bJ \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\f\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0014R!\u0010\u001c\u001a\u00020\u00158@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010\u001b\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0017\u001a\u0004\b4\u00101\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "initializeArgs-d1pmJ48", "()Ljava/lang/Object;", "initializeArgs", "", "error", "", "finishWithError", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "defaultInitializationError", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "setActivityResult", "onDestroy", "Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "getViewBinding$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;", "getViewBinding$paymentsheet_release$annotations", "()V", "viewBinding", "Landroidx/lifecycle/u$b;", "viewModelFactory", "Landroidx/lifecycle/u$b;", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/u$b;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/u$b;)V", "getViewModelFactory$paymentsheet_release$annotations", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel", "starterArgs$delegate", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "starterArgs", "Landroid/view/ViewGroup;", "rootView$delegate", "getRootView", "()Landroid/view/ViewGroup;", "rootView", "bottomSheet$delegate", "getBottomSheet", "bottomSheet", "<init>", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetActivity.kt\ncom/stripe/android/paymentsheet/PaymentSheetActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,125:1\n75#2,13:126\n16#3,11:139\n*S KotlinDebug\n*F\n+ 1 PaymentSheetActivity.kt\ncom/stripe/android/paymentsheet/PaymentSheetActivity\n*L\n31#1:126,13\n72#1:139,11\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentSheetActivity extends BaseSheetActivity<PaymentSheetResult> {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    private final Lazy bottomSheet$delegate;
    private final Lazy rootView$delegate;
    private final Lazy starterArgs$delegate;
    private final Lazy viewBinding$delegate;
    private final Lazy viewModel$delegate;
    private C11759u.InterfaceC11763b viewModelFactory;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;", "", "()V", "EXTRA_STARTER_ARGS", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PaymentSheetActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        lazy = LazyKt__LazyJVMKt.lazy(new PaymentSheetActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
        this.viewModelFactory = new PaymentSheetViewModel.Factory(new PaymentSheetActivity$viewModelFactory$1(this));
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(PaymentSheetViewModel.class), new PaymentSheetActivity$special$$inlined$viewModels$default$2(this), new PaymentSheetActivity$viewModel$2(this), new PaymentSheetActivity$special$$inlined$viewModels$default$3(null, this));
        lazy2 = LazyKt__LazyJVMKt.lazy(new PaymentSheetActivity$starterArgs$2(this));
        this.starterArgs$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new PaymentSheetActivity$rootView$2(this));
        this.rootView$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new PaymentSheetActivity$bottomSheet$2(this));
        this.bottomSheet$delegate = lazy4;
    }

    private final IllegalArgumentException defaultInitializationError() {
        return new IllegalArgumentException("PaymentSheet started without arguments.");
    }

    private final void finishWithError(Throwable th) {
        if (th == null) {
            th = defaultInitializationError();
        }
        setActivityResult((PaymentSheetResult) new PaymentSheetResult.Failed(th));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetContractV2.Args getStarterArgs() {
        return (PaymentSheetContractV2.Args) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    /* renamed from: initializeArgs-d1pmJ48  reason: not valid java name */
    private final Object m116601initializeArgsd1pmJ48() {
        Object m116783constructorimpl;
        PaymentSheet.Appearance appearance;
        PaymentSheetContractV2.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(defaultInitializationError()));
        } else {
            try {
                starterArgs.getInitializationMode$paymentsheet_release().validate$paymentsheet_release();
                PaymentSheet.Configuration config$paymentsheet_release = starterArgs.getConfig$paymentsheet_release();
                if (config$paymentsheet_release != null) {
                    PaymentSheetConfigurationKtxKt.validate(config$paymentsheet_release);
                }
                PaymentSheet.Configuration config$paymentsheet_release2 = starterArgs.getConfig$paymentsheet_release();
                if (config$paymentsheet_release2 != null && (appearance = config$paymentsheet_release2.getAppearance()) != null) {
                    PaymentSheetConfigurationKtxKt.parseAppearance(appearance);
                }
                m116783constructorimpl = Result.m116783constructorimpl(starterArgs);
            } catch (InvalidParameterException e) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(e));
            }
        }
        setEarlyExitDueToIllegalState(Result.m116789isFailureimpl(m116783constructorimpl));
        return m116783constructorimpl;
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

    public final ActivityPaymentSheetBinding getViewBinding$paymentsheet_release() {
        return (ActivityPaymentSheetBinding) this.viewBinding$delegate.getValue();
    }

    public final C11759u.InterfaceC11763b getViewModelFactory$paymentsheet_release() {
        return this.viewModelFactory;
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object obj;
        Integer statusBarColor$paymentsheet_release;
        Object m116601initializeArgsd1pmJ48 = m116601initializeArgsd1pmJ48();
        super.onCreate(bundle);
        if (Result.m116789isFailureimpl(m116601initializeArgsd1pmJ48)) {
            obj = null;
        } else {
            obj = m116601initializeArgsd1pmJ48;
        }
        if (((PaymentSheetContractV2.Args) obj) == null) {
            finishWithError(Result.m116786exceptionOrNullimpl(m116601initializeArgsd1pmJ48));
            return;
        }
        getViewModel().registerFromActivity(this);
        PaymentSheetViewModel viewModel = getViewModel();
        AbstractC53033zq2 m104689a = C33163Gq2.m104689a(this);
        GooglePayPaymentMethodLauncherContract googlePayPaymentMethodLauncherContract = new GooglePayPaymentMethodLauncherContract();
        final PaymentSheetViewModel viewModel2 = getViewModel();
        AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> registerForActivityResult = registerForActivityResult(googlePayPaymentMethodLauncherContract, new InterfaceC28515t5() { // from class: AP3
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj2) {
                PaymentSheetViewModel.this.onGooglePayResult$paymentsheet_release((GooglePayPaymentMethodLauncher.Result) obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…lePayResult\n            )");
        viewModel.setupGooglePay(m104689a, registerForActivityResult);
        PaymentSheetContractV2.Args starterArgs = getStarterArgs();
        if (starterArgs != null && (statusBarColor$paymentsheet_release = starterArgs.getStatusBarColor$paymentsheet_release()) != null) {
            getWindow().setStatusBarColor(statusBarColor$paymentsheet_release.intValue());
        }
        setContentView(getViewBinding$paymentsheet_release().getRoot());
        getViewBinding$paymentsheet_release().content.setContent(C43575jt0.m29790c(-853551251, true, new PaymentSheetActivity$onCreate$3(this)));
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new C19148x232edc45(this, AbstractC11719f.EnumC11724b.STARTED, C36708Vu1.m79249v(getViewModel().getPaymentSheetResult$paymentsheet_release()), null, this), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!getEarlyExitDueToIllegalState()) {
            getViewModel().unregisterFromActivity();
        }
        super.onDestroy();
    }

    public final void setViewModelFactory$paymentsheet_release(C11759u.InterfaceC11763b interfaceC11763b) {
        Intrinsics.checkNotNullParameter(interfaceC11763b, "<set-?>");
        this.viewModelFactory = interfaceC11763b;
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity
    public PaymentSheetViewModel getViewModel() {
        return (PaymentSheetViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BaseSheetActivity
    public void setActivityResult(PaymentSheetResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContractV2.Result(result).toBundle()));
    }
}
