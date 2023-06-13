package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
/* renamed from: com.stripe.android.paymentsheet.injection.AddressElementViewModelModule_ProvideAnalyticsRequestFactory$paymentsheet_releaseFactory */
/* loaded from: classes7.dex */
public final class C19218xf9404c5c implements InterfaceC48812sj1<AnalyticsRequestFactory> {
    private final Y94<Context> contextProvider;
    private final AddressElementViewModelModule module;
    private final Y94<String> publishableKeyProvider;

    public C19218xf9404c5c(AddressElementViewModelModule addressElementViewModelModule, Y94<Context> y94, Y94<String> y942) {
        this.module = addressElementViewModelModule;
        this.contextProvider = y94;
        this.publishableKeyProvider = y942;
    }

    public static C19218xf9404c5c create(AddressElementViewModelModule addressElementViewModelModule, Y94<Context> y94, Y94<String> y942) {
        return new C19218xf9404c5c(addressElementViewModelModule, y94, y942);
    }

    public static AnalyticsRequestFactory provideAnalyticsRequestFactory$paymentsheet_release(AddressElementViewModelModule addressElementViewModelModule, Context context, String str) {
        return (AnalyticsRequestFactory) C51679xZ3.m5002e(addressElementViewModelModule.provideAnalyticsRequestFactory$paymentsheet_release(context, str));
    }

    @Override // p000.Y94
    public AnalyticsRequestFactory get() {
        return provideAnalyticsRequestFactory$paymentsheet_release(this.module, this.contextProvider.get(), this.publishableKeyProvider.get());
    }
}
