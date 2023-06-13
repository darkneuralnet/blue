package zendesk.support;

import java.util.List;
import zendesk.core.ActionHandler;
/* loaded from: classes8.dex */
public final class SupportSdkModule_ProvidesActionHandlersFactory implements InterfaceC48812sj1<List<ActionHandler>> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesActionHandlersFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_ProvidesActionHandlersFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesActionHandlersFactory(supportSdkModule);
    }

    public static List<ActionHandler> providesActionHandlers(SupportSdkModule supportSdkModule) {
        return (List) C51679xZ3.m5002e(supportSdkModule.providesActionHandlers());
    }

    @Override // p000.Y94
    public List<ActionHandler> get() {
        return providesActionHandlers(this.module);
    }
}
