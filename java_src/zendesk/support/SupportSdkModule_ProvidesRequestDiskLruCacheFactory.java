package zendesk.support;

import zendesk.core.SessionStorage;
/* loaded from: classes8.dex */
public final class SupportSdkModule_ProvidesRequestDiskLruCacheFactory implements InterfaceC48812sj1<F41> {
    private final SupportSdkModule module;
    private final Y94<SessionStorage> sessionStorageProvider;

    public SupportSdkModule_ProvidesRequestDiskLruCacheFactory(SupportSdkModule supportSdkModule, Y94<SessionStorage> y94) {
        this.module = supportSdkModule;
        this.sessionStorageProvider = y94;
    }

    public static SupportSdkModule_ProvidesRequestDiskLruCacheFactory create(SupportSdkModule supportSdkModule, Y94<SessionStorage> y94) {
        return new SupportSdkModule_ProvidesRequestDiskLruCacheFactory(supportSdkModule, y94);
    }

    public static F41 providesRequestDiskLruCache(SupportSdkModule supportSdkModule, SessionStorage sessionStorage) {
        return (F41) C51679xZ3.m5002e(supportSdkModule.providesRequestDiskLruCache(sessionStorage));
    }

    @Override // p000.Y94
    public F41 get() {
        return providesRequestDiskLruCache(this.module, this.sessionStorageProvider.get());
    }
}
