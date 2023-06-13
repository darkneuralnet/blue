package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* renamed from: EU7 */
/* loaded from: classes5.dex */
public abstract class EU7 extends AbstractMap {

    /* renamed from: b */
    public transient Set f7541b;

    /* renamed from: c */
    public transient Set f7542c;

    /* renamed from: d */
    public transient Collection f7543d;

    /* renamed from: a */
    public abstract Set mo108158a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f7541b;
        if (set == null) {
            Set mo108158a = mo108158a();
            this.f7541b = mo108158a;
            return mo108158a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f7542c;
        if (set == null) {
            C40373eU7 c40373eU7 = new C40373eU7(this);
            this.f7542c = c40373eU7;
            return c40373eU7;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f7543d;
        if (collection == null) {
            C48674sU7 c48674sU7 = new C48674sU7(this);
            this.f7543d = c48674sU7;
            return c48674sU7;
        }
        return collection;
    }
}
