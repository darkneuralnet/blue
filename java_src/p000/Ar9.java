package p000;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* renamed from: Ar9 */
/* loaded from: classes6.dex */
public class Ar9<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f1275b;

    /* renamed from: e */
    public boolean f1278e;

    /* renamed from: f */
    public volatile C52457yr9 f1279f;

    /* renamed from: c */
    public List<C50086ur9> f1276c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f1277d = Collections.emptyMap();

    /* renamed from: g */
    public Map<K, V> f1280g = Collections.emptyMap();

    /* renamed from: a */
    public void mo28370a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f1278e) {
            if (this.f1277d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f1277d);
            }
            this.f1277d = unmodifiableMap;
            if (this.f1280g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f1280g);
            }
            this.f1280g = unmodifiableMap2;
            this.f1278e = true;
        }
    }

    /* renamed from: b */
    public final int m115021b() {
        return this.f1276c.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> m115020c() {
        if (this.f1277d.isEmpty()) {
            return C48900sr9.m13564a();
        }
        return this.f1277d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m115009n();
        if (!this.f1276c.isEmpty()) {
            this.f1276c.clear();
        }
        if (!this.f1277d.isEmpty()) {
            this.f1277d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m115012k(comparable) < 0 && !this.f1277d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final V put(K k, V v) {
        m115009n();
        int m115012k = m115012k(k);
        if (m115012k >= 0) {
            return (V) this.f1276c.get(m115012k).setValue(v);
        }
        m115009n();
        if (this.f1276c.isEmpty() && !(this.f1276c instanceof ArrayList)) {
            this.f1276c = new ArrayList(this.f1275b);
        }
        int i = -(m115012k + 1);
        if (i >= this.f1275b) {
            return m115010m().put(k, v);
        }
        int size = this.f1276c.size();
        int i2 = this.f1275b;
        if (size == i2) {
            C50086ur9 remove = this.f1276c.remove(i2 - 1);
            m115010m().put((K) remove.m9646a(), (V) remove.getValue());
        }
        this.f1276c.add(i, new C50086ur9(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f1279f == null) {
            this.f1279f = new C52457yr9(this, null);
        }
        return this.f1279f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ar9)) {
            return super.equals(obj);
        }
        Ar9 ar9 = (Ar9) obj;
        int size = size();
        if (size != ar9.size()) {
            return false;
        }
        int m115021b = m115021b();
        if (m115021b == ar9.m115021b()) {
            for (int i = 0; i < m115021b; i++) {
                if (!m115016g(i).equals(ar9.m115016g(i))) {
                    return false;
                }
            }
            if (m115021b == size) {
                return true;
            }
            return this.f1277d.equals(ar9.f1277d);
        }
        return entrySet().equals(ar9.entrySet());
    }

    /* renamed from: g */
    public final Map.Entry<K, V> m115016g(int i) {
        return this.f1276c.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m115012k = m115012k(comparable);
        if (m115012k >= 0) {
            return (V) this.f1276c.get(m115012k).getValue();
        }
        return this.f1277d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m115021b = m115021b();
        int i = 0;
        for (int i2 = 0; i2 < m115021b; i2++) {
            i += this.f1276c.get(i2).hashCode();
        }
        if (this.f1277d.size() > 0) {
            return i + this.f1277d.hashCode();
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m115013j() {
        return this.f1278e;
    }

    /* renamed from: k */
    public final int m115012k(K k) {
        int size = this.f1276c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f1276c.get(size).m9646a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f1276c.get(i2).m9646a());
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
    public final V m115011l(int i) {
        m115009n();
        V v = (V) this.f1276c.remove(i).getValue();
        if (!this.f1277d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m115010m().entrySet().iterator();
            List<C50086ur9> list = this.f1276c;
            Map.Entry<K, V> next = it.next();
            list.add(new C50086ur9(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* renamed from: m */
    public final SortedMap<K, V> m115010m() {
        m115009n();
        if (this.f1277d.isEmpty() && !(this.f1277d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1277d = treeMap;
            this.f1280g = treeMap.descendingMap();
        }
        return (SortedMap) this.f1277d;
    }

    /* renamed from: n */
    public final void m115009n() {
        if (!this.f1278e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m115009n();
        Comparable comparable = (Comparable) obj;
        int m115012k = m115012k(comparable);
        if (m115012k >= 0) {
            return (V) m115011l(m115012k);
        }
        if (this.f1277d.isEmpty()) {
            return null;
        }
        return this.f1277d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1276c.size() + this.f1277d.size();
    }
}
