package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
/* renamed from: o36  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46052o36 {

    /* renamed from: a */
    public static final int[] f101290a = {C49961uf4.colorPrimary};

    /* renamed from: b */
    public static final int[] f101291b = {C49961uf4.colorPrimaryVariant};

    private C46052o36() {
    }

    /* renamed from: a */
    public static void m21874a(Context context) {
        m21870e(context, f101290a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m21873b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C37098Xl4.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C49961uf4.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m21872c(context);
            }
        }
        m21874a(context);
    }

    /* renamed from: c */
    public static void m21872c(Context context) {
        m21870e(context, f101291b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    public static void m21871d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C37098Xl4.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = m21869f(context, attributeSet, iArr, i, i2, iArr2);
        } else {
            if (obtainStyledAttributes.getResourceId(C37098Xl4.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        }
        obtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    /* renamed from: e */
    public static void m21870e(Context context, int[] iArr, String str) {
        if (m21867h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    public static boolean m21869f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    public static boolean m21868g(Context context) {
        return BM2.m114084b(context, C49961uf4.isMaterial3Theme, false);
    }

    /* renamed from: h */
    public static boolean m21867h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: i */
    public static TypedArray m21866i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m21873b(context, attributeSet, i, i2);
        m21871d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: j */
    public static Z46 m21865j(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m21873b(context, attributeSet, i, i2);
        m21871d(context, attributeSet, iArr, i, i2, iArr2);
        return Z46.m73747v(context, attributeSet, iArr, i, i2);
    }
}
