package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes6.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: b */
    public int f73014b;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final int m49392c() {
        return this.f73014b;
    }

    /* renamed from: d */
    public final void m49391d(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f73014b = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m49391d(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f73014b = getVisibility();
    }
}
