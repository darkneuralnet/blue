package zendesk.support.request;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesComponentListenerFactory implements InterfaceC48812sj1<HeadlessComponentListener> {
    private final Y94<AttachmentDownloaderComponent> attachmentDownloaderProvider;
    private final Y94<ComponentPersistence> persistenceProvider;
    private final Y94<ComponentUpdateActionHandlers> updatesComponentProvider;

    public RequestModule_ProvidesComponentListenerFactory(Y94<ComponentPersistence> y94, Y94<AttachmentDownloaderComponent> y942, Y94<ComponentUpdateActionHandlers> y943) {
        this.persistenceProvider = y94;
        this.attachmentDownloaderProvider = y942;
        this.updatesComponentProvider = y943;
    }

    public static RequestModule_ProvidesComponentListenerFactory create(Y94<ComponentPersistence> y94, Y94<AttachmentDownloaderComponent> y942, Y94<ComponentUpdateActionHandlers> y943) {
        return new RequestModule_ProvidesComponentListenerFactory(y94, y942, y943);
    }

    public static HeadlessComponentListener providesComponentListener(Object obj, Object obj2, Object obj3) {
        return (HeadlessComponentListener) C51679xZ3.m5002e(RequestModule.providesComponentListener((ComponentPersistence) obj, (AttachmentDownloaderComponent) obj2, (ComponentUpdateActionHandlers) obj3));
    }

    @Override // p000.Y94
    public HeadlessComponentListener get() {
        return providesComponentListener(this.persistenceProvider.get(), this.attachmentDownloaderProvider.get(), this.updatesComponentProvider.get());
    }
}
