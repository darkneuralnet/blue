package zendesk.support;
/* loaded from: classes8.dex */
public final class ServiceModule_ProvideZendeskRequestServiceFactory implements InterfaceC48812sj1<ZendeskRequestService> {
    private final Y94<RequestService> requestServiceProvider;

    public ServiceModule_ProvideZendeskRequestServiceFactory(Y94<RequestService> y94) {
        this.requestServiceProvider = y94;
    }

    public static ServiceModule_ProvideZendeskRequestServiceFactory create(Y94<RequestService> y94) {
        return new ServiceModule_ProvideZendeskRequestServiceFactory(y94);
    }

    public static ZendeskRequestService provideZendeskRequestService(Object obj) {
        return (ZendeskRequestService) C51679xZ3.m5002e(ServiceModule.provideZendeskRequestService((RequestService) obj));
    }

    @Override // p000.Y94
    public ZendeskRequestService get() {
        return provideZendeskRequestService(this.requestServiceProvider.get());
    }
}
