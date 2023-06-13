package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* renamed from: Jt9 */
/* loaded from: classes5.dex */
public abstract class Jt9 extends AbstractC47765qw9 implements Serializable {

    /* renamed from: d */
    public transient Map f18416d;

    /* renamed from: e */
    public transient int f18417e;

    public Jt9(Map map) {
        if (map.isEmpty()) {
            this.f18416d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public static /* synthetic */ int m99588f(Jt9 jt9) {
        int i = jt9.f18417e;
        jt9.f18417e = i + 1;
        return i;
    }

    /* renamed from: g */
    public static /* synthetic */ int m99587g(Jt9 jt9) {
        int i = jt9.f18417e;
        jt9.f18417e = i - 1;
        return i;
    }

    /* renamed from: j */
    public static /* synthetic */ int m99586j(Jt9 jt9, int i) {
        int i2 = jt9.f18417e + i;
        jt9.f18417e = i2;
        return i2;
    }

    /* renamed from: k */
    public static /* synthetic */ int m99585k(Jt9 jt9, int i) {
        int i2 = jt9.f18417e - i;
        jt9.f18417e = i2;
        return i2;
    }

    /* renamed from: n */
    public static /* synthetic */ Map m99582n(Jt9 jt9) {
        return jt9.f18416d;
    }

    /* renamed from: o */
    public static /* synthetic */ void m99581o(Jt9 jt9, Object obj) {
        Object obj2;
        Map map = jt9.f18416d;
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
            jt9.f18417e -= size;
        }
    }

    @Override // p000.AbstractC47765qw9
    /* renamed from: a */
    final Map mo16771a() {
        return new I49(this, this.f18416d);
    }

    @Override // p000.AbstractC47765qw9
    /* renamed from: b */
    final Set mo16770b() {
        return new C41052fd9(this, this.f18416d);
    }

    /* renamed from: c */
    public abstract Collection mo16018c();

    /* renamed from: e */
    public Collection mo16017e(Object obj, Collection collection) {
        throw null;
    }

    @Override // p000.InterfaceC52716zI7
    /* renamed from: i */
    public final boolean mo1544i(Object obj, Object obj2) {
        Collection collection = (Collection) this.f18416d.get(obj);
        if (collection == null) {
            Collection mo16018c = mo16018c();
            if (mo16018c.add(obj2)) {
                this.f18417e++;
                this.f18416d.put(obj, mo16018c);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f18417e++;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: l */
    public final Collection m99584l(Object obj) {
        Collection collection = (Collection) this.f18416d.get(obj);
        if (collection == null) {
            collection = mo16018c();
        }
        return mo16017e(obj, collection);
    }

    /* renamed from: m */
    public final List m99583m(Object obj, List list, Do9 do9) {
        if (list instanceof RandomAccess) {
            return new C52950zh9(this, obj, list, do9);
        }
        return new C41795gs9(this, obj, list, do9);
    }

    /* renamed from: p */
    public final void m99580p() {
        for (Collection collection : this.f18416d.values()) {
            collection.clear();
        }
        this.f18416d.clear();
        this.f18417e = 0;
    }
}
