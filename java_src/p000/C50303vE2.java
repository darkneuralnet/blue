package p000;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* renamed from: vE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50303vE2<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f113715a;

    /* renamed from: b */
    public int f113716b;

    /* renamed from: c */
    public int f113717c;

    /* renamed from: d */
    public int f113718d;

    /* renamed from: e */
    public int f113719e;

    /* renamed from: f */
    public int f113720f;

    /* renamed from: g */
    public int f113721g;

    /* renamed from: h */
    public int f113722h;

    public C50303vE2(int i) {
        if (i > 0) {
            this.f113717c = i;
            this.f113715a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public V mo8996a(K k) {
        return null;
    }

    /* renamed from: b */
    public void m8995b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final void m8994c() {
        m8987j(-1);
    }

    /* renamed from: d */
    public final V m8993d(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f113715a.get(k);
                if (v != null) {
                    this.f113721g++;
                    return v;
                }
                this.f113722h++;
                V mo8996a = mo8996a(k);
                if (mo8996a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f113719e++;
                    put = this.f113715a.put(k, mo8996a);
                    if (put != null) {
                        this.f113715a.put(k, put);
                    } else {
                        this.f113716b += m8990g(k, mo8996a);
                    }
                }
                if (put != null) {
                    m8995b(false, k, mo8996a, put);
                    return put;
                }
                m8987j(this.f113717c);
                return mo8996a;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: e */
    public final V m8992e(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.f113718d++;
                this.f113716b += m8990g(k, v);
                put = this.f113715a.put(k, v);
                if (put != null) {
                    this.f113716b -= m8990g(k, put);
                }
            }
            if (put != null) {
                m8995b(false, k, put, v);
            }
            m8987j(this.f113717c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* renamed from: f */
    public final V m8991f(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f113715a.remove(k);
                if (remove != null) {
                    this.f113716b -= m8990g(k, remove);
                }
            }
            if (remove != null) {
                m8995b(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: g */
    public final int m8990g(K k, V v) {
        int m8989h = m8989h(k, v);
        if (m8989h >= 0) {
            return m8989h;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: h */
    public int m8989h(K k, V v) {
        return 1;
    }

    /* renamed from: i */
    public final synchronized Map<K, V> m8988i() {
        return new LinkedHashMap(this.f113715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m8987j(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f113716b >= 0 && (!this.f113715a.isEmpty() || this.f113716b == 0)) {
                    if (this.f113716b <= i || this.f113715a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f113715a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f113715a.remove(key);
                    this.f113716b -= m8990g(key, value);
                    this.f113720f++;
                } else {
                    break;
                }
            }
            m8995b(true, key, value, null);
        }
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f113721g;
        int i3 = this.f113722h + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f113717c), Integer.valueOf(this.f113721g), Integer.valueOf(this.f113722h), Integer.valueOf(i));
    }
}
