package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements InterfaceC48812sj1<ActionHandlerRegistry> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

        private InstanceHolder() {
        }
    }

    public static ActionHandlerRegistry actionHandlerRegistry() {
        return (ActionHandlerRegistry) C51679xZ3.m5002e(ZendeskProvidersModule.actionHandlerRegistry());
    }

    public static ZendeskProvidersModule_ActionHandlerRegistryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    @Override // p000.Y94
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry();
    }
}
