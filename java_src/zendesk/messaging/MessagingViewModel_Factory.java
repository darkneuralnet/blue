package zendesk.messaging;
/* loaded from: classes8.dex */
public final class MessagingViewModel_Factory implements InterfaceC48812sj1<MessagingViewModel> {
    private final Y94<MessagingModel> messagingModelProvider;

    public MessagingViewModel_Factory(Y94<MessagingModel> y94) {
        this.messagingModelProvider = y94;
    }

    public static MessagingViewModel_Factory create(Y94<MessagingModel> y94) {
        return new MessagingViewModel_Factory(y94);
    }

    public static MessagingViewModel newInstance(Object obj) {
        return new MessagingViewModel((MessagingModel) obj);
    }

    @Override // p000.Y94
    public MessagingViewModel get() {
        return newInstance(this.messagingModelProvider.get());
    }
}
