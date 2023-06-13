package zendesk.support.request;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedList;
import java.util.List;
import zendesk.belvedere.C31098b;
import zendesk.support.UiUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ViewMessageComposer extends FrameLayout implements View.OnClickListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, TextView.OnEditorActionListener, TextWatcher {
    private static final String LOG_TAG = "ViewMessageComposer";
    private ViewAttachmentsIndicator attachmentsIndicator;
    private AnimatorSet attachmentsOffCollapseAnimatorSet;
    private AnimatorSet attachmentsOffExpandAnimatorSet;
    private AnimatorSet attachmentsOnCollapseAnimatorSet;
    private AnimatorSet attachmentsOnExpandAnimatorSet;
    private C31098b imageStream;
    private List<InputListener> inputListenerList;
    private EditText inputTextField;
    private boolean isAttachmentsButtonDisabled;
    private boolean isSendButtonDisabled;
    private List<View.OnFocusChangeListener> onFocusChangeListenerList;
    private OnHeightChangeListener onHeightChangeListener;
    private ImageView sendButton;
    private MessageComposerStateHelper stateHelper;

    /* loaded from: classes8.dex */
    public interface InputListener {
        void onAddAttachmentsRequested();

        void onSendMessageRequested(String str);
    }

    /* loaded from: classes8.dex */
    public static class MessageComposerState {
        static final int BUTTON_DISABLED = 11;
        static final int BUTTON_ENABLED = 12;
        static final int BUTTON_HIDDEN = 10;
        static final int FIELD_COLLAPSED = 2;
        static final int FIELD_EXPANDED = 1;
        private final int attachmentButtonState;
        private final int fieldState;
        private final int sendButtonState;

        public MessageComposerState(int i, int i2, int i3) {
            this.fieldState = i;
            this.sendButtonState = i2;
            this.attachmentButtonState = i3;
        }

        public int getFieldState() {
            return this.fieldState;
        }

        public int getSendButtonState() {
            return this.sendButtonState;
        }

        public boolean isAttachmentButtonActivated() {
            return this.attachmentButtonState == 12;
        }

        public boolean isAttachmentButtonEnabled() {
            return this.attachmentButtonState != 10;
        }

        public String toString() {
            return "MessageComposerState{fieldState=" + this.fieldState + ", sendButtonState=" + this.sendButtonState + ", attachmentButtonEnabled=" + this.attachmentButtonState + CoreConstants.CURLY_RIGHT;
        }
    }

    /* loaded from: classes8.dex */
    public static class MessageComposerStateHelper {
        private boolean hasAttachments(ViewAttachmentsIndicator viewAttachmentsIndicator) {
            return viewAttachmentsIndicator.getAttachmentsCount() > 0;
        }

        private boolean hasLength(String str) {
            return str != null && str.length() > 0;
        }

        private boolean hasValidText(String str) {
            return C44504lS5.m27273b(str);
        }

        public int getAttachmentButtonState(boolean z, boolean z2) {
            if (z) {
                return 10;
            }
            return z2 ? 12 : 11;
        }

        public int getFieldState(boolean z, boolean z2, boolean z3, boolean z4) {
            return (z || z2 || z4 || z3) ? 1 : 2;
        }

        public int getSendButtonState(boolean z, boolean z2, boolean z3, int i) {
            if (z2) {
                return 12;
            }
            if (!z3 || z) {
                return i == 1 ? 11 : 10;
            }
            return 12;
        }

        public MessageComposerState getState(EditText editText, EditText editText2, ViewAttachmentsIndicator viewAttachmentsIndicator, boolean z, boolean z2, boolean z3) {
            String obj = editText.getText().toString();
            boolean hasLength = hasLength(obj);
            boolean hasValidText = hasValidText(obj);
            boolean hasFocus = editText.hasFocus();
            boolean hasFocus2 = editText2.hasFocus();
            boolean hasAttachments = hasAttachments(viewAttachmentsIndicator);
            int fieldState = getFieldState(hasFocus, hasLength, hasFocus2, hasAttachments);
            return new MessageComposerState(fieldState, getSendButtonState(z2, hasValidText, hasAttachments, fieldState), getAttachmentButtonState(z3, z));
        }

        public MessageComposerState onAttachmentClicked(boolean z, boolean z2, EditText editText, EditText editText2, ViewAttachmentsIndicator viewAttachmentsIndicator) {
            int sendButtonState;
            MessageComposerState state = getState(editText, editText2, viewAttachmentsIndicator, true, z, z2);
            if (state.getSendButtonState() == 10) {
                sendButtonState = 11;
            } else {
                sendButtonState = state.getSendButtonState();
            }
            return new MessageComposerState(1, sendButtonState, getAttachmentButtonState(z2, true));
        }
    }

    /* loaded from: classes8.dex */
    public interface OnHeightChangeListener {
        void onHeightChange(int i);
    }

    public ViewMessageComposer(Context context) {
        super(context);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    private void applyState(MessageComposerState messageComposerState) {
        if (messageComposerState.getFieldState() == 1 && !isExpanded()) {
            if (this.isAttachmentsButtonDisabled) {
                this.attachmentsOffExpandAnimatorSet.start();
            } else {
                this.attachmentsOnExpandAnimatorSet.start();
            }
        } else if (messageComposerState.getFieldState() == 2 && isExpanded()) {
            if (this.isAttachmentsButtonDisabled) {
                this.attachmentsOffCollapseAnimatorSet.start();
            } else {
                this.attachmentsOnCollapseAnimatorSet.start();
            }
        }
        int i = 0;
        if (messageComposerState.getSendButtonState() == 10) {
            updateSendBtn(false, false);
        } else if (messageComposerState.getSendButtonState() == 11) {
            updateSendBtn(true, false);
        } else if (messageComposerState.getSendButtonState() == 12) {
            updateSendBtn(true, true);
        }
        if (!messageComposerState.isAttachmentButtonEnabled()) {
            i = 8;
        }
        if (this.attachmentsIndicator.getVisibility() != i) {
            updateAttachmentButtonPosition();
            this.attachmentsIndicator.setVisibility(i);
        }
        if (messageComposerState.isAttachmentButtonEnabled() && this.attachmentsIndicator.getAttachmentsCount() == 0) {
            this.attachmentsIndicator.enableActiveState(messageComposerState.isAttachmentButtonActivated());
            this.attachmentsIndicator.setBottomBorderVisible(messageComposerState.isAttachmentButtonActivated());
        }
    }

    private void bindViews() {
        this.inputTextField = (EditText) findViewById(C35181Pg4.message_composer_input_text);
        this.attachmentsIndicator = (ViewAttachmentsIndicator) findViewById(C35181Pg4.message_composer_attachments_indicator);
        this.sendButton = (ImageView) findViewById(C35181Pg4.message_composer_send_btn);
    }

    private void initAnimationsAndAdjustLeftMargin() {
        Resources resources = getResources();
        int integer = resources.getInteger(C35199Pi4.zs_request_message_composer_animation_duration);
        int dimensionPixelSize = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_collapsed_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_expanded_min_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_expanded_side_margin);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_collapsed_side_margin);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_expanded_top_padding);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_collapsed_top_padding);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C35640Rf4.zs_request_message_composer_expanded_bottom_padding);
        this.attachmentsOnExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOffExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOnCollapseAnimatorSet = new AnimatorSet();
        this.attachmentsOffCollapseAnimatorSet = new AnimatorSet();
        C33874Jr2 c33874Jr2 = new C33874Jr2();
        C34269Lj1 c34269Lj1 = new C34269Lj1();
        this.attachmentsOnExpandAnimatorSet.setInterpolator(c33874Jr2);
        this.attachmentsOffExpandAnimatorSet.setInterpolator(c33874Jr2);
        this.attachmentsOnCollapseAnimatorSet.setInterpolator(c34269Lj1);
        this.attachmentsOffCollapseAnimatorSet.setInterpolator(c34269Lj1);
        this.attachmentsOnExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, integer)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize4, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, integer));
        this.attachmentsOnCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize4, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, integer)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, integer));
        this.attachmentsOffExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, integer)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, integer));
        this.attachmentsOffCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, integer)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, integer));
        updateAttachmentButtonPosition();
    }

    private void initListener() {
        this.attachmentsIndicator.setOnClickListener(this);
        this.sendButton.setOnClickListener(this);
        this.inputTextField.addTextChangedListener(this);
        this.inputTextField.setOnEditorActionListener(this);
        this.inputTextField.setOnFocusChangeListener(this);
        addOnLayoutChangeListener(this);
    }

    private boolean isExpanded() {
        if (this.inputTextField.getHeight() > this.inputTextField.getResources().getDimensionPixelSize(C35640Rf4.zs_request_message_composer_collapsed_height)) {
            return true;
        }
        return false;
    }

    private void notifyAddAttachmentsRequested() {
        for (InputListener inputListener : this.inputListenerList) {
            inputListener.onAddAttachmentsRequested();
        }
    }

    private void notifyOnFocusChangeListeners(View view, boolean z) {
        for (View.OnFocusChangeListener onFocusChangeListener : this.onFocusChangeListenerList) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    private void notifySendMessageRequested(String str) {
        for (InputListener inputListener : this.inputListenerList) {
            inputListener.onSendMessageRequested(str);
        }
    }

    private void updateAttachmentButtonPosition() {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_expanded_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_collapsed_side_margin);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTextField.getLayoutParams();
        if (!this.isAttachmentsButtonDisabled) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        layoutParams.leftMargin = dimensionPixelSize;
        this.inputTextField.setLayoutParams(layoutParams);
    }

    private void updateSendBtn(boolean z, boolean z2) {
        int resolveColor;
        boolean z3;
        Context context = getContext();
        if (z2) {
            resolveColor = UiUtils.themeAttributeToColor(C44032kf4.colorPrimary, context, C52925zf4.zs_request_fallback_color_primary);
        } else {
            resolveColor = UiUtils.resolveColor(C52925zf4.zs_request_message_composer_send_btn_color_inactive, context);
        }
        ImageView imageView = this.sendButton;
        int i = 0;
        if (z && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        imageView.setEnabled(z3);
        ImageView imageView2 = this.sendButton;
        if (!z) {
            i = 4;
        }
        imageView2.setVisibility(i);
        UiUtils.setTint(resolveColor, this.sendButton.getDrawable(), this.sendButton);
    }

    private void viewInit(Context context) {
        View.inflate(context, C52975zk4.zs_view_request_message_composer, this);
        if (isInEditMode()) {
            return;
        }
        bindViews();
        initListener();
        initAnimationsAndAdjustLeftMargin();
        this.stateHelper = new MessageComposerStateHelper();
    }

    public void addListener(InputListener inputListener) {
        this.inputListenerList.add(inputListener);
    }

    public void addOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListenerList.add(onFocusChangeListener);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        triggerStateUpdate();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.inputTextField.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void enableAttachmentsButton(boolean z) {
        this.isAttachmentsButtonDisabled = !z;
        triggerStateUpdate();
    }

    public void enableSendButton(boolean z) {
        this.isSendButtonDisabled = !z;
        triggerStateUpdate();
    }

    public String getMessage() {
        return this.inputTextField.getText().toString();
    }

    public void hide(boolean z) {
        if (z) {
            setVisibility(8);
            this.onHeightChangeListener.onHeightChange(0);
            return;
        }
        setVisibility(0);
        requestLayout();
    }

    public void init(C31098b c31098b) {
        this.imageStream = c31098b;
        triggerStateUpdate();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.attachmentsIndicator.getId()) {
            applyState(this.stateHelper.onAttachmentClicked(this.isSendButtonDisabled, this.isAttachmentsButtonDisabled, this.inputTextField, this.imageStream.m757A9().m811k(), this.attachmentsIndicator));
            notifyAddAttachmentsRequested();
        } else if (view.getId() == this.sendButton.getId()) {
            String trim = this.inputTextField.getText().toString().trim();
            this.inputTextField.setText("");
            this.attachmentsIndicator.reset();
            triggerStateUpdate();
            notifySendMessageRequested(trim);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() == this.inputTextField.getId() && i == 6) {
            this.inputTextField.clearFocus();
            UiUtils.dismissKeyboard(this.inputTextField);
            triggerStateUpdate();
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (view.getId() == this.inputTextField.getId()) {
            notifyOnFocusChangeListeners(view, z);
            triggerStateUpdate();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        OnHeightChangeListener onHeightChangeListener;
        int i9 = i4 - i2;
        if (i9 != i8 - i6 && (onHeightChangeListener = this.onHeightChangeListener) != null) {
            onHeightChangeListener.onHeightChange(i9);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void removeAllListener() {
        this.inputListenerList.clear();
    }

    public void requestFocusForInput() {
        this.inputTextField.requestFocus();
    }

    public void setAttachmentsCount(int i) {
        this.attachmentsIndicator.setAttachmentsCount(i);
        triggerStateUpdate();
    }

    public void setOnHeightChangeListener(OnHeightChangeListener onHeightChangeListener) {
        this.onHeightChangeListener = onHeightChangeListener;
    }

    public void triggerStateUpdate() {
        C31098b c31098b = this.imageStream;
        if (c31098b == null) {
            return;
        }
        applyState(this.stateHelper.getState(this.inputTextField, c31098b.m757A9().m811k(), this.attachmentsIndicator, this.imageStream.m755D9(), this.isSendButtonDisabled, this.isAttachmentsButtonDisabled));
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    public ViewMessageComposer(Context context, ViewAttachmentsIndicator viewAttachmentsIndicator, EditText editText, ImageView imageView, AnimatorSet animatorSet, AnimatorSet animatorSet2, AnimatorSet animatorSet3, AnimatorSet animatorSet4) {
        super(context);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        this.attachmentsIndicator = viewAttachmentsIndicator;
        this.inputTextField = editText;
        this.sendButton = imageView;
        this.attachmentsOnExpandAnimatorSet = animatorSet;
        this.attachmentsOffExpandAnimatorSet = animatorSet3;
        this.attachmentsOnCollapseAnimatorSet = animatorSet2;
        this.attachmentsOffCollapseAnimatorSet = animatorSet4;
        this.stateHelper = new MessageComposerStateHelper();
    }
}
