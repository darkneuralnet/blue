package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000.C48017rN5;
/* renamed from: Xy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37211Xy0 {

    /* renamed from: b */
    public int f44304b;

    /* renamed from: c */
    public boolean f44305c;

    /* renamed from: d */
    public final C43042iz0 f44306d;

    /* renamed from: e */
    public final EnumC9561b f44307e;

    /* renamed from: f */
    public C37211Xy0 f44308f;

    /* renamed from: i */
    public C48017rN5 f44311i;

    /* renamed from: a */
    public HashSet<C37211Xy0> f44303a = null;

    /* renamed from: g */
    public int f44309g = 0;

    /* renamed from: h */
    public int f44310h = Integer.MIN_VALUE;

    /* renamed from: Xy0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C9560a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44312a;

        static {
            int[] iArr = new int[EnumC9561b.values().length];
            f44312a = iArr;
            try {
                iArr[EnumC9561b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44312a[EnumC9561b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44312a[EnumC9561b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44312a[EnumC9561b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44312a[EnumC9561b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44312a[EnumC9561b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44312a[EnumC9561b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44312a[EnumC9561b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44312a[EnumC9561b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: Xy0$b */
    /* loaded from: classes.dex */
    public enum EnumC9561b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C37211Xy0(C43042iz0 c43042iz0, EnumC9561b enumC9561b) {
        this.f44306d = c43042iz0;
        this.f44307e = enumC9561b;
    }

    /* renamed from: a */
    public boolean m76002a(C37211Xy0 c37211Xy0, int i) {
        return m76001b(c37211Xy0, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean m76001b(C37211Xy0 c37211Xy0, int i, int i2, boolean z) {
        if (c37211Xy0 == null) {
            m75986q();
            return true;
        } else if (!z && !m75987p(c37211Xy0)) {
            return false;
        } else {
            this.f44308f = c37211Xy0;
            if (c37211Xy0.f44303a == null) {
                c37211Xy0.f44303a = new HashSet<>();
            }
            HashSet<C37211Xy0> hashSet = this.f44308f.f44303a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f44309g = i;
            this.f44310h = i2;
            return true;
        }
    }

    /* renamed from: c */
    public void m76000c(int i, ArrayList<C40201eB6> arrayList, C40201eB6 c40201eB6) {
        HashSet<C37211Xy0> hashSet = this.f44303a;
        if (hashSet != null) {
            Iterator<C37211Xy0> it = hashSet.iterator();
            while (it.hasNext()) {
                C44967mE1.m25926a(it.next().f44306d, i, arrayList, c40201eB6);
            }
        }
    }

    /* renamed from: d */
    public HashSet<C37211Xy0> m75999d() {
        return this.f44303a;
    }

    /* renamed from: e */
    public int m75998e() {
        if (!this.f44305c) {
            return 0;
        }
        return this.f44304b;
    }

    /* renamed from: f */
    public int m75997f() {
        C37211Xy0 c37211Xy0;
        if (this.f44306d.m31393X() == 8) {
            return 0;
        }
        if (this.f44310h != Integer.MIN_VALUE && (c37211Xy0 = this.f44308f) != null && c37211Xy0.f44306d.m31393X() == 8) {
            return this.f44310h;
        }
        return this.f44309g;
    }

    /* renamed from: g */
    public final C37211Xy0 m75996g() {
        switch (C9560a.f44312a[this.f44307e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f44306d.f91873S;
            case 3:
                return this.f44306d.f91869Q;
            case 4:
                return this.f44306d.f91875T;
            case 5:
                return this.f44306d.f91871R;
            default:
                throw new AssertionError(this.f44307e.name());
        }
    }

    /* renamed from: h */
    public C43042iz0 m75995h() {
        return this.f44306d;
    }

    /* renamed from: i */
    public C48017rN5 m75994i() {
        return this.f44311i;
    }

    /* renamed from: j */
    public C37211Xy0 m75993j() {
        return this.f44308f;
    }

    /* renamed from: k */
    public EnumC9561b m75992k() {
        return this.f44307e;
    }

    /* renamed from: l */
    public boolean m75991l() {
        HashSet<C37211Xy0> hashSet = this.f44303a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C37211Xy0> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m75996g().m75988o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m75990m() {
        HashSet<C37211Xy0> hashSet = this.f44303a;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean m75989n() {
        return this.f44305c;
    }

    /* renamed from: o */
    public boolean m75988o() {
        return this.f44308f != null;
    }

    /* renamed from: p */
    public boolean m75987p(C37211Xy0 c37211Xy0) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c37211Xy0 == null) {
            return false;
        }
        EnumC9561b m75992k = c37211Xy0.m75992k();
        EnumC9561b enumC9561b = this.f44307e;
        if (m75992k == enumC9561b) {
            if (enumC9561b == EnumC9561b.BASELINE && (!c37211Xy0.m75995h().m31385b0() || !m75995h().m31385b0())) {
                return false;
            }
            return true;
        }
        switch (C9560a.f44312a[enumC9561b.ordinal()]) {
            case 1:
                if (m75992k == EnumC9561b.BASELINE || m75992k == EnumC9561b.CENTER_X || m75992k == EnumC9561b.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (m75992k != EnumC9561b.LEFT && m75992k != EnumC9561b.RIGHT) {
                    z = false;
                } else {
                    z = true;
                }
                if (c37211Xy0.m75995h() instanceof C50895wE1) {
                    if (z || m75992k == EnumC9561b.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 4:
            case 5:
                if (m75992k != EnumC9561b.TOP && m75992k != EnumC9561b.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (c37211Xy0.m75995h() instanceof C50895wE1) {
                    if (z2 || m75992k == EnumC9561b.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case 6:
                if (m75992k == EnumC9561b.LEFT || m75992k == EnumC9561b.RIGHT) {
                    return false;
                }
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f44307e.name());
        }
    }

    /* renamed from: q */
    public void m75986q() {
        HashSet<C37211Xy0> hashSet;
        C37211Xy0 c37211Xy0 = this.f44308f;
        if (c37211Xy0 != null && (hashSet = c37211Xy0.f44303a) != null) {
            hashSet.remove(this);
            if (this.f44308f.f44303a.size() == 0) {
                this.f44308f.f44303a = null;
            }
        }
        this.f44303a = null;
        this.f44308f = null;
        this.f44309g = 0;
        this.f44310h = Integer.MIN_VALUE;
        this.f44305c = false;
        this.f44304b = 0;
    }

    /* renamed from: r */
    public void m75985r() {
        this.f44305c = false;
        this.f44304b = 0;
    }

    /* renamed from: s */
    public void m75984s(C38370b80 c38370b80) {
        C48017rN5 c48017rN5 = this.f44311i;
        if (c48017rN5 == null) {
            this.f44311i = new C48017rN5(C48017rN5.EnumC27904a.UNRESTRICTED, null);
        } else {
            c48017rN5.m16022e();
        }
    }

    /* renamed from: t */
    public void m75983t(int i) {
        this.f44304b = i;
        this.f44305c = true;
    }

    public String toString() {
        return this.f44306d.m31335v() + ":" + this.f44307e.toString();
    }

    /* renamed from: u */
    public void m75982u(int i) {
        if (m75988o()) {
            this.f44310h = i;
        }
    }
}
