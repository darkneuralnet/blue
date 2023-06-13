package p000;

import java.util.List;
/* renamed from: DT */
/* loaded from: classes6.dex */
public final class C1483DT {
    private C1483DT() {
    }

    /* renamed from: a */
    public static C1027CT m110416a(List<C45838ni1> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).m23285d() == null) {
            size--;
        }
        C1027CT c1027ct = new C1027CT(size * 12);
        int i = 0;
        int m109003b = list.get(0).m23285d().m109003b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & m109003b) != 0) {
                c1027ct.m112208w(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C45838ni1 c45838ni1 = list.get(i3);
            int m109003b2 = c45838ni1.m23286c().m109003b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & m109003b2) != 0) {
                    c1027ct.m112208w(i);
                }
                i++;
            }
            if (c45838ni1.m23285d() != null) {
                int m109003b3 = c45838ni1.m23285d().m109003b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & m109003b3) != 0) {
                        c1027ct.m112208w(i);
                    }
                    i++;
                }
            }
        }
        return c1027ct;
    }
}
