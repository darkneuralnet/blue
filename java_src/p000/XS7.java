package p000;

import java.math.BigInteger;
import java.util.List;
/* renamed from: XS7 */
/* loaded from: classes6.dex */
public final class XS7 {

    /* renamed from: a */
    public C48930su9 f43270a = C48930su9.m13396D();

    /* renamed from: b */
    public C50116uu9 f43271b = C51301wu9.m6116w();

    /* renamed from: a */
    public final C50116uu9 m77002a(String str) {
        if (this.f43270a.m13398B().mo11924c() != 0) {
            C50116uu9 c50116uu9 = this.f43271b;
            LW8 m17466b = C47517qX8.m17466b();
            byte[][] bArr = {this.f43270a.m13398B().m23301D(), str.getBytes()};
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                i += bArr[i2].length;
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < 2; i4++) {
                byte[] bArr3 = bArr[i4];
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            c50116uu9.m9499y(AbstractC45836nh9.m23292x(m17466b.mo83543b(bArr2).mo20941e()));
            return c50116uu9;
        }
        return this.f43271b;
    }

    /* renamed from: b */
    public final C50116uu9 m77001b(int i) {
        C50116uu9 c50116uu9 = this.f43271b;
        c50116uu9.m9502A((this.f43270a.m13394w() * i) + this.f43270a.m13393x());
        return c50116uu9;
    }

    /* renamed from: c */
    public final C50116uu9 m77000c(RQ8<String> rq8) {
        int i;
        List<AbstractC45836nh9> m13395E = this.f43270a.m13395E();
        int size = m13395E.size() / 8;
        if (m13395E.size() % 8 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        byte[] bArr = new byte[size + i];
        for (int i2 = 0; i2 < m13395E.size(); i2++) {
            if (rq8.contains(AU7.m115724b(m13395E.get(i2).m23301D()))) {
                int i3 = i2 / 8;
                bArr[i3] = (byte) (bArr[i3] | ((byte) (1 << (i2 % 8))));
            }
        }
        C50116uu9 c50116uu9 = this.f43271b;
        c50116uu9.m9501B(AbstractC45836nh9.m23292x(bArr));
        return c50116uu9;
    }

    /* renamed from: d */
    public final C50116uu9 m76999d(int i) {
        if (this.f43270a.m13399A() != 0) {
            BigInteger valueOf = BigInteger.valueOf(i);
            BigInteger valueOf2 = BigInteger.valueOf(this.f43270a.m13392y());
            BigInteger valueOf3 = BigInteger.valueOf(this.f43270a.m13399A());
            C50116uu9 c50116uu9 = this.f43271b;
            c50116uu9.m9500C(valueOf.modPow(valueOf2, valueOf3).intValue());
            return c50116uu9;
        }
        return this.f43271b;
    }

    /* renamed from: e */
    public final C51301wu9 m76998e() {
        return this.f43271b.m64021q();
    }

    /* renamed from: f */
    public final void m76997f(C48930su9 c48930su9) {
        this.f43270a = c48930su9;
        this.f43271b = C51301wu9.m6116w();
    }
}
