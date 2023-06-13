package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements InterfaceC48812sj1<Context> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationContextFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }

    public static Context provideApplicationContext(ZendeskApplicationModule zendeskApplicationModule) {
        return (Context) C51679xZ3.m5002e(zendeskApplicationModule.provideApplicationContext());
    }

    @Override // p000.Y94
    public Context get() {
        return provideApplicationContext(this.module);
    }
}
