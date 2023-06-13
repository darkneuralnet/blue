package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import zendesk.support.UiUtils;
/* loaded from: classes8.dex */
class ViewCellAttachmentMenuItem extends FrameLayout {
    private TextView badge;
    private View badgeContainer;
    private View shadow;

    public ViewCellAttachmentMenuItem(Context context) {
        super(context);
        viewInit();
    }

    private void bindViews() {
        this.badgeContainer = findViewById(C35181Pg4.request_actionview_badge_container);
        this.badge = (TextView) findViewById(C35181Pg4.request_actionview_attachment_count);
        this.shadow = findViewById(C35181Pg4.request_actionview_compat_shadow);
    }

    private void tintBadge() {
        UiUtils.setTint(UiUtils.themeAttributeToColor(C44032kf4.colorAccent, getContext(), C52925zf4.zs_request_fallback_color_primary), this.badge.getBackground(), this.badge);
    }

    private void viewInit() {
        View.inflate(getContext(), C52975zk4.zs_request_attachment_actionview, this);
        bindViews();
        tintBadge();
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), 0));
    }

    public void setBadgeCount(int i) {
        if (i > 0) {
            this.badgeContainer.setVisibility(0);
            this.badge.setText(String.valueOf(i));
        } else {
            this.badgeContainer.setVisibility(8);
        }
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), i));
    }

    public ViewCellAttachmentMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit();
    }

    public ViewCellAttachmentMenuItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit();
    }
}
