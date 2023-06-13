package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* loaded from: classes6.dex */
public abstract class AbstractC18211h {

    /* renamed from: f */
    public static volatile int f74154f = 100;

    /* renamed from: a */
    public int f74155a;

    /* renamed from: b */
    public int f74156b;

    /* renamed from: c */
    public int f74157c;

    /* renamed from: d */
    public C18214i f74158d;

    /* renamed from: e */
    public boolean f74159e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    /* loaded from: classes6.dex */
    public static final class C18213b extends AbstractC18211h {

        /* renamed from: g */
        public final byte[] f74160g;

        /* renamed from: h */
        public final boolean f74161h;

        /* renamed from: i */
        public int f74162i;

        /* renamed from: j */
        public int f74163j;

        /* renamed from: k */
        public int f74164k;

        /* renamed from: l */
        public int f74165l;

        /* renamed from: m */
        public int f74166m;

        /* renamed from: n */
        public boolean f74167n;

        /* renamed from: o */
        public int f74168o;

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: A */
        public int mo47672A() throws IOException {
            return m47665H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: B */
        public long mo47671B() throws IOException {
            return m47664I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: C */
        public boolean mo47670C(int i) throws IOException {
            int m47802b = C18178U.m47802b(i);
            if (m47802b != 0) {
                if (m47802b != 1) {
                    if (m47802b != 2) {
                        if (m47802b != 3) {
                            if (m47802b != 4) {
                                if (m47802b == 5) {
                                    m47660M(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.m48007e();
                            }
                            return false;
                        }
                        m47661L();
                        mo47656a(C18178U.m47801c(C18178U.m47803a(i), 4));
                        return true;
                    }
                    m47660M(m47665H());
                    return true;
                }
                m47660M(8);
                return true;
            }
            m47659N();
            return true;
        }

        /* renamed from: D */
        public byte m47669D() throws IOException {
            int i = this.f74164k;
            if (i != this.f74162i) {
                byte[] bArr = this.f74160g;
                this.f74164k = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        /* renamed from: E */
        public byte[] m47668E(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f74162i;
                int i3 = this.f74164k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f74164k = i4;
                    return Arrays.copyOfRange(this.f74160g, i3, i4);
                }
            }
            if (i <= 0) {
                if (i == 0) {
                    return C18238v.f74220d;
                }
                throw InvalidProtocolBufferException.m48005g();
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        /* renamed from: F */
        public int m47667F() throws IOException {
            int i = this.f74164k;
            if (this.f74162i - i >= 4) {
                byte[] bArr = this.f74160g;
                this.f74164k = i + 4;
                return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        /* renamed from: G */
        public long m47666G() throws IOException {
            int i = this.f74164k;
            if (this.f74162i - i >= 8) {
                byte[] bArr = this.f74160g;
                this.f74164k = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m47665H() throws IOException {
            int i;
            int i2 = this.f74164k;
            int i3 = this.f74162i;
            if (i3 != i2) {
                byte[] bArr = this.f74160g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f74164k = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                i7 = i5 + 1;
                                byte b2 = bArr[i5];
                                i = (i9 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                i7 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i7 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                    this.f74164k = i5;
                    return i;
                }
            }
            return (int) m47663J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long m47664I() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f74164k;
            int i3 = this.f74162i;
            if (i3 != i2) {
                byte[] bArr = this.f74160g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f74164k = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = j4 ^ (bArr[i5] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i5 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j5 = j6 ^ (bArr[i5] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j6 = j5 ^ (bArr[i10] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i5 = i11 + 1;
                                                } else {
                                                    i5 = i11;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i5 = i10;
                            }
                        }
                        this.f74164k = i5;
                        return j;
                    }
                    j = i;
                    this.f74164k = i5;
                    return j;
                }
            }
            return m47663J();
        }

        /* renamed from: J */
        public long m47663J() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m47669D = m47669D();
                j |= (m47669D & ByteCompanionObject.MAX_VALUE) << i;
                if ((m47669D & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m48006f();
        }

        /* renamed from: K */
        public final void m47662K() {
            int i = this.f74162i + this.f74163j;
            this.f74162i = i;
            int i2 = i - this.f74165l;
            int i3 = this.f74168o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f74163j = i4;
                this.f74162i = i - i4;
                return;
            }
            this.f74163j = 0;
        }

        /* renamed from: L */
        public void m47661L() throws IOException {
            int mo47636z;
            do {
                mo47636z = mo47636z();
                if (mo47636z == 0) {
                    return;
                }
            } while (mo47670C(mo47636z));
        }

        /* renamed from: M */
        public void m47660M(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f74162i;
                int i3 = this.f74164k;
                if (i <= i2 - i3) {
                    this.f74164k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m48005g();
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        /* renamed from: N */
        public final void m47659N() throws IOException {
            if (this.f74162i - this.f74164k >= 10) {
                m47658O();
            } else {
                m47657P();
            }
        }

        /* renamed from: O */
        public final void m47658O() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f74160g;
                int i2 = this.f74164k;
                this.f74164k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m48006f();
        }

        /* renamed from: P */
        public final void m47657P() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m47669D() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m48006f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: a */
        public void mo47656a(int i) throws InvalidProtocolBufferException {
            if (this.f74166m == i) {
                return;
            }
            throw InvalidProtocolBufferException.m48010b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: d */
        public int mo47655d() {
            return this.f74164k - this.f74165l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: e */
        public boolean mo47654e() throws IOException {
            return this.f74164k == this.f74162i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: i */
        public void mo47653i(int i) {
            this.f74168o = i;
            m47662K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: j */
        public int mo47652j(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int mo47655d = i + mo47655d();
                if (mo47655d >= 0) {
                    int i2 = this.f74168o;
                    if (mo47655d <= i2) {
                        this.f74168o = mo47655d;
                        m47662K();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.m48001k();
                }
                throw InvalidProtocolBufferException.m48004h();
            }
            throw InvalidProtocolBufferException.m48005g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: k */
        public boolean mo47651k() throws IOException {
            return m47664I() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: l */
        public AbstractC18199g mo47650l() throws IOException {
            AbstractC18199g m47698h;
            int m47665H = m47665H();
            if (m47665H > 0) {
                int i = this.f74162i;
                int i2 = this.f74164k;
                if (m47665H <= i - i2) {
                    if (this.f74161h && this.f74167n) {
                        m47698h = AbstractC18199g.m47703K(this.f74160g, i2, m47665H);
                    } else {
                        m47698h = AbstractC18199g.m47698h(this.f74160g, i2, m47665H);
                    }
                    this.f74164k += m47665H;
                    return m47698h;
                }
            }
            if (m47665H == 0) {
                return AbstractC18199g.f74142c;
            }
            return AbstractC18199g.m47704J(m47668E(m47665H));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: m */
        public double mo47649m() throws IOException {
            return Double.longBitsToDouble(m47666G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: n */
        public int mo47648n() throws IOException {
            return m47665H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: o */
        public int mo47647o() throws IOException {
            return m47667F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: p */
        public long mo47646p() throws IOException {
            return m47666G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: q */
        public float mo47645q() throws IOException {
            return Float.intBitsToFloat(m47667F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: r */
        public int mo47644r() throws IOException {
            return m47665H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: s */
        public long mo47643s() throws IOException {
            return m47664I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: t */
        public int mo47642t() throws IOException {
            return m47667F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: u */
        public long mo47641u() throws IOException {
            return m47666G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: v */
        public int mo47640v() throws IOException {
            return AbstractC18211h.m47677b(m47665H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: w */
        public long mo47639w() throws IOException {
            return AbstractC18211h.m47676c(m47664I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: x */
        public String mo47638x() throws IOException {
            int m47665H = m47665H();
            if (m47665H > 0) {
                int i = this.f74162i;
                int i2 = this.f74164k;
                if (m47665H <= i - i2) {
                    String str = new String(this.f74160g, i2, m47665H, C18238v.f74218b);
                    this.f74164k += m47665H;
                    return str;
                }
            }
            if (m47665H == 0) {
                return "";
            }
            if (m47665H < 0) {
                throw InvalidProtocolBufferException.m48005g();
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: y */
        public String mo47637y() throws IOException {
            int m47665H = m47665H();
            if (m47665H > 0) {
                int i = this.f74162i;
                int i2 = this.f74164k;
                if (m47665H <= i - i2) {
                    String m47841e = C18172T.m47841e(this.f74160g, i2, m47665H);
                    this.f74164k += m47665H;
                    return m47841e;
                }
            }
            if (m47665H == 0) {
                return "";
            }
            if (m47665H <= 0) {
                throw InvalidProtocolBufferException.m48005g();
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18211h
        /* renamed from: z */
        public int mo47636z() throws IOException {
            if (mo47654e()) {
                this.f74166m = 0;
                return 0;
            }
            int m47665H = m47665H();
            this.f74166m = m47665H;
            if (C18178U.m47803a(m47665H) != 0) {
                return this.f74166m;
            }
            throw InvalidProtocolBufferException.m48009c();
        }

        public C18213b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f74168o = Integer.MAX_VALUE;
            this.f74160g = bArr;
            this.f74162i = i2 + i;
            this.f74164k = i;
            this.f74165l = i;
            this.f74161h = z;
        }
    }

    /* renamed from: b */
    public static int m47677b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m47676c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static AbstractC18211h m47675f(byte[] bArr) {
        return m47674g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static AbstractC18211h m47674g(byte[] bArr, int i, int i2) {
        return m47673h(bArr, i, i2, false);
    }

    /* renamed from: h */
    public static AbstractC18211h m47673h(byte[] bArr, int i, int i2, boolean z) {
        C18213b c18213b = new C18213b(bArr, i, i2, z);
        try {
            c18213b.mo47652j(i2);
            return c18213b;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract int mo47672A() throws IOException;

    /* renamed from: B */
    public abstract long mo47671B() throws IOException;

    /* renamed from: C */
    public abstract boolean mo47670C(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo47656a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo47655d();

    /* renamed from: e */
    public abstract boolean mo47654e() throws IOException;

    /* renamed from: i */
    public abstract void mo47653i(int i);

    /* renamed from: j */
    public abstract int mo47652j(int i) throws InvalidProtocolBufferException;

    /* renamed from: k */
    public abstract boolean mo47651k() throws IOException;

    /* renamed from: l */
    public abstract AbstractC18199g mo47650l() throws IOException;

    /* renamed from: m */
    public abstract double mo47649m() throws IOException;

    /* renamed from: n */
    public abstract int mo47648n() throws IOException;

    /* renamed from: o */
    public abstract int mo47647o() throws IOException;

    /* renamed from: p */
    public abstract long mo47646p() throws IOException;

    /* renamed from: q */
    public abstract float mo47645q() throws IOException;

    /* renamed from: r */
    public abstract int mo47644r() throws IOException;

    /* renamed from: s */
    public abstract long mo47643s() throws IOException;

    /* renamed from: t */
    public abstract int mo47642t() throws IOException;

    /* renamed from: u */
    public abstract long mo47641u() throws IOException;

    /* renamed from: v */
    public abstract int mo47640v() throws IOException;

    /* renamed from: w */
    public abstract long mo47639w() throws IOException;

    /* renamed from: x */
    public abstract String mo47638x() throws IOException;

    /* renamed from: y */
    public abstract String mo47637y() throws IOException;

    /* renamed from: z */
    public abstract int mo47636z() throws IOException;

    private AbstractC18211h() {
        this.f74156b = f74154f;
        this.f74157c = Integer.MAX_VALUE;
        this.f74159e = false;
    }
}
