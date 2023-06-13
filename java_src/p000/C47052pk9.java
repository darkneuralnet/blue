package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* renamed from: pk9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47052pk9 extends AbstractMap {

    /* renamed from: b */
    public final int f104004b;

    /* renamed from: e */
    public boolean f104007e;

    /* renamed from: f */
    public volatile C39326ck9 f104008f;

    /* renamed from: c */
    public List f104005c = Collections.emptyList();

    /* renamed from: d */
    public Map f104006d = Collections.emptyMap();

    /* renamed from: g */
    public Map f104009g = Collections.emptyMap();

    /* renamed from: a */
    public void mo18844a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f104007e) {
            if (this.f104006d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f104006d);
            }
            this.f104006d = unmodifiableMap;
            if (this.f104009g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f104009g);
            }
            this.f104009g = unmodifiableMap2;
            this.f104007e = true;
        }
    }

    /* renamed from: b */
    public final int m18843b() {
        return this.f104005c.size();
    }

    /* renamed from: c */
    public final Iterable m18842c() {
        if (this.f104006d.isEmpty()) {
            return C50006uj9.m9825a();
        }
        return this.f104006d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m18831n();
        if (!this.f104005c.isEmpty()) {
            this.f104005c.clear();
        }
        if (!this.f104006d.isEmpty()) {
            this.f104006d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m18834k(comparable) < 0 && !this.f104006d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m18831n();
        int m18834k = m18834k(comparable);
        if (m18834k >= 0) {
            return ((Bj9) this.f104005c.get(m18834k)).setValue(obj);
        }
        m18831n();
        if (this.f104005c.isEmpty() && !(this.f104005c instanceof ArrayList)) {
            this.f104005c = new ArrayList(this.f104004b);
        }
        int i = -(m18834k + 1);
        if (i >= this.f104004b) {
            return m18832m().put(comparable, obj);
        }
        int size = this.f104005c.size();
        int i2 = this.f104004b;
        if (size == i2) {
            Bj9 bj9 = (Bj9) this.f104005c.remove(i2 - 1);
            m18832m().put(bj9.m113571a(), bj9.getValue());
        }
        this.f104005c.add(i, new Bj9(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f104008f == null) {
            this.f104008f = new C39326ck9(this, null);
        }
        return this.f104008f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47052pk9)) {
            return super.equals(obj);
        }
        C47052pk9 c47052pk9 = (C47052pk9) obj;
        int size = size();
        if (size != c47052pk9.size()) {
            return false;
        }
        int m18843b = m18843b();
        if (m18843b == c47052pk9.m18843b()) {
            for (int i = 0; i < m18843b; i++) {
                if (!m18838g(i).equals(c47052pk9.m18838g(i))) {
                    return false;
                }
            }
            if (m18843b == size) {
                return true;
            }
            return this.f104006d.equals(c47052pk9.f104006d);
        }
        return entrySet().equals(c47052pk9.entrySet());
    }

    /* renamed from: g */
    public final Map.Entry m18838g(int i) {
        return (Map.Entry) this.f104005c.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m18834k = m18834k(comparable);
        if (m18834k >= 0) {
            return ((Bj9) this.f104005c.get(m18834k)).getValue();
        }
        return this.f104006d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m18843b = m18843b();
        int i = 0;
        for (int i2 = 0; i2 < m18843b; i2++) {
            i += ((Bj9) this.f104005c.get(i2)).hashCode();
        }
        if (this.f104006d.size() > 0) {
            return i + this.f104006d.hashCode();
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m18835j() {
        return this.f104007e;
    }

    /* renamed from: k */
    public final int m18834k(Comparable comparable) {
        int size = this.f104005c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((Bj9) this.f104005c.get(size)).m113571a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((Bj9) this.f104005c.get(i2)).m113571a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    /* renamed from: l */
    public final Object m18833l(int i) {
        m18831n();
        Object value = ((Bj9) this.f104005c.remove(i)).getValue();
        if (!this.f104006d.isEmpty()) {
            Iterator it = m18832m().entrySet().iterator();
            List list = this.f104005c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Bj9(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap m18832m() {
        m18831n();
        if (this.f104006d.isEmpty() && !(this.f104006d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f104006d = treeMap;
            this.f104009g = treeMap.descendingMap();
        }
        return (SortedMap) this.f104006d;
    }

    /* renamed from: n */
    public final void m18831n() {
        if (this.f104007e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m18831n();
        Comparable comparable = (Comparable) obj;
        int m18834k = m18834k(comparable);
        if (m18834k >= 0) {
            return m18833l(m18834k);
        }
        if (this.f104006d.isEmpty()) {
            return null;
        }
        return this.f104006d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f104005c.size() + this.f104006d.size();
    }
}
