package zendesk.support;

import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;
/* loaded from: classes8.dex */
public final class StorageModule_ProvideRequestStorageFactory implements InterfaceC48812sj1<RequestStorage> {
    private final Y94<SessionStorage> baseStorageProvider;
    private final Y94<MemoryCache> memoryCacheProvider;
    private final StorageModule module;
    private final Y94<RequestMigrator> requestMigratorProvider;

    public StorageModule_ProvideRequestStorageFactory(StorageModule storageModule, Y94<SessionStorage> y94, Y94<RequestMigrator> y942, Y94<MemoryCache> y943) {
        this.module = storageModule;
        this.baseStorageProvider = y94;
        this.requestMigratorProvider = y942;
        this.memoryCacheProvider = y943;
    }

    public static StorageModule_ProvideRequestStorageFactory create(StorageModule storageModule, Y94<SessionStorage> y94, Y94<RequestMigrator> y942, Y94<MemoryCache> y943) {
        return new StorageModule_ProvideRequestStorageFactory(storageModule, y94, y942, y943);
    }

    public static RequestStorage provideRequestStorage(StorageModule storageModule, SessionStorage sessionStorage, Object obj, MemoryCache memoryCache) {
        return (RequestStorage) C51679xZ3.m5002e(storageModule.provideRequestStorage(sessionStorage, (RequestMigrator) obj, memoryCache));
    }

    @Override // p000.Y94
    public RequestStorage get() {
        return provideRequestStorage(this.module, this.baseStorageProvider.get(), this.requestMigratorProvider.get(), this.memoryCacheProvider.get());
    }
}
