package com.facebook.share.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.share.model.ShareContent;
import p000.M80;
/* loaded from: classes5.dex */
public final class ShareButton extends ShareButtonBase {
    public ShareButton(Context context) {
        super(context, null, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    @Override // com.facebook.share.widget.ShareButtonBase, com.facebook.FacebookButtonBase
    /* renamed from: e */
    public void mo52084e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo52084e(context, attributeSet, i, i2);
        setCompoundDrawablesWithIntrinsicBounds(C29611vi.m8248b(getContext(), C50563vg4.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: g */
    public int mo52086g() {
        return M80.EnumC5210c.Share.m95691a();
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: h */
    public int mo52085h() {
        return C33354Hl4.com_facebook_button_share;
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    /* renamed from: v */
    public AbstractC43476jj1<ShareContent, Object> mo52081v() {
        if (m52882i() != null) {
            return new C34174Ky5(m52882i(), m52080w());
        }
        if (m52881j() != null) {
            return new C34174Ky5(m52881j(), m52080w());
        }
        return new C34174Ky5(m52883f(), m52080w());
    }

    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_share_button_create", "fb_share_button_did_tap");
    }
}
