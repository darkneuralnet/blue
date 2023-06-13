package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\t2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "", "Lkotlin/Function0;", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "LB5;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "hostActivityLauncher", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "create", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface StripePaymentLauncherAssistedFactory {
    StripePaymentLauncher create(Function0<String> function0, Function0<String> function02, AbstractC0407B5<PaymentLauncherContract.Args> abstractC0407B5);
}
