package com.stripe.android.uicore.address;

import android.content.res.Resources;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class AddressRepository_Factory implements InterfaceC48812sj1<AddressRepository> {
    private final Y94<Resources> resourcesProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public AddressRepository_Factory(Y94<Resources> y94, Y94<CoroutineContext> y942) {
        this.resourcesProvider = y94;
        this.workContextProvider = y942;
    }

    public static AddressRepository_Factory create(Y94<Resources> y94, Y94<CoroutineContext> y942) {
        return new AddressRepository_Factory(y94, y942);
    }

    public static AddressRepository newInstance(Resources resources, CoroutineContext coroutineContext) {
        return new AddressRepository(resources, coroutineContext);
    }

    @Override // p000.Y94
    public AddressRepository get() {
        return newInstance(this.resourcesProvider.get(), this.workContextProvider.get());
    }
}
