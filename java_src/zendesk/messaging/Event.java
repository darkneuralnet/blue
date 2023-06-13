package zendesk.messaging;

import android.content.Intent;
import java.io.File;
import java.util.Date;
import java.util.List;
import zendesk.messaging.DialogContent;
import zendesk.messaging.Engine;
import zendesk.messaging.MessagingItem;
/* loaded from: classes8.dex */
public abstract class Event implements MessagingEvent {
    private final Date timestamp;
    private final String type;

    /* loaded from: classes8.dex */
    public static class ActionOptionClicked extends Event {
        private final MessagingItem.Action action;

        public ActionOptionClicked(MessagingItem.Action action, Date date) {
            super("action_option_clicked", date);
            this.action = action;
        }
    }

    /* loaded from: classes8.dex */
    public static class ActivityResult extends Event {
        private final Intent data;
        private final int requestCode;
        private final int resultCode;

        public ActivityResult(int i, int i2, Intent intent, Date date) {
            super("activity_result_received", date);
            this.requestCode = i;
            this.resultCode = i2;
            this.data = intent;
        }
    }

    /* loaded from: classes8.dex */
    public static class ArticleSuggestionClicked extends Event {
        private final MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion;

        public ArticleSuggestionClicked(MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion, Date date) {
            super("article_suggestion_clicked", date);
            this.articleSuggestion = articleSuggestion;
        }
    }

    /* loaded from: classes8.dex */
    public static class CopyQueryClick extends Event {
        private final MessagingItem.Query query;

        public CopyQueryClick(MessagingItem.Query query, Date date) {
            super("message_copied", date);
            this.query = query;
        }
    }

    /* loaded from: classes8.dex */
    public static class DialogItemClicked extends Event {
        private final DialogContent.Config config;
        private final boolean isPositive;
        private final String payload;
        private final DialogContent.Config previousConfig;

        /* loaded from: classes8.dex */
        public static class Builder {
            private final DialogContent.Config config;
            private final boolean isPositive;
            private String payload = null;
            private DialogContent.Config previousConfig = null;
            private final Date timestamp;

            public Builder(Date date, DialogContent.Config config, boolean z) {
                this.timestamp = date;
                this.config = config;
                this.isPositive = z;
            }

            public DialogItemClicked build() {
                return new DialogItemClicked(this.timestamp, this.config, this.isPositive, this.payload, this.previousConfig);
            }

            public Builder setPayload(String str) {
                this.payload = str;
                return this;
            }

            public Builder setPreviousConfig(DialogContent.Config config) {
                this.previousConfig = config;
                return this;
            }
        }

        private DialogItemClicked(Date date, DialogContent.Config config, boolean z, String str, DialogContent.Config config2) {
            super("dialog_item_clicked", date);
            this.config = config;
            this.isPositive = z;
            this.payload = str;
            this.previousConfig = config2;
        }
    }

    /* loaded from: classes8.dex */
    public static class EngineSelection extends Event {
        private final Engine.TransferOptionDescription selectedEngine;

        public EngineSelection(Engine.TransferOptionDescription transferOptionDescription, Date date) {
            super("transfer_option_clicked", date);
            this.selectedEngine = transferOptionDescription;
        }

        public Engine.TransferOptionDescription getSelectedEngine() {
            return this.selectedEngine;
        }
    }

    /* loaded from: classes8.dex */
    public static class FileSelected extends Event {
        private final List<File> attachments;

        public FileSelected(List<File> list, Date date) {
            super("file_selected", date);
            this.attachments = list;
        }
    }

    /* loaded from: classes8.dex */
    public static class MenuItemClicked extends Event {
        private final int menuItemId;

        public MenuItemClicked(Date date, int i) {
            super("menu_item_clicked", date);
            this.menuItemId = i;
        }
    }

    /* loaded from: classes8.dex */
    public static class MessageDeleted extends Event {
        private final MessagingItem.Query message;

        public MessageDeleted(MessagingItem.Query query, Date date) {
            super("message_deleted", date);
            this.message = query;
        }
    }

    /* loaded from: classes8.dex */
    public static class MessageResent extends Event {
        private final MessagingItem.Query query;

        public MessageResent(MessagingItem.Query query, Date date) {
            super("message_resent", date);
            this.query = query;
        }
    }

    /* loaded from: classes8.dex */
    public static class MessageSubmitted extends Event {
        private final String textInput;

        public MessageSubmitted(String str, Date date) {
            super("message_submitted", date);
            this.textInput = str;
        }
    }

    /* loaded from: classes8.dex */
    public static class ReconnectButtonClicked extends Event {
        public ReconnectButtonClicked(Date date) {
            super("reconnect_button_clicked", date);
        }
    }

    /* loaded from: classes8.dex */
    public static class ResponseOptionClicked extends Event {
        private final MessagingItem.Option clickedOption;
        private final MessagingItem.OptionsResponse optionsResponse;

        public ResponseOptionClicked(MessagingItem.OptionsResponse optionsResponse, MessagingItem.Option option, Date date) {
            super("response_option_clicked", date);
            this.optionsResponse = optionsResponse;
            this.clickedOption = option;
        }
    }

    /* loaded from: classes8.dex */
    public static class RetrySendAttachmentClick extends Event {
        private final MessagingItem.FileQuery failedFileQuery;

        public RetrySendAttachmentClick(MessagingItem.FileQuery fileQuery, Date date) {
            super("retry_send_attachment_clicked", date);
            this.failedFileQuery = fileQuery;
        }
    }

    /* loaded from: classes8.dex */
    public static class TypingStarted extends Event {
        public TypingStarted(Date date) {
            super("typing_started", date);
        }
    }

    /* loaded from: classes8.dex */
    public static class TypingStopped extends Event {
        public TypingStopped(Date date) {
            super("typing_stopped", date);
        }
    }

    public Event(String str, Date date) {
        this.type = str;
        this.timestamp = date;
    }

    @Override // zendesk.messaging.MessagingEvent
    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }
}
