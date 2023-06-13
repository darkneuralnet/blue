package zendesk.support;

import dagger.MembersInjector;
import java.util.List;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
/* loaded from: classes8.dex */
public final class SdkDependencyProvider_MembersInjector implements MembersInjector<SdkDependencyProvider> {
    private final Y94<List<ActionHandler>> actionHandlersProvider;
    private final Y94<ActionHandlerRegistry> registryProvider;

    public SdkDependencyProvider_MembersInjector(Y94<ActionHandlerRegistry> y94, Y94<List<ActionHandler>> y942) {
        this.registryProvider = y94;
        this.actionHandlersProvider = y942;
    }

    public static MembersInjector<SdkDependencyProvider> create(Y94<ActionHandlerRegistry> y94, Y94<List<ActionHandler>> y942) {
        return new SdkDependencyProvider_MembersInjector(y94, y942);
    }

    public static void injectActionHandlers(SdkDependencyProvider sdkDependencyProvider, List<ActionHandler> list) {
        sdkDependencyProvider.actionHandlers = list;
    }

    public static void injectRegistry(SdkDependencyProvider sdkDependencyProvider, ActionHandlerRegistry actionHandlerRegistry) {
        sdkDependencyProvider.registry = actionHandlerRegistry;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SdkDependencyProvider sdkDependencyProvider) {
        injectRegistry(sdkDependencyProvider, this.registryProvider.get());
        injectActionHandlers(sdkDependencyProvider, this.actionHandlersProvider.get());
    }
}
