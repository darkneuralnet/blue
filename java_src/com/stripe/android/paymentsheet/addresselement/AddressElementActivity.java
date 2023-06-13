package com.stripe.android.paymentsheet.addresselement;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.utils.AnimationConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016R(\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;", "Landroidx/activity/ComponentActivity;", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "setResult", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "finish", "Landroidx/lifecycle/u$b;", "viewModelFactory", "Landroidx/lifecycle/u$b;", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/u$b;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/u$b;)V", "getViewModelFactory$paymentsheet_release$annotations", "()V", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "viewModel", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "starterArgs$delegate", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "starterArgs", "LOY2;", "navController", "LOY2;", "<init>", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressElementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,163:1\n75#2,13:164\n*S KotlinDebug\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity\n*L\n46#1:164,13\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElementActivity extends ComponentActivity {
    private OY2 navController;
    private final Lazy starterArgs$delegate;
    private C11759u.InterfaceC11763b viewModelFactory = new AddressElementViewModel.Factory(new AddressElementActivity$viewModelFactory$1(this), new AddressElementActivity$viewModelFactory$2(this));
    private final Lazy viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(AddressElementViewModel.class), new AddressElementActivity$special$$inlined$viewModels$default$2(this), new AddressElementActivity$viewModel$2(this), new AddressElementActivity$special$$inlined$viewModels$default$3(null, this));

    public AddressElementActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new AddressElementActivity$starterArgs$2(this));
        this.starterArgs$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressElementActivityContract.Args getStarterArgs() {
        return (AddressElementActivityContract.Args) this.starterArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressElementViewModel getViewModel() {
        return (AddressElementViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setResult(AddressLauncherResult addressLauncherResult) {
        setResult(addressLauncherResult.getResultCode$paymentsheet_release(), new Intent().putExtras(new AddressElementActivityContract.Result(addressLauncherResult).toBundle()));
    }

    public static /* synthetic */ void setResult$default(AddressElementActivity addressElementActivity, AddressLauncherResult addressLauncherResult, int i, Object obj) {
        if ((i & 1) != 0) {
            addressLauncherResult = AddressLauncherResult.Canceled.INSTANCE;
        }
        addressElementActivity.setResult(addressLauncherResult);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        overridePendingTransition(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
    }

    public final C11759u.InterfaceC11763b getViewModelFactory$paymentsheet_release() {
        return this.viewModelFactory;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PaymentSheet.Appearance appearance;
        super.onCreate(bundle);
        C43166jB6.m31026b(getWindow(), false);
        AddressLauncher.Configuration config$paymentsheet_release = getStarterArgs().getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null && (appearance = config$paymentsheet_release.getAppearance()) != null) {
            PaymentSheetConfigurationKtxKt.parseAppearance(appearance);
        }
        Integer statusBarColor$paymentsheet_release = getStarterArgs().getStatusBarColor$paymentsheet_release();
        if (statusBarColor$paymentsheet_release != null) {
            getWindow().setStatusBarColor(statusBarColor$paymentsheet_release.intValue());
        }
        setResult$default(this, null, 1, null);
        C34583Ms0.m94672b(this, null, C43575jt0.m29790c(1953035352, true, new AddressElementActivity$onCreate$2(this)), 1, null);
    }

    public final void setViewModelFactory$paymentsheet_release(C11759u.InterfaceC11763b interfaceC11763b) {
        Intrinsics.checkNotNullParameter(interfaceC11763b, "<set-?>");
        this.viewModelFactory = interfaceC11763b;
    }
}
