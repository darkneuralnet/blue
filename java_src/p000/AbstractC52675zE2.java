package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.UByte;
/* renamed from: zE2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC52675zE2 {

    /* renamed from: a */
    public final int f120996a;

    /* renamed from: b */
    public final int f120997b;

    public AbstractC52675zE2(int i, int i2) {
        this.f120996a = i;
        this.f120997b = i2;
    }

    /* renamed from: a */
    public final int m1618a() {
        return this.f120997b;
    }

    /* renamed from: b */
    public abstract byte[] mo1617b();

    /* renamed from: c */
    public abstract byte[] mo1616c(int i, byte[] bArr);

    /* renamed from: d */
    public final int m1615d() {
        return this.f120996a;
    }

    /* renamed from: e */
    public AbstractC52675zE2 m1614e() {
        return new R92(this);
    }

    /* renamed from: f */
    public boolean mo1613f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC52675zE2 mo1612g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f120996a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f120997b * (i + 1));
        for (int i2 = 0; i2 < this.f120997b; i2++) {
            bArr = mo1616c(i2, bArr);
            for (int i3 = 0; i3 < this.f120996a; i3++) {
                int i4 = bArr[i3] & UByte.MAX_VALUE;
                if (i4 < 64) {
                    c = '#';
                } else if (i4 < 128) {
                    c = '+';
                } else if (i4 < 192) {
                    c = CoreConstants.DOT;
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
