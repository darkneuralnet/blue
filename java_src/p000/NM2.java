package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
/* renamed from: NM2 */
/* loaded from: classes6.dex */
public class NM2 {
    private NM2() {
    }

    /* renamed from: a */
    public static ColorStateList m94030a(Context context, Z46 z46, int i) {
        int m73755n;
        ColorStateList m8249a;
        if (z46.m73750s(i) && (m73755n = z46.m73755n(i, 0)) != 0 && (m8249a = C29611vi.m8249a(context, m73755n)) != null) {
            return m8249a;
        }
        return z46.m73766c(i);
    }

    /* renamed from: b */
    public static ColorStateList m94029b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList m8249a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m8249a = C29611vi.m8249a(context, resourceId)) != null) {
            return m8249a;
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: c */
    public static int m94028c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    /* renamed from: d */
    public static int m94027d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public static Drawable m94026e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m8248b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m8248b = C29611vi.m8248b(context, resourceId)) != null) {
            return m8248b;
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: f */
    public static int m94025f(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: g */
    public static N06 m94024g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return new N06(context, resourceId);
        }
        return null;
    }

    /* renamed from: h */
    public static int m94023h(Context context, int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C37098Xl4.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(C37098Xl4.TextAppearance_android_textSize, typedValue);
        obtainStyledAttributes.recycle();
        if (!value) {
            return i2;
        }
        if (m94028c(typedValue) == 2) {
            return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    /* renamed from: i */
    public static boolean m94022i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: j */
    public static boolean m94021j(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
