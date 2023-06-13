package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: com.google.protobuf.f */
/* loaded from: classes6.dex */
public abstract class AbstractC18516f {

    /* renamed from: f */
    public static volatile int f74809f = 100;

    /* renamed from: a */
    public int f74810a;

    /* renamed from: b */
    public int f74811b;

    /* renamed from: c */
    public int f74812c;

    /* renamed from: d */
    public C18519g f74813d;

    /* renamed from: e */
    public boolean f74814e;

    /* renamed from: com.google.protobuf.f$b */
    /* loaded from: classes6.dex */
    public static final class C18518b extends AbstractC18516f {

        /* renamed from: g */
        public final byte[] f74815g;

        /* renamed from: h */
        public final boolean f74816h;

        /* renamed from: i */
        public int f74817i;

        /* renamed from: j */
        public int f74818j;

        /* renamed from: k */
        public int f74819k;

        /* renamed from: l */
        public int f74820l;

        /* renamed from: m */
        public int f74821m;

        /* renamed from: n */
        public boolean f74822n;

        /* renamed from: o */
        public int f74823o;

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: A */
        public int mo46272A() throws IOException {
            return m46265H();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: B */
        public long mo46271B() throws IOException {
            return m46264I();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: C */
        public boolean mo46270C(int i) throws IOException {
            int m46344b = C18489P.m46344b(i);
            if (m46344b != 0) {
                if (m46344b != 1) {
                    if (m46344b != 2) {
                        if (m46344b != 3) {
                            if (m46344b != 4) {
                                if (m46344b == 5) {
                                    m46260M(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.m46534e();
                            }
                            return false;
                        }
                        m46261L();
                        mo46256a(C18489P.m46343c(C18489P.m46345a(i), 4));
                        return true;
                    }
                    m46260M(m46265H());
                    return true;
                }
                m46260M(8);
                return true;
            }
            m46259N();
            return true;
        }

        /* renamed from: D */
        public byte m46269D() throws IOException {
            int i = this.f74819k;
            if (i != this.f74817i) {
                byte[] bArr = this.f74815g;
                this.f74819k = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m46528k();
        }

        /* renamed from: E */
        public byte[] m46268E(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f74817i;
                int i3 = this.f74819k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f74819k = i4;
                    return Arrays.copyOfRange(this.f74815g, i3, i4);
                }
            }
            if (i <= 0) {
                if (i == 0) {
                    return C18544t.f74875d;
                }
                throw InvalidProtocolBufferException.m46532g();
            }
            throw InvalidProtocolBufferException.m46528k();
        }

        /* renamed from: F */
        public int m46267F() throws IOException {
            int i = this.f74819k;
            if (this.f74817i - i >= 4) {
                byte[] bArr = this.f74815g;
                this.f74819k = i + 4;
                return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
            }
            throw InvalidProtocolBufferException.m46528k();
        }

        /* renamed from: G */
        public long m46266G() throws IOException {
            int i = this.f74819k;
            if (this.f74817i - i >= 8) {
                byte[] bArr = this.f74815g;
                this.f74819k = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.m46528k();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m46265H() throws IOException {
            int i;
            int i2 = this.f74819k;
            int i3 = this.f74817i;
            if (i3 != i2) {
                byte[] bArr = this.f74815g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f74819k = i4;
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
                    this.f74819k = i5;
                    return i;
                }
            }
            return (int) m46263J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long m46264I() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f74819k;
            int i3 = this.f74817i;
            if (i3 != i2) {
                byte[] bArr = this.f74815g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f74819k = i4;
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
                        this.f74819k = i5;
                        return j;
                    }
                    j = i;
                    this.f74819k = i5;
                    return j;
                }
            }
            return m46263J();
        }

        /* renamed from: J */
        public long m46263J() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m46269D = m46269D();
                j |= (m46269D & ByteCompanionObject.MAX_VALUE) << i;
                if ((m46269D & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m46533f();
        }

        /* renamed from: K */
        public final void m46262K() {
            int i = this.f74817i + this.f74818j;
            this.f74817i = i;
            int i2 = i - this.f74820l;
            int i3 = this.f74823o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f74818j = i4;
                this.f74817i = i - i4;
                return;
            }
            this.f74818j = 0;
        }

        /* renamed from: L */
        public void m46261L() throws IOException {
            int mo46236z;
            do {
                mo46236z = mo46236z();
                if (mo46236z == 0) {
                    return;
                }
            } while (mo46270C(mo46236z));
        }

        /* renamed from: M */
        public void m46260M(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f74817i;
                int i3 = this.f74819k;
                if (i <= i2 - i3) {
                    this.f74819k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m46532g();
            }
            throw InvalidProtocolBufferException.m46528k();
        }

        /* renamed from: N */
        public final void m46259N() throws IOException {
            if (this.f74817i - this.f74819k >= 10) {
                m46258O();
            } else {
                m46257P();
            }
        }

        /* renamed from: O */
        public final void m46258O() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f74815g;
                int i2 = this.f74819k;
                this.f74819k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m46533f();
        }

        /* renamed from: P */
        public final void m46257P() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m46269D() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m46533f();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: a */
        public void mo46256a(int i) throws InvalidProtocolBufferException {
            if (this.f74821m == i) {
                return;
            }
            throw InvalidProtocolBufferException.m46537b();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: d */
        public int mo46255d() {
            return this.f74819k - this.f74820l;
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: e */
        public boolean mo46254e() throws IOException {
            return this.f74819k == this.f74817i;
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: i */
        public void mo46253i(int i) {
            this.f74823o = i;
            m46262K();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: j */
        public int mo46252j(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int mo46255d = i + mo46255d();
                if (mo46255d >= 0) {
                    int i2 = this.f74823o;
                    if (mo46255d <= i2) {
                        this.f74823o = mo46255d;
                        m46262K();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.m46528k();
                }
                throw InvalidProtocolBufferException.m46531h();
            }
            throw InvalidProtocolBufferException.m46532g();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: k */
        public boolean mo46251k() throws IOException {
            return m46264I() != 0;
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: l */
        public AbstractC18504e mo46250l() throws IOException {
            AbstractC18504e m46298f;
            int m46265H = m46265H();
            if (m46265H > 0) {
                int i = this.f74817i;
                int i2 = this.f74819k;
                if (m46265H <= i - i2) {
                    if (this.f74816h && this.f74822n) {
                        m46298f = AbstractC18504e.m46302J(this.f74815g, i2, m46265H);
                    } else {
                        m46298f = AbstractC18504e.m46298f(this.f74815g, i2, m46265H);
                    }
                    this.f74819k += m46265H;
                    return m46298f;
                }
            }
            if (m46265H == 0) {
                return AbstractC18504e.f74797c;
            }
            return AbstractC18504e.m46303I(m46268E(m46265H));
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: m */
        public double mo46249m() throws IOException {
            return Double.longBitsToDouble(m46266G());
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: n */
        public int mo46248n() throws IOException {
            return m46265H();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: o */
        public int mo46247o() throws IOException {
            return m46267F();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: p */
        public long mo46246p() throws IOException {
            return m46266G();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: q */
        public float mo46245q() throws IOException {
            return Float.intBitsToFloat(m46267F());
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: r */
        public int mo46244r() throws IOException {
            return m46265H();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: s */
        public long mo46243s() throws IOException {
            return m46264I();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: t */
        public int mo46242t() throws IOException {
            return m46267F();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: u */
        public long mo46241u() throws IOException {
            return m46266G();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: v */
        public int mo46240v() throws IOException {
            return AbstractC18516f.m46277b(m46265H());
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: w */
        public long mo46239w() throws IOException {
            return AbstractC18516f.m46276c(m46264I());
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: x */
        public String mo46238x() throws IOException {
            int m46265H = m46265H();
            if (m46265H > 0) {
                int i = this.f74817i;
                int i2 = this.f74819k;
                if (m46265H <= i - i2) {
                    String str = new String(this.f74815g, i2, m46265H, C18544t.f74873b);
                    this.f74819k += m46265H;
                    return str;
                }
            }
            if (m46265H == 0) {
                return "";
            }
            if (m46265H < 0) {
                throw InvalidProtocolBufferException.m46532g();
            }
            throw InvalidProtocolBufferException.m46528k();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: y */
        public String mo46237y() throws IOException {
            int m46265H = m46265H();
            if (m46265H > 0) {
                int i = this.f74817i;
                int i2 = this.f74819k;
                if (m46265H <= i - i2) {
                    String m46383e = C18483O.m46383e(this.f74815g, i2, m46265H);
                    this.f74819k += m46265H;
                    return m46383e;
                }
            }
            if (m46265H == 0) {
                return "";
            }
            if (m46265H <= 0) {
                throw InvalidProtocolBufferException.m46532g();
            }
            throw InvalidProtocolBufferException.m46528k();
        }

        @Override // com.google.protobuf.AbstractC18516f
        /* renamed from: z */
        public int mo46236z() throws IOException {
            if (mo46254e()) {
                this.f74821m = 0;
                return 0;
            }
            int m46265H = m46265H();
            this.f74821m = m46265H;
            if (C18489P.m46345a(m46265H) != 0) {
                return this.f74821m;
            }
            throw InvalidProtocolBufferException.m46536c();
        }

        public C18518b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f74823o = Integer.MAX_VALUE;
            this.f74815g = bArr;
            this.f74817i = i2 + i;
            this.f74819k = i;
            this.f74820l = i;
            this.f74816h = z;
        }
    }

    /* renamed from: b */
    public static int m46277b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m46276c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static AbstractC18516f m46275f(byte[] bArr) {
        return m46274g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static AbstractC18516f m46274g(byte[] bArr, int i, int i2) {
        return m46273h(bArr, i, i2, false);
    }

    /* renamed from: h */
    public static AbstractC18516f m46273h(byte[] bArr, int i, int i2, boolean z) {
        C18518b c18518b = new C18518b(bArr, i, i2, z);
        try {
            c18518b.mo46252j(i2);
            return c18518b;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract int mo46272A() throws IOException;

    /* renamed from: B */
    public abstract long mo46271B() throws IOException;

    /* renamed from: C */
    public abstract boolean mo46270C(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo46256a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo46255d();

    /* renamed from: e */
    public abstract boolean mo46254e() throws IOException;

    /* renamed from: i */
    public abstract void mo46253i(int i);

    /* renamed from: j */
    public abstract int mo46252j(int i) throws InvalidProtocolBufferException;

    /* renamed from: k */
    public abstract boolean mo46251k() throws IOException;

    /* renamed from: l */
    public abstract AbstractC18504e mo46250l() throws IOException;

    /* renamed from: m */
    public abstract double mo46249m() throws IOException;

    /* renamed from: n */
    public abstract int mo46248n() throws IOException;

    /* renamed from: o */
    public abstract int mo46247o() throws IOException;

    /* renamed from: p */
    public abstract long mo46246p() throws IOException;

    /* renamed from: q */
    public abstract float mo46245q() throws IOException;

    /* renamed from: r */
    public abstract int mo46244r() throws IOException;

    /* renamed from: s */
    public abstract long mo46243s() throws IOException;

    /* renamed from: t */
    public abstract int mo46242t() throws IOException;

    /* renamed from: u */
    public abstract long mo46241u() throws IOException;

    /* renamed from: v */
    public abstract int mo46240v() throws IOException;

    /* renamed from: w */
    public abstract long mo46239w() throws IOException;

    /* renamed from: x */
    public abstract String mo46238x() throws IOException;

    /* renamed from: y */
    public abstract String mo46237y() throws IOException;

    /* renamed from: z */
    public abstract int mo46236z() throws IOException;

    private AbstractC18516f() {
        this.f74811b = f74809f;
        this.f74812c = Integer.MAX_VALUE;
        this.f74814e = false;
    }
}
