package zendesk.support.guide;

import dagger.Component;
import zendesk.core.CoreModule;
import zendesk.support.GuideModule;
/* JADX INFO: Access modifiers changed from: package-private */
@Component(modules = {CoreModule.class, GuideModule.class, GuideSdkModule.class})
/* loaded from: classes8.dex */
public interface GuideSdkComponent {
    void inject(GuideSdkDependencyProvider guideSdkDependencyProvider);

    void inject(HelpCenterActivity helpCenterActivity);

    void inject(HelpCenterFragment helpCenterFragment);

    void inject(ViewArticleActivity viewArticleActivity);
}
