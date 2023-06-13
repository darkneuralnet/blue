package zendesk.support;

import java.util.Locale;
/* loaded from: classes8.dex */
public final class SupportApplicationModule_ProvideLocaleFactory implements InterfaceC48812sj1<Locale> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideLocaleFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvideLocaleFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvideLocaleFactory(supportApplicationModule);
    }

    public static Locale provideLocale(SupportApplicationModule supportApplicationModule) {
        return (Locale) C51679xZ3.m5002e(supportApplicationModule.provideLocale());
    }

    @Override // p000.Y94
    public Locale get() {
        return provideLocale(this.module);
    }
}
