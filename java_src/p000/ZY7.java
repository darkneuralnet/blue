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
/* renamed from: ZY7 */
/* loaded from: classes5.dex */
public class ZY7<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f48757b;

    /* renamed from: c */
    public List<C51962y18> f48758c;

    /* renamed from: d */
    public Map<K, V> f48759d;

    /* renamed from: e */
    public boolean f48760e;

    /* renamed from: f */
    public volatile C37725a28 f48761f;

    /* renamed from: g */
    public Map<K, V> f48762g;

    /* renamed from: h */
    public volatile C48988t08 f48763h;

    public ZY7(int i) {
        this.f48757b = i;
        this.f48758c = Collections.emptyList();
        this.f48759d = Collections.emptyMap();
        this.f48762g = Collections.emptyMap();
    }

    /* renamed from: c */
    public static <FieldDescriptorType extends InterfaceC44828lz7<FieldDescriptorType>> ZY7<FieldDescriptorType, Object> m72953c(int i) {
        return new QZ7(i);
    }

    /* renamed from: a */
    public final boolean m72955a() {
        return this.f48760e;
    }

    /* renamed from: b */
    public void mo72954b() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f48760e) {
            if (this.f48759d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f48759d);
            }
            this.f48759d = unmodifiableMap;
            if (this.f48762g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f48762g);
            }
            this.f48762g = unmodifiableMap2;
            this.f48760e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m72942n();
        if (!this.f48758c.isEmpty()) {
            this.f48758c.clear();
        }
        if (!this.f48759d.isEmpty()) {
            this.f48759d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m72950f(comparable) < 0 && !this.f48759d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final Map.Entry<K, V> m72952d(int i) {
        return this.f48758c.get(i);
    }

    /* renamed from: e */
    public final V m72951e(int i) {
        m72942n();
        V v = (V) this.f48758c.remove(i).getValue();
        if (!this.f48759d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m72941o().entrySet().iterator();
            this.f48758c.add(new C51962y18(this, it.next()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f48761f == null) {
            this.f48761f = new C37725a28(this, null);
        }
        return this.f48761f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZY7)) {
            return super.equals(obj);
        }
        ZY7 zy7 = (ZY7) obj;
        int size = size();
        if (size != zy7.size()) {
            return false;
        }
        int m72945k = m72945k();
        if (m72945k != zy7.m72945k()) {
            return entrySet().equals(zy7.entrySet());
        }
        for (int i = 0; i < m72945k; i++) {
            if (!m72952d(i).equals(zy7.m72952d(i))) {
                return false;
            }
        }
        if (m72945k == size) {
            return true;
        }
        return this.f48759d.equals(zy7.f48759d);
    }

    /* renamed from: f */
    public final int m72950f(K k) {
        int size = this.f48758c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f48758c.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f48758c.get(i2).getKey());
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
    /* renamed from: g */
    public final V put(K k, V v) {
        m72942n();
        int m72950f = m72950f(k);
        if (m72950f >= 0) {
            return (V) this.f48758c.get(m72950f).setValue(v);
        }
        m72942n();
        if (this.f48758c.isEmpty() && !(this.f48758c instanceof ArrayList)) {
            this.f48758c = new ArrayList(this.f48757b);
        }
        int i = -(m72950f + 1);
        if (i >= this.f48757b) {
            return m72941o().put(k, v);
        }
        int size = this.f48758c.size();
        int i2 = this.f48757b;
        if (size == i2) {
            C51962y18 remove = this.f48758c.remove(i2 - 1);
            m72941o().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.f48758c.add(i, new C51962y18(this, k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m72950f = m72950f(comparable);
        if (m72950f >= 0) {
            return (V) this.f48758c.get(m72950f).getValue();
        }
        return this.f48759d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m72945k = m72945k();
        int i = 0;
        for (int i2 = 0; i2 < m72945k; i2++) {
            i += this.f48758c.get(i2).hashCode();
        }
        if (this.f48759d.size() > 0) {
            return i + this.f48759d.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final int m72945k() {
        return this.f48758c.size();
    }

    /* renamed from: l */
    public final Iterable<Map.Entry<K, V>> m72944l() {
        if (this.f48759d.isEmpty()) {
            return C40094e08.m43406a();
        }
        return this.f48759d.entrySet();
    }

    /* renamed from: m */
    public final Set<Map.Entry<K, V>> m72943m() {
        if (this.f48763h == null) {
            this.f48763h = new C48988t08(this, null);
        }
        return this.f48763h;
    }

    /* renamed from: n */
    public final void m72942n() {
        if (!this.f48760e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: o */
    public final SortedMap<K, V> m72941o() {
        m72942n();
        if (this.f48759d.isEmpty() && !(this.f48759d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f48759d = treeMap;
            this.f48762g = treeMap.descendingMap();
        }
        return (SortedMap) this.f48759d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m72942n();
        Comparable comparable = (Comparable) obj;
        int m72950f = m72950f(comparable);
        if (m72950f >= 0) {
            return (V) m72951e(m72950f);
        }
        if (this.f48759d.isEmpty()) {
            return null;
        }
        return this.f48759d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f48758c.size() + this.f48759d.size();
    }

    public /* synthetic */ ZY7(int i, QZ7 qz7) {
        this(i);
    }
}
