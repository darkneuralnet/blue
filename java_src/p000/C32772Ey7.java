package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: Ey7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32772Ey7 extends EU7 {

    /* renamed from: e */
    public final transient Map f8388e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC42619iG7 f8389f;

    public C32772Ey7(AbstractC42619iG7 abstractC42619iG7, Map map) {
        this.f8389f = abstractC42619iG7;
        this.f8388e = map;
    }

    @Override // p000.EU7
    /* renamed from: a */
    public final Set mo108158a() {
        return new C37668Zw7(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f8388e;
        AbstractC42619iG7 abstractC42619iG7 = this.f8389f;
        map = abstractC42619iG7.f87048d;
        if (map2 == map) {
            abstractC42619iG7.m34265n();
        } else {
            NS7.m93876a(new C35103Ox7(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return SU7.m85344b(this.f8388e, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f8388e.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) SU7.m85345a(this.f8388e, obj);
        if (collection == null) {
            return null;
        }
        return this.f8389f.mo28115g(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f8388e.hashCode();
    }

    @Override // p000.EU7, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f8389f.mo39238f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f8388e.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo28116d = this.f8389f.mo28116d();
        mo28116d.addAll(collection);
        AbstractC42619iG7 abstractC42619iG7 = this.f8389f;
        i = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i - collection.size();
        collection.clear();
        return mo28116d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8388e.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f8388e.toString();
    }
}
