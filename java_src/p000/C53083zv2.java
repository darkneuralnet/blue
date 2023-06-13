package p000;

import java.util.LinkedHashSet;
import java.util.Locale;
/* renamed from: zv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53083zv2 {
    private C53083zv2() {
    }

    /* renamed from: a */
    public static C50711vv2 m114a(C50711vv2 c50711vv2, C50711vv2 c50711vv22) {
        Locale m7771c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < c50711vv2.m7766h() + c50711vv22.m7766h(); i++) {
            if (i < c50711vv2.m7766h()) {
                m7771c = c50711vv2.m7771c(i);
            } else {
                m7771c = c50711vv22.m7771c(i - c50711vv2.m7766h());
            }
            if (m7771c != null) {
                linkedHashSet.add(m7771c);
            }
        }
        return C50711vv2.m7773a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: b */
    public static C50711vv2 m113b(C50711vv2 c50711vv2, C50711vv2 c50711vv22) {
        if (c50711vv2 != null && !c50711vv2.m7767g()) {
            return m114a(c50711vv2, c50711vv22);
        }
        return C50711vv2.m7768f();
    }
}
