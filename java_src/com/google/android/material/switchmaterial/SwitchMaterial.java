package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
/* loaded from: classes6.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: w0 */
    public static final int f73429w0 = C50021ul4.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: x0 */
    public static final int[][] f73430x0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: s0 */
    public final C46351oa1 f73431s0;

    /* renamed from: t0 */
    public ColorStateList f73432t0;

    /* renamed from: u0 */
    public ColorStateList f73433u0;

    /* renamed from: v0 */
    public boolean f73434v0;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    /* renamed from: E */
    public final ColorStateList m48819E() {
        if (this.f73432t0 == null) {
            int m103952d = HM2.m103952d(this, C49961uf4.colorSurface);
            int m103952d2 = HM2.m103952d(this, C49961uf4.colorControlActivated);
            float dimension = getResources().getDimension(C35172Pf4.mtrl_switch_thumb_elevation);
            if (this.f73431s0.m20830e()) {
                dimension += C36704Vt6.m79297k(this);
            }
            int m20832c = this.f73431s0.m20832c(m103952d, dimension);
            int[][] iArr = f73430x0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = HM2.m103947i(m103952d, m103952d2, 1.0f);
            iArr2[1] = m20832c;
            iArr2[2] = HM2.m103947i(m103952d, m103952d2, 0.38f);
            iArr2[3] = m20832c;
            this.f73432t0 = new ColorStateList(iArr, iArr2);
        }
        return this.f73432t0;
    }

    /* renamed from: F */
    public final ColorStateList m48818F() {
        if (this.f73433u0 == null) {
            int[][] iArr = f73430x0;
            int[] iArr2 = new int[iArr.length];
            int m103952d = HM2.m103952d(this, C49961uf4.colorSurface);
            int m103952d2 = HM2.m103952d(this, C49961uf4.colorControlActivated);
            int m103952d3 = HM2.m103952d(this, C49961uf4.colorOnSurface);
            iArr2[0] = HM2.m103947i(m103952d, m103952d2, 0.54f);
            iArr2[1] = HM2.m103947i(m103952d, m103952d3, 0.32f);
            iArr2[2] = HM2.m103947i(m103952d, m103952d2, 0.12f);
            iArr2[3] = HM2.m103947i(m103952d, m103952d3, 0.12f);
            this.f73433u0 = new ColorStateList(iArr, iArr2);
        }
        return this.f73433u0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f73434v0 && m69815n() == null) {
            setThumbTintList(m48819E());
        }
        if (this.f73434v0 && m69812q() == null) {
            setTrackTintList(m48818F());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f73434v0 = z;
        if (z) {
            setThumbTintList(m48819E());
            setTrackTintList(m48818F());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f73429w0;
        Context context2 = getContext();
        this.f73431s0 = new C46351oa1(context2);
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.SwitchMaterial, i, i2, new int[0]);
        this.f73434v0 = m21866i.getBoolean(C37098Xl4.SwitchMaterial_useMaterialThemeColors, false);
        m21866i.recycle();
    }
}
