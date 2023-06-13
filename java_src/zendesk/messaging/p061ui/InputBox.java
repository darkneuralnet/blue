package zendesk.messaging.p061ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* renamed from: zendesk.messaging.ui.InputBox */
/* loaded from: classes8.dex */
public class InputBox extends FrameLayout {
    private AttachmentsIndicator attachmentsIndicator;
    private View.OnClickListener attachmentsIndicatorClickListener;
    private FrameLayout inputBox;
    private InputTextConsumer inputTextConsumer;
    private EditText inputTextField;
    private TextWatcher inputTextWatcher;
    private ImageView sendButton;
    private final List<View.OnClickListener> sendButtonClickListeners;

    /* renamed from: zendesk.messaging.ui.InputBox$InputTextConsumer */
    /* loaded from: classes8.dex */
    public interface InputTextConsumer {
        boolean onConsumeText(String str);
    }

    public InputBox(Context context) {
        super(context);
        this.sendButtonClickListeners = new ArrayList();
        viewInit(context);
    }

    private void bindViews() {
        this.inputBox = (FrameLayout) findViewById(R$id.zui_view_input_box);
        this.inputTextField = (EditText) findViewById(R$id.input_box_input_text);
        this.attachmentsIndicator = (AttachmentsIndicator) findViewById(R$id.input_box_attachments_indicator);
        this.sendButton = (ImageView) findViewById(R$id.input_box_send_btn);
    }

    private void initListeners() {
        this.inputBox.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.InputBox.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputBox.this.inputTextField.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) InputBox.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(2, 1);
                }
            }
        });
        this.attachmentsIndicator.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.InputBox.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (InputBox.this.attachmentsIndicatorClickListener != null) {
                    InputBox.this.attachmentsIndicatorClickListener.onClick(view);
                }
            }
        });
        this.sendButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.InputBox.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (InputBox.this.inputTextConsumer != null && InputBox.this.inputTextConsumer.onConsumeText(InputBox.this.inputTextField.getText().toString().trim())) {
                    InputBox.this.attachmentsIndicator.reset();
                    InputBox.this.inputTextField.setText((CharSequence) null);
                }
                for (View.OnClickListener onClickListener : InputBox.this.sendButtonClickListeners) {
                    onClickListener.onClick(view);
                }
            }
        });
        this.inputTextField.addTextChangedListener(new AbstractC38919c36() { // from class: zendesk.messaging.ui.InputBox.4
            @Override // p000.AbstractC38919c36, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                boolean z;
                boolean m27273b = C44504lS5.m27273b(editable.toString());
                boolean z2 = true;
                if (InputBox.this.attachmentsIndicator.getAttachmentsCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                InputBox inputBox = InputBox.this;
                if (!m27273b && !z) {
                    z2 = false;
                }
                inputBox.updateSendBtn(z2);
                if (InputBox.this.inputTextWatcher != null) {
                    InputBox.this.inputTextWatcher.afterTextChanged(editable);
                }
            }
        });
        this.inputTextField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zendesk.messaging.ui.InputBox.5
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    InputBox.this.inputBox.setBackgroundResource(R$drawable.zui_background_composer_selected);
                } else {
                    InputBox.this.inputBox.setBackgroundResource(R$drawable.zui_background_composer_inactive);
                }
            }
        });
    }

    private void showAttachmentsIndicator(boolean z) {
        if (z) {
            this.attachmentsIndicator.setEnabled(true);
            this.attachmentsIndicator.setVisibility(0);
            updateInputFieldPosition(true);
            return;
        }
        this.attachmentsIndicator.setEnabled(false);
        this.attachmentsIndicator.setVisibility(8);
        updateInputFieldPosition(false);
    }

    private void updateInputFieldPosition(boolean z) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.zui_input_box_expanded_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.zui_input_box_collapsed_side_margin);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTextField.getLayoutParams();
        if (z) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        layoutParams.leftMargin = dimensionPixelSize;
        this.inputTextField.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendBtn(boolean z) {
        int m115425b;
        Context context = getContext();
        if (z) {
            m115425b = C31646Ad6.m115422e(R$attr.colorPrimary, context, R$color.zui_color_primary);
        } else {
            m115425b = C31646Ad6.m115425b(R$color.zui_color_disabled, context);
        }
        this.sendButton.setEnabled(z);
        C31646Ad6.m115424c(m115425b, this.sendButton.getDrawable(), this.sendButton);
    }

    private void viewInit(Context context) {
        View.inflate(context, R$layout.zui_view_input_box, this);
        if (isInEditMode()) {
            return;
        }
        bindViews();
        initListeners();
        showAttachmentsIndicator(false);
        updateSendBtn(false);
    }

    public boolean addSendButtonClickListener(View.OnClickListener onClickListener) {
        return this.sendButtonClickListeners.add(onClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.inputTextField.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return !isEnabled() || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        return this.inputTextField.requestFocus();
    }

    public void setAttachmentsCount(int i) {
        boolean z;
        this.attachmentsIndicator.setAttachmentsCount(i);
        boolean m27273b = C44504lS5.m27273b(this.inputTextField.getText().toString());
        boolean z2 = true;
        if (this.attachmentsIndicator.getAttachmentsCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!m27273b && !z) {
            z2 = false;
        }
        updateSendBtn(z2);
    }

    public void setAttachmentsIndicatorClickListener(View.OnClickListener onClickListener) {
        boolean z;
        this.attachmentsIndicatorClickListener = onClickListener;
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        showAttachmentsIndicator(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        this.inputTextField.setEnabled(z);
        if (!z) {
            this.inputTextField.clearFocus();
        }
        this.inputBox.setEnabled(z);
        ImageView imageView = this.sendButton;
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.2f;
        }
        imageView.setAlpha(f);
        AttachmentsIndicator attachmentsIndicator = this.attachmentsIndicator;
        if (!z) {
            f2 = 0.2f;
        }
        attachmentsIndicator.setAlpha(f2);
    }

    public void setHint(String str) {
        this.inputTextField.setHint(str);
    }

    public void setInputTextConsumer(InputTextConsumer inputTextConsumer) {
        this.inputTextConsumer = inputTextConsumer;
    }

    public void setInputTextWatcher(TextWatcher textWatcher) {
        this.inputTextWatcher = textWatcher;
    }

    public void setInputType(Integer num) {
        this.inputTextField.setInputType(num.intValue());
    }

    public InputBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sendButtonClickListeners = new ArrayList();
        viewInit(context);
    }

    public InputBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sendButtonClickListeners = new ArrayList();
        viewInit(context);
    }
}
