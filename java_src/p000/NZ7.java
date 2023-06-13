package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
/* renamed from: NZ7 */
/* loaded from: classes5.dex */
public final class NZ7 extends AbstractMap implements Serializable {

    /* renamed from: i */
    public static final Comparator f24794i = new PW7();

    /* renamed from: b */
    public final Comparator f24795b;

    /* renamed from: c */
    public C52869zZ7 f24796c;

    /* renamed from: d */
    public int f24797d;

    /* renamed from: e */
    public int f24798e;

    /* renamed from: f */
    public final C52869zZ7 f24799f;

    /* renamed from: g */
    public C49294tX7 f24800g;

    /* renamed from: h */
    public WY7 f24801h;

    public NZ7() {
        Comparator comparator = f24794i;
        this.f24797d = 0;
        this.f24798e = 0;
        this.f24799f = new C52869zZ7();
        this.f24795b = comparator;
    }

    /* renamed from: a */
    public final C52869zZ7 m93755a(Object obj, boolean z) {
        int i;
        C52869zZ7 c52869zZ7;
        Comparable comparable;
        C52869zZ7 c52869zZ72;
        Comparator comparator = this.f24795b;
        C52869zZ7 c52869zZ73 = this.f24796c;
        if (c52869zZ73 != null) {
            if (comparator == f24794i) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c52869zZ73.f121545g);
                } else {
                    i = comparator.compare(obj, c52869zZ73.f121545g);
                }
                if (i == 0) {
                    return c52869zZ73;
                }
                if (i < 0) {
                    c52869zZ72 = c52869zZ73.f121541c;
                } else {
                    c52869zZ72 = c52869zZ73.f121542d;
                }
                if (c52869zZ72 == null) {
                    break;
                }
                c52869zZ73 = c52869zZ72;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C52869zZ7 c52869zZ74 = this.f24799f;
        if (c52869zZ73 == null) {
            if (comparator == f24794i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c52869zZ7 = new C52869zZ7(null, obj, c52869zZ74, c52869zZ74.f121544f);
            this.f24796c = c52869zZ7;
        } else {
            c52869zZ7 = new C52869zZ7(c52869zZ73, obj, c52869zZ74, c52869zZ74.f121544f);
            if (i < 0) {
                c52869zZ73.f121541c = c52869zZ7;
            } else {
                c52869zZ73.f121542d = c52869zZ7;
            }
            m93750f(c52869zZ73, true);
        }
        this.f24797d++;
        this.f24798e++;
        return c52869zZ7;
    }

