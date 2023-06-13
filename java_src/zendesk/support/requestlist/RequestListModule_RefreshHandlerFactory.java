package zendesk.support.requestlist;
/* loaded from: classes8.dex */
public final class RequestListModule_RefreshHandlerFactory implements InterfaceC48812sj1<RequestListSyncHandler> {
    private final Y94<RequestListPresenter> presenterProvider;

    public RequestListModule_RefreshHandlerFactory(Y94<RequestListPresenter> y94) {
        this.presenterProvider = y94;
    }

    public static RequestListModule_RefreshHandlerFactory create(Y94<RequestListPresenter> y94) {
        return new RequestListModule_RefreshHandlerFactory(y94);
    }

    public static RequestListSyncHandler refreshHandler(Object obj) {
        return (RequestListSyncHandler) C51679xZ3.m5002e(RequestListModule.refreshHandler((RequestListPresenter) obj));
    }

    @Override // p000.Y94
    public RequestListSyncHandler get() {
        return refreshHandler(this.presenterProvider.get());
    }
}
