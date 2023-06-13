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
/* renamed from: Gr8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33178Gr8 extends AbstractMap {

    /* renamed from: b */
    public final int f12556b;

    /* renamed from: e */
    public boolean f12559e;

    /* renamed from: f */
    public volatile C42970ir8 f12560f;

    /* renamed from: c */
    public List f12557c = Collections.emptyList();

    /* renamed from: d */
    public Map f12558d = Collections.emptyMap();

    /* renamed from: g */
    public Map f12561g = Collections.emptyMap();

    /* renamed from: a */
    public void mo20468a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f12559e) {
            if (this.f12558d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f12558d);
            }
            this.f12558d = unmodifiableMap;
            if (this.f12561g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f12561g);
            }
            this.f12561g = unmodifiableMap2;
            this.f12559e = true;
        }
    }

    /* renamed from: b */
    public final int m104668b() {
        return this.f12557c.size();
    }

    /* renamed from: c */
    public final Iterable m104667c() {
        if (this.f12558d.isEmpty()) {
            return C37606Zp8.m72405a();
        }
        return this.f12558d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m104656n();
        if (!this.f12557c.isEmpty()) {
            this.f12557c.clear();
        }
        if (!this.f12558d.isEmpty()) {
            this.f12558d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m104659k(comparable) < 0 && !this.f12558d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m104656n();
        int m104659k = m104659k(comparable);
        if (m104659k >= 0) {
            return ((C43553jq8) this.f12557c.get(m104659k)).setValue(obj);
        }
        m104656n();
        if (this.f12557c.isEmpty() && !(this.f12557c instanceof ArrayList)) {
            this.f12557c = new ArrayList(this.f12556b);
        }
        int i = -(m104659k + 1);
        if (i >= this.f12556b) {
            return m104657m().put(comparable, obj);
        }
        int size = this.f12557c.size();
        int i2 = this.f12556b;
        if (size == i2) {
            C43553jq8 c43553jq8 = (C43553jq8) this.f12557c.remove(i2 - 1);
            m104657m().put(c43553jq8.m29842a(), c43553jq8.getValue());
        }
        this.f12557c.add(i, new C43553jq8(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f12560f == null) {
            this.f12560f = new C42970ir8(this, null);
        }
        return this.f12560f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33178Gr8)) {
            return super.equals(obj);
        }
        C33178Gr8 c33178Gr8 = (C33178Gr8) obj;
        int size = size();
        if (size != c33178Gr8.size()) {
            return false;
        }
        int m104668b = m104668b();
        if (m104668b == c33178Gr8.m104668b()) {
            for (int i = 0; i < m104668b; i++) {
                if (!m104663g(i).equals(c33178Gr8.m104663g(i))) {
                    return false;
                }
            }
            if (m104668b == size) {
                return true;
            }
            return this.f12558d.equals(c33178Gr8.f12558d);
        }
        return entrySet().equals(c33178Gr8.entrySet());
    }

    /* renamed from: g */
    public final Map.Entry m104663g(int i) {
        return (Map.Entry) this.f12557c.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m104659k = m104659k(comparable);
        if (m104659k >= 0) {
            return ((C43553jq8) this.f12557c.get(m104659k)).getValue();
        }
        return this.f12558d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m104668b = m104668b();
        int i = 0;
        for (int i2 = 0; i2 < m104668b; i2++) {
            i += ((C43553jq8) this.f12557c.get(i2)).hashCode();
        }
        if (this.f12558d.size() > 0) {
            return i + this.f12558d.hashCode();
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m104660j() {
        return this.f12559e;
    }

    /* renamed from: k */
    public final int m104659k(Comparable comparable) {
        int size = this.f12557c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C43553jq8) this.f12557c.get(size)).m29842a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C43553jq8) this.f12557c.get(i2)).m29842a());
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
    public final Object m104658l(int i) {
        m104656n();
        Object value = ((C43553jq8) this.f12557c.remove(i)).getValue();
        if (!this.f12558d.isEmpty()) {
            Iterator it = m104657m().entrySet().iterator();
            List list = this.f12557c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C43553jq8(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap m104657m() {
        m104656n();
        if (this.f12558d.isEmpty() && !(this.f12558d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12558d = treeMap;
            this.f12561g = treeMap.descendingMap();
        }
        return (SortedMap) this.f12558d;
    }

    /* renamed from: n */
    public final void m104656n() {
        if (this.f12559e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m104656n();
        Comparable comparable = (Comparable) obj;
        int m104659k = m104659k(comparable);
        if (m104659k >= 0) {
            return m104658l(m104659k);
        }
        if (this.f12558d.isEmpty()) {
            return null;
        }
        return this.f12558d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12557c.size() + this.f12558d.size();
    }
}
