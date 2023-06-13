package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import kotlin.coroutines.CoroutineContext;
/* renamed from: com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory */
/* loaded from: classes7.dex */
public final class C19127xd3c74c43 implements InterfaceC48812sj1<StripeThreeDs2Service> {
    private final Y94<Context> contextProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public C19127xd3c74c43(Y94<Context> y94, Y94<Boolean> y942, Y94<CoroutineContext> y943) {
        this.contextProvider = y94;
        this.enableLoggingProvider = y942;
        this.workContextProvider = y943;
    }

    public static C19127xd3c74c43 create(Y94<Context> y94, Y94<Boolean> y942, Y94<CoroutineContext> y943) {
        return new C19127xd3c74c43(y94, y942, y943);
    }

    public static StripeThreeDs2Service provideStripeThreeDs2Service(Context context, boolean z, CoroutineContext coroutineContext) {
        return (StripeThreeDs2Service) C51679xZ3.m5002e(Stripe3ds2TransactionModule.Companion.provideStripeThreeDs2Service(context, z, coroutineContext));
    }

    @Override // p000.Y94
    public StripeThreeDs2Service get() {
        return provideStripeThreeDs2Service(this.contextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.workContextProvider.get());
    }
}
