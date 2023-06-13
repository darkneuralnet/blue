package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
/* renamed from: kw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44207kw9 extends AbstractMap implements Serializable {

    /* renamed from: i */
    public static final Comparator f95252i = new C40056dw9();

    /* renamed from: b */
    public final Comparator f95253b;

    /* renamed from: c */
    public C43614jw9 f95254c;

    /* renamed from: d */
    public int f95255d;

    /* renamed from: e */
    public int f95256e;

    /* renamed from: f */
    public final C43614jw9 f95257f;

    /* renamed from: g */
    public C41242fw9 f95258g;

    /* renamed from: h */
    public C42428hw9 f95259h;

    public C44207kw9() {
        Comparator comparator = f95252i;
        this.f95255d = 0;
        this.f95256e = 0;
        this.f95257f = new C43614jw9();
        this.f95253b = comparator;
    }

    /* renamed from: a */
    public final C43614jw9 m28109a(Object obj, boolean z) {
        int i;
        C43614jw9 c43614jw9;
        Comparable comparable;
        C43614jw9 c43614jw92;
        Comparator comparator = this.f95253b;
        C43614jw9 c43614jw93 = this.f95254c;
        if (c43614jw93 != null) {
            if (comparator == f95252i) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c43614jw93.f93591g);
                } else {
                    i = comparator.compare(obj, c43614jw93.f93591g);
                }
                if (i == 0) {
                    return c43614jw93;
                }
                if (i < 0) {
                    c43614jw92 = c43614jw93.f93587c;
                } else {
                    c43614jw92 = c43614jw93.f93588d;
                }
                if (c43614jw92 == null) {
                    break;
                }
                c43614jw93 = c43614jw92;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C43614jw9 c43614jw94 = this.f95257f;
        if (c43614jw93 == null) {
            if (comparator == f95252i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c43614jw9 = new C43614jw9(null, obj, c43614jw94, c43614jw94.f93590f);
            this.f95254c = c43614jw9;
        } else {
            c43614jw9 = new C43614jw9(c43614jw93, obj, c43614jw94, c43614jw94.f93590f);
            if (i < 0) {
                c43614jw93.f93587c = c43614jw9;
            } else {
                c43614jw93.f93588d = c43614jw9;
            }
            m28104f(c43614jw93, true);
        }
        this.f95255d++;
        this.f95256e++;
        return c43614jw9;
    }

    /* renamed from: b */
    public final C43614jw9 m28108b(Map.Entry entry) {
        C43614jw9 m28107c = m28107c(entry.getKey());
        if (m28107c != null) {
            Object obj = m28107c.f93592h;
            Object value = entry.getValue();
            if (obj == value || (obj != null && obj.equals(value))) {
                return m28107c;
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public final C43614jw9 m28107c(Object obj) {
        if (obj != null) {
            try {
                return m28109a(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f95254c = null;
        this.f95255d = 0;
        this.f95256e++;
        C43614jw9 c43614jw9 = this.f95257f;
        c43614jw9.f93590f = c43614jw9;
        c43614jw9.f93589e = c43614jw9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return m28107c(obj) != null;
    }

    /* renamed from: d */
    public final C43614jw9 m28106d(Object obj) {
        C43614jw9 m28107c = m28107c(obj);
        if (m28107c != null) {
            m28105e(m28107c, true);
        }
        return m28107c;
    }

    /* renamed from: e */
    public final void m28105e(C43614jw9 c43614jw9, boolean z) {
        C43614jw9 c43614jw92;
        C43614jw9 c43614jw93;
        int i;
        if (z) {
            C43614jw9 c43614jw94 = c43614jw9.f93590f;
            c43614jw94.f93589e = c43614jw9.f93589e;
            c43614jw9.f93589e.f93590f = c43614jw94;
        }
        C43614jw9 c43614jw95 = c43614jw9.f93587c;
        C43614jw9 c43614jw96 = c43614jw9.f93588d;
        C43614jw9 c43614jw97 = c43614jw9.f93586b;
        int i2 = 0;
        if (c43614jw95 != null && c43614jw96 != null) {
            if (c43614jw95.f93593i > c43614jw96.f93593i) {
                do {
                    c43614jw93 = c43614jw95;
                    c43614jw95 = c43614jw95.f93588d;
                } while (c43614jw95 != null);
            } else {
                do {
                    c43614jw92 = c43614jw96;
                    c43614jw96 = c43614jw96.f93587c;
                } while (c43614jw96 != null);
                c43614jw93 = c43614jw92;
            }
            m28105e(c43614jw93, false);
            C43614jw9 c43614jw98 = c43614jw9.f93587c;
            if (c43614jw98 != null) {
                i = c43614jw98.f93593i;
                c43614jw93.f93587c = c43614jw98;
                c43614jw98.f93586b = c43614jw93;
                c43614jw9.f93587c = null;
            } else {
                i = 0;
            }
            C43614jw9 c43614jw99 = c43614jw9.f93588d;
            if (c43614jw99 != null) {
                i2 = c43614jw99.f93593i;
                c43614jw93.f93588d = c43614jw99;
                c43614jw99.f93586b = c43614jw93;
                c43614jw9.f93588d = null;
            }
            c43614jw93.f93593i = Math.max(i, i2) + 1;
            m28103g(c43614jw9, c43614jw93);
            return;
        }
        if (c43614jw95 != null) {
            m28103g(c43614jw9, c43614jw95);
            c43614jw9.f93587c = null;
        } else if (c43614jw96 != null) {
            m28103g(c43614jw9, c43614jw96);
            c43614jw9.f93588d = null;
        } else {
            m28103g(c43614jw9, null);
        }
        m28104f(c43614jw97, false);
        this.f95255d--;
        this.f95256e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C41242fw9 c41242fw9 = this.f95258g;
        if (c41242fw9 != null) {
            return c41242fw9;
        }
        C41242fw9 c41242fw92 = new C41242fw9(this);
        this.f95258g = c41242fw92;
        return c41242fw92;
    }

    /* renamed from: f */
    public final void m28104f(C43614jw9 c43614jw9, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c43614jw9 != null) {
            C43614jw9 c43614jw92 = c43614jw9.f93587c;
            C43614jw9 c43614jw93 = c43614jw9.f93588d;
            int i5 = 0;
            if (c43614jw92 != null) {
                i = c43614jw92.f93593i;
            } else {
                i = 0;
            }
            if (c43614jw93 != null) {
                i2 = c43614jw93.f93593i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C43614jw9 c43614jw94 = c43614jw93.f93587c;
                C43614jw9 c43614jw95 = c43614jw93.f93588d;
                if (c43614jw95 != null) {
                    i4 = c43614jw95.f93593i;
                } else {
                    i4 = 0;
                }
                if (c43614jw94 != null) {
                    i5 = c43614jw94.f93593i;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m28101i(c43614jw93);
                    m28102h(c43614jw9);
                } else {
                    m28102h(c43614jw9);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C43614jw9 c43614jw96 = c43614jw92.f93587c;
                C43614jw9 c43614jw97 = c43614jw92.f93588d;
                if (c43614jw97 != null) {
                    i3 = c43614jw97.f93593i;
                } else {
                    i3 = 0;
                }
                if (c43614jw96 != null) {
                    i5 = c43614jw96.f93593i;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m28102h(c43614jw92);
                    m28101i(c43614jw9);
                } else {
                    m28101i(c43614jw9);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c43614jw9.f93593i = i + 1;
                if (z) {
                    return;
                }
            } else {
                c43614jw9.f93593i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c43614jw9 = c43614jw9.f93586b;
        }
    }

    /* renamed from: g */
    public final void m28103g(C43614jw9 c43614jw9, C43614jw9 c43614jw92) {
        C43614jw9 c43614jw93 = c43614jw9.f93586b;
        c43614jw9.f93586b = null;
        if (c43614jw92 != null) {
            c43614jw92.f93586b = c43614jw93;
        }
        if (c43614jw93 != null) {
            if (c43614jw93.f93587c == c43614jw9) {
                c43614jw93.f93587c = c43614jw92;
                return;
            } else {
                c43614jw93.f93588d = c43614jw92;
                return;
            }
        }
        this.f95254c = c43614jw92;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C43614jw9 m28107c = m28107c(obj);
        if (m28107c != null) {
            return m28107c.f93592h;
        }
        return null;
    }

    /* renamed from: h */
    public final void m28102h(C43614jw9 c43614jw9) {
        int i;
        int i2;
        C43614jw9 c43614jw92 = c43614jw9.f93587c;
        C43614jw9 c43614jw93 = c43614jw9.f93588d;
        C43614jw9 c43614jw94 = c43614jw93.f93587c;
        C43614jw9 c43614jw95 = c43614jw93.f93588d;
        c43614jw9.f93588d = c43614jw94;
        if (c43614jw94 != null) {
            c43614jw94.f93586b = c43614jw9;
        }
        m28103g(c43614jw9, c43614jw93);
        c43614jw93.f93587c = c43614jw9;
        c43614jw9.f93586b = c43614jw93;
        int i3 = 0;
        if (c43614jw92 != null) {
            i = c43614jw92.f93593i;
        } else {
            i = 0;
        }
        if (c43614jw94 != null) {
            i2 = c43614jw94.f93593i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c43614jw9.f93593i = max;
        if (c43614jw95 != null) {
            i3 = c43614jw95.f93593i;
        }
        c43614jw93.f93593i = Math.max(max, i3) + 1;
    }

    /* renamed from: i */
    public final void m28101i(C43614jw9 c43614jw9) {
        int i;
        int i2;
        C43614jw9 c43614jw92 = c43614jw9.f93587c;
        C43614jw9 c43614jw93 = c43614jw9.f93588d;
        C43614jw9 c43614jw94 = c43614jw92.f93587c;
        C43614jw9 c43614jw95 = c43614jw92.f93588d;
        c43614jw9.f93587c = c43614jw95;
        if (c43614jw95 != null) {
            c43614jw95.f93586b = c43614jw9;
        }
        m28103g(c43614jw9, c43614jw92);
        c43614jw92.f93588d = c43614jw9;
        c43614jw9.f93586b = c43614jw92;
        int i3 = 0;
        if (c43614jw93 != null) {
            i = c43614jw93.f93593i;
        } else {
            i = 0;
        }
        if (c43614jw95 != null) {
            i2 = c43614jw95.f93593i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c43614jw9.f93593i = max;
        if (c43614jw94 != null) {
            i3 = c43614jw94.f93593i;
        }
        c43614jw92.f93593i = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C42428hw9 c42428hw9 = this.f95259h;
        if (c42428hw9 != null) {
            return c42428hw9;
        }
        C42428hw9 c42428hw92 = new C42428hw9(this);
        this.f95259h = c42428hw92;
        return c42428hw92;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            C43614jw9 m28109a = m28109a(obj, true);
            Object obj3 = m28109a.f93592h;
            m28109a.f93592h = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C43614jw9 m28106d = m28106d(obj);
        if (m28106d != null) {
            return m28106d.f93592h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f95255d;
    }
}
