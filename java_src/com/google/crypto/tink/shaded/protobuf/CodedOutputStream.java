package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18172T;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
/* loaded from: classes6.dex */
public abstract class CodedOutputStream extends J70 {

    /* renamed from: c */
    public static final Logger f74017c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f74018d = C52917ze6.m930E();

    /* renamed from: a */
    public C18215j f74019a;

    /* renamed from: b */
    public boolean f74020b;

    /* loaded from: classes6.dex */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStream$b */
    /* loaded from: classes6.dex */
    public static class C18146b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f74021e;

        /* renamed from: f */
        public final int f74022f;

        /* renamed from: g */
        public final int f74023g;

        /* renamed from: h */
        public int f74024h;

        public C18146b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f74021e = bArr;
                    this.f74022f = i;
                    this.f74024h = i;
                    this.f74023g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public final void mo48122A0(int i, InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) throws IOException {
            mo48118M0(i, 2);
            mo48116O0(((AbstractC18188a) interfaceC18149F).m47798b(interfaceC18157M));
            interfaceC18157M.mo47985j(interfaceC18149F, this.f74019a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public final void mo48121B0(int i, InterfaceC18149F interfaceC18149F) throws IOException {
            mo48118M0(1, 3);
            mo48117N0(2, i);
            m48111T0(3, interfaceC18149F);
            mo48118M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: C0 */
        public final void mo48120C0(int i, AbstractC18199g abstractC18199g) throws IOException {
            mo48118M0(1, 3);
            mo48117N0(2, i);
            mo48104j0(3, abstractC18199g);
            mo48118M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public final void mo48119L0(int i, String str) throws IOException {
            mo48118M0(i, 2);
            m48109V0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public final void mo48118M0(int i, int i2) throws IOException {
            mo48116O0(C18178U.m47801c(i, i2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: N0 */
        public final void mo48117N0(int i, int i2) throws IOException {
            mo48118M0(i, 0);
            mo48116O0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: O0 */
        public final void mo48116O0(int i) throws IOException {
            if (CodedOutputStream.f74018d && !C23288ib.m33779c() && mo48107f0() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.f74021e;
                    int i2 = this.f74024h;
                    this.f74024h = i2 + 1;
                    C52917ze6.m924K(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.f74021e;
                int i3 = this.f74024h;
                this.f74024h = i3 + 1;
                C52917ze6.m924K(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.f74021e;
                    int i5 = this.f74024h;
                    this.f74024h = i5 + 1;
                    C52917ze6.m924K(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.f74021e;
                int i6 = this.f74024h;
                this.f74024h = i6 + 1;
                C52917ze6.m924K(bArr4, i6, (byte) (i4 | 128));
                int i7 = i4 >>> 7;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.f74021e;
                    int i8 = this.f74024h;
                    this.f74024h = i8 + 1;
                    C52917ze6.m924K(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f74021e;
                int i9 = this.f74024h;
                this.f74024h = i9 + 1;
                C52917ze6.m924K(bArr6, i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.f74021e;
                    int i11 = this.f74024h;
                    this.f74024h = i11 + 1;
                    C52917ze6.m924K(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f74021e;
                int i12 = this.f74024h;
                this.f74024h = i12 + 1;
                C52917ze6.m924K(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.f74021e;
                int i13 = this.f74024h;
                this.f74024h = i13 + 1;
                C52917ze6.m924K(bArr9, i13, (byte) (i10 >>> 7));
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f74021e;
                    int i14 = this.f74024h;
                    this.f74024h = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74024h), Integer.valueOf(this.f74023g), 1), e);
                }
            }
            byte[] bArr11 = this.f74021e;
            int i15 = this.f74024h;
            this.f74024h = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: P0 */
        public final void mo48115P0(int i, long j) throws IOException {
            mo48118M0(i, 0);
            mo48114Q0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: Q0 */
        public final void mo48114Q0(long j) throws IOException {
            if (CodedOutputStream.f74018d && mo48107f0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f74021e;
                    int i = this.f74024h;
                    this.f74024h = i + 1;
                    C52917ze6.m924K(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f74021e;
                int i2 = this.f74024h;
                this.f74024h = i2 + 1;
                C52917ze6.m924K(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f74021e;
                    int i3 = this.f74024h;
                    this.f74024h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74024h), Integer.valueOf(this.f74023g), 1), e);
                }
            }
            byte[] bArr4 = this.f74021e;
            int i4 = this.f74024h;
            this.f74024h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        /* renamed from: R0 */
        public final void m48113R0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f74021e, this.f74024h, i2);
                this.f74024h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74024h), Integer.valueOf(this.f74023g), Integer.valueOf(i2)), e);
            }
        }

        /* renamed from: S0 */
        public final void m48112S0(AbstractC18199g abstractC18199g) throws IOException {
            mo48116O0(abstractC18199g.size());
            abstractC18199g.mo47687L(this);
        }

        /* renamed from: T0 */
        public final void m48111T0(int i, InterfaceC18149F interfaceC18149F) throws IOException {
            mo48118M0(i, 2);
            m48110U0(interfaceC18149F);
        }

        /* renamed from: U0 */
        public final void m48110U0(InterfaceC18149F interfaceC18149F) throws IOException {
            mo48116O0(interfaceC18149F.getSerializedSize());
            interfaceC18149F.mo47475f(this);
        }

        /* renamed from: V0 */
        public final void m48109V0(String str) throws IOException {
            int i = this.f74024h;
            try {
                int m48167W = CodedOutputStream.m48167W(str.length() * 3);
                int m48167W2 = CodedOutputStream.m48167W(str.length());
                if (m48167W2 == m48167W) {
                    int i2 = i + m48167W2;
                    this.f74024h = i2;
                    int m47840f = C18172T.m47840f(str, this.f74021e, i2, mo48107f0());
                    this.f74024h = i;
                    mo48116O0((m47840f - i) - m48167W2);
                    this.f74024h = m47840f;
                } else {
                    mo48116O0(C18172T.m47839g(str));
                    this.f74024h = C18172T.m47840f(str, this.f74021e, this.f74024h, mo48107f0());
                }
            } catch (C18172T.C18176d e) {
                this.f74024h = i;
                m48161b0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, p000.J70
        /* renamed from: a */
        public final void mo48108a(byte[] bArr, int i, int i2) throws IOException {
            m48113R0(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: f0 */
        public final int mo48107f0() {
            return this.f74023g - this.f74024h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: g0 */
        public final void mo48106g0(byte b) throws IOException {
            try {
                byte[] bArr = this.f74021e;
                int i = this.f74024h;
                this.f74024h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74024h), Integer.valueOf(this.f74023g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: h0 */
        public final void mo48105h0(int i, boolean z) throws IOException {
            mo48118M0(i, 0);
            mo48106g0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: j0 */
        public final void mo48104j0(int i, AbstractC18199g abstractC18199g) throws IOException {
            mo48118M0(i, 2);
            m48112S0(abstractC18199g);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: o0 */
        public final void mo48103o0(int i, int i2) throws IOException {
            mo48118M0(i, 5);
            mo48102p0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: p0 */
        public final void mo48102p0(int i) throws IOException {
            try {
                byte[] bArr = this.f74021e;
                int i2 = this.f74024h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f74024h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74024h), Integer.valueOf(this.f74023g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: q0 */
        public final void mo48101q0(int i, long j) throws IOException {
            mo48118M0(i, 1);
            mo48100r0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: r0 */
        public final void mo48100r0(long j) throws IOException {
            try {
                byte[] bArr = this.f74021e;
                int i = this.f74024h;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f74024h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74024h), Integer.valueOf(this.f74023g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: w0 */
        public final void mo48099w0(int i, int i2) throws IOException {
            mo48118M0(i, 0);
            mo48098x0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        /* renamed from: x0 */
        public final void mo48098x0(int i) throws IOException {
            if (i >= 0) {
                mo48116O0(i);
            } else {
                mo48114Q0(i);
            }
        }
    }

    /* renamed from: A */
    public static int m48197A(int i, C18252x c18252x) {
        return m48169U(i) + m48196B(c18252x);
    }

    /* renamed from: B */
    public static int m48196B(C18252x c18252x) {
        return m48195C(c18252x.m47407b());
    }

    /* renamed from: C */
    public static int m48195C(int i) {
        return m48167W(i) + i;
    }

    /* renamed from: D */
    public static int m48194D(int i, InterfaceC18149F interfaceC18149F) {
        return (m48169U(1) * 2) + m48168V(2, i) + m48192E(3, interfaceC18149F);
    }

    /* renamed from: E */
    public static int m48192E(int i, InterfaceC18149F interfaceC18149F) {
        return m48169U(i) + m48188G(interfaceC18149F);
    }

    /* renamed from: F */
    public static int m48190F(int i, InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) {
        return m48169U(i) + m48186H(interfaceC18149F, interfaceC18157M);
    }

    /* renamed from: G */
    public static int m48188G(InterfaceC18149F interfaceC18149F) {
        return m48195C(interfaceC18149F.getSerializedSize());
    }

    /* renamed from: H */
    public static int m48186H(InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) {
        return m48195C(((AbstractC18188a) interfaceC18149F).m47798b(interfaceC18157M));
    }

    /* renamed from: I */
    public static int m48184I(int i, AbstractC18199g abstractC18199g) {
        return (m48169U(1) * 2) + m48168V(2, i) + m48153g(3, abstractC18199g);
    }

    @Deprecated
    /* renamed from: J */
    public static int m48182J(int i) {
        return m48167W(i);
    }

    /* renamed from: K */
    public static int m48180K(int i, int i2) {
        return m48169U(i) + m48178L(i2);
    }

    /* renamed from: L */
    public static int m48178L(int i) {
        return 4;
    }

    /* renamed from: M */
    public static int m48177M(int i, long j) {
        return m48169U(i) + m48176N(j);
    }

    /* renamed from: N */
    public static int m48176N(long j) {
        return 8;
    }

    /* renamed from: O */
    public static int m48175O(int i, int i2) {
        return m48169U(i) + m48174P(i2);
    }

    /* renamed from: P */
    public static int m48174P(int i) {
        return m48167W(m48164Z(i));
    }

    /* renamed from: Q */
    public static int m48173Q(int i, long j) {
        return m48169U(i) + m48172R(j);
    }

    /* renamed from: R */
    public static int m48172R(long j) {
        return m48165Y(m48163a0(j));
    }

    /* renamed from: S */
    public static int m48171S(int i, String str) {
        return m48169U(i) + m48170T(str);
    }

    /* renamed from: T */
    public static int m48170T(String str) {
        int length;
        try {
            length = C18172T.m47839g(str);
        } catch (C18172T.C18176d unused) {
            length = str.getBytes(C18238v.f74218b).length;
        }
        return m48195C(length);
    }

    /* renamed from: U */
    public static int m48169U(int i) {
        return m48167W(C18178U.m47801c(i, 0));
    }

    /* renamed from: V */
    public static int m48168V(int i, int i2) {
        return m48169U(i) + m48167W(i2);
    }

    /* renamed from: W */
    public static int m48167W(int i) {
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

    /* renamed from: X */
    public static int m48166X(int i, long j) {
        return m48169U(i) + m48165Y(j);
    }

    /* renamed from: Y */
    public static int m48165Y(long j) {
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

    /* renamed from: Z */
    public static int m48164Z(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a0 */
    public static long m48163a0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: d */
    public static int m48158d(int i, boolean z) {
        return m48169U(i) + m48156e(z);
    }

    /* renamed from: d0 */
    public static CodedOutputStream m48157d0(byte[] bArr) {
        return m48155e0(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m48156e(boolean z) {
        return 1;
    }

    /* renamed from: e0 */
    public static CodedOutputStream m48155e0(byte[] bArr, int i, int i2) {
        return new C18146b(bArr, i, i2);
    }

    /* renamed from: f */
    public static int m48154f(byte[] bArr) {
        return m48195C(bArr.length);
    }

    /* renamed from: g */
    public static int m48153g(int i, AbstractC18199g abstractC18199g) {
        return m48169U(i) + m48152h(abstractC18199g);
    }

    /* renamed from: h */
    public static int m48152h(AbstractC18199g abstractC18199g) {
        return m48195C(abstractC18199g.size());
    }

    /* renamed from: i */
    public static int m48151i(int i, double d) {
        return m48169U(i) + m48149j(d);
    }

    /* renamed from: j */
    public static int m48149j(double d) {
        return 8;
    }

    /* renamed from: k */
    public static int m48148k(int i, int i2) {
        return m48169U(i) + m48146l(i2);
    }

    /* renamed from: l */
    public static int m48146l(int i) {
        return m48128w(i);
    }

    /* renamed from: m */
    public static int m48144m(int i, int i2) {
        return m48169U(i) + m48142n(i2);
    }

    /* renamed from: n */
    public static int m48142n(int i) {
        return 4;
    }

    /* renamed from: o */
    public static int m48140o(int i, long j) {
        return m48169U(i) + m48139p(j);
    }

    /* renamed from: p */
    public static int m48139p(long j) {
        return 8;
    }

    /* renamed from: q */
    public static int m48138q(int i, float f) {
        return m48169U(i) + m48137r(f);
    }

    /* renamed from: r */
    public static int m48137r(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: s */
    public static int m48136s(int i, InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) {
        return (m48169U(i) * 2) + m48132u(interfaceC18149F, interfaceC18157M);
    }

    @Deprecated
    /* renamed from: t */
    public static int m48134t(InterfaceC18149F interfaceC18149F) {
        return interfaceC18149F.getSerializedSize();
    }

    @Deprecated
    /* renamed from: u */
    public static int m48132u(InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) {
        return ((AbstractC18188a) interfaceC18149F).m47798b(interfaceC18157M);
    }

    /* renamed from: v */
    public static int m48130v(int i, int i2) {
        return m48169U(i) + m48128w(i2);
    }

    /* renamed from: w */
    public static int m48128w(int i) {
        if (i >= 0) {
            return m48167W(i);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m48127x(int i, long j) {
        return m48169U(i) + m48126y(j);
    }

    /* renamed from: y */
    public static int m48126y(long j) {
        return m48165Y(j);
    }

    /* renamed from: z */
    public static int m48124z(int i, C18252x c18252x) {
        return (m48169U(1) * 2) + m48168V(2, i) + m48197A(3, c18252x);
    }

    /* renamed from: A0 */
    public abstract void mo48122A0(int i, InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) throws IOException;

    /* renamed from: B0 */
    public abstract void mo48121B0(int i, InterfaceC18149F interfaceC18149F) throws IOException;

    /* renamed from: C0 */
    public abstract void mo48120C0(int i, AbstractC18199g abstractC18199g) throws IOException;

    /* renamed from: D0 */
    public final void m48193D0(int i, int i2) throws IOException {
        mo48103o0(i, i2);
    }

    /* renamed from: E0 */
    public final void m48191E0(int i) throws IOException {
        mo48102p0(i);
    }

    /* renamed from: F0 */
    public final void m48189F0(int i, long j) throws IOException {
        mo48101q0(i, j);
    }

    /* renamed from: G0 */
    public final void m48187G0(long j) throws IOException {
        mo48100r0(j);
    }

    /* renamed from: H0 */
    public final void m48185H0(int i, int i2) throws IOException {
        mo48117N0(i, m48164Z(i2));
    }

    /* renamed from: I0 */
    public final void m48183I0(int i) throws IOException {
        mo48116O0(m48164Z(i));
    }

    /* renamed from: J0 */
    public final void m48181J0(int i, long j) throws IOException {
        mo48115P0(i, m48163a0(j));
    }

    /* renamed from: K0 */
    public final void m48179K0(long j) throws IOException {
        mo48114Q0(m48163a0(j));
    }

    /* renamed from: L0 */
    public abstract void mo48119L0(int i, String str) throws IOException;

    /* renamed from: M0 */
    public abstract void mo48118M0(int i, int i2) throws IOException;

    /* renamed from: N0 */
    public abstract void mo48117N0(int i, int i2) throws IOException;

    /* renamed from: O0 */
    public abstract void mo48116O0(int i) throws IOException;

    /* renamed from: P0 */
    public abstract void mo48115P0(int i, long j) throws IOException;

    /* renamed from: Q0 */
    public abstract void mo48114Q0(long j) throws IOException;

    @Override // p000.J70
    /* renamed from: a */
    public abstract void mo48108a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: b0 */
    public final void m48161b0(String str, C18172T.C18176d c18176d) throws IOException {
        f74017c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c18176d);
        byte[] bytes = str.getBytes(C18238v.f74218b);
        try {
            mo48116O0(bytes.length);
            mo48108a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    /* renamed from: c */
    public final void m48160c() {
        if (mo48107f0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: c0 */
    public boolean m48159c0() {
        return this.f74020b;
    }

    /* renamed from: f0 */
    public abstract int mo48107f0();

    /* renamed from: g0 */
    public abstract void mo48106g0(byte b) throws IOException;

    /* renamed from: h0 */
    public abstract void mo48105h0(int i, boolean z) throws IOException;

    /* renamed from: i0 */
    public final void m48150i0(boolean z) throws IOException {
        mo48106g0(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: j0 */
    public abstract void mo48104j0(int i, AbstractC18199g abstractC18199g) throws IOException;

    /* renamed from: k0 */
    public final void m48147k0(int i, double d) throws IOException {
        mo48101q0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: l0 */
    public final void m48145l0(double d) throws IOException {
        mo48100r0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: m0 */
    public final void m48143m0(int i, int i2) throws IOException {
        mo48099w0(i, i2);
    }

    /* renamed from: n0 */
    public final void m48141n0(int i) throws IOException {
        mo48098x0(i);
    }

    /* renamed from: o0 */
    public abstract void mo48103o0(int i, int i2) throws IOException;

    /* renamed from: p0 */
    public abstract void mo48102p0(int i) throws IOException;

    /* renamed from: q0 */
    public abstract void mo48101q0(int i, long j) throws IOException;

    /* renamed from: r0 */
    public abstract void mo48100r0(long j) throws IOException;

    /* renamed from: s0 */
    public final void m48135s0(int i, float f) throws IOException {
        mo48103o0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: t0 */
    public final void m48133t0(float f) throws IOException {
        mo48102p0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: u0 */
    public final void m48131u0(int i, InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) throws IOException {
        mo48118M0(i, 3);
        m48129v0(interfaceC18149F, interfaceC18157M);
        mo48118M0(i, 4);
    }

    @Deprecated
    /* renamed from: v0 */
    public final void m48129v0(InterfaceC18149F interfaceC18149F, InterfaceC18157M interfaceC18157M) throws IOException {
        interfaceC18157M.mo47985j(interfaceC18149F, this.f74019a);
    }

    /* renamed from: w0 */
    public abstract void mo48099w0(int i, int i2) throws IOException;

    /* renamed from: x0 */
    public abstract void mo48098x0(int i) throws IOException;

    /* renamed from: y0 */
    public final void m48125y0(int i, long j) throws IOException {
        mo48115P0(i, j);
    }

    /* renamed from: z0 */
    public final void m48123z0(long j) throws IOException {
        mo48114Q0(j);
    }

    private CodedOutputStream() {
    }
}
