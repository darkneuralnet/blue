package p000;

import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.KotlinVersion;
/* renamed from: S78 */
/* loaded from: classes5.dex */
public final class S78 {

    /* renamed from: A */
    public int f33198A;

    /* renamed from: B */
    public int f33199B;

    /* renamed from: C */
    public Field f33200C;

    /* renamed from: D */
    public Object f33201D;

    /* renamed from: E */
    public Object f33202E;

    /* renamed from: F */
    public Object f33203F;

    /* renamed from: a */
    public final C42546i88 f33204a;

    /* renamed from: b */
    public final Object[] f33205b;

    /* renamed from: c */
    public Class<?> f33206c;

    /* renamed from: d */
    public final int f33207d;

    /* renamed from: e */
    public final int f33208e;

    /* renamed from: f */
    public final int f33209f;

    /* renamed from: g */
    public final int f33210g;

    /* renamed from: h */
    public final int f33211h;

    /* renamed from: i */
    public final int f33212i;

    /* renamed from: j */
    public final int f33213j;

    /* renamed from: k */
    public final int f33214k;

    /* renamed from: l */
    public final int f33215l;

    /* renamed from: m */
    public final int f33216m;

    /* renamed from: n */
    public final int[] f33217n;

    /* renamed from: o */
    public int f33218o;

    /* renamed from: p */
    public int f33219p;

    /* renamed from: q */
    public int f33220q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f33221r = Integer.MIN_VALUE;

    /* renamed from: s */
    public int f33222s = 0;

    /* renamed from: t */
    public int f33223t = 0;

    /* renamed from: u */
    public int f33224u = 0;

    /* renamed from: v */
    public int f33225v = 0;

    /* renamed from: w */
    public int f33226w = 0;

    /* renamed from: x */
    public int f33227x;

    /* renamed from: y */
    public int f33228y;

    /* renamed from: z */
    public int f33229z;

    public S78(Class<?> cls, String str, Object[] objArr) {
        this.f33206c = cls;
        C42546i88 c42546i88 = new C42546i88(str);
        this.f33204a = c42546i88;
        this.f33205b = objArr;
        this.f33207d = c42546i88.m34399b();
        int m34399b = c42546i88.m34399b();
        this.f33208e = m34399b;
        if (m34399b == 0) {
            this.f33209f = 0;
            this.f33210g = 0;
            this.f33211h = 0;
            this.f33212i = 0;
            this.f33213j = 0;
            this.f33215l = 0;
            this.f33214k = 0;
            this.f33216m = 0;
            this.f33217n = null;
            return;
        }
        int m34399b2 = c42546i88.m34399b();
        this.f33209f = m34399b2;
        int m34399b3 = c42546i88.m34399b();
        this.f33210g = m34399b3;
        this.f33211h = c42546i88.m34399b();
        this.f33212i = c42546i88.m34399b();
        this.f33215l = c42546i88.m34399b();
        this.f33214k = c42546i88.m34399b();
        this.f33213j = c42546i88.m34399b();
        this.f33216m = c42546i88.m34399b();
        int m34399b4 = c42546i88.m34399b();
        this.f33217n = m34399b4 != 0 ? new int[m34399b4] : null;
        this.f33218o = (m34399b2 << 1) + m34399b3;
    }

