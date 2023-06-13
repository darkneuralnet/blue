package p000;
/* renamed from: NE1 */
/* loaded from: classes6.dex */
public final class NE1 {

    /* renamed from: a */
    public final C36160Tl2 f24313a;

    /* renamed from: b */
    public final C36160Tl2 f24314b;

    /* renamed from: c */
    public final C36160Tl2 f24315c;

    /* renamed from: d */
    public final int f24316d;

    /* renamed from: e */
    public final String f24317e;

    /* renamed from: f */
    public NE1 f24318f;

    public NE1(C36160Tl2 c36160Tl2, C36160Tl2 c36160Tl22, C36160Tl2 c36160Tl23, int i, String str) {
        this.f24313a = c36160Tl2;
        this.f24314b = c36160Tl22;
        this.f24315c = c36160Tl23;
        this.f24316d = i;
        this.f24317e = str;
    }

    /* renamed from: a */
    public static int m94169a(NE1 ne1) {
        int i = 0;
        while (ne1 != null) {
            i++;
            ne1 = ne1.f24318f;
        }
        return i;
    }

    /* renamed from: b */
    public static int m94168b(NE1 ne1) {
        return (m94169a(ne1) * 8) + 2;
    }

    /* renamed from: c */
    public static void m94167c(NE1 ne1, O70 o70) {
        o70.m92888k(m94169a(ne1));
        while (ne1 != null) {
            o70.m92888k(ne1.f24313a.f36032d).m92888k(ne1.f24314b.f36032d).m92888k(ne1.f24315c.f36032d).m92888k(ne1.f24316d);
            ne1 = ne1.f24318f;
        }
    }

    /* renamed from: d */
    public static NE1 m94166d(NE1 ne1, C36160Tl2 c36160Tl2, C36160Tl2 c36160Tl22) {
        int i;
        if (ne1 == null) {
            return null;
        }
        NE1 m94166d = m94166d(ne1.f24318f, c36160Tl2, c36160Tl22);
        ne1.f24318f = m94166d;
        C36160Tl2 c36160Tl23 = ne1.f24313a;
        int i2 = c36160Tl23.f36032d;
        C36160Tl2 c36160Tl24 = ne1.f24314b;
        int i3 = c36160Tl24.f36032d;
        int i4 = c36160Tl2.f36032d;
        if (c36160Tl22 == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = c36160Tl22.f36032d;
        }
        if (i4 < i3 && i > i2) {
            if (i4 <= i2) {
                if (i >= i3) {
                    return m94166d;
                }
                return new NE1(ne1, c36160Tl22, c36160Tl24);
            } else if (i >= i3) {
                return new NE1(ne1, c36160Tl23, c36160Tl2);
            } else {
                ne1.f24318f = new NE1(ne1, c36160Tl22, c36160Tl24);
                return new NE1(ne1, ne1.f24313a, c36160Tl2);
            }
        }
        return ne1;
    }

    public NE1(NE1 ne1, C36160Tl2 c36160Tl2, C36160Tl2 c36160Tl22) {
        this(c36160Tl2, c36160Tl22, ne1.f24315c, ne1.f24316d, ne1.f24317e);
        this.f24318f = ne1.f24318f;
    }
}
