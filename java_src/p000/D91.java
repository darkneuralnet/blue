package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: D91 */
/* loaded from: classes8.dex */
public class D91 {

    /* renamed from: a */
    public List f5287a = new ArrayList();

    /* renamed from: b */
    public Map f5288b = new TreeMap();

    /* renamed from: a */
    public void m110873a(C47293q91 c47293q91) {
        this.f5287a.add(c47293q91);
        this.f5288b.put(new C33938Jy3(c47293q91.m18068n()), c47293q91);
    }

    /* renamed from: b */
    public void m110872b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m110873a((C47293q91) it.next());
        }
    }

    /* renamed from: c */
    public C47293q91 m110871c(C47293q91 c47293q91) {
        return (C47293q91) this.f5288b.get(new C33938Jy3(c47293q91.m18068n()));
    }

    /* renamed from: d */
    public List m110870d() {
        return this.f5287a;
    }

    /* renamed from: e */
    public Iterator m110869e() {
        return this.f5287a.iterator();
    }
}
