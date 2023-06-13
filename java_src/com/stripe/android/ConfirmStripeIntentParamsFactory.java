package com.stripe.android;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ!\u0010\u0005\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/ConfirmStripeIntentParamsFactory;", "T", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "", "()V", "create", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Companion", "Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;", "Lcom/stripe/android/ConfirmSetupIntentParamsFactory;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public abstract class ConfirmStripeIntentParamsFactory<T extends ConfirmStripeIntentParams> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;", "", "()V", "createFactory", "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "clientSecret", "", "shipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> createFactory(String clientSecret, ConfirmPaymentIntentParams.Shipping shipping) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            if (PaymentIntent.ClientSecret.Companion.isMatch(clientSecret)) {
                return new ConfirmPaymentIntentParamsFactory(clientSecret, shipping);
            }
            if (SetupIntent.ClientSecret.Companion.isMatch(clientSecret)) {
                return new ConfirmSetupIntentParamsFactory(clientSecret);
            }
            throw new IllegalStateException(("Encountered an invalid client secret \"" + clientSecret + "\"").toString());
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConfirmStripeIntentParamsFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ ConfirmStripeIntentParams create$default(ConfirmStripeIntentParamsFactory confirmStripeIntentParamsFactory, PaymentMethodCreateParams paymentMethodCreateParams, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                setupFutureUsage = null;
            }
            return confirmStripeIntentParamsFactory.create(paymentMethodCreateParams, setupFutureUsage);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
    }

    public abstract T create(PaymentMethod paymentMethod);

    public abstract T create(PaymentMethodCreateParams paymentMethodCreateParams, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage);

    private ConfirmStripeIntentParamsFactory() {
    }
}
