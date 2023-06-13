package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: li9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44660li9 extends AbstractC49403ti9 {

    /* renamed from: e */
    public final InputStream f96627e;

    /* renamed from: f */
    public final byte[] f96628f;

    /* renamed from: g */
    public int f96629g;

    /* renamed from: h */
    public int f96630h;

    /* renamed from: i */
    public int f96631i;

    /* renamed from: j */
    public int f96632j;

    /* renamed from: k */
    public int f96633k;

    /* renamed from: l */
    public int f96634l;

    public /* synthetic */ C44660li9(InputStream inputStream, int i, C50578vh9 c50578vh9) {
        super(null);
        this.f96634l = Integer.MAX_VALUE;
        Fn9.m106449f(inputStream, "input");
        this.f96627e = inputStream;
        this.f96628f = new byte[4096];
        this.f96629g = 0;
        this.f96631i = 0;
        this.f96633k = 0;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: A */
    public final void mo11878A(int i) throws zzrr {
        if (this.f96632j == i) {
            return;
        }
        throw zzrr.m51029b();
    }

    /* renamed from: B */
    public final void m26925B(int i) throws IOException {
        int i2 = this.f96629g;
        int i3 = this.f96631i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f96631i = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f96633k;
            int i6 = i5 + i3;
            int i7 = this.f96634l;
            if (i6 + i <= i7) {
                this.f96633k = i6;
                this.f96629g = 0;
                this.f96631i = 0;
                while (i4 < i) {
                    try {
                        long j = i - i4;
                        try {
                            long skip = this.f96627e.skip(j);
                            int i8 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i8 >= 0 && skip <= j) {
                                if (i8 == 0) {
                                    break;
                                }
                                i4 += (int) skip;
                            } else {
                                String valueOf = String.valueOf(this.f96627e.getClass());
                                StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                                sb.append(valueOf);
                                sb.append("#skip returned invalid result: ");
                                sb.append(skip);
                                sb.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(sb.toString());
                            }
                        } catch (zzrr e) {
                            e.m51020k();
                            throw e;
                        }
                    } finally {
                        this.f96633k += i4;
                        m26923D();
                    }
                }
                if (i4 < i) {
                    int i9 = this.f96629g;
                    int i10 = i9 - this.f96631i;
                    this.f96631i = i9;
                    m26922E(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.f96629g;
                        if (i11 > i12) {
                            i10 += i12;
                            this.f96631i = i12;
                            m26922E(1);
                        } else {
                            this.f96631i = i11;
                            return;
                        }
                    }
                }
            } else {
                m26925B((i7 - i5) - i3);
                throw zzrr.m51021j();
            }
        } else {
            throw zzrr.m51025f();
        }
    }

    /* renamed from: C */
    public final List<byte[]> m26924C(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f96627e.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f96633k += read;
                    i2 += read;
                } else {
                    throw zzrr.m51021j();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: D */
    public final void m26923D() {
        int i = this.f96629g + this.f96630h;
        this.f96629g = i;
        int i2 = this.f96633k + i;
        int i3 = this.f96634l;
        if (i2 <= i3) {
            this.f96630h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f96630h = i4;
        this.f96629g = i - i4;
    }

    /* renamed from: E */
    public final void m26922E(int i) throws IOException {
        if (!m26921F(i)) {
            if (i > (Integer.MAX_VALUE - this.f96633k) - this.f96631i) {
                throw zzrr.m51022i();
            }
            throw zzrr.m51021j();
        }
    }

    /* renamed from: F */
    public final boolean m26921F(int i) throws IOException {
        int i2 = this.f96631i;
        int i3 = this.f96629g;
        if (i2 + i > i3) {
            int i4 = this.f96633k;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f96634l) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f96628f;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f96633k + i2;
                this.f96633k = i4;
                i3 = this.f96629g - i2;
                this.f96629g = i3;
                this.f96631i = 0;
            }
            try {
                int read = this.f96627e.read(this.f96628f, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f96629g += read;
                    m26923D();
                    if (this.f96629g >= i) {
                        return true;
                    }
                    return m26921F(i);
                }
                String valueOf = String.valueOf(this.f96627e.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } catch (zzrr e) {
                e.m51020k();
                throw e;
            }
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: G */
    public final byte[] m26920G(int i, boolean z) throws IOException {
        byte[] m26919H = m26919H(i);
        if (m26919H != null) {
            return m26919H;
        }
        int i2 = this.f96631i;
        int i3 = this.f96629g;
        int i4 = i3 - i2;
        this.f96633k += i3;
        this.f96631i = 0;
        this.f96629g = 0;
        List<byte[]> m26924C = m26924C(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f96628f, i2, bArr, 0, i4);
        for (byte[] bArr2 : m26924C) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: H */
    public final byte[] m26919H(int i) throws IOException {
        if (i == 0) {
            return Fn9.f10240c;
        }
        if (i >= 0) {
            int i2 = this.f96633k;
            int i3 = this.f96631i;
            int i4 = i2 + i3 + i;
            if ((-2147483647) + i4 <= 0) {
                int i5 = this.f96634l;
                if (i4 <= i5) {
                    int i6 = this.f96629g - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f96627e.available()) {
                                return null;
                            }
                        } catch (zzrr e) {
                            e.m51020k();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f96628f, this.f96631i, bArr, 0, i6);
                    this.f96633k += this.f96629g;
                    this.f96631i = 0;
                    this.f96629g = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f96627e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f96633k += read;
                                i6 += read;
                            } else {
                                throw zzrr.m51021j();
                            }
                        } catch (zzrr e2) {
                            e2.m51020k();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                m26925B((i5 - i2) - i3);
                throw zzrr.m51021j();
            }
            throw zzrr.m51022i();
        }
        throw zzrr.m51025f();
    }

    /* renamed from: I */
    public final byte m26918I() throws IOException {
        if (this.f96631i == this.f96629g) {
            m26922E(1);
        }
        byte[] bArr = this.f96628f;
        int i = this.f96631i;
        this.f96631i = i + 1;
        return bArr[i];
    }

    /* renamed from: J */
    public final int m26917J() throws IOException {
        int i = this.f96631i;
        if (this.f96629g - i < 4) {
            m26922E(4);
            i = this.f96631i;
        }
        byte[] bArr = this.f96628f;
        this.f96631i = i + 4;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m26916K() throws IOException {
        int i;
        int i2 = this.f96631i;
        int i3 = this.f96629g;
        if (i3 != i2) {
            byte[] bArr = this.f96628f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f96631i = i4;
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
                this.f96631i = i5;
                return i;
            }
        }
        return (int) m26913N();
    }

    /* renamed from: L */
    public final long m26915L() throws IOException {
        int i = this.f96631i;
        if (this.f96629g - i < 8) {
            m26922E(8);
            i = this.f96631i;
        }
        byte[] bArr = this.f96628f;
        this.f96631i = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: M */
    public final long m26914M() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f96631i;
        int i3 = this.f96629g;
        if (i3 != i2) {
            byte[] bArr = this.f96628f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f96631i = i4;
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
                                                    this.f96631i = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f96631i = i5;
                                return j2;
                            }
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f96631i = i5;
                    return j2;
                }
                j2 = i;
                this.f96631i = i5;
                return j2;
            }
        }
        return m26913N();
    }

    /* renamed from: N */
    public final long m26913N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m26918I = m26918I();
            j |= (m26918I & ByteCompanionObject.MAX_VALUE) << i;
            if ((m26918I & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzrr.m51026e();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: a */
    public final void mo11877a(int i) {
        this.f96634l = i;
        m26923D();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: b */
    public final boolean mo11876b() throws IOException {
        if (this.f96631i == this.f96629g && !m26921F(1)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: c */
    public final boolean mo11875c() throws IOException {
        return m26914M() != 0;
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
                            m26925B(4);
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
                m26925B(m26916K());
                return true;
            }
            m26925B(8);
            return true;
        }
        if (this.f96629g - this.f96631i >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.f96628f;
                int i4 = this.f96631i;
                this.f96631i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzrr.m51026e();
        }
        while (i3 < 10) {
            if (m26918I() < 0) {
                i3++;
            }
        }
        throw zzrr.m51026e();
        return true;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: h */
    public final double mo11870h() throws IOException {
        return Double.longBitsToDouble(m26915L());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: i */
    public final float mo11869i() throws IOException {
        return Float.intBitsToFloat(m26917J());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: j */
    public final int mo11868j() {
        return this.f96633k + this.f96631i;
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: k */
    public final int mo11867k(int i) throws zzrr {
        if (i >= 0) {
            int i2 = i + this.f96633k + this.f96631i;
            int i3 = this.f96634l;
            if (i2 <= i3) {
                this.f96634l = i2;
                m26923D();
                return i3;
            }
            throw zzrr.m51021j();
        }
        throw zzrr.m51025f();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: l */
    public final int mo11866l() throws IOException {
        return m26916K();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: m */
    public final int mo11865m() throws IOException {
        return m26917J();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: n */
    public final int mo11864n() throws IOException {
        return m26916K();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: o */
    public final int mo11863o() throws IOException {
        return m26917J();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: p */
    public final int mo11862p() throws IOException {
        return AbstractC49403ti9.m11873e(m26916K());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: q */
    public final int mo11861q() throws IOException {
        if (mo11876b()) {
            this.f96632j = 0;
            return 0;
        }
        int m26916K = m26916K();
        this.f96632j = m26916K;
        if ((m26916K >>> 3) != 0) {
            return m26916K;
        }
        throw zzrr.m51028c();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: r */
    public final int mo11860r() throws IOException {
        return m26916K();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: s */
    public final long mo11859s() throws IOException {
        return m26915L();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: t */
    public final long mo11858t() throws IOException {
        return m26914M();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: u */
    public final long mo11857u() throws IOException {
        return m26915L();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: v */
    public final long mo11856v() throws IOException {
        return AbstractC49403ti9.m11872f(m26914M());
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: w */
    public final long mo11855w() throws IOException {
        return m26914M();
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: x */
    public final AbstractC45836nh9 mo11854x() throws IOException {
        int m26916K = m26916K();
        int i = this.f96629g;
        int i2 = this.f96631i;
        if (m26916K <= i - i2 && m26916K > 0) {
            AbstractC45836nh9 m23291y = AbstractC45836nh9.m23291y(this.f96628f, i2, m26916K);
            this.f96631i += m26916K;
            return m23291y;
        } else if (m26916K != 0) {
            byte[] m26919H = m26919H(m26916K);
            if (m26919H != null) {
                return AbstractC45836nh9.m23292x(m26919H);
            }
            int i3 = this.f96631i;
            int i4 = this.f96629g;
            int i5 = i4 - i3;
            this.f96633k += i4;
            this.f96631i = 0;
            this.f96629g = 0;
            List<byte[]> m26924C = m26924C(m26916K - i5);
            byte[] bArr = new byte[m26916K];
            System.arraycopy(this.f96628f, i3, bArr, 0, i5);
            for (byte[] bArr2 : m26924C) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return AbstractC45836nh9.m23303A(bArr);
        } else {
            return AbstractC45836nh9.f100361c;
        }
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: y */
    public final String mo11853y() throws IOException {
        int m26916K = m26916K();
        if (m26916K > 0) {
            int i = this.f96629g;
            int i2 = this.f96631i;
            if (m26916K <= i - i2) {
                String str = new String(this.f96628f, i2, m26916K, Fn9.f10238a);
                this.f96631i += m26916K;
                return str;
            }
        }
        if (m26916K == 0) {
            return "";
        }
        if (m26916K <= this.f96629g) {
            m26922E(m26916K);
            String str2 = new String(this.f96628f, this.f96631i, m26916K, Fn9.f10238a);
            this.f96631i += m26916K;
            return str2;
        }
        return new String(m26920G(m26916K, false), Fn9.f10238a);
    }

    @Override // p000.AbstractC49403ti9
    /* renamed from: z */
    public final String mo11852z() throws IOException {
        byte[] m26920G;
        int m26916K = m26916K();
        int i = this.f96631i;
        int i2 = this.f96629g;
        if (m26916K <= i2 - i && m26916K > 0) {
            m26920G = this.f96628f;
            this.f96631i = i + m26916K;
        } else if (m26916K == 0) {
            return "";
        } else {
            i = 0;
            if (m26916K <= i2) {
                m26922E(m26916K);
                m26920G = this.f96628f;
                this.f96631i = m26916K;
            } else {
                m26920G = m26920G(m26916K, false);
            }
        }
        return Ps9.m89657d(m26920G, i, m26916K);
    }
}
