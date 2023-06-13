package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18225q;
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
/* renamed from: com.google.crypto.tink.shaded.protobuf.O */
/* loaded from: classes6.dex */
public class C18159O<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f74057b;

    /* renamed from: c */
    public List<C18159O<K, V>.C18166e> f74058c;

    /* renamed from: d */
    public Map<K, V> f74059d;

    /* renamed from: e */
    public boolean f74060e;

    /* renamed from: f */
    public volatile C18159O<K, V>.C18168g f74061f;

    /* renamed from: g */
    public Map<K, V> f74062g;

    /* renamed from: h */
    public volatile C18159O<K, V>.C18162c f74063h;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.O$a */
    /* loaded from: classes6.dex */
    public class C18160a extends C18159O<FieldDescriptorType, Object> {
        public C18160a(int i) {
            super(i, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18159O
        /* renamed from: p */
        public void mo47909p() {
            if (!m47913o()) {
                for (int i = 0; i < m47917k(); i++) {
                    Map.Entry<FieldDescriptorType, Object> m47918j = m47918j(i);
                    if (((C18225q.InterfaceC18227b) m47918j.getKey()).isRepeated()) {
                        m47918j.setValue(Collections.unmodifiableList((List) m47918j.getValue()));
                    }
                }
                Iterator it = m47915m().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C18225q.InterfaceC18227b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo47909p();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.O$c */
    /* loaded from: classes6.dex */
    public class C18162c extends C18159O<K, V>.C18168g {
        public C18162c() {
            super(C18159O.this, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18159O.C18168g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C18161b(C18159O.this, null);
        }

        public /* synthetic */ C18162c(C18159O c18159o, C18160a c18160a) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.O$d */
    /* loaded from: classes6.dex */
    public static class C18163d {

        /* renamed from: a */
        public static final Iterator<Object> f74068a = new C18164a();

        /* renamed from: b */
        public static final Iterable<Object> f74069b = new C18165b();

        /* renamed from: com.google.crypto.tink.shaded.protobuf.O$d$a */
        /* loaded from: classes6.dex */
        public class C18164a implements Iterator<Object> {
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

        /* renamed from: com.google.crypto.tink.shaded.protobuf.O$d$b */
        /* loaded from: classes6.dex */
        public class C18165b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return C18163d.f74068a;
            }
        }

        private C18163d() {
        }

        /* renamed from: b */
        public static <T> Iterable<T> m47905b() {
            return (Iterable<T>) f74069b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.O$e */
    /* loaded from: classes6.dex */
    public class C18166e implements Map.Entry<K, V>, Comparable<C18159O<K, V>.C18166e> {

        /* renamed from: b */
        public final K f74070b;

        /* renamed from: c */
        public V f74071c;

        public C18166e(C18159O c18159o, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C18159O<K, V>.C18166e c18166e) {
            return getKey().compareTo(c18166e.getKey());
        }

        /* renamed from: b */
        public final boolean m47903b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: c */
        public K getKey() {
            return this.f74070b;
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
            if (m47903b(this.f74070b, entry.getKey()) && m47903b(this.f74071c, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f74071c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f74070b;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f74071c;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C18159O.this.m47921g();
            V v2 = this.f74071c;
            this.f74071c = v;
            return v2;
        }

        public String toString() {
            return this.f74070b + "=" + this.f74071c;
        }

        public C18166e(K k, V v) {
            this.f74070b = k;
            this.f74071c = v;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.O$g */
    /* loaded from: classes6.dex */
    public class C18168g extends AbstractSet<Map.Entry<K, V>> {
        public C18168g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                C18159O.this.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C18159O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C18159O.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C18167f(C18159O.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C18159O.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C18159O.this.size();
        }

        public /* synthetic */ C18168g(C18159O c18159o, C18160a c18160a) {
            this();
        }
    }

    public /* synthetic */ C18159O(int i, C18160a c18160a) {
        this(i);
    }

    /* renamed from: q */
    public static <FieldDescriptorType extends C18225q.InterfaceC18227b<FieldDescriptorType>> C18159O<FieldDescriptorType, Object> m47912q(int i) {
        return new C18160a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m47921g();
        if (!this.f74058c.isEmpty()) {
            this.f74058c.clear();
        }
        if (!this.f74059d.isEmpty()) {
            this.f74059d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m47922f(comparable) < 0 && !this.f74059d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f74061f == null) {
            this.f74061f = new C18168g(this, null);
        }
        return this.f74061f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18159O)) {
            return super.equals(obj);
        }
        C18159O c18159o = (C18159O) obj;
        int size = size();
        if (size != c18159o.size()) {
            return false;
        }
        int m47917k = m47917k();
        if (m47917k != c18159o.m47917k()) {
            return entrySet().equals(c18159o.entrySet());
        }
        for (int i = 0; i < m47917k; i++) {
            if (!m47918j(i).equals(c18159o.m47918j(i))) {
                return false;
            }
        }
        if (m47917k == size) {
            return true;
        }
        return this.f74059d.equals(c18159o.f74059d);
    }

    /* renamed from: f */
    public final int m47922f(K k) {
        int size = this.f74058c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f74058c.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f74058c.get(i2).getKey());
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
    public final void m47921g() {
        if (!this.f74060e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m47922f = m47922f(comparable);
        if (m47922f >= 0) {
            return this.f74058c.get(m47922f).getValue();
        }
        return this.f74059d.get(comparable);
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> m47920h() {
        if (this.f74063h == null) {
            this.f74063h = new C18162c(this, null);
        }
        return this.f74063h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m47917k = m47917k();
        int i = 0;
        for (int i2 = 0; i2 < m47917k; i2++) {
            i += this.f74058c.get(i2).hashCode();
        }
        if (m47916l() > 0) {
            return i + this.f74059d.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final void m47919i() {
        m47921g();
        if (this.f74058c.isEmpty() && !(this.f74058c instanceof ArrayList)) {
            this.f74058c = new ArrayList(this.f74057b);
        }
    }

    /* renamed from: j */
    public Map.Entry<K, V> m47918j(int i) {
        return this.f74058c.get(i);
    }

    /* renamed from: k */
    public int m47917k() {
        return this.f74058c.size();
    }

    /* renamed from: l */
    public int m47916l() {
        return this.f74059d.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> m47915m() {
        if (this.f74059d.isEmpty()) {
            return C18163d.m47905b();
        }
        return this.f74059d.entrySet();
    }

    /* renamed from: n */
    public final SortedMap<K, V> m47914n() {
        m47921g();
        if (this.f74059d.isEmpty() && !(this.f74059d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f74059d = treeMap;
            this.f74062g = treeMap.descendingMap();
        }
        return (SortedMap) this.f74059d;
    }

    /* renamed from: o */
    public boolean m47913o() {
        return this.f74060e;
    }

    /* renamed from: p */
    public void mo47909p() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f74060e) {
            if (this.f74059d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f74059d);
            }
            this.f74059d = unmodifiableMap;
            if (this.f74062g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f74062g);
            }
            this.f74062g = unmodifiableMap2;
            this.f74060e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r */
    public V put(K k, V v) {
        m47921g();
        int m47922f = m47922f(k);
        if (m47922f >= 0) {
            return this.f74058c.get(m47922f).setValue(v);
        }
        m47919i();
        int i = -(m47922f + 1);
        if (i >= this.f74057b) {
            return m47914n().put(k, v);
        }
        int size = this.f74058c.size();
        int i2 = this.f74057b;
        if (size == i2) {
            C18159O<K, V>.C18166e remove = this.f74058c.remove(i2 - 1);
            m47914n().put((K) remove.getKey(), remove.getValue());
        }
        this.f74058c.add(i, new C18166e(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m47921g();
        Comparable comparable = (Comparable) obj;
        int m47922f = m47922f(comparable);
        if (m47922f >= 0) {
            return (V) m47910s(m47922f);
        }
        if (this.f74059d.isEmpty()) {
            return null;
        }
        return this.f74059d.remove(comparable);
    }

    /* renamed from: s */
    public final V m47910s(int i) {
        m47921g();
        V value = this.f74058c.remove(i).getValue();
        if (!this.f74059d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m47914n().entrySet().iterator();
            this.f74058c.add(new C18166e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f74058c.size() + this.f74059d.size();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.O$b */
    /* loaded from: classes6.dex */
    public class C18161b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f74064b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f74065c;

        public C18161b() {
            this.f74064b = C18159O.this.f74058c.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m47908a() {
            if (this.f74065c == null) {
                this.f74065c = C18159O.this.f74062g.entrySet().iterator();
            }
            return this.f74065c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (m47908a().hasNext()) {
                return m47908a().next();
            }
            List list = C18159O.this.f74058c;
            int i = this.f74064b - 1;
            this.f74064b = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f74064b;
            return (i > 0 && i <= C18159O.this.f74058c.size()) || m47908a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C18161b(C18159O c18159o, C18160a c18160a) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.O$f */
    /* loaded from: classes6.dex */
    public class C18167f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f74073b;

        /* renamed from: c */
        public boolean f74074c;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f74075d;

        public C18167f() {
            this.f74073b = -1;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m47901a() {
            if (this.f74075d == null) {
                this.f74075d = C18159O.this.f74059d.entrySet().iterator();
            }
            return this.f74075d;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f74074c = true;
            int i = this.f74073b + 1;
            this.f74073b = i;
            if (i < C18159O.this.f74058c.size()) {
                return (Map.Entry) C18159O.this.f74058c.get(this.f74073b);
            }
            return m47901a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f74073b + 1 < C18159O.this.f74058c.size()) {
                return true;
            }
            if (!C18159O.this.f74059d.isEmpty() && m47901a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f74074c) {
                this.f74074c = false;
                C18159O.this.m47921g();
                if (this.f74073b < C18159O.this.f74058c.size()) {
                    C18159O c18159o = C18159O.this;
                    int i = this.f74073b;
                    this.f74073b = i - 1;
                    c18159o.m47910s(i);
                    return;
                }
                m47901a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C18167f(C18159O c18159o, C18160a c18160a) {
            this();
        }
    }

    public C18159O(int i) {
        this.f74057b = i;
        this.f74058c = Collections.emptyList();
        this.f74059d = Collections.emptyMap();
        this.f74062g = Collections.emptyMap();
    }
}
