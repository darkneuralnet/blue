package com.stripe.android.payments;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeErrorMappingKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "create", "", "intent", "Lcom/stripe/android/model/StripeIntent;", "outcome", "", "createForPaymentIntent", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "createForSetupIntent", "setupIntent", "Lcom/stripe/android/model/SetupIntent;", "is3DS2", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentFlowFailureMessageFactory {
    private final Context context;

    public PaymentFlowFailureMessageFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String createForPaymentIntent(PaymentIntent paymentIntent) {
        String str;
        PaymentIntent.Error.Type type;
        PaymentMethod.Type type2;
        if (paymentIntent.getStatus() == StripeIntent.Status.RequiresAction) {
            PaymentMethod paymentMethod = paymentIntent.getPaymentMethod();
            boolean z = false;
            if (paymentMethod != null && (type2 = paymentMethod.type) != null && type2.isVoucher) {
                z = true;
            }
        }
        PaymentIntent.Error lastPaymentError = paymentIntent.getLastPaymentError();
        if (lastPaymentError != null) {
            str = lastPaymentError.getCode();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, PaymentIntent.Error.CODE_AUTHENTICATION_ERROR)) {
            PaymentIntent.Error lastPaymentError2 = paymentIntent.getLastPaymentError();
            if (lastPaymentError2 != null) {
                type = lastPaymentError2.getType();
            } else {
                type = null;
            }
            if (type != PaymentIntent.Error.Type.CardError) {
                return null;
            }
            PaymentIntent.Error lastPaymentError3 = paymentIntent.getLastPaymentError();
            String mapErrorCodeToLocalizedMessage = StripeErrorMappingKt.mapErrorCodeToLocalizedMessage(this.context, lastPaymentError3.getCode());
            if (mapErrorCodeToLocalizedMessage == null) {
                return lastPaymentError3.getMessage();
            }
            return mapErrorCodeToLocalizedMessage;
        }
        return this.context.getResources().getString(C18606R.string.stripe_failure_reason_authentication);
    }

    private final String createForSetupIntent(SetupIntent setupIntent) {
        String str;
        SetupIntent.Error.Type type;
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (lastSetupError != null) {
            str = lastSetupError.getCode();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, SetupIntent.Error.CODE_AUTHENTICATION_ERROR)) {
            return this.context.getResources().getString(C18606R.string.stripe_failure_reason_authentication);
        }
        SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
        if (lastSetupError2 != null) {
            type = lastSetupError2.getType();
        } else {
            type = null;
        }
        if (type != SetupIntent.Error.Type.CardError) {
            return null;
        }
        SetupIntent.Error lastSetupError3 = setupIntent.getLastSetupError();
        String mapErrorCodeToLocalizedMessage = StripeErrorMappingKt.mapErrorCodeToLocalizedMessage(this.context, lastSetupError3.getCode());
        if (mapErrorCodeToLocalizedMessage == null) {
            return lastSetupError3.getMessage();
        }
        return mapErrorCodeToLocalizedMessage;
    }

    private final boolean is3DS2(StripeIntent stripeIntent) {
        PaymentMethod.Type type;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        if (paymentMethod != null) {
            type = paymentMethod.type;
        } else {
            type = null;
        }
        if (type == PaymentMethod.Type.Card && (stripeIntent.getNextActionData() instanceof StripeIntent.NextActionData.SdkData.Use3DS2)) {
            return true;
        }
        return false;
    }

    public final String create(StripeIntent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i == 4) {
            return this.context.getResources().getString(C18606R.string.stripe_failure_reason_timed_out);
        }
        if (is3DS2(intent) || (intent.getStatus() != StripeIntent.Status.RequiresPaymentMethod && intent.getStatus() != StripeIntent.Status.RequiresAction)) {
            return null;
        }
        if (intent instanceof PaymentIntent) {
            return createForPaymentIntent((PaymentIntent) intent);
        }
        if (intent instanceof SetupIntent) {
            return createForSetupIntent((SetupIntent) intent);
        }
        throw new NoWhenBranchMatchedException();
    }
}
