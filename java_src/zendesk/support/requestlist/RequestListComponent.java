package zendesk.support.requestlist;

import dagger.Subcomponent;
@Subcomponent(modules = {RequestListModule.class, RequestListViewModule.class})
/* loaded from: classes8.dex */
public interface RequestListComponent {
    void inject(RequestListActivity requestListActivity);
}
