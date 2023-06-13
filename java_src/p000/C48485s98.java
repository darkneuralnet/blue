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
/* renamed from: s98  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48485s98<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f108401b;

    /* renamed from: c */
    public List<C48739sb8> f108402c;

    /* renamed from: d */
    public Map<K, V> f108403d;

    /* renamed from: e */
    public boolean f108404e;

    /* renamed from: f */
    public volatile C36310Ub8 f108405f;

    /* renamed from: g */
    public Map<K, V> f108406g;

    /* renamed from: h */
    public volatile C45765na8 f108407h;

    public C48485s98(int i) {
        this.f108401b = i;
        this.f108402c = Collections.emptyList();
        this.f108403d = Collections.emptyMap();
        this.f108406g = Collections.emptyMap();
    }

    /* renamed from: f */
    public static <FieldDescriptorType extends HQ7<FieldDescriptorType>> C48485s98<FieldDescriptorType, Object> m14628f(int i) {
        return new H98(i);
    }

    /* renamed from: a */
    public final boolean m14633a() {
        return this.f108404e;
    }

    /* renamed from: b */
    public final int m14632b(K k) {
        int size = this.f108402c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f108402c.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f108402c.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final V put(K k, V v) {
        m14619o();
        int m14632b = m14632b(k);
        if (m14632b >= 0) {
            return (V) this.f108402c.get(m14632b).setValue(v);
        }
        m14619o();
        if (this.f108402c.isEmpty() && !(this.f108402c instanceof ArrayList)) {
            this.f108402c = new ArrayList(this.f108401b);
        }
        int i = -(m14632b + 1);
        if (i >= this.f108401b) {
            return m14618p().put(k, v);
        }
        int size = this.f108402c.size();
        int i2 = this.f108401b;
        if (size == i2) {
            C48739sb8 remove = this.f108402c.remove(i2 - 1);
            m14618p().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.f108402c.add(i, new C48739sb8(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m14619o();
        if (!this.f108402c.isEmpty()) {
            this.f108402c.clear();
        }
        if (this.f108403d.isEmpty()) {
            return;
        }
        this.f108403d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m14632b(comparable) >= 0 || this.f108403d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f108405f == null) {
            this.f108405f = new C36310Ub8(this, null);
        }
        return this.f108405f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48485s98) {
            C48485s98 c48485s98 = (C48485s98) obj;
            int size = size();
            if (size != c48485s98.size()) {
                return false;
            }
            int m14622l = m14622l();
            if (m14622l != c48485s98.m14622l()) {
                return entrySet().equals(c48485s98.entrySet());
            }
            for (int i = 0; i < m14622l; i++) {
                if (!m14627g(i).equals(c48485s98.m14627g(i))) {
                    return false;
                }
            }
            if (m14622l != size) {
                return this.f108403d.equals(c48485s98.f108403d);
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: g */
    public final Map.Entry<K, V> m14627g(int i) {
        return this.f108402c.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m14632b = m14632b(comparable);
        return m14632b >= 0 ? (V) this.f108402c.get(m14632b).getValue() : this.f108403d.get(comparable);
    }

    /* renamed from: h */
    public final V m14626h(int i) {
        m14619o();
        V v = (V) this.f108402c.remove(i).getValue();
        if (!this.f108403d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m14618p().entrySet().iterator();
            this.f108402c.add(new C48739sb8(this, it.next()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m14622l = m14622l();
        int i = 0;
        for (int i2 = 0; i2 < m14622l; i2++) {
            i += this.f108402c.get(i2).hashCode();
        }
        return this.f108403d.size() > 0 ? i + this.f108403d.hashCode() : i;
    }

    /* renamed from: l */
    public final int m14622l() {
        return this.f108402c.size();
    }

    /* renamed from: m */
    public final Iterable<Map.Entry<K, V>> m14621m() {
        return this.f108403d.isEmpty() ? C32089Ca8.m112094a() : this.f108403d.entrySet();
    }

    /* renamed from: n */
    public final Set<Map.Entry<K, V>> m14620n() {
        if (this.f108407h == null) {
            this.f108407h = new C45765na8(this, null);
        }
        return this.f108407h;
    }

    /* renamed from: o */
    public final void m14619o() {
        if (this.f108404e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public final SortedMap<K, V> m14618p() {
        m14619o();
        if (this.f108403d.isEmpty() && !(this.f108403d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f108403d = treeMap;
            this.f108406g = treeMap.descendingMap();
        }
        return (SortedMap) this.f108403d;
    }

    /* renamed from: q */
    public void mo14617q() {
        if (this.f108404e) {
            return;
        }
        this.f108403d = this.f108403d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f108403d);
        this.f108406g = this.f108406g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f108406g);
        this.f108404e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m14619o();
        Comparable comparable = (Comparable) obj;
        int m14632b = m14632b(comparable);
        if (m14632b >= 0) {
            return (V) m14626h(m14632b);
        }
        if (this.f108403d.isEmpty()) {
            return null;
        }
        return this.f108403d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f108402c.size() + this.f108403d.size();
    }

    public /* synthetic */ C48485s98(int i, H98 h98) {
        this(i);
    }
}
