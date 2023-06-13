package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: nt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45954nt7 extends AbstractC46547ot7 {

    /* renamed from: e */
    public final InputStream f100998e;

    /* renamed from: f */
    public final byte[] f100999f;

    /* renamed from: g */
    public int f101000g;

    /* renamed from: h */
    public int f101001h;

    /* renamed from: i */
    public int f101002i;

    /* renamed from: j */
    public int f101003j;

    /* renamed from: k */
    public int f101004k;

    /* renamed from: l */
    public int f101005l;

    public /* synthetic */ C45954nt7(InputStream inputStream, int i, C44768lt7 c44768lt7) {
        super(null);
        this.f101005l = Integer.MAX_VALUE;
        C46557ou7.m20292f(inputStream, "input");
        this.f100998e = inputStream;
        this.f100999f = new byte[4096];
        this.f101000g = 0;
        this.f101002i = 0;
        this.f101004k = 0;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: A */
    public final void mo20352A(int i) throws zzaqw {
        if (this.f101003j != i) {
            throw zzaqw.m51286b();
        }
    }

    /* renamed from: B */
    public final void m22233B(int i) throws IOException {
        int i2 = this.f101000g;
        int i3 = this.f101002i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f101002i = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f101004k;
            int i6 = i5 + i3;
            int i7 = this.f101005l;
            if (i6 + i <= i7) {
                this.f101004k = i6;
                this.f101000g = 0;
                this.f101002i = 0;
                while (i4 < i) {
                    try {
                        long j = i - i4;
                        try {
                            long skip = this.f100998e.skip(j);
                            int i8 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i8 >= 0 && skip <= j) {
                                if (i8 == 0) {
                                    break;
                                }
                                i4 += (int) skip;
                            } else {
                                String valueOf = String.valueOf(this.f100998e.getClass());
                                StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                                sb.append(valueOf);
                                sb.append("#skip returned invalid result: ");
                                sb.append(skip);
                                sb.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(sb.toString());
                            }
                        } catch (zzaqw e) {
                            e.m51277k();
                            throw e;
                        }
                    } finally {
                        this.f101004k += i4;
                        m22231D();
                    }
                }
                if (i4 < i) {
                    int i9 = this.f101000g;
                    int i10 = i9 - this.f101002i;
                    this.f101002i = i9;
                    m22230E(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.f101000g;
                        if (i11 > i12) {
                            i10 += i12;
                            this.f101002i = i12;
                            m22230E(1);
                        } else {
                            this.f101002i = i11;
                            return;
                        }
                    }
                }
            } else {
                m22233B((i7 - i5) - i3);
                throw zzaqw.m51278j();
            }
        } else {
            throw zzaqw.m51282f();
        }
    }

    /* renamed from: C */
    public final List m22232C(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f100998e.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f101004k += read;
                    i2 += read;
                } else {
                    throw zzaqw.m51278j();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: D */
    public final void m22231D() {
        int i = this.f101000g + this.f101001h;
        this.f101000g = i;
        int i2 = this.f101004k + i;
        int i3 = this.f101005l;
        if (i2 <= i3) {
            this.f101001h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f101001h = i4;
        this.f101000g = i - i4;
    }

    /* renamed from: E */
    public final void m22230E(int i) throws IOException {
        if (!m22229F(i)) {
            if (i > (Integer.MAX_VALUE - this.f101004k) - this.f101002i) {
                throw zzaqw.m51279i();
            }
            throw zzaqw.m51278j();
        }
    }

    /* renamed from: F */
    public final boolean m22229F(int i) throws IOException {
        int i2 = this.f101002i;
        int i3 = this.f101000g;
        if (i2 + i > i3) {
            int i4 = this.f101004k;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f101005l) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f100999f;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f101004k + i2;
                this.f101004k = i4;
                i3 = this.f101000g - i2;
                this.f101000g = i3;
                this.f101002i = 0;
            }
            try {
                int read = this.f100998e.read(this.f100999f, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f101000g += read;
                    m22231D();
                    if (this.f101000g >= i) {
                        return true;
                    }
                    return m22229F(i);
                }
                String valueOf = String.valueOf(this.f100998e.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } catch (zzaqw e) {
                e.m51277k();
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
    public final byte[] m22228G(int i, boolean z) throws IOException {
        byte[] m22227H = m22227H(i);
        if (m22227H != null) {
            return m22227H;
        }
        int i2 = this.f101002i;
        int i3 = this.f101000g;
        int i4 = i3 - i2;
        this.f101004k += i3;
        this.f101002i = 0;
        this.f101000g = 0;
        List<byte[]> m22232C = m22232C(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f100999f, i2, bArr, 0, i4);
        for (byte[] bArr2 : m22232C) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: H */
    public final byte[] m22227H(int i) throws IOException {
        if (i == 0) {
            return C46557ou7.f102754d;
        }
        if (i >= 0) {
            int i2 = this.f101004k;
            int i3 = this.f101002i;
            int i4 = i2 + i3 + i;
            if ((-2147483647) + i4 <= 0) {
                int i5 = this.f101005l;
                if (i4 <= i5) {
                    int i6 = this.f101000g - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f100998e.available()) {
                                return null;
                            }
                        } catch (zzaqw e) {
                            e.m51277k();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f100999f, this.f101002i, bArr, 0, i6);
                    this.f101004k += this.f101000g;
                    this.f101002i = 0;
                    this.f101000g = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f100998e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f101004k += read;
                                i6 += read;
                            } else {
                                throw zzaqw.m51278j();
                            }
                        } catch (zzaqw e2) {
                            e2.m51277k();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                m22233B((i5 - i2) - i3);
                throw zzaqw.m51278j();
            }
            throw zzaqw.m51279i();
        }
        throw zzaqw.m51282f();
    }

    /* renamed from: I */
    public final byte m22226I() throws IOException {
        if (this.f101002i == this.f101000g) {
            m22230E(1);
        }
        byte[] bArr = this.f100999f;
        int i = this.f101002i;
        this.f101002i = i + 1;
        return bArr[i];
    }

    /* renamed from: J */
    public final int m22225J() throws IOException {
        int i = this.f101002i;
        if (this.f101000g - i < 4) {
            m22230E(4);
            i = this.f101002i;
        }
        byte[] bArr = this.f100999f;
        this.f101002i = i + 4;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m22224K() throws IOException {
        int i;
        int i2 = this.f101002i;
        int i3 = this.f101000g;
        if (i3 != i2) {
            byte[] bArr = this.f100999f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f101002i = i4;
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
                this.f101002i = i5;
                return i;
            }
        }
        return (int) m22221N();
    }

    /* renamed from: L */
    public final long m22223L() throws IOException {
        int i = this.f101002i;
        if (this.f101000g - i < 8) {
            m22230E(8);
            i = this.f101002i;
        }
        byte[] bArr = this.f100999f;
        this.f101002i = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: M */
    public final long m22222M() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f101002i;
        int i3 = this.f101000g;
        if (i3 != i2) {
            byte[] bArr = this.f100999f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f101002i = i4;
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
                                                    this.f101002i = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f101002i = i5;
                                return j2;
                            }
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f101002i = i5;
                    return j2;
                }
                j2 = i;
                this.f101002i = i5;
                return j2;
            }
        }
        return m22221N();
    }

    /* renamed from: N */
    public final long m22221N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m22226I = m22226I();
            j |= (m22226I & ByteCompanionObject.MAX_VALUE) << i;
            if ((m22226I & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzaqw.m51283e();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: a */
    public final void mo20351a(int i) {
        this.f101005l = i;
        m22231D();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: b */
    public final boolean mo20350b() throws IOException {
        return this.f101002i == this.f101000g && !m22229F(1);
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: c */
    public final boolean mo20349c() throws IOException {
        return m22222M() != 0;
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
                            m22233B(4);
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
                m22233B(m22224K());
                return true;
            }
            m22233B(8);
            return true;
        }
        if (this.f101000g - this.f101002i >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.f100999f;
                int i4 = this.f101002i;
                this.f101002i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzaqw.m51283e();
        }
        while (i3 < 10) {
            if (m22226I() < 0) {
                i3++;
            }
        }
        throw zzaqw.m51283e();
        return true;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: h */
    public final double mo20344h() throws IOException {
        return Double.longBitsToDouble(m22223L());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: i */
    public final float mo20343i() throws IOException {
        return Float.intBitsToFloat(m22225J());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: j */
    public final int mo20342j() {
        return this.f101004k + this.f101002i;
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: k */
    public final int mo20341k(int i) throws zzaqw {
        if (i >= 0) {
            int i2 = i + this.f101004k + this.f101002i;
            int i3 = this.f101005l;
            if (i2 <= i3) {
                this.f101005l = i2;
                m22231D();
                return i3;
            }
            throw zzaqw.m51278j();
        }
        throw zzaqw.m51282f();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: l */
    public final int mo20340l() throws IOException {
        return m22224K();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: m */
    public final int mo20339m() throws IOException {
        return m22225J();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: n */
    public final int mo20338n() throws IOException {
        return m22224K();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: o */
    public final int mo20337o() throws IOException {
        return m22225J();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: p */
    public final int mo20336p() throws IOException {
        return AbstractC46547ot7.m20347e(m22224K());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: q */
    public final int mo20335q() throws IOException {
        if (mo20350b()) {
            this.f101003j = 0;
            return 0;
        }
        int m22224K = m22224K();
        this.f101003j = m22224K;
        if ((m22224K >>> 3) != 0) {
            return m22224K;
        }
        throw zzaqw.m51285c();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: r */
    public final int mo20334r() throws IOException {
        return m22224K();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: s */
    public final long mo20333s() throws IOException {
        return m22223L();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: t */
    public final long mo20332t() throws IOException {
        return m22222M();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: u */
    public final long mo20331u() throws IOException {
        return m22223L();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: v */
    public final long mo20330v() throws IOException {
        return AbstractC46547ot7.m20346f(m22222M());
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: w */
    public final long mo20329w() throws IOException {
        return m22222M();
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: x */
    public final AbstractC44175kt7 mo20328x() throws IOException {
        int m22224K = m22224K();
        int i = this.f101000g;
        int i2 = this.f101002i;
        if (m22224K <= i - i2 && m22224K > 0) {
            AbstractC44175kt7 m28227D = AbstractC44175kt7.m28227D(this.f100999f, i2, m22224K);
            this.f101002i += m22224K;
            return m28227D;
        } else if (m22224K != 0) {
            byte[] m22227H = m22227H(m22224K);
            if (m22227H != null) {
                return AbstractC44175kt7.m28228C(m22227H);
            }
            int i3 = this.f101002i;
            int i4 = this.f101000g;
            int i5 = i4 - i3;
            this.f101004k += i4;
            this.f101002i = 0;
            this.f101000g = 0;
            List<byte[]> m22232C = m22232C(m22224K - i5);
            byte[] bArr = new byte[m22224K];
            System.arraycopy(this.f100999f, i3, bArr, 0, i5);
            for (byte[] bArr2 : m22232C) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return AbstractC44175kt7.m28224H(bArr);
        } else {
            return AbstractC44175kt7.f95165c;
        }
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: y */
    public final String mo20327y() throws IOException {
        int m22224K = m22224K();
        if (m22224K > 0) {
            int i = this.f101000g;
            int i2 = this.f101002i;
            if (m22224K <= i - i2) {
                String str = new String(this.f100999f, i2, m22224K, C46557ou7.f102752b);
                this.f101002i += m22224K;
                return str;
            }
        }
        if (m22224K == 0) {
            return "";
        }
        if (m22224K <= this.f101000g) {
            m22230E(m22224K);
            String str2 = new String(this.f100999f, this.f101002i, m22224K, C46557ou7.f102752b);
            this.f101002i += m22224K;
            return str2;
        }
        return new String(m22228G(m22224K, false), C46557ou7.f102752b);
    }

    @Override // p000.AbstractC46547ot7
    /* renamed from: z */
    public final String mo20326z() throws IOException {
        byte[] m22228G;
        int m22224K = m22224K();
        int i = this.f101002i;
        int i2 = this.f101000g;
        if (m22224K <= i2 - i && m22224K > 0) {
            m22228G = this.f100999f;
            this.f101002i = i + m22224K;
        } else if (m22224K == 0) {
            return "";
        } else {
            i = 0;
            if (m22224K <= i2) {
                m22230E(m22224K);
                m22228G = this.f100999f;
                this.f101002i = m22224K;
            } else {
                m22228G = m22228G(m22224K, false);
            }
        }
        return C33456Hw7.m103208g(m22228G, i, m22224K);
    }
}
