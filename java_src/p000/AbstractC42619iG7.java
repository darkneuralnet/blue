package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* renamed from: iG7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC42619iG7 extends RH7 implements Serializable {

    /* renamed from: d */
    public transient Map f87048d;

    /* renamed from: e */
    public transient int f87049e;

    public AbstractC42619iG7(Map map) {
        if (map.isEmpty()) {
            this.f87048d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m34266m(AbstractC42619iG7 abstractC42619iG7, Object obj) {
        Object obj2;
        Map map = abstractC42619iG7.f87048d;
        map.getClass();
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC42619iG7.f87049e -= size;
        }
    }

    @Override // p000.InterfaceC41568gV7
    /* renamed from: a */
    public final boolean mo34274a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f87048d.get(obj);
        if (collection == null) {
            Collection mo28116d = mo28116d();
            if (mo28116d.add(obj2)) {
                this.f87049e++;
                this.f87048d.put(obj, mo28116d);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f87049e++;
            return true;
        } else {
            return false;
        }
    }

    @Override // p000.RH7
    /* renamed from: b */
    final Map mo34273b() {
        return new C32772Ey7(this, this.f87048d);
    }

    @Override // p000.RH7
    /* renamed from: c */
    final Set mo34272c() {
        return new C43158jA7(this, this.f87048d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Collection mo28116d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Collection mo28115g(Object obj, Collection collection) {
        throw null;
    }

    /* renamed from: i */
    public final Collection m34270i(Object obj) {
        Collection collection = (Collection) this.f87048d.get(obj);
        if (collection == null) {
            collection = mo28116d();
        }
        return mo28115g(obj, collection);
    }

    /* renamed from: j */
    public final List m34269j(Object obj, List list, ND7 nd7) {
        if (list instanceof RandomAccess) {
            return new WA7(this, obj, list, nd7);
        }
        return new C49132tF7(this, obj, list, nd7);
    }

    /* renamed from: n */
    public final void m34265n() {
        for (Collection collection : this.f87048d.values()) {
            collection.clear();
        }
        this.f87048d.clear();
        this.f87049e = 0;
    }
}
