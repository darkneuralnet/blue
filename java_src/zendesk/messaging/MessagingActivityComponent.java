package zendesk.messaging;

import androidx.appcompat.app.AppCompatActivity;
import dagger.BindsInstance;
import dagger.Component;
@Component(dependencies = {MessagingComponent.class}, modules = {MessagingActivityModule.class})
/* loaded from: classes8.dex */
interface MessagingActivityComponent {

    @Component.Builder
    /* loaded from: classes8.dex */
    public interface Builder {
        @BindsInstance
        Builder activity(AppCompatActivity appCompatActivity);

        MessagingActivityComponent build();

        Builder messagingComponent(MessagingComponent messagingComponent);
    }

    void inject(MessagingActivity messagingActivity);
}
