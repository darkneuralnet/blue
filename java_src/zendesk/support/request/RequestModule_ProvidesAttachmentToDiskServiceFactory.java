package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesAttachmentToDiskServiceFactory implements InterfaceC48812sj1<AttachmentDownloadService> {
    private final Y94<ExecutorService> executorProvider;
    private final Y94<OkHttpClient> okHttpClientProvider;

    public RequestModule_ProvidesAttachmentToDiskServiceFactory(Y94<OkHttpClient> y94, Y94<ExecutorService> y942) {
        this.okHttpClientProvider = y94;
        this.executorProvider = y942;
    }

    public static RequestModule_ProvidesAttachmentToDiskServiceFactory create(Y94<OkHttpClient> y94, Y94<ExecutorService> y942) {
        return new RequestModule_ProvidesAttachmentToDiskServiceFactory(y94, y942);
    }

    public static AttachmentDownloadService providesAttachmentToDiskService(OkHttpClient okHttpClient, ExecutorService executorService) {
        return (AttachmentDownloadService) C51679xZ3.m5002e(RequestModule.providesAttachmentToDiskService(okHttpClient, executorService));
    }

    @Override // p000.Y94
    public AttachmentDownloadService get() {
        return providesAttachmentToDiskService(this.okHttpClientProvider.get(), this.executorProvider.get());
    }
}
