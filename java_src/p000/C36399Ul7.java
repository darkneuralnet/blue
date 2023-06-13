package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: Ul7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36399Ul7 extends YO7 {

    /* renamed from: e */
    public final transient Map f37957e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC38821bt7 f37958f;

    public C36399Ul7(AbstractC38821bt7 abstractC38821bt7, Map map) {
        this.f37958f = abstractC38821bt7;
        this.f37957e = map;
    }

    @Override // p000.YO7
    /* renamed from: a */
    public final Set mo75121a() {
        return new C51792xk7(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f37957e;
        AbstractC38821bt7 abstractC38821bt7 = this.f37958f;
        map = abstractC38821bt7.f59723d;
        if (map2 == map) {
            abstractC38821bt7.m62184p();
        } else {
            UM7.m81584a(new C48838sl7(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return C45665nP7.m23828b(this.f37957e, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f37957e.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C45665nP7.m23829a(this.f37957e, obj);
        if (collection == null) {
            return null;
        }
        return this.f37958f.mo466e(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f37957e.hashCode();
    }

    @Override // p000.YO7, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f37958f.mo95303h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f37957e.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo467c = this.f37958f.mo467c();
        mo467c.addAll(collection);
        AbstractC38821bt7.m62189k(this.f37958f, collection.size());
        collection.clear();
        return mo467c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f37957e.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f37957e.toString();
    }
}
