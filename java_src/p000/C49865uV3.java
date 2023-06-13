package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
/* renamed from: uV3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49865uV3 {
    private C49865uV3() {
    }

    /* renamed from: a */
    public static <T> T[] m10210a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    public static <T> T[] m10209b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m10208c(int i) {
        return C34556Mp0.m94718w(i);
    }

    /* renamed from: d */
    public static <E> Set<E> m10207d(int i) {
        return C35258Pp0.m89739O(i);
    }

    /* renamed from: e */
    public static <E> Set<E> m10206e() {
        return C34790Np0.m93354h();
    }

    /* renamed from: f */
    public static <K, V> Map<K, V> m10205f() {
        return C34556Mp0.m94723r();
    }
}
