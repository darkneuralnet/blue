package com.stripe.android.paymentsheet.model;

import com.stripe.android.ConfirmStripeIntentParamsFactory;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a)\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, m28432d2 = {"create", "T", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "(Lcom/stripe/android/ConfirmStripeIntentParamsFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "(Lcom/stripe/android/ConfirmStripeIntentParamsFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmStripeIntentParamsFactoryKtxKt {

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

    public static final <T extends ConfirmStripeIntentParams> T create(ConfirmStripeIntentParamsFactory<? extends T> confirmStripeIntentParamsFactory, PaymentSelection.Saved paymentSelection) {
        Intrinsics.checkNotNullParameter(confirmStripeIntentParamsFactory, "<this>");
        Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
        return confirmStripeIntentParamsFactory.create(paymentSelection.getPaymentMethod());
    }

    public static final <T extends ConfirmStripeIntentParams> T create(ConfirmStripeIntentParamsFactory<? extends T> confirmStripeIntentParamsFactory, PaymentSelection.New paymentSelection) {
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        Intrinsics.checkNotNullParameter(confirmStripeIntentParamsFactory, "<this>");
        Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
        int i = WhenMappings.$EnumSwitchMapping$0[paymentSelection.getCustomerRequestedSave().ordinal()];
        if (i == 1) {
            setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
        } else if (i == 2) {
            setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.Blank;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            setupFutureUsage = null;
        }
        return confirmStripeIntentParamsFactory.create(paymentSelection.getPaymentMethodCreateParams(), setupFutureUsage);
    }
}
