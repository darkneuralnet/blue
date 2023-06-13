package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: kj7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44075kj7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C34545Mn7 f94837b;

    public C44075kj7(C34545Mn7 c34545Mn7) {
        this.f94837b = c34545Mn7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f94837b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m94801x;
        Map m94811n = this.f94837b.m94811n();
        if (m94811n != null) {
            return m94811n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m94801x = this.f94837b.m94801x(entry.getKey());
            if (m94801x != -1 && QX7.m88418a(C34545Mn7.m94813l(this.f94837b, m94801x), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C34545Mn7 c34545Mn7 = this.f94837b;
        Map m94811n = c34545Mn7.m94811n();
        if (m94811n != null) {
            return m94811n.entrySet().iterator();
        }
        return new C51169wh7(c34545Mn7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m94802w;
        int[] m94825B;
        Object[] m94824a;
        Object[] m94823b;
        Map m94811n = this.f94837b.m94811n();
        if (m94811n != null) {
            return m94811n.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C34545Mn7 c34545Mn7 = this.f94837b;
        if (c34545Mn7.m94806s()) {
            return false;
        }
        m94802w = c34545Mn7.m94802w();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object m94812m = C34545Mn7.m94812m(this.f94837b);
        m94825B = this.f94837b.m94825B();
        m94824a = this.f94837b.m94824a();
        m94823b = this.f94837b.m94823b();
        int m108339b = C32682Eo7.m108339b(key, value, m94802w, m94812m, m94825B, m94824a, m94823b);
        if (m108339b == -1) {
            return false;
        }
        this.f94837b.m94807r(m108339b, m94802w);
        C34545Mn7.m94821d(this.f94837b);
        this.f94837b.m94809p();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f94837b.size();
    }
}
