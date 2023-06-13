package zendesk.messaging;

import android.content.res.Resources;
import java.util.List;
/* loaded from: classes8.dex */
public final class MessagingModel_Factory implements InterfaceC48812sj1<MessagingModel> {
    private final Y94<MessagingConversationLog> conversationLogProvider;
    private final Y94<List<Engine>> enginesProvider;
    private final Y94<MessagingConfiguration> messagingConfigurationProvider;
    private final Y94<Resources> resourcesProvider;

    public MessagingModel_Factory(Y94<Resources> y94, Y94<List<Engine>> y942, Y94<MessagingConfiguration> y943, Y94<MessagingConversationLog> y944) {
        this.resourcesProvider = y94;
        this.enginesProvider = y942;
        this.messagingConfigurationProvider = y943;
        this.conversationLogProvider = y944;
    }

    public static MessagingModel_Factory create(Y94<Resources> y94, Y94<List<Engine>> y942, Y94<MessagingConfiguration> y943, Y94<MessagingConversationLog> y944) {
        return new MessagingModel_Factory(y94, y942, y943, y944);
    }

    public static MessagingModel newInstance(Resources resources, List<Engine> list, MessagingConfiguration messagingConfiguration, Object obj) {
        return new MessagingModel(resources, list, messagingConfiguration, (MessagingConversationLog) obj);
    }

    @Override // p000.Y94
    public MessagingModel get() {
        return newInstance(this.resourcesProvider.get(), this.enginesProvider.get(), this.messagingConfigurationProvider.get(), this.conversationLogProvider.get());
    }
}
