package zendesk.messaging;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C31098b;
import zendesk.messaging.components.DateProvider;
@Module
/* loaded from: classes8.dex */
abstract class MessagingActivityModule {
    @Provides
    public static C31098b belvedereUi(AppCompatActivity appCompatActivity) {
        return BelvedereUi.m865b(appCompatActivity);
    }

    @Provides
    public static DateProvider dateProvider() {
        return new DateProvider();
    }

    @Provides
    public static Handler handler() {
        return new Handler(Looper.getMainLooper());
    }

    @Provides
    public static boolean multilineResponseOptionsEnabled(MessagingComponent messagingComponent) {
        return messagingComponent.messagingConfiguration().isMultilineResponseOptionsEnabled();
    }

    @Binds
    public abstract EventListener eventListener(MessagingViewModel messagingViewModel);
}
