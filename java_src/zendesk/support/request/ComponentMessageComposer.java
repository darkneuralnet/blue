package zendesk.support.request;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.C31098b;
import zendesk.belvedere.MediaResult;
import zendesk.support.RequestStatus;
import zendesk.support.UiUtils;
import zendesk.support.request.ViewMessageComposer;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ComponentMessageComposer implements Listener<MessageComposerModel>, ViewMessageComposer.InputListener, C31098b.InterfaceC31100b {
    private final ActionFactory actionFactory;
    private final AppCompatActivity activity;
    private final Dispatcher dispatcher;
    private final C31098b imageStream;
    private final ViewMessageComposer messageComposerView;
    private final MessageComposerSelector messageFieldSelector = new MessageComposerSelector();
    private final AttachmentHelper attachmentHelper = new AttachmentHelper(C35181Pg4.attachments_indicator_icon, C35181Pg4.message_composer_send_btn);

    /* loaded from: classes8.dex */
    public static class MessageComposerModel {
        private final boolean attachmentsButtonEnabled;
        private final List<StateRequestAttachment> extraAttachments;
        private final long maxFileSize;
        private final boolean messageComposerVisible;
        private final List<StateRequestAttachment> requestAttachments;
        private final boolean sendButtonEnabled;

        public MessageComposerModel(List<StateRequestAttachment> list, List<StateRequestAttachment> list2, long j, boolean z, boolean z2, boolean z3) {
            this.requestAttachments = list;
            this.extraAttachments = list2;
            this.maxFileSize = j;
            this.sendButtonEnabled = z;
            this.attachmentsButtonEnabled = z2;
            this.messageComposerVisible = z3;
        }

        public List<StateRequestAttachment> getExtraAttachments() {
            return this.extraAttachments;
        }

        public long getMaxFileSize() {
            return this.maxFileSize;
        }

        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }

        public boolean isAttachmentsButtonEnabled() {
            return this.attachmentsButtonEnabled;
        }

        public boolean isMessageComposerVisible() {
            return this.messageComposerVisible;
        }

        public boolean isSendButtonEnabled() {
            return this.sendButtonEnabled;
        }
    }

    /* loaded from: classes8.dex */
    public static class MessageComposerSelector implements StateSelector<MessageComposerModel> {
        @Override // zendesk.support.suas.StateSelector
        public MessageComposerModel selectData(State state) {
            StateAttachments fromState = StateAttachments.fromState(state);
            StateConfig fromState2 = StateConfig.fromState(state);
            StateConversation fromState3 = StateConversation.fromState(state);
            ArrayList arrayList = new ArrayList(fromState.getAllSelectedAttachments());
            return new MessageComposerModel(C43505jm0.m29954c(fromState.getSelectedAttachments()), arrayList, fromState2.getSettings().getMaxAttachmentSize(), C44504lS5.m27273b(fromState3.getRemoteId()), fromState2.getSettings().isAttachmentsEnabled(), fromState3.getStatus() != RequestStatus.Closed);
        }
    }

    public ComponentMessageComposer(AppCompatActivity appCompatActivity, C31098b c31098b, ViewMessageComposer viewMessageComposer, Dispatcher dispatcher, ActionFactory actionFactory) {
        this.activity = appCompatActivity;
        this.messageComposerView = viewMessageComposer;
        this.dispatcher = dispatcher;
        this.actionFactory = actionFactory;
        this.imageStream = c31098b;
        viewMessageComposer.addListener(this);
        initImagePicker();
    }

    private void initImagePicker() {
        this.imageStream.m750N6(this);
        if (this.imageStream.m757A9().m811k().hasFocus()) {
            this.messageComposerView.requestFocusForInput();
        }
        if (this.imageStream.m744ea()) {
            this.messageComposerView.post(new Runnable() { // from class: zendesk.support.request.ComponentMessageComposer.1
                @Override // java.lang.Runnable
                public void run() {
                    ComponentMessageComposer.this.onAddAttachmentsRequested();
                }
            });
        }
    }

    public StateSelector<MessageComposerModel> getSelector() {
        return this.messageFieldSelector;
    }

    public boolean hasUnsavedInput() {
        if (!C44504lS5.m27273b(this.messageComposerView.getMessage()) && !C43505jm0.m29948i(this.attachmentHelper.getSelectedAttachments())) {
            return false;
        }
        return true;
    }

    @Override // zendesk.support.request.ViewMessageComposer.InputListener
    public void onAddAttachmentsRequested() {
        if (!this.imageStream.m755D9()) {
            this.attachmentHelper.showImagePicker(this.activity);
        } else {
            this.imageStream.dismiss();
        }
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onDismissed() {
        this.messageComposerView.requestFocusForInput();
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onMediaDeselected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.deselectAttachment(list));
        if (!this.imageStream.m755D9()) {
            onAddAttachmentsRequested();
        }
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onMediaSelected(List<MediaResult> list) {
        this.dispatcher.dispatch(this.actionFactory.selectAttachment(list));
        if (!this.imageStream.m755D9()) {
            onAddAttachmentsRequested();
        }
    }

    @Override // zendesk.support.request.ViewMessageComposer.InputListener
    public void onSendMessageRequested(String str) {
        if (this.imageStream.m755D9()) {
            this.imageStream.dismiss();
        }
        this.dispatcher.dispatch(this.actionFactory.createCommentAsync(str, this.attachmentHelper.getSelectedAttachments()));
        this.dispatcher.dispatch(this.actionFactory.clearAttachments());
        this.dispatcher.dispatch(this.actionFactory.updateCommentsAsync());
    }

    @Override // zendesk.belvedere.C31098b.InterfaceC31100b
    public void onVisible() {
        this.messageComposerView.post(new Runnable() { // from class: zendesk.support.request.ComponentMessageComposer.2
            @Override // java.lang.Runnable
            public void run() {
                ComponentMessageComposer.this.messageComposerView.triggerStateUpdate();
            }
        });
    }

    @Override // zendesk.support.suas.Listener
    public void update(MessageComposerModel messageComposerModel) {
        this.attachmentHelper.updateMaxFileSize(messageComposerModel.getMaxFileSize());
        this.attachmentHelper.updateAttachments(messageComposerModel.getRequestAttachments(), messageComposerModel.getExtraAttachments());
        this.messageComposerView.setAttachmentsCount(messageComposerModel.getRequestAttachments().size());
        this.messageComposerView.enableSendButton(messageComposerModel.isSendButtonEnabled());
        this.messageComposerView.enableAttachmentsButton(messageComposerModel.isAttachmentsButtonEnabled());
        this.messageComposerView.hide(!messageComposerModel.isMessageComposerVisible());
        if (messageComposerModel.isMessageComposerVisible()) {
            return;
        }
        UiUtils.dismissKeyboard(this.messageComposerView);
    }
}
