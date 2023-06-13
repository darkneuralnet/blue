package zendesk.messaging;
/* loaded from: classes8.dex */
public final class MessagingActivityModule_MultilineResponseOptionsEnabledFactory implements InterfaceC48812sj1<Boolean> {
    private final Y94<MessagingComponent> messagingComponentProvider;

    public MessagingActivityModule_MultilineResponseOptionsEnabledFactory(Y94<MessagingComponent> y94) {
        this.messagingComponentProvider = y94;
    }

    public static MessagingActivityModule_MultilineResponseOptionsEnabledFactory create(Y94<MessagingComponent> y94) {
        return new MessagingActivityModule_MultilineResponseOptionsEnabledFactory(y94);
    }

    public static boolean multilineResponseOptionsEnabled(Object obj) {
        return MessagingActivityModule.multilineResponseOptionsEnabled((MessagingComponent) obj);
    }

    @Override // p000.Y94
    public Boolean get() {
        return Boolean.valueOf(multilineResponseOptionsEnabled(this.messagingComponentProvider.get()));
    }
}
