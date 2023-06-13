package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: di9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39917di9 extends AbstractC49403ti9 {

    /* renamed from: e */
    public final byte[] f77089e;

    /* renamed from: f */
    public int f77090f;

    /* renamed from: g */
    public int f77091g;

    /* renamed from: h */
    public int f77092h;

    /* renamed from: i */
    public int f77093i;

    /* renamed from: j */
    public int f77094j;

    public /* synthetic */ C39917di9(byte[] bArr, int i, int i2, boolean z, C50578vh9 c50578vh9) {
        super(null);
        this.f77094j = Integer.MAX_VALUE;
        this.f77089e = bArr;
        this.f77090f = 0;
        this.f77092h = 0;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: A */
    public final void mo11878A(int i) throws zzrr {
        if (this.f77093i == i) {
            return;
        }
        throw zzrr.m51029b();
    }

    /* renamed from: B */
    public final void m43868B(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f77090f;
            int i3 = this.f77092h;
            if (i <= i2 - i3) {
                this.f77092h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzrr.m51025f();
        }
        throw zzrr.m51021j();
    }

    /* renamed from: C */
    public final void m43867C() {
        int i = this.f77090f + this.f77091g;
        this.f77090f = i;
        int i2 = this.f77094j;
        if (i <= i2) {
            this.f77091g = 0;
            return;
        }
        int i3 = i - i2;
        this.f77091g = i3;
        this.f77090f = i - i3;
    }

    /* renamed from: D */
    public final byte m43866D() throws IOException {
        int i = this.f77092h;
        if (i != this.f77090f) {
            byte[] bArr = this.f77089e;
            this.f77092h = i + 1;
            return bArr[i];
        }
        throw zzrr.m51021j();
    }

    /* renamed from: E */
    public final int m43865E() throws IOException {
        int i = this.f77092h;
        if (this.f77090f - i >= 4) {
            byte[] bArr = this.f77089e;
            this.f77092h = i + 4;
            return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        }
        throw zzrr.m51021j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m43864F() throws IOException {
        int i;
        int i2 = this.f77092h;
        int i3 = this.f77090f;
        if (i3 != i2) {
            byte[] bArr = this.f77089e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f77092h = i4;
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
                this.f77092h = i5;
                return i;
            }
        }
        return (int) m43861I();
    }

    /* renamed from: G */
    public final long m43863G() throws IOException {
        int i = this.f77092h;
        if (this.f77090f - i >= 8) {
            byte[] bArr = this.f77089e;
            this.f77092h = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzrr.m51021j();
    }

    /* renamed from: H */
    public final long m43862H() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f77092h;
        int i3 = this.f77090f;
        if (i3 != i2) {
            byte[] bArr = this.f77089e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f77092h = i4;
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
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.f77092h = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f77092h = i5;
                                return j2;
                            }
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f77092h = i5;
                    return j2;
                }
                j2 = i;
                this.f77092h = i5;
                return j2;
            }
        }
        return m43861I();
    }

    /* renamed from: I */
    public final long m43861I() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m43866D = m43866D();
            j |= (m43866D & ByteCompanionObject.MAX_VALUE) << i;
            if ((m43866D & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzrr.m51026e();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: a */
    public final void mo11877a(int i) {
        this.f77094j = i;
        m43867C();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: b */
    public final boolean mo11876b() throws IOException {
        return this.f77092h == this.f77090f;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: c */
    public final boolean mo11875c() throws IOException {
        return m43862H() != 0;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: d */
    public final boolean mo11874d(int i) throws IOException {
        int mo11861q;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            m43868B(4);
                            return true;
                        }
                        throw zzrr.m51030a();
                    }
                    do {
                        mo11861q = mo11861q();
                        if (mo11861q == 0) {
                            break;
                        }
                    } while (mo11874d(mo11861q));
                    mo11878A(((i >>> 3) << 3) | 4);
                    return true;
                }
                m43868B(m43864F());
                return true;
            }
            m43868B(8);
            return true;
        }
        if (this.f77090f - this.f77092h >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.f77089e;
                int i4 = this.f77092h;
                this.f77092h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzrr.m51026e();
        }
        while (i3 < 10) {
            if (m43866D() < 0) {
                i3++;
            }
        }
        throw zzrr.m51026e();
        return true;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: h */
    public final double mo11870h() throws IOException {
        return Double.longBitsToDouble(m43863G());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: i */
    public final float mo11869i() throws IOException {
        return Float.intBitsToFloat(m43865E());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: j */
    public final int mo11868j() {
        return this.f77092h;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: k */
    public final int mo11867k(int i) throws zzrr {
        if (i >= 0) {
            int i2 = i + this.f77092h;
            if (i2 >= 0) {
                int i3 = this.f77094j;
                if (i2 <= i3) {
                    this.f77094j = i2;
                    m43867C();
                    return i3;
                }
                throw zzrr.m51021j();
            }
            throw zzrr.m51024g();
        }
        throw zzrr.m51025f();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: l */
    public final int mo11866l() throws IOException {
        return m43864F();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: m */
    public final int mo11865m() throws IOException {
        return m43865E();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: n */
    public final int mo11864n() throws IOException {
        return m43864F();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: o */
    public final int mo11863o() throws IOException {
        return m43865E();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: p */
    public final int mo11862p() throws IOException {
        return AbstractC49403ti9.m11873e(m43864F());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: q */
    public final int mo11861q() throws IOException {
        if (mo11876b()) {
            this.f77093i = 0;
            return 0;
        }
        int m43864F = m43864F();
        this.f77093i = m43864F;
        if ((m43864F >>> 3) != 0) {
            return m43864F;
        }
        throw zzrr.m51028c();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: r */
    public final int mo11860r() throws IOException {
        return m43864F();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: s */
    public final long mo11859s() throws IOException {
        return m43863G();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: t */
    public final long mo11858t() throws IOException {
        return m43862H();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: u */
    public final long mo11857u() throws IOException {
        return m43863G();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: v */
    public final long mo11856v() throws IOException {
        return AbstractC49403ti9.m11872f(m43862H());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: w */
    public final long mo11855w() throws IOException {
        return m43862H();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: x */
    public final AbstractC45836nh9 mo11854x() throws IOException {
        int m43864F = m43864F();
        if (m43864F > 0) {
            int i = this.f77090f;
            int i2 = this.f77092h;
            if (m43864F <= i - i2) {
                AbstractC45836nh9 m23291y = AbstractC45836nh9.m23291y(this.f77089e, i2, m43864F);
                this.f77092h += m43864F;
                return m23291y;
            }
        }
        if (m43864F != 0) {
            if (m43864F > 0) {
                int i3 = this.f77090f;
                int i4 = this.f77092h;
                if (m43864F <= i3 - i4) {
                    int i5 = m43864F + i4;
                    this.f77092h = i5;
                    return AbstractC45836nh9.m23303A(Arrays.copyOfRange(this.f77089e, i4, i5));
                }
            }
            if (m43864F <= 0) {
                throw zzrr.m51025f();
            }
            throw zzrr.m51021j();
        }
        return AbstractC45836nh9.f100361c;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: y */
    public final String mo11853y() throws IOException {
        int m43864F = m43864F();
        if (m43864F > 0) {
            int i = this.f77090f;
            int i2 = this.f77092h;
            if (m43864F <= i - i2) {
                String str = new String(this.f77089e, i2, m43864F, Fn9.f10238a);
                this.f77092h += m43864F;
                return str;
            }
        }
        if (m43864F == 0) {
            return "";
        }
        if (m43864F < 0) {
            throw zzrr.m51025f();
        }
        throw zzrr.m51021j();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: z */
    public final String mo11852z() throws IOException {
        int m43864F = m43864F();
        if (m43864F > 0) {
            int i = this.f77090f;
            int i2 = this.f77092h;
            if (m43864F <= i - i2) {
                String m89657d = Ps9.m89657d(this.f77089e, i2, m43864F);
                this.f77092h += m43864F;
                return m89657d;
            }
        }
        if (m43864F == 0) {
            return "";
        }
        if (m43864F <= 0) {
            throw zzrr.m51025f();
        }
        throw zzrr.m51021j();
    }
}
