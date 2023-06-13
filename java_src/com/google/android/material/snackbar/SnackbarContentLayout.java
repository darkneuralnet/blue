package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes6.dex */
public class SnackbarContentLayout extends LinearLayout implements IA0 {

    /* renamed from: b */
    public TextView f73415b;

    /* renamed from: c */
    public Button f73416c;

    /* renamed from: d */
    public final TimeInterpolator f73417d;

    /* renamed from: e */
    public int f73418e;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    public static void m48841f(View view, int i, int i2) {
        if (C38790bq6.m62498b0(view)) {
            C38790bq6.m62529M0(view, C38790bq6.m62538I(view), i, C38790bq6.m62540H(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // p000.IA0
    /* renamed from: a */
    public void mo48846a(int i, int i2) {
        this.f73415b.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f73415b.animate().alpha(1.0f).setDuration(j).setInterpolator(this.f73417d).setStartDelay(j2).start();
        if (this.f73416c.getVisibility() == 0) {
            this.f73416c.setAlpha(0.0f);
            this.f73416c.animate().alpha(1.0f).setDuration(j).setInterpolator(this.f73417d).setStartDelay(j2).start();
        }
    }

    @Override // p000.IA0
    /* renamed from: b */
    public void mo48845b(int i, int i2) {
        this.f73415b.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f73415b.animate().alpha(0.0f).setDuration(j).setInterpolator(this.f73417d).setStartDelay(j2).start();
        if (this.f73416c.getVisibility() == 0) {
            this.f73416c.setAlpha(1.0f);
            this.f73416c.animate().alpha(0.0f).setDuration(j).setInterpolator(this.f73417d).setStartDelay(j2).start();
        }
    }

    /* renamed from: c */
    public Button m48844c() {
        return this.f73416c;
    }

    /* renamed from: d */
    public TextView m48843d() {
        return this.f73415b;
    }

    /* renamed from: e */
    public void m48842e(float f) {
        if (f != 1.0f) {
            this.f73416c.setTextColor(HM2.m103947i(HM2.m103952d(this, C49961uf4.colorSurface), this.f73416c.getCurrentTextColor(), f));
        }
    }

    /* renamed from: g */
    public final boolean m48840g(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f73415b.getPaddingTop() == i2 && this.f73415b.getPaddingBottom() == i3) {
            return z;
        }
        m48841f(this.f73415b, i2, i3);
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f73415b = (TextView) findViewById(C33795Ji4.snackbar_text);
        this.f73416c = (Button) findViewById(C33795Ji4.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (m48840g(1, r0, r0 - r2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (m48840g(0, r0, r0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        boolean z2 = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C35172Pf4.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C35172Pf4.design_snackbar_padding_vertical);
        Layout layout = this.f73415b.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f73418e <= 0 || this.f73416c.getMeasuredWidth() <= this.f73418e) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f73418e = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73417d = C37997aW2.m71260g(context, C49961uf4.motionEasingEmphasizedInterpolator, C27325pf.f103880b);
    }
}