    /* renamed from: c */
    public static Field m85956c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        if (m85950i() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r6.f33202E = m85953f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
        if (((r6.f33228y & 2048) != 0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
        if (m85950i() != false) goto L32;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m85958a() {
        int i;
        Object type;
        if (this.f33204a.m34400a()) {
            this.f33227x = this.f33204a.m34399b();
            int m34399b = this.f33204a.m34399b();
            this.f33228y = m34399b;
            int i2 = m34399b & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f33229z = i2;
            int i3 = this.f33227x;
            if (i3 < this.f33220q) {
                this.f33220q = i3;
            }
            if (i3 > this.f33221r) {
                this.f33221r = i3;
            }
            XQ7 xq7 = XQ7.f43209y0;
            if (i2 == xq7.m77019a()) {
                this.f33222s++;
            } else if (this.f33229z >= XQ7.f43208y.m77019a() && this.f33229z <= XQ7.f43207x0.m77019a()) {
                this.f33223t++;
            }
            int i4 = this.f33226w + 1;
            this.f33226w = i4;
            if (C38981c98.m61825s(this.f33220q, this.f33227x, i4)) {
                int i5 = this.f33227x + 1;
                this.f33225v = i5;
                i = i5 - this.f33220q;
            } else {
                i = this.f33224u + 1;
            }
            this.f33224u = i;
            if ((this.f33228y & 1024) != 0) {
                int[] iArr = this.f33217n;
                int i6 = this.f33219p;
                this.f33219p = i6 + 1;
                iArr[i6] = this.f33227x;
            }
            this.f33201D = null;
            this.f33202E = null;
            this.f33203F = null;
            if (m85948k()) {
                this.f33198A = this.f33204a.m34399b();
                if (this.f33229z != XQ7.f43190p.m77019a() + 51 && this.f33229z != XQ7.f43206x.m77019a() + 51) {
                    if (this.f33229z == XQ7.f43196s.m77019a() + 51) {
                    }
                    return true;
                }
                type = m85953f();
            } else {
                this.f33200C = m85956c(this.f33206c, (String) m85953f());
                if (m85944o()) {
                    this.f33199B = this.f33204a.m34399b();
                }
                if (this.f33229z == XQ7.f43190p.m77019a() || this.f33229z == XQ7.f43206x.m77019a()) {
                    type = this.f33200C.getType();
                } else {
                    if (this.f33229z != XQ7.f43167H.m77019a() && this.f33229z != XQ7.f43207x0.m77019a()) {
                        if (this.f33229z != XQ7.f43196s.m77019a() && this.f33229z != XQ7.f43170K.m77019a() && this.f33229z != XQ7.f43197s0.m77019a()) {
                            if (this.f33229z == xq7.m77019a()) {
                                this.f33203F = m85953f();
                            }
                            return true;
                        }
                    }
                    type = m85953f();
                }
            }
            this.f33201D = type;
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Object m85953f() {
        Object[] objArr = this.f33205b;
        int i = this.f33218o;
        this.f33218o = i + 1;
        return objArr[i];
    }

    /* renamed from: g */
    public final int m85952g() {
        return this.f33227x;
    }

    /* renamed from: h */
    public final int m85951h() {
        return this.f33229z;
    }

    /* renamed from: i */
    public final boolean m85950i() {
        return (this.f33207d & 1) == 1;
    }

    /* renamed from: k */
    public final boolean m85948k() {
        return this.f33229z > XQ7.f43209y0.m77019a();
    }

    /* renamed from: l */
    public final Field m85947l() {
        int i = this.f33198A << 1;
        Object obj = this.f33205b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field m85956c = m85956c(this.f33206c, (String) obj);
        this.f33205b[i] = m85956c;
        return m85956c;
    }

    /* renamed from: m */
    public final Field m85946m() {
        int i = (this.f33198A << 1) + 1;
        Object obj = this.f33205b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field m85956c = m85956c(this.f33206c, (String) obj);
        this.f33205b[i] = m85956c;
        return m85956c;
    }

    /* renamed from: n */
    public final Field m85945n() {
        return this.f33200C;
    }

    /* renamed from: o */
    public final boolean m85944o() {
        return m85950i() && this.f33229z <= XQ7.f43206x.m77019a();
    }

    /* renamed from: p */
    public final Field m85943p() {
        int i = (this.f33209f << 1) + (this.f33199B / 32);
        Object obj = this.f33205b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field m85956c = m85956c(this.f33206c, (String) obj);
        this.f33205b[i] = m85956c;
        return m85956c;
    }

    /* renamed from: q */
    public final int m85942q() {
        return this.f33199B % 32;
    }

    /* renamed from: r */
    public final boolean m85941r() {
        return (this.f33228y & 256) != 0;
    }

    /* renamed from: s */
    public final boolean m85940s() {
        return (this.f33228y & 512) != 0;
    }

    /* renamed from: t */
    public final Object m85939t() {
        return this.f33201D;
    }

    /* renamed from: u */
    public final Object m85938u() {
        return this.f33202E;
    }

    /* renamed from: v */
    public final Object m85937v() {
        return this.f33203F;
    }
}
