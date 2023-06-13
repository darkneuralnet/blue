package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* renamed from: xi */
/* loaded from: classes.dex */
public class C30269xi extends C28802ti {

    /* renamed from: d */
    public final SeekBar f117984d;

    /* renamed from: e */
    public Drawable f117985e;

    /* renamed from: f */
    public ColorStateList f117986f;

    /* renamed from: g */
    public PorterDuff.Mode f117987g;

    /* renamed from: h */
    public boolean f117988h;

    /* renamed from: i */
    public boolean f117989i;

    public C30269xi(SeekBar seekBar) {
        super(seekBar);
        this.f117986f = null;
        this.f117987g = null;
        this.f117988h = false;
        this.f117989i = false;
        this.f117984d = seekBar;
    }

    @Override // p000.C28802ti
    /* renamed from: c */
    public void mo4867c(AttributeSet attributeSet, int i) {
        super.mo4867c(attributeSet, i);
        Context context = this.f117984d.getContext();
        int[] iArr = C43509jm4.AppCompatSeekBar;
        Z46 m73747v = Z46.m73747v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f117984d;
        C38790bq6.m62456t0(seekBar, seekBar.getContext(), iArr, attributeSet, m73747v.m73751r(), i, 0);
        Drawable m73761h = m73747v.m73761h(C43509jm4.AppCompatSeekBar_android_thumb);
        if (m73761h != null) {
            this.f117984d.setThumb(m73761h);
        }
        m4862j(m73747v.m73762g(C43509jm4.AppCompatSeekBar_tickMark));
        int i2 = C43509jm4.AppCompatSeekBar_tickMarkTintMode;
        if (m73747v.m73750s(i2)) {
            this.f117987g = C39565d71.m44598e(m73747v.m73758k(i2, -1), this.f117987g);
            this.f117989i = true;
        }
        int i3 = C43509jm4.AppCompatSeekBar_tickMarkTint;
        if (m73747v.m73750s(i3)) {
            this.f117986f = m73747v.m73766c(i3);
            this.f117988h = true;
        }
        m73747v.m73746w();
        m4866f();
    }

    /* renamed from: f */
    public final void m4866f() {
        Drawable drawable = this.f117985e;
        if (drawable != null) {
            if (this.f117988h || this.f117989i) {
                Drawable m90834r = P61.m90834r(drawable.mutate());
                this.f117985e = m90834r;
                if (this.f117988h) {
                    P61.m90837o(m90834r, this.f117986f);
                }
                if (this.f117989i) {
                    P61.m90836p(this.f117985e, this.f117987g);
                }
                if (this.f117985e.isStateful()) {
                    this.f117985e.setState(this.f117984d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public void m4865g(Canvas canvas) {
        int i;
        if (this.f117985e != null) {
            int max = this.f117984d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f117985e.getIntrinsicWidth();
                int intrinsicHeight = this.f117985e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f117985e.setBounds(-i, -i2, i, i2);
                float width = ((this.f117984d.getWidth() - this.f117984d.getPaddingLeft()) - this.f117984d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f117984d.getPaddingLeft(), this.f117984d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f117985e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void m4864h() {
        Drawable drawable = this.f117985e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f117984d.getDrawableState())) {
            this.f117984d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m4863i() {
        Drawable drawable = this.f117985e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void m4862j(Drawable drawable) {
        Drawable drawable2 = this.f117985e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f117985e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f117984d);
            P61.m90839m(drawable, C38790bq6.m62548D(this.f117984d));
            if (drawable.isStateful()) {
                drawable.setState(this.f117984d.getDrawableState());
            }
            m4866f();
        }
        this.f117984d.invalidate();
    }
}
