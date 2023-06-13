package com.braze.p028ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.p027ui.R$dimen;
import com.appboy.p027ui.R$id;
import com.braze.p028ui.inappmessage.views.InAppMessageModalView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageModalView */
/* loaded from: classes5.dex */
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {
    private static final String TAG = C43664k20.m29433n(InAppMessageModalView.class);
    private C51677xZ1 mInAppMessage;
    private InAppMessageImageView mInAppMessageImageView;

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetMessageMargins$0(View view) {
        C43664k20.m29438i(TAG, "Passing scrollView click event to message clickable view.");
        getMessageClickableView().performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resizeGraphicFrameIfAppropriate$1(int i, int i2, int i3, double d) {
        double min = Math.min(getMeasuredWidth() - i, i2);
        double min2 = Math.min(getMeasuredHeight() - i, i3);
        View findViewById = findViewById(R$id.com_braze_inappmessage_modal_graphic_bound);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        if (d >= min / min2) {
            layoutParams.width = (int) min;
            layoutParams.height = (int) (min / d);
        } else {
            layoutParams.width = (int) (d * min2);
            layoutParams.height = (int) min2;
        }
        findViewById.setLayoutParams(layoutParams);
    }

    private void resizeGraphicFrameIfAppropriate(Context context, C51677xZ1 c51677xZ1) {
        if (c51677xZ1 == null || c51677xZ1.getBitmap() == null || !c51677xZ1.mo14015Y().equals(ZX1.GRAPHIC)) {
            return;
        }
        final double width = c51677xZ1.getBitmap().getWidth() / c51677xZ1.getBitmap().getHeight();
        Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_margin);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_width);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_height);
        post(new Runnable() { // from class: yZ1
            @Override // java.lang.Runnable
            public final void run() {
                InAppMessageModalView.this.lambda$resizeGraphicFrameIfAppropriate$1(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, width);
            }
        });
    }

    private void setInAppMessageImageViewAttributes(Context context, AO1 ao1, InterfaceC52764zO1 interfaceC52764zO1) {
        float m77743a = (float) C36938Wt6.m77743a(context, C43071j20.m31236a());
        if (ao1.mo14015Y().equals(ZX1.GRAPHIC)) {
            interfaceC52764zO1.setCornersRadiusPx(m77743a);
        } else {
            interfaceC52764zO1.setCornersRadiiPx(m77743a, m77743a, 0.0f, 0.0f);
        }
        interfaceC52764zO1.setInAppMessageImageCropType(ao1.mo6948N());
    }

    public void applyInAppMessageParameters(Context context, C51677xZ1 c51677xZ1) {
        this.mInAppMessage = c51677xZ1;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_modal_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        setInAppMessageImageViewAttributes(context, c51677xZ1, inAppMessageImageView);
        resizeGraphicFrameIfAppropriate(context, c51677xZ1);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R$id.com_braze_inappmessage_modal_frame);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView, p000.BO1
    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(R$id.com_braze_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_two);
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
        return findViewById(R$id.com_braze_inappmessage_modal);
    }

    @Override // p000.BO1
    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_braze_inappmessage_modal_close_button);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_header_text);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_icon);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_message);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        resizeGraphicFrameIfAppropriate(getContext(), this.mInAppMessage);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_braze_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        findViewById(R$id.com_braze_inappmessage_modal_text_layout).setOnClickListener(new View.OnClickListener() { // from class: zZ1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InAppMessageModalView.this.lambda$resetMessageMargins$0(view);
            }
        });
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        DZ1.m110177k(findViewById(R$id.com_braze_inappmessage_modal), i);
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageBaseView
    public Drawable getMessageBackgroundObject() {
        return getMessageClickableView().getBackground();
    }
}
