package com.facebook.share.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.FacebookButtonBase;
@Deprecated
/* loaded from: classes5.dex */
public class LikeButton extends FacebookButtonBase {
    @Deprecated
    public LikeButton(Context context, boolean z) {
        super(context, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(z);
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: e */
    public void mo52084e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo52084e(context, attributeSet, i, i2);
        m52397t();
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: h */
    public int mo52085h() {
        return C32886Fl4.com_facebook_button_like;
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public void setSelected(boolean z) {
        super.setSelected(z);
        m52397t();
    }

    /* renamed from: t */
    public final void m52397t() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(C50563vg4.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(C38738bl4.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(C29611vi.m8248b(getContext(), C50563vg4.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        setText(getResources().getString(C38738bl4.com_facebook_like_button_not_liked));
    }
}
