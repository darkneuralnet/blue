package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: pA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46712pA3 {

    /* renamed from: a */
    public List<C45526nA3> f103223a = new ArrayList();

    /* renamed from: b */
    public Map<C52053yB0, C45526nA3> f103224b = new HashMap();

    /* renamed from: a */
    public C45526nA3 m19850a(C52053yB0[] c52053yB0Arr, C47305qA3 c47305qA3) {
        C45526nA3 m24242s = C45526nA3.m24242s(c52053yB0Arr, c47305qA3);
        m19846e(m24242s);
        m19846e(m24242s.m24247U());
        return m24242s;
    }

    /* renamed from: b */
    public Collection<C45526nA3> m19849b() {
        return this.f103223a;
    }

    /* renamed from: c */
    public Collection<C45526nA3> m19848c() {
        return this.f103224b.values();
    }

    /* renamed from: d */
    public List<C45526nA3> m19847d() {
        ArrayList arrayList = new ArrayList();
        for (C45526nA3 c45526nA3 : m19849b()) {
            if (c45526nA3.m24266B()) {
                arrayList.add(c45526nA3);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void m19846e(C45526nA3 c45526nA3) {
        this.f103223a.add(c45526nA3);
        C45526nA3 c45526nA32 = this.f103224b.get(c45526nA3.m107413m());
        if (c45526nA32 != null) {
            c45526nA32.m107418h(c45526nA3);
        } else {
            this.f103224b.put(c45526nA3.m107413m(), c45526nA3);
        }
    }
}
