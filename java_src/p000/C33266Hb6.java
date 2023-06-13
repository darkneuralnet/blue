package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: Hb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33266Hb6 {
    private C33266Hb6() {
    }

    /* renamed from: a */
    public static boolean m103675a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m103666j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m103674b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m103666j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m103673c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m103666j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                if (i2 >= 28 && i2 <= 31) {
                    return m103672d(typedValue);
                }
                return C33125Gm0.m104771d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    public static ColorStateList m103672d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C50087us0 m103671e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m103666j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C50087us0.m9643b(typedValue.data);
            }
            C50087us0 m9638g = C50087us0.m9638g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m9638g != null) {
                return m9638g;
            }
        }
        return C50087us0.m9643b(i2);
    }

    /* renamed from: f */
    public static float m103670f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m103666j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m103669g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m103666j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m103668h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m103666j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m103667i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m103666j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m103666j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static TypedArray m103665k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
