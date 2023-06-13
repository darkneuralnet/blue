package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
/* renamed from: Zh */
/* loaded from: classes.dex */
public class C10331Zh {

    /* renamed from: a */
    public final View f48956a;

    /* renamed from: d */
    public X46 f48959d;

    /* renamed from: e */
    public X46 f48960e;

    /* renamed from: f */
    public X46 f48961f;

    /* renamed from: c */
    public int f48958c = -1;

    /* renamed from: b */
    public final C27043oi f48957b = C27043oi.m20611b();

    public C10331Zh(View view) {
        this.f48956a = view;
    }

    /* renamed from: a */
    public final boolean m72691a(Drawable drawable) {
        if (this.f48961f == null) {
            this.f48961f = new X46();
        }
        X46 x46 = this.f48961f;
        x46.m77430a();
        ColorStateList m62455u = C38790bq6.m62455u(this.f48956a);
        if (m62455u != null) {
            x46.f42623d = true;
            x46.f42620a = m62455u;
        }
        PorterDuff.Mode m62453v = C38790bq6.m62453v(this.f48956a);
        if (m62453v != null) {
            x46.f42622c = true;
            x46.f42621b = m62453v;
        }
        if (!x46.f42623d && !x46.f42622c) {
            return false;
        }
        C27043oi.m20604i(drawable, x46, this.f48956a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m72690b() {
        Drawable background = this.f48956a.getBackground();
        if (background != null) {
            if (m72681k() && m72691a(background)) {
                return;
            }
            X46 x46 = this.f48960e;
            if (x46 != null) {
                C27043oi.m20604i(background, x46, this.f48956a.getDrawableState());
                return;
            }
            X46 x462 = this.f48959d;
            if (x462 != null) {
                C27043oi.m20604i(background, x462, this.f48956a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m72689c() {
        X46 x46 = this.f48960e;
        if (x46 != null) {
            return x46.f42620a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m72688d() {
        X46 x46 = this.f48960e;
        if (x46 != null) {
            return x46.f42621b;
        }
        return null;
    }

    /* renamed from: e */
    public void m72687e(AttributeSet attributeSet, int i) {
        Context context = this.f48956a.getContext();
        int[] iArr = C43509jm4.ViewBackgroundHelper;
        Z46 m73747v = Z46.m73747v(context, attributeSet, iArr, i, 0);
        View view = this.f48956a;
        C38790bq6.m62456t0(view, view.getContext(), iArr, attributeSet, m73747v.m73751r(), i, 0);
        try {
            int i2 = C43509jm4.ViewBackgroundHelper_android_background;
            if (m73747v.m73750s(i2)) {
                this.f48958c = m73747v.m73755n(i2, -1);
                ColorStateList m20607f = this.f48957b.m20607f(this.f48956a.getContext(), this.f48958c);
                if (m20607f != null) {
                    m72684h(m20607f);
                }
            }
            int i3 = C43509jm4.ViewBackgroundHelper_backgroundTint;
            if (m73747v.m73750s(i3)) {
                C38790bq6.m62551B0(this.f48956a, m73747v.m73766c(i3));
            }
            int i4 = C43509jm4.ViewBackgroundHelper_backgroundTintMode;
            if (m73747v.m73750s(i4)) {
                C38790bq6.m62549C0(this.f48956a, C39565d71.m44598e(m73747v.m73758k(i4, -1), null));
            }
        } finally {
            m73747v.m73746w();
        }
    }

    /* renamed from: f */
    public void m72686f(Drawable drawable) {
        this.f48958c = -1;
        m72684h(null);
        m72690b();
    }

    /* renamed from: g */
    public void m72685g(int i) {
        ColorStateList colorStateList;
        this.f48958c = i;
        C27043oi c27043oi = this.f48957b;
        if (c27043oi != null) {
            colorStateList = c27043oi.m20607f(this.f48956a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m72684h(colorStateList);
        m72690b();
    }

    /* renamed from: h */
    public void m72684h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f48959d == null) {
                this.f48959d = new X46();
            }
            X46 x46 = this.f48959d;
            x46.f42620a = colorStateList;
            x46.f42623d = true;
        } else {
            this.f48959d = null;
        }
        m72690b();
    }

    /* renamed from: i */
    public void m72683i(ColorStateList colorStateList) {
        if (this.f48960e == null) {
            this.f48960e = new X46();
        }
        X46 x46 = this.f48960e;
        x46.f42620a = colorStateList;
        x46.f42623d = true;
        m72690b();
    }

    /* renamed from: j */
    public void m72682j(PorterDuff.Mode mode) {
        if (this.f48960e == null) {
            this.f48960e = new X46();
        }
        X46 x46 = this.f48960e;
        x46.f42621b = mode;
        x46.f42622c = true;
        m72690b();
    }

    /* renamed from: k */
    public final boolean m72681k() {
        return this.f48959d != null;
    }
}
