package co.bird.android.widget.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import co.bird.android.widget.cropper.CropImageView;
import java.util.Arrays;
/* loaded from: classes4.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public CropImageView.EnumC16643d f67921A;

    /* renamed from: B */
    public CropImageView.EnumC16642c f67922B;

    /* renamed from: C */
    public boolean f67923C;

    /* renamed from: b */
    public final C16658d f67924b;

    /* renamed from: c */
    public final RectF f67925c;

    /* renamed from: d */
    public final float[] f67926d;

    /* renamed from: e */
    public final RectF f67927e;

    /* renamed from: f */
    public final Rect f67928f;

    /* renamed from: g */
    public ScaleGestureDetector f67929g;

    /* renamed from: h */
    public boolean f67930h;

    /* renamed from: i */
    public InterfaceC16649a f67931i;

    /* renamed from: j */
    public Paint f67932j;

    /* renamed from: k */
    public Paint f67933k;

    /* renamed from: l */
    public Paint f67934l;

    /* renamed from: m */
    public Paint f67935m;

    /* renamed from: n */
    public final Path f67936n;

    /* renamed from: o */
    public int f67937o;

    /* renamed from: p */
    public int f67938p;

    /* renamed from: q */
    public float f67939q;

    /* renamed from: r */
    public float f67940r;

    /* renamed from: s */
    public float f67941s;

    /* renamed from: t */
    public float f67942t;

    /* renamed from: u */
    public float f67943u;

    /* renamed from: v */
    public C16659e f67944v;

    /* renamed from: w */
    public boolean f67945w;

    /* renamed from: x */
    public int f67946x;

    /* renamed from: y */
    public int f67947y;

    /* renamed from: z */
    public float f67948z;

    /* renamed from: co.bird.android.widget.cropper.CropOverlayView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16649a {
        /* renamed from: a */
        void mo54127a(boolean z);
    }

    /* renamed from: co.bird.android.widget.cropper.CropOverlayView$b */
    /* loaded from: classes4.dex */
    public class C16650b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        @TargetApi(11)
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF m54084h = CropOverlayView.this.f67924b.m54084h();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 < f3 && f <= f4 && f2 >= 0.0f && f3 <= CropOverlayView.this.f67924b.m54089c() && f >= 0.0f && f4 <= CropOverlayView.this.f67924b.m54090b()) {
                m54084h.set(f2, f, f3, f4);
                CropOverlayView.this.f67924b.m54072t(m54084h);
                CropOverlayView.this.invalidate();
                return true;
            }
            return true;
        }

        public C16650b() {
        }
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    /* renamed from: o */
    public static Paint m54137o(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    /* renamed from: p */
    public static Paint m54136p(float f, int i) {
        if (f > 0.0f) {
            Paint paint = new Paint();
            paint.setColor(i);
            paint.setStrokeWidth(f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m54150b(RectF rectF) {
        float f;
        float f2;
        float f3;
        float m54097u = C16655c.m54097u(this.f67926d);
        float m54095w = C16655c.m54095w(this.f67926d);
        float m54096v = C16655c.m54096v(this.f67926d);
        float m54102p = C16655c.m54102p(this.f67926d);
        if (!m54133s()) {
            this.f67927e.set(m54097u, m54095w, m54096v, m54102p);
            return false;
        }
        float[] fArr = this.f67926d;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        if (f9 < f5) {
            float f10 = fArr[3];
            if (f5 < f10) {
                float f11 = fArr[2];
                f5 = f7;
                f2 = f8;
                f7 = f10;
                f = f9;
                f6 = f11;
                f4 = f6;
            } else {
                f4 = fArr[2];
                f2 = f6;
                f6 = f4;
                f7 = f5;
                f5 = f10;
                f = f7;
            }
        } else {
            f = fArr[3];
            if (f5 > f) {
                f2 = fArr[2];
                f6 = f8;
                f7 = f9;
            } else {
                f2 = f4;
                f = f5;
                f4 = f8;
                f5 = f9;
            }
        }
        float f12 = (f5 - f) / (f4 - f2);
        float f13 = (-1.0f) / f12;
        float f14 = f - (f12 * f2);
        float f15 = f - (f2 * f13);
        float f16 = f7 - (f12 * f6);
        float f17 = f7 - (f6 * f13);
        float centerY = rectF.centerY() - rectF.top;
        float centerX = rectF.centerX();
        float f18 = rectF.left;
        float f19 = centerY / (centerX - f18);
        float f20 = -f19;
        float f21 = rectF.top;
        float f22 = f21 - (f18 * f19);
        float f23 = rectF.right;
        float f24 = f21 - (f20 * f23);
        float f25 = f12 - f19;
        float f26 = (f22 - f14) / f25;
        if (f26 < f23) {
            f3 = f26;
        } else {
            f3 = m54097u;
        }
        float max = Math.max(m54097u, f3);
        float f27 = (f22 - f15) / (f13 - f19);
        if (f27 >= rectF.right) {
            f27 = max;
        }
        float max2 = Math.max(max, f27);
        float f28 = f13 - f20;
        float f29 = (f24 - f17) / f28;
        if (f29 >= rectF.right) {
            f29 = max2;
        }
        float max3 = Math.max(max2, f29);
        float f30 = (f24 - f15) / f28;
        if (f30 <= rectF.left) {
            f30 = m54096v;
        }
        float min = Math.min(m54096v, f30);
        float f31 = (f24 - f16) / (f12 - f20);
        if (f31 <= rectF.left) {
            f31 = min;
        }
        float min2 = Math.min(min, f31);
        float f32 = (f22 - f16) / f25;
        if (f32 <= rectF.left) {
            f32 = min2;
        }
        float min3 = Math.min(min2, f32);
        float max4 = Math.max(m54095w, Math.max((f12 * max3) + f14, (f13 * min3) + f15));
        float min4 = Math.min(m54102p, Math.min((f13 * max3) + f17, (f12 * min3) + f16));
        RectF rectF2 = this.f67927e;
        rectF2.left = max3;
        rectF2.top = max4;
        rectF2.right = min3;
        rectF2.bottom = min4;
        return true;
    }

    /* renamed from: c */
    public final void m54149c(boolean z) {
        try {
            InterfaceC16649a interfaceC16649a = this.f67931i;
            if (interfaceC16649a != null) {
                interfaceC16649a.mo54127a(z);
            }
        } catch (Exception e) {
            Log.e("AIC", "Exception in crop window changed", e);
        }
    }

    /* renamed from: d */
    public final void m54148d(Canvas canvas) {
        RectF m54084h = this.f67924b.m54084h();
        float max = Math.max(C16655c.m54097u(this.f67926d), 0.0f);
        float max2 = Math.max(C16655c.m54095w(this.f67926d), 0.0f);
        float min = Math.min(C16655c.m54096v(this.f67926d), getWidth());
        float min2 = Math.min(C16655c.m54102p(this.f67926d), getHeight());
        if (this.f67922B == CropImageView.EnumC16642c.RECTANGLE) {
            if (m54133s()) {
                this.f67936n.reset();
                Path path = this.f67936n;
                float[] fArr = this.f67926d;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f67936n;
                float[] fArr2 = this.f67926d;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f67936n;
                float[] fArr3 = this.f67926d;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f67936n;
                float[] fArr4 = this.f67926d;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f67936n.close();
                canvas.save();
                canvas.clipPath(this.f67936n, Region.Op.INTERSECT);
                canvas.clipRect(m54084h, Region.Op.DIFFERENCE);
                canvas.drawRect(max, max2, min, min2, this.f67935m);
                canvas.restore();
                return;
            }
            canvas.drawRect(max, max2, min, m54084h.top, this.f67935m);
            canvas.drawRect(max, m54084h.bottom, min, min2, this.f67935m);
            canvas.drawRect(max, m54084h.top, m54084h.left, m54084h.bottom, this.f67935m);
            canvas.drawRect(m54084h.right, m54084h.top, min, m54084h.bottom, this.f67935m);
            return;
        }
        this.f67936n.reset();
        this.f67925c.set(m54084h.left, m54084h.top, m54084h.right, m54084h.bottom);
        this.f67936n.addOval(this.f67925c, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.f67936n, Region.Op.DIFFERENCE);
        canvas.drawRect(max, max2, min, min2, this.f67935m);
        canvas.restore();
    }

    /* renamed from: e */
    public final void m54147e(Canvas canvas) {
        Paint paint = this.f67932j;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF m54084h = this.f67924b.m54084h();
            float f = strokeWidth / 2.0f;
            m54084h.inset(f, f);
            if (this.f67922B == CropImageView.EnumC16642c.RECTANGLE) {
                canvas.drawRect(m54084h, this.f67932j);
            } else {
                canvas.drawOval(m54084h, this.f67932j);
            }
        }
    }

    /* renamed from: f */
    public final void m54146f(Canvas canvas) {
        float f;
        if (this.f67933k != null) {
            Paint paint = this.f67932j;
            float f2 = 0.0f;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = 0.0f;
            }
            float strokeWidth = this.f67933k.getStrokeWidth();
            float f3 = strokeWidth / 2.0f;
            if (this.f67922B == CropImageView.EnumC16642c.RECTANGLE) {
                f2 = this.f67939q;
            }
            float f4 = f2 + f3;
            RectF m54084h = this.f67924b.m54084h();
            m54084h.inset(f4, f4);
            float f5 = (strokeWidth - f) / 2.0f;
            float f6 = f3 + f5;
            float f7 = m54084h.left;
            float f8 = m54084h.top;
            canvas.drawLine(f7 - f5, f8 - f6, f7 - f5, f8 + this.f67940r, this.f67933k);
            float f9 = m54084h.left;
            float f10 = m54084h.top;
            canvas.drawLine(f9 - f6, f10 - f5, f9 + this.f67940r, f10 - f5, this.f67933k);
            float f11 = m54084h.right;
            float f12 = m54084h.top;
            canvas.drawLine(f11 + f5, f12 - f6, f11 + f5, f12 + this.f67940r, this.f67933k);
            float f13 = m54084h.right;
            float f14 = m54084h.top;
            canvas.drawLine(f13 + f6, f14 - f5, f13 - this.f67940r, f14 - f5, this.f67933k);
            float f15 = m54084h.left;
            float f16 = m54084h.bottom;
            canvas.drawLine(f15 - f5, f16 + f6, f15 - f5, f16 - this.f67940r, this.f67933k);
            float f17 = m54084h.left;
            float f18 = m54084h.bottom;
            canvas.drawLine(f17 - f6, f18 + f5, f17 + this.f67940r, f18 + f5, this.f67933k);
            float f19 = m54084h.right;
            float f20 = m54084h.bottom;
            canvas.drawLine(f19 + f5, f20 + f6, f19 + f5, f20 - this.f67940r, this.f67933k);
            float f21 = m54084h.right;
            float f22 = m54084h.bottom;
            canvas.drawLine(f21 + f6, f22 + f5, f21 - this.f67940r, f22 + f5, this.f67933k);
        }
    }

    /* renamed from: g */
    public final void m54145g(Canvas canvas) {
        float f;
        if (this.f67934l != null) {
            Paint paint = this.f67932j;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = 0.0f;
            }
            RectF m54084h = this.f67924b.m54084h();
            m54084h.inset(f, f);
            float width = m54084h.width() / 3.0f;
            float height = m54084h.height() / 3.0f;
            if (this.f67922B == CropImageView.EnumC16642c.OVAL) {
                float width2 = (m54084h.width() / 2.0f) - f;
                float height2 = (m54084h.height() / 2.0f) - f;
                float f2 = m54084h.left + width;
                float f3 = m54084h.right - width;
                float sin = (float) (height2 * Math.sin(Math.acos((width2 - width) / width2)));
                canvas.drawLine(f2, (m54084h.top + height2) - sin, f2, (m54084h.bottom - height2) + sin, this.f67934l);
                canvas.drawLine(f3, (m54084h.top + height2) - sin, f3, (m54084h.bottom - height2) + sin, this.f67934l);
                float f4 = m54084h.top + height;
                float f5 = m54084h.bottom - height;
                float cos = (float) (width2 * Math.cos(Math.asin((height2 - height) / height2)));
                canvas.drawLine((m54084h.left + width2) - cos, f4, (m54084h.right - width2) + cos, f4, this.f67934l);
                canvas.drawLine((m54084h.left + width2) - cos, f5, (m54084h.right - width2) + cos, f5, this.f67934l);
                return;
            }
            float f6 = m54084h.left + width;
            float f7 = m54084h.right - width;
            canvas.drawLine(f6, m54084h.top, f6, m54084h.bottom, this.f67934l);
            canvas.drawLine(f7, m54084h.top, f7, m54084h.bottom, this.f67934l);
            float f8 = m54084h.top + height;
            float f9 = m54084h.bottom - height;
            canvas.drawLine(m54084h.left, f8, m54084h.right, f8, this.f67934l);
            canvas.drawLine(m54084h.left, f9, m54084h.right, f9, this.f67934l);
        }
    }

    /* renamed from: h */
    public final void m54144h(RectF rectF) {
        if (rectF.width() < this.f67924b.m54087e()) {
            float m54087e = (this.f67924b.m54087e() - rectF.width()) / 2.0f;
            rectF.left -= m54087e;
            rectF.right += m54087e;
        }
        if (rectF.height() < this.f67924b.m54088d()) {
            float m54088d = (this.f67924b.m54088d() - rectF.height()) / 2.0f;
            rectF.top -= m54088d;
            rectF.bottom += m54088d;
        }
        if (rectF.width() > this.f67924b.m54089c()) {
            float width = (rectF.width() - this.f67924b.m54089c()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f67924b.m54090b()) {
            float height = (rectF.height() - this.f67924b.m54090b()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m54150b(rectF);
        if (this.f67927e.width() > 0.0f && this.f67927e.height() > 0.0f) {
            float max = Math.max(this.f67927e.left, 0.0f);
            float max2 = Math.max(this.f67927e.top, 0.0f);
            float min = Math.min(this.f67927e.right, getWidth());
            float min2 = Math.min(this.f67927e.bottom, getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f67945w && Math.abs(rectF.width() - (rectF.height() * this.f67948z)) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f67948z) {
                float abs = Math.abs((rectF.height() * this.f67948z) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f67948z) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: i */
    public void m54143i() {
        RectF m54139m = m54139m();
        m54144h(m54139m);
        this.f67924b.m54072t(m54139m);
    }

    /* renamed from: j */
    public int m54142j() {
        return this.f67946x;
    }

    /* renamed from: k */
    public int m54141k() {
        return this.f67947y;
    }

    /* renamed from: l */
    public CropImageView.EnumC16642c m54140l() {
        return this.f67922B;
    }

    /* renamed from: m */
    public RectF m54139m() {
        return this.f67924b.m54084h();
    }

    /* renamed from: n */
    public Rect m54138n() {
        return this.f67928f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m54148d(canvas);
        if (this.f67924b.m54071u()) {
            CropImageView.EnumC16643d enumC16643d = this.f67921A;
            if (enumC16643d == CropImageView.EnumC16643d.ON) {
                m54145g(canvas);
            } else if (enumC16643d == CropImageView.EnumC16643d.ON_TOUCH && this.f67944v != null) {
                m54145g(canvas);
            }
        }
        m54147e(canvas);
        m54146f(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f67930h) {
            this.f67929g.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    m54131u(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            m54130v();
            return true;
        }
        m54132t(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    /* renamed from: q */
    public final void m54135q() {
        float max = Math.max(C16655c.m54097u(this.f67926d), 0.0f);
        float max2 = Math.max(C16655c.m54095w(this.f67926d), 0.0f);
        float min = Math.min(C16655c.m54096v(this.f67926d), getWidth());
        float min2 = Math.min(C16655c.m54102p(this.f67926d), getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f67923C = true;
            float f = this.f67941s;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.f67928f.width() > 0 && this.f67928f.height() > 0) {
                rectF.left = (this.f67928f.left / this.f67924b.m54081k()) + max;
                rectF.top = (this.f67928f.top / this.f67924b.m54082j()) + max2;
                rectF.right = rectF.left + (this.f67928f.width() / this.f67924b.m54081k());
                rectF.bottom = rectF.top + (this.f67928f.height() / this.f67924b.m54082j());
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (this.f67945w && min > max && min2 > max2) {
                if (f2 / f4 > this.f67948z) {
                    rectF.top = max2 + f5;
                    rectF.bottom = min2 - f5;
                    float width = getWidth() / 2.0f;
                    this.f67948z = this.f67946x / this.f67947y;
                    float max3 = Math.max(this.f67924b.m54087e(), rectF.height() * this.f67948z) / 2.0f;
                    rectF.left = width - max3;
                    rectF.right = width + max3;
                } else {
                    rectF.left = max + f3;
                    rectF.right = min - f3;
                    float height = getHeight() / 2.0f;
                    float max4 = Math.max(this.f67924b.m54088d(), rectF.width() / this.f67948z) / 2.0f;
                    rectF.top = height - max4;
                    rectF.bottom = height + max4;
                }
            } else {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            }
            m54144h(rectF);
            this.f67924b.m54072t(rectF);
        }
    }

    /* renamed from: r */
    public boolean m54134r() {
        return this.f67945w;
    }

    /* renamed from: s */
    public final boolean m54133s() {
        float[] fArr = this.f67926d;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    public void setAspectRatioX(int i) {
        if (i > 0) {
            if (this.f67946x != i) {
                this.f67946x = i;
                this.f67948z = i / this.f67947y;
                if (this.f67923C) {
                    m54135q();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setAspectRatioY(int i) {
        if (i > 0) {
            if (this.f67947y != i) {
                this.f67947y = i;
                this.f67948z = this.f67946x / i;
                if (this.f67923C) {
                    m54135q();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setBounds(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f67926d, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f67926d, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f67926d, 0, fArr.length);
            }
            this.f67937o = i;
            this.f67938p = i2;
            RectF m54084h = this.f67924b.m54084h();
            if (m54084h.width() == 0.0f || m54084h.height() == 0.0f) {
                m54135q();
            }
        }
    }

    public void setCropShape(CropImageView.EnumC16642c enumC16642c) {
        if (this.f67922B != enumC16642c) {
            this.f67922B = enumC16642c;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(InterfaceC16649a interfaceC16649a) {
        this.f67931i = interfaceC16649a;
    }

    public void setCropWindowLimits(float f, float f2, float f3, float f4) {
        this.f67924b.m54076p(f, f2, f3, f4);
    }

    public void setCropWindowRect(RectF rectF) {
        this.f67924b.m54072t(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f67945w != z) {
            this.f67945w = z;
            if (this.f67923C) {
                m54135q();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.EnumC16643d enumC16643d) {
        if (this.f67921A != enumC16643d) {
            this.f67921A = enumC16643d;
            if (this.f67923C) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f67924b.m54075q(cropImageOptions);
        setCropShape(cropImageOptions.f67833b);
        setSnapRadius(cropImageOptions.f67834c);
        setGuidelines(cropImageOptions.f67836e);
        setFixedAspectRatio(cropImageOptions.f67844m);
        setAspectRatioX(cropImageOptions.f67845n);
        setAspectRatioY(cropImageOptions.f67846o);
        m54128x(cropImageOptions.f67841j);
        this.f67942t = cropImageOptions.f67835d;
        this.f67941s = cropImageOptions.f67843l;
        this.f67932j = m54136p(cropImageOptions.f67847p, cropImageOptions.f67848q);
        this.f67939q = cropImageOptions.f67850s;
        this.f67940r = cropImageOptions.f67851t;
        this.f67933k = m54136p(cropImageOptions.f67849r, cropImageOptions.f67852u);
        this.f67934l = m54136p(cropImageOptions.f67853v, cropImageOptions.f67854w);
        this.f67935m = m54137o(cropImageOptions.f67855x);
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f67928f;
        if (rect == null) {
            rect = C16655c.f67984a;
        }
        rect2.set(rect);
        if (this.f67923C) {
            m54135q();
            invalidate();
            m54149c(false);
        }
    }

    public void setMaxCropResultSize(int i, int i2) {
        this.f67924b.m54074r(i, i2);
    }

    public void setMinCropResultSize(int i, int i2) {
        this.f67924b.m54073s(i, i2);
    }

    public void setSnapRadius(float f) {
        this.f67943u = f;
    }

    /* renamed from: t */
    public final void m54132t(float f, float f2) {
        C16659e m54086f = this.f67924b.m54086f(f, f2, this.f67942t, this.f67922B);
        this.f67944v = m54086f;
        if (m54086f != null) {
            invalidate();
        }
    }

    /* renamed from: u */
    public final void m54131u(float f, float f2) {
        if (this.f67944v != null) {
            float f3 = this.f67943u;
            RectF m54084h = this.f67924b.m54084h();
            if (m54150b(m54084h)) {
                f3 = 0.0f;
            }
            this.f67944v.m54058m(m54084h, f, f2, this.f67927e, this.f67937o, this.f67938p, f3, this.f67945w, this.f67948z);
            this.f67924b.m54072t(m54084h);
            m54149c(true);
            invalidate();
        }
    }

    /* renamed from: v */
    public final void m54130v() {
        if (this.f67944v != null) {
            this.f67944v = null;
            m54149c(false);
            invalidate();
        }
    }

    /* renamed from: w */
    public void m54129w() {
        if (this.f67923C) {
            setCropWindowRect(C16655c.f67985b);
            m54135q();
            invalidate();
        }
    }

    /* renamed from: x */
    public boolean m54128x(boolean z) {
        if (this.f67930h != z) {
            this.f67930h = z;
            if (z && this.f67929g == null) {
                this.f67929g = new ScaleGestureDetector(getContext(), new C16650b());
                return true;
            }
            return true;
        }
        return false;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67924b = new C16658d();
        this.f67925c = new RectF();
        this.f67926d = new float[8];
        this.f67927e = new RectF();
        this.f67928f = new Rect();
        this.f67936n = new Path();
        this.f67948z = this.f67946x / this.f67947y;
    }
}
