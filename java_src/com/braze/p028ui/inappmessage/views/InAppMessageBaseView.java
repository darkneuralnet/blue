package com.braze.p028ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.File;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageBaseView */
/* loaded from: classes5.dex */
public abstract class InAppMessageBaseView extends RelativeLayout implements EO1 {
    private static final String TAG = C43664k20.m29433n(InAppMessageBaseView.class);
    protected boolean mHasAppliedWindowInsets;

    public InAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHasAppliedWindowInsets = false;
    }

    public static String getAppropriateImageUrl(KO1 ko1) {
        String mo98925e = ko1.mo98925e();
        if (!C43318jS5.m30597g(mo98925e)) {
            if (new File(mo98925e).exists()) {
                return mo98925e;
            }
            String str = TAG;
            C43664k20.m29438i(str, "Local bitmap file does not exist. Using remote url instead. Local path: " + mo98925e);
        }
        return ko1.mo98924w();
    }

    @Override // p000.EO1
    public void applyWindowInsets(DB6 db6) {
        this.mHasAppliedWindowInsets = true;
    }

    public abstract Object getMessageBackgroundObject();

    @Override // p000.EO1
    public View getMessageClickableView() {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    @Override // p000.EO1
    public boolean hasAppliedWindowInsets() {
        return this.mHasAppliedWindowInsets;
    }

    public void resetMessageMargins(boolean z) {
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (!z) {
                C36938Wt6.m77734j(messageImageView);
            } else {
                C36938Wt6.m77734j(getMessageIconView());
            }
        }
        if (getMessageIconView() != null && getMessageIconView().getText() != null && C43318jS5.m30597g(getMessageIconView().getText().toString())) {
            C36938Wt6.m77734j(getMessageIconView());
        }
    }

    public void setMessage(String str) {
        getMessageTextView().setText(str);
    }

    public void setMessageBackgroundColor(int i) {
        DZ1.m110178j((View) getMessageBackgroundObject(), i);
    }

    public void setMessageIcon(String str, int i, int i2) {
        if (getMessageIconView() != null) {
            DZ1.m110182f(getContext(), str, i, i2, getMessageIconView());
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        DZ1.m110181g(bitmap, getMessageImageView());
    }

    public void setMessageTextAlign(EnumC48393s06 enumC48393s06) {
        DZ1.m110180h(getMessageTextView(), enumC48393s06);
    }

    public void setMessageTextColor(int i) {
        DZ1.m110179i(getMessageTextView(), i);
    }
}
