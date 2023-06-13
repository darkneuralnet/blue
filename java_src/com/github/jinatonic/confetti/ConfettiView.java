package com.github.jinatonic.confetti;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
/* loaded from: classes5.dex */
public class ConfettiView extends View implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public List<AbstractC32963Fu0> f69975b;

    /* renamed from: c */
    public boolean f69976c;

    /* renamed from: d */
    public boolean f69977d;

    /* renamed from: e */
    public AbstractC32963Fu0 f69978e;

    public ConfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public static ConfettiView m52059b(Context context) {
        ConfettiView confettiView = new ConfettiView(context, null);
        confettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        confettiView.setElevation(context.getResources().getDimensionPixelOffset(C34938Of4.confetti_default_elevation));
        return confettiView;
    }

    /* renamed from: a */
    public void m52060a(List<AbstractC32963Fu0> list) {
        this.f69975b = list;
    }

    /* renamed from: c */
    public void m52058c() {
        this.f69976c = false;
    }

    /* renamed from: d */
    public void m52057d() {
        if (!this.f69976c) {
            this.f69976c = true;
            getParent().requestLayout();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        viewGroup.removeOnLayoutChangeListener(this);
        viewGroup.addOnLayoutChangeListener(this);
        if (this.f69975b == null) {
            m52057d();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f69976c) {
            canvas.save();
            for (AbstractC32963Fu0 abstractC32963Fu0 : this.f69975b) {
                abstractC32963Fu0.m106272g(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewParent parent;
        if (this.f69976c && (parent = getParent()) != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeViewInLayout(this);
            viewGroup.removeOnLayoutChangeListener(this);
            viewGroup.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 != 3) goto L33;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f69977d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        AbstractC32963Fu0 abstractC32963Fu0 = this.f69978e;
                        if (abstractC32963Fu0 != null) {
                            abstractC32963Fu0.m106269m(motionEvent);
                            z = true;
                            break;
                        }
                    }
                }
                AbstractC32963Fu0 abstractC32963Fu02 = this.f69978e;
                if (abstractC32963Fu02 != null) {
                    abstractC32963Fu02.m106268n(motionEvent);
                    this.f69978e = null;
                    z = true;
                    break;
                }
            } else {
                for (AbstractC32963Fu0 abstractC32963Fu03 : this.f69975b) {
                    if (abstractC32963Fu03.m106270l(motionEvent)) {
                        this.f69978e = abstractC32963Fu03;
                        z = true;
                        break;
                    }
                }
            }
            if (z && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        z = false;
        return z ? true : true;
    }

    public void setTouchEnabled(boolean z) {
        this.f69977d = z;
    }
}
