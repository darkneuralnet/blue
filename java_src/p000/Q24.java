package p000;

import java.util.Arrays;
import java.util.Comparator;
import p000.C30303xo;
/* renamed from: Q24 */
/* loaded from: classes.dex */
public class Q24 extends C30303xo {

    /* renamed from: g */
    public int f29724g;

    /* renamed from: h */
    public C48017rN5[] f29725h;

    /* renamed from: i */
    public C48017rN5[] f29726i;

    /* renamed from: j */
    public int f29727j;

    /* renamed from: k */
    public C6648b f29728k;

    /* renamed from: l */
    public C38370b80 f29729l;

    /* renamed from: Q24$a */
    /* loaded from: classes.dex */
    public class C6647a implements Comparator<C48017rN5> {
        public C6647a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C48017rN5 c48017rN5, C48017rN5 c48017rN52) {
            return c48017rN5.f106919d - c48017rN52.f106919d;
        }
    }

    /* renamed from: Q24$b */
    /* loaded from: classes.dex */
    public class C6648b {

        /* renamed from: a */
        public C48017rN5 f29731a;

        /* renamed from: b */
        public Q24 f29732b;

        public C6648b(Q24 q24) {
            this.f29732b = q24;
        }

        /* renamed from: a */
        public boolean m89080a(C48017rN5 c48017rN5, float f) {
            boolean z = true;
            if (this.f29731a.f106917b) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f29731a.f106925j;
                    float f2 = fArr[i] + (c48017rN5.f106925j[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f29731a.f106925j[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    Q24.this.m89082G(this.f29731a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = c48017rN5.f106925j[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f29731a.f106925j[i2] = f4;
                } else {
                    this.f29731a.f106925j[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m89079b(C48017rN5 c48017rN5) {
            this.f29731a = c48017rN5;
        }

        /* renamed from: c */
        public final boolean m89078c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f29731a.f106925j[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m89077d(C48017rN5 c48017rN5) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = c48017rN5.f106925j[i];
                float f2 = this.f29731a.f106925j[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m89076e() {
            Arrays.fill(this.f29731a.f106925j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f29731a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f29731a.f106925j[i] + " ";
                }
            }
            return str + "] " + this.f29731a;
        }
    }

    public Q24(C38370b80 c38370b80) {
        super(c38370b80);
        this.f29724g = 128;
        this.f29725h = new C48017rN5[128];
        this.f29726i = new C48017rN5[128];
        this.f29727j = 0;
        this.f29728k = new C6648b(this);
        this.f29729l = c38370b80;
    }

    @Override // p000.C30303xo
    /* renamed from: B */
    public void mo4691B(C34342Lr2 c34342Lr2, C30303xo c30303xo, boolean z) {
        C48017rN5 c48017rN5 = c30303xo.f118136a;
        if (c48017rN5 == null) {
            return;
        }
        C30303xo.InterfaceC30304a interfaceC30304a = c30303xo.f118140e;
        int mo4654i = interfaceC30304a.mo4654i();
        for (int i = 0; i < mo4654i; i++) {
            C48017rN5 mo4661b = interfaceC30304a.mo4661b(i);
            float mo4653j = interfaceC30304a.mo4653j(i);
            this.f29728k.m89079b(mo4661b);
            if (this.f29728k.m89080a(c48017rN5, mo4653j)) {
                m89083F(mo4661b);
            }
            this.f118137b += c30303xo.f118137b * mo4653j;
        }
        m89082G(c48017rN5);
    }

    /* renamed from: F */
    public final void m89083F(C48017rN5 c48017rN5) {
        int i;
        int i2 = this.f29727j + 1;
        C48017rN5[] c48017rN5Arr = this.f29725h;
        if (i2 > c48017rN5Arr.length) {
            C48017rN5[] c48017rN5Arr2 = (C48017rN5[]) Arrays.copyOf(c48017rN5Arr, c48017rN5Arr.length * 2);
            this.f29725h = c48017rN5Arr2;
            this.f29726i = (C48017rN5[]) Arrays.copyOf(c48017rN5Arr2, c48017rN5Arr2.length * 2);
        }
        C48017rN5[] c48017rN5Arr3 = this.f29725h;
        int i3 = this.f29727j;
        c48017rN5Arr3[i3] = c48017rN5;
        int i4 = i3 + 1;
        this.f29727j = i4;
        if (i4 > 1 && c48017rN5Arr3[i4 - 1].f106919d > c48017rN5.f106919d) {
            int i5 = 0;
            while (true) {
                i = this.f29727j;
                if (i5 >= i) {
                    break;
                }
                this.f29726i[i5] = this.f29725h[i5];
                i5++;
            }
            Arrays.sort(this.f29726i, 0, i, new C6647a());
            for (int i6 = 0; i6 < this.f29727j; i6++) {
                this.f29725h[i6] = this.f29726i[i6];
            }
        }
        c48017rN5.f106917b = true;
        c48017rN5.m16026a(this);
    }

    /* renamed from: G */
    public final void m89082G(C48017rN5 c48017rN5) {
        int i = 0;
        while (i < this.f29727j) {
            if (this.f29725h[i] == c48017rN5) {
                while (true) {
                    int i2 = this.f29727j;
                    if (i < i2 - 1) {
                        C48017rN5[] c48017rN5Arr = this.f29725h;
                        int i3 = i + 1;
                        c48017rN5Arr[i] = c48017rN5Arr[i3];
                        i = i3;
                    } else {
                        this.f29727j = i2 - 1;
                        c48017rN5.f106917b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C30303xo, p000.C34342Lr2.InterfaceC5100a
    /* renamed from: a */
    public void mo4688a(C48017rN5 c48017rN5) {
        this.f29728k.m89079b(c48017rN5);
        this.f29728k.m89076e();
        c48017rN5.f106925j[c48017rN5.f106921f] = 1.0f;
        m89083F(c48017rN5);
    }

    @Override // p000.C30303xo, p000.C34342Lr2.InterfaceC5100a
    /* renamed from: b */
    public C48017rN5 mo4687b(C34342Lr2 c34342Lr2, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f29727j; i2++) {
            C48017rN5 c48017rN5 = this.f29725h[i2];
            if (!zArr[c48017rN5.f106919d]) {
                this.f29728k.m89079b(c48017rN5);
                if (i == -1) {
                    if (!this.f29728k.m89078c()) {
                    }
                    i = i2;
                } else {
                    if (!this.f29728k.m89077d(this.f29725h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f29725h[i];
    }

    @Override // p000.C30303xo, p000.C34342Lr2.InterfaceC5100a
    public void clear() {
        this.f29727j = 0;
        this.f118137b = 0.0f;
    }

    @Override // p000.C30303xo, p000.C34342Lr2.InterfaceC5100a
    public boolean isEmpty() {
        return this.f29727j == 0;
    }

    @Override // p000.C30303xo
    public String toString() {
        String str = " goal -> (" + this.f118137b + ") : ";
        for (int i = 0; i < this.f29727j; i++) {
            this.f29728k.m89079b(this.f29725h[i]);
            str = str + this.f29728k + " ";
        }
        return str;
    }
}
