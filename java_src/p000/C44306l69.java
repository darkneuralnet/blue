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
/* renamed from: l69  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44306l69 extends AbstractMap {

    /* renamed from: b */
    public final int f95502b;

    /* renamed from: e */
    public boolean f95505e;

    /* renamed from: f */
    public volatile V59 f95506f;

    /* renamed from: c */
    public List f95503c = Collections.emptyList();

    /* renamed from: d */
    public Map f95504d = Collections.emptyMap();

    /* renamed from: g */
    public Map f95507g = Collections.emptyMap();

    /* renamed from: a */
    public void mo27854a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f95505e) {
            if (this.f95504d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f95504d);
            }
            this.f95504d = unmodifiableMap;
            if (this.f95507g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f95507g);
            }
            this.f95507g = unmodifiableMap2;
            this.f95505e = true;
        }
    }

    /* renamed from: b */
    public final int m27853b() {
        return this.f95503c.size();
    }

    /* renamed from: c */
    public final Iterable m27852c() {
        if (this.f95504d.isEmpty()) {
            return E49.m109414a();
        }
        return this.f95504d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m27841n();
        if (!this.f95503c.isEmpty()) {
            this.f95503c.clear();
        }
        if (!this.f95504d.isEmpty()) {
            this.f95504d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m27844k(comparable) < 0 && !this.f95504d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m27841n();
        int m27844k = m27844k(comparable);
        if (m27844k >= 0) {
            return ((C46668p59) this.f95503c.get(m27844k)).setValue(obj);
        }
        m27841n();
        if (this.f95503c.isEmpty() && !(this.f95503c instanceof ArrayList)) {
            this.f95503c = new ArrayList(this.f95502b);
        }
        int i = -(m27844k + 1);
        if (i >= this.f95502b) {
            return m27842m().put(comparable, obj);
        }
        int size = this.f95503c.size();
        int i2 = this.f95502b;
        if (size == i2) {
            C46668p59 c46668p59 = (C46668p59) this.f95503c.remove(i2 - 1);
            m27842m().put(c46668p59.m19966a(), c46668p59.getValue());
        }
        this.f95503c.add(i, new C46668p59(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f95506f == null) {
            this.f95506f = new V59(this, null);
        }
        return this.f95506f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44306l69)) {
            return super.equals(obj);
        }
        C44306l69 c44306l69 = (C44306l69) obj;
        int size = size();
        if (size != c44306l69.size()) {
            return false;
        }
        int m27853b = m27853b();
        if (m27853b == c44306l69.m27853b()) {
            for (int i = 0; i < m27853b; i++) {
                if (!m27848g(i).equals(c44306l69.m27848g(i))) {
                    return false;
                }
            }
            if (m27853b == size) {
                return true;
            }
            return this.f95504d.equals(c44306l69.f95504d);
        }
        return entrySet().equals(c44306l69.entrySet());
    }

    /* renamed from: g */
    public final Map.Entry m27848g(int i) {
        return (Map.Entry) this.f95503c.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m27844k = m27844k(comparable);
        if (m27844k >= 0) {
            return ((C46668p59) this.f95503c.get(m27844k)).getValue();
        }
        return this.f95504d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m27853b = m27853b();
        int i = 0;
        for (int i2 = 0; i2 < m27853b; i2++) {
            i += ((C46668p59) this.f95503c.get(i2)).hashCode();
        }
        if (this.f95504d.size() > 0) {
            return i + this.f95504d.hashCode();
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m27845j() {
        return this.f95505e;
    }

    /* renamed from: k */
    public final int m27844k(Comparable comparable) {
        int size = this.f95503c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C46668p59) this.f95503c.get(size)).m19966a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C46668p59) this.f95503c.get(i2)).m19966a());
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
    public final Object m27843l(int i) {
        m27841n();
        Object value = ((C46668p59) this.f95503c.remove(i)).getValue();
        if (!this.f95504d.isEmpty()) {
            Iterator it = m27842m().entrySet().iterator();
            List list = this.f95503c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C46668p59(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap m27842m() {
        m27841n();
        if (this.f95504d.isEmpty() && !(this.f95504d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f95504d = treeMap;
            this.f95507g = treeMap.descendingMap();
        }
        return (SortedMap) this.f95504d;
    }

    /* renamed from: n */
    public final void m27841n() {
        if (this.f95505e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m27841n();
        Comparable comparable = (Comparable) obj;
        int m27844k = m27844k(comparable);
        if (m27844k >= 0) {
            return m27843l(m27844k);
        }
        if (this.f95504d.isEmpty()) {
            return null;
        }
        return this.f95504d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f95503c.size() + this.f95504d.size();
    }
}
