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
/* renamed from: BV8 */
/* loaded from: classes6.dex */
public class BV8<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f2441b;

    /* renamed from: c */
    public List<BW8> f2442c;

    /* renamed from: d */
    public Map<K, V> f2443d;

    /* renamed from: e */
    public boolean f2444e;

    /* renamed from: f */
    public volatile XW8 f2445f;

    /* renamed from: g */
    public Map<K, V> f2446g;

    /* renamed from: h */
    public volatile MV8 f2447h;

    public BV8(int i) {
        this.f2441b = i;
        this.f2442c = Collections.emptyList();
        this.f2443d = Collections.emptyMap();
        this.f2446g = Collections.emptyMap();
    }

    /* renamed from: d */
    public static <FieldDescriptorType extends OF8<FieldDescriptorType>> BV8<FieldDescriptorType, Object> m113938d(int i) {
        return new C47499qV8(i);
    }

    /* renamed from: a */
    public final int m113941a(K k) {
        int size = this.f2442c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f2442c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f2442c.get(i2).getKey());
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

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b */
    public final V put(K k, V v) {
        m113927p();
        int m113941a = m113941a(k);
        if (m113941a >= 0) {
            return (V) this.f2442c.get(m113941a).setValue(v);
        }
        m113927p();
        if (this.f2442c.isEmpty() && !(this.f2442c instanceof ArrayList)) {
            this.f2442c = new ArrayList(this.f2441b);
        }
        int i = -(m113941a + 1);
        if (i >= this.f2441b) {
            return m113926q().put(k, v);
        }
        int size = this.f2442c.size();
        int i2 = this.f2441b;
        if (size == i2) {
            BW8 remove = this.f2442c.remove(i2 - 1);
            m113926q().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.f2442c.add(i, new BW8(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m113927p();
        if (!this.f2442c.isEmpty()) {
            this.f2442c.clear();
        }
        if (!this.f2443d.isEmpty()) {
            this.f2443d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m113941a(comparable) < 0 && !this.f2443d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo17480e() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f2444e) {
            if (this.f2443d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f2443d);
            }
            this.f2443d = unmodifiableMap;
            if (this.f2446g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f2446g);
            }
            this.f2446g = unmodifiableMap2;
            this.f2444e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2445f == null) {
            this.f2445f = new XW8(this, null);
        }
        return this.f2445f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BV8)) {
            return super.equals(obj);
        }
        BV8 bv8 = (BV8) obj;
        int size = size();
        if (size != bv8.size()) {
            return false;
        }
        int m113933j = m113933j();
        if (m113933j != bv8.m113933j()) {
            return entrySet().equals(bv8.entrySet());
        }
        for (int i = 0; i < m113933j; i++) {
            if (!m113935h(i).equals(bv8.m113935h(i))) {
                return false;
            }
        }
        if (m113933j == size) {
            return true;
        }
        return this.f2443d.equals(bv8.f2443d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m113941a = m113941a(comparable);
        if (m113941a >= 0) {
            return (V) this.f2442c.get(m113941a).getValue();
        }
        return this.f2443d.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> m113935h(int i) {
        return this.f2442c.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m113933j = m113933j();
        int i = 0;
        for (int i2 = 0; i2 < m113933j; i2++) {
            i += this.f2442c.get(i2).hashCode();
        }
        if (this.f2443d.size() > 0) {
            return i + this.f2443d.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final boolean m113934i() {
        return this.f2444e;
    }

    /* renamed from: j */
    public final int m113933j() {
        return this.f2442c.size();
    }

    /* renamed from: k */
    public final V m113932k(int i) {
        m113927p();
        V v = (V) this.f2442c.remove(i).getValue();
        if (!this.f2443d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m113926q().entrySet().iterator();
            this.f2442c.add(new BW8(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* renamed from: m */
    public final Iterable<Map.Entry<K, V>> m113930m() {
        if (this.f2443d.isEmpty()) {
            return C46915pW8.m19150a();
        }
        return this.f2443d.entrySet();
    }

    /* renamed from: o */
    public final Set<Map.Entry<K, V>> m113928o() {
        if (this.f2447h == null) {
            this.f2447h = new MV8(this, null);
        }
        return this.f2447h;
    }

    /* renamed from: p */
    public final void m113927p() {
        if (!this.f2444e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public final SortedMap<K, V> m113926q() {
        m113927p();
        if (this.f2443d.isEmpty() && !(this.f2443d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2443d = treeMap;
            this.f2446g = treeMap.descendingMap();
        }
        return (SortedMap) this.f2443d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m113927p();
        Comparable comparable = (Comparable) obj;
        int m113941a = m113941a(comparable);
        if (m113941a >= 0) {
            return (V) m113932k(m113941a);
        }
        if (this.f2443d.isEmpty()) {
            return null;
        }
        return this.f2443d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2442c.size() + this.f2443d.size();
    }

    public /* synthetic */ BV8(int i, C47499qV8 c47499qV8) {
        this(i);
    }
}
