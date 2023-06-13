package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: Hd3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33281Hd3 {
    private C33281Hd3() {
    }

    /* renamed from: a */
    public static Object m103641a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    public static Object[] m103640b(Object... objArr) {
        m103639c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    public static Object[] m103639c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m103641a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m103638d(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) m103636f(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* renamed from: e */
    public static Object[] m103637e(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    /* renamed from: f */
    public static <T> T[] m103636f(Class<T> cls, int i) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
    }

    /* renamed from: g */
    public static <T> T[] m103635g(T[] tArr, int i) {
        return (T[]) C49865uV3.m10209b(tArr, i);
    }

    /* renamed from: h */
    public static Object[] m103634h(Collection<?> collection) {
        return m103637e(collection, new Object[collection.size()]);
    }

    /* renamed from: i */
    public static <T> T[] m103633i(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) m103635g(tArr, size);
        }
        m103637e(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* renamed from: j */
    public static <T> T[] m103632j(Object[] objArr, int i, int i2, T[] tArr) {
        EZ3.m108796s(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) m103635g(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }
}
