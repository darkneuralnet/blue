package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* renamed from: Yr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC37389Yr7 extends AbstractC36237Tt7 implements Serializable {

    /* renamed from: d */
    public transient Map f47500d;

    /* renamed from: e */
    public transient int f47501e;

    public AbstractC37389Yr7(Map map) {
        if (map.isEmpty()) {
            this.f47500d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m74083m(AbstractC37389Yr7 abstractC37389Yr7, Object obj) {
        Object obj2;
        Map map = abstractC37389Yr7.f47500d;
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
            abstractC37389Yr7.f47501e -= size;
        }
    }

    @Override // p000.InterfaceC38559bS7
    /* renamed from: a */
    public final boolean mo64524a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f47500d.get(obj);
        if (collection == null) {
            Collection mo13403d = mo13403d();
            if (mo13403d.add(obj2)) {
                this.f47501e++;
                this.f47500d.put(obj, mo13403d);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f47501e++;
            return true;
        } else {
            return false;
        }
    }

    @Override // p000.AbstractC36237Tt7
    /* renamed from: b */
    final Map mo74090b() {
        return new C39334cl7(this, this.f47500d);
    }

    @Override // p000.AbstractC36237Tt7
    /* renamed from: c */
    final Set mo74089c() {
        return new C36408Um7(this, this.f47500d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Collection mo13403d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Collection mo17203g(Object obj, Collection collection) {
        throw null;
    }

    /* renamed from: i */
    public final Collection m74087i(Object obj) {
        Collection collection = (Collection) this.f47500d.get(obj);
        if (collection == null) {
            collection = mo13403d();
        }
        return mo17203g(obj, collection);
    }

    /* renamed from: j */
    public final List m74086j(Object obj, List list, C51842xp7 c51842xp7) {
        if (list instanceof RandomAccess) {
            return new C34779Nn7(this, obj, list, c51842xp7);
        }
        return new C43562jr7(this, obj, list, c51842xp7);
    }

    /* renamed from: n */
    public final void m74082n() {
        for (Collection collection : this.f47500d.values()) {
            collection.clear();
        }
        this.f47500d.clear();
        this.f47501e = 0;
    }
}
