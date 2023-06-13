package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.InterfaceC17744c;
/* renamed from: com.google.android.material.circularreveal.b */
/* loaded from: classes6.dex */
public class C17742b {

    /* renamed from: j */
    public static final int f72615j = 2;

    /* renamed from: a */
    public final InterfaceC17743a f72616a;

    /* renamed from: b */
    public final View f72617b;

    /* renamed from: c */
    public final Path f72618c;

    /* renamed from: d */
    public final Paint f72619d;

    /* renamed from: e */
    public final Paint f72620e;

    /* renamed from: f */
    public InterfaceC17744c.C17749e f72621f;

    /* renamed from: g */
    public Drawable f72622g;

    /* renamed from: h */
    public boolean f72623h;

    /* renamed from: i */
    public boolean f72624i;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17743a {
        /* renamed from: b */
        void mo49778b(Canvas canvas);

        /* renamed from: c */
        boolean mo49777c();
    }

    public C17742b(InterfaceC17743a interfaceC17743a) {
        this.f72616a = interfaceC17743a;
        View view = (View) interfaceC17743a;
        this.f72617b = view;
        view.setWillNotDraw(false);
        this.f72618c = new Path();
        this.f72619d = new Paint(7);
        Paint paint = new Paint(1);
        this.f72620e = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    public void m49802a() {
        if (f72615j == 0) {
            this.f72623h = true;
            this.f72624i = false;
            this.f72617b.buildDrawingCache();
            Bitmap drawingCache = this.f72617b.getDrawingCache();
            if (drawingCache == null && this.f72617b.getWidth() != 0 && this.f72617b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f72617b.getWidth(), this.f72617b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f72617b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f72619d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f72623h = false;
            this.f72624i = true;
        }
    }

    /* renamed from: b */
    public void m49801b() {
        if (f72615j == 0) {
            this.f72624i = false;
            this.f72617b.destroyDrawingCache();
            this.f72619d.setShader(null);
            this.f72617b.invalidate();
        }
    }

    /* renamed from: c */
    public void m49800c(Canvas canvas) {
        if (m49790m()) {
            int i = f72615j;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f72616a.mo49778b(canvas);
                        if (m49788o()) {
                            canvas.drawRect(0.0f, 0.0f, this.f72617b.getWidth(), this.f72617b.getHeight(), this.f72620e);
                        }
                    } else {
                        throw new IllegalStateException("Unsupported strategy " + i);
                    }
                } else {
                    int save = canvas.save();
                    canvas.clipPath(this.f72618c);
                    this.f72616a.mo49778b(canvas);
                    if (m49788o()) {
                        canvas.drawRect(0.0f, 0.0f, this.f72617b.getWidth(), this.f72617b.getHeight(), this.f72620e);
                    }
                    canvas.restoreToCount(save);
                }
            } else {
                InterfaceC17744c.C17749e c17749e = this.f72621f;
                canvas.drawCircle(c17749e.f72629a, c17749e.f72630b, c17749e.f72631c, this.f72619d);
                if (m49788o()) {
                    InterfaceC17744c.C17749e c17749e2 = this.f72621f;
                    canvas.drawCircle(c17749e2.f72629a, c17749e2.f72630b, c17749e2.f72631c, this.f72620e);
                }
            }
        } else {
            this.f72616a.mo49778b(canvas);
            if (m49788o()) {
                canvas.drawRect(0.0f, 0.0f, this.f72617b.getWidth(), this.f72617b.getHeight(), this.f72620e);
            }
        }
        m49799d(canvas);
    }

    /* renamed from: d */
    public final void m49799d(Canvas canvas) {
        if (m49789n()) {
            Rect bounds = this.f72622g.getBounds();
            float width = this.f72621f.f72629a - (bounds.width() / 2.0f);
            float height = this.f72621f.f72630b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f72622g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: e */
    public int m49798e() {
        return this.f72620e.getColor();
    }

    /* renamed from: f */
    public final float m49797f(InterfaceC17744c.C17749e c17749e) {
        return C39102cN2.m61515b(c17749e.f72629a, c17749e.f72630b, 0.0f, 0.0f, this.f72617b.getWidth(), this.f72617b.getHeight());
    }

    /* renamed from: g */
    public InterfaceC17744c.C17749e m49796g() {
        InterfaceC17744c.C17749e c17749e = this.f72621f;
        if (c17749e == null) {
            return null;
        }
        InterfaceC17744c.C17749e c17749e2 = new InterfaceC17744c.C17749e(c17749e);
        if (c17749e2.m49782a()) {
            c17749e2.f72631c = m49797f(c17749e2);
        }
        return c17749e2;
    }

    /* renamed from: h */
    public final void m49795h() {
        if (f72615j == 1) {
            this.f72618c.rewind();
            InterfaceC17744c.C17749e c17749e = this.f72621f;
            if (c17749e != null) {
                this.f72618c.addCircle(c17749e.f72629a, c17749e.f72630b, c17749e.f72631c, Path.Direction.CW);
            }
        }
        this.f72617b.invalidate();
    }

    /* renamed from: i */
    public boolean m49794i() {
        return this.f72616a.mo49777c() && !m49790m();
    }

    /* renamed from: j */
    public void m49793j(Drawable drawable) {
        this.f72622g = drawable;
        this.f72617b.invalidate();
    }

    /* renamed from: k */
    public void m49792k(int i) {
        this.f72620e.setColor(i);
        this.f72617b.invalidate();
    }

    /* renamed from: l */
    public void m49791l(InterfaceC17744c.C17749e c17749e) {
        if (c17749e == null) {
            this.f72621f = null;
        } else {
            InterfaceC17744c.C17749e c17749e2 = this.f72621f;
            if (c17749e2 == null) {
                this.f72621f = new InterfaceC17744c.C17749e(c17749e);
            } else {
                c17749e2.m49780c(c17749e);
            }
            if (C39102cN2.m61514c(c17749e.f72631c, m49797f(c17749e), 1.0E-4f)) {
                this.f72621f.f72631c = Float.MAX_VALUE;
            }
        }
        m49795h();
    }

    /* renamed from: m */
    public final boolean m49790m() {
        boolean z;
        InterfaceC17744c.C17749e c17749e = this.f72621f;
        if (c17749e != null && !c17749e.m49782a()) {
            z = false;
        } else {
            z = true;
        }
        if (f72615j == 0) {
            if (z || !this.f72624i) {
                return false;
            }
            return true;
        }
        return !z;
    }

    /* renamed from: n */
    public final boolean m49789n() {
        return (this.f72623h || this.f72622g == null || this.f72621f == null) ? false : true;
    }

    /* renamed from: o */
    public final boolean m49788o() {
        return (this.f72623h || Color.alpha(this.f72620e.getColor()) == 0) ? false : true;
    }
}
