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
/* renamed from: vc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50526vc7 extends AbstractMap {

    /* renamed from: b */
    public final int f114408b;

    /* renamed from: e */
    public boolean f114411e;

    /* renamed from: f */
    public volatile C49341tc7 f114412f;

    /* renamed from: c */
    public List f114409c = Collections.emptyList();

    /* renamed from: d */
    public Map f114410d = Collections.emptyMap();

    /* renamed from: g */
    public Map f114413g = Collections.emptyMap();

    /* renamed from: a */
    public void mo8364a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f114411e) {
            if (this.f114410d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f114410d);
            }
            this.f114410d = unmodifiableMap;
            if (this.f114413g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f114413g);
            }
            this.f114413g = unmodifiableMap2;
            this.f114411e = true;
        }
    }

    /* renamed from: b */
    public final int m8363b() {
        return this.f114409c.size();
    }

    /* renamed from: c */
    public final Iterable m8362c() {
        if (this.f114410d.isEmpty()) {
            return C46377oc7.m20791a();
        }
        return this.f114410d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8351n();
        if (!this.f114409c.isEmpty()) {
            this.f114409c.clear();
        }
        if (!this.f114410d.isEmpty()) {
            this.f114410d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m8354k(comparable) < 0 && !this.f114410d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m8351n();
        int m8354k = m8354k(comparable);
        if (m8354k >= 0) {
            return ((C46970pc7) this.f114409c.get(m8354k)).setValue(obj);
        }
        m8351n();
        if (this.f114409c.isEmpty() && !(this.f114409c instanceof ArrayList)) {
            this.f114409c = new ArrayList(this.f114408b);
        }
        int i = -(m8354k + 1);
        if (i >= this.f114408b) {
            return m8352m().put(comparable, obj);
        }
        int size = this.f114409c.size();
        int i2 = this.f114408b;
        if (size == i2) {
            C46970pc7 c46970pc7 = (C46970pc7) this.f114409c.remove(i2 - 1);
            m8352m().put(c46970pc7.m19062a(), c46970pc7.getValue());
        }
        this.f114409c.add(i, new C46970pc7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f114412f == null) {
            this.f114412f = new C49341tc7(this, null);
        }
        return this.f114412f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50526vc7)) {
            return super.equals(obj);
        }
        C50526vc7 c50526vc7 = (C50526vc7) obj;
        int size = size();
        if (size != c50526vc7.size()) {
            return false;
        }
        int m8363b = m8363b();
        if (m8363b == c50526vc7.m8363b()) {
            for (int i = 0; i < m8363b; i++) {
                if (!m8358g(i).equals(c50526vc7.m8358g(i))) {
                    return false;
                }
            }
            if (m8363b == size) {
                return true;
            }
            return this.f114410d.equals(c50526vc7.f114410d);
        }
        return entrySet().equals(c50526vc7.entrySet());
    }

    /* renamed from: g */
    public final Map.Entry m8358g(int i) {
        return (Map.Entry) this.f114409c.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m8354k = m8354k(comparable);
        if (m8354k >= 0) {
            return ((C46970pc7) this.f114409c.get(m8354k)).getValue();
        }
        return this.f114410d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m8363b = m8363b();
        int i = 0;
        for (int i2 = 0; i2 < m8363b; i2++) {
            i += ((C46970pc7) this.f114409c.get(i2)).hashCode();
        }
        if (this.f114410d.size() > 0) {
            return i + this.f114410d.hashCode();
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m8355j() {
        return this.f114411e;
    }

    /* renamed from: k */
    public final int m8354k(Comparable comparable) {
        int size = this.f114409c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C46970pc7) this.f114409c.get(size)).m19062a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C46970pc7) this.f114409c.get(i2)).m19062a());
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
    public final Object m8353l(int i) {
        m8351n();
        Object value = ((C46970pc7) this.f114409c.remove(i)).getValue();
        if (!this.f114410d.isEmpty()) {
            Iterator it = m8352m().entrySet().iterator();
            List list = this.f114409c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C46970pc7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap m8352m() {
        m8351n();
        if (this.f114410d.isEmpty() && !(this.f114410d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f114410d = treeMap;
            this.f114413g = treeMap.descendingMap();
        }
        return (SortedMap) this.f114410d;
    }

    /* renamed from: n */
    public final void m8351n() {
        if (this.f114411e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8351n();
        Comparable comparable = (Comparable) obj;
        int m8354k = m8354k(comparable);
        if (m8354k >= 0) {
            return m8353l(m8354k);
        }
        if (this.f114410d.isEmpty()) {
            return null;
        }
        return this.f114410d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f114409c.size() + this.f114410d.size();
    }
}
