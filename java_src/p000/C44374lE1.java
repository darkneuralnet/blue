package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.InterfaceC38016aY3;
/* renamed from: lE1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44374lE1<K extends InterfaceC38016aY3, V> {

    /* renamed from: a */
    public final C25661a<K, V> f95744a = new C25661a<>();

    /* renamed from: b */
    public final Map<K, C25661a<K, V>> f95745b = new HashMap();

    /* renamed from: lE1$a */
    /* loaded from: classes5.dex */
    public static class C25661a<K, V> {

        /* renamed from: a */
        public final K f95746a;

        /* renamed from: b */
        public List<V> f95747b;

        /* renamed from: c */
        public C25661a<K, V> f95748c;

        /* renamed from: d */
        public C25661a<K, V> f95749d;

        public C25661a() {
            this(null);
        }

        /* renamed from: a */
        public void m27648a(V v) {
            if (this.f95747b == null) {
                this.f95747b = new ArrayList();
            }
            this.f95747b.add(v);
        }

        /* renamed from: b */
        public V m27647b() {
            int m27646c = m27646c();
            if (m27646c > 0) {
                return this.f95747b.remove(m27646c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m27646c() {
            List<V> list = this.f95747b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C25661a(K k) {
            this.f95749d = this;
            this.f95748c = this;
            this.f95746a = k;
        }
    }

    /* renamed from: e */
    public static <K, V> void m27651e(C25661a<K, V> c25661a) {
        C25661a<K, V> c25661a2 = c25661a.f95749d;
        c25661a2.f95748c = c25661a.f95748c;
        c25661a.f95748c.f95749d = c25661a2;
    }

    /* renamed from: g */
    public static <K, V> void m27649g(C25661a<K, V> c25661a) {
        c25661a.f95748c.f95749d = c25661a;
        c25661a.f95749d.f95748c = c25661a;
    }

    /* renamed from: a */
    public V m27655a(K k) {
        C25661a<K, V> c25661a = this.f95745b.get(k);
        if (c25661a == null) {
            c25661a = new C25661a<>(k);
            this.f95745b.put(k, c25661a);
        } else {
            k.mo1681a();
        }
        m27654b(c25661a);
        return c25661a.m27647b();
    }

    /* renamed from: b */
    public final void m27654b(C25661a<K, V> c25661a) {
        m27651e(c25661a);
        C25661a<K, V> c25661a2 = this.f95744a;
        c25661a.f95749d = c25661a2;
        c25661a.f95748c = c25661a2.f95748c;
        m27649g(c25661a);
    }

    /* renamed from: c */
    public final void m27653c(C25661a<K, V> c25661a) {
        m27651e(c25661a);
        C25661a<K, V> c25661a2 = this.f95744a;
        c25661a.f95749d = c25661a2.f95749d;
        c25661a.f95748c = c25661a2;
        m27649g(c25661a);
    }

    /* renamed from: d */
    public void m27652d(K k, V v) {
        C25661a<K, V> c25661a = this.f95745b.get(k);
        if (c25661a == null) {
            c25661a = new C25661a<>(k);
            m27653c(c25661a);
            this.f95745b.put(k, c25661a);
        } else {
            k.mo1681a();
        }
        c25661a.m27648a(v);
    }

    /* renamed from: f */
    public V m27650f() {
        for (C25661a c25661a = this.f95744a.f95749d; !c25661a.equals(this.f95744a); c25661a = c25661a.f95749d) {
            V v = (V) c25661a.m27647b();
            if (v != null) {
                return v;
            }
            m27651e(c25661a);
            this.f95745b.remove(c25661a.f95746a);
            ((InterfaceC38016aY3) c25661a.f95746a).mo1681a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C25661a c25661a = this.f95744a.f95748c;
        boolean z = false;
        while (!c25661a.equals(this.f95744a)) {
            sb.append(CoreConstants.CURLY_LEFT);
            sb.append(c25661a.f95746a);
            sb.append(CoreConstants.COLON_CHAR);
            sb.append(c25661a.m27646c());
            sb.append("}, ");
            c25661a = c25661a.f95748c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
