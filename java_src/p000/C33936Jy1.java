package p000;

import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
/* renamed from: Jy1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33936Jy1 {

    /* renamed from: a */
    public C36160Tl2 f18855a;

    /* renamed from: b */
    public int[] f18856b;

    /* renamed from: c */
    public int[] f18857c;

    /* renamed from: d */
    public int[] f18858d;

    /* renamed from: e */
    public int[] f18859e;

    /* renamed from: f */
    public short f18860f;

    /* renamed from: g */
    public short f18861g;

    /* renamed from: h */
    public int f18862h;

    /* renamed from: i */
    public int[] f18863i;

    public C33936Jy1(C36160Tl2 c36160Tl2) {
        this.f18855a = c36160Tl2;
    }

    /* renamed from: e */
    public static int m99507e(C52849zX5 c52849zX5, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return m99506f(c52849zX5, C31628Ab6.m115474j((String) obj).m115480d(), 0);
        }
        return c52849zX5.m1234K("", ((C36160Tl2) obj).f36032d) | 12582912;
    }

    /* renamed from: f */
    public static int m99506f(C52849zX5 c52849zX5, String str, int i) {
        char charAt = str.charAt(i);
        int i2 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt != 'L') {
            if (charAt != 'S') {
                if (charAt != 'V') {
                    if (charAt != 'I') {
                        if (charAt == 'J') {
                            return 4194308;
                        }
                        if (charAt != 'Z') {
                            if (charAt != '[') {
                                switch (charAt) {
                                    case 'B':
                                    case 'C':
                                        break;
                                    case 'D':
                                        return 4194307;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                int i3 = i + 1;
                                while (str.charAt(i3) == '[') {
                                    i3++;
                                }
                                char charAt2 = str.charAt(i3);
                                if (charAt2 != 'F') {
                                    if (charAt2 != 'L') {
                                        if (charAt2 != 'S') {
                                            if (charAt2 != 'Z') {
                                                if (charAt2 != 'I') {
                                                    if (charAt2 != 'J') {
                                                        switch (charAt2) {
                                                            case 'B':
                                                                i2 = 4194314;
                                                                break;
                                                            case 'C':
                                                                i2 = 4194315;
                                                                break;
                                                            case 'D':
                                                                i2 = 4194307;
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException();
                                                        }
                                                    } else {
                                                        i2 = 4194308;
                                                    }
                                                } else {
                                                    i2 = 4194305;
                                                }
                                            } else {
                                                i2 = 4194313;
                                            }
                                        } else {
                                            i2 = 4194316;
                                        }
                                    } else {
                                        i2 = c52849zX5.m1236I(str.substring(i3 + 1, str.length() - 1)) | 8388608;
                                    }
                                }
                                return ((i3 - i) << 26) | i2;
                            }
                        }
                    }
                } else {
                    return 0;
                }
            }
            return 4194305;
        }
        return c52849zX5.m1236I(str.substring(i + 1, str.length() - 1)) | 8388608;
    }

    /* renamed from: g */
    public static int m99505g(C52849zX5 c52849zX5, String str) {
        return c52849zX5.m1236I(str) | 8388608;
    }

    /* renamed from: l */
    public static boolean m99500l(C52849zX5 c52849zX5, int i, int[] iArr, int i2) {
        int min;
        int m1236I;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int i5 = 4194304;
        if (i4 == 0 && (i3 & 62914560) != 8388608) {
            if (i3 == 4194309) {
                if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                    i = 4194304;
                }
                i5 = i;
            }
        } else if (i == 4194309) {
            return false;
        } else {
            if ((i & (-4194304)) == ((-4194304) & i3)) {
                if ((i3 & 62914560) == 8388608) {
                    i5 = (i & (-67108864)) | 8388608 | c52849zX5.m1237H(i & 1048575, 1048575 & i3);
                } else {
                    min = ((i & (-67108864)) - 67108864) | 8388608;
                    m1236I = c52849zX5.m1236I("java/lang/Object");
                    i5 = min | m1236I;
                }
            } else {
                int i6 = i & (-67108864);
                if (i6 != 0 || (i & 62914560) == 8388608) {
                    if (i6 != 0 && (i & 62914560) != 8388608) {
                        i6 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    min = Math.min(i6, i4) | 8388608;
                    m1236I = c52849zX5.m1236I("java/lang/Object");
                    i5 = min | m1236I;
                }
            }
        }
        if (i5 == i3) {
            return false;
        }
        iArr[i2] = i5;
        return true;
    }

    /* renamed from: s */
    public static void m99493s(C52849zX5 c52849zX5, int i, O70 o70) {
        int i2 = ((-67108864) & i) >> 26;
        if (i2 == 0) {
            int i3 = i & 1048575;
            int i4 = i & 62914560;
            if (i4 != 4194304) {
                if (i4 != 8388608) {
                    if (i4 == 12582912) {
                        o70.m92892g(8).m92888k((int) c52849zX5.m1225T(i3).f114231f);
                        return;
                    }
                    throw new AssertionError();
                }
                o70.m92892g(7).m92888k(c52849zX5.m1210e(c52849zX5.m1225T(i3).f114230e).f114226a);
                return;
            }
            o70.m92892g(i3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            sb.append('[');
            i2 = i5;
        }
        if ((i & 62914560) == 8388608) {
            sb.append('L');
            sb.append(c52849zX5.m1225T(i & 1048575).f114230e);
            sb.append(';');
        } else {
            int i6 = i & 1048575;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            switch (i6) {
                                case 9:
                                    sb.append('Z');
                                    break;
                                case 10:
                                    sb.append('B');
                                    break;
                                case 11:
                                    sb.append('C');
                                    break;
                                case 12:
                                    sb.append('S');
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        } else {
                            sb.append('J');
                        }
                    } else {
                        sb.append('D');
                    }
                } else {
                    sb.append('F');
                }
            } else {
                sb.append('I');
            }
        }
        o70.m92892g(7).m92888k(c52849zX5.m1210e(sb.toString()).f114226a);
    }

    /* renamed from: a */
    public final void m99510a(ZT2 zt2) {
        int i;
        int i2;
        int i3;
        int[] iArr = this.f18856b;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 2;
            if (i5 >= iArr.length) {
                break;
            }
            int i9 = iArr[i5];
            if (i9 != 4194308 && i9 != 4194307) {
                i8 = 1;
            }
            i5 += i8;
            if (i9 == 4194304) {
                i7++;
            } else {
                i6 += i7 + 1;
                i7 = 0;
            }
        }
        int[] iArr2 = this.f18857c;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr2.length) {
            int i12 = iArr2[i10];
            if (i12 != 4194308 && i12 != 4194307) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            i10 += i3;
            i11++;
        }
        int m73050V = zt2.m73050V(this.f18855a.f36032d, i6, i11);
        int i13 = 0;
        while (true) {
            int i14 = i6 - 1;
            if (i6 <= 0) {
                break;
            }
            int i15 = iArr[i13];
            if (i15 != 4194308 && i15 != 4194307) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            i13 += i2;
            zt2.m73052T(m73050V, i15);
            i6 = i14;
            m73050V++;
        }
        while (true) {
            int i16 = i11 - 1;
            if (i11 > 0) {
                int i17 = iArr2[i4];
                if (i17 != 4194308 && i17 != 4194307) {
                    i = 1;
                } else {
                    i = 2;
                }
                i4 += i;
                zt2.m73052T(m73050V, i17);
                m73050V++;
                i11 = i16;
            } else {
                zt2.m73051U();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m99509b(int i) {
        if (this.f18863i == null) {
            this.f18863i = new int[2];
        }
        int length = this.f18863i.length;
        int i2 = this.f18862h;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.f18863i, 0, iArr, 0, length);
            this.f18863i = iArr;
        }
        int[] iArr2 = this.f18863i;
        int i3 = this.f18862h;
        this.f18862h = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: c */
    public final void m99508c(C33936Jy1 c33936Jy1) {
        this.f18856b = c33936Jy1.f18856b;
        this.f18857c = c33936Jy1.f18857c;
        this.f18860f = (short) 0;
        this.f18858d = c33936Jy1.f18858d;
        this.f18859e = c33936Jy1.f18859e;
        this.f18861g = c33936Jy1.f18861g;
        this.f18862h = c33936Jy1.f18862h;
        this.f18863i = c33936Jy1.f18863i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo71740d(int r17, int r18, p000.AbstractC50477vX5 r19, p000.C52849zX5 r20) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C33936Jy1.mo71740d(int, int, vX5, zX5):void");
    }

    /* renamed from: h */
    public final int m99504h(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.f18856b[i & 1048575];
            if ((i & 1048576) != 0 && (i5 == 4194308 || i5 == 4194307)) {
                return 4194304;
            }
            return i5;
        } else if (i4 == 20971520) {
            int i6 = i3 + this.f18857c[i2 - (i & 1048575)];
            if ((i & 1048576) != 0 && (i6 == 4194308 || i6 == 4194307)) {
                return 4194304;
            }
            return i6;
        } else {
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m99503i(C52849zX5 c52849zX5, int i) {
        int i2;
        int m1236I;
        if (i == 4194310 || ((-4194304) & i) == 12582912) {
            for (int i3 = 0; i3 < this.f18862h; i3++) {
                int i4 = this.f18863i[i3];
                int i5 = (-67108864) & i4;
                int i6 = 62914560 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 16777216) {
                    i2 = this.f18856b[i7];
                } else {
                    if (i6 == 20971520) {
                        int[] iArr = this.f18857c;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i != i4) {
                        if (i == 4194310) {
                            m1236I = c52849zX5.m1236I(c52849zX5.m1230O());
                        } else {
                            m1236I = c52849zX5.m1236I(c52849zX5.m1225T(i & 1048575).f114230e);
                        }
                        return m1236I | 8388608;
                    }
                }
                i4 = i2 + i5;
                if (i != i4) {
                }
            }
        }
        return i;
    }

    /* renamed from: j */
    public final int m99502j() {
        return this.f18857c.length;
    }

    /* renamed from: k */
    public final int m99501k(int i) {
        int[] iArr = this.f18858d;
        if (iArr != null && i < iArr.length) {
            int i2 = iArr[i];
            if (i2 == 0) {
                int i3 = i | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                iArr[i] = i3;
                return i3;
            }
            return i2;
        }
        return i | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    /* renamed from: m */
    public final boolean m99499m(C52849zX5 c52849zX5, C33936Jy1 c33936Jy1, int i) {
        boolean z;
        int i2;
        int length = this.f18856b.length;
        int length2 = this.f18857c.length;
        boolean z2 = true;
        if (c33936Jy1.f18856b == null) {
            c33936Jy1.f18856b = new int[length];
            z = true;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int[] iArr = this.f18858d;
            if (iArr != null && i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 == 0) {
                    i2 = this.f18856b[i3];
                } else {
                    i2 = m99504h(i4, length2);
                }
            } else {
                i2 = this.f18856b[i3];
            }
            if (this.f18863i != null) {
                i2 = m99503i(c52849zX5, i2);
            }
            z |= m99500l(c52849zX5, i2, c33936Jy1.f18856b, i3);
        }
        if (i > 0) {
            for (int i5 = 0; i5 < length; i5++) {
                z |= m99500l(c52849zX5, this.f18856b[i5], c33936Jy1.f18856b, i5);
            }
            if (c33936Jy1.f18857c == null) {
                c33936Jy1.f18857c = new int[1];
            } else {
                z2 = z;
            }
            return m99500l(c52849zX5, i, c33936Jy1.f18857c, 0) | z2;
        }
        int length3 = this.f18857c.length + this.f18860f;
        if (c33936Jy1.f18857c == null) {
            c33936Jy1.f18857c = new int[this.f18861g + length3];
        } else {
            z2 = z;
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int i7 = this.f18857c[i6];
            if (this.f18863i != null) {
                i7 = m99503i(c52849zX5, i7);
            }
            z2 |= m99500l(c52849zX5, i7, c33936Jy1.f18857c, i6);
        }
        for (int i8 = 0; i8 < this.f18861g; i8++) {
            int m99504h = m99504h(this.f18859e[i8], length2);
            if (this.f18863i != null) {
                m99504h = m99503i(c52849zX5, m99504h);
            }
            z2 |= m99500l(c52849zX5, m99504h, c33936Jy1.f18857c, length3 + i8);
        }
        return z2;
    }

    /* renamed from: n */
    public final int m99498n() {
        short s = this.f18861g;
        if (s > 0) {
            int[] iArr = this.f18859e;
            short s2 = (short) (s - 1);
            this.f18861g = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.f18860f - 1);
        this.f18860f = s3;
        return (-s3) | 20971520;
    }

    /* renamed from: o */
    public final void m99497o(int i) {
        short s = this.f18861g;
        if (s >= i) {
            this.f18861g = (short) (s - i);
            return;
        }
        this.f18860f = (short) (this.f18860f - (i - s));
        this.f18861g = (short) 0;
    }

    /* renamed from: p */
    public final void m99496p(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            m99497o((C31628Ab6.m115481c(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            m99497o(1);
        } else {
            m99497o(2);
        }
    }

    /* renamed from: q */
    public final void m99495q(int i) {
        if (this.f18859e == null) {
            this.f18859e = new int[10];
        }
        int length = this.f18859e.length;
        short s = this.f18861g;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f18859e, 0, iArr, 0, length);
            this.f18859e = iArr;
        }
        int[] iArr2 = this.f18859e;
        short s2 = this.f18861g;
        short s3 = (short) (s2 + 1);
        this.f18861g = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f18860f + s3);
        C36160Tl2 c36160Tl2 = this.f18855a;
        if (s4 > c36160Tl2.f36036h) {
            c36160Tl2.f36036h = s4;
        }
    }

    /* renamed from: r */
    public final void m99494r(C52849zX5 c52849zX5, String str) {
        int i = 0;
        if (str.charAt(0) == '(') {
            i = C31628Ab6.m115473k(str);
        }
        int m99506f = m99506f(c52849zX5, str, i);
        if (m99506f != 0) {
            m99495q(m99506f);
            if (m99506f == 4194308 || m99506f == 4194307) {
                m99495q(4194304);
            }
        }
    }

    /* renamed from: t */
    public final void m99492t(C52849zX5 c52849zX5, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f18856b[i3] = m99507e(c52849zX5, objArr[i4]);
            Object obj = objArr[i4];
            if (obj != InterfaceC33551Ih3.f16058e && obj != InterfaceC33551Ih3.f16057d) {
                i3 = i5;
            } else {
                this.f18856b[i5] = 4194304;
                i3 = i5 + 1;
            }
        }
        while (true) {
            int[] iArr = this.f18856b;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            Object obj2 = objArr2[i7];
            if (obj2 == InterfaceC33551Ih3.f16058e || obj2 == InterfaceC33551Ih3.f16057d) {
                i6++;
            }
        }
        this.f18857c = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.f18857c[i8] = m99507e(c52849zX5, objArr2[i9]);
            Object obj3 = objArr2[i9];
            if (obj3 != InterfaceC33551Ih3.f16058e && obj3 != InterfaceC33551Ih3.f16057d) {
                i8 = i10;
            } else {
                this.f18857c[i10] = 4194304;
                i8 = i10 + 1;
            }
        }
        this.f18861g = (short) 0;
        this.f18862h = 0;
    }

    /* renamed from: u */
    public final void m99491u(C52849zX5 c52849zX5, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f18856b = iArr;
        this.f18857c = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & DateUtils.FORMAT_ABBREV_RELATIVE) == 0) {
                iArr[0] = c52849zX5.m1236I(c52849zX5.m1230O()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (C31628Ab6 c31628Ab6 : C31628Ab6.m115482b(str)) {
            int m99506f = m99506f(c52849zX5, c31628Ab6.m115480d(), 0);
            int[] iArr2 = this.f18856b;
            int i4 = i3 + 1;
            iArr2[i3] = m99506f;
            if (m99506f != 4194308 && m99506f != 4194307) {
                i3 = i4;
            } else {
                i3 = i4 + 1;
                iArr2[i4] = 4194304;
            }
        }
        while (i3 < i2) {
            this.f18856b[i3] = 4194304;
            i3++;
        }
    }

    /* renamed from: v */
    public final void m99490v(int i, int i2) {
        if (this.f18858d == null) {
            this.f18858d = new int[10];
        }
        int length = this.f18858d.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f18858d, 0, iArr, 0, length);
            this.f18858d = iArr;
        }
        this.f18858d[i] = i2;
    }
}
