package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PrefsRepository;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory implements InterfaceC48812sj1<PrefsRepository> {
    private final Y94<Context> appContextProvider;
    private final PaymentSheetViewModelModule module;
    private final Y94<CoroutineContext> workContextProvider;

    public PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(PaymentSheetViewModelModule paymentSheetViewModelModule, Y94<Context> y94, Y94<CoroutineContext> y942) {
        this.module = paymentSheetViewModelModule;
        this.appContextProvider = y94;
        this.workContextProvider = y942;
    }

    public static PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule, Y94<Context> y94, Y94<CoroutineContext> y942) {
        return new PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(paymentSheetViewModelModule, y94, y942);
    }

    public static PrefsRepository providePrefsRepository(PaymentSheetViewModelModule paymentSheetViewModelModule, Context context, CoroutineContext coroutineContext) {
        return (PrefsRepository) C51679xZ3.m5002e(paymentSheetViewModelModule.providePrefsRepository(context, coroutineContext));
    }

    @Override // p000.Y94
    public PrefsRepository get() {
        return providePrefsRepository(this.module, this.appContextProvider.get(), this.workContextProvider.get());
    }
}
