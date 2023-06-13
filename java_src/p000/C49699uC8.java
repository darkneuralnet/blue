package p000;

import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: uC8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49699uC8 extends WB8 {

    /* renamed from: f */
    public final byte[] f111963f;

    /* renamed from: g */
    public final boolean f111964g;

    /* renamed from: h */
    public int f111965h;

    /* renamed from: i */
    public int f111966i;

    /* renamed from: j */
    public int f111967j;

    /* renamed from: k */
    public int f111968k;

    /* renamed from: l */
    public int f111969l;

    /* renamed from: m */
    public int f111970m;

    public C49699uC8(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f111970m = Integer.MAX_VALUE;
        this.f111963f = bArr;
        this.f111965h = i2 + i;
        this.f111967j = i;
        this.f111968k = i;
        this.f111964g = z;
    }

    @Override // p000.WB8
    /* renamed from: A */
    public final boolean mo10639A() throws IOException {
        return this.f111967j == this.f111965h;
    }

    @Override // p000.WB8
    /* renamed from: B */
    public final int mo10638B() {
        return this.f111967j - this.f111968k;
    }

    /* renamed from: C */
    public final byte m10637C() throws IOException {
        int i = this.f111967j;
        if (i != this.f111965h) {
            byte[] bArr = this.f111963f;
            this.f111967j = i + 1;
            return bArr[i];
        }
        throw zzjk.m50764a();
    }

    /* renamed from: D */
    public final void m10636D(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f111965h;
            int i3 = this.f111967j;
            if (i <= i2 - i3) {
                this.f111967j = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzjk.m50763b();
        }
        throw zzjk.m50764a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m10635E() throws IOException {
        int i;
        int i2 = this.f111967j;
        int i3 = this.f111965h;
        if (i3 != i2) {
            byte[] bArr = this.f111963f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f111967j = i4;
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
                this.f111967j = i5;
                return i;
            }
        }
        return (int) mo10608z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r2[r0] >= 0) goto L40;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m10634F() throws IOException {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.f111967j;
        int i3 = this.f111965h;
        if (i3 != i2) {
            byte[] bArr = this.f111963f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f111967j = i4;
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
                    this.f111967j = i5;
                    return j;
                }
                j = i;
                this.f111967j = i5;
                return j;
            }
        }
        return mo10608z();
    }

    /* renamed from: G */
    public final int m10633G() throws IOException {
        int i = this.f111967j;
        if (this.f111965h - i >= 4) {
            byte[] bArr = this.f111963f;
            this.f111967j = i + 4;
            return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        }
        throw zzjk.m50764a();
    }

    /* renamed from: H */
    public final long m10632H() throws IOException {
        int i = this.f111967j;
        if (this.f111965h - i >= 8) {
            byte[] bArr = this.f111963f;
            this.f111967j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzjk.m50764a();
    }

    /* renamed from: I */
    public final void m10631I() {
        int i = this.f111965h + this.f111966i;
        this.f111965h = i;
        int i2 = i - this.f111968k;
        int i3 = this.f111970m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f111966i = i4;
            this.f111965h = i - i4;
            return;
        }
        this.f111966i = 0;
    }

    @Override // p000.WB8
    /* renamed from: a */
    public final int mo10630a() throws IOException {
        if (mo10639A()) {
            this.f111969l = 0;
            return 0;
        }
        int m10635E = m10635E();
        this.f111969l = m10635E;
        if ((m10635E >>> 3) != 0) {
            return m10635E;
        }
        throw zzjk.m50761d();
    }

    @Override // p000.WB8
    /* renamed from: d */
    public final void mo10629d(int i) throws zzjk {
        if (this.f111969l == i) {
            return;
        }
        throw zzjk.m50760e();
    }

    @Override // p000.WB8
    /* renamed from: e */
    public final double mo10628e() throws IOException {
        return Double.longBitsToDouble(m10632H());
    }

    @Override // p000.WB8
    /* renamed from: f */
    public final boolean mo10627f(int i) throws IOException {
        int mo10630a;
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
                            m10636D(4);
                            return true;
                        }
                        throw zzjk.m50759f();
                    }
                    do {
                        mo10630a = mo10630a();
                        if (mo10630a == 0) {
                            break;
                        }
                    } while (mo10627f(mo10630a));
                    mo10629d(((i >>> 3) << 3) | 4);
                    return true;
                }
                m10636D(m10635E());
                return true;
            }
            m10636D(8);
            return true;
        }
        if (this.f111965h - this.f111967j >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.f111963f;
                int i4 = this.f111967j;
                this.f111967j = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzjk.m50762c();
        }
        while (i3 < 10) {
            if (m10637C() < 0) {
                i3++;
            }
        }
        throw zzjk.m50762c();
        return true;
    }

    @Override // p000.WB8
    /* renamed from: g */
    public final float mo10626g() throws IOException {
        return Float.intBitsToFloat(m10633G());
    }

    @Override // p000.WB8
    /* renamed from: h */
    public final int mo10625h(int i) throws zzjk {
        if (i >= 0) {
            int mo10638B = i + mo10638B();
            int i2 = this.f111970m;
            if (mo10638B <= i2) {
                this.f111970m = mo10638B;
                m10631I();
                return i2;
            }
            throw zzjk.m50764a();
        }
        throw zzjk.m50763b();
    }

    @Override // p000.WB8
    /* renamed from: i */
    public final long mo10624i() throws IOException {
        return m10634F();
    }

    @Override // p000.WB8
    /* renamed from: j */
    public final void mo10623j(int i) {
        this.f111970m = i;
        m10631I();
    }

    @Override // p000.WB8
    /* renamed from: l */
    public final long mo10622l() throws IOException {
        return m10634F();
    }

    @Override // p000.WB8
    /* renamed from: m */
    public final int mo10621m() throws IOException {
        return m10635E();
    }

    @Override // p000.WB8
    /* renamed from: n */
    public final long mo10620n() throws IOException {
        return m10632H();
    }

    @Override // p000.WB8
    /* renamed from: o */
    public final int mo10619o() throws IOException {
        return m10633G();
    }

    @Override // p000.WB8
    /* renamed from: p */
    public final boolean mo10618p() throws IOException {
        return m10634F() != 0;
    }

    @Override // p000.WB8
    /* renamed from: q */
    public final String mo10617q() throws IOException {
        int m10635E = m10635E();
        if (m10635E > 0) {
            int i = this.f111965h;
            int i2 = this.f111967j;
            if (m10635E <= i - i2) {
                String str = new String(this.f111963f, i2, m10635E, C52124yI8.f119325a);
                this.f111967j += m10635E;
                return str;
            }
        }
        if (m10635E == 0) {
            return "";
        }
        if (m10635E < 0) {
            throw zzjk.m50763b();
        }
        throw zzjk.m50764a();
    }

    @Override // p000.WB8
    /* renamed from: r */
    public final String mo10616r() throws IOException {
        int m10635E = m10635E();
        if (m10635E > 0) {
            int i = this.f111965h;
            int i2 = this.f111967j;
            if (m10635E <= i - i2) {
                String m11093k = C49582u09.m11093k(this.f111963f, i2, m10635E);
                this.f111967j += m10635E;
                return m11093k;
            }
        }
        if (m10635E == 0) {
            return "";
        }
        if (m10635E <= 0) {
            throw zzjk.m50763b();
        }
        throw zzjk.m50764a();
    }

    @Override // p000.WB8
    /* renamed from: s */
    public final AbstractC53119zy8 mo10615s() throws IOException {
        byte[] bArr;
        int m10635E = m10635E();
        if (m10635E > 0) {
            int i = this.f111965h;
            int i2 = this.f111967j;
            if (m10635E <= i - i2) {
                AbstractC53119zy8 m37s = AbstractC53119zy8.m37s(this.f111963f, i2, m10635E);
                this.f111967j += m10635E;
                return m37s;
            }
        }
        if (m10635E == 0) {
            return AbstractC53119zy8.f122544c;
        }
        if (m10635E > 0) {
            int i3 = this.f111965h;
            int i4 = this.f111967j;
            if (m10635E <= i3 - i4) {
                int i5 = m10635E + i4;
                this.f111967j = i5;
                bArr = Arrays.copyOfRange(this.f111963f, i4, i5);
                return AbstractC53119zy8.m38o(bArr);
            }
        }
        if (m10635E <= 0) {
            if (m10635E == 0) {
                bArr = C52124yI8.f119327c;
                return AbstractC53119zy8.m38o(bArr);
            }
            throw zzjk.m50763b();
        }
        throw zzjk.m50764a();
    }

    @Override // p000.WB8
    /* renamed from: t */
    public final int mo10614t() throws IOException {
        return m10635E();
    }

    @Override // p000.WB8
    /* renamed from: u */
    public final int mo10613u() throws IOException {
        return m10635E();
    }

    @Override // p000.WB8
    /* renamed from: v */
    public final int mo10612v() throws IOException {
        return m10633G();
    }

    @Override // p000.WB8
    /* renamed from: w */
    public final long mo10611w() throws IOException {
        return m10632H();
    }

    @Override // p000.WB8
    /* renamed from: x */
    public final int mo10610x() throws IOException {
        return WB8.m78738k(m10635E());
    }

    @Override // p000.WB8
    /* renamed from: y */
    public final long mo10609y() throws IOException {
        return WB8.m78740b(m10634F());
    }

    @Override // p000.WB8
    /* renamed from: z */
    public final long mo10608z() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m10637C = m10637C();
            j |= (m10637C & ByteCompanionObject.MAX_VALUE) << i;
            if ((m10637C & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzjk.m50762c();
    }
}
