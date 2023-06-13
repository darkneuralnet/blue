package zendesk.support.requestlist;

import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;
/* loaded from: classes8.dex */
public final class RequestListActivity_MembersInjector implements MembersInjector<RequestListActivity> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<RequestListModel> modelProvider;
    private final Y94<RequestListPresenter> presenterProvider;
    private final Y94<RequestListSyncHandler> syncHandlerProvider;
    private final Y94<RequestListView> viewProvider;

    public RequestListActivity_MembersInjector(Y94<RequestListPresenter> y94, Y94<RequestListView> y942, Y94<RequestListModel> y943, Y94<ActionHandlerRegistry> y944, Y94<RequestListSyncHandler> y945) {
        this.presenterProvider = y94;
        this.viewProvider = y942;
        this.modelProvider = y943;
        this.actionHandlerRegistryProvider = y944;
        this.syncHandlerProvider = y945;
    }

    public static MembersInjector<RequestListActivity> create(Y94<RequestListPresenter> y94, Y94<RequestListView> y942, Y94<RequestListModel> y943, Y94<ActionHandlerRegistry> y944, Y94<RequestListSyncHandler> y945) {
        return new RequestListActivity_MembersInjector(y94, y942, y943, y944, y945);
    }

    public static void injectActionHandlerRegistry(RequestListActivity requestListActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestListActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectModel(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.model = (RequestListModel) obj;
    }

    public static void injectPresenter(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.presenter = (RequestListPresenter) obj;
    }

    public static void injectSyncHandler(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.syncHandler = (RequestListSyncHandler) obj;
    }

    public static void injectView(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.view = (RequestListView) obj;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RequestListActivity requestListActivity) {
        injectPresenter(requestListActivity, this.presenterProvider.get());
        injectView(requestListActivity, this.viewProvider.get());
        injectModel(requestListActivity, this.modelProvider.get());
        injectActionHandlerRegistry(requestListActivity, this.actionHandlerRegistryProvider.get());
        injectSyncHandler(requestListActivity, this.syncHandlerProvider.get());
    }
}
