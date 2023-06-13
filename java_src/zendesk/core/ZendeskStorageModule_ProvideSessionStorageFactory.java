package zendesk.core;

import java.io.File;
import okhttp3.Cache;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideSessionStorageFactory implements InterfaceC48812sj1<SessionStorage> {
    private final Y94<BaseStorage> additionalSdkStorageProvider;
    private final Y94<File> belvedereDirProvider;
    private final Y94<File> cacheDirProvider;
    private final Y94<Cache> cacheProvider;
    private final Y94<File> dataDirProvider;
    private final Y94<IdentityStorage> identityStorageProvider;
    private final Y94<BaseStorage> mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(Y94<IdentityStorage> y94, Y94<BaseStorage> y942, Y94<BaseStorage> y943, Y94<Cache> y944, Y94<File> y945, Y94<File> y946, Y94<File> y947) {
        this.identityStorageProvider = y94;
        this.additionalSdkStorageProvider = y942;
        this.mediaCacheProvider = y943;
        this.cacheProvider = y944;
        this.cacheDirProvider = y945;
        this.dataDirProvider = y946;
        this.belvedereDirProvider = y947;
    }

    public static ZendeskStorageModule_ProvideSessionStorageFactory create(Y94<IdentityStorage> y94, Y94<BaseStorage> y942, Y94<BaseStorage> y943, Y94<Cache> y944, Y94<File> y945, Y94<File> y946, Y94<File> y947) {
        return new ZendeskStorageModule_ProvideSessionStorageFactory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static SessionStorage provideSessionStorage(Object obj, BaseStorage baseStorage, BaseStorage baseStorage2, Cache cache, File file, File file2, File file3) {
        return (SessionStorage) C51679xZ3.m5002e(ZendeskStorageModule.provideSessionStorage((IdentityStorage) obj, baseStorage, baseStorage2, cache, file, file2, file3));
    }

    @Override // p000.Y94
    public SessionStorage get() {
        return provideSessionStorage(this.identityStorageProvider.get(), this.additionalSdkStorageProvider.get(), this.mediaCacheProvider.get(), this.cacheProvider.get(), this.cacheDirProvider.get(), this.dataDirProvider.get(), this.belvedereDirProvider.get());
    }
}
