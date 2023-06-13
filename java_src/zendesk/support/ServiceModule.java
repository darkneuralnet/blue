package zendesk.support;

import dagger.Module;
import dagger.Provides;
import zendesk.core.RestServiceProvider;
@Module
/* loaded from: classes8.dex */
class ServiceModule {
    @Provides
    public static ZendeskRequestService provideZendeskRequestService(RequestService requestService) {
        return new ZendeskRequestService(requestService);
    }

    @Provides
    public static ZendeskUploadService provideZendeskUploadService(UploadService uploadService) {
        return new ZendeskUploadService(uploadService);
    }

    @Provides
    public static RequestService providesRequestService(RestServiceProvider restServiceProvider) {
        return (RequestService) restServiceProvider.createRestService(RequestService.class, "5.0.9", "Support");
    }

    @Provides
    public static UploadService providesUploadService(RestServiceProvider restServiceProvider) {
        return (UploadService) restServiceProvider.createRestService(UploadService.class, "5.0.9", "Support");
    }
}
