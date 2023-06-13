package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
/* renamed from: aW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37997aW2 {
    private C37997aW2() {
    }

    /* renamed from: a */
    public static float m71266a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static String m71265b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    public static TimeInterpolator m71264c(String str) {
        if (m71262e(str, "cubic-bezier")) {
            String[] split = m71265b(str, "cubic-bezier").split(",");
            if (split.length == 4) {
                return C43828kJ3.m29072a(m71266a(split, 0), m71266a(split, 1), m71266a(split, 2), m71266a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        } else if (m71262e(str, "path")) {
            return C43828kJ3.m29071b(C49164tJ3.m12510e(m71265b(str, "path")));
        } else {
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
    }

    /* renamed from: d */
    public static boolean m71263d(String str) {
        if (!m71262e(str, "cubic-bezier") && !m71262e(str, "path")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m71262e(String str, String str2) {
        if (str.startsWith(str2 + "(") && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static int m71261f(Context context, int i, int i2) {
        return BM2.m114083c(context, i, i2);
    }

    /* renamed from: g */
    public static TimeInterpolator m71260g(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m71263d(valueOf)) {
                return m71264c(valueOf);
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
