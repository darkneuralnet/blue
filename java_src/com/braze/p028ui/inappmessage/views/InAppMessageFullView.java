package com.braze.p028ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.p027ui.R$id;
import com.braze.p028ui.inappmessage.views.InAppMessageFullView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageFullView */
/* loaded from: classes5.dex */
public class InAppMessageFullView extends InAppMessageImmersiveBaseView {
    private static final String TAG = C43664k20.m29433n(InAppMessageFullView.class);
    private InAppMessageImageView mInAppMessageImageView;
    private boolean mIsGraphic;

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void applyDisplayCutoutMarginsToCloseButton(DB6 db6, View view) {
        if (view.getLayoutParams() != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(C36938Wt6.m77741c(db6) + marginLayoutParams.leftMargin, C36938Wt6.m77739e(db6) + marginLayoutParams.topMargin, C36938Wt6.m77740d(db6) + marginLayoutParams.rightMargin, C36938Wt6.m77742b(db6) + marginLayoutParams.bottomMargin);
            return;
        }
        C43664k20.m29438i(TAG, "Close button layout params are null or not of the expected class. Not applying window insets.");
    }

    private void applyDisplayCutoutMarginsToContentArea(DB6 db6, View view) {
        if (view.getLayoutParams() != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(C36938Wt6.m77741c(db6) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, C36938Wt6.m77740d(db6) + marginLayoutParams.rightMargin, C36938Wt6.m77742b(db6) + marginLayoutParams.bottomMargin);
            return;
        }
        C43664k20.m29438i(TAG, "Content area layout params are null or not of the expected class. Not applying window insets.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetMessageMargins$0(View view) {
        C43664k20.m29438i(TAG, "Passing scrollView click event to message clickable view.");
        getMessageClickableView().performClick();
    }

    private void setInAppMessageImageViewAttributes(Activity activity, AO1 ao1, InterfaceC52764zO1 interfaceC52764zO1) {
        interfaceC52764zO1.setInAppMessageImageCropType(ao1.mo6948N());
        if (C36938Wt6.m77735i(activity)) {
            float m77743a = (float) C36938Wt6.m77743a(activity, C43071j20.m31236a());
            if (ao1.mo14015Y().equals(ZX1.GRAPHIC)) {
                interfaceC52764zO1.setCornersRadiusPx(m77743a);
                return;
            } else {
                interfaceC52764zO1.setCornersRadiiPx(m77743a, m77743a, 0.0f, 0.0f);
                return;
            }
        }
        interfaceC52764zO1.setCornersRadiusPx(0.0f);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView, p000.EO1
    public void applyWindowInsets(DB6 db6) {
        super.applyWindowInsets(db6);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(db6, messageCloseButtonView);
        }
        if (this.mIsGraphic) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                applyDisplayCutoutMarginsToContentArea(db6, findViewById);
                return;
            }
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById2 != null && findViewById2.getVisibility() == 0) {
                applyDisplayCutoutMarginsToContentArea(db6, findViewById2);
                return;
            }
            return;
        }
        View findViewById3 = findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent);
        if (findViewById3 != null) {
            applyDisplayCutoutMarginsToContentArea(db6, findViewById3);
        }
    }

    public void createAppropriateViews(Activity activity, AO1 ao1, boolean z) {
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_full_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        setInAppMessageImageViewAttributes(activity, ao1, inAppMessageImageView);
        this.mIsGraphic = z;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R$id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R$id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView, p000.BO1
    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_full_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(R$id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_braze_inappmessage_full_button_dual_one);
            View findViewById5 = findViewById(R$id.com_braze_inappmessage_full_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
            }
        }
        return arrayList;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView, p000.EO1
    public View getMessageClickableView() {
        return findViewById(R$id.com_braze_inappmessage_full);
    }

    @Override // p000.BO1
    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_braze_inappmessage_full_close_button);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_full_header_text);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return null;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R$id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        findViewById(R$id.com_braze_inappmessage_full_text_layout).setOnClickListener(new View.OnClickListener() { // from class: oZ1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InAppMessageFullView.this.lambda$resetMessageMargins$0(view);
            }
        });
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            DZ1.m110177k(getMessageBackgroundObject(), i);
        } else if (this.mIsGraphic) {
            super.setMessageBackgroundColor(i);
        } else {
            DZ1.m110178j(findViewById(R$id.com_braze_inappmessage_full_all_content_parent), i);
            DZ1.m110178j(findViewById(R$id.com_braze_inappmessage_full_text_and_button_content_parent), i);
        }
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_braze_inappmessage_full);
    }
}
