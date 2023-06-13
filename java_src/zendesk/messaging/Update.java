package zendesk.messaging;

import android.app.Activity;
import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public abstract class Update {
    private final String type;

    /* loaded from: classes8.dex */
    public static abstract class Action extends Update {

        /* loaded from: classes8.dex */
        public static class Navigation extends Action {
            private static int NO_REQUEST_CODE = -1;
            private final Intent intent;
            private final int requestCode;

            public void navigate(Activity activity) {
                int i = this.requestCode;
                if (i == NO_REQUEST_CODE) {
                    activity.startActivity(this.intent);
                } else {
                    activity.startActivityForResult(this.intent, i);
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class ApplyMenuItems extends State {
        private final List<MenuItem> menuItems;

        public ApplyMenuItems(MenuItem... menuItemArr) {
            super("apply_menu_items");
            List<MenuItem> asList;
            if (menuItemArr == null) {
                asList = Collections.emptyList();
            } else {
                asList = Arrays.asList(menuItemArr);
            }
            this.menuItems = asList;
        }

        public List<MenuItem> getMenuItems() {
            return this.menuItems;
        }
    }

    /* loaded from: classes8.dex */
    public static class ShowBanner extends State {
        private final Banner banner;

        public Banner getBanner() {
            return this.banner;
        }
    }

    /* loaded from: classes8.dex */
    public static class ShowDialog extends State {
        private final DialogContent dialogContent;

        public DialogContent getDialogContent() {
            return this.dialogContent;
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class State extends Update {

        /* loaded from: classes8.dex */
        public static class ApplyMessagingItems extends State {
            private final List<MessagingItem> messagingItems;

            public List<MessagingItem> getMessagingItems() {
                return this.messagingItems;
            }
        }

        /* loaded from: classes8.dex */
        public static class ShowTyping extends State {
            private final AgentDetails agentDetails;

            public AgentDetails getAgentDetails() {
                return this.agentDetails;
            }
        }

        /* loaded from: classes8.dex */
        public static class UpdateConnectionState extends State {
            private final ConnectionState connectionState;

            public ConnectionState getConnectionState() {
                return this.connectionState;
            }
        }

        /* loaded from: classes8.dex */
        public static class UpdateInputFieldState extends State {
            private final AttachmentSettings attachmentSettings;
            private final Boolean enabled;
            private final String hint;
            private final Integer inputType;

            public UpdateInputFieldState(String str, Boolean bool, AttachmentSettings attachmentSettings, Integer num) {
                super("update_input_field_state");
                this.hint = str;
                this.enabled = bool;
                this.attachmentSettings = attachmentSettings;
                this.inputType = num;
            }

            public static UpdateInputFieldState updateInputFieldEnabled(boolean z) {
                return new UpdateInputFieldState(null, Boolean.valueOf(z), null, null);
            }

            public AttachmentSettings getAttachmentSettings() {
                return this.attachmentSettings;
            }

            public String getHint() {
                return this.hint;
            }

            public Integer getInputType() {
                return this.inputType;
            }

            public Boolean isEnabled() {
                return this.enabled;
            }
        }

        public State(String str) {
            super(str);
        }
    }

    public Update(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
