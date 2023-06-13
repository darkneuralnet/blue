package zendesk.support;

import android.content.Context;
/* loaded from: classes8.dex */
public final class SupportApplicationModule_ProvideMetadataFactory implements InterfaceC48812sj1<SupportSdkMetadata> {
    private final Y94<Context> contextProvider;
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideMetadataFactory(SupportApplicationModule supportApplicationModule, Y94<Context> y94) {
        this.module = supportApplicationModule;
        this.contextProvider = y94;
    }

    public static SupportApplicationModule_ProvideMetadataFactory create(SupportApplicationModule supportApplicationModule, Y94<Context> y94) {
        return new SupportApplicationModule_ProvideMetadataFactory(supportApplicationModule, y94);
    }

    public static SupportSdkMetadata provideMetadata(SupportApplicationModule supportApplicationModule, Context context) {
        return (SupportSdkMetadata) C51679xZ3.m5002e(supportApplicationModule.provideMetadata(context));
    }

    @Override // p000.Y94
    public SupportSdkMetadata get() {
        return provideMetadata(this.module, this.contextProvider.get());
    }
}
