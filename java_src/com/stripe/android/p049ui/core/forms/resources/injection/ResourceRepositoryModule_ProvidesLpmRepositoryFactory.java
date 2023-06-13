package com.stripe.android.p049ui.core.forms.resources.injection;

import android.content.res.Resources;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
/* renamed from: com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule_ProvidesLpmRepositoryFactory */
/* loaded from: classes7.dex */
public final class ResourceRepositoryModule_ProvidesLpmRepositoryFactory implements InterfaceC48812sj1<LpmRepository> {
    private final Y94<Resources> resourcesProvider;

    public ResourceRepositoryModule_ProvidesLpmRepositoryFactory(Y94<Resources> y94) {
        this.resourcesProvider = y94;
    }

    public static ResourceRepositoryModule_ProvidesLpmRepositoryFactory create(Y94<Resources> y94) {
        return new ResourceRepositoryModule_ProvidesLpmRepositoryFactory(y94);
    }

    public static LpmRepository providesLpmRepository(Resources resources) {
        return (LpmRepository) C51679xZ3.m5002e(ResourceRepositoryModule.INSTANCE.providesLpmRepository(resources));
    }

    @Override // p000.Y94
    public LpmRepository get() {
        return providesLpmRepository(this.resourcesProvider.get());
    }
}
