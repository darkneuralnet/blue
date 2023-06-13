package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: cl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39334cl7 extends AbstractC51018wR7 {

    /* renamed from: e */
    public final transient Map f61206e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC37389Yr7 f61207f;

    public C39334cl7(AbstractC37389Yr7 abstractC37389Yr7, Map map) {
        this.f61207f = abstractC37389Yr7;
        this.f61206e = map;
    }

    @Override // p000.AbstractC51018wR7
    /* renamed from: a */
    public final Set mo6827a() {
        return new C44668lj7(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f61206e;
        AbstractC37389Yr7 abstractC37389Yr7 = this.f61207f;
        map = abstractC37389Yr7.f47500d;
        if (map2 == map) {
            abstractC37389Yr7.m74082n();
        } else {
            JM7.m100639a(new C41120fk7(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return LR7.m96935b(this.f61206e, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f61206e.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) LR7.m96936a(this.f61206e, obj);
        if (collection == null) {
            return null;
        }
        return this.f61207f.mo17203g(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f61206e.hashCode();
    }

    @Override // p000.AbstractC51018wR7, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f61207f.mo64522f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f61206e.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo13403d = this.f61207f.mo13403d();
        mo13403d.addAll(collection);
        AbstractC37389Yr7 abstractC37389Yr7 = this.f61207f;
        i = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i - collection.size();
        collection.clear();
        return mo13403d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f61206e.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f61206e.toString();
    }
}
