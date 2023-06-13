package p000;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.zxing.FormatException;
/* renamed from: Co6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32213Co6 {

    /* renamed from: h */
    public static final C32213Co6[] f4727h = m111519a();

    /* renamed from: a */
    public final int f4728a;

    /* renamed from: b */
    public final int f4729b;

    /* renamed from: c */
    public final int f4730c;

    /* renamed from: d */
    public final int f4731d;

    /* renamed from: e */
    public final int f4732e;

    /* renamed from: f */
    public final C1187c f4733f;

    /* renamed from: g */
    public final int f4734g;

    /* renamed from: Co6$b */
    /* loaded from: classes6.dex */
    public static final class C1186b {

        /* renamed from: a */
        public final int f4735a;

        /* renamed from: b */
        public final int f4736b;

        /* renamed from: a */
        public int m111510a() {
            return this.f4735a;
        }

        /* renamed from: b */
        public int m111509b() {
            return this.f4736b;
        }

        public C1186b(int i, int i2) {
            this.f4735a = i;
            this.f4736b = i2;
        }
    }

    public C32213Co6(int i, int i2, int i3, int i4, int i5, C1187c c1187c) {
        C1186b[] m111508a;
        this.f4728a = i;
        this.f4729b = i2;
        this.f4730c = i3;
        this.f4731d = i4;
        this.f4732e = i5;
        this.f4733f = c1187c;
        int m111507b = c1187c.m111507b();
        int i6 = 0;
        for (C1186b c1186b : c1187c.m111508a()) {
            i6 += c1186b.m111510a() * (c1186b.m111509b() + m111507b);
        }
        this.f4734g = i6;
    }

    /* renamed from: a */
    public static C32213Co6[] m111519a() {
        return new C32213Co6[]{new C32213Co6(1, 10, 10, 8, 8, new C1187c(5, new C1186b(1, 3))), new C32213Co6(2, 12, 12, 10, 10, new C1187c(7, new C1186b(1, 5))), new C32213Co6(3, 14, 14, 12, 12, new C1187c(10, new C1186b(1, 8))), new C32213Co6(4, 16, 16, 14, 14, new C1187c(12, new C1186b(1, 12))), new C32213Co6(5, 18, 18, 16, 16, new C1187c(14, new C1186b(1, 18))), new C32213Co6(6, 20, 20, 18, 18, new C1187c(18, new C1186b(1, 22))), new C32213Co6(7, 22, 22, 20, 20, new C1187c(20, new C1186b(1, 30))), new C32213Co6(8, 24, 24, 22, 22, new C1187c(24, new C1186b(1, 36))), new C32213Co6(9, 26, 26, 24, 24, new C1187c(28, new C1186b(1, 44))), new C32213Co6(10, 32, 32, 14, 14, new C1187c(36, new C1186b(1, 62))), new C32213Co6(11, 36, 36, 16, 16, new C1187c(42, new C1186b(1, 86))), new C32213Co6(12, 40, 40, 18, 18, new C1187c(48, new C1186b(1, 114))), new C32213Co6(13, 44, 44, 20, 20, new C1187c(56, new C1186b(1, SyslogConstants.LOG_LOCAL2))), new C32213Co6(14, 48, 48, 22, 22, new C1187c(68, new C1186b(1, 174))), new C32213Co6(15, 52, 52, 24, 24, new C1187c(42, new C1186b(2, 102))), new C32213Co6(16, 64, 64, 14, 14, new C1187c(56, new C1186b(2, 140))), new C32213Co6(17, 72, 72, 16, 16, new C1187c(36, new C1186b(4, 92))), new C32213Co6(18, 80, 80, 18, 18, new C1187c(48, new C1186b(4, 114))), new C32213Co6(19, 88, 88, 20, 20, new C1187c(56, new C1186b(4, SyslogConstants.LOG_LOCAL2))), new C32213Co6(20, 96, 96, 22, 22, new C1187c(68, new C1186b(4, 174))), new C32213Co6(21, 104, 104, 24, 24, new C1187c(56, new C1186b(6, SyslogConstants.LOG_LOCAL1))), new C32213Co6(22, 120, 120, 18, 18, new C1187c(68, new C1186b(6, 175))), new C32213Co6(23, 132, 132, 20, 20, new C1187c(62, new C1186b(8, 163))), new C32213Co6(24, SyslogConstants.LOG_LOCAL2, SyslogConstants.LOG_LOCAL2, 22, 22, new C1187c(62, new C1186b(8, 156), new C1186b(2, 155))), new C32213Co6(25, 8, 18, 6, 16, new C1187c(7, new C1186b(1, 5))), new C32213Co6(26, 8, 32, 6, 14, new C1187c(11, new C1186b(1, 10))), new C32213Co6(27, 12, 26, 10, 24, new C1187c(14, new C1186b(1, 16))), new C32213Co6(28, 12, 36, 10, 16, new C1187c(18, new C1186b(1, 22))), new C32213Co6(29, 16, 36, 14, 16, new C1187c(24, new C1186b(1, 32))), new C32213Co6(30, 16, 48, 14, 22, new C1187c(28, new C1186b(1, 49)))};
    }

    /* renamed from: h */
    public static C32213Co6 m111512h(int i, int i2) throws FormatException {
        C32213Co6[] c32213Co6Arr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C32213Co6 c32213Co6 : f4727h) {
                if (c32213Co6.f4729b == i && c32213Co6.f4730c == i2) {
                    return c32213Co6;
                }
            }
            throw FormatException.m45945a();
        }
        throw FormatException.m45945a();
    }

    /* renamed from: b */
    public int m111518b() {
        return this.f4732e;
    }

    /* renamed from: c */
    public int m111517c() {
        return this.f4731d;
    }

    /* renamed from: d */
    public C1187c m111516d() {
        return this.f4733f;
    }

    /* renamed from: e */
    public int m111515e() {
        return this.f4730c;
    }

    /* renamed from: f */
    public int m111514f() {
        return this.f4729b;
    }

    /* renamed from: g */
    public int m111513g() {
        return this.f4734g;
    }

    /* renamed from: i */
    public int m111511i() {
        return this.f4728a;
    }

    public String toString() {
        return String.valueOf(this.f4728a);
    }

    /* renamed from: Co6$c */
    /* loaded from: classes6.dex */
    public static final class C1187c {

        /* renamed from: a */
        public final int f4737a;

        /* renamed from: b */
        public final C1186b[] f4738b;

        /* renamed from: a */
        public C1186b[] m111508a() {
            return this.f4738b;
        }

        /* renamed from: b */
        public int m111507b() {
            return this.f4737a;
        }

        public C1187c(int i, C1186b c1186b) {
            this.f4737a = i;
            this.f4738b = new C1186b[]{c1186b};
        }

        public C1187c(int i, C1186b c1186b, C1186b c1186b2) {
            this.f4737a = i;
            this.f4738b = new C1186b[]{c1186b, c1186b2};
        }
    }
}
