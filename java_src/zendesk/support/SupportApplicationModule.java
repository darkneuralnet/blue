package zendesk.support;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
@Module
/* loaded from: classes8.dex */
public class SupportApplicationModule {
    private ApplicationScope applicationScope;

    public SupportApplicationModule(ApplicationScope applicationScope) {
        this.applicationScope = applicationScope;
    }

    @Provides
    public Locale provideLocale() {
        return this.applicationScope.getLocale();
    }

    @Provides
    public SupportSdkMetadata provideMetadata(Context context) {
        return new SupportSdkMetadata(context);
    }

    @Provides
    public ZendeskTracker providesZendeskTracker() {
        return this.applicationScope.getZendeskTracker();
    }
}
