package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* renamed from: j71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43122j71 extends Drawable {

    /* renamed from: m */
    public static final float f92168m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f92169a;

    /* renamed from: b */
    public float f92170b;

    /* renamed from: c */
    public float f92171c;

    /* renamed from: d */
    public float f92172d;

    /* renamed from: e */
    public float f92173e;

    /* renamed from: f */
    public boolean f92174f;

    /* renamed from: g */
    public final Path f92175g;

    /* renamed from: h */
    public final int f92176h;

    /* renamed from: i */
    public boolean f92177i;

    /* renamed from: j */
    public float f92178j;

    /* renamed from: k */
    public float f92179k;

    /* renamed from: l */
    public int f92180l;

    public C43122j71(Context context) {
        Paint paint = new Paint();
        this.f92169a = paint;
        this.f92175g = new Path();
        this.f92177i = false;
        this.f92180l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C43509jm4.DrawerArrowToggle, C50553vf4.drawerArrowStyle, C33588Il4.Base_Widget_AppCompat_DrawerArrowToggle);
        m31080c(obtainStyledAttributes.getColor(C43509jm4.DrawerArrowToggle_color, 0));
        m31081b(obtainStyledAttributes.getDimension(C43509jm4.DrawerArrowToggle_thickness, 0.0f));
        m31077f(obtainStyledAttributes.getBoolean(C43509jm4.DrawerArrowToggle_spinBars, true));
        m31079d(Math.round(obtainStyledAttributes.getDimension(C43509jm4.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f92176h = obtainStyledAttributes.getDimensionPixelSize(C43509jm4.DrawerArrowToggle_drawableSize, 0);
        this.f92171c = Math.round(obtainStyledAttributes.getDimension(C43509jm4.DrawerArrowToggle_barLength, 0.0f));
        this.f92170b = Math.round(obtainStyledAttributes.getDimension(C43509jm4.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f92172d = obtainStyledAttributes.getDimension(C43509jm4.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static float m31082a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: b */
    public void m31081b(float f) {
        if (this.f92169a.getStrokeWidth() != f) {
            this.f92169a.setStrokeWidth(f);
            this.f92179k = (float) ((f / 2.0f) * Math.cos(f92168m));
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void m31080c(int i) {
        if (i != this.f92169a.getColor()) {
            this.f92169a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void m31079d(float f) {
        if (f != this.f92173e) {
            this.f92173e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        Rect bounds = getBounds();
        int i2 = this.f92180l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? P61.m90846f(this) == 0 : P61.m90846f(this) == 1))) {
            z = true;
        }
        float f4 = this.f92170b;
        float m31082a = m31082a(this.f92171c, (float) Math.sqrt(f4 * f4 * 2.0f), this.f92178j);
        float m31082a2 = m31082a(this.f92171c, this.f92172d, this.f92178j);
        float round = Math.round(m31082a(0.0f, this.f92179k, this.f92178j));
        float m31082a3 = m31082a(0.0f, f92168m, this.f92178j);
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        float m31082a4 = m31082a(f, f2, this.f92178j);
        double d = m31082a;
        double d2 = m31082a3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f92175g.rewind();
        float m31082a5 = m31082a(this.f92173e + this.f92169a.getStrokeWidth(), -this.f92179k, this.f92178j);
        float f5 = (-m31082a2) / 2.0f;
        this.f92175g.moveTo(f5 + round, 0.0f);
        this.f92175g.rLineTo(m31082a2 - (round * 2.0f), 0.0f);
        this.f92175g.moveTo(f5, m31082a5);
        this.f92175g.rLineTo(round2, round3);
        this.f92175g.moveTo(f5, -m31082a5);
        this.f92175g.rLineTo(round2, -round3);
        this.f92175g.close();
        canvas.save();
        float strokeWidth = this.f92169a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f3))) / 4) * 2) + (strokeWidth * 1.5f) + this.f92173e);
        if (this.f92174f) {
            if (this.f92177i ^ z2) {
                i = -1;
            } else {
                i = 1;
            }
            canvas.rotate(m31082a4 * i);
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f92175g, this.f92169a);
        canvas.restore();
    }

    /* renamed from: e */
    public void m31078e(float f) {
        if (this.f92178j != f) {
            this.f92178j = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void m31077f(boolean z) {
        if (this.f92174f != z) {
            this.f92174f = z;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void m31076g(boolean z) {
        if (this.f92177i != z) {
            this.f92177i = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f92176h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f92176h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f92169a.getAlpha()) {
            this.f92169a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f92169a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
