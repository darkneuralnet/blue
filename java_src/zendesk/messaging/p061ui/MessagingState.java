package zendesk.messaging.p061ui;

import java.util.List;
import zendesk.messaging.AgentDetails;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.ConnectionState;
import zendesk.messaging.MessagingItem;
/* renamed from: zendesk.messaging.ui.MessagingState */
/* loaded from: classes8.dex */
public class MessagingState {
    final AttachmentSettings attachmentSettings;
    final ConnectionState connectionState;
    final boolean enabled;
    final String hint;
    final int keyboardInputType;
    final List<MessagingItem> messagingItems;
    final boolean progressBarVisible;
    final TypingState typingState;

    /* renamed from: zendesk.messaging.ui.MessagingState$TypingState */
    /* loaded from: classes8.dex */
    public static class TypingState {
        private final AgentDetails agentDetails;
        private final boolean isTyping;

        public TypingState(boolean z) {
            this(z, null);
        }

        public AgentDetails getAgentDetails() {
            return this.agentDetails;
        }

        public boolean isTyping() {
            return this.isTyping;
        }

        public TypingState(boolean z, AgentDetails agentDetails) {
            this.isTyping = z;
            this.agentDetails = agentDetails;
        }
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private MessagingState(List<MessagingItem> list, boolean z, boolean z2, TypingState typingState, ConnectionState connectionState, String str, AttachmentSettings attachmentSettings, int i) {
        this.messagingItems = list;
        this.progressBarVisible = z;
        this.enabled = z2;
        this.typingState = typingState;
        this.connectionState = connectionState;
        this.hint = str;
        this.attachmentSettings = attachmentSettings;
        this.keyboardInputType = i;
    }

    /* renamed from: zendesk.messaging.ui.MessagingState$Builder */
    /* loaded from: classes8.dex */
    public static class Builder {
        private AttachmentSettings attachmentSettings;
        private ConnectionState connectionState;
        private boolean enabled;
        private String hint;
        private int keyboardInputType;
        private List<MessagingItem> messagingItems;
        private boolean progressBarVisible;
        private TypingState typingState;

        public Builder() {
            this.typingState = new TypingState(false);
            this.connectionState = ConnectionState.DISCONNECTED;
            this.keyboardInputType = 131073;
        }

        public MessagingState build() {
            return new MessagingState(C43505jm0.m29952e(this.messagingItems), this.progressBarVisible, this.enabled, this.typingState, this.connectionState, this.hint, this.attachmentSettings, this.keyboardInputType);
        }

        public Builder withAttachmentSettings(AttachmentSettings attachmentSettings) {
            this.attachmentSettings = attachmentSettings;
            return this;
        }

        public Builder withComposerHint(String str) {
            this.hint = str;
            return this;
        }

        public Builder withConnectionState(ConnectionState connectionState) {
            this.connectionState = connectionState;
            return this;
        }

        public Builder withEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        public Builder withKeyboardInputType(int i) {
            this.keyboardInputType = i;
            return this;
        }

        public Builder withMessagingItems(List<MessagingItem> list) {
            this.messagingItems = list;
            return this;
        }

        public Builder withTypingIndicatorState(TypingState typingState) {
            this.typingState = typingState;
            return this;
        }

        public Builder(MessagingState messagingState) {
            this.typingState = new TypingState(false);
            this.connectionState = ConnectionState.DISCONNECTED;
            this.keyboardInputType = 131073;
            this.messagingItems = messagingState.messagingItems;
            this.enabled = messagingState.enabled;
            this.typingState = messagingState.typingState;
            this.connectionState = messagingState.connectionState;
            this.hint = messagingState.hint;
            this.attachmentSettings = messagingState.attachmentSettings;
            this.keyboardInputType = messagingState.keyboardInputType;
        }
    }
}
