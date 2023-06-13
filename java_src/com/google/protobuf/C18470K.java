package com.google.protobuf;

import com.google.protobuf.C18531o;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* renamed from: com.google.protobuf.K */
/* loaded from: classes6.dex */
public class C18470K<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f74724b;

    /* renamed from: c */
    public List<C18470K<K, V>.C18477e> f74725c;

    /* renamed from: d */
    public Map<K, V> f74726d;

    /* renamed from: e */
    public boolean f74727e;

    /* renamed from: f */
    public volatile C18470K<K, V>.C18479g f74728f;

    /* renamed from: g */
    public Map<K, V> f74729g;

    /* renamed from: h */
    public volatile C18470K<K, V>.C18473c f74730h;

    /* renamed from: com.google.protobuf.K$a */
    /* loaded from: classes6.dex */
    public class C18471a extends C18470K<FieldDescriptorType, Object> {
        public C18471a(int i) {
            super(i, null);
        }

        @Override // com.google.protobuf.C18470K
        /* renamed from: p */
        public void mo46452p() {
            if (!m46456o()) {
                for (int i = 0; i < m46460k(); i++) {
                    Map.Entry<FieldDescriptorType, Object> m46461j = m46461j(i);
                    if (((C18531o.InterfaceC18533b) m46461j.getKey()).isRepeated()) {
                        m46461j.setValue(Collections.unmodifiableList((List) m46461j.getValue()));
                    }
                }
                Iterator it = m46458m().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C18531o.InterfaceC18533b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo46452p();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C18470K, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }
    }

    /* renamed from: com.google.protobuf.K$c */
    /* loaded from: classes6.dex */
    public class C18473c extends C18470K<K, V>.C18479g {
        public C18473c() {
            super(C18470K.this, null);
        }

        @Override // com.google.protobuf.C18470K.C18479g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C18472b(C18470K.this, null);
        }

        public /* synthetic */ C18473c(C18470K c18470k, C18471a c18471a) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.K$d */
    /* loaded from: classes6.dex */
    public static class C18474d {

        /* renamed from: a */
        public static final Iterator<Object> f74735a = new C18475a();

        /* renamed from: b */
        public static final Iterable<Object> f74736b = new C18476b();

        /* renamed from: com.google.protobuf.K$d$a */
        /* loaded from: classes6.dex */
        public class C18475a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.K$d$b */
        /* loaded from: classes6.dex */
        public class C18476b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return C18474d.f74735a;
            }
        }

        private C18474d() {
        }

        /* renamed from: b */
        public static <T> Iterable<T> m46448b() {
            return (Iterable<T>) f74736b;
        }
    }

    /* renamed from: com.google.protobuf.K$e */
    /* loaded from: classes6.dex */
    public class C18477e implements Map.Entry<K, V>, Comparable<C18470K<K, V>.C18477e> {

        /* renamed from: b */
        public final K f74737b;

        /* renamed from: c */
        public V f74738c;

        public C18477e(C18470K c18470k, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C18470K<K, V>.C18477e c18477e) {
            return getKey().compareTo(c18477e.getKey());
        }

        /* renamed from: b */
        public final boolean m46446b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: c */
        public K getKey() {
            return this.f74737b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (m46446b(this.f74737b, entry.getKey()) && m46446b(this.f74738c, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f74738c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f74737b;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f74738c;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C18470K.this.m46464g();
            V v2 = this.f74738c;
            this.f74738c = v;
            return v2;
        }

        public String toString() {
            return this.f74737b + "=" + this.f74738c;
        }

        public C18477e(K k, V v) {
            this.f74737b = k;
            this.f74738c = v;
        }
    }

    /* renamed from: com.google.protobuf.K$g */
    /* loaded from: classes6.dex */
    public class C18479g extends AbstractSet<Map.Entry<K, V>> {
        public C18479g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                C18470K.this.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C18470K.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C18470K.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C18478f(C18470K.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C18470K.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C18470K.this.size();
        }

        public /* synthetic */ C18479g(C18470K c18470k, C18471a c18471a) {
            this();
        }
    }

    public /* synthetic */ C18470K(int i, C18471a c18471a) {
        this(i);
    }

    /* renamed from: q */
    public static <FieldDescriptorType extends C18531o.InterfaceC18533b<FieldDescriptorType>> C18470K<FieldDescriptorType, Object> m46455q(int i) {
        return new C18471a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m46464g();
        if (!this.f74725c.isEmpty()) {
            this.f74725c.clear();
        }
        if (!this.f74726d.isEmpty()) {
            this.f74726d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m46465f(comparable) < 0 && !this.f74726d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f74728f == null) {
            this.f74728f = new C18479g(this, null);
        }
        return this.f74728f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18470K)) {
            return super.equals(obj);
        }
        C18470K c18470k = (C18470K) obj;
        int size = size();
        if (size != c18470k.size()) {
            return false;
        }
        int m46460k = m46460k();
        if (m46460k != c18470k.m46460k()) {
            return entrySet().equals(c18470k.entrySet());
        }
        for (int i = 0; i < m46460k; i++) {
            if (!m46461j(i).equals(c18470k.m46461j(i))) {
                return false;
            }
        }
        if (m46460k == size) {
            return true;
        }
        return this.f74726d.equals(c18470k.f74726d);
    }

    /* renamed from: f */
    public final int m46465f(K k) {
        int size = this.f74725c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f74725c.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f74725c.get(i2).getKey());
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

    /* renamed from: g */
    public final void m46464g() {
        if (!this.f74727e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m46465f = m46465f(comparable);
        if (m46465f >= 0) {
            return this.f74725c.get(m46465f).getValue();
        }
        return this.f74726d.get(comparable);
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> m46463h() {
        if (this.f74730h == null) {
            this.f74730h = new C18473c(this, null);
        }
        return this.f74730h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m46460k = m46460k();
        int i = 0;
        for (int i2 = 0; i2 < m46460k; i2++) {
            i += this.f74725c.get(i2).hashCode();
        }
        if (m46459l() > 0) {
            return i + this.f74726d.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final void m46462i() {
        m46464g();
        if (this.f74725c.isEmpty() && !(this.f74725c instanceof ArrayList)) {
            this.f74725c = new ArrayList(this.f74724b);
        }
    }

    /* renamed from: j */
    public Map.Entry<K, V> m46461j(int i) {
        return this.f74725c.get(i);
    }

    /* renamed from: k */
    public int m46460k() {
        return this.f74725c.size();
    }

    /* renamed from: l */
    public int m46459l() {
        return this.f74726d.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> m46458m() {
        if (this.f74726d.isEmpty()) {
            return C18474d.m46448b();
        }
        return this.f74726d.entrySet();
    }

    /* renamed from: n */
    public final SortedMap<K, V> m46457n() {
        m46464g();
        if (this.f74726d.isEmpty() && !(this.f74726d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f74726d = treeMap;
            this.f74729g = treeMap.descendingMap();
        }
        return (SortedMap) this.f74726d;
    }

    /* renamed from: o */
    public boolean m46456o() {
        return this.f74727e;
    }

    /* renamed from: p */
    public void mo46452p() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f74727e) {
            if (this.f74726d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f74726d);
            }
            this.f74726d = unmodifiableMap;
            if (this.f74729g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f74729g);
            }
            this.f74729g = unmodifiableMap2;
            this.f74727e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r */
    public V put(K k, V v) {
        m46464g();
        int m46465f = m46465f(k);
        if (m46465f >= 0) {
            return this.f74725c.get(m46465f).setValue(v);
        }
        m46462i();
        int i = -(m46465f + 1);
        if (i >= this.f74724b) {
            return m46457n().put(k, v);
        }
        int size = this.f74725c.size();
        int i2 = this.f74724b;
        if (size == i2) {
            C18470K<K, V>.C18477e remove = this.f74725c.remove(i2 - 1);
            m46457n().put((K) remove.getKey(), remove.getValue());
        }
        this.f74725c.add(i, new C18477e(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m46464g();
        Comparable comparable = (Comparable) obj;
        int m46465f = m46465f(comparable);
        if (m46465f >= 0) {
            return (V) m46453s(m46465f);
        }
        if (this.f74726d.isEmpty()) {
            return null;
        }
        return this.f74726d.remove(comparable);
    }

    /* renamed from: s */
    public final V m46453s(int i) {
        m46464g();
        V value = this.f74725c.remove(i).getValue();
        if (!this.f74726d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m46457n().entrySet().iterator();
            this.f74725c.add(new C18477e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f74725c.size() + this.f74726d.size();
    }

    /* renamed from: com.google.protobuf.K$b */
    /* loaded from: classes6.dex */
    public class C18472b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f74731b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f74732c;

        public C18472b() {
            this.f74731b = C18470K.this.f74725c.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m46451a() {
            if (this.f74732c == null) {
                this.f74732c = C18470K.this.f74729g.entrySet().iterator();
            }
            return this.f74732c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (m46451a().hasNext()) {
                return m46451a().next();
            }
            List list = C18470K.this.f74725c;
            int i = this.f74731b - 1;
            this.f74731b = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f74731b;
            return (i > 0 && i <= C18470K.this.f74725c.size()) || m46451a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C18472b(C18470K c18470k, C18471a c18471a) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.K$f */
    /* loaded from: classes6.dex */
    public class C18478f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f74740b;

        /* renamed from: c */
        public boolean f74741c;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f74742d;

        public C18478f() {
            this.f74740b = -1;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m46444a() {
            if (this.f74742d == null) {
                this.f74742d = C18470K.this.f74726d.entrySet().iterator();
            }
            return this.f74742d;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f74741c = true;
            int i = this.f74740b + 1;
            this.f74740b = i;
            if (i < C18470K.this.f74725c.size()) {
                return (Map.Entry) C18470K.this.f74725c.get(this.f74740b);
            }
            return m46444a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f74740b + 1 < C18470K.this.f74725c.size()) {
                return true;
            }
            if (!C18470K.this.f74726d.isEmpty() && m46444a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f74741c) {
                this.f74741c = false;
                C18470K.this.m46464g();
                if (this.f74740b < C18470K.this.f74725c.size()) {
                    C18470K c18470k = C18470K.this;
                    int i = this.f74740b;
                    this.f74740b = i - 1;
                    c18470k.m46453s(i);
                    return;
                }
                m46444a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C18478f(C18470K c18470k, C18471a c18471a) {
            this();
        }
    }

    public C18470K(int i) {
        this.f74724b = i;
        this.f74725c = Collections.emptyList();
        this.f74726d = Collections.emptyMap();
        this.f74729g = Collections.emptyMap();
    }
}
