package io.reactivex.internal.functions;

import io.reactivex.functions.InterfaceC23481d;
/* renamed from: io.reactivex.internal.functions.b */
/* loaded from: classes6.dex */
public final class C23544b {

    /* renamed from: a */
    public static final InterfaceC23481d<Object, Object> f88287a = new C23545a();

    /* renamed from: io.reactivex.internal.functions.b$a */
    /* loaded from: classes6.dex */
    public static final class C23545a implements InterfaceC23481d<Object, Object> {
        @Override // io.reactivex.functions.InterfaceC23481d
        public boolean test(Object obj, Object obj2) {
            return C23544b.m32925c(obj, obj2);
        }
    }

    private C23544b() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static int m32927a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m32926b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static boolean m32925c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static <T> InterfaceC23481d<T, T> m32924d() {
        return (InterfaceC23481d<T, T>) f88287a;
    }

    /* renamed from: e */
    public static <T> T m32923e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f */
    public static int m32922f(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    /* renamed from: g */
    public static long m32921g(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }
}
