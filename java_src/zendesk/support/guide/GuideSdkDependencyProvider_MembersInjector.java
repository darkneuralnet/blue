package zendesk.support.guide;

import dagger.MembersInjector;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
/* loaded from: classes8.dex */
public final class GuideSdkDependencyProvider_MembersInjector implements MembersInjector<GuideSdkDependencyProvider> {
    private final Y94<ActionHandler> actionHandlerProvider;
    private final Y94<ActionHandlerRegistry> registryProvider;

    public GuideSdkDependencyProvider_MembersInjector(Y94<ActionHandlerRegistry> y94, Y94<ActionHandler> y942) {
        this.registryProvider = y94;
        this.actionHandlerProvider = y942;
    }

    public static MembersInjector<GuideSdkDependencyProvider> create(Y94<ActionHandlerRegistry> y94, Y94<ActionHandler> y942) {
        return new GuideSdkDependencyProvider_MembersInjector(y94, y942);
    }

    public static void injectActionHandler(Object obj, ActionHandler actionHandler) {
        ((GuideSdkDependencyProvider) obj).actionHandler = actionHandler;
    }

    public static void injectRegistry(Object obj, ActionHandlerRegistry actionHandlerRegistry) {
        ((GuideSdkDependencyProvider) obj).registry = actionHandlerRegistry;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GuideSdkDependencyProvider guideSdkDependencyProvider) {
        injectRegistry(guideSdkDependencyProvider, this.registryProvider.get());
        injectActionHandler(guideSdkDependencyProvider, this.actionHandlerProvider.get());
    }
}
