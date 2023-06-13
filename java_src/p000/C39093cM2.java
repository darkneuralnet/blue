package p000;

import android.view.ViewGroup;
/* renamed from: cM2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39093cM2 {

    /* renamed from: cM2$a */
    /* loaded from: classes.dex */
    public static class C13515a {
        private C13515a() {
        }

        /* renamed from: a */
        public static int m61539a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        public static int m61538b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        public static int m61537c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        public static boolean m61536d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        public static void m61535e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        public static void m61534f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        public static void m61533g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        public static void m61532h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    private C39093cM2() {
    }

    /* renamed from: a */
    public static int m61543a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C13515a.m61538b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m61542b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C13515a.m61537c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m61541c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C13515a.m61533g(marginLayoutParams, i);
    }

    /* renamed from: d */
    public static void m61540d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C13515a.m61532h(marginLayoutParams, i);
    }
}
