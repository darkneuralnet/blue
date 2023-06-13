package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
/* renamed from: com.stripe.android.paymentsheet.injection.AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory */
/* loaded from: classes7.dex */
public final class C19219x1b637b9f implements InterfaceC48812sj1<PlacesClientProxy> {
    private final Y94<AddressElementActivityContract.Args> argsProvider;
    private final Y94<Context> contextProvider;
    private final AddressElementViewModelModule module;

    public C19219x1b637b9f(AddressElementViewModelModule addressElementViewModelModule, Y94<Context> y94, Y94<AddressElementActivityContract.Args> y942) {
        this.module = addressElementViewModelModule;
        this.contextProvider = y94;
        this.argsProvider = y942;
    }

    public static C19219x1b637b9f create(AddressElementViewModelModule addressElementViewModelModule, Y94<Context> y94, Y94<AddressElementActivityContract.Args> y942) {
        return new C19219x1b637b9f(addressElementViewModelModule, y94, y942);
    }

    @Override // p000.Y94
    public PlacesClientProxy get() {
        return this.module.provideGooglePlacesClient$paymentsheet_release(this.contextProvider.get(), this.argsProvider.get());
    }
}
