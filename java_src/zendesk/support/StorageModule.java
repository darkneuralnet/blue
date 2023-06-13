package zendesk.support;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;
/* JADX INFO: Access modifiers changed from: package-private */
@Module
/* loaded from: classes8.dex */
public class StorageModule {
    private static final String LEGACY_REQUEST_STORAGE_PREFS_NAME = "zendesk-authorization";

    @Provides
    public RequestMigrator provideRequestMigrator(Context context) {
        return new LegacyRequestMigrator(context.getSharedPreferences(LEGACY_REQUEST_STORAGE_PREFS_NAME, 0));
    }

    @Provides
    public RequestSessionCache provideRequestSessionCache() {
        return new ZendeskRequestSessionCache();
    }

    @Provides
    public RequestStorage provideRequestStorage(SessionStorage sessionStorage, RequestMigrator requestMigrator, MemoryCache memoryCache) {
        return new ZendeskRequestStorage(sessionStorage.getAdditionalSdkStorage(), requestMigrator, memoryCache);
    }
}
