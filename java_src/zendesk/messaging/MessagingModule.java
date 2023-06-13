package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;
import p000.C42732iT3;
import zendesk.belvedere.C31096a;
@Module
/* loaded from: classes8.dex */
abstract class MessagingModule {
    @Provides
    public static C31096a belvedere(Context context) {
        return C31096a.m764c(context);
    }

    @Provides
    public static C42732iT3 picasso(Context context) {
        return new C42732iT3.C23262b(context).m33872a();
    }

    @Provides
    public static Resources resources(Context context) {
        return context.getResources();
    }
}
