package com.stripe.android.p049ui.core.forms.resources.injection;

import android.content.Context;
import android.content.res.Resources;
/* renamed from: com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule_ProvideResourcesFactory */
/* loaded from: classes7.dex */
public final class ResourceRepositoryModule_ProvideResourcesFactory implements InterfaceC48812sj1<Resources> {
    private final Y94<Context> contextProvider;

    public ResourceRepositoryModule_ProvideResourcesFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static ResourceRepositoryModule_ProvideResourcesFactory create(Y94<Context> y94) {
        return new ResourceRepositoryModule_ProvideResourcesFactory(y94);
    }

    public static Resources provideResources(Context context) {
        return (Resources) C51679xZ3.m5002e(ResourceRepositoryModule.INSTANCE.provideResources(context));
    }

    @Override // p000.Y94
    public Resources get() {
        return provideResources(this.contextProvider.get());
    }
}
