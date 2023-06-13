package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: fN4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40900fN4 {

    /* renamed from: a */
    public final float f80022a;

    /* renamed from: b */
    public final float f80023b;

    public C40900fN4(float f, float f2) {
        this.f80022a = f;
        this.f80023b = f2;
    }

    /* renamed from: a */
    public static float m41473a(C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43) {
        float f = c40900fN42.f80022a;
        float f2 = c40900fN42.f80023b;
        return ((c40900fN43.f80022a - f) * (c40900fN4.f80023b - f2)) - ((c40900fN43.f80023b - f2) * (c40900fN4.f80022a - f));
    }

    /* renamed from: b */
    public static float m41472b(C40900fN4 c40900fN4, C40900fN4 c40900fN42) {
        return C39713dN2.m44343a(c40900fN4.f80022a, c40900fN4.f80023b, c40900fN42.f80022a, c40900fN42.f80023b);
    }

    /* renamed from: e */
    public static void m41469e(C40900fN4[] c40900fN4Arr) {
        C40900fN4 c40900fN4;
        C40900fN4 c40900fN42;
        C40900fN4 c40900fN43;
        float m41472b = m41472b(c40900fN4Arr[0], c40900fN4Arr[1]);
        float m41472b2 = m41472b(c40900fN4Arr[1], c40900fN4Arr[2]);
        float m41472b3 = m41472b(c40900fN4Arr[0], c40900fN4Arr[2]);
        if (m41472b2 >= m41472b && m41472b2 >= m41472b3) {
            c40900fN4 = c40900fN4Arr[0];
            c40900fN42 = c40900fN4Arr[1];
            c40900fN43 = c40900fN4Arr[2];
        } else if (m41472b3 >= m41472b2 && m41472b3 >= m41472b) {
            c40900fN4 = c40900fN4Arr[1];
            c40900fN42 = c40900fN4Arr[0];
            c40900fN43 = c40900fN4Arr[2];
        } else {
            c40900fN4 = c40900fN4Arr[2];
            c40900fN42 = c40900fN4Arr[0];
            c40900fN43 = c40900fN4Arr[1];
        }
        if (m41473a(c40900fN42, c40900fN4, c40900fN43) < 0.0f) {
            C40900fN4 c40900fN44 = c40900fN43;
            c40900fN43 = c40900fN42;
            c40900fN42 = c40900fN44;
        }
        c40900fN4Arr[0] = c40900fN42;
        c40900fN4Arr[1] = c40900fN4;
        c40900fN4Arr[2] = c40900fN43;
    }

    /* renamed from: c */
    public final float m41471c() {
        return this.f80022a;
    }

    /* renamed from: d */
    public final float m41470d() {
        return this.f80023b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C40900fN4) {
            C40900fN4 c40900fN4 = (C40900fN4) obj;
            if (this.f80022a == c40900fN4.f80022a && this.f80023b == c40900fN4.f80023b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f80022a) * 31) + Float.floatToIntBits(this.f80023b);
    }

    public final String toString() {
        return "(" + this.f80022a + CoreConstants.COMMA_CHAR + this.f80023b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
