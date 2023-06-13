package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* renamed from: zj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52962zj1 extends Drawable {

    /* renamed from: a */
    public final Drawable f122117a;

    /* renamed from: b */
    public final Drawable f122118b;

    /* renamed from: c */
    public final float[] f122119c;

    /* renamed from: d */
    public float f122120d;

    public C52962zj1(Drawable drawable, Drawable drawable2) {
        this.f122117a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f122118b = mutate;
        mutate.setAlpha(0);
        this.f122119c = new float[2];
    }

    /* renamed from: a */
    public void m477a(float f) {
        if (this.f122120d != f) {
            this.f122120d = f;
            C31929Bj1.m113644a(f, this.f122119c);
            this.f122117a.setAlpha((int) (this.f122119c[0] * 255.0f));
            this.f122118b.setAlpha((int) (this.f122119c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f122117a.draw(canvas);
        this.f122118b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f122117a.getIntrinsicHeight(), this.f122118b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f122117a.getIntrinsicWidth(), this.f122118b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f122117a.getMinimumHeight(), this.f122118b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f122117a.getMinimumWidth(), this.f122118b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f122117a.isStateful() || this.f122118b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f122120d <= 0.5f) {
            this.f122117a.setAlpha(i);
            this.f122118b.setAlpha(0);
        } else {
            this.f122117a.setAlpha(0);
            this.f122118b.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f122117a.setBounds(i, i2, i3, i4);
        this.f122118b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f122117a.setColorFilter(colorFilter);
        this.f122118b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f122117a.setState(iArr);
        boolean state2 = this.f122118b.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }
}
