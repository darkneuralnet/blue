package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import kotlin.KotlinVersion;
/* renamed from: HM2 */
/* loaded from: classes6.dex */
public class HM2 {
    private HM2() {
    }

    /* renamed from: a */
    public static int m103955a(int i, int i2) {
        return C33827Jm0.m99845p(i, (Color.alpha(i) * i2) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: b */
    public static int m103954b(Context context, int i, int i2) {
        TypedValue m114085a = BM2.m114085a(context, i);
        if (m114085a != null) {
            return m103945k(context, m114085a);
        }
        return i2;
    }

    /* renamed from: c */
    public static int m103953c(Context context, int i, String str) {
        return m103945k(context, BM2.m114081e(context, i, str));
    }

    /* renamed from: d */
    public static int m103952d(View view, int i) {
        return m103945k(view.getContext(), BM2.m114080f(view, i));
    }

    /* renamed from: e */
    public static int m103951e(View view, int i, int i2) {
        return m103954b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static ColorStateList m103950f(Context context, int i) {
        TypedValue m114085a = BM2.m114085a(context, i);
        if (m114085a == null) {
            return null;
        }
        int i2 = m114085a.resourceId;
        if (i2 != 0) {
            return NA0.m94300d(context, i2);
        }
        int i3 = m114085a.data;
        if (i3 == 0) {
            return null;
        }
        return ColorStateList.valueOf(i3);
    }

    /* renamed from: g */
    public static boolean m103949g(int i) {
        return i != 0 && C33827Jm0.m99855f(i) > 0.5d;
    }

    /* renamed from: h */
    public static int m103948h(int i, int i2) {
        return C33827Jm0.m99850k(i2, i);
    }

    /* renamed from: i */
    public static int m103947i(int i, int i2, float f) {
        return m103948h(i, C33827Jm0.m99845p(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: j */
    public static int m103946j(View view, int i, int i2, float f) {
        return m103947i(m103952d(view, i), m103952d(view, i2), f);
    }

    /* renamed from: k */
    public static int m103945k(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return NA0.m94301c(context, i);
        }
        return typedValue.data;
    }
}
