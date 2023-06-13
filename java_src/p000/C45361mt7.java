package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: mt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45361mt7 extends AbstractC46547ot7 {

    /* renamed from: e */
    public final byte[] f98996e;

    /* renamed from: f */
    public int f98997f;

    /* renamed from: g */
    public int f98998g;

    /* renamed from: h */
    public int f98999h;

    /* renamed from: i */
    public int f99000i;

    /* renamed from: j */
    public int f99001j;

    public /* synthetic */ C45361mt7(byte[] bArr, int i, int i2, boolean z, C44768lt7 c44768lt7) {
        super(null);
        this.f99001j = Integer.MAX_VALUE;
        this.f98996e = bArr;
        this.f98997f = 0;
        this.f98999h = 0;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: A */
    public final void mo20352A(int i) throws zzaqw {
        if (this.f99000i != i) {
            throw zzaqw.m51286b();
        }
    }

    /* renamed from: B */
    public final void m24752B(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f98997f;
            int i3 = this.f98999h;
            if (i <= i2 - i3) {
                this.f98999h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzaqw.m51282f();
        }
        throw zzaqw.m51278j();
    }

    /* renamed from: C */
    public final void m24751C() {
        int i = this.f98997f + this.f98998g;
        this.f98997f = i;
        int i2 = this.f99001j;
        if (i <= i2) {
            this.f98998g = 0;
            return;
        }
        int i3 = i - i2;
        this.f98998g = i3;
        this.f98997f = i - i3;
    }

    /* renamed from: D */
    public final byte m24750D() throws IOException {
        int i = this.f98999h;
        if (i != this.f98997f) {
            byte[] bArr = this.f98996e;
            this.f98999h = i + 1;
            return bArr[i];
        }
        throw zzaqw.m51278j();
    }

    /* renamed from: E */
    public final int m24749E() throws IOException {
        int i = this.f98999h;
        if (this.f98997f - i >= 4) {
            byte[] bArr = this.f98996e;
            this.f98999h = i + 4;
            return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        }
        throw zzaqw.m51278j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m24748F() throws IOException {
        int i;
        int i2 = this.f98999h;
        int i3 = this.f98997f;
        if (i3 != i2) {
            byte[] bArr = this.f98996e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f98999h = i4;
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
                this.f98999h = i5;
                return i;
            }
        }
        return (int) m24745I();
    }

    /* renamed from: G */
    public final long m24747G() throws IOException {
        int i = this.f98999h;
        if (this.f98997f - i >= 8) {
            byte[] bArr = this.f98996e;
            this.f98999h = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzaqw.m51278j();
    }

    /* renamed from: H */
    public final long m24746H() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f98999h;
        int i3 = this.f98997f;
        if (i3 != i2) {
            byte[] bArr = this.f98996e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f98999h = i4;
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
                                                    this.f98999h = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f98999h = i5;
                                return j2;
                            }
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f98999h = i5;
                    return j2;
                }
                j2 = i;
                this.f98999h = i5;
                return j2;
            }
        }
        return m24745I();
    }

    /* renamed from: I */
    public final long m24745I() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m24750D = m24750D();
            j |= (m24750D & ByteCompanionObject.MAX_VALUE) << i;
            if ((m24750D & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzaqw.m51283e();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: a */
    public final void mo20351a(int i) {
        this.f99001j = i;
        m24751C();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: b */
    public final boolean mo20350b() throws IOException {
        return this.f98999h == this.f98997f;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: c */
    public final boolean mo20349c() throws IOException {
        return m24746H() != 0;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: d */
    public final boolean mo20348d(int i) throws IOException {
        int mo20335q;
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
                            m24752B(4);
                            return true;
                        }
                        throw zzaqw.m51287a();
                    }
                    do {
                        mo20335q = mo20335q();
                        if (mo20335q == 0) {
                            break;
                        }
                    } while (mo20348d(mo20335q));
                    mo20352A(((i >>> 3) << 3) | 4);
                    return true;
                }
                m24752B(m24748F());
                return true;
            }
            m24752B(8);
            return true;
        }
        if (this.f98997f - this.f98999h >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.f98996e;
                int i4 = this.f98999h;
                this.f98999h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzaqw.m51283e();
        }
        while (i3 < 10) {
            if (m24750D() < 0) {
                i3++;
            }
        }
        throw zzaqw.m51283e();
        return true;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: h */
    public final double mo20344h() throws IOException {
        return Double.longBitsToDouble(m24747G());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: i */
    public final float mo20343i() throws IOException {
        return Float.intBitsToFloat(m24749E());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: j */
    public final int mo20342j() {
        return this.f98999h;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: k */
    public final int mo20341k(int i) throws zzaqw {
        if (i >= 0) {
            int i2 = i + this.f98999h;
            if (i2 >= 0) {
                int i3 = this.f99001j;
                if (i2 <= i3) {
                    this.f99001j = i2;
                    m24751C();
                    return i3;
                }
                throw zzaqw.m51278j();
            }
            throw zzaqw.m51281g();
        }
        throw zzaqw.m51282f();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: l */
    public final int mo20340l() throws IOException {
        return m24748F();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: m */
    public final int mo20339m() throws IOException {
        return m24749E();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: n */
    public final int mo20338n() throws IOException {
        return m24748F();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: o */
    public final int mo20337o() throws IOException {
        return m24749E();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: p */
    public final int mo20336p() throws IOException {
        return AbstractC46547ot7.m20347e(m24748F());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: q */
    public final int mo20335q() throws IOException {
        if (mo20350b()) {
            this.f99000i = 0;
            return 0;
        }
        int m24748F = m24748F();
        this.f99000i = m24748F;
        if ((m24748F >>> 3) != 0) {
            return m24748F;
        }
        throw zzaqw.m51285c();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: r */
    public final int mo20334r() throws IOException {
        return m24748F();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: s */
    public final long mo20333s() throws IOException {
        return m24747G();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: t */
    public final long mo20332t() throws IOException {
        return m24746H();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: u */
    public final long mo20331u() throws IOException {
        return m24747G();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: v */
    public final long mo20330v() throws IOException {
        return AbstractC46547ot7.m20346f(m24746H());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: w */
    public final long mo20329w() throws IOException {
        return m24746H();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: x */
    public final AbstractC44175kt7 mo20328x() throws IOException {
        int m24748F = m24748F();
        if (m24748F > 0) {
            int i = this.f98997f;
            int i2 = this.f98999h;
            if (m24748F <= i - i2) {
                AbstractC44175kt7 m28227D = AbstractC44175kt7.m28227D(this.f98996e, i2, m24748F);
                this.f98999h += m24748F;
                return m28227D;
            }
        }
        if (m24748F != 0) {
            if (m24748F > 0) {
                int i3 = this.f98997f;
                int i4 = this.f98999h;
                if (m24748F <= i3 - i4) {
                    int i5 = m24748F + i4;
                    this.f98999h = i5;
                    return AbstractC44175kt7.m28224H(Arrays.copyOfRange(this.f98996e, i4, i5));
                }
            }
            if (m24748F <= 0) {
                throw zzaqw.m51282f();
            }
            throw zzaqw.m51278j();
        }
        return AbstractC44175kt7.f95165c;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: y */
    public final String mo20327y() throws IOException {
        int m24748F = m24748F();
        if (m24748F > 0) {
            int i = this.f98997f;
            int i2 = this.f98999h;
            if (m24748F <= i - i2) {
                String str = new String(this.f98996e, i2, m24748F, C46557ou7.f102752b);
                this.f98999h += m24748F;
                return str;
            }
        }
        if (m24748F == 0) {
            return "";
        }
        if (m24748F < 0) {
            throw zzaqw.m51282f();
        }
        throw zzaqw.m51278j();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: z */
    public final String mo20326z() throws IOException {
        int m24748F = m24748F();
        if (m24748F > 0) {
            int i = this.f98997f;
            int i2 = this.f98999h;
            if (m24748F <= i - i2) {
                String m103208g = C33456Hw7.m103208g(this.f98996e, i2, m24748F);
                this.f98999h += m24748F;
                return m103208g;
            }
        }
        if (m24748F == 0) {
            return "";
        }
        if (m24748F <= 0) {
            throw zzaqw.m51282f();
        }
        throw zzaqw.m51278j();
    }
}
