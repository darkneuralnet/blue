package com.stripe.android.payments;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onResult", "activityResult", "Landroidx/activity/result/ActivityResult;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeBrowserLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBrowserLauncherActivity.kt\ncom/stripe/android/payments/StripeBrowserLauncherActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,74:1\n75#2,13:75\n*S KotlinDebug\n*F\n+ 1 StripeBrowserLauncherActivity.kt\ncom/stripe/android/payments/StripeBrowserLauncherActivity\n*L\n26#1:75,13\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeBrowserLauncherActivity extends AppCompatActivity {
    private final Lazy viewModel$delegate;

    public StripeBrowserLauncherActivity() {
        Function0 function0 = StripeBrowserLauncherActivity$viewModel$2.INSTANCE;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(StripeBrowserLauncherViewModel.class), new C19105xd0f868f2(this), function0 == null ? new C19104xd0f868f1(this) : function0, new C19106xd0f868f3(null, this));
    }

    private final StripeBrowserLauncherViewModel getViewModel() {
        return (StripeBrowserLauncherViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResult(ActivityResult activityResult) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        PaymentBrowserAuthContract.Args parseArgs$payments_core_release = companion.parseArgs$payments_core_release(intent);
        if (parseArgs$payments_core_release == null) {
            finish();
            return;
        }
        setResult(-1, getViewModel().getResultIntent(parseArgs$payments_core_release));
        if (getViewModel().getHasLaunched()) {
            finish();
            return;
        }
        AbstractC0407B5 registerForActivityResult = registerForActivityResult(new C30903z5(), new InterfaceC28515t5() { // from class: tS5
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                StripeBrowserLauncherActivity.this.onResult((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul… ::onResult\n            )");
        registerForActivityResult.m114705a(getViewModel().createLaunchIntent(parseArgs$payments_core_release));
        getViewModel().setHasLaunched(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
