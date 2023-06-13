package zendesk.core;

import dagger.Component;
/* JADX INFO: Access modifiers changed from: package-private */
@Component(modules = {ZendeskApplicationModule.class, ZendeskStorageModule.class, ZendeskProvidersModule.class, ZendeskNetworkModule.class})
/* loaded from: classes8.dex */
public interface ZendeskApplicationComponent {
    ZendeskShadow zendeskShadow();
}
