package p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* renamed from: cZ */
/* loaded from: classes6.dex */
public class C13592cZ extends Drawable {

    /* renamed from: b */
    public final Paint f60883b;

    /* renamed from: h */
    public float f60889h;

    /* renamed from: i */
    public int f60890i;

    /* renamed from: j */
    public int f60891j;

    /* renamed from: k */
    public int f60892k;

    /* renamed from: l */
    public int f60893l;

    /* renamed from: m */
    public int f60894m;

    /* renamed from: o */
    public C43037iy5 f60896o;

    /* renamed from: p */
    public ColorStateList f60897p;

    /* renamed from: a */
    public final C43630jy5 f60882a = C43630jy5.m29567k();

    /* renamed from: c */
    public final Path f60884c = new Path();

    /* renamed from: d */
    public final Rect f60885d = new Rect();

    /* renamed from: e */
    public final RectF f60886e = new RectF();

    /* renamed from: f */
    public final RectF f60887f = new RectF();

    /* renamed from: g */
    public final C13594b f60888g = new C13594b();

    /* renamed from: n */
    public boolean f60895n = true;

    /* renamed from: cZ$b */
    /* loaded from: classes6.dex */
    public class C13594b extends Drawable.ConstantState {
        public C13594b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C13592cZ.this;
        }
    }

    public C13592cZ(C43037iy5 c43037iy5) {
        this.f60896o = c43037iy5;
        Paint paint = new Paint(1);
        this.f60883b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final Shader m61221a() {
        Rect rect = this.f60885d;
        copyBounds(rect);
        float height = this.f60889h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C33827Jm0.m99850k(this.f60890i, this.f60894m), C33827Jm0.m99850k(this.f60891j, this.f60894m), C33827Jm0.m99850k(C33827Jm0.m99845p(this.f60891j, 0), this.f60894m), C33827Jm0.m99850k(C33827Jm0.m99845p(this.f60893l, 0), this.f60894m), C33827Jm0.m99850k(this.f60893l, this.f60894m), C33827Jm0.m99850k(this.f60892k, this.f60894m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    public RectF m61220b() {
        this.f60887f.set(getBounds());
        return this.f60887f;
    }

    /* renamed from: c */
    public void m61219c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f60894m = colorStateList.getColorForState(getState(), this.f60894m);
        }
        this.f60897p = colorStateList;
        this.f60895n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m61218d(float f) {
        if (this.f60889h != f) {
            this.f60889h = f;
            this.f60883b.setStrokeWidth(f * 1.3333f);
            this.f60895n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f60895n) {
            this.f60883b.setShader(m61221a());
            this.f60895n = false;
        }
        float strokeWidth = this.f60883b.getStrokeWidth() / 2.0f;
        copyBounds(this.f60885d);
        this.f60886e.set(this.f60885d);
        float min = Math.min(this.f60896o.m31527r().mo29259a(m61220b()), this.f60886e.width() / 2.0f);
        if (this.f60896o.m31524u(m61220b())) {
            this.f60886e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f60886e, min, min, this.f60883b);
        }
    }

    /* renamed from: e */
    public void m61217e(int i, int i2, int i3, int i4) {
        this.f60890i = i;
        this.f60891j = i2;
        this.f60892k = i3;
        this.f60893l = i4;
    }

    /* renamed from: f */
    public void m61216f(C43037iy5 c43037iy5) {
        this.f60896o = c43037iy5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f60888g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f60889h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f60896o.m31524u(m61220b())) {
            outline.setRoundRect(getBounds(), this.f60896o.m31527r().mo29259a(m61220b()));
            return;
        }
        copyBounds(this.f60885d);
        this.f60886e.set(this.f60885d);
        this.f60882a.m29573e(this.f60896o, 1.0f, this.f60886e, this.f60884c);
        C40750f71.m42011h(outline, this.f60884c);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f60896o.m31524u(m61220b())) {
            int round = Math.round(this.f60889h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f60897p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f60895n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f60897p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f60894m)) != this.f60894m) {
            this.f60895n = true;
            this.f60894m = colorForState;
        }
        if (this.f60895n) {
            invalidateSelf();
        }
        return this.f60895n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f60883b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f60883b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
