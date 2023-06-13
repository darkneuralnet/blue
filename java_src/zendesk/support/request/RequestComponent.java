package zendesk.support.request;

import dagger.Subcomponent;
@Subcomponent(modules = {RequestModule.class})
/* loaded from: classes8.dex */
public interface RequestComponent {
    void inject(RequestActivity requestActivity);

    void inject(RequestViewConversationsDisabled requestViewConversationsDisabled);

    void inject(RequestViewConversationsEnabled requestViewConversationsEnabled);
}
