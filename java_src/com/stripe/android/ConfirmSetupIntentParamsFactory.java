package com.stripe.android;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/ConfirmSetupIntentParamsFactory;", "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "clientSecret", "", "(Ljava/lang/String;)V", "create", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmSetupIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmSetupIntentParams> {
    private final String clientSecret;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSetupIntentParamsFactory(String clientSecret) {
        super(null);
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmSetupIntentParams create(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        ConfirmSetupIntentParams.Companion companion = ConfirmSetupIntentParams.Companion;
        String str = paymentMethod.f75358id;
        if (str == null) {
            str = "";
        }
        return ConfirmSetupIntentParams.Companion.create$default(companion, str, this.clientSecret, paymentMethod.type != null ? new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT()) : null, (String) null, 8, (Object) null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmSetupIntentParams create(PaymentMethodCreateParams createParams, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, createParams, this.clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
    }
}
