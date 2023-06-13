package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class CoreModule_GetApplicationContextFactory implements InterfaceC48812sj1<Context> {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationContextFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }

    public static Context getApplicationContext(CoreModule coreModule) {
        return (Context) C51679xZ3.m5002e(coreModule.getApplicationContext());
    }

    @Override // p000.Y94
    public Context get() {
        return getApplicationContext(this.module);
    }
}
