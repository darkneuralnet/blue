package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.Stripe3ds2TransactionLayoutBinding;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragmentFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentFlowResult", "", "finishWithResult", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "getViewBinding", "()Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "viewBinding", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "getArgs", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "setArgs", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;)V", "Landroidx/lifecycle/u$b;", "viewModelFactory", "Landroidx/lifecycle/u$b;", "getViewModelFactory$payments_core_release", "()Landroidx/lifecycle/u$b;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/u$b;)V", "getViewModelFactory$payments_core_release$annotations", "()V", "<init>", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripe3ds2TransactionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stripe3ds2TransactionActivity.kt\ncom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,140:1\n1#2:141\n470#3:142\n75#4,13:143\n*S KotlinDebug\n*F\n+ 1 Stripe3ds2TransactionActivity.kt\ncom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity\n*L\n50#1:142\n79#1:143,13\n*E\n"})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionActivity extends AppCompatActivity {
    public Stripe3ds2TransactionContract.Args args;
    private final Lazy viewBinding$delegate;
    private C11759u.InterfaceC11763b viewModelFactory;

    public Stripe3ds2TransactionActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Stripe3ds2TransactionActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
        this.viewModelFactory = new Stripe3ds2TransactionViewModelFactory(new Stripe3ds2TransactionActivity$viewModelFactory$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(PaymentFlowResult.Unvalidated unvalidated) {
        setResult(-1, new Intent().putExtras(unvalidated.toBundle()));
        finish();
    }

    private final Stripe3ds2TransactionLayoutBinding getViewBinding() {
        return (Stripe3ds2TransactionLayoutBinding) this.viewBinding$delegate.getValue();
    }

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe3ds2TransactionViewModel onCreate$lambda$6(Lazy<Stripe3ds2TransactionViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(Function1 onChallengeResult, ChallengeResult it) {
        Intrinsics.checkNotNullParameter(onChallengeResult, "$onChallengeResult");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        onChallengeResult.invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(Stripe3ds2TransactionActivity this$0, PaymentFlowResult.Unvalidated it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.finishWithResult(it);
    }

    public final Stripe3ds2TransactionContract.Args getArgs() {
        Stripe3ds2TransactionContract.Args args = this.args;
        if (args != null) {
            return args;
        }
        Intrinsics.throwUninitializedPropertyAccessException("args");
        return null;
    }

    public final C11759u.InterfaceC11763b getViewModelFactory$payments_core_release() {
        return this.viewModelFactory;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object m116783constructorimpl;
        Stripe3ds2TransactionContract.Args fromIntent;
        Integer num;
        try {
            Result.Companion companion = Result.Companion;
            Stripe3ds2TransactionContract.Args.Companion companion2 = Stripe3ds2TransactionContract.Args.Companion;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            fromIntent = companion2.fromIntent(intent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (fromIntent != null) {
            String accentColor = fromIntent.getConfig().getUiCustomization$payments_core_release().getUiCustomization().getAccentColor();
            if (accentColor != null) {
                Intrinsics.checkNotNullExpressionValue(accentColor, "accentColor");
                Object m116783constructorimpl2 = Result.m116783constructorimpl(Integer.valueOf(Color.parseColor(accentColor)));
                if (Result.m116789isFailureimpl(m116783constructorimpl2)) {
                    m116783constructorimpl2 = null;
                }
                num = (Integer) m116783constructorimpl2;
            } else {
                num = null;
            }
            getSupportFragmentManager().m67282z1(new ChallengeProgressFragmentFactory(fromIntent.getFingerprint().getDirectoryServerName(), fromIntent.getSdkTransactionId(), num));
            m116783constructorimpl = Result.m116783constructorimpl(fromIntent);
            super.onCreate(bundle);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                setArgs((Stripe3ds2TransactionContract.Args) m116783constructorimpl);
                setContentView(getViewBinding().getRoot());
                Integer statusBarColor = getArgs().getStatusBarColor();
                if (statusBarColor != null) {
                    getWindow().setStatusBarColor(statusBarColor.intValue());
                }
                C11758t c11758t = new C11758t(Reflection.getOrCreateKotlinClass(Stripe3ds2TransactionViewModel.class), new C19115x63e2b762(this), new Stripe3ds2TransactionActivity$onCreate$viewModel$2(this), new C19116x63e2b763(null, this));
                final Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1 stripe3ds2TransactionActivity$onCreate$onChallengeResult$1 = new Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1(this, c11758t);
                AbstractC0407B5 registerForActivityResult = registerForActivityResult(new ChallengeContract(), new InterfaceC28515t5() { // from class: rS5
                    @Override // p000.InterfaceC28515t5
                    /* renamed from: a */
                    public final void mo1514a(Object obj) {
                        Stripe3ds2TransactionActivity.onCreate$lambda$7(Function1.this, (ChallengeResult) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…lengeResult(it)\n        }");
                AbstractC0407B5 registerForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new InterfaceC28515t5() { // from class: sS5
                    @Override // p000.InterfaceC28515t5
                    /* renamed from: a */
                    public final void mo1514a(Object obj) {
                        Stripe3ds2TransactionActivity.onCreate$lambda$8(Stripe3ds2TransactionActivity.this, (PaymentFlowResult.Unvalidated) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResul…hWithResult(it)\n        }");
                if (!onCreate$lambda$6(c11758t).getHasCompleted()) {
                    C33163Gq2.m104689a(this).m388d(new Stripe3ds2TransactionActivity$onCreate$3(this, registerForActivityResult, stripe3ds2TransactionActivity$onCreate$onChallengeResult$1, registerForActivityResult2, c11758t, null));
                    return;
                }
                return;
            }
            finishWithResult(new PaymentFlowResult.Unvalidated(null, 2, StripeException.Companion.create(m116786exceptionOrNullimpl), false, null, null, null, 121, null));
            return;
        }
        throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.".toString());
    }

    public final void setArgs(Stripe3ds2TransactionContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "<set-?>");
        this.args = args;
    }

    public final void setViewModelFactory$payments_core_release(C11759u.InterfaceC11763b interfaceC11763b) {
        Intrinsics.checkNotNullParameter(interfaceC11763b, "<set-?>");
        this.viewModelFactory = interfaceC11763b;
    }
}
