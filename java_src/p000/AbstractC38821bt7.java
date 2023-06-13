package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* renamed from: bt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC38821bt7 extends AbstractC32970Fu7 implements Serializable {

    /* renamed from: d */
    public transient Map f59723d;

    /* renamed from: e */
    public transient int f59724e;

    public AbstractC38821bt7(Map map) {
        if (map.isEmpty()) {
            this.f59723d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public static /* synthetic */ int m62193f(AbstractC38821bt7 abstractC38821bt7) {
        int i = abstractC38821bt7.f59724e;
        abstractC38821bt7.f59724e = i + 1;
        return i;
    }

    /* renamed from: g */
    public static /* synthetic */ int m62192g(AbstractC38821bt7 abstractC38821bt7) {
        int i = abstractC38821bt7.f59724e;
        abstractC38821bt7.f59724e = i - 1;
        return i;
    }

    /* renamed from: j */
    public static /* synthetic */ int m62190j(AbstractC38821bt7 abstractC38821bt7, int i) {
        int i2 = abstractC38821bt7.f59724e + i;
        abstractC38821bt7.f59724e = i2;
        return i2;
    }

    /* renamed from: k */
    public static /* synthetic */ int m62189k(AbstractC38821bt7 abstractC38821bt7, int i) {
        int i2 = abstractC38821bt7.f59724e - i;
        abstractC38821bt7.f59724e = i2;
        return i2;
    }

    /* renamed from: o */
    public static /* synthetic */ void m62185o(AbstractC38821bt7 abstractC38821bt7, Object obj) {
        Object obj2;
        Map map = abstractC38821bt7.f59723d;
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
            abstractC38821bt7.f59724e -= size;
        }
    }

    @Override // p000.AbstractC32970Fu7
    /* renamed from: a */
    final Map mo62195a() {
        return new C36399Ul7(this, this.f59723d);
    }

    @Override // p000.AbstractC32970Fu7
    /* renamed from: b */
    final Set mo62194b() {
        return new C38178ao7(this, this.f59723d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Collection mo467c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Collection mo466e(Object obj, Collection collection) {
        throw null;
    }

    @Override // p000.MQ7
    /* renamed from: i */
    public final boolean mo62191i(Object obj, Object obj2) {
        Collection collection = (Collection) this.f59723d.get(obj);
        if (collection == null) {
            Collection mo467c = mo467c();
            if (mo467c.add(obj2)) {
                this.f59724e++;
                this.f59723d.put(obj, mo467c);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f59724e++;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: l */
    public final Collection m62188l(Object obj) {
        Collection collection = (Collection) this.f59723d.get(obj);
        if (collection == null) {
            collection = mo467c();
        }
        return mo466e(obj, collection);
    }

    /* renamed from: m */
    public final List m62187m(Object obj, List list, C32700Eq7 c32700Eq7) {
        if (list instanceof RandomAccess) {
            return new C36894Wo7(this, obj, list, c32700Eq7);
        }
        return new C44165ks7(this, obj, list, c32700Eq7);
    }

    /* renamed from: p */
    public final void m62184p() {
        for (Collection collection : this.f59723d.values()) {
            collection.clear();
        }
        this.f59723d.clear();
        this.f59724e = 0;
    }
}
