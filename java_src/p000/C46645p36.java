package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* renamed from: p36  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46645p36 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f103072a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f103073b = {-16842910};

    /* renamed from: c */
    public static final int[] f103074c = {16842908};

    /* renamed from: d */
    public static final int[] f103075d = {16843518};

    /* renamed from: e */
    public static final int[] f103076e = {16842919};

    /* renamed from: f */
    public static final int[] f103077f = {16842912};

    /* renamed from: g */
    public static final int[] f103078g = {16842913};

    /* renamed from: h */
    public static final int[] f103079h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f103080i = new int[0];

    /* renamed from: j */
    public static final int[] f103081j = new int[1];

    private C46645p36() {
    }

    /* renamed from: a */
    public static void m20010a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C43509jm4.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C43509jm4.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m20009b(Context context, int i) {
        ColorStateList m20006e = m20006e(context, i);
        if (m20006e != null && m20006e.isStateful()) {
            return m20006e.getColorForState(f103073b, m20006e.getDefaultColor());
        }
        TypedValue m20005f = m20005f();
        context.getTheme().resolveAttribute(16842803, m20005f, true);
        return m20007d(context, i, m20005f.getFloat());
    }

    /* renamed from: c */
    public static int m20008c(Context context, int i) {
        int[] iArr = f103081j;
        iArr[0] = i;
        Z46 m73748u = Z46.m73748u(context, null, iArr);
        try {
            return m73748u.m73767b(0, 0);
        } finally {
            m73748u.m73746w();
        }
    }

    /* renamed from: d */
    public static int m20007d(Context context, int i, float f) {
        int m20008c = m20008c(context, i);
        return C33827Jm0.m99845p(m20008c, Math.round(Color.alpha(m20008c) * f));
    }

    /* renamed from: e */
    public static ColorStateList m20006e(Context context, int i) {
        int[] iArr = f103081j;
        iArr[0] = i;
        Z46 m73748u = Z46.m73748u(context, null, iArr);
        try {
            return m73748u.m73766c(0);
        } finally {
            m73748u.m73746w();
        }
    }

    /* renamed from: f */
    public static TypedValue m20005f() {
        ThreadLocal<TypedValue> threadLocal = f103072a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
