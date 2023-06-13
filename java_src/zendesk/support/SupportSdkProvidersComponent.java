package zendesk.support;

import dagger.Component;
import zendesk.core.CoreModule;
/* JADX INFO: Access modifiers changed from: package-private */
@Component(modules = {SupportApplicationModule.class, CoreModule.class, ServiceModule.class, ProviderModule.class, GuideModule.class, StorageModule.class})
/* loaded from: classes8.dex */
public interface SupportSdkProvidersComponent {
    Support inject(Support support);
}
