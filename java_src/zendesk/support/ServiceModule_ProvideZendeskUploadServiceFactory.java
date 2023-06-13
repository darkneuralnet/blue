package zendesk.support;
/* loaded from: classes8.dex */
public final class ServiceModule_ProvideZendeskUploadServiceFactory implements InterfaceC48812sj1<ZendeskUploadService> {
    private final Y94<UploadService> uploadServiceProvider;

    public ServiceModule_ProvideZendeskUploadServiceFactory(Y94<UploadService> y94) {
        this.uploadServiceProvider = y94;
    }

    public static ServiceModule_ProvideZendeskUploadServiceFactory create(Y94<UploadService> y94) {
        return new ServiceModule_ProvideZendeskUploadServiceFactory(y94);
    }

    public static ZendeskUploadService provideZendeskUploadService(Object obj) {
        return (ZendeskUploadService) C51679xZ3.m5002e(ServiceModule.provideZendeskUploadService((UploadService) obj));
    }

    @Override // p000.Y94
    public ZendeskUploadService get() {
        return provideZendeskUploadService(this.uploadServiceProvider.get());
    }
}
