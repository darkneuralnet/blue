package zendesk.support;

import dagger.Component;
import zendesk.core.CoreModule;
import zendesk.support.request.RequestComponent;
import zendesk.support.request.RequestModule;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListModule;
import zendesk.support.requestlist.RequestListViewModule;
@Component(modules = {CoreModule.class, SupportModule.class, SupportSdkModule.class})
/* loaded from: classes8.dex */
public interface SupportSdkComponent {
    public static final String SUPPORT_MAIN_THREAD_EXECUTOR = "SUPPORT_MAIN_THREAD_EXECUTOR";

    void inject(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver);

    void inject(SdkDependencyProvider sdkDependencyProvider);

    RequestComponent plus(RequestModule requestModule);

    RequestListComponent plus(RequestListModule requestListModule, RequestListViewModule requestListViewModule);
}
