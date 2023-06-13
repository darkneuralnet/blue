package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: I49 */
/* loaded from: classes5.dex */
public final class I49 extends QG7 {

    /* renamed from: e */
    public final transient Map f14460e;

    /* renamed from: f */
    public final /* synthetic */ Jt9 f14461f;

    public I49(Jt9 jt9, Map map) {
        this.f14461f = jt9;
        this.f14460e = map;
    }

    @Override // p000.QG7
    /* renamed from: a */
    public final Set mo88673a() {
        return new C49259tT8(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f14460e;
        Jt9 jt9 = this.f14461f;
        map = jt9.f18416d;
        if (map2 == map) {
            jt9.m99580p();
        } else {
            C37695Zz7.m72141a(new C42198hZ8(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return HH7.m104059b(this.f14460e, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f14460e.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) HH7.m104060a(this.f14460e, obj);
        if (collection == null) {
            return null;
        }
        return this.f14461f.mo16017e(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f14460e.hashCode();
    }

    @Override // p000.QG7, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f14461f.mo1545h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f14460e.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo16018c = this.f14461f.mo16018c();
        mo16018c.addAll(collection);
        Jt9.m99585k(this.f14461f, collection.size());
        collection.clear();
        return mo16018c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14460e.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f14460e.toString();
    }
}
