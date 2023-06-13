package p000;

import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: hm7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42326hm7 {
    /* renamed from: a */
    public static Object[] m35876a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException("at index " + i2);
            }
        }
        return objArr;
    }
}
