package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.messaging.Attachment;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* renamed from: zendesk.messaging.ui.AgentFileCellView */
/* loaded from: classes8.dex */
public class AgentFileCellView extends LinearLayout implements Updatable<State> {
    private ImageView appIcon;
    private AvatarView avatarView;
    private View botLabel;
    private LinearLayout bubble;
    private Drawable defaultAppIcon;
    private TextView fileDescriptor;
    private TextView fileName;
    private View labelContainer;
    private TextView labelField;

    /* renamed from: zendesk.messaging.ui.AgentFileCellView$State */
    /* loaded from: classes8.dex */
    public static class State {
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final MessagingCellProps props;

        public State(Attachment attachment, MessagingCellProps messagingCellProps, String str, boolean z, AvatarState avatarState, AvatarStateRenderer avatarStateRenderer) {
            this.props = messagingCellProps;
            this.label = str;
            this.isBot = z;
            this.avatarState = avatarState;
            this.avatarStateRenderer = avatarStateRenderer;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            State state = (State) obj;
            if (isBot() != state.isBot()) {
                return false;
            }
            getAttachment();
            state.getAttachment();
            if (getProps() == null ? state.getProps() != null : !getProps().equals(state.getProps())) {
                return false;
            }
            if (getLabel() == null ? state.getLabel() != null : !getLabel().equals(state.getLabel())) {
                return false;
            }
            AvatarState avatarState = this.avatarState;
            AvatarState avatarState2 = state.avatarState;
            if (avatarState != null) {
                return avatarState.equals(avatarState2);
            }
            if (avatarState2 == null) {
                return true;
            }
            return false;
        }

        public Attachment getAttachment() {
            return null;
        }

        public String getLabel() {
            return this.label;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public int hashCode() {
            int i;
            int i2;
            getAttachment();
            int i3 = 0;
            if (getProps() != null) {
                i = getProps().hashCode();
            } else {
                i = 0;
            }
            int i4 = (i + 0) * 31;
            if (getLabel() != null) {
                i2 = getLabel().hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + (isBot() ? 1 : 0)) * 31;
            AvatarState avatarState = this.avatarState;
            if (avatarState != null) {
                i3 = avatarState.hashCode();
            }
            return i5 + i3;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public AgentFileCellView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R$layout.zui_view_agent_file_cell_content, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R$id.zui_agent_message_avatar);
        this.bubble = (LinearLayout) findViewById(R$id.zui_cell_file_container);
        this.fileName = (TextView) findViewById(R$id.zui_file_cell_name);
        this.fileDescriptor = (TextView) findViewById(R$id.zui_cell_file_description);
        this.appIcon = (ImageView) findViewById(R$id.zui_cell_file_app_icon);
        this.labelContainer = findViewById(R$id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R$id.zui_cell_label_text_field);
        this.botLabel = findViewById(R$id.zui_cell_label_supplementary_label);
        this.defaultAppIcon = NA0.m94299e(getContext(), R$drawable.zui_ic_insert_drive_file);
        C31646Ad6.m115424c(C31646Ad6.m115422e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary), this.defaultAppIcon, this.appIcon);
    }

    @Override // zendesk.messaging.p061ui.Updatable
    public void update(State state) {
        state.getAttachment();
        throw null;
    }

    public AgentFileCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AgentFileCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
