package zendesk.support.requestlist;
/* loaded from: classes8.dex */
public final class RequestListModule_PresenterFactory implements InterfaceC48812sj1<RequestListPresenter> {
    private final Y94<RequestListModel> modelProvider;
    private final RequestListModule module;

    public RequestListModule_PresenterFactory(RequestListModule requestListModule, Y94<RequestListModel> y94) {
        this.module = requestListModule;
        this.modelProvider = y94;
    }

    public static RequestListModule_PresenterFactory create(RequestListModule requestListModule, Y94<RequestListModel> y94) {
        return new RequestListModule_PresenterFactory(requestListModule, y94);
    }

    public static RequestListPresenter presenter(RequestListModule requestListModule, Object obj) {
        return (RequestListPresenter) C51679xZ3.m5002e(requestListModule.presenter((RequestListModel) obj));
    }

    @Override // p000.Y94
    public RequestListPresenter get() {
        return presenter(this.module, this.modelProvider.get());
    }
}
