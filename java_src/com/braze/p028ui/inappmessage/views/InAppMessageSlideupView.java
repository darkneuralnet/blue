package com.braze.p028ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.p027ui.R$dimen;
import com.appboy.p027ui.R$id;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageSlideupView */
/* loaded from: classes5.dex */
public class InAppMessageSlideupView extends InAppMessageBaseView {
    private static final String TAG = C43664k20.m29433n(InAppMessageSlideupView.class);
    private InAppMessageImageView mInAppMessageImageView;

    public InAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void applyInAppMessageParameters(InterfaceC50985wO1 interfaceC50985wO1) {
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_slideup_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        inAppMessageImageView.setInAppMessageImageCropType(interfaceC50985wO1.mo6948N());
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView, p000.EO1
    public void applyWindowInsets(DB6 db6) {
        super.applyWindowInsets(db6);
        if (getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.setMargins(C36938Wt6.m77741c(db6) + marginLayoutParams.leftMargin, C36938Wt6.m77739e(db6) + marginLayoutParams.topMargin, C36938Wt6.m77740d(db6) + marginLayoutParams.rightMargin, C36938Wt6.m77742b(db6) + marginLayoutParams.bottomMargin);
            return;
        }
        C43664k20.m29438i(TAG, "Close button view is null or not of the expected class. Not applying window insets.");
    }

    public View getMessageChevronView() {
        return findViewById(R$id.com_braze_inappmessage_slideup_chevron);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_slideup_icon);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_slideup_message);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        boolean z2;
        super.resetMessageMargins(z);
        if (getMessageIconView() != null && getMessageIconView().getText() != null && getMessageIconView().getText().length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && z2) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_braze_inappmessage_slideup_image_layout);
            if (relativeLayout != null) {
                C36938Wt6.m77734j(relativeLayout);
            }
            TextView textView = (TextView) findViewById(R$id.com_braze_inappmessage_slideup_message);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
            textView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            DZ1.m110177k(getMessageBackgroundObject(), i);
        } else {
            super.setMessageBackgroundColor(i);
        }
    }

    public void setMessageChevron(int i, EnumC37310Yj0 enumC37310Yj0) {
        if (enumC37310Yj0 == EnumC37310Yj0.NONE) {
            getMessageChevronView().setVisibility(8);
        } else {
            DZ1.m110177k(getMessageChevronView(), i);
        }
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_braze_inappmessage_slideup_container);
    }
}
