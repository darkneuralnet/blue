package zendesk.support.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import zendesk.support.UiUtils;
/* loaded from: classes8.dex */
public class ViewAttachmentsIndicator extends FrameLayout {
    private static final int COUNT_THRESHOLD = 9;
    private static final String COUNT_THRESHOLD_TEXT = String.valueOf(9) + "+";
    private int attachmentsCount;
    private View attachmentsIndicatorBottomBorder;
    private TextView attachmentsIndicatorCounter;
    private ImageView attachmentsIndicatorIcon;
    private int colorActive;
    private int colorInactive;

    public ViewAttachmentsIndicator(Context context) {
        super(context);
        init(context);
    }

    public void enableActiveState(boolean z) {
        int i;
        Drawable mutate = P61.m90834r(this.attachmentsIndicatorIcon.getDrawable()).mutate();
        if (z) {
            i = this.colorActive;
        } else {
            i = this.colorInactive;
        }
        P61.m90838n(mutate, i);
        this.attachmentsIndicatorIcon.invalidate();
    }

    public int getAttachmentsCount() {
        return this.attachmentsCount;
    }

    public void init(Context context) {
        View.inflate(context, C52975zk4.zs_view_request_attachments_indicator, this);
        if (isInEditMode()) {
            return;
        }
        this.attachmentsIndicatorIcon = (ImageView) findViewById(C35181Pg4.attachments_indicator_icon);
        this.attachmentsIndicatorBottomBorder = findViewById(C35181Pg4.attachments_indicator_bottom_border);
        this.attachmentsIndicatorCounter = (TextView) findViewById(C35181Pg4.attachments_indicator_counter);
        this.colorActive = UiUtils.themeAttributeToColor(C44032kf4.colorPrimary, context, C52925zf4.zs_request_fallback_color_primary);
        this.colorInactive = UiUtils.resolveColor(C52925zf4.zs_request_attachment_indicator_color_inactive, context);
        ((GradientDrawable) ((LayerDrawable) this.attachmentsIndicatorCounter.getBackground()).findDrawableByLayerId(C35181Pg4.inner_circle)).setColor(this.colorActive);
        getContext().getString(C41720gl4.zs_request_attachment_indicator_accessibility);
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
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
            i2 = C35640Rf4.zs_request_attachment_indicator_counter_width_double_digit;
        } else {
            i2 = C35640Rf4.zs_request_attachment_indicator_counter_width_single_digit;
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
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
    }

    public void setBottomBorderVisible(boolean z) {
        this.attachmentsIndicatorBottomBorder.setVisibility(z ? 0 : 4);
    }

    public void setCounterVisible(boolean z) {
        this.attachmentsIndicatorCounter.setVisibility(z ? 0 : 4);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
