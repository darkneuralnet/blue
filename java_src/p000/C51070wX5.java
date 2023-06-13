package p000;

import ch.qos.logback.core.net.SyslogConstants;
/* renamed from: wX5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51070wX5 {

    /* renamed from: i */
    public static final C51070wX5[] f116129i;

    /* renamed from: j */
    public static C51070wX5[] f116130j;

    /* renamed from: a */
    public final boolean f116131a;

    /* renamed from: b */
    public final int f116132b;

    /* renamed from: c */
    public final int f116133c;

    /* renamed from: d */
    public final int f116134d;

    /* renamed from: e */
    public final int f116135e;

    /* renamed from: f */
    public final int f116136f;

    /* renamed from: g */
    public final int f116137g;

    /* renamed from: h */
    public final int f116138h;

    static {
        C51070wX5[] c51070wX5Arr = {new C51070wX5(false, 3, 5, 8, 8, 1), new C51070wX5(false, 5, 7, 10, 10, 1), new C51070wX5(true, 5, 7, 16, 6, 1), new C51070wX5(false, 8, 10, 12, 12, 1), new C51070wX5(true, 10, 11, 14, 6, 2), new C51070wX5(false, 12, 12, 14, 14, 1), new C51070wX5(true, 16, 14, 24, 10, 1), new C51070wX5(false, 18, 14, 16, 16, 1), new C51070wX5(false, 22, 18, 18, 18, 1), new C51070wX5(true, 22, 18, 16, 10, 2), new C51070wX5(false, 30, 20, 20, 20, 1), new C51070wX5(true, 32, 24, 16, 14, 2), new C51070wX5(false, 36, 24, 22, 22, 1), new C51070wX5(false, 44, 28, 24, 24, 1), new C51070wX5(true, 49, 28, 22, 14, 2), new C51070wX5(false, 62, 36, 14, 14, 4), new C51070wX5(false, 86, 42, 16, 16, 4), new C51070wX5(false, 114, 48, 18, 18, 4), new C51070wX5(false, SyslogConstants.LOG_LOCAL2, 56, 20, 20, 4), new C51070wX5(false, 174, 68, 22, 22, 4), new C51070wX5(false, 204, 84, 24, 24, 4, 102, 42), new C51070wX5(false, 280, 112, 14, 14, 16, 140, 56), new C51070wX5(false, 368, SyslogConstants.LOG_LOCAL2, 16, 16, 16, 92, 36), new C51070wX5(false, 456, 192, 18, 18, 16, 114, 48), new C51070wX5(false, 576, 224, 20, 20, 16, SyslogConstants.LOG_LOCAL2, 56), new C51070wX5(false, 696, 272, 22, 22, 16, 174, 68), new C51070wX5(false, 816, 336, 24, 24, 16, SyslogConstants.LOG_LOCAL1, 56), new C51070wX5(false, 1050, 408, 18, 18, 36, 175, 68), new C51070wX5(false, 1304, 496, 20, 20, 36, 163, 62), new NS0()};
        f116129i = c51070wX5Arr;
        f116130j = c51070wX5Arr;
    }

    public C51070wX5(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: l */
    public static C51070wX5 m6685l(int i, EnumC52256yX5 enumC52256yX5, X31 x31, X31 x312, boolean z) {
        C51070wX5[] c51070wX5Arr;
        for (C51070wX5 c51070wX5 : f116130j) {
            if ((enumC52256yX5 != EnumC52256yX5.FORCE_SQUARE || !c51070wX5.f116131a) && ((enumC52256yX5 != EnumC52256yX5.FORCE_RECTANGLE || c51070wX5.f116131a) && ((x31 == null || (c51070wX5.m6687j() >= x31.m77502b() && c51070wX5.m6688i() >= x31.m77503a())) && ((x312 == null || (c51070wX5.m6687j() <= x312.m77502b() && c51070wX5.m6688i() <= x312.m77503a())) && i <= c51070wX5.f116132b)))) {
                return c51070wX5;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public final int m6696a() {
        return this.f116132b;
    }

    /* renamed from: b */
    public int mo6695b(int i) {
        return this.f116137g;
    }

    /* renamed from: c */
    public final int m6694c() {
        return this.f116133c;
    }

    /* renamed from: d */
    public final int m6693d(int i) {
        return this.f116138h;
    }

    /* renamed from: e */
    public final int m6692e() {
        int i = this.f116136f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: f */
    public int mo6691f() {
        return this.f116132b / this.f116137g;
    }

    /* renamed from: g */
    public final int m6690g() {
        return m6686k() * this.f116135e;
    }

    /* renamed from: h */
    public final int m6689h() {
        return m6692e() * this.f116134d;
    }

    /* renamed from: i */
    public final int m6688i() {
        return m6690g() + (m6686k() << 1);
    }

    /* renamed from: j */
    public final int m6687j() {
        return m6689h() + (m6692e() << 1);
    }

    /* renamed from: k */
    public final int m6686k() {
        int i = this.f116136f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f116131a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        sb.append(this.f116134d);
        sb.append('x');
        sb.append(this.f116135e);
        sb.append(", symbol size ");
        sb.append(m6687j());
        sb.append('x');
        sb.append(m6688i());
        sb.append(", symbol data size ");
        sb.append(m6689h());
        sb.append('x');
        sb.append(m6690g());
        sb.append(", codewords ");
        sb.append(this.f116132b);
        sb.append('+');
        sb.append(this.f116133c);
        return sb.toString();
    }

    public C51070wX5(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f116131a = z;
        this.f116132b = i;
        this.f116133c = i2;
        this.f116134d = i3;
        this.f116135e = i4;
        this.f116136f = i5;
        this.f116137g = i6;
        this.f116138h = i7;
    }
}
