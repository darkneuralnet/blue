package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportSdkModule_SupportUiStorageFactory implements InterfaceC48812sj1<SupportUiStorage> {
    private final Y94<F41> diskLruCacheProvider;
    private final Y94<C46153oE1> gsonProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_SupportUiStorageFactory(SupportSdkModule supportSdkModule, Y94<F41> y94, Y94<C46153oE1> y942) {
        this.module = supportSdkModule;
        this.diskLruCacheProvider = y94;
        this.gsonProvider = y942;
    }

    public static SupportSdkModule_SupportUiStorageFactory create(SupportSdkModule supportSdkModule, Y94<F41> y94, Y94<C46153oE1> y942) {
        return new SupportSdkModule_SupportUiStorageFactory(supportSdkModule, y94, y942);
    }

    public static SupportUiStorage supportUiStorage(SupportSdkModule supportSdkModule, F41 f41, C46153oE1 c46153oE1) {
        return (SupportUiStorage) C51679xZ3.m5002e(supportSdkModule.supportUiStorage(f41, c46153oE1));
    }

    @Override // p000.Y94
    public SupportUiStorage get() {
        return supportUiStorage(this.module, this.diskLruCacheProvider.get(), this.gsonProvider.get());
    }
}
