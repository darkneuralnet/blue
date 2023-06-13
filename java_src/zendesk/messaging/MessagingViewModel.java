package zendesk.messaging;

import androidx.lifecycle.LiveData;
import java.util.List;
import zendesk.messaging.Update;
import zendesk.messaging.p061ui.MessagingState;
/* loaded from: classes8.dex */
public class MessagingViewModel extends AbstractC35048Or6 implements EventListener {
    private final MP2<Banner> liveBannersState;
    private final MP2<DialogContent> liveDialogState;
    private final MP2<MessagingState> liveMessagingState;
    private final LiveData<Update.Action.Navigation> liveNavigationStream;
    private final MessagingModel messagingModel;

    public MessagingViewModel(MessagingModel messagingModel) {
        this.messagingModel = messagingModel;
        MP2<MessagingState> mp2 = new MP2<>();
        this.liveMessagingState = mp2;
        this.liveNavigationStream = messagingModel.getLiveNavigationUpdates();
        mp2.setValue(new MessagingState.Builder().withEnabled(true).build());
        MP2<Banner> mp22 = new MP2<>();
        this.liveBannersState = mp22;
        this.liveDialogState = new MP2<>();
        mp2.mo95315b(messagingModel.getLiveMessagingItems(), new InterfaceC41056fe3<List<MessagingItem>>() { // from class: zendesk.messaging.MessagingViewModel.1
            @Override // p000.InterfaceC41056fe3
            public void onChanged(List<MessagingItem> list) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withMessagingItems(list).build());
            }
        });
        mp2.mo95315b(messagingModel.getLiveComposerEnabled(), new InterfaceC41056fe3<Boolean>() { // from class: zendesk.messaging.MessagingViewModel.2
            @Override // p000.InterfaceC41056fe3
            public void onChanged(Boolean bool) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withEnabled(bool.booleanValue()).build());
            }
        });
        mp2.mo95315b(messagingModel.getLiveTyping(), new InterfaceC41056fe3<Typing>() { // from class: zendesk.messaging.MessagingViewModel.3
            @Override // p000.InterfaceC41056fe3
            public void onChanged(Typing typing) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withTypingIndicatorState(new MessagingState.TypingState(typing.isTyping(), typing.getAgentDetails())).build());
            }
        });
        mp2.mo95315b(messagingModel.getLiveConnection(), new InterfaceC41056fe3<ConnectionState>() { // from class: zendesk.messaging.MessagingViewModel.4
            @Override // p000.InterfaceC41056fe3
            public void onChanged(ConnectionState connectionState) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withConnectionState(connectionState).build());
            }
        });
        mp2.mo95315b(messagingModel.getLiveComposerHint(), new InterfaceC41056fe3<String>() { // from class: zendesk.messaging.MessagingViewModel.5
            @Override // p000.InterfaceC41056fe3
            public void onChanged(String str) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withComposerHint(str).build());
            }
        });
        mp2.mo95315b(messagingModel.getLiveKeyboardInputType(), new InterfaceC41056fe3<Integer>() { // from class: zendesk.messaging.MessagingViewModel.6
            @Override // p000.InterfaceC41056fe3
            public void onChanged(Integer num) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withKeyboardInputType(num.intValue()).build());
            }
        });
        mp2.mo95315b(messagingModel.getLiveAttachmentSettings(), new InterfaceC41056fe3<AttachmentSettings>() { // from class: zendesk.messaging.MessagingViewModel.7
            @Override // p000.InterfaceC41056fe3
            public void onChanged(AttachmentSettings attachmentSettings) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withAttachmentSettings(attachmentSettings).build());
            }
        });
        mp22.mo95315b(messagingModel.getLiveInterfaceUpdates(), new InterfaceC41056fe3<Banner>() { // from class: zendesk.messaging.MessagingViewModel.8
            @Override // p000.InterfaceC41056fe3
            public void onChanged(Banner banner) {
                MessagingViewModel.this.liveBannersState.setValue(banner);
            }
        });
    }

    public SingleLiveEvent<DialogContent> getDialogUpdates() {
        return this.messagingModel.getLiveDialogUpdates();
    }

    public SingleLiveEvent<Banner> getLiveInterfaceUpdateItems() {
        return this.messagingModel.getLiveInterfaceUpdates();
    }

    public LiveData<List<MenuItem>> getLiveMenuItems() {
        return this.messagingModel.getLiveMenuItems();
    }

    public LiveData<MessagingState> getLiveMessagingState() {
        return this.liveMessagingState;
    }

    public LiveData<Update.Action.Navigation> getLiveNavigationStream() {
        return this.liveNavigationStream;
    }

    @Override // p000.AbstractC35048Or6
    public void onCleared() {
        this.messagingModel.stop();
    }

    @Override // zendesk.messaging.EventListener
    public void onEvent(Event event) {
        this.messagingModel.onEvent(event);
    }

    public void start() {
        this.messagingModel.start();
    }
}
