package zendesk.support.request;

import zendesk.support.request.AttachmentDownloaderComponent;
import zendesk.support.suas.Dispatcher;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesAttachmentDownloaderComponentFactory implements InterfaceC48812sj1<AttachmentDownloaderComponent> {
    private final Y94<ActionFactory> actionFactoryProvider;
    private final Y94<AttachmentDownloaderComponent.AttachmentDownloader> attachmentDownloaderProvider;
    private final Y94<Dispatcher> dispatcherProvider;

    public RequestModule_ProvidesAttachmentDownloaderComponentFactory(Y94<Dispatcher> y94, Y94<ActionFactory> y942, Y94<AttachmentDownloaderComponent.AttachmentDownloader> y943) {
        this.dispatcherProvider = y94;
        this.actionFactoryProvider = y942;
        this.attachmentDownloaderProvider = y943;
    }

    public static RequestModule_ProvidesAttachmentDownloaderComponentFactory create(Y94<Dispatcher> y94, Y94<ActionFactory> y942, Y94<AttachmentDownloaderComponent.AttachmentDownloader> y943) {
        return new RequestModule_ProvidesAttachmentDownloaderComponentFactory(y94, y942, y943);
    }

    public static AttachmentDownloaderComponent providesAttachmentDownloaderComponent(Dispatcher dispatcher, Object obj, Object obj2) {
        return (AttachmentDownloaderComponent) C51679xZ3.m5002e(RequestModule.providesAttachmentDownloaderComponent(dispatcher, (ActionFactory) obj, (AttachmentDownloaderComponent.AttachmentDownloader) obj2));
    }

    @Override // p000.Y94
    public AttachmentDownloaderComponent get() {
        return providesAttachmentDownloaderComponent(this.dispatcherProvider.get(), this.actionFactoryProvider.get(), this.attachmentDownloaderProvider.get());
    }
}
