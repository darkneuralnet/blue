package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
/* loaded from: classes6.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: h */
    public static final int f73164h = C50021ul4.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: i */
    public static final int[][] f73165i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f */
    public ColorStateList f73166f;

    /* renamed from: g */
    public boolean f73167g;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final ColorStateList m49238c() {
        if (this.f73166f == null) {
            int m103952d = HM2.m103952d(this, C49961uf4.colorControlActivated);
            int m103952d2 = HM2.m103952d(this, C49961uf4.colorOnSurface);
            int m103952d3 = HM2.m103952d(this, C49961uf4.colorSurface);
            int[][] iArr = f73165i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = HM2.m103947i(m103952d3, m103952d, 1.0f);
            iArr2[1] = HM2.m103947i(m103952d3, m103952d2, 0.54f);
            iArr2[2] = HM2.m103947i(m103952d3, m103952d2, 0.38f);
            iArr2[3] = HM2.m103947i(m103952d3, m103952d2, 0.38f);
            this.f73166f = new ColorStateList(iArr, iArr2);
        }
        return this.f73166f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f73167g && C48921su0.m13545b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f73167g = z;
        if (z) {
            C48921su0.m13543d(this, m49238c());
        } else {
            C48921su0.m13543d(this, null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f73164h;
        Context context2 = getContext();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.MaterialRadioButton, i, i2, new int[0]);
        int i3 = C37098Xl4.MaterialRadioButton_buttonTint;
        if (m21866i.hasValue(i3)) {
            C48921su0.m13543d(this, NM2.m94029b(context2, m21866i, i3));
        }
        this.f73167g = m21866i.getBoolean(C37098Xl4.MaterialRadioButton_useMaterialThemeColors, false);
        m21866i.recycle();
    }
}
