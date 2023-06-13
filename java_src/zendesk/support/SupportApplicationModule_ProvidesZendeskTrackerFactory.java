package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportApplicationModule_ProvidesZendeskTrackerFactory implements InterfaceC48812sj1<ZendeskTracker> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvidesZendeskTrackerFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvidesZendeskTrackerFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvidesZendeskTrackerFactory(supportApplicationModule);
    }

    public static ZendeskTracker providesZendeskTracker(SupportApplicationModule supportApplicationModule) {
        return (ZendeskTracker) C51679xZ3.m5002e(supportApplicationModule.providesZendeskTracker());
    }

    @Override // p000.Y94
    public ZendeskTracker get() {
        return providesZendeskTracker(this.module);
    }
}
