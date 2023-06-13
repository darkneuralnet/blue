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
/* renamed from: Xv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37191Xv7 extends AbstractMap {

    /* renamed from: b */
    public final int f44239b;

    /* renamed from: e */
    public boolean f44242e;

    /* renamed from: f */
    public volatile C36957Wv7 f44243f;

    /* renamed from: c */
    public List f44240c = Collections.emptyList();

    /* renamed from: d */
    public Map f44241d = Collections.emptyMap();

    /* renamed from: g */
    public Map f44244g = Collections.emptyMap();

    /* renamed from: a */
    public void mo76097a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f44242e) {
            if (this.f44241d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f44241d);
            }
            this.f44241d = unmodifiableMap;
            if (this.f44244g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f44244g);
            }
            this.f44244g = unmodifiableMap2;
            this.f44242e = true;
        }
    }

    /* renamed from: b */
    public final int m76096b() {
        return this.f44240c.size();
    }

    /* renamed from: c */
    public final Iterable m76095c() {
        if (this.f44241d.isEmpty()) {
            return C36255Tv7.m82241a();
        }
        return this.f44241d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m76084n();
        if (!this.f44240c.isEmpty()) {
            this.f44240c.clear();
        }
        if (!this.f44241d.isEmpty()) {
            this.f44241d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m76087k(comparable) < 0 && !this.f44241d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m76084n();
        int m76087k = m76087k(comparable);
        if (m76087k >= 0) {
            return ((C36489Uv7) this.f44240c.get(m76087k)).setValue(obj);
        }
        m76084n();
        if (this.f44240c.isEmpty() && !(this.f44240c instanceof ArrayList)) {
            this.f44240c = new ArrayList(this.f44239b);
        }
        int i = -(m76087k + 1);
        if (i >= this.f44239b) {
            return m76085m().put(comparable, obj);
        }
        int size = this.f44240c.size();
        int i2 = this.f44239b;
        if (size == i2) {
            C36489Uv7 c36489Uv7 = (C36489Uv7) this.f44240c.remove(i2 - 1);
            m76085m().put(c36489Uv7.m80614a(), c36489Uv7.getValue());
        }
        this.f44240c.add(i, new C36489Uv7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f44243f == null) {
            this.f44243f = new C36957Wv7(this, null);
        }
        return this.f44243f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37191Xv7)) {
            return super.equals(obj);
        }
        C37191Xv7 c37191Xv7 = (C37191Xv7) obj;
        int size = size();
        if (size != c37191Xv7.size()) {
            return false;
        }
        int m76096b = m76096b();
        if (m76096b == c37191Xv7.m76096b()) {
            for (int i = 0; i < m76096b; i++) {
                if (!m76091g(i).equals(c37191Xv7.m76091g(i))) {
                    return false;
                }
            }
            if (m76096b == size) {
                return true;
            }
            return this.f44241d.equals(c37191Xv7.f44241d);
        }
        return entrySet().equals(c37191Xv7.entrySet());
    }

    /* renamed from: g */
    public final Map.Entry m76091g(int i) {
        return (Map.Entry) this.f44240c.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m76087k = m76087k(comparable);
        if (m76087k >= 0) {
            return ((C36489Uv7) this.f44240c.get(m76087k)).getValue();
        }
        return this.f44241d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m76096b = m76096b();
        int i = 0;
        for (int i2 = 0; i2 < m76096b; i2++) {
            i += ((C36489Uv7) this.f44240c.get(i2)).hashCode();
        }
        if (this.f44241d.size() > 0) {
            return i + this.f44241d.hashCode();
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m76088j() {
        return this.f44242e;
    }

    /* renamed from: k */
    public final int m76087k(Comparable comparable) {
        int size = this.f44240c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C36489Uv7) this.f44240c.get(size)).m80614a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C36489Uv7) this.f44240c.get(i2)).m80614a());
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
    public final Object m76086l(int i) {
        m76084n();
        Object value = ((C36489Uv7) this.f44240c.remove(i)).getValue();
        if (!this.f44241d.isEmpty()) {
            Iterator it = m76085m().entrySet().iterator();
            List list = this.f44240c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C36489Uv7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap m76085m() {
        m76084n();
        if (this.f44241d.isEmpty() && !(this.f44241d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f44241d = treeMap;
            this.f44244g = treeMap.descendingMap();
        }
        return (SortedMap) this.f44241d;
    }

    /* renamed from: n */
    public final void m76084n() {
        if (this.f44242e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m76084n();
        Comparable comparable = (Comparable) obj;
        int m76087k = m76087k(comparable);
        if (m76087k >= 0) {
            return m76086l(m76087k);
        }
        if (this.f44241d.isEmpty()) {
            return null;
        }
        return this.f44241d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f44240c.size() + this.f44241d.size();
    }
}
