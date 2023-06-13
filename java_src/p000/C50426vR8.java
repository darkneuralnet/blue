package p000;
/* renamed from: vR8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50426vR8 {
    /* renamed from: a */
    public static Object m8641a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    public static Object[] m8640b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m8641a(objArr[i2], i2);
        }
        return objArr;
    }
}
