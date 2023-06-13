package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideSettingsBaseStorageFactory implements InterfaceC48812sj1<BaseStorage> {
    private final Y94<Context> contextProvider;
    private final Y94<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSettingsBaseStorageFactory(Y94<Context> y94, Y94<Serializer> y942) {
        this.contextProvider = y94;
        this.serializerProvider = y942;
    }

    public static ZendeskStorageModule_ProvideSettingsBaseStorageFactory create(Y94<Context> y94, Y94<Serializer> y942) {
        return new ZendeskStorageModule_ProvideSettingsBaseStorageFactory(y94, y942);
    }

    public static BaseStorage provideSettingsBaseStorage(Context context, Object obj) {
        return (BaseStorage) C51679xZ3.m5002e(ZendeskStorageModule.provideSettingsBaseStorage(context, (Serializer) obj));
    }

    @Override // p000.Y94
    public BaseStorage get() {
        return provideSettingsBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
