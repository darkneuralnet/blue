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
/* renamed from: Hp8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33394Hp8<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f13922b;

    /* renamed from: e */
    public boolean f13925e;

    /* renamed from: f */
    public volatile C50657vp8 f13926f;

    /* renamed from: c */
    public List<C36895Wo8> f13923c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f13924d = Collections.emptyMap();

    /* renamed from: g */
    public Map<K, V> f13927g = Collections.emptyMap();

    /* renamed from: a */
    public void mo72486a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f13925e) {
            if (this.f13924d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f13924d);
            }
            this.f13924d = unmodifiableMap;
            if (this.f13927g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f13927g);
            }
            this.f13927g = unmodifiableMap2;
            this.f13925e = true;
        }
    }

    /* renamed from: b */
    public final int m103405b() {
        return this.f13923c.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> m103404c() {
        if (this.f13924d.isEmpty()) {
            return C34087Ko8.m98272a();
        }
        return this.f13924d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m103393n();
        if (!this.f13923c.isEmpty()) {
            this.f13923c.clear();
        }
        if (!this.f13924d.isEmpty()) {
            this.f13924d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m103396k(comparable) < 0 && !this.f13924d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final V put(K k, V v) {
        m103393n();
        int m103396k = m103396k(k);
        if (m103396k >= 0) {
            return (V) this.f13923c.get(m103396k).setValue(v);
        }
        m103393n();
        if (this.f13923c.isEmpty() && !(this.f13923c instanceof ArrayList)) {
            this.f13923c = new ArrayList(this.f13922b);
        }
        int i = -(m103396k + 1);
        if (i >= this.f13922b) {
            return m103394m().put(k, v);
        }
        int size = this.f13923c.size();
        int i2 = this.f13922b;
        if (size == i2) {
            C36895Wo8 remove = this.f13923c.remove(i2 - 1);
            m103394m().put((K) remove.m77825a(), (V) remove.getValue());
        }
        this.f13923c.add(i, new C36895Wo8(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f13926f == null) {
            this.f13926f = new C50657vp8(this, null);
        }
        return this.f13926f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33394Hp8)) {
            return super.equals(obj);
        }
        C33394Hp8 c33394Hp8 = (C33394Hp8) obj;
        int size = size();
        if (size != c33394Hp8.size()) {
            return false;
        }
        int m103405b = m103405b();
        if (m103405b == c33394Hp8.m103405b()) {
            for (int i = 0; i < m103405b; i++) {
                if (!m103400g(i).equals(c33394Hp8.m103400g(i))) {
                    return false;
                }
            }
            if (m103405b == size) {
                return true;
            }
            return this.f13924d.equals(c33394Hp8.f13924d);
        }
        return entrySet().equals(c33394Hp8.entrySet());
    }

    /* renamed from: g */
    public final Map.Entry<K, V> m103400g(int i) {
        return this.f13923c.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m103396k = m103396k(comparable);
        if (m103396k >= 0) {
            return (V) this.f13923c.get(m103396k).getValue();
        }
        return this.f13924d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m103405b = m103405b();
        int i = 0;
        for (int i2 = 0; i2 < m103405b; i2++) {
            i += this.f13923c.get(i2).hashCode();
        }
        if (this.f13924d.size() > 0) {
            return i + this.f13924d.hashCode();
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m103397j() {
        return this.f13925e;
    }

    /* renamed from: k */
    public final int m103396k(K k) {
        int size = this.f13923c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f13923c.get(size).m77825a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f13923c.get(i2).m77825a());
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
    public final V m103395l(int i) {
        m103393n();
        V v = (V) this.f13923c.remove(i).getValue();
        if (!this.f13924d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m103394m().entrySet().iterator();
            List<C36895Wo8> list = this.f13923c;
            Map.Entry<K, V> next = it.next();
            list.add(new C36895Wo8(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* renamed from: m */
    public final SortedMap<K, V> m103394m() {
        m103393n();
        if (this.f13924d.isEmpty() && !(this.f13924d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13924d = treeMap;
            this.f13927g = treeMap.descendingMap();
        }
        return (SortedMap) this.f13924d;
    }

    /* renamed from: n */
    public final void m103393n() {
        if (!this.f13925e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m103393n();
        Comparable comparable = (Comparable) obj;
        int m103396k = m103396k(comparable);
        if (m103396k >= 0) {
            return (V) m103395l(m103396k);
        }
        if (this.f13924d.isEmpty()) {
            return null;
        }
        return this.f13924d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13923c.size() + this.f13924d.size();
    }
}
