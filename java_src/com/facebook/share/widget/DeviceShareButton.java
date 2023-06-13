package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.FacebookButtonBase;
import com.facebook.share.model.ShareContent;
import p000.M80;
@Deprecated
/* loaded from: classes5.dex */
public final class DeviceShareButton extends FacebookButtonBase {

    /* renamed from: j */
    public ShareContent f69883j;

    /* renamed from: k */
    public int f69884k;

    /* renamed from: l */
    public boolean f69885l;

    /* renamed from: m */
    public C37728a31 f69886m;

    /* renamed from: com.facebook.share.widget.DeviceShareButton$a */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17364a implements View.OnClickListener {
        public View$OnClickListenerC17364a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                DeviceShareButton.this.m52884d(view);
                DeviceShareButton.this.m52125w().mo30029i(DeviceShareButton.this.m52124x());
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public DeviceShareButton(Context context) {
        this(context, null, 0);
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: e */
    public void mo52084e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo52084e(context, attributeSet, i, i2);
        m52873r(m52123y());
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

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f69885l = true;
    }

    public void setShareContent(ShareContent shareContent) {
        this.f69883j = shareContent;
        if (!this.f69885l) {
            m52122z(m52126v());
        }
    }

    /* renamed from: v */
    public final boolean m52126v() {
        return new C37728a31(m52883f()).m30034b(m52124x());
    }

    /* renamed from: w */
    public final C37728a31 m52125w() {
        C37728a31 c37728a31 = this.f69886m;
        if (c37728a31 != null) {
            return c37728a31;
        }
        if (m52882i() != null) {
            this.f69886m = new C37728a31(m52882i());
        } else if (m52881j() != null) {
            this.f69886m = new C37728a31(m52881j());
        } else {
            this.f69886m = new C37728a31(m52883f());
        }
        return this.f69886m;
    }

    /* renamed from: x */
    public ShareContent m52124x() {
        return this.f69883j;
    }

    /* renamed from: y */
    public View.OnClickListener m52123y() {
        return new View$OnClickListenerC17364a();
    }

    /* renamed from: z */
    public final void m52122z(boolean z) {
        setEnabled(z);
        this.f69885l = false;
    }

    public DeviceShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DeviceShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_device_share_button_create", "fb_device_share_button_did_tap");
        this.f69884k = 0;
        this.f69885l = false;
        this.f69886m = null;
        this.f69884k = isInEditMode() ? 0 : mo52086g();
        m52122z(false);
    }
}
