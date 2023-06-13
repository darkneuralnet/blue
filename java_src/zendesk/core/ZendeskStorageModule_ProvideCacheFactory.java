package zendesk.core;

import java.io.File;
import okhttp3.Cache;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideCacheFactory implements InterfaceC48812sj1<Cache> {
    private final Y94<File> fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(Y94<File> y94) {
        this.fileProvider = y94;
    }

    public static ZendeskStorageModule_ProvideCacheFactory create(Y94<File> y94) {
        return new ZendeskStorageModule_ProvideCacheFactory(y94);
    }

    public static Cache provideCache(File file) {
        return (Cache) C51679xZ3.m5002e(ZendeskStorageModule.provideCache(file));
    }

    @Override // p000.Y94
    public Cache get() {
        return provideCache(this.fileProvider.get());
    }
}
