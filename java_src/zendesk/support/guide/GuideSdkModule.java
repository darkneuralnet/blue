package zendesk.support.guide;

import dagger.Module;
import dagger.Provides;
import zendesk.core.ActionHandler;
/* JADX INFO: Access modifiers changed from: package-private */
@Module
/* loaded from: classes8.dex */
public class GuideSdkModule {
    @Provides
    public static ActionHandler viewArticleActionHandler() {
        return new ViewArticleActionHandler();
    }

    @Provides
    public C32054Bx0 configurationHelper() {
        return new C32054Bx0();
    }
}
