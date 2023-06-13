package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory implements InterfaceC48812sj1<SharedPreferencesStorage> {
    private final Y94<Context> contextProvider;
    private final Y94<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(Y94<Context> y94, Y94<Serializer> y942) {
        this.contextProvider = y94;
        this.serializerProvider = y942;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory create(Y94<Context> y94, Y94<Serializer> y942) {
        return new ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(y94, y942);
    }

    public static SharedPreferencesStorage provideLegacyIdentityBaseStorage(Context context, Object obj) {
        return (SharedPreferencesStorage) C51679xZ3.m5002e(ZendeskStorageModule.provideLegacyIdentityBaseStorage(context, (Serializer) obj));
    }

    @Override // p000.Y94
    public SharedPreferencesStorage get() {
        return provideLegacyIdentityBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
