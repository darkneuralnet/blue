package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
/* renamed from: com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory */
/* loaded from: classes7.dex */
public final class C19229x55c689fb implements InterfaceC48812sj1<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> {
    private final Y94<Context> appContextProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public C19229x55c689fb(Y94<Context> y94, Y94<CoroutineContext> y942) {
        this.appContextProvider = y94;
        this.workContextProvider = y942;
    }

    public static C19229x55c689fb create(Y94<Context> y94, Y94<CoroutineContext> y942) {
        return new C19229x55c689fb(y94, y942);
    }

    public static Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(Context context, CoroutineContext coroutineContext) {
        return (Function1) C51679xZ3.m5002e(PaymentSheetCommonModule.Companion.providePrefsRepositoryFactory(context, coroutineContext));
    }

    @Override // p000.Y94
    public Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> get() {
        return providePrefsRepositoryFactory(this.appContextProvider.get(), this.workContextProvider.get());
    }
}
