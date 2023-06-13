package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
import zendesk.messaging.R$string;
/* renamed from: zendesk.messaging.ui.AttachmentsIndicator */
/* loaded from: classes8.dex */
public class AttachmentsIndicator extends FrameLayout {
    private static final String COUNT_THRESHOLD_TEXT = String.valueOf(9) + "+";
    private int attachmentsCount;
    private View attachmentsIndicatorBottomBorder;
    private TextView attachmentsIndicatorCounter;
    private ImageView attachmentsIndicatorIcon;
    private int colorActive;
    private int colorInactive;

    public AttachmentsIndicator(Context context) {
        super(context);
        init(context);
    }

    public static String getContentDescriptionForAttachmentButton(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R$string.zui_attachment_indicator_accessibility));
        sb.append(". ");
        if (i == 0) {
            sb.append(context.getString(R$string.zui_attachment_indicator_no_attachments_selected_accessibility));
        } else if (i == 1) {
            sb.append(context.getString(R$string.zui_attachment_indicator_one_attachments_selected_accessibility));
        } else {
            sb.append(context.getString(R$string.zui_attachment_indicator_n_attachments_selected_accessibility, Integer.valueOf(i)));
        }
        return sb.toString();
    }

    public void enableActiveState(boolean z) {
        int i;
        if (z) {
            i = this.colorActive;
        } else {
            i = this.colorInactive;
        }
        C31646Ad6.m115424c(i, this.attachmentsIndicatorIcon.getDrawable(), this.attachmentsIndicatorIcon);
    }

    public int getAttachmentsCount() {
        return this.attachmentsCount;
    }

    public void init(Context context) {
        View.inflate(context, R$layout.zui_view_attachments_indicator, this);
        if (isInEditMode()) {
            return;
        }
        this.attachmentsIndicatorIcon = (ImageView) findViewById(R$id.attachments_indicator_icon);
        this.attachmentsIndicatorBottomBorder = findViewById(R$id.attachments_indicator_bottom_border);
        this.attachmentsIndicatorCounter = (TextView) findViewById(R$id.attachments_indicator_counter);
        this.colorActive = C31646Ad6.m115422e(R$attr.colorPrimary, context, R$color.zui_color_primary);
        this.colorInactive = C31646Ad6.m115425b(R$color.zui_attachment_indicator_color_inactive, context);
        ((GradientDrawable) ((LayerDrawable) this.attachmentsIndicatorCounter.getBackground()).findDrawableByLayerId(R$id.inner_circle)).setColor(this.colorActive);
        setContentDescription(getContentDescriptionForAttachmentButton(getContext(), this.attachmentsCount));
    }

    public void reset() {
        setCounterVisible(false);
        setAttachmentsCount(0);
        setBottomBorderVisible(false);
        enableActiveState(false);
    }

    public void setAttachmentsCount(int i) {
        int i2;
        String valueOf;
        boolean z;
        this.attachmentsCount = i;
        if (i > 9) {
            i2 = R$dimen.zui_attachment_indicator_counter_width_double_digit;
        } else {
            i2 = R$dimen.zui_attachment_indicator_counter_width_single_digit;
        }
        ViewGroup.LayoutParams layoutParams = this.attachmentsIndicatorCounter.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i2);
        this.attachmentsIndicatorCounter.setLayoutParams(layoutParams);
        TextView textView = this.attachmentsIndicatorCounter;
        if (i > 9) {
            valueOf = COUNT_THRESHOLD_TEXT;
        } else {
            valueOf = String.valueOf(i);
        }
        textView.setText(valueOf);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        setCounterVisible(z);
        setBottomBorderVisible(z);
        enableActiveState(z);
        setContentDescription(getContentDescriptionForAttachmentButton(getContext(), i));
    }

    public void setBottomBorderVisible(boolean z) {
        this.attachmentsIndicatorBottomBorder.setVisibility(z ? 0 : 4);
    }

    public void setCounterVisible(boolean z) {
        this.attachmentsIndicatorCounter.setVisibility(z ? 0 : 4);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public AttachmentsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
