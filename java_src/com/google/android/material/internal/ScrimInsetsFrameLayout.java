package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes6.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: b */
    public Drawable f73005b;

    /* renamed from: c */
    public Rect f73006c;

    /* renamed from: d */
    public Rect f73007d;

    /* renamed from: e */
    public boolean f73008e;

    /* renamed from: f */
    public boolean f73009f;

    /* renamed from: g */
    public boolean f73010g;

    /* renamed from: h */
    public boolean f73011h;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    /* loaded from: classes6.dex */
    public class C17835a implements InterfaceC36332Ue3 {
        public C17835a() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            boolean z;
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f73006c == null) {
                scrimInsetsFrameLayout.f73006c = new Rect();
            }
            ScrimInsetsFrameLayout.this.f73006c.set(db6.m110779k(), db6.m110777m(), db6.m110778l(), db6.m110780j());
            ScrimInsetsFrameLayout.this.mo45938a(db6);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            if (db6.m110776n() && ScrimInsetsFrameLayout.this.f73005b != null) {
                z = false;
            } else {
                z = true;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            C38790bq6.m62470m0(ScrimInsetsFrameLayout.this);
            return db6.m110787c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo45938a(DB6 db6) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f73006c != null && this.f73005b != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.f73008e) {
                this.f73007d.set(0, 0, width, this.f73006c.top);
                this.f73005b.setBounds(this.f73007d);
                this.f73005b.draw(canvas);
            }
            if (this.f73009f) {
                this.f73007d.set(0, height - this.f73006c.bottom, width, height);
                this.f73005b.setBounds(this.f73007d);
                this.f73005b.draw(canvas);
            }
            if (this.f73010g) {
                Rect rect = this.f73007d;
                Rect rect2 = this.f73006c;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f73005b.setBounds(this.f73007d);
                this.f73005b.draw(canvas);
            }
            if (this.f73011h) {
                Rect rect3 = this.f73007d;
                Rect rect4 = this.f73006c;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f73005b.setBounds(this.f73007d);
                this.f73005b.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f73005b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f73005b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f73009f = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f73010g = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.f73011h = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f73008e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f73005b = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f73007d = new Rect();
        this.f73008e = true;
        this.f73009f = true;
        this.f73010g = true;
        this.f73011h = true;
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.ScrimInsetsFrameLayout, i, C50021ul4.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f73005b = m21866i.getDrawable(C37098Xl4.ScrimInsetsFrameLayout_insetForeground);
        m21866i.recycle();
        setWillNotDraw(true);
        C38790bq6.m62531L0(this, new C17835a());
    }
}
