package zendesk.support;

import dagger.Component;
import zendesk.core.CoreModule;
@Component(modules = {CoreModule.class, GuideProviderModule.class})
/* loaded from: classes8.dex */
interface GuideSdkProvidersComponent {
    Guide inject(Guide guide);
}
