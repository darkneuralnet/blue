package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.FacebookButtonBase;
import com.facebook.share.model.ShareContent;
/* loaded from: classes5.dex */
public abstract class ShareButtonBase extends FacebookButtonBase {

    /* renamed from: j */
    public ShareContent f69938j;

    /* renamed from: k */
    public int f69939k;

    /* renamed from: l */
    public boolean f69940l;

    /* renamed from: com.facebook.share.widget.ShareButtonBase$a */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17374a implements View.OnClickListener {
        public View$OnClickListenerC17374a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                ShareButtonBase.this.m52884d(view);
                ShareButtonBase.this.mo52081v().mo30029i(ShareButtonBase.this.m52079x());
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public ShareButtonBase(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, i, 0, str, str2);
        int mo52086g;
        this.f69939k = 0;
        this.f69940l = false;
        if (isInEditMode()) {
            mo52086g = 0;
        } else {
            mo52086g = mo52086g();
        }
        this.f69939k = mo52086g;
        m52077z(false);
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: e */
    public void mo52084e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo52084e(context, attributeSet, i, i2);
        m52873r(m52078y());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f69940l = true;
    }

    public void setShareContent(ShareContent shareContent) {
        this.f69938j = shareContent;
        if (!this.f69940l) {
            m52077z(m52082u());
        }
    }

    /* renamed from: u */
    public boolean m52082u() {
        return mo52081v().m30034b(m52079x());
    }

    /* renamed from: v */
    public abstract AbstractC43476jj1<ShareContent, Object> mo52081v();

    /* renamed from: w */
    public int m52080w() {
        return this.f69939k;
    }

    /* renamed from: x */
    public ShareContent m52079x() {
        return this.f69938j;
    }

    /* renamed from: y */
    public View.OnClickListener m52078y() {
        return new View$OnClickListenerC17374a();
    }

    /* renamed from: z */
    public final void m52077z(boolean z) {
        setEnabled(z);
        this.f69940l = false;
    }
}
