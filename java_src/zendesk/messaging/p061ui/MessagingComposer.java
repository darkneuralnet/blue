package zendesk.messaging.p061ui;

import android.text.Editable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import zendesk.belvedere.C31098b;
import zendesk.belvedere.MediaResult;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.MessagingViewModel;
import zendesk.messaging.R$string;
import zendesk.messaging.TypingEventDispatcher;
/* renamed from: zendesk.messaging.ui.MessagingComposer */
/* loaded from: classes8.dex */
public class MessagingComposer {
    static final int DEFAULT_HINT = R$string.zui_hint_type_message;
    private final AppCompatActivity activity;
    private final BelvedereMediaHolder belvedereMediaHolder;
    private BelvedereMediaPickerListener belvedereMediaPickerListener;
    private final C31098b imageStream;
    private final InputBoxAttachmentClickListener inputBoxAttachmentClickListener;
    private final InputBoxConsumer inputBoxConsumer;
    private final TypingEventDispatcher typingEventDispatcher;
    private final MessagingViewModel viewModel;

    /* renamed from: zendesk.messaging.ui.MessagingComposer$BelvedereMediaPickerListener */
    /* loaded from: classes8.dex */
    public static final class BelvedereMediaPickerListener implements C31098b.InterfaceC31100b {
        private final BelvedereMediaHolder belvedereMediaHolder;
        private final C31098b imageStream;
        private final InputBox inputBox;

        public BelvedereMediaPickerListener(BelvedereMediaHolder belvedereMediaHolder, InputBox inputBox, C31098b c31098b) {
            this.belvedereMediaHolder = belvedereMediaHolder;
            this.inputBox = inputBox;
            this.imageStream = c31098b;
        }

        @Override // zendesk.belvedere.C31098b.InterfaceC31100b
        public void onDismissed() {
            if (this.imageStream.m757A9().m811k().hasFocus()) {
                this.inputBox.requestFocus();
            }
        }

        @Override // zendesk.belvedere.C31098b.InterfaceC31100b
        public void onMediaDeselected(List<MediaResult> list) {
            this.belvedereMediaHolder.removeAll(list);
            this.inputBox.setAttachmentsCount(this.belvedereMediaHolder.getSelectedMediaCount());
        }

        @Override // zendesk.belvedere.C31098b.InterfaceC31100b
        public void onMediaSelected(List<MediaResult> list) {
            this.belvedereMediaHolder.addAll(list);
            this.inputBox.setAttachmentsCount(this.belvedereMediaHolder.getSelectedMediaCount());
        }

        @Override // zendesk.belvedere.C31098b.InterfaceC31100b
        public void onVisible() {
        }
    }

    public MessagingComposer(AppCompatActivity appCompatActivity, MessagingViewModel messagingViewModel, C31098b c31098b, BelvedereMediaHolder belvedereMediaHolder, InputBoxConsumer inputBoxConsumer, InputBoxAttachmentClickListener inputBoxAttachmentClickListener, TypingEventDispatcher typingEventDispatcher) {
        this.activity = appCompatActivity;
        this.viewModel = messagingViewModel;
        this.imageStream = c31098b;
        this.belvedereMediaHolder = belvedereMediaHolder;
        this.inputBoxConsumer = inputBoxConsumer;
        this.inputBoxAttachmentClickListener = inputBoxAttachmentClickListener;
        this.typingEventDispatcher = typingEventDispatcher;
    }

    public void bind(final InputBox inputBox) {
        inputBox.setInputTextConsumer(this.inputBoxConsumer);
        inputBox.setInputTextWatcher(new AbstractC38919c36() { // from class: zendesk.messaging.ui.MessagingComposer.1
            @Override // p000.AbstractC38919c36, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                MessagingComposer.this.typingEventDispatcher.onTyping();
            }
        });
        BelvedereMediaPickerListener belvedereMediaPickerListener = new BelvedereMediaPickerListener(this.belvedereMediaHolder, inputBox, this.imageStream);
        this.belvedereMediaPickerListener = belvedereMediaPickerListener;
        this.imageStream.m750N6(belvedereMediaPickerListener);
        this.viewModel.getLiveMessagingState().observe(this.activity, new InterfaceC41056fe3<MessagingState>() { // from class: zendesk.messaging.ui.MessagingComposer.2
            @Override // p000.InterfaceC41056fe3
            public void onChanged(MessagingState messagingState) {
                MessagingComposer.this.renderState(messagingState, inputBox);
            }
        });
    }

    public void renderState(MessagingState messagingState, InputBox inputBox) {
        String string;
        if (messagingState != null) {
            if (C44504lS5.m27273b(messagingState.hint)) {
                string = messagingState.hint;
            } else {
                string = this.activity.getString(DEFAULT_HINT);
            }
            inputBox.setHint(string);
            inputBox.setEnabled(messagingState.enabled);
            inputBox.setInputType(Integer.valueOf(messagingState.keyboardInputType));
            AttachmentSettings attachmentSettings = messagingState.attachmentSettings;
            if (attachmentSettings != null && attachmentSettings.isSendingEnabled()) {
                inputBox.setAttachmentsIndicatorClickListener(this.inputBoxAttachmentClickListener);
                inputBox.setAttachmentsCount(this.belvedereMediaHolder.getSelectedMediaCount());
                return;
            }
            inputBox.setAttachmentsIndicatorClickListener(null);
        }
    }
}
