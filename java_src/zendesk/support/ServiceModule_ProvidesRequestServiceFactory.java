package zendesk.support;

import zendesk.core.RestServiceProvider;
/* loaded from: classes8.dex */
public final class ServiceModule_ProvidesRequestServiceFactory implements InterfaceC48812sj1<RequestService> {
    private final Y94<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesRequestServiceFactory(Y94<RestServiceProvider> y94) {
        this.restServiceProvider = y94;
    }

    public static ServiceModule_ProvidesRequestServiceFactory create(Y94<RestServiceProvider> y94) {
        return new ServiceModule_ProvidesRequestServiceFactory(y94);
    }

    public static RequestService providesRequestService(RestServiceProvider restServiceProvider) {
        return (RequestService) C51679xZ3.m5002e(ServiceModule.providesRequestService(restServiceProvider));
    }

    @Override // p000.Y94
    public RequestService get() {
        return providesRequestService(this.restServiceProvider.get());
    }
}
