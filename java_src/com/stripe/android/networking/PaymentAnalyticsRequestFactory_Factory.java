package com.stripe.android.networking;

import android.content.Context;
import java.util.Set;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class PaymentAnalyticsRequestFactory_Factory implements InterfaceC48812sj1<PaymentAnalyticsRequestFactory> {
    private final Y94<Context> contextProvider;
    private final Y94<Set<String>> defaultProductUsageTokensProvider;
    private final Y94<Function0<String>> publishableKeyProvider;

    public PaymentAnalyticsRequestFactory_Factory(Y94<Context> y94, Y94<Function0<String>> y942, Y94<Set<String>> y943) {
        this.contextProvider = y94;
        this.publishableKeyProvider = y942;
        this.defaultProductUsageTokensProvider = y943;
    }

    public static PaymentAnalyticsRequestFactory_Factory create(Y94<Context> y94, Y94<Function0<String>> y942, Y94<Set<String>> y943) {
        return new PaymentAnalyticsRequestFactory_Factory(y94, y942, y943);
    }

    public static PaymentAnalyticsRequestFactory newInstance(Context context, Function0<String> function0, Set<String> set) {
        return new PaymentAnalyticsRequestFactory(context, function0, set);
    }

    @Override // p000.Y94
    public PaymentAnalyticsRequestFactory get() {
        return newInstance(this.contextProvider.get(), this.publishableKeyProvider.get(), this.defaultProductUsageTokensProvider.get());
    }
}
