package p000;

import net.danlew.android.joda.DateUtils;
/* renamed from: tp */
/* loaded from: classes6.dex */
public class C28821tp {

    /* renamed from: a */
    public final String f111060a;

    /* renamed from: b */
    public byte[] f111061b;

    /* renamed from: c */
    public C28821tp f111062c;

    /* renamed from: tp$a */
    /* loaded from: classes6.dex */
    public static final class C28822a {

        /* renamed from: a */
        public int f111063a;

        /* renamed from: b */
        public C28821tp[] f111064b = new C28821tp[6];

        /* renamed from: a */
        public final void m11734a(C28821tp c28821tp) {
            int i = this.f111063a;
            C28821tp[] c28821tpArr = this.f111064b;
            if (i >= c28821tpArr.length) {
                C28821tp[] c28821tpArr2 = new C28821tp[c28821tpArr.length + 6];
                System.arraycopy(c28821tpArr, 0, c28821tpArr2, 0, i);
                this.f111064b = c28821tpArr2;
            }
            C28821tp[] c28821tpArr3 = this.f111064b;
            int i2 = this.f111063a;
            this.f111063a = i2 + 1;
            c28821tpArr3[i2] = c28821tp;
        }

        /* renamed from: b */
        public void m11733b(C28821tp c28821tp) {
            while (c28821tp != null) {
                if (!m11732c(c28821tp)) {
                    m11734a(c28821tp);
                }
                c28821tp = c28821tp.f111062c;
            }
        }

        /* renamed from: c */
        public final boolean m11732c(C28821tp c28821tp) {
            for (int i = 0; i < this.f111063a; i++) {
                if (this.f111064b[i].f111060a.equals(c28821tp.f111060a)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public C28821tp[] m11731d() {
            int i = this.f111063a;
            C28821tp[] c28821tpArr = new C28821tp[i];
            System.arraycopy(this.f111064b, 0, c28821tpArr, 0, i);
            return c28821tpArr;
        }
    }

    public C28821tp(String str) {
        this.f111060a = str;
    }

    /* renamed from: b */
    public static int m11743b(C52849zX5 c52849zX5, int i, int i2) {
        int i3;
        if ((i & 4096) != 0 && c52849zX5.m1227R() < 49) {
            c52849zX5.m1241D("Synthetic");
            i3 = 6;
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            c52849zX5.m1241D("Signature");
            i3 += 8;
        }
        if ((i & DateUtils.FORMAT_NUMERIC_DATE) != 0) {
            c52849zX5.m1241D("Deprecated");
            return i3 + 6;
        }
        return i3;
    }

    /* renamed from: f */
    public static void m11739f(C52849zX5 c52849zX5, int i, int i2, O70 o70) {
        if ((i & 4096) != 0 && c52849zX5.m1227R() < 49) {
            o70.m92888k(c52849zX5.m1241D("Synthetic")).m92890i(0);
        }
        if (i2 != 0) {
            o70.m92888k(c52849zX5.m1241D("Signature")).m92890i(2).m92888k(i2);
        }
        if ((i & DateUtils.FORMAT_NUMERIC_DATE) != 0) {
            o70.m92888k(c52849zX5.m1241D("Deprecated")).m92890i(0);
        }
    }

    /* renamed from: a */
    public final int m11744a(C52849zX5 c52849zX5) {
        return m11742c(c52849zX5, null, 0, -1, -1);
    }

    /* renamed from: c */
    public final int m11742c(C52849zX5 c52849zX5, byte[] bArr, int i, int i2, int i3) {
        C34970Oj0 c34970Oj0 = c52849zX5.f121497a;
        int i4 = 0;
        for (C28821tp c28821tp = this; c28821tp != null; c28821tp = c28821tp.f111062c) {
            c52849zX5.m1241D(c28821tp.f111060a);
            i4 += c28821tp.m11735j(c34970Oj0, bArr, i, i2, i3).f25908b + 6;
        }
        return i4;
    }

    /* renamed from: d */
    public final int m11741d() {
        int i = 0;
        for (C28821tp c28821tp = this; c28821tp != null; c28821tp = c28821tp.f111062c) {
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public boolean m11740e() {
        return false;
    }

    /* renamed from: g */
    public final void m11738g(C52849zX5 c52849zX5, O70 o70) {
        m11737h(c52849zX5, null, 0, -1, -1, o70);
    }

    /* renamed from: h */
    public final void m11737h(C52849zX5 c52849zX5, byte[] bArr, int i, int i2, int i3, O70 o70) {
        C34970Oj0 c34970Oj0 = c52849zX5.f121497a;
        for (C28821tp c28821tp = this; c28821tp != null; c28821tp = c28821tp.f111062c) {
            O70 m11735j = c28821tp.m11735j(c34970Oj0, bArr, i, i2, i3);
            o70.m92888k(c52849zX5.m1241D(c28821tp.f111060a)).m92890i(m11735j.f25908b);
            o70.m92891h(m11735j.f25907a, 0, m11735j.f25908b);
        }
    }

    /* renamed from: i */
    public C28821tp m11736i(C34034Kj0 c34034Kj0, int i, int i2, char[] cArr, int i3, C36160Tl2[] c36160Tl2Arr) {
        C28821tp c28821tp = new C28821tp(this.f111060a);
        byte[] bArr = new byte[i2];
        c28821tp.f111061b = bArr;
        System.arraycopy(c34034Kj0.f20097c, i, bArr, 0, i2);
        return c28821tp;
    }

    /* renamed from: j */
    public O70 m11735j(C34970Oj0 c34970Oj0, byte[] bArr, int i, int i2, int i3) {
        return new O70(this.f111061b);
    }
}
