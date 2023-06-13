package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\t"}, m28432d2 = {"", "", "value", "fromIndex", "toIndex", C17296a.f69688o, "Ldr5;", "pos", "b", "okio"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: EJ6 */
/* loaded from: classes8.dex */
public final class EJ6 {
    /* renamed from: a */
    public static final int m109182a(int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 > i) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m109181b(C40002dr5 c40002dr5, int i) {
        Intrinsics.checkNotNullParameter(c40002dr5, "<this>");
        int m109182a = m109182a(c40002dr5.m43604F(), i + 1, 0, c40002dr5.m43603H().length);
        if (m109182a < 0) {
            return ~m109182a;
        }
        return m109182a;
    }
}
