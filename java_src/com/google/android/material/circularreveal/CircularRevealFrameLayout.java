package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.InterfaceC17744c;
/* loaded from: classes6.dex */
public class CircularRevealFrameLayout extends FrameLayout implements InterfaceC17744c {

    /* renamed from: b */
    public final C17742b f72610b;

    public CircularRevealFrameLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC17744c
    /* renamed from: a */
    public void mo49779a() {
        this.f72610b.m49801b();
    }

    @Override // com.google.android.material.circularreveal.C17742b.InterfaceC17743a
    /* renamed from: b */
    public void mo49778b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.C17742b.InterfaceC17743a
    /* renamed from: c */
    public boolean mo49777c() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC17744c
    /* renamed from: d */
    public InterfaceC17744c.C17749e mo49776d() {
        return this.f72610b.m49796g();
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C17742b c17742b = this.f72610b;
        if (c17742b != null) {
            c17742b.m49800c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.InterfaceC17744c
    /* renamed from: e */
    public void mo49775e() {
        this.f72610b.m49802a();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC17744c
    /* renamed from: f */
    public int mo49774f() {
        return this.f72610b.m49798e();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C17742b c17742b = this.f72610b;
        if (c17742b != null) {
            return c17742b.m49794i();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC17744c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f72610b.m49793j(drawable);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC17744c
    public void setCircularRevealScrimColor(int i) {
        this.f72610b.m49792k(i);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC17744c
    public void setRevealInfo(InterfaceC17744c.C17749e c17749e) {
        this.f72610b.m49791l(c17749e);
    }

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72610b = new C17742b(this);
    }
}