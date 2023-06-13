package com.stripe.android.payments.bankaccount.p044ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy;
import com.stripe.android.payments.financialconnections.IsFinancialConnectionsAvailable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\f\u0010\u0015\u001a\u00020\u0011*\u00020\u0016H\u0002J\f\u0010\u0015\u001a\u00020\u0011*\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "financialConnectionsPaymentsProxy", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "starterArgs", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "getStarterArgs", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "getViewModel", "()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "viewModel$delegate", "initConnectionsPaymentsProxy", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "launch", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCollectBankAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountActivity.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,69:1\n75#2,13:70\n*S KotlinDebug\n*F\n+ 1 CollectBankAccountActivity.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity\n*L\n25#1:70,13\n*E\n"})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity */
/* loaded from: classes7.dex */
public final class CollectBankAccountActivity extends AppCompatActivity {
    private FinancialConnectionsPaymentsProxy financialConnectionsPaymentsProxy;
    private final Lazy starterArgs$delegate;
    private final Lazy viewModel$delegate;

    public CollectBankAccountActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new CollectBankAccountActivity$starterArgs$2(this));
        this.starterArgs$delegate = lazy;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(CollectBankAccountViewModel.class), new CollectBankAccountActivity$special$$inlined$viewModels$default$2(this), new CollectBankAccountActivity$viewModel$2(this), new CollectBankAccountActivity$special$$inlined$viewModels$default$3(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountContract.Args getStarterArgs() {
        return (CollectBankAccountContract.Args) this.starterArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountViewModel getViewModel() {
        return (CollectBankAccountViewModel) this.viewModel$delegate.getValue();
    }

    private final void initConnectionsPaymentsProxy() {
        this.financialConnectionsPaymentsProxy = FinancialConnectionsPaymentsProxy.Companion.create$default(FinancialConnectionsPaymentsProxy.Companion, this, new CollectBankAccountActivity$initConnectionsPaymentsProxy$1(getViewModel()), (Function0) null, (IsFinancialConnectionsAvailable) null, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow) {
        FinancialConnectionsPaymentsProxy financialConnectionsPaymentsProxy = this.financialConnectionsPaymentsProxy;
        if (financialConnectionsPaymentsProxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("financialConnectionsPaymentsProxy");
            financialConnectionsPaymentsProxy = null;
        }
        financialConnectionsPaymentsProxy.present(openConnectionsFlow.getFinancialConnectionsSessionSecret(), openConnectionsFlow.getPublishableKey(), openConnectionsFlow.getStripeAccountId());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initConnectionsPaymentsProxy();
        C33163Gq2.m104689a(this).m387e(new CollectBankAccountActivity$onCreate$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.FinishWithResult finishWithResult) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.Result(finishWithResult.getResult()).toBundle()));
        finish();
    }
}
