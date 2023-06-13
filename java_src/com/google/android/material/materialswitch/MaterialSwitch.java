package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
/* loaded from: classes6.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: E0 */
    public static final int f73015E0 = C50021ul4.Widget_Material3_CompoundButton_MaterialSwitch;

    /* renamed from: F0 */
    public static final int[] f73016F0 = {C49961uf4.state_with_icon};

    /* renamed from: A0 */
    public ColorStateList f73017A0;

    /* renamed from: B0 */
    public PorterDuff.Mode f73018B0;

    /* renamed from: C0 */
    public int[] f73019C0;

    /* renamed from: D0 */
    public int[] f73020D0;

    /* renamed from: s0 */
    public Drawable f73021s0;

    /* renamed from: t0 */
    public Drawable f73022t0;

    /* renamed from: u0 */
    public Drawable f73023u0;

    /* renamed from: v0 */
    public Drawable f73024v0;

    /* renamed from: w0 */
    public ColorStateList f73025w0;

    /* renamed from: x0 */
    public ColorStateList f73026x0;

    /* renamed from: y0 */
    public PorterDuff.Mode f73027y0;

    /* renamed from: z0 */
    public ColorStateList f73028z0;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    /* renamed from: G */
    public static void m49388G(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null && colorStateList != null) {
            P61.m90838n(drawable, C33827Jm0.m99857d(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    /* renamed from: E */
    public final void m49390E() {
        this.f73021s0 = C40750f71.m42017b(this.f73021s0, this.f73025w0, m69814o());
        this.f73022t0 = C40750f71.m42017b(this.f73022t0, this.f73026x0, this.f73027y0);
        m49387H();
        super.setThumbDrawable(C40750f71.m42018a(this.f73021s0, this.f73022t0));
        refreshDrawableState();
    }

    /* renamed from: F */
    public final void m49389F() {
        this.f73023u0 = C40750f71.m42017b(this.f73023u0, this.f73028z0, m69811r());
        this.f73024v0 = C40750f71.m42017b(this.f73024v0, this.f73017A0, this.f73018B0);
        m49387H();
        Drawable drawable = this.f73023u0;
        if (drawable != null && this.f73024v0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f73023u0, this.f73024v0});
        } else if (drawable == null) {
            drawable = this.f73024v0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    /* renamed from: H */
    public final void m49387H() {
        if (this.f73025w0 == null && this.f73026x0 == null && this.f73028z0 == null && this.f73017A0 == null) {
            return;
        }
        float m69817l = m69817l();
        ColorStateList colorStateList = this.f73025w0;
        if (colorStateList != null) {
            m49388G(this.f73021s0, colorStateList, this.f73019C0, this.f73020D0, m69817l);
        }
        ColorStateList colorStateList2 = this.f73026x0;
        if (colorStateList2 != null) {
            m49388G(this.f73022t0, colorStateList2, this.f73019C0, this.f73020D0, m69817l);
        }
        ColorStateList colorStateList3 = this.f73028z0;
        if (colorStateList3 != null) {
            m49388G(this.f73023u0, colorStateList3, this.f73019C0, this.f73020D0, m69817l);
        }
        ColorStateList colorStateList4 = this.f73017A0;
        if (colorStateList4 != null) {
            m49388G(this.f73024v0, colorStateList4, this.f73019C0, this.f73020D0, m69817l);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        m49387H();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f73022t0 != null) {
            View.mergeDrawableStates(onCreateDrawableState, f73016F0);
        }
        this.f73019C0 = C40750f71.m42013f(onCreateDrawableState);
        this.f73020D0 = C40750f71.m42014e(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f73021s0 = drawable;
        m49390E();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f73022t0 = drawable;
        m49390E();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(C29611vi.m8248b(getContext(), i));
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f73026x0 = colorStateList;
        m49390E();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f73027y0 = mode;
        m49390E();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f73025w0 = colorStateList;
        m49390E();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m49390E();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f73024v0 = drawable;
        m49389F();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(C29611vi.m8248b(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f73017A0 = colorStateList;
        m49389F();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f73018B0 = mode;
        m49389F();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f73023u0 = drawable;
        m49389F();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f73028z0 = colorStateList;
        m49389F();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m49389F();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f73015E0;
        Context context2 = getContext();
        this.f73021s0 = super.m69819j();
        this.f73025w0 = super.m69815n();
        super.setThumbTintList(null);
        this.f73023u0 = super.m69813p();
        this.f73028z0 = super.m69812q();
        super.setTrackTintList(null);
        Z46 m21865j = C46052o36.m21865j(context2, attributeSet, C37098Xl4.MaterialSwitch, i, i2, new int[0]);
        this.f73022t0 = m21865j.m73762g(C37098Xl4.MaterialSwitch_thumbIcon);
        this.f73026x0 = m21865j.m73766c(C37098Xl4.MaterialSwitch_thumbIconTint);
        this.f73027y0 = C36704Vt6.m79293o(m21865j.m73758k(C37098Xl4.MaterialSwitch_thumbIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f73024v0 = m21865j.m73762g(C37098Xl4.MaterialSwitch_trackDecoration);
        this.f73017A0 = m21865j.m73766c(C37098Xl4.MaterialSwitch_trackDecorationTint);
        this.f73018B0 = C36704Vt6.m79293o(m21865j.m73758k(C37098Xl4.MaterialSwitch_trackDecorationTintMode, -1), PorterDuff.Mode.SRC_IN);
        m21865j.m73746w();
        m69807v(false);
        m49390E();
        m49389F();
    }
}
