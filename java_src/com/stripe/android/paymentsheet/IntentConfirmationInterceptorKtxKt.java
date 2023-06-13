package com.stripe.android.paymentsheet;

import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"intercept", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "Lcom/stripe/android/IntentConfirmationInterceptor;", "clientSecret", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", NamedConstantsKt.SHIPPING_VALUES, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "(Lcom/stripe/android/IntentConfirmationInterceptor;Ljava/lang/String;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class IntentConfirmationInterceptorKtxKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSelection.CustomerRequestedSave.values().length];
            try {
                iArr[PaymentSelection.CustomerRequestedSave.RequestReuse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSelection.CustomerRequestedSave.RequestNoReuse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSelection.CustomerRequestedSave.NoRequest.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object intercept(IntentConfirmationInterceptor intentConfirmationInterceptor, String str, PaymentSelection paymentSelection, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        if (paymentSelection instanceof PaymentSelection.New) {
            PaymentSelection.New r9 = (PaymentSelection.New) paymentSelection;
            int i = WhenMappings.$EnumSwitchMapping$0[r9.getCustomerRequestedSave().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        setupFutureUsage = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.Blank;
                }
            } else {
                setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
            }
            return intentConfirmationInterceptor.intercept(str, r9.getPaymentMethodCreateParams(), shipping, setupFutureUsage, continuation);
        } else if (paymentSelection instanceof PaymentSelection.Saved) {
            return intentConfirmationInterceptor.intercept(str, ((PaymentSelection.Saved) paymentSelection).getPaymentMethod(), shipping, (ConfirmPaymentIntentParams.SetupFutureUsage) null, continuation);
        } else {
            throw new IllegalStateException(("Attempting to confirm intent for invalid payment selection: " + paymentSelection).toString());
        }
    }
}
