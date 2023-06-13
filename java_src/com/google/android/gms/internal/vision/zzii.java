package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes6.dex */
public abstract class zzii extends AbstractC35572Qx8 {

    /* renamed from: b */
    public static final Logger f71339b = Logger.getLogger(zzii.class.getName());

    /* renamed from: c */
    public static final boolean f71340c = SZ8.m85251m();

    /* renamed from: a */
    public C46151oD8 f71341a;

    /* renamed from: com.google.android.gms.internal.vision.zzii$a */
    /* loaded from: classes6.dex */
    public static class C17613a extends zzii {

        /* renamed from: d */
        public final byte[] f71342d;

        /* renamed from: e */
        public final int f71343e;

        /* renamed from: f */
        public final int f71344f;

        /* renamed from: g */
        public int f71345g;

        public C17613a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                    this.f71342d = bArr;
                    this.f71343e = 0;
                    this.f71345g = 0;
                    this.f71344f = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: F0 */
        public final void m50788F0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f71342d, this.f71345g, i2);
                this.f71345g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71345g), Integer.valueOf(this.f71344f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: O */
        public final void mo50787O(int i) throws IOException {
            if (zzii.f71340c && !C36256Tv8.m82238b() && mo50780b() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.f71342d;
                    int i2 = this.f71345g;
                    this.f71345g = i2 + 1;
                    SZ8.m85252l(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.f71342d;
                int i3 = this.f71345g;
                this.f71345g = i3 + 1;
                SZ8.m85252l(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.f71342d;
                    int i5 = this.f71345g;
                    this.f71345g = i5 + 1;
                    SZ8.m85252l(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.f71342d;
                int i6 = this.f71345g;
                this.f71345g = i6 + 1;
                SZ8.m85252l(bArr4, i6, (byte) (i4 | 128));
                int i7 = i4 >>> 7;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.f71342d;
                    int i8 = this.f71345g;
                    this.f71345g = i8 + 1;
                    SZ8.m85252l(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f71342d;
                int i9 = this.f71345g;
                this.f71345g = i9 + 1;
                SZ8.m85252l(bArr6, i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.f71342d;
                    int i11 = this.f71345g;
                    this.f71345g = i11 + 1;
                    SZ8.m85252l(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f71342d;
                int i12 = this.f71345g;
                this.f71345g = i12 + 1;
                SZ8.m85252l(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.f71342d;
                int i13 = this.f71345g;
                this.f71345g = i13 + 1;
                SZ8.m85252l(bArr9, i13, (byte) (i10 >>> 7));
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f71342d;
                    int i14 = this.f71345g;
                    this.f71345g = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71345g), Integer.valueOf(this.f71344f), 1), e);
                }
            }
            byte[] bArr11 = this.f71342d;
            int i15 = this.f71345g;
            this.f71345g = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: P */
        public final void mo50786P(int i, int i2) throws IOException {
            mo50775m(i, 0);
            mo50777j(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: R */
        public final void mo50785R(int i, AbstractC53119zy8 abstractC53119zy8) throws IOException {
            mo50775m(1, 3);
            mo50784X(2, i);
            mo50772p(3, abstractC53119zy8);
            mo50775m(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: X */
        public final void mo50784X(int i, int i2) throws IOException {
            mo50775m(i, 0);
            mo50787O(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: Y */
        public final void mo50783Y(int i, long j) throws IOException {
            mo50775m(i, 1);
            mo50782Z(j);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: Z */
        public final void mo50782Z(long j) throws IOException {
            try {
                byte[] bArr = this.f71342d;
                int i = this.f71345g;
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
                this.f71345g = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71345g), Integer.valueOf(this.f71344f), 1), e);
            }
        }

        @Override // p000.AbstractC35572Qx8
        /* renamed from: a */
        public final void mo50781a(byte[] bArr, int i, int i2) throws IOException {
            m50788F0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: b */
        public final int mo50780b() {
            return this.f71344f - this.f71345g;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: e0 */
        public final void mo50779e0(int i) throws IOException {
            try {
                byte[] bArr = this.f71342d;
                int i2 = this.f71345g;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.f71345g = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71345g), Integer.valueOf(this.f71344f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: g */
        public final void mo50778g(byte b) throws IOException {
            try {
                byte[] bArr = this.f71342d;
                int i = this.f71345g;
                this.f71345g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71345g), Integer.valueOf(this.f71344f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: j */
        public final void mo50777j(int i) throws IOException {
            if (i >= 0) {
                mo50787O(i);
            } else {
                mo50768t(i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: j0 */
        public final void mo50776j0(int i, int i2) throws IOException {
            mo50775m(i, 5);
            mo50779e0(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: m */
        public final void mo50775m(int i, int i2) throws IOException {
            mo50787O((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: n */
        public final void mo50774n(int i, long j) throws IOException {
            mo50775m(i, 0);
            mo50768t(j);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: o */
        public final void mo50773o(int i, String str) throws IOException {
            mo50775m(i, 2);
            mo50767u(str);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: p */
        public final void mo50772p(int i, AbstractC53119zy8 abstractC53119zy8) throws IOException {
            mo50775m(i, 2);
            mo50766w(abstractC53119zy8);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: q */
        public final void mo50771q(int i, InterfaceC44489lQ8 interfaceC44489lQ8) throws IOException {
            mo50775m(1, 3);
            mo50784X(2, i);
            mo50775m(3, 2);
            mo50765x(interfaceC44489lQ8);
            mo50775m(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: r */
        public final void mo50770r(int i, InterfaceC44489lQ8 interfaceC44489lQ8, InterfaceC52825zU8 interfaceC52825zU8) throws IOException {
            mo50775m(i, 2);
            AbstractC17549C abstractC17549C = (AbstractC17549C) interfaceC44489lQ8;
            int mo50993i = abstractC17549C.mo50993i();
            if (mo50993i == -1) {
                mo50993i = interfaceC52825zU8.zzb(abstractC17549C);
                abstractC17549C.mo50994f(mo50993i);
            }
            mo50787O(mo50993i);
            interfaceC52825zU8.mo1313b(interfaceC44489lQ8, this.f71341a);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: s */
        public final void mo50769s(int i, boolean z) throws IOException {
            mo50775m(i, 0);
            mo50778g(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: t */
        public final void mo50768t(long j) throws IOException {
            if (zzii.f71340c && mo50780b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f71342d;
                    int i = this.f71345g;
                    this.f71345g = i + 1;
                    SZ8.m85252l(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f71342d;
                int i2 = this.f71345g;
                this.f71345g = i2 + 1;
                SZ8.m85252l(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f71342d;
                    int i3 = this.f71345g;
                    this.f71345g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f71345g), Integer.valueOf(this.f71344f), 1), e);
                }
            }
            byte[] bArr4 = this.f71342d;
            int i4 = this.f71345g;
            this.f71345g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: u */
        public final void mo50767u(String str) throws IOException {
            int i = this.f71345g;
            try {
                int m50803o0 = zzii.m50803o0(str.length() * 3);
                int m50803o02 = zzii.m50803o0(str.length());
                if (m50803o02 == m50803o0) {
                    int i2 = i + m50803o02;
                    this.f71345g = i2;
                    int m11099e = C49582u09.m11099e(str, this.f71342d, i2, mo50780b());
                    this.f71345g = i;
                    mo50787O((m11099e - i) - m50803o02);
                    this.f71345g = m11099e;
                    return;
                }
                mo50787O(C49582u09.m11100d(str));
                this.f71345g = C49582u09.m11099e(str, this.f71342d, this.f71345g, mo50780b());
            } catch (X09 e) {
                this.f71345g = i;
                m50796v(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: w */
        public final void mo50766w(AbstractC53119zy8 abstractC53119zy8) throws IOException {
            mo50787O(abstractC53119zy8.mo44b());
            abstractC53119zy8.mo36u(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: x */
        public final void mo50765x(InterfaceC44489lQ8 interfaceC44489lQ8) throws IOException {
            mo50787O(interfaceC44489lQ8.mo27298b());
            interfaceC44489lQ8.mo27296e(this);
        }
    }

    /* loaded from: classes6.dex */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public zzb(String str, Throwable th) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
            String valueOf = String.valueOf(str);
        }
    }

    private zzii() {
    }

    /* renamed from: A */
    public static int m50848A(float f) {
        return 4;
    }

    /* renamed from: A0 */
    public static int m50847A0(int i, int i2) {
        return m50803o0(i << 3) + 4;
    }

    /* renamed from: B */
    public static int m50846B(int i, double d) {
        return m50803o0(i << 3) + 8;
    }

    /* renamed from: B0 */
    public static int m50845B0(int i) {
        return m50808k0(i);
    }

    /* renamed from: C */
    public static int m50844C(int i, float f) {
        return m50803o0(i << 3) + 4;
    }

    /* renamed from: C0 */
    public static int m50843C0(int i, int i2) {
        return m50803o0(i << 3) + m50808k0(i2);
    }

    /* renamed from: D */
    public static int m50842D(int i, String str) {
        return m50803o0(i << 3) + m50835I(str);
    }

    @Deprecated
    /* renamed from: D0 */
    public static int m50841D0(int i) {
        return m50803o0(i);
    }

    /* renamed from: E */
    public static int m50840E(int i, IL8 il8) {
        return (m50803o0(8) << 1) + m50802p0(2, i) + m50821c(3, il8);
    }

    /* renamed from: E0 */
    public static int m50839E0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: F */
    public static int m50838F(int i, InterfaceC44489lQ8 interfaceC44489lQ8) {
        return (m50803o0(8) << 1) + m50802p0(2, i) + m50803o0(24) + m50833K(interfaceC44489lQ8);
    }

    /* renamed from: G */
    public static int m50837G(int i, InterfaceC44489lQ8 interfaceC44489lQ8, InterfaceC52825zU8 interfaceC52825zU8) {
        return m50803o0(i << 3) + m50817e(interfaceC44489lQ8, interfaceC52825zU8);
    }

    /* renamed from: H */
    public static int m50836H(int i, boolean z) {
        return m50803o0(i << 3) + 1;
    }

    /* renamed from: I */
    public static int m50835I(String str) {
        int length;
        try {
            length = C49582u09.m11100d(str);
        } catch (X09 unused) {
            length = str.getBytes(C52124yI8.f119325a).length;
        }
        return m50803o0(length) + length;
    }

    /* renamed from: J */
    public static int m50834J(AbstractC53119zy8 abstractC53119zy8) {
        int mo44b = abstractC53119zy8.mo44b();
        return m50803o0(mo44b) + mo44b;
    }

    /* renamed from: K */
    public static int m50833K(InterfaceC44489lQ8 interfaceC44489lQ8) {
        int mo27298b = interfaceC44489lQ8.mo27298b();
        return m50803o0(mo27298b) + mo27298b;
    }

    /* renamed from: L */
    public static int m50832L(boolean z) {
        return 1;
    }

    /* renamed from: M */
    public static int m50831M(byte[] bArr) {
        int length = bArr.length;
        return m50803o0(length) + length;
    }

    /* renamed from: T */
    public static int m50827T(int i, AbstractC53119zy8 abstractC53119zy8) {
        int m50803o0 = m50803o0(i << 3);
        int mo44b = abstractC53119zy8.mo44b();
        return m50803o0 + m50803o0(mo44b) + mo44b;
    }

    @Deprecated
    /* renamed from: U */
    public static int m50826U(int i, InterfaceC44489lQ8 interfaceC44489lQ8, InterfaceC52825zU8 interfaceC52825zU8) {
        int m50803o0 = m50803o0(i << 3) << 1;
        AbstractC17549C abstractC17549C = (AbstractC17549C) interfaceC44489lQ8;
        int mo50993i = abstractC17549C.mo50993i();
        if (mo50993i == -1) {
            mo50993i = interfaceC52825zU8.zzb(abstractC17549C);
            abstractC17549C.mo50994f(mo50993i);
        }
        return m50803o0 + mo50993i;
    }

    @Deprecated
    /* renamed from: V */
    public static int m50825V(InterfaceC44489lQ8 interfaceC44489lQ8) {
        return interfaceC44489lQ8.mo27298b();
    }

    /* renamed from: b0 */
    public static int m50822b0(int i, long j) {
        return m50803o0(i << 3) + m50810i0(j);
    }

    /* renamed from: c */
    public static int m50821c(int i, IL8 il8) {
        int m50803o0 = m50803o0(i << 3);
        int m102464b = il8.m102464b();
        return m50803o0 + m50803o0(m102464b) + m102464b;
    }

    /* renamed from: c0 */
    public static int m50820c0(int i, AbstractC53119zy8 abstractC53119zy8) {
        return (m50803o0(8) << 1) + m50802p0(2, i) + m50827T(3, abstractC53119zy8);
    }

    /* renamed from: d */
    public static int m50819d(IL8 il8) {
        int m102464b = il8.m102464b();
        return m50803o0(m102464b) + m102464b;
    }

    /* renamed from: d0 */
    public static int m50818d0(long j) {
        return m50810i0(j);
    }

    /* renamed from: e */
    public static int m50817e(InterfaceC44489lQ8 interfaceC44489lQ8, InterfaceC52825zU8 interfaceC52825zU8) {
        AbstractC17549C abstractC17549C = (AbstractC17549C) interfaceC44489lQ8;
        int mo50993i = abstractC17549C.mo50993i();
        if (mo50993i == -1) {
            mo50993i = interfaceC52825zU8.zzb(abstractC17549C);
            abstractC17549C.mo50994f(mo50993i);
        }
        return m50803o0(mo50993i) + mo50993i;
    }

    /* renamed from: f */
    public static zzii m50816f(byte[] bArr) {
        return new C17613a(bArr, 0, bArr.length);
    }

    /* renamed from: g0 */
    public static int m50814g0(int i) {
        return m50803o0(i << 3);
    }

    /* renamed from: h0 */
    public static int m50812h0(int i, long j) {
        return m50803o0(i << 3) + m50810i0(j);
    }

    /* renamed from: i0 */
    public static int m50810i0(long j) {
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

    /* renamed from: k0 */
    public static int m50808k0(int i) {
        if (i >= 0) {
            return m50803o0(i);
        }
        return 10;
    }

    /* renamed from: l0 */
    public static int m50806l0(int i, int i2) {
        return m50803o0(i << 3) + m50808k0(i2);
    }

    /* renamed from: m0 */
    public static int m50805m0(int i, long j) {
        return m50803o0(i << 3) + m50810i0(m50791y0(j));
    }

    /* renamed from: n0 */
    public static int m50804n0(long j) {
        return m50810i0(m50791y0(j));
    }

    /* renamed from: o0 */
    public static int m50803o0(int i) {
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

    /* renamed from: p0 */
    public static int m50802p0(int i, int i2) {
        return m50803o0(i << 3) + m50803o0(i2);
    }

    /* renamed from: q0 */
    public static int m50801q0(int i, long j) {
        return m50803o0(i << 3) + 8;
    }

    /* renamed from: r0 */
    public static int m50800r0(long j) {
        return 8;
    }

    /* renamed from: s0 */
    public static int m50799s0(int i) {
        return m50803o0(m50839E0(i));
    }

    /* renamed from: t0 */
    public static int m50798t0(int i, int i2) {
        return m50803o0(i << 3) + m50803o0(m50839E0(i2));
    }

    /* renamed from: u0 */
    public static int m50797u0(int i, long j) {
        return m50803o0(i << 3) + 8;
    }

    /* renamed from: v0 */
    public static int m50795v0(long j) {
        return 8;
    }

    /* renamed from: w0 */
    public static int m50794w0(int i) {
        return 4;
    }

    /* renamed from: x0 */
    public static int m50793x0(int i, int i2) {
        return m50803o0(i << 3) + 4;
    }

    /* renamed from: y0 */
    public static long m50791y0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: z */
    public static int m50790z(double d) {
        return 8;
    }

    /* renamed from: z0 */
    public static int m50789z0(int i) {
        return 4;
    }

    /* renamed from: N */
    public final void m50830N() {
        if (mo50780b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: O */
    public abstract void mo50787O(int i) throws IOException;

    /* renamed from: P */
    public abstract void mo50786P(int i, int i2) throws IOException;

    /* renamed from: Q */
    public final void m50829Q(int i, long j) throws IOException {
        mo50774n(i, m50791y0(j));
    }

    /* renamed from: R */
    public abstract void mo50785R(int i, AbstractC53119zy8 abstractC53119zy8) throws IOException;

    /* renamed from: S */
    public final void m50828S(long j) throws IOException {
        mo50768t(m50791y0(j));
    }

    /* renamed from: W */
    public final void m50824W(int i) throws IOException {
        mo50787O(m50839E0(i));
    }

    /* renamed from: X */
    public abstract void mo50784X(int i, int i2) throws IOException;

    /* renamed from: Y */
    public abstract void mo50783Y(int i, long j) throws IOException;

    /* renamed from: Z */
    public abstract void mo50782Z(long j) throws IOException;

    /* renamed from: b */
    public abstract int mo50780b();

    /* renamed from: e0 */
    public abstract void mo50779e0(int i) throws IOException;

    /* renamed from: f0 */
    public final void m50815f0(int i, int i2) throws IOException {
        mo50784X(i, m50839E0(i2));
    }

    /* renamed from: g */
    public abstract void mo50778g(byte b) throws IOException;

    /* renamed from: h */
    public final void m50813h(double d) throws IOException {
        mo50782Z(Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void m50811i(float f) throws IOException {
        mo50779e0(Float.floatToRawIntBits(f));
    }

    /* renamed from: j */
    public abstract void mo50777j(int i) throws IOException;

    /* renamed from: j0 */
    public abstract void mo50776j0(int i, int i2) throws IOException;

    /* renamed from: k */
    public final void m50809k(int i, double d) throws IOException {
        mo50783Y(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: l */
    public final void m50807l(int i, float f) throws IOException {
        mo50776j0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: m */
    public abstract void mo50775m(int i, int i2) throws IOException;

    /* renamed from: n */
    public abstract void mo50774n(int i, long j) throws IOException;

    /* renamed from: o */
    public abstract void mo50773o(int i, String str) throws IOException;

    /* renamed from: p */
    public abstract void mo50772p(int i, AbstractC53119zy8 abstractC53119zy8) throws IOException;

    /* renamed from: q */
    public abstract void mo50771q(int i, InterfaceC44489lQ8 interfaceC44489lQ8) throws IOException;

    /* renamed from: r */
    public abstract void mo50770r(int i, InterfaceC44489lQ8 interfaceC44489lQ8, InterfaceC52825zU8 interfaceC52825zU8) throws IOException;

    /* renamed from: s */
    public abstract void mo50769s(int i, boolean z) throws IOException;

    /* renamed from: t */
    public abstract void mo50768t(long j) throws IOException;

    /* renamed from: u */
    public abstract void mo50767u(String str) throws IOException;

    /* renamed from: v */
    public final void m50796v(String str, X09 x09) throws IOException {
        f71339b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) x09);
        byte[] bytes = str.getBytes(C52124yI8.f119325a);
        try {
            mo50787O(bytes.length);
            mo50781a(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    /* renamed from: w */
    public abstract void mo50766w(AbstractC53119zy8 abstractC53119zy8) throws IOException;

    /* renamed from: x */
    public abstract void mo50765x(InterfaceC44489lQ8 interfaceC44489lQ8) throws IOException;

    /* renamed from: y */
    public final void m50792y(boolean z) throws IOException {
        mo50778g(z ? (byte) 1 : (byte) 0);
    }
}
