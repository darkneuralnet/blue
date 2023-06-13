package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* renamed from: wR7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51018wR7 extends AbstractMap {

    /* renamed from: b */
    public transient Set f115975b;

    /* renamed from: c */
    public transient Set f115976c;

    /* renamed from: d */
    public transient Collection f115977d;

    /* renamed from: a */
    public abstract Set mo6827a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f115975b;
        if (set == null) {
            Set mo6827a = mo6827a();
            this.f115975b = mo6827a;
            return mo6827a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f115976c;
        if (set == null) {
            RQ7 rq7 = new RQ7(this);
            this.f115976c = rq7;
            return rq7;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f115977d;
        if (collection == null) {
            C42125hR7 c42125hR7 = new C42125hR7(this);
            this.f115977d = c42125hR7;
            return c42125hR7;
        }
        return collection;
    }
}
