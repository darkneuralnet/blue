package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: Db6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32330Db6 {

    /* renamed from: a */
    public final byte[] f6026a;

    /* renamed from: b */
    public final int f6027b;

    public C32330Db6(byte[] bArr, int i) {
        this.f6026a = bArr;
        this.f6027b = i;
    }

    /* renamed from: d */
    public static void m110120d(C32330Db6 c32330Db6, O70 o70) {
        if (c32330Db6 == null) {
            o70.m92892g(0);
            return;
        }
        byte[] bArr = c32330Db6.f6026a;
        int i = c32330Db6.f6027b;
        o70.m92891h(bArr, i, (bArr[i] * 2) + 1);
    }

    /* renamed from: a */
    public int m110123a() {
        return this.f6026a[this.f6027b];
    }

    /* renamed from: b */
    public int m110122b(int i) {
        return this.f6026a[this.f6027b + (i * 2) + 1];
    }

    /* renamed from: c */
    public int m110121c(int i) {
        return this.f6026a[this.f6027b + (i * 2) + 2];
    }

    public String toString() {
        int m110123a = m110123a();
        StringBuilder sb = new StringBuilder(m110123a * 2);
        for (int i = 0; i < m110123a; i++) {
            int m110122b = m110122b(i);
            if (m110122b != 0) {
                if (m110122b != 1) {
                    if (m110122b != 2) {
                        if (m110122b == 3) {
                            sb.append(m110121c(i));
                            sb.append(';');
                        } else {
                            throw new AssertionError();
                        }
                    } else {
                        sb.append('*');
                    }
                } else {
                    sb.append(CoreConstants.DOT);
                }
            } else {
                sb.append('[');
            }
        }
        return sb.toString();
    }
}
