package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;
import dagger.BindsInstance;
import dagger.Component;
import java.util.List;
import zendesk.belvedere.C31096a;
/* JADX INFO: Access modifiers changed from: package-private */
@Component(modules = {MessagingModule.class})
/* loaded from: classes8.dex */
public interface MessagingComponent {

    @Component.Builder
    /* loaded from: classes8.dex */
    public interface Builder {
        @BindsInstance
        Builder appContext(Context context);

        MessagingComponent build();

        @BindsInstance
        Builder engines(List<Engine> list);

        @BindsInstance
        Builder messagingConfiguration(MessagingConfiguration messagingConfiguration);
    }

    C31096a belvedere();

    BelvedereMediaHolder belvedereMediaHolder();

    MessagingConfiguration messagingConfiguration();

    MessagingViewModel messagingViewModel();

    C42732iT3 picasso();

    Resources resources();
}
