package zendesk.support;

import android.content.Context;
/* loaded from: classes8.dex */
public final class StorageModule_ProvideRequestMigratorFactory implements InterfaceC48812sj1<RequestMigrator> {
    private final Y94<Context> contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideRequestMigratorFactory(StorageModule storageModule, Y94<Context> y94) {
        this.module = storageModule;
        this.contextProvider = y94;
    }

    public static StorageModule_ProvideRequestMigratorFactory create(StorageModule storageModule, Y94<Context> y94) {
        return new StorageModule_ProvideRequestMigratorFactory(storageModule, y94);
    }

    public static RequestMigrator provideRequestMigrator(StorageModule storageModule, Context context) {
        return (RequestMigrator) C51679xZ3.m5002e(storageModule.provideRequestMigrator(context));
    }

    @Override // p000.Y94
    public RequestMigrator get() {
        return provideRequestMigrator(this.module, this.contextProvider.get());
    }
}
