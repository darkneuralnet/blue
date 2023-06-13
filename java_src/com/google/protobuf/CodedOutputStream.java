package com.google.protobuf;

import com.google.protobuf.C18483O;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
/* loaded from: classes6.dex */
public abstract class CodedOutputStream extends I70 {

    /* renamed from: c */
    public static final Logger f74683c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f74684d = C52324ye6.m3103E();

    /* renamed from: a */
    public C18521h f74685a;

    /* renamed from: b */
    public boolean f74686b;

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

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    /* loaded from: classes6.dex */
    public static class C18461b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f74687e;

        /* renamed from: f */
        public final int f74688f;

        /* renamed from: g */
        public final int f74689g;

        /* renamed from: h */
        public int f74690h;

        public C18461b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f74687e = bArr;
                    this.f74688f = i;
                    this.f74690h = i;
                    this.f74689g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public final void mo46653A0(int i, int i2) throws IOException {
            mo46645S0(i, 0);
            mo46652B0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public final void mo46652B0(int i) throws IOException {
            if (i >= 0) {
                mo46643U0(i);
            } else {
                mo46641W0(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public final void mo46651E0(int i, InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
            mo46645S0(i, 2);
            mo46643U0(((AbstractC18499a) interfaceC18462D).mo46050c(interfaceC33832Jm5));
            interfaceC33832Jm5.mo46549i(interfaceC18462D, this.f74685a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public final void mo46650F0(InterfaceC18462D interfaceC18462D) throws IOException {
            mo46643U0(interfaceC18462D.getSerializedSize());
            interfaceC18462D.mo46049f(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public final void mo46649G0(int i, InterfaceC18462D interfaceC18462D) throws IOException {
            mo46645S0(1, 3);
            mo46644T0(2, i);
            m46639Y0(3, interfaceC18462D);
            mo46645S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: H0 */
        public final void mo46648H0(int i, AbstractC18504e abstractC18504e) throws IOException {
            mo46645S0(1, 3);
            mo46644T0(2, i);
            mo46633k0(3, abstractC18504e);
            mo46645S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: Q0 */
        public final void mo46647Q0(int i, String str) throws IOException {
            mo46645S0(i, 2);
            mo46646R0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: R0 */
        public final void mo46646R0(String str) throws IOException {
            int i = this.f74690h;
            try {
                int m46699V = CodedOutputStream.m46699V(str.length() * 3);
                int m46699V2 = CodedOutputStream.m46699V(str.length());
                if (m46699V2 == m46699V) {
                    int i2 = i + m46699V2;
                    this.f74690h = i2;
                    int m46382f = C18483O.m46382f(str, this.f74687e, i2, mo46637e0());
                    this.f74690h = i;
                    mo46643U0((m46382f - i) - m46699V2);
                    this.f74690h = m46382f;
                } else {
                    mo46643U0(C18483O.m46381g(str));
                    this.f74690h = C18483O.m46382f(str, this.f74687e, this.f74690h, mo46637e0());
                }
            } catch (C18483O.C18487d e) {
                this.f74690h = i;
                m46694a0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: S0 */
        public final void mo46645S0(int i, int i2) throws IOException {
            mo46643U0(C18489P.m46343c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: T0 */
        public final void mo46644T0(int i, int i2) throws IOException {
            mo46645S0(i, 0);
            mo46643U0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: U0 */
        public final void mo46643U0(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.f74687e;
                    int i2 = this.f74690h;
                    this.f74690h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74690h), Integer.valueOf(this.f74689g), 1), e);
                }
            }
            byte[] bArr2 = this.f74687e;
            int i3 = this.f74690h;
            this.f74690h = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: V0 */
        public final void mo46642V0(int i, long j) throws IOException {
            mo46645S0(i, 0);
            mo46641W0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: W0 */
        public final void mo46641W0(long j) throws IOException {
            if (CodedOutputStream.f74684d && mo46637e0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f74687e;
                    int i = this.f74690h;
                    this.f74690h = i + 1;
                    C52324ye6.m3097K(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f74687e;
                int i2 = this.f74690h;
                this.f74690h = i2 + 1;
                C52324ye6.m3097K(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f74687e;
                    int i3 = this.f74690h;
                    this.f74690h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74690h), Integer.valueOf(this.f74689g), 1), e);
                }
            }
            byte[] bArr4 = this.f74687e;
            int i4 = this.f74690h;
            this.f74690h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        /* renamed from: X0 */
        public final void m46640X0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f74687e, this.f74690h, i2);
                this.f74690h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74690h), Integer.valueOf(this.f74689g), Integer.valueOf(i2)), e);
            }
        }

        /* renamed from: Y0 */
        public final void m46639Y0(int i, InterfaceC18462D interfaceC18462D) throws IOException {
            mo46645S0(i, 2);
            mo46650F0(interfaceC18462D);
        }

        @Override // com.google.protobuf.CodedOutputStream, p000.I70
        /* renamed from: a */
        public final void mo46638a(byte[] bArr, int i, int i2) throws IOException {
            m46640X0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: e0 */
        public final int mo46637e0() {
            return this.f74689g - this.f74690h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: f0 */
        public final void mo46636f0(byte b) throws IOException {
            try {
                byte[] bArr = this.f74687e;
                int i = this.f74690h;
                this.f74690h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74690h), Integer.valueOf(this.f74689g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: g0 */
        public final void mo46635g0(int i, boolean z) throws IOException {
            mo46645S0(i, 0);
            mo46636f0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: j0 */
        public final void mo46634j0(byte[] bArr, int i, int i2) throws IOException {
            mo46643U0(i2);
            m46640X0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k0 */
        public final void mo46633k0(int i, AbstractC18504e abstractC18504e) throws IOException {
            mo46645S0(i, 2);
            mo46632l0(abstractC18504e);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l0 */
        public final void mo46632l0(AbstractC18504e abstractC18504e) throws IOException {
            mo46643U0(abstractC18504e.size());
            abstractC18504e.mo46288K(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: q0 */
        public final void mo46631q0(int i, int i2) throws IOException {
            mo46645S0(i, 5);
            mo46630r0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: r0 */
        public final void mo46630r0(int i) throws IOException {
            try {
                byte[] bArr = this.f74687e;
                int i2 = this.f74690h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f74690h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74690h), Integer.valueOf(this.f74689g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: s0 */
        public final void mo46629s0(int i, long j) throws IOException {
            mo46645S0(i, 1);
            mo46628t0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: t0 */
        public final void mo46628t0(long j) throws IOException {
            try {
                byte[] bArr = this.f74687e;
                int i = this.f74690h;
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
                this.f74690h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f74690h), Integer.valueOf(this.f74689g), 1), e);
            }
        }
    }

    /* renamed from: A */
    public static int m46730A(int i, C18558v c18558v) {
        return m46701T(i) + m46729B(c18558v);
    }

    /* renamed from: B */
    public static int m46729B(C18558v c18558v) {
        return m46728C(c18558v.m45984b());
    }

    /* renamed from: C */
    public static int m46728C(int i) {
        return m46699V(i) + i;
    }

    /* renamed from: D */
    public static int m46726D(int i, InterfaceC18462D interfaceC18462D) {
        return (m46701T(1) * 2) + m46700U(2, i) + m46724E(3, interfaceC18462D);
    }

    /* renamed from: E */
    public static int m46724E(int i, InterfaceC18462D interfaceC18462D) {
        return m46701T(i) + m46722G(interfaceC18462D);
    }

    /* renamed from: F */
    public static int m46723F(int i, InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) {
        return m46701T(i) + m46721H(interfaceC18462D, interfaceC33832Jm5);
    }

    /* renamed from: G */
    public static int m46722G(InterfaceC18462D interfaceC18462D) {
        return m46728C(interfaceC18462D.getSerializedSize());
    }

    /* renamed from: H */
    public static int m46721H(InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) {
        return m46728C(((AbstractC18499a) interfaceC18462D).mo46050c(interfaceC33832Jm5));
    }

    /* renamed from: I */
    public static int m46720I(int i, AbstractC18504e abstractC18504e) {
        return (m46701T(1) * 2) + m46700U(2, i) + m46685g(3, abstractC18504e);
    }

    /* renamed from: J */
    public static int m46718J(int i, int i2) {
        return m46701T(i) + m46716K(i2);
    }

    /* renamed from: K */
    public static int m46716K(int i) {
        return 4;
    }

    /* renamed from: L */
    public static int m46714L(int i, long j) {
        return m46701T(i) + m46712M(j);
    }

    /* renamed from: M */
    public static int m46712M(long j) {
        return 8;
    }

    /* renamed from: N */
    public static int m46710N(int i, int i2) {
        return m46701T(i) + m46708O(i2);
    }

    /* renamed from: O */
    public static int m46708O(int i) {
        return m46699V(m46696Y(i));
    }

    /* renamed from: P */
    public static int m46706P(int i, long j) {
        return m46701T(i) + m46704Q(j);
    }

    /* renamed from: Q */
    public static int m46704Q(long j) {
        return m46697X(m46695Z(j));
    }

    /* renamed from: R */
    public static int m46703R(int i, String str) {
        return m46701T(i) + m46702S(str);
    }

    /* renamed from: S */
    public static int m46702S(String str) {
        int length;
        try {
            length = C18483O.m46381g(str);
        } catch (C18483O.C18487d unused) {
            length = str.getBytes(C18544t.f74873b).length;
        }
        return m46728C(length);
    }

    /* renamed from: T */
    public static int m46701T(int i) {
        return m46699V(C18489P.m46343c(i, 0));
    }

    /* renamed from: U */
    public static int m46700U(int i, int i2) {
        return m46701T(i) + m46699V(i2);
    }

    /* renamed from: V */
    public static int m46699V(int i) {
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

    /* renamed from: W */
    public static int m46698W(int i, long j) {
        return m46701T(i) + m46697X(j);
    }

    /* renamed from: X */
    public static int m46697X(long j) {
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

    /* renamed from: Y */
    public static int m46696Y(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: Z */
    public static long m46695Z(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: c0 */
    public static CodedOutputStream m46690c0(byte[] bArr) {
        return m46688d0(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static int m46689d(int i, boolean z) {
        return m46701T(i) + m46687e(z);
    }

    /* renamed from: d0 */
    public static CodedOutputStream m46688d0(byte[] bArr, int i, int i2) {
        return new C18461b(bArr, i, i2);
    }

    /* renamed from: e */
    public static int m46687e(boolean z) {
        return 1;
    }

    /* renamed from: f */
    public static int m46686f(byte[] bArr) {
        return m46728C(bArr.length);
    }

    /* renamed from: g */
    public static int m46685g(int i, AbstractC18504e abstractC18504e) {
        return m46701T(i) + m46684h(abstractC18504e);
    }

    /* renamed from: h */
    public static int m46684h(AbstractC18504e abstractC18504e) {
        return m46728C(abstractC18504e.size());
    }

    /* renamed from: i */
    public static int m46682i(int i, double d) {
        return m46701T(i) + m46680j(d);
    }

    /* renamed from: j */
    public static int m46680j(double d) {
        return 8;
    }

    /* renamed from: k */
    public static int m46679k(int i, int i2) {
        return m46701T(i) + m46678l(i2);
    }

    /* renamed from: l */
    public static int m46678l(int i) {
        return m46661w(i);
    }

    /* renamed from: m */
    public static int m46677m(int i, int i2) {
        return m46701T(i) + m46675n(i2);
    }

    /* renamed from: n */
    public static int m46675n(int i) {
        return 4;
    }

    /* renamed from: o */
    public static int m46673o(int i, long j) {
        return m46701T(i) + m46671p(j);
    }

    /* renamed from: p */
    public static int m46671p(long j) {
        return 8;
    }

    /* renamed from: q */
    public static int m46669q(int i, float f) {
        return m46701T(i) + m46668r(f);
    }

    /* renamed from: r */
    public static int m46668r(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: s */
    public static int m46667s(int i, InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) {
        return (m46701T(i) * 2) + m46665u(interfaceC18462D, interfaceC33832Jm5);
    }

    @Deprecated
    /* renamed from: t */
    public static int m46666t(InterfaceC18462D interfaceC18462D) {
        return interfaceC18462D.getSerializedSize();
    }

    @Deprecated
    /* renamed from: u */
    public static int m46665u(InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) {
        return ((AbstractC18499a) interfaceC18462D).mo46050c(interfaceC33832Jm5);
    }

    /* renamed from: v */
    public static int m46663v(int i, int i2) {
        return m46701T(i) + m46661w(i2);
    }

    /* renamed from: w */
    public static int m46661w(int i) {
        if (i >= 0) {
            return m46699V(i);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m46659x(int i, long j) {
        return m46701T(i) + m46657y(j);
    }

    /* renamed from: y */
    public static int m46657y(long j) {
        return m46697X(j);
    }

    /* renamed from: z */
    public static int m46655z(int i, C18558v c18558v) {
        return (m46701T(1) * 2) + m46700U(2, i) + m46730A(3, c18558v);
    }

    /* renamed from: A0 */
    public abstract void mo46653A0(int i, int i2) throws IOException;

    /* renamed from: B0 */
    public abstract void mo46652B0(int i) throws IOException;

    /* renamed from: C0 */
    public final void m46727C0(int i, long j) throws IOException {
        mo46642V0(i, j);
    }

    /* renamed from: D0 */
    public final void m46725D0(long j) throws IOException {
        mo46641W0(j);
    }

    /* renamed from: E0 */
    public abstract void mo46651E0(int i, InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException;

    /* renamed from: F0 */
    public abstract void mo46650F0(InterfaceC18462D interfaceC18462D) throws IOException;

    /* renamed from: G0 */
    public abstract void mo46649G0(int i, InterfaceC18462D interfaceC18462D) throws IOException;

    /* renamed from: H0 */
    public abstract void mo46648H0(int i, AbstractC18504e abstractC18504e) throws IOException;

    /* renamed from: I0 */
    public final void m46719I0(int i, int i2) throws IOException {
        mo46631q0(i, i2);
    }

    /* renamed from: J0 */
    public final void m46717J0(int i) throws IOException {
        mo46630r0(i);
    }

    /* renamed from: K0 */
    public final void m46715K0(int i, long j) throws IOException {
        mo46629s0(i, j);
    }

    /* renamed from: L0 */
    public final void m46713L0(long j) throws IOException {
        mo46628t0(j);
    }

    /* renamed from: M0 */
    public final void m46711M0(int i, int i2) throws IOException {
        mo46644T0(i, m46696Y(i2));
    }

    /* renamed from: N0 */
    public final void m46709N0(int i) throws IOException {
        mo46643U0(m46696Y(i));
    }

    /* renamed from: O0 */
    public final void m46707O0(int i, long j) throws IOException {
        mo46642V0(i, m46695Z(j));
    }

    /* renamed from: P0 */
    public final void m46705P0(long j) throws IOException {
        mo46641W0(m46695Z(j));
    }

    /* renamed from: Q0 */
    public abstract void mo46647Q0(int i, String str) throws IOException;

    /* renamed from: R0 */
    public abstract void mo46646R0(String str) throws IOException;

    /* renamed from: S0 */
    public abstract void mo46645S0(int i, int i2) throws IOException;

    /* renamed from: T0 */
    public abstract void mo46644T0(int i, int i2) throws IOException;

    /* renamed from: U0 */
    public abstract void mo46643U0(int i) throws IOException;

    /* renamed from: V0 */
    public abstract void mo46642V0(int i, long j) throws IOException;

    /* renamed from: W0 */
    public abstract void mo46641W0(long j) throws IOException;

    @Override // p000.I70
    /* renamed from: a */
    public abstract void mo46638a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: a0 */
    public final void m46694a0(String str, C18483O.C18487d c18487d) throws IOException {
        f74683c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c18487d);
        byte[] bytes = str.getBytes(C18544t.f74873b);
        try {
            mo46643U0(bytes.length);
            mo46638a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    /* renamed from: b0 */
    public boolean m46692b0() {
        return this.f74686b;
    }

    /* renamed from: c */
    public final void m46691c() {
        if (mo46637e0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: e0 */
    public abstract int mo46637e0();

    /* renamed from: f0 */
    public abstract void mo46636f0(byte b) throws IOException;

    /* renamed from: g0 */
    public abstract void mo46635g0(int i, boolean z) throws IOException;

    /* renamed from: h0 */
    public final void m46683h0(boolean z) throws IOException {
        mo46636f0(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: i0 */
    public final void m46681i0(byte[] bArr) throws IOException {
        mo46634j0(bArr, 0, bArr.length);
    }

    /* renamed from: j0 */
    public abstract void mo46634j0(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: k0 */
    public abstract void mo46633k0(int i, AbstractC18504e abstractC18504e) throws IOException;

    /* renamed from: l0 */
    public abstract void mo46632l0(AbstractC18504e abstractC18504e) throws IOException;

    /* renamed from: m0 */
    public final void m46676m0(int i, double d) throws IOException {
        mo46629s0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: n0 */
    public final void m46674n0(double d) throws IOException {
        mo46628t0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: o0 */
    public final void m46672o0(int i, int i2) throws IOException {
        mo46653A0(i, i2);
    }

    /* renamed from: p0 */
    public final void m46670p0(int i) throws IOException {
        mo46652B0(i);
    }

    /* renamed from: q0 */
    public abstract void mo46631q0(int i, int i2) throws IOException;

    /* renamed from: r0 */
    public abstract void mo46630r0(int i) throws IOException;

    /* renamed from: s0 */
    public abstract void mo46629s0(int i, long j) throws IOException;

    /* renamed from: t0 */
    public abstract void mo46628t0(long j) throws IOException;

    /* renamed from: u0 */
    public final void m46664u0(int i, float f) throws IOException {
        mo46631q0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: v0 */
    public final void m46662v0(float f) throws IOException {
        mo46630r0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: w0 */
    public final void m46660w0(int i, InterfaceC18462D interfaceC18462D) throws IOException {
        mo46645S0(i, 3);
        m46656y0(interfaceC18462D);
        mo46645S0(i, 4);
    }

    @Deprecated
    /* renamed from: x0 */
    public final void m46658x0(int i, InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        mo46645S0(i, 3);
        m46654z0(interfaceC18462D, interfaceC33832Jm5);
        mo46645S0(i, 4);
    }

    @Deprecated
    /* renamed from: y0 */
    public final void m46656y0(InterfaceC18462D interfaceC18462D) throws IOException {
        interfaceC18462D.mo46049f(this);
    }

    @Deprecated
    /* renamed from: z0 */
    public final void m46654z0(InterfaceC18462D interfaceC18462D, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        interfaceC33832Jm5.mo46549i(interfaceC18462D, this.f74685a);
    }

    private CodedOutputStream() {
    }
}
