package p000;

import java.io.IOException;
import java.math.BigInteger;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* renamed from: K */
/* loaded from: classes8.dex */
public class C4295K extends AbstractC7305S {

    /* renamed from: b */
    public final byte[] f18895b;

    /* renamed from: c */
    public final int f18896c;

    public C4295K(long j) {
        this.f18895b = BigInteger.valueOf(j).toByteArray();
        this.f18896c = 0;
    }

    /* renamed from: A */
    public static C4295K m99377A(Object obj) {
        if (obj == null || (obj instanceof C4295K)) {
            return (C4295K) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C4295K) AbstractC7305S.m86134v((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    /* renamed from: E */
    public static int m99374E(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i3 = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[max] & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    /* renamed from: G */
    public static boolean m99372G(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                return bArr[0] == (bArr[1] >> 7) && !W84.m78791b("org.bouncycastle.asn1.allow_unsafe_integer");
            }
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public static long m99371H(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 8);
        long j = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return j;
            }
            j = (j << 8) | (bArr[max] & UByte.MAX_VALUE);
        }
    }

    /* renamed from: J */
    public static int m99369J(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: z */
    public static C4295K m99368z(AbstractC10088Z abstractC10088Z, boolean z) {
        AbstractC7305S m73929A = abstractC10088Z.m73929A();
        return (z || (m73929A instanceof C4295K)) ? m99377A(m73929A) : new C4295K(AbstractC5803O.m93018A(m73929A).m93017C());
    }

    /* renamed from: C */
    public BigInteger m99376C() {
        return new BigInteger(this.f18895b);
    }

    /* renamed from: D */
    public boolean m99375D(int i) {
        byte[] bArr = this.f18895b;
        int length = bArr.length;
        int i2 = this.f18896c;
        return length - i2 <= 4 && m99374E(bArr, i2, -1) == i;
    }

    /* renamed from: F */
    public int m99373F() {
        byte[] bArr = this.f18895b;
        int length = bArr.length;
        int i = this.f18896c;
        if (length - i <= 4) {
            return m99374E(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    /* renamed from: I */
    public long m99370I() {
        byte[] bArr = this.f18895b;
        int length = bArr.length;
        int i = this.f18896c;
        if (length - i <= 8) {
            return m99371H(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f18895b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C4295K) {
            return C0210Ao.m115254a(this.f18895b, ((C4295K) abstractC7305S).f18895b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 2, this.f18895b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f18895b.length) + 1 + this.f18895b.length;
    }

    public String toString() {
        return m99376C().toString();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    public C4295K(BigInteger bigInteger) {
        this.f18895b = bigInteger.toByteArray();
        this.f18896c = 0;
    }

    public C4295K(byte[] bArr) {
        this(bArr, true);
    }

    public C4295K(byte[] bArr, boolean z) {
        if (m99372G(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f18895b = z ? C0210Ao.m115251d(bArr) : bArr;
        this.f18896c = m99369J(bArr);
    }
}
