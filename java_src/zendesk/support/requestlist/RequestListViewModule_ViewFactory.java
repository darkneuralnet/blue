package zendesk.support.requestlist;
/* loaded from: classes8.dex */
public final class RequestListViewModule_ViewFactory implements InterfaceC48812sj1<RequestListView> {
    private final RequestListViewModule module;
    private final Y94<C42732iT3> picassoProvider;

    public RequestListViewModule_ViewFactory(RequestListViewModule requestListViewModule, Y94<C42732iT3> y94) {
        this.module = requestListViewModule;
        this.picassoProvider = y94;
    }

    public static RequestListViewModule_ViewFactory create(RequestListViewModule requestListViewModule, Y94<C42732iT3> y94) {
        return new RequestListViewModule_ViewFactory(requestListViewModule, y94);
    }

    public static RequestListView view(RequestListViewModule requestListViewModule, C42732iT3 c42732iT3) {
        return (RequestListView) C51679xZ3.m5002e(requestListViewModule.view(c42732iT3));
    }

    @Override // p000.Y94
    public RequestListView get() {
        return view(this.module, this.picassoProvider.get());
    }
}
