package zendesk.support.request;

import zendesk.belvedere.C31096a;
import zendesk.support.request.AttachmentDownloaderComponent;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesAttachmentDownloaderFactory implements InterfaceC48812sj1<AttachmentDownloaderComponent.AttachmentDownloader> {
    private final Y94<AttachmentDownloadService> attachmentToDiskServiceProvider;
    private final Y94<C31096a> belvedereProvider;

    public RequestModule_ProvidesAttachmentDownloaderFactory(Y94<C31096a> y94, Y94<AttachmentDownloadService> y942) {
        this.belvedereProvider = y94;
        this.attachmentToDiskServiceProvider = y942;
    }

    public static RequestModule_ProvidesAttachmentDownloaderFactory create(Y94<C31096a> y94, Y94<AttachmentDownloadService> y942) {
        return new RequestModule_ProvidesAttachmentDownloaderFactory(y94, y942);
    }

    public static AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader(C31096a c31096a, Object obj) {
        return (AttachmentDownloaderComponent.AttachmentDownloader) C51679xZ3.m5002e(RequestModule.providesAttachmentDownloader(c31096a, (AttachmentDownloadService) obj));
    }

    @Override // p000.Y94
    public AttachmentDownloaderComponent.AttachmentDownloader get() {
        return providesAttachmentDownloader(this.belvedereProvider.get(), this.attachmentToDiskServiceProvider.get());
    }
}
