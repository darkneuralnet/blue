package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"isProcessingPayment", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)Z", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentSheetViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isProcessingPayment(PaymentSheet.InitializationMode initializationMode) {
        if (initializationMode instanceof PaymentSheet.InitializationMode.PaymentIntent) {
            return true;
        }
        if (initializationMode instanceof PaymentSheet.InitializationMode.SetupIntent) {
            return false;
        }
        if (initializationMode instanceof PaymentSheet.InitializationMode.DeferredIntent) {
            return ((PaymentSheet.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration().getMode() instanceof PaymentSheet.IntentConfiguration.Mode.Payment;
        }
        throw new NoWhenBranchMatchedException();
    }
}
