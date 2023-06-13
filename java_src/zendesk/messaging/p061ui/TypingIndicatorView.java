package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* renamed from: zendesk.messaging.ui.TypingIndicatorView */
/* loaded from: classes8.dex */
public class TypingIndicatorView extends LinearLayout implements Updatable<State> {
    private final AbstractC27016oe animationLoopCallback;
    private AvatarView avatarView;
    private View botLabel;
    private View labelContainer;
    private TextView labelField;
    private ImageView typingIndicator;

    /* renamed from: zendesk.messaging.ui.TypingIndicatorView$State */
    /* loaded from: classes8.dex */
    public static class State {
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final MessagingCellProps props;

        public State(MessagingCellProps messagingCellProps, String str, boolean z, AvatarState avatarState, AvatarStateRenderer avatarStateRenderer) {
            this.props = messagingCellProps;
            this.label = str;
            this.isBot = z;
            this.avatarState = avatarState;
            this.avatarStateRenderer = avatarStateRenderer;
        }

        public AvatarState getAvatarState() {
            return this.avatarState;
        }

        public AvatarStateRenderer getAvatarStateRenderer() {
            return this.avatarStateRenderer;
        }

        public String getLabel() {
            return this.label;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public TypingIndicatorView(Context context) {
        super(context);
        this.animationLoopCallback = new AbstractC27016oe() { // from class: zendesk.messaging.ui.TypingIndicatorView.1
            @Override // p000.AbstractC27016oe
            public void onAnimationEnd(final Drawable drawable) {
                TypingIndicatorView.this.post(new Runnable() { // from class: zendesk.messaging.ui.TypingIndicatorView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((Animatable) drawable).start();
                    }
                });
            }
        };
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R$layout.zui_view_typing_indicator_content, this);
    }

    private void startAnimatedDrawable() {
        Drawable drawable = this.typingIndicator.getDrawable();
        C7220Re.m86515c(drawable, this.animationLoopCallback);
        ((Animatable) drawable).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R$id.zui_agent_message_avatar);
        this.labelContainer = findViewById(R$id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R$id.zui_cell_label_text_field);
        this.botLabel = findViewById(R$id.zui_cell_label_supplementary_label);
        this.typingIndicator = (ImageView) findViewById(R$id.zui_cell_typing_indicator_image);
        startAnimatedDrawable();
    }

    @Override // zendesk.messaging.p061ui.Updatable
    public void update(State state) {
        if (state.getLabel() != null) {
            this.labelField.setText(state.getLabel());
        }
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
    }

    public TypingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animationLoopCallback = new AbstractC27016oe() { // from class: zendesk.messaging.ui.TypingIndicatorView.1
            @Override // p000.AbstractC27016oe
            public void onAnimationEnd(final Drawable drawable) {
                TypingIndicatorView.this.post(new Runnable() { // from class: zendesk.messaging.ui.TypingIndicatorView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((Animatable) drawable).start();
                    }
                });
            }
        };
        init();
    }

    public TypingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animationLoopCallback = new AbstractC27016oe() { // from class: zendesk.messaging.ui.TypingIndicatorView.1
            @Override // p000.AbstractC27016oe
            public void onAnimationEnd(final Drawable drawable) {
                TypingIndicatorView.this.post(new Runnable() { // from class: zendesk.messaging.ui.TypingIndicatorView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((Animatable) drawable).start();
                    }
                });
            }
        };
        init();
    }
}
