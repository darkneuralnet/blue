package zendesk.support;

import zendesk.core.RestServiceProvider;
/* loaded from: classes8.dex */
public final class ServiceModule_ProvidesUploadServiceFactory implements InterfaceC48812sj1<UploadService> {
    private final Y94<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesUploadServiceFactory(Y94<RestServiceProvider> y94) {
        this.restServiceProvider = y94;
    }

    public static ServiceModule_ProvidesUploadServiceFactory create(Y94<RestServiceProvider> y94) {
        return new ServiceModule_ProvidesUploadServiceFactory(y94);
    }

    public static UploadService providesUploadService(RestServiceProvider restServiceProvider) {
        return (UploadService) C51679xZ3.m5002e(ServiceModule.providesUploadService(restServiceProvider));
    }

    @Override // p000.Y94
    public UploadService get() {
        return providesUploadService(this.restServiceProvider.get());
    }
}
