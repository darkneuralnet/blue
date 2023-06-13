package p000;

import java.lang.reflect.Array;
/* renamed from: nE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45560nE1 {
    private C45560nE1() {
    }

    /* renamed from: a */
    public static int[] m24133a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m24131c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: b */
    public static <T> T[] m24132b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m24131c(i));
            System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: c */
    public static int m24131c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