    /* renamed from: b */
    public final C52869zZ7 m93754b(Map.Entry entry) {
        C52869zZ7 m93753c = m93753c(entry.getKey());
        if (m93753c != null) {
            Object obj = m93753c.f121546h;
            Object value = entry.getValue();
            if (obj == value || (obj != null && obj.equals(value))) {
                return m93753c;
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public final C52869zZ7 m93753c(Object obj) {
        if (obj != null) {
            try {
                return m93755a(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f24796c = null;
        this.f24797d = 0;
        this.f24798e++;
        C52869zZ7 c52869zZ7 = this.f24799f;
        c52869zZ7.f121544f = c52869zZ7;
        c52869zZ7.f121543e = c52869zZ7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return m93753c(obj) != null;
    }

    /* renamed from: d */
    public final C52869zZ7 m93752d(Object obj) {
        C52869zZ7 m93753c = m93753c(obj);
        if (m93753c != null) {
            m93751e(m93753c, true);
        }
        return m93753c;
    }

    /* renamed from: e */
    public final void m93751e(C52869zZ7 c52869zZ7, boolean z) {
        C52869zZ7 c52869zZ72;
        C52869zZ7 c52869zZ73;
        int i;
        if (z) {
            C52869zZ7 c52869zZ74 = c52869zZ7.f121544f;
            c52869zZ74.f121543e = c52869zZ7.f121543e;
            c52869zZ7.f121543e.f121544f = c52869zZ74;
        }
        C52869zZ7 c52869zZ75 = c52869zZ7.f121541c;
        C52869zZ7 c52869zZ76 = c52869zZ7.f121542d;
        C52869zZ7 c52869zZ77 = c52869zZ7.f121540b;
        int i2 = 0;
        if (c52869zZ75 != null && c52869zZ76 != null) {
            if (c52869zZ75.f121547i > c52869zZ76.f121547i) {
                do {
                    c52869zZ73 = c52869zZ75;
                    c52869zZ75 = c52869zZ75.f121542d;
                } while (c52869zZ75 != null);
            } else {
                do {
                    c52869zZ72 = c52869zZ76;
                    c52869zZ76 = c52869zZ76.f121541c;
                } while (c52869zZ76 != null);
                c52869zZ73 = c52869zZ72;
            }
            m93751e(c52869zZ73, false);
            C52869zZ7 c52869zZ78 = c52869zZ7.f121541c;
            if (c52869zZ78 != null) {
                i = c52869zZ78.f121547i;
                c52869zZ73.f121541c = c52869zZ78;
                c52869zZ78.f121540b = c52869zZ73;
                c52869zZ7.f121541c = null;
            } else {
                i = 0;
            }
            C52869zZ7 c52869zZ79 = c52869zZ7.f121542d;
            if (c52869zZ79 != null) {
                i2 = c52869zZ79.f121547i;
                c52869zZ73.f121542d = c52869zZ79;
                c52869zZ79.f121540b = c52869zZ73;
                c52869zZ7.f121542d = null;
            }
            c52869zZ73.f121547i = Math.max(i, i2) + 1;
            m93749g(c52869zZ7, c52869zZ73);
            return;
        }
        if (c52869zZ75 != null) {
            m93749g(c52869zZ7, c52869zZ75);
            c52869zZ7.f121541c = null;
        } else if (c52869zZ76 != null) {
            m93749g(c52869zZ7, c52869zZ76);
            c52869zZ7.f121542d = null;
        } else {
            m93749g(c52869zZ7, null);
        }
        m93750f(c52869zZ77, false);
        this.f24797d--;
        this.f24798e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C49294tX7 c49294tX7 = this.f24800g;
        if (c49294tX7 != null) {
            return c49294tX7;
        }
        C49294tX7 c49294tX72 = new C49294tX7(this);
        this.f24800g = c49294tX72;
        return c49294tX72;
    }

    /* renamed from: f */
    public final void m93750f(C52869zZ7 c52869zZ7, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c52869zZ7 != null) {
            C52869zZ7 c52869zZ72 = c52869zZ7.f121541c;
            C52869zZ7 c52869zZ73 = c52869zZ7.f121542d;
            int i5 = 0;
            if (c52869zZ72 != null) {
                i = c52869zZ72.f121547i;
            } else {
                i = 0;
            }
            if (c52869zZ73 != null) {
                i2 = c52869zZ73.f121547i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C52869zZ7 c52869zZ74 = c52869zZ73.f121541c;
                C52869zZ7 c52869zZ75 = c52869zZ73.f121542d;
                if (c52869zZ75 != null) {
                    i4 = c52869zZ75.f121547i;
                } else {
                    i4 = 0;
                }
                if (c52869zZ74 != null) {
                    i5 = c52869zZ74.f121547i;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m93747i(c52869zZ73);
                    m93748h(c52869zZ7);
                } else {
                    m93748h(c52869zZ7);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C52869zZ7 c52869zZ76 = c52869zZ72.f121541c;
                C52869zZ7 c52869zZ77 = c52869zZ72.f121542d;
                if (c52869zZ77 != null) {
                    i3 = c52869zZ77.f121547i;
                } else {
                    i3 = 0;
                }
                if (c52869zZ76 != null) {
                    i5 = c52869zZ76.f121547i;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m93748h(c52869zZ72);
                    m93747i(c52869zZ7);
                } else {
                    m93747i(c52869zZ7);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c52869zZ7.f121547i = i + 1;
                if (z) {
                    return;
                }
            } else {
                c52869zZ7.f121547i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c52869zZ7 = c52869zZ7.f121540b;
        }
    }

    /* renamed from: g */
    public final void m93749g(C52869zZ7 c52869zZ7, C52869zZ7 c52869zZ72) {
        C52869zZ7 c52869zZ73 = c52869zZ7.f121540b;
        c52869zZ7.f121540b = null;
        if (c52869zZ72 != null) {
            c52869zZ72.f121540b = c52869zZ73;
        }
        if (c52869zZ73 != null) {
            if (c52869zZ73.f121541c == c52869zZ7) {
                c52869zZ73.f121541c = c52869zZ72;
                return;
            } else {
                c52869zZ73.f121542d = c52869zZ72;
                return;
            }
        }
        this.f24796c = c52869zZ72;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C52869zZ7 m93753c = m93753c(obj);
        if (m93753c != null) {
            return m93753c.f121546h;
        }
        return null;
    }

    /* renamed from: h */
    public final void m93748h(C52869zZ7 c52869zZ7) {
        int i;
        int i2;
        C52869zZ7 c52869zZ72 = c52869zZ7.f121541c;
        C52869zZ7 c52869zZ73 = c52869zZ7.f121542d;
        C52869zZ7 c52869zZ74 = c52869zZ73.f121541c;
        C52869zZ7 c52869zZ75 = c52869zZ73.f121542d;
        c52869zZ7.f121542d = c52869zZ74;
        if (c52869zZ74 != null) {
            c52869zZ74.f121540b = c52869zZ7;
        }
        m93749g(c52869zZ7, c52869zZ73);
        c52869zZ73.f121541c = c52869zZ7;
        c52869zZ7.f121540b = c52869zZ73;
        int i3 = 0;
        if (c52869zZ72 != null) {
            i = c52869zZ72.f121547i;
        } else {
            i = 0;
        }
        if (c52869zZ74 != null) {
            i2 = c52869zZ74.f121547i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c52869zZ7.f121547i = max;
        if (c52869zZ75 != null) {
            i3 = c52869zZ75.f121547i;
        }
        c52869zZ73.f121547i = Math.max(max, i3) + 1;
    }

    /* renamed from: i */
    public final void m93747i(C52869zZ7 c52869zZ7) {
        int i;
        int i2;
        C52869zZ7 c52869zZ72 = c52869zZ7.f121541c;
        C52869zZ7 c52869zZ73 = c52869zZ7.f121542d;
        C52869zZ7 c52869zZ74 = c52869zZ72.f121541c;
        C52869zZ7 c52869zZ75 = c52869zZ72.f121542d;
        c52869zZ7.f121541c = c52869zZ75;
        if (c52869zZ75 != null) {
            c52869zZ75.f121540b = c52869zZ7;
        }
        m93749g(c52869zZ7, c52869zZ72);
        c52869zZ72.f121542d = c52869zZ7;
        c52869zZ7.f121540b = c52869zZ72;
        int i3 = 0;
        if (c52869zZ73 != null) {
            i = c52869zZ73.f121547i;
        } else {
            i = 0;
        }
        if (c52869zZ75 != null) {
            i2 = c52869zZ75.f121547i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c52869zZ7.f121547i = max;
        if (c52869zZ74 != null) {
            i3 = c52869zZ74.f121547i;
        }
        c52869zZ72.f121547i = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        WY7 wy7 = this.f24801h;
        if (wy7 != null) {
            return wy7;
        }
        WY7 wy72 = new WY7(this);
        this.f24801h = wy72;
        return wy72;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            C52869zZ7 m93755a = m93755a(obj, true);
            Object obj3 = m93755a.f121546h;
            m93755a.f121546h = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C52869zZ7 m93752d = m93752d(obj);
        if (m93752d != null) {
            return m93752d.f121546h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24797d;
    }
}
