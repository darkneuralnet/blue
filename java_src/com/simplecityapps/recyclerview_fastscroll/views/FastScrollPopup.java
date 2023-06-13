package com.simplecityapps.recyclerview_fastscroll.views;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.annotation.Keep;
/* loaded from: classes6.dex */
public class FastScrollPopup {

    /* renamed from: a */
    public FastScrollRecyclerView f75058a;

    /* renamed from: b */
    public Resources f75059b;

    /* renamed from: c */
    public int f75060c;

    /* renamed from: d */
    public int f75061d;

    /* renamed from: l */
    public String f75069l;

    /* renamed from: m */
    public Paint f75070m;

    /* renamed from: p */
    public ObjectAnimator f75073p;

    /* renamed from: q */
    public boolean f75074q;

    /* renamed from: r */
    public int f75075r;

    /* renamed from: e */
    public Path f75062e = new Path();

    /* renamed from: f */
    public RectF f75063f = new RectF();

    /* renamed from: h */
    public int f75065h = -16777216;

    /* renamed from: i */
    public Rect f75066i = new Rect();

    /* renamed from: j */
    public Rect f75067j = new Rect();

    /* renamed from: k */
    public Rect f75068k = new Rect();

    /* renamed from: n */
    public Rect f75071n = new Rect();

    /* renamed from: o */
    public float f75072o = 1.0f;

    /* renamed from: g */
    public Paint f75064g = new Paint(1);

    public FastScrollPopup(Resources resources, FastScrollRecyclerView fastScrollRecyclerView) {
        this.f75059b = resources;
        this.f75058a = fastScrollRecyclerView;
        Paint paint = new Paint(1);
        this.f75070m = paint;
        paint.setAlpha(0);
        m45812j(C35669Ri6.m86424c(this.f75059b, 44.0f));
        m45817e(C35669Ri6.m86425b(this.f75059b, 88.0f));
    }

    /* renamed from: a */
    public void m45821a(boolean z) {
        float f;
        long j;
        if (this.f75074q != z) {
            this.f75074q = z;
            ObjectAnimator objectAnimator = this.f75073p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float[] fArr = new float[1];
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[0] = f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
            this.f75073p = ofFloat;
            if (z) {
                j = 200;
            } else {
                j = 150;
            }
            ofFloat.setDuration(j);
            this.f75073p.start();
        }
    }

    /* renamed from: b */
    public final float[] m45820b() {
        if (this.f75075r == 1) {
            int i = this.f75061d;
            return new float[]{i, i, i, i, i, i, i, i};
        } else if (C35669Ri6.m86426a(this.f75059b)) {
            int i2 = this.f75061d;
            return new float[]{i2, i2, i2, i2, i2, i2, 0.0f, 0.0f};
        } else {
            int i3 = this.f75061d;
            return new float[]{i3, i3, i3, i3, 0.0f, 0.0f, i3, i3};
        }
    }

    /* renamed from: c */
    public void m45819c(Canvas canvas) {
        if (m45818d()) {
            int save = canvas.save(1);
            Rect rect = this.f75068k;
            canvas.translate(rect.left, rect.top);
            this.f75067j.set(this.f75068k);
            this.f75067j.offsetTo(0, 0);
            this.f75062e.reset();
            this.f75063f.set(this.f75067j);
            this.f75062e.addRoundRect(this.f75063f, m45820b(), Path.Direction.CW);
            this.f75064g.setAlpha((int) (Color.alpha(this.f75065h) * this.f75072o));
            this.f75070m.setAlpha((int) (this.f75072o * 255.0f));
            canvas.drawPath(this.f75062e, this.f75064g);
            canvas.drawText(this.f75069l, (this.f75068k.width() - this.f75071n.width()) / 2, this.f75068k.height() - ((this.f75068k.height() - this.f75071n.height()) / 2), this.f75070m);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: d */
    public boolean m45818d() {
        return this.f75072o > 0.0f && !TextUtils.isEmpty(this.f75069l);
    }

    /* renamed from: e */
    public void m45817e(int i) {
        this.f75060c = i;
        this.f75061d = i / 2;
        this.f75058a.invalidate(this.f75068k);
    }

    /* renamed from: f */
    public void m45816f(int i) {
        this.f75065h = i;
        this.f75064g.setColor(i);
        this.f75058a.invalidate(this.f75068k);
    }

    /* renamed from: g */
    public void m45815g(int i) {
        this.f75075r = i;
    }

    @Keep
    public float getAlpha() {
        return this.f75072o;
    }

    /* renamed from: h */
    public void m45814h(String str) {
        if (!str.equals(this.f75069l)) {
            this.f75069l = str;
            this.f75070m.getTextBounds(str, 0, str.length(), this.f75071n);
            Rect rect = this.f75071n;
            rect.right = (int) (rect.left + this.f75070m.measureText(str));
        }
    }

    /* renamed from: i */
    public void m45813i(int i) {
        this.f75070m.setColor(i);
        this.f75058a.invalidate(this.f75068k);
    }

    /* renamed from: j */
    public void m45812j(int i) {
        this.f75070m.setTextSize(i);
        this.f75058a.invalidate(this.f75068k);
    }

    /* renamed from: k */
    public void m45811k(Typeface typeface) {
        this.f75070m.setTypeface(typeface);
        this.f75058a.invalidate(this.f75068k);
    }

    /* renamed from: l */
    public Rect m45810l(FastScrollRecyclerView fastScrollRecyclerView, int i) {
        this.f75066i.set(this.f75068k);
        if (m45818d()) {
            int m45798m = fastScrollRecyclerView.m45798m();
            int i2 = this.f75060c;
            int max = Math.max(i2, this.f75071n.width() + (Math.round((this.f75060c - this.f75071n.height()) / 10) * 5 * 2));
            if (this.f75075r == 1) {
                this.f75068k.left = (fastScrollRecyclerView.getWidth() - max) / 2;
                Rect rect = this.f75068k;
                rect.right = rect.left + max;
                rect.top = (fastScrollRecyclerView.getHeight() - i2) / 2;
            } else {
                if (C35669Ri6.m86426a(this.f75059b)) {
                    this.f75068k.left = fastScrollRecyclerView.m45798m() * 2;
                    Rect rect2 = this.f75068k;
                    rect2.right = rect2.left + max;
                } else {
                    this.f75068k.right = fastScrollRecyclerView.getWidth() - (fastScrollRecyclerView.m45798m() * 2);
                    Rect rect3 = this.f75068k;
                    rect3.left = rect3.right - max;
                }
                this.f75068k.top = (i - i2) + (fastScrollRecyclerView.m45799l() / 2);
                Rect rect4 = this.f75068k;
                rect4.top = Math.max(m45798m, Math.min(rect4.top, (fastScrollRecyclerView.getHeight() - m45798m) - i2));
            }
            Rect rect5 = this.f75068k;
            rect5.bottom = rect5.top + i2;
        } else {
            this.f75068k.setEmpty();
        }
        this.f75066i.union(this.f75068k);
        return this.f75066i;
    }

    @Keep
    public void setAlpha(float f) {
        this.f75072o = f;
        this.f75058a.invalidate(this.f75068k);
    }
}
