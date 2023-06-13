package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSAuthenticatorModule;", "", "()V", "bindsStripe3DSAuthenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "stripe3ds2Authenticator", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(includes = {Stripe3ds2TransactionModule.class})
/* loaded from: classes7.dex */
public abstract class Stripe3DSAuthenticatorModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSAuthenticatorModule$Companion;", "", "()V", "providePaymentAuthConfig", "Lcom/stripe/android/PaymentAuthConfig;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        public final PaymentAuthConfig providePaymentAuthConfig() {
            return PaymentAuthConfig.Companion.get();
        }

        private Companion() {
        }
    }

    @IntentAuthenticatorMap
    @Binds
    @IntentAuthenticatorKey(StripeIntent.NextActionData.SdkData.Use3DS2.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsStripe3DSAuthenticator(Stripe3DS2Authenticator stripe3DS2Authenticator);
}
