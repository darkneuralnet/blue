package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* renamed from: Xb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37009Xb5 extends Drawable {

    /* renamed from: a */
    public float f43461a;

    /* renamed from: c */
    public final RectF f43463c;

    /* renamed from: d */
    public final Rect f43464d;

    /* renamed from: e */
    public float f43465e;

    /* renamed from: h */
    public ColorStateList f43468h;

    /* renamed from: i */
    public PorterDuffColorFilter f43469i;

    /* renamed from: j */
    public ColorStateList f43470j;

    /* renamed from: f */
    public boolean f43466f = false;

    /* renamed from: g */
    public boolean f43467g = true;

    /* renamed from: k */
    public PorterDuff.Mode f43471k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f43462b = new Paint(5);

    public C37009Xb5(ColorStateList colorStateList, float f) {
        this.f43461a = f;
        m76808e(colorStateList);
        this.f43463c = new RectF();
        this.f43464d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m76812a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    /* renamed from: b */
    public ColorStateList m76811b() {
        return this.f43468h;
    }

    /* renamed from: c */
    public float m76810c() {
        return this.f43465e;
    }

    /* renamed from: d */
    public float m76809d() {
        return this.f43461a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f43462b;
        if (this.f43469i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f43469i);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.f43463c;
        float f = this.f43461a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public final void m76808e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f43468h = colorStateList;
        this.f43462b.setColor(colorStateList.getColorForState(getState(), this.f43468h.getDefaultColor()));
    }

    /* renamed from: f */
    public void m76807f(ColorStateList colorStateList) {
        m76808e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m76806g(float f, boolean z, boolean z2) {
        if (f == this.f43465e && this.f43466f == z && this.f43467g == z2) {
            return;
        }
        this.f43465e = f;
        this.f43466f = z;
        this.f43467g = z2;
        m76804i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f43464d, this.f43461a);
    }

    /* renamed from: h */
    public void m76805h(float f) {
        if (f == this.f43461a) {
            return;
        }
        this.f43461a = f;
        m76804i(null);
        invalidateSelf();
    }

    /* renamed from: i */
    public final void m76804i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f43463c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f43464d.set(rect);
        if (this.f43466f) {
            float m74827b = C37243Yb5.m74827b(this.f43465e, this.f43461a, this.f43467g);
            this.f43464d.inset((int) Math.ceil(C37243Yb5.m74828a(this.f43465e, this.f43461a, this.f43467g)), (int) Math.ceil(m74827b));
            this.f43463c.set(this.f43464d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f43470j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f43468h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m76804i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f43468h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f43462b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f43462b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f43470j;
        if (colorStateList2 != null && (mode = this.f43471k) != null) {
            this.f43469i = m76812a(colorStateList2, mode);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f43462b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43462b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f43470j = colorStateList;
        this.f43469i = m76812a(colorStateList, this.f43471k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f43471k = mode;
        this.f43469i = m76812a(this.f43470j, mode);
        invalidateSelf();
    }
}
