package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.PaymentAuthConfig;
import java.util.Set;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class Stripe3DS2Authenticator_Factory implements InterfaceC48812sj1<Stripe3DS2Authenticator> {
    private final Y94<PaymentAuthConfig> configProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<String> injectorKeyProvider;
    private final Y94<Set<String>> productUsageProvider;
    private final Y94<Function0<String>> publishableKeyProvider;

    public Stripe3DS2Authenticator_Factory(Y94<PaymentAuthConfig> y94, Y94<Boolean> y942, Y94<String> y943, Y94<Function0<String>> y944, Y94<Set<String>> y945) {
        this.configProvider = y94;
        this.enableLoggingProvider = y942;
        this.injectorKeyProvider = y943;
        this.publishableKeyProvider = y944;
        this.productUsageProvider = y945;
    }

    public static Stripe3DS2Authenticator_Factory create(Y94<PaymentAuthConfig> y94, Y94<Boolean> y942, Y94<String> y943, Y94<Function0<String>> y944, Y94<Set<String>> y945) {
        return new Stripe3DS2Authenticator_Factory(y94, y942, y943, y944, y945);
    }

    public static Stripe3DS2Authenticator newInstance(PaymentAuthConfig paymentAuthConfig, boolean z, String str, Function0<String> function0, Set<String> set) {
        return new Stripe3DS2Authenticator(paymentAuthConfig, z, str, function0, set);
    }

    @Override // p000.Y94
    public Stripe3DS2Authenticator get() {
        return newInstance(this.configProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.injectorKeyProvider.get(), this.publishableKeyProvider.get(), this.productUsageProvider.get());
    }
}
