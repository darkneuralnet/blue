package p000;
/* renamed from: lI8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44417lI8 {
    /* renamed from: a */
    public static Object m27433a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m27432b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m27433a(objArr[i2], i2);
        }
        return objArr;
    }
}
