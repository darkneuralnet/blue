package p000;

import com.google.android.gms.internal.measurement.zzll;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
/* renamed from: Y69 */
/* loaded from: classes5.dex */
public final class Y69 {

    /* renamed from: f */
    public static final Y69 f44564f = new Y69(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f44565a;

    /* renamed from: b */
    public int[] f44566b;

    /* renamed from: c */
    public Object[] f44567c;

    /* renamed from: d */
    public int f44568d;

    /* renamed from: e */
    public boolean f44569e;

    public Y69(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f44568d = -1;
        this.f44565a = i;
        this.f44566b = iArr;
        this.f44567c = objArr;
        this.f44569e = z;
    }

    /* renamed from: c */
    public static Y69 m75687c() {
        return f44564f;
    }

    /* renamed from: e */
    public static Y69 m75685e(Y69 y69, Y69 y692) {
        int i = y69.f44565a + y692.f44565a;
        int[] copyOf = Arrays.copyOf(y69.f44566b, i);
        System.arraycopy(y692.f44566b, 0, copyOf, y69.f44565a, y692.f44565a);
        Object[] copyOf2 = Arrays.copyOf(y69.f44567c, i);
        System.arraycopy(y692.f44567c, 0, copyOf2, y69.f44565a, y692.f44565a);
        return new Y69(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static Y69 m75684f() {
        return new Y69(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m75689a() {
        int m88513z;
        int m88514y;
        int i;
        int i2 = this.f44568d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f44565a; i4++) {
                int i5 = this.f44566b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f44567c[i4]).intValue();
                                    i = QP8.m88514y(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzll.m51344a());
                                }
                            } else {
                                int i8 = i6 << 3;
                                Logger logger = QP8.f30335b;
                                m88513z = ((Y69) this.f44567c[i4]).m75689a();
                                int m88514y2 = QP8.m88514y(i8);
                                m88514y = m88514y2 + m88514y2;
                            }
                        } else {
                            Logger logger2 = QP8.f30335b;
                            int mo41437c = ((AbstractC40913fO8) this.f44567c[i4]).mo41437c();
                            i = QP8.m88514y(i6 << 3) + QP8.m88514y(mo41437c) + mo41437c;
                        }
                    } else {
                        ((Long) this.f44567c[i4]).longValue();
                        i = QP8.m88514y(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i9 = i6 << 3;
                    m88513z = QP8.m88513z(((Long) this.f44567c[i4]).longValue());
                    m88514y = QP8.m88514y(i9);
                }
                i = m88514y + m88513z;
                i3 += i;
            }
            this.f44568d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m75688b() {
        int i = this.f44568d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f44565a; i3++) {
                Logger logger = QP8.f30335b;
                int mo41437c = ((AbstractC40913fO8) this.f44567c[i3]).mo41437c();
                int m88514y = QP8.m88514y(mo41437c) + mo41437c;
                int m88514y2 = QP8.m88514y(16);
                int m88514y3 = QP8.m88514y(this.f44566b[i3] >>> 3);
                int m88514y4 = QP8.m88514y(8);
                i2 += m88514y4 + m88514y4 + m88514y2 + m88514y3 + QP8.m88514y(24) + m88514y;
            }
            this.f44568d = i2;
            return i2;
        }
        return i;
    }

    /* renamed from: d */
    public final Y69 m75686d(Y69 y69) {
        if (y69.equals(f44564f)) {
            return this;
        }
        m75683g();
        int i = this.f44565a + y69.f44565a;
        m75678l(i);
        System.arraycopy(y69.f44566b, 0, this.f44566b, this.f44565a, y69.f44565a);
        System.arraycopy(y69.f44567c, 0, this.f44567c, this.f44565a, y69.f44565a);
        this.f44565a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Y69)) {
            return false;
        }
        Y69 y69 = (Y69) obj;
        int i = this.f44565a;
        if (i == y69.f44565a) {
            int[] iArr = this.f44566b;
            int[] iArr2 = y69.f44566b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f44567c;
                    Object[] objArr2 = y69.f44567c;
                    int i3 = this.f44565a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m75683g() {
        if (!this.f44569e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m75682h() {
        if (this.f44569e) {
            this.f44569e = false;
        }
    }

    public final int hashCode() {
        int i = this.f44565a;
        int i2 = i + 527;
        int[] iArr = this.f44566b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.f44567c;
        int i7 = this.f44565a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    /* renamed from: i */
    public final void m75681i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f44565a; i2++) {
            K19.m99328b(sb, i, String.valueOf(this.f44566b[i2] >>> 3), this.f44567c[i2]);
        }
    }

    /* renamed from: j */
    public final void m75680j(int i, Object obj) {
        m75683g();
        m75678l(this.f44565a + 1);
        int[] iArr = this.f44566b;
        int i2 = this.f44565a;
        iArr[i2] = i;
        this.f44567c[i2] = obj;
        this.f44565a = i2 + 1;
    }

    /* renamed from: k */
    public final void m75679k(InterfaceC38633ba9 interfaceC38633ba9) throws IOException {
        if (this.f44565a != 0) {
            for (int i = 0; i < this.f44565a; i++) {
                int i2 = this.f44566b[i];
                Object obj = this.f44567c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    interfaceC38633ba9.mo64322h(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzll.m51344a());
                                }
                            } else {
                                interfaceC38633ba9.mo64306x(i4);
                                ((Y69) obj).m75679k(interfaceC38633ba9);
                                interfaceC38633ba9.zzh(i4);
                            }
                        } else {
                            interfaceC38633ba9.mo64337B(i4, (AbstractC40913fO8) obj);
                        }
                    } else {
                        interfaceC38633ba9.mo64319k(i4, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC38633ba9.mo64317m(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    /* renamed from: l */
    public final void m75678l(int i) {
        int[] iArr = this.f44566b;
        if (i > iArr.length) {
            int i2 = this.f44565a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f44566b = Arrays.copyOf(iArr, i);
            this.f44567c = Arrays.copyOf(this.f44567c, i);
        }
    }

    private Y69() {
        this(0, new int[8], new Object[8], true);
    }
}
