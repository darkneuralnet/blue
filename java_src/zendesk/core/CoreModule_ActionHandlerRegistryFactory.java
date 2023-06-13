package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_ActionHandlerRegistryFactory implements InterfaceC48812sj1<ActionHandlerRegistry> {
    private final CoreModule module;

    public CoreModule_ActionHandlerRegistryFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static ActionHandlerRegistry actionHandlerRegistry(CoreModule coreModule) {
        return (ActionHandlerRegistry) C51679xZ3.m5002e(coreModule.actionHandlerRegistry());
    }

    public static CoreModule_ActionHandlerRegistryFactory create(CoreModule coreModule) {
        return new CoreModule_ActionHandlerRegistryFactory(coreModule);
    }

    @Override // p000.Y94
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry(this.module);
    }
}
