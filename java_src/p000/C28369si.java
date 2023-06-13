package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
/* renamed from: si */
/* loaded from: classes.dex */
public class C28369si {

    /* renamed from: a */
    public final ImageView f109133a;

    /* renamed from: b */
    public X46 f109134b;

    /* renamed from: c */
    public X46 f109135c;

    /* renamed from: d */
    public X46 f109136d;

    /* renamed from: e */
    public int f109137e = 0;

    public C28369si(ImageView imageView) {
        this.f109133a = imageView;
    }

    /* renamed from: a */
    public final boolean m13817a(Drawable drawable) {
        if (this.f109136d == null) {
            this.f109136d = new X46();
        }
        X46 x46 = this.f109136d;
        x46.m77430a();
        ColorStateList m5037a = C51668xY1.m5037a(this.f109133a);
        if (m5037a != null) {
            x46.f42623d = true;
            x46.f42620a = m5037a;
        }
        PorterDuff.Mode m5036b = C51668xY1.m5036b(this.f109133a);
        if (m5036b != null) {
            x46.f42622c = true;
            x46.f42621b = m5036b;
        }
        if (!x46.f42623d && !x46.f42622c) {
            return false;
        }
        C27043oi.m20604i(drawable, x46, this.f109133a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m13816b() {
        if (this.f109133a.getDrawable() != null) {
            this.f109133a.getDrawable().setLevel(this.f109137e);
        }
    }

    /* renamed from: c */
    public void m13815c() {
        Drawable drawable = this.f109133a.getDrawable();
        if (drawable != null) {
            C39565d71.m44601b(drawable);
        }
        if (drawable != null) {
            if (m13808j() && m13817a(drawable)) {
                return;
            }
            X46 x46 = this.f109135c;
            if (x46 != null) {
                C27043oi.m20604i(drawable, x46, this.f109133a.getDrawableState());
                return;
            }
            X46 x462 = this.f109134b;
            if (x462 != null) {
                C27043oi.m20604i(drawable, x462, this.f109133a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public boolean m13814d() {
        if (this.f109133a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m13813e(AttributeSet attributeSet, int i) {
        int m73755n;
        Context context = this.f109133a.getContext();
        int[] iArr = C43509jm4.AppCompatImageView;
        Z46 m73747v = Z46.m73747v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f109133a;
        C38790bq6.m62456t0(imageView, imageView.getContext(), iArr, attributeSet, m73747v.m73751r(), i, 0);
        try {
            Drawable drawable = this.f109133a.getDrawable();
            if (drawable == null && (m73755n = m73747v.m73755n(C43509jm4.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C29611vi.m8248b(this.f109133a.getContext(), m73755n)) != null) {
                this.f109133a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C39565d71.m44601b(drawable);
            }
            int i2 = C43509jm4.AppCompatImageView_tint;
            if (m73747v.m73750s(i2)) {
                C51668xY1.m5035c(this.f109133a, m73747v.m73766c(i2));
            }
            int i3 = C43509jm4.AppCompatImageView_tintMode;
            if (m73747v.m73750s(i3)) {
                C51668xY1.m5034d(this.f109133a, C39565d71.m44598e(m73747v.m73758k(i3, -1), null));
            }
        } finally {
            m73747v.m73746w();
        }
    }

    /* renamed from: f */
    public void m13812f(Drawable drawable) {
        this.f109137e = drawable.getLevel();
    }

    /* renamed from: g */
    public void m13811g(int i) {
        if (i != 0) {
            Drawable m8248b = C29611vi.m8248b(this.f109133a.getContext(), i);
            if (m8248b != null) {
                C39565d71.m44601b(m8248b);
            }
            this.f109133a.setImageDrawable(m8248b);
        } else {
            this.f109133a.setImageDrawable(null);
        }
        m13815c();
    }

    /* renamed from: h */
    public void m13810h(ColorStateList colorStateList) {
        if (this.f109135c == null) {
            this.f109135c = new X46();
        }
        X46 x46 = this.f109135c;
        x46.f42620a = colorStateList;
        x46.f42623d = true;
        m13815c();
    }

    /* renamed from: i */
    public void m13809i(PorterDuff.Mode mode) {
        if (this.f109135c == null) {
            this.f109135c = new X46();
        }
        X46 x46 = this.f109135c;
        x46.f42621b = mode;
        x46.f42622c = true;
        m13815c();
    }

    /* renamed from: j */
    public final boolean m13808j() {
        return this.f109134b != null;
    }
}
