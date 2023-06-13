package com.stripe.android.paymentsheet.model;

import android.content.res.Resources;
import com.stripe.android.uicore.image.StripeImageLoader;
/* loaded from: classes7.dex */
public final class PaymentOptionFactory_Factory implements InterfaceC48812sj1<PaymentOptionFactory> {
    private final Y94<StripeImageLoader> imageLoaderProvider;
    private final Y94<Resources> resourcesProvider;

    public PaymentOptionFactory_Factory(Y94<Resources> y94, Y94<StripeImageLoader> y942) {
        this.resourcesProvider = y94;
        this.imageLoaderProvider = y942;
    }

    public static PaymentOptionFactory_Factory create(Y94<Resources> y94, Y94<StripeImageLoader> y942) {
        return new PaymentOptionFactory_Factory(y94, y942);
    }

    public static PaymentOptionFactory newInstance(Resources resources, StripeImageLoader stripeImageLoader) {
        return new PaymentOptionFactory(resources, stripeImageLoader);
    }

    @Override // p000.Y94
    public PaymentOptionFactory get() {
        return newInstance(this.resourcesProvider.get(), this.imageLoaderProvider.get());
    }
}
