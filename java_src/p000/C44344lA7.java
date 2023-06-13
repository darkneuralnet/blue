package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: lA7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44344lA7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C50910wF7 f95680b;

    public C44344lA7(C50910wF7 c50910wF7) {
        this.f95680b = c50910wF7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f95680b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m7060x;
        Map m7070n = this.f95680b.m7070n();
        if (m7070n != null) {
            return m7070n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m7060x = this.f95680b.m7060x(entry.getKey());
            if (m7060x != -1 && C45986nw9.m22158a(C50910wF7.m7072l(this.f95680b, m7060x), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C50910wF7 c50910wF7 = this.f95680b;
        Map m7070n = c50910wF7.m7070n();
        if (m7070n != null) {
            return m7070n.entrySet().iterator();
        }
        return new C33240Gy7(c50910wF7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m7061w;
        int[] m7084B;
        Object[] m7083a;
        Object[] m7082b;
        Map m7070n = this.f95680b.m7070n();
        if (m7070n != null) {
            return m7070n.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C50910wF7 c50910wF7 = this.f95680b;
        if (c50910wF7.m7065s()) {
            return false;
        }
        m7061w = c50910wF7.m7061w();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object m7071m = C50910wF7.m7071m(this.f95680b);
        m7084B = this.f95680b.m7084B();
        m7083a = this.f95680b.m7083a();
        m7082b = this.f95680b.m7082b();
        int m27448b = C44398lG7.m27448b(key, value, m7061w, m7071m, m7084B, m7083a, m7082b);
        if (m27448b == -1) {
            return false;
        }
        this.f95680b.m7066r(m27448b, m7061w);
        C50910wF7.m7080d(this.f95680b);
        this.f95680b.m7068p();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f95680b.size();
    }
}
