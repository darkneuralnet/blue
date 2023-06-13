package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import com.stripe.android.uicore.image.StripeImageLoader;
/* loaded from: classes7.dex */
public final class FlowControllerModule_ProvideStripeImageLoaderFactory implements InterfaceC48812sj1<StripeImageLoader> {
    private final Y94<Context> contextProvider;

    public FlowControllerModule_ProvideStripeImageLoaderFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static FlowControllerModule_ProvideStripeImageLoaderFactory create(Y94<Context> y94) {
        return new FlowControllerModule_ProvideStripeImageLoaderFactory(y94);
    }

    public static StripeImageLoader provideStripeImageLoader(Context context) {
        return (StripeImageLoader) C51679xZ3.m5002e(FlowControllerModule.INSTANCE.provideStripeImageLoader(context));
    }

    @Override // p000.Y94
    public StripeImageLoader get() {
        return provideStripeImageLoader(this.contextProvider.get());
    }
}
