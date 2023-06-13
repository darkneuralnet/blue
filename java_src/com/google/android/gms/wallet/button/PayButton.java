package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.google.android.gms.wallet.button.ButtonOptions;
/* loaded from: classes6.dex */
public final class PayButton extends FrameLayout {

    /* renamed from: b */
    public ButtonOptions.C17645a f72017b;

    /* renamed from: c */
    public final C31657Ae8 f72018c;

    public PayButton(Context context) {
        this(context, null);
    }

    public PayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ButtonOptions.C17645a m50519F = ButtonOptions.m50519F();
        this.f72017b = m50519F;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36864Wl4.PayButtonAttributes);
        int i2 = obtainStyledAttributes.getInt(C36864Wl4.PayButtonAttributes_buttonTheme, 1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C36864Wl4.PayButtonAttributes_cornerRadius, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        obtainStyledAttributes.recycle();
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.f72013c = i2;
        buttonOptions.f72014d = dimensionPixelSize;
        m50519F.m50515a(1);
        this.f72018c = new C31657Ae8();
    }
}
