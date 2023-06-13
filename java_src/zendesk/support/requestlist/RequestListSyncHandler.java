package zendesk.support.requestlist;

import android.content.Context;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
/* loaded from: classes8.dex */
class RequestListSyncHandler implements ActionHandler {
    private final RequestListPresenter presenter;
    private boolean running = false;
    private boolean outdated = false;

    public RequestListSyncHandler(RequestListPresenter requestListPresenter) {
        this.presenter = requestListPresenter;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        return "request_list_refresh".equals(str);
    }

    @Override // zendesk.core.ActionHandler
    public ActionDescription getActionDescription() {
        return null;
    }

    @Override // zendesk.core.ActionHandler
    public int getPriority() {
        return 0;
    }

    @Override // zendesk.core.ActionHandler
    public void handle(Map<String, Object> map, Context context) {
        if (this.running) {
            this.presenter.refresh();
            this.outdated = false;
            return;
        }
        this.outdated = true;
    }

    public void setRunning(boolean z) {
        this.running = z;
        if (this.outdated) {
            this.presenter.refresh();
            this.outdated = false;
        }
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, AbstractC52360yi2> map) {
    }
}
