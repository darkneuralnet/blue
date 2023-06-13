package zendesk.support.requestlist;

import dagger.Module;
import dagger.Provides;
@Module
/* loaded from: classes8.dex */
public class RequestListViewModule {
    private final RequestListActivity activity;
    private final RequestListConfiguration config;

    public RequestListViewModule(RequestListActivity requestListActivity, RequestListConfiguration requestListConfiguration) {
        this.activity = requestListActivity;
        this.config = requestListConfiguration;
    }

    @Provides
    public RequestListView view(C42732iT3 c42732iT3) {
        return new RequestListView(this.activity, this.config, c42732iT3);
    }
}
