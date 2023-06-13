package zendesk.support;

import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;
/* loaded from: classes8.dex */
public final class DeepLinkingBroadcastReceiver_MembersInjector implements MembersInjector<DeepLinkingBroadcastReceiver> {
    private final Y94<ActionHandlerRegistry> registryProvider;

    public DeepLinkingBroadcastReceiver_MembersInjector(Y94<ActionHandlerRegistry> y94) {
        this.registryProvider = y94;
    }

    public static MembersInjector<DeepLinkingBroadcastReceiver> create(Y94<ActionHandlerRegistry> y94) {
        return new DeepLinkingBroadcastReceiver_MembersInjector(y94);
    }

    public static void injectRegistry(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver, ActionHandlerRegistry actionHandlerRegistry) {
        deepLinkingBroadcastReceiver.registry = actionHandlerRegistry;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        injectRegistry(deepLinkingBroadcastReceiver, this.registryProvider.get());
    }
}
