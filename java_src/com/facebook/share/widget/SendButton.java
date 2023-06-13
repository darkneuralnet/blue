package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.share.model.ShareContent;
import p000.M80;
@Deprecated
/* loaded from: classes5.dex */
public final class SendButton extends ShareButtonBase {
    public SendButton(Context context) {
        super(context, null, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: g */
    public int mo52086g() {
        return M80.EnumC5210c.Message.m95691a();
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: h */
    public int mo52085h() {
        return C33354Hl4.com_facebook_button_send;
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    /* renamed from: v */
    public AbstractC43476jj1<ShareContent, Object> mo52081v() {
        if (m52882i() != null) {
            return new C45696nT2(m52882i(), m52080w());
        }
        if (m52881j() != null) {
            return new C45696nT2(m52881j(), m52080w());
        }
        return new C45696nT2(m52883f(), m52080w());
    }

    public SendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_send_button_create", "fb_send_button_did_tap");
    }
}
