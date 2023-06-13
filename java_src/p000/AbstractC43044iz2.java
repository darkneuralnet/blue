package p000;

import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: iz2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43044iz2 implements P31 {

    /* renamed from: o */
    public static final long[] f91951o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: c */
    public long f91954c;

    /* renamed from: d */
    public long f91955d;

    /* renamed from: e */
    public long f91956e;

    /* renamed from: f */
    public long f91957f;

    /* renamed from: g */
    public long f91958g;

    /* renamed from: h */
    public long f91959h;

    /* renamed from: i */
    public long f91960i;

    /* renamed from: j */
    public long f91961j;

    /* renamed from: k */
    public long f91962k;

    /* renamed from: l */
    public long f91963l;

    /* renamed from: n */
    public int f91965n;

    /* renamed from: a */
    public byte[] f91952a = new byte[8];

    /* renamed from: m */
    public long[] f91964m = new long[80];

    /* renamed from: b */
    public int f91953b = 0;

    public AbstractC43044iz2() {
        mo17251r();
    }

    @Override // p000.P31
    /* renamed from: c */
    public void mo31323c(byte b) {
        byte[] bArr = this.f91952a;
        int i = this.f91953b;
        int i2 = i + 1;
        this.f91953b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            m31311q(bArr, 0);
            this.f91953b = 0;
        }
        this.f91954c++;
    }

    @Override // p000.P31
    /* renamed from: f */
    public void mo31322f(byte[] bArr, int i, int i2) {
        while (this.f91953b != 0 && i2 > 0) {
            mo31323c(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f91952a.length) {
            m31311q(bArr, i);
            byte[] bArr2 = this.f91952a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f91954c += bArr2.length;
        }
        while (i2 > 0) {
            mo31323c(bArr[i]);
            i++;
            i2--;
        }
    }

    /* renamed from: g */
    public final long m31321g(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    /* renamed from: h */
    public final long m31320h(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    /* renamed from: i */
    public final long m31319i(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    /* renamed from: j */
    public final long m31318j(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    /* renamed from: k */
    public final long m31317k(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    /* renamed from: l */
    public final long m31316l(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    /* renamed from: m */
    public final void m31315m() {
        long j = this.f91954c;
        if (j > 2305843009213693951L) {
            this.f91955d += j >>> 61;
            this.f91954c = j & 2305843009213693951L;
        }
    }

    /* renamed from: n */
    public void m31314n() {
        m31315m();
        long j = this.f91954c << 3;
        long j2 = this.f91955d;
        byte b = ByteCompanionObject.MIN_VALUE;
        while (true) {
            mo31323c(b);
            if (this.f91953b == 0) {
                m31312p(j, j2);
                m31313o();
                return;
            }
            b = 0;
        }
    }

    /* renamed from: o */
    public void m31313o() {
        m31315m();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f91964m;
            long m31318j = m31318j(jArr[i - 2]);
            long[] jArr2 = this.f91964m;
            jArr[i] = m31318j + jArr2[i - 7] + m31319i(jArr2[i - 15]) + this.f91964m[i - 16];
        }
        long j = this.f91956e;
        long j2 = this.f91957f;
        long j3 = this.f91958g;
        long j4 = this.f91959h;
        long j5 = this.f91960i;
        long j6 = this.f91961j;
        long j7 = this.f91962k;
        long j8 = j6;
        long j9 = j4;
        int i2 = 0;
        long j10 = j2;
        long j11 = j3;
        long j12 = j5;
        int i3 = 0;
        long j13 = this.f91963l;
        long j14 = j;
        long j15 = j7;
        while (i3 < 10) {
            long j16 = j12;
            long[] jArr3 = f91951o;
            int i4 = i2 + 1;
            long m31316l = j13 + m31316l(j12) + m31321g(j12, j8, j15) + jArr3[i2] + this.f91964m[i2];
            long j17 = j9 + m31316l;
            long m31317k = m31316l + m31317k(j14) + m31320h(j14, j10, j11);
            int i5 = i4 + 1;
            long m31316l2 = j15 + m31316l(j17) + m31321g(j17, j16, j8) + jArr3[i4] + this.f91964m[i4];
            long j18 = j11 + m31316l2;
            long m31317k2 = m31316l2 + m31317k(m31317k) + m31320h(m31317k, j14, j10);
            int i6 = i5 + 1;
            long m31316l3 = j8 + m31316l(j18) + m31321g(j18, j17, j16) + jArr3[i5] + this.f91964m[i5];
            long j19 = j10 + m31316l3;
            long m31317k3 = m31316l3 + m31317k(m31317k2) + m31320h(m31317k2, m31317k, j14);
            int i7 = i6 + 1;
            long m31316l4 = j16 + m31316l(j19) + m31321g(j19, j18, j17) + jArr3[i6] + this.f91964m[i6];
            long j20 = j14 + m31316l4;
            long m31317k4 = m31316l4 + m31317k(m31317k3) + m31320h(m31317k3, m31317k2, m31317k);
            int i8 = i7 + 1;
            long m31316l5 = j17 + m31316l(j20) + m31321g(j20, j19, j18) + jArr3[i7] + this.f91964m[i7];
            long j21 = m31317k + m31316l5;
            long m31317k5 = m31316l5 + m31317k(m31317k4) + m31320h(m31317k4, m31317k3, m31317k2);
            int i9 = i8 + 1;
            long m31316l6 = j18 + m31316l(j21) + m31321g(j21, j20, j19) + jArr3[i8] + this.f91964m[i8];
            long j22 = m31317k2 + m31316l6;
            long m31317k6 = m31316l6 + m31317k(m31317k5) + m31320h(m31317k5, m31317k4, m31317k3);
            j15 = j22;
            int i10 = i9 + 1;
            long m31316l7 = j19 + m31316l(j22) + m31321g(j22, j21, j20) + jArr3[i9] + this.f91964m[i9];
            long j23 = m31317k3 + m31316l7;
            j8 = j23;
            j10 = m31316l7 + m31317k(m31317k6) + m31320h(m31317k6, m31317k5, m31317k4);
            long m31316l8 = j20 + m31316l(j23) + m31321g(j23, j15, j21) + jArr3[i10] + this.f91964m[i10];
            long m31317k7 = m31316l8 + m31317k(j10) + m31320h(j10, m31317k6, m31317k5);
            i3++;
            j12 = m31317k4 + m31316l8;
            j11 = m31317k6;
            j13 = j21;
            j9 = m31317k5;
            i2 = i10 + 1;
            j14 = m31317k7;
        }
        this.f91956e += j14;
        this.f91957f += j10;
        this.f91958g += j11;
        this.f91959h += j9;
        this.f91960i += j12;
        this.f91961j += j8;
        this.f91962k += j15;
        this.f91963l += j13;
        this.f91965n = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.f91964m[i11] = 0;
        }
    }

    /* renamed from: p */
    public void m31312p(long j, long j2) {
        if (this.f91965n > 14) {
            m31313o();
        }
        long[] jArr = this.f91964m;
        jArr[14] = j2;
        jArr[15] = j;
    }

    /* renamed from: q */
    public void m31311q(byte[] bArr, int i) {
        this.f91964m[this.f91965n] = DD3.m110682b(bArr, i);
        int i2 = this.f91965n + 1;
        this.f91965n = i2;
        if (i2 == 16) {
            m31313o();
        }
    }

    /* renamed from: r */
    public void mo17251r() {
        this.f91954c = 0L;
        this.f91955d = 0L;
        int i = 0;
        this.f91953b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f91952a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f91965n = 0;
        while (true) {
            long[] jArr = this.f91964m;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }
}
