package p000;

import java.util.Objects;
/* renamed from: Yd3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37259Yd3 {

    /* renamed from: Yd3$a */
    /* loaded from: classes.dex */
    public static class C9828a {
        private C9828a() {
        }

        /* renamed from: a */
        public static boolean m74775a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        public static int m74774b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    private C37259Yd3() {
    }

    /* renamed from: a */
    public static boolean m74780a(Object obj, Object obj2) {
        return C9828a.m74775a(obj, obj2);
    }

    /* renamed from: b */
    public static int m74779b(Object... objArr) {
        return C9828a.m74774b(objArr);
    }

    /* renamed from: c */
    public static <T> T m74778c(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: d */
    public static <T> T m74777d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static String m74776e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
