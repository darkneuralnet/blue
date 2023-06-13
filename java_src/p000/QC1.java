package p000;

import com.google.zxing.NotFoundException;
import kotlin.UByte;
/* renamed from: QC1 */
/* loaded from: classes6.dex */
public class QC1 extends AbstractC7368SG {

    /* renamed from: d */
    public static final byte[] f30006d = new byte[0];

    /* renamed from: b */
    public byte[] f30007b;

    /* renamed from: c */
    public final int[] f30008c;

    public QC1(AbstractC52675zE2 abstractC52675zE2) {
        super(abstractC52675zE2);
        this.f30007b = f30006d;
        this.f30008c = new int[32];
    }

    /* renamed from: g */
    public static int m88782g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 > length / 16) {
            int i12 = i3 - 1;
            int i13 = -1;
            int i14 = i12;
            while (i12 > i6) {
                int i15 = i12 - i6;
                int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
                if (i16 > i13) {
                    i14 = i12;
                    i13 = i16;
                }
                i12--;
            }
            return i14 << 3;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.AbstractC7368SG
    /* renamed from: b */
    public C1837ET mo83718b() throws NotFoundException {
        AbstractC52675zE2 m85788e = m85788e();
        int m1615d = m85788e.m1615d();
        int m1618a = m85788e.m1618a();
        C1837ET c1837et = new C1837ET(m1615d, m1618a);
        m88781h(m1615d);
        int[] iArr = this.f30008c;
        for (int i = 1; i < 5; i++) {
            byte[] mo1616c = m85788e.mo1616c((m1618a * i) / 5, this.f30007b);
            int i2 = (m1615d << 2) / 5;
            for (int i3 = m1615d / 5; i3 < i2; i3++) {
                int i4 = (mo1616c[i3] & UByte.MAX_VALUE) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int m88782g = m88782g(iArr);
        byte[] mo1617b = m85788e.mo1617b();
        for (int i5 = 0; i5 < m1618a; i5++) {
            int i6 = i5 * m1615d;
            for (int i7 = 0; i7 < m1615d; i7++) {
                if ((mo1617b[i6 + i7] & UByte.MAX_VALUE) < m88782g) {
                    c1837et.m108951q(i7, i5);
                }
            }
        }
        return c1837et;
    }

    @Override // p000.AbstractC7368SG
    /* renamed from: c */
    public C1027CT mo85790c(int i, C1027CT c1027ct) throws NotFoundException {
        AbstractC52675zE2 m85788e = m85788e();
        int m1615d = m85788e.m1615d();
        if (c1027ct != null && c1027ct.m112213o() >= m1615d) {
            c1027ct.m112220g();
        } else {
            c1027ct = new C1027CT(m1615d);
        }
        m88781h(m1615d);
        byte[] mo1616c = m85788e.mo1616c(i, this.f30007b);
        int[] iArr = this.f30008c;
        for (int i2 = 0; i2 < m1615d; i2++) {
            int i3 = (mo1616c[i2] & UByte.MAX_VALUE) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int m88782g = m88782g(iArr);
        if (m1615d < 3) {
            for (int i4 = 0; i4 < m1615d; i4++) {
                if ((mo1616c[i4] & UByte.MAX_VALUE) < m88782g) {
                    c1027ct.m112208w(i4);
                }
            }
        } else {
            int i5 = 1;
            int i6 = mo1616c[0] & UByte.MAX_VALUE;
            int i7 = mo1616c[1] & UByte.MAX_VALUE;
            while (i5 < m1615d - 1) {
                int i8 = i5 + 1;
                int i9 = mo1616c[i8] & UByte.MAX_VALUE;
                if ((((i7 << 2) - i6) - i9) / 2 < m88782g) {
                    c1027ct.m112208w(i5);
                }
                i6 = i7;
                i5 = i8;
                i7 = i9;
            }
        }
        return c1027ct;
    }

    /* renamed from: h */
    public final void m88781h(int i) {
        if (this.f30007b.length < i) {
            this.f30007b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f30008c[i2] = 0;
        }
    }
}
