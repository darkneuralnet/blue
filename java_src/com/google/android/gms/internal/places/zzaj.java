package com.google.android.gms.internal.places;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes5.dex */
public abstract class zzaj extends Dq9 {

    /* renamed from: b */
    public static final Logger f71191b = Logger.getLogger(zzaj.class.getName());

    /* renamed from: c */
    public static final boolean f71192c = C49038t58.m13106o();

    /* renamed from: a */
    public C48296rq7 f71193a;

    /* renamed from: com.google.android.gms.internal.places.zzaj$a */
    /* loaded from: classes5.dex */
    public static class C17546a extends zzaj {

        /* renamed from: d */
        public final byte[] f71194d;

        /* renamed from: e */
        public final int f71195e;

        /* renamed from: f */
        public final int f71196f;

        /* renamed from: g */
        public int f71197g;

        public C17546a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f71194d = bArr;
                    this.f71195e = 0;
                    this.f71197g = 0;
                    this.f71196f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: B */
        public final void mo51062B(int i, AbstractC43604jv9 abstractC43604jv9) throws IOException {
            mo51039z(1, 3);
            mo51054V(2, i);
            mo51044n(3, abstractC43604jv9);
            mo51039z(1, 4);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: C */
        public final void mo51061C(int i, boolean z) throws IOException {
            mo51039z(i, 0);
            mo51057M(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: D */
        public final void mo51060D(long j) throws IOException {
            if (zzaj.f71192c && mo51051b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f71194d;
                    int i = this.f71197g;
                    this.f71197g = i + 1;
                    C49038t58.m13112i(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f71194d;
                int i2 = this.f71197g;
                this.f71197g = i2 + 1;
                C49038t58.m13112i(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f71194d;
                    int i3 = this.f71197g;
                    this.f71197g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71197g), Integer.valueOf(this.f71196f), 1), e);
                }
            }
            byte[] bArr4 = this.f71194d;
            int i4 = this.f71197g;
            this.f71197g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: E */
        public final void mo51059E(InterfaceC52815zT7 interfaceC52815zT7) throws IOException {
            mo51041s0(interfaceC52815zT7.mo1329g());
            interfaceC52815zT7.mo1328h(this);
        }

        /* renamed from: E0 */
        public final void m51058E0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f71194d, this.f71197g, i2);
                this.f71197g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71197g), Integer.valueOf(this.f71196f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: M */
        public final void mo51057M(byte b) throws IOException {
            try {
                byte[] bArr = this.f71194d;
                int i = this.f71197g;
                this.f71197g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71197g), Integer.valueOf(this.f71196f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: O */
        public final void mo51056O(int i, int i2) throws IOException {
            mo51039z(i, 0);
            mo51042r0(i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: P */
        public final void mo51055P(int i, long j) throws IOException {
            mo51039z(i, 1);
            mo51053W(j);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: V */
        public final void mo51054V(int i, int i2) throws IOException {
            mo51039z(i, 0);
            mo51041s0(i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: W */
        public final void mo51053W(long j) throws IOException {
            try {
                byte[] bArr = this.f71194d;
                int i = this.f71197g;
                int i2 = i + 1;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (j >> 48);
                this.f71197g = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71197g), Integer.valueOf(this.f71196f), 1), e);
            }
        }

        @Override // p000.Dq9
        /* renamed from: a */
        public final void mo51052a(byte[] bArr, int i, int i2) throws IOException {
            m51058E0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: b */
        public final int mo51051b() {
            return this.f71196f - this.f71197g;
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: c0 */
        public final void mo51050c0(int i, int i2) throws IOException {
            mo51039z(i, 5);
            mo51040u0(i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: j */
        public final void mo51049j(int i, long j) throws IOException {
            mo51039z(i, 0);
            mo51060D(j);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: k */
        public final void mo51048k(int i, String str) throws IOException {
            mo51039z(i, 2);
            mo51046l0(str);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: l */
        public final void mo51047l(int i, InterfaceC52815zT7 interfaceC52815zT7) throws IOException {
            mo51039z(1, 3);
            mo51054V(2, i);
            mo51039z(3, 2);
            mo51059E(interfaceC52815zT7);
            mo51039z(1, 4);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: l0 */
        public final void mo51046l0(String str) throws IOException {
            int i = this.f71197g;
            try {
                int m51066x0 = zzaj.m51066x0(str.length() * 3);
                int m51066x02 = zzaj.m51066x0(str.length());
                if (m51066x02 == m51066x0) {
                    int i2 = i + m51066x02;
                    this.f71197g = i2;
                    int m81960d = U68.m81960d(str, this.f71194d, i2, mo51051b());
                    this.f71197g = i;
                    mo51041s0((m81960d - i) - m51066x02);
                    this.f71197g = m81960d;
                    return;
                }
                mo51041s0(U68.m81961c(str));
                this.f71197g = U68.m81960d(str, this.f71194d, this.f71197g, mo51051b());
            } catch (C40174e88 e) {
                this.f71197g = i;
                m51081o(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: m */
        public final void mo51045m(int i, InterfaceC52815zT7 interfaceC52815zT7, LY7 ly7) throws IOException {
            mo51039z(i, 2);
            AbstractC17544k abstractC17544k = (AbstractC17544k) interfaceC52815zT7;
            int mo51139b = abstractC17544k.mo51139b();
            if (mo51139b == -1) {
                mo51139b = ly7.mo51165h(abstractC17544k);
                abstractC17544k.mo51140a(mo51139b);
            }
            mo51041s0(mo51139b);
            ly7.mo51166g(interfaceC52815zT7, this.f71193a);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: n */
        public final void mo51044n(int i, AbstractC43604jv9 abstractC43604jv9) throws IOException {
            mo51039z(i, 2);
            mo51043p(abstractC43604jv9);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: p */
        public final void mo51043p(AbstractC43604jv9 abstractC43604jv9) throws IOException {
            mo51041s0(abstractC43604jv9.size());
            abstractC43604jv9.mo29746s(this);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: r0 */
        public final void mo51042r0(int i) throws IOException {
            if (i >= 0) {
                mo51041s0(i);
            } else {
                mo51060D(i);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: s0 */
        public final void mo51041s0(int i) throws IOException {
            if (zzaj.f71192c && !C41645gd9.m37944b() && mo51051b() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.f71194d;
                    int i2 = this.f71197g;
                    this.f71197g = i2 + 1;
                    C49038t58.m13112i(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.f71194d;
                int i3 = this.f71197g;
                this.f71197g = i3 + 1;
                C49038t58.m13112i(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.f71194d;
                    int i5 = this.f71197g;
                    this.f71197g = i5 + 1;
                    C49038t58.m13112i(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.f71194d;
                int i6 = this.f71197g;
                this.f71197g = i6 + 1;
                C49038t58.m13112i(bArr4, i6, (byte) (i4 | 128));
                int i7 = i4 >>> 7;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.f71194d;
                    int i8 = this.f71197g;
                    this.f71197g = i8 + 1;
                    C49038t58.m13112i(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f71194d;
                int i9 = this.f71197g;
                this.f71197g = i9 + 1;
                C49038t58.m13112i(bArr6, i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.f71194d;
                    int i11 = this.f71197g;
                    this.f71197g = i11 + 1;
                    C49038t58.m13112i(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f71194d;
                int i12 = this.f71197g;
                this.f71197g = i12 + 1;
                C49038t58.m13112i(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.f71194d;
                int i13 = this.f71197g;
                this.f71197g = i13 + 1;
                C49038t58.m13112i(bArr9, i13, (byte) (i10 >>> 7));
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f71194d;
                    int i14 = this.f71197g;
                    this.f71197g = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71197g), Integer.valueOf(this.f71196f), 1), e);
                }
            }
            byte[] bArr11 = this.f71194d;
            int i15 = this.f71197g;
            this.f71197g = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: u0 */
        public final void mo51040u0(int i) throws IOException {
            try {
                byte[] bArr = this.f71194d;
                int i2 = this.f71197g;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.f71197g = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71197g), Integer.valueOf(this.f71196f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        /* renamed from: z */
        public final void mo51039z(int i, int i2) throws IOException {
            mo51041s0((i << 3) | i2);
        }
    }

    /* loaded from: classes5.dex */
    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public zzc(String str, Throwable th) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
            String valueOf = String.valueOf(str);
        }
    }

    private zzaj() {
    }

    /* renamed from: A0 */
    public static int m51120A0(int i) {
        return 4;
    }

    /* renamed from: B0 */
    public static int m51119B0(int i) {
        return m51068w0(i);
    }

    /* renamed from: C0 */
    public static int m51118C0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: D0 */
    public static int m51117D0(int i) {
        return m51066x0(i);
    }

    @Deprecated
    /* renamed from: G */
    public static int m51115G(int i, InterfaceC52815zT7 interfaceC52815zT7, LY7 ly7) {
        int m51070v0 = m51070v0(i) << 1;
        AbstractC17544k abstractC17544k = (AbstractC17544k) interfaceC52815zT7;
        int mo51139b = abstractC17544k.mo51139b();
        if (mo51139b == -1) {
            mo51139b = ly7.mo51165h(abstractC17544k);
            abstractC17544k.mo51140a(mo51139b);
        }
        return m51070v0 + mo51139b;
    }

    /* renamed from: H */
    public static int m51114H(int i, AbstractC43604jv9 abstractC43604jv9) {
        int m51070v0 = m51070v0(i);
        int size = abstractC43604jv9.size();
        return m51070v0 + m51066x0(size) + size;
    }

    /* renamed from: I */
    public static int m51113I(int i, boolean z) {
        return m51070v0(i) + 1;
    }

    /* renamed from: J */
    public static int m51112J(InterfaceC52815zT7 interfaceC52815zT7) {
        int mo1329g = interfaceC52815zT7.mo1329g();
        return m51066x0(mo1329g) + mo1329g;
    }

    /* renamed from: K */
    public static int m51111K(boolean z) {
        return 1;
    }

    /* renamed from: L */
    public static int m51110L(byte[] bArr) {
        int length = bArr.length;
        return m51066x0(length) + length;
    }

    /* renamed from: R */
    public static int m51107R(float f) {
        return 4;
    }

    /* renamed from: S */
    public static int m51106S(int i, long j) {
        return m51070v0(i) + m51099b0(j);
    }

    /* renamed from: T */
    public static int m51105T(int i, AbstractC43604jv9 abstractC43604jv9) {
        return (m51070v0(1) << 1) + m51090g0(2, i) + m51114H(3, abstractC43604jv9);
    }

    @Deprecated
    /* renamed from: U */
    public static int m51104U(InterfaceC52815zT7 interfaceC52815zT7) {
        return interfaceC52815zT7.mo1329g();
    }

    /* renamed from: X */
    public static int m51103X(int i, long j) {
        return m51070v0(i) + m51099b0(j);
    }

    /* renamed from: Y */
    public static int m51102Y(long j) {
        return m51099b0(j);
    }

    /* renamed from: a0 */
    public static int m51100a0(int i, long j) {
        return m51070v0(i) + m51099b0(m51080o0(j));
    }

    /* renamed from: b0 */
    public static int m51099b0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: d */
    public static int m51097d(int i, C40301eM7 c40301eM7) {
        int m51070v0 = m51070v0(i);
        int m42997a = c40301eM7.m42997a();
        return m51070v0 + m51066x0(m42997a) + m42997a;
    }

    /* renamed from: d0 */
    public static int m51096d0(int i, int i2) {
        return m51070v0(i) + m51068w0(i2);
    }

    /* renamed from: e */
    public static int m51095e(C40301eM7 c40301eM7) {
        int m42997a = c40301eM7.m42997a();
        return m51066x0(m42997a) + m42997a;
    }

    /* renamed from: e0 */
    public static int m51094e0(int i, long j) {
        return m51070v0(i) + 8;
    }

    /* renamed from: f */
    public static int m51093f(InterfaceC52815zT7 interfaceC52815zT7, LY7 ly7) {
        AbstractC17544k abstractC17544k = (AbstractC17544k) interfaceC52815zT7;
        int mo51139b = abstractC17544k.mo51139b();
        if (mo51139b == -1) {
            mo51139b = ly7.mo51165h(abstractC17544k);
            abstractC17544k.mo51140a(mo51139b);
        }
        return m51066x0(mo51139b) + mo51139b;
    }

    /* renamed from: f0 */
    public static int m51092f0(long j) {
        return m51099b0(m51080o0(j));
    }

    /* renamed from: g0 */
    public static int m51090g0(int i, int i2) {
        return m51070v0(i) + m51066x0(i2);
    }

    /* renamed from: h0 */
    public static int m51088h0(int i, long j) {
        return m51070v0(i) + 8;
    }

    /* renamed from: i0 */
    public static int m51086i0(long j) {
        return 8;
    }

    /* renamed from: j0 */
    public static int m51085j0(int i, int i2) {
        return m51070v0(i) + m51066x0(m51118C0(i2));
    }

    /* renamed from: k0 */
    public static int m51084k0(long j) {
        return 8;
    }

    /* renamed from: m0 */
    public static int m51083m0(int i, int i2) {
        return m51070v0(i) + 4;
    }

    /* renamed from: n0 */
    public static int m51082n0(String str) {
        int length;
        try {
            length = U68.m81961c(str);
        } catch (C40174e88 unused) {
            length = str.getBytes(C44389lF7.f95796a).length;
        }
        return m51066x0(length) + length;
    }

    /* renamed from: o0 */
    public static long m51080o0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: p0 */
    public static int m51079p0(int i, int i2) {
        return m51070v0(i) + 4;
    }

    /* renamed from: q */
    public static int m51078q(double d) {
        return 8;
    }

    /* renamed from: q0 */
    public static int m51077q0(int i, int i2) {
        return m51070v0(i) + m51068w0(i2);
    }

    /* renamed from: r */
    public static int m51076r(int i, double d) {
        return m51070v0(i) + 8;
    }

    /* renamed from: s */
    public static int m51075s(int i, float f) {
        return m51070v0(i) + 4;
    }

    /* renamed from: t */
    public static int m51074t(int i, String str) {
        return m51070v0(i) + m51082n0(str);
    }

    /* renamed from: u */
    public static int m51072u(int i, C40301eM7 c40301eM7) {
        return (m51070v0(1) << 1) + m51090g0(2, i) + m51097d(3, c40301eM7);
    }

    /* renamed from: v */
    public static int m51071v(int i, InterfaceC52815zT7 interfaceC52815zT7) {
        return (m51070v0(1) << 1) + m51090g0(2, i) + m51070v0(3) + m51112J(interfaceC52815zT7);
    }

    /* renamed from: v0 */
    public static int m51070v0(int i) {
        return m51066x0(i << 3);
    }

    /* renamed from: w */
    public static int m51069w(int i, InterfaceC52815zT7 interfaceC52815zT7, LY7 ly7) {
        return m51070v0(i) + m51093f(interfaceC52815zT7, ly7);
    }

    /* renamed from: w0 */
    public static int m51068w0(int i) {
        if (i >= 0) {
            return m51066x0(i);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m51067x(AbstractC43604jv9 abstractC43604jv9) {
        int size = abstractC43604jv9.size();
        return m51066x0(size) + size;
    }

    /* renamed from: x0 */
    public static int m51066x0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: y */
    public static zzaj m51065y(byte[] bArr) {
        return new C17546a(bArr, 0, bArr.length);
    }

    /* renamed from: y0 */
    public static int m51064y0(int i) {
        return m51066x0(m51118C0(i));
    }

    /* renamed from: z0 */
    public static int m51063z0(int i) {
        return 4;
    }

    /* renamed from: A */
    public final void m51121A(int i, long j) throws IOException {
        mo51049j(i, m51080o0(j));
    }

    /* renamed from: B */
    public abstract void mo51062B(int i, AbstractC43604jv9 abstractC43604jv9) throws IOException;

    /* renamed from: C */
    public abstract void mo51061C(int i, boolean z) throws IOException;

    /* renamed from: D */
    public abstract void mo51060D(long j) throws IOException;

    /* renamed from: E */
    public abstract void mo51059E(InterfaceC52815zT7 interfaceC52815zT7) throws IOException;

    /* renamed from: F */
    public final void m51116F(boolean z) throws IOException {
        mo51057M(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: M */
    public abstract void mo51057M(byte b) throws IOException;

    /* renamed from: N */
    public final void m51109N(float f) throws IOException {
        mo51040u0(Float.floatToRawIntBits(f));
    }

    /* renamed from: O */
    public abstract void mo51056O(int i, int i2) throws IOException;

    /* renamed from: P */
    public abstract void mo51055P(int i, long j) throws IOException;

    /* renamed from: Q */
    public final void m51108Q(long j) throws IOException {
        mo51060D(m51080o0(j));
    }

    /* renamed from: V */
    public abstract void mo51054V(int i, int i2) throws IOException;

    /* renamed from: W */
    public abstract void mo51053W(long j) throws IOException;

    /* renamed from: Z */
    public final void m51101Z(int i, int i2) throws IOException {
        mo51054V(i, m51118C0(i2));
    }

    /* renamed from: b */
    public abstract int mo51051b();

    /* renamed from: c0 */
    public abstract void mo51050c0(int i, int i2) throws IOException;

    /* renamed from: g */
    public final void m51091g(double d) throws IOException {
        mo51053W(Double.doubleToRawLongBits(d));
    }

    /* renamed from: h */
    public final void m51089h(int i, double d) throws IOException {
        mo51055P(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void m51087i(int i, float f) throws IOException {
        mo51050c0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: j */
    public abstract void mo51049j(int i, long j) throws IOException;

    /* renamed from: k */
    public abstract void mo51048k(int i, String str) throws IOException;

    /* renamed from: l */
    public abstract void mo51047l(int i, InterfaceC52815zT7 interfaceC52815zT7) throws IOException;

    /* renamed from: l0 */
    public abstract void mo51046l0(String str) throws IOException;

    /* renamed from: m */
    public abstract void mo51045m(int i, InterfaceC52815zT7 interfaceC52815zT7, LY7 ly7) throws IOException;

    /* renamed from: n */
    public abstract void mo51044n(int i, AbstractC43604jv9 abstractC43604jv9) throws IOException;

    /* renamed from: o */
    public final void m51081o(String str, C40174e88 c40174e88) throws IOException {
        f71191b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c40174e88);
        byte[] bytes = str.getBytes(C44389lF7.f95796a);
        try {
            mo51041s0(bytes.length);
            mo51052a(bytes, 0, bytes.length);
        } catch (zzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzc(e2);
        }
    }

    /* renamed from: p */
    public abstract void mo51043p(AbstractC43604jv9 abstractC43604jv9) throws IOException;

    /* renamed from: r0 */
    public abstract void mo51042r0(int i) throws IOException;

    /* renamed from: s0 */
    public abstract void mo51041s0(int i) throws IOException;

    /* renamed from: t0 */
    public final void m51073t0(int i) throws IOException {
        mo51041s0(m51118C0(i));
    }

    /* renamed from: u0 */
    public abstract void mo51040u0(int i) throws IOException;

    /* renamed from: z */
    public abstract void mo51039z(int i, int i2) throws IOException;
}
