package p000;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p000.InterfaceC32648El0;
import p000.OW3;
/* renamed from: Y83 */
/* loaded from: classes6.dex */
public class Y83<T extends InterfaceC32648El0> implements InterfaceC2175F9<T> {

    /* renamed from: c */
    public static final QN5 f44667c = new QN5(1.0d);

    /* renamed from: a */
    public final Collection<C9681a<T>> f44668a = new ArrayList();

    /* renamed from: b */
    public final OW3<C9681a<T>> f44669b = new OW3<>(0.0d, 1.0d, 0.0d, 1.0d);

    /* renamed from: Y83$a */
    /* loaded from: classes6.dex */
    public static class C9681a<T extends InterfaceC32648El0> implements OW3.InterfaceC6024a, InterfaceC32414Dl0<T> {

        /* renamed from: a */
        public final T f44670a;

        /* renamed from: b */
        public final GW3 f44671b;

        /* renamed from: c */
        public final LatLng f44672c;

        /* renamed from: d */
        public Set<T> f44673d;

        @Override // p000.InterfaceC32414Dl0
        /* renamed from: a */
        public int mo75549a() {
            return 1;
        }

        @Override // p000.OW3.InterfaceC6024a
        /* renamed from: c */
        public GW3 mo75547c() {
            return this.f44671b;
        }

        @Override // p000.InterfaceC32414Dl0
        /* renamed from: e */
        public Set<T> mo75548b() {
            return this.f44673d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9681a)) {
                return false;
            }
            return ((C9681a) obj).f44670a.equals(this.f44670a);
        }

        @Override // p000.InterfaceC32414Dl0
        public LatLng getPosition() {
            return this.f44672c;
        }

        public int hashCode() {
            return this.f44670a.hashCode();
        }

        public C9681a(T t) {
            this.f44670a = t;
            LatLng position = t.getPosition();
            this.f44672c = position;
            this.f44671b = Y83.f44667c.m88534b(position);
            this.f44673d = Collections.singleton(t);
        }
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: b */
    public Collection<T> mo72963b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f44669b) {
            for (C9681a<T> c9681a : this.f44668a) {
                arrayList.add(c9681a.f44670a);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: c */
    public void mo72962c(T t) {
        C9681a<T> c9681a = new C9681a<>(t);
        synchronized (this.f44669b) {
            this.f44668a.add(c9681a);
            this.f44669b.m92115a(c9681a);
        }
    }

    @Override // p000.InterfaceC2175F9
    public void clearItems() {
        synchronized (this.f44669b) {
            this.f44668a.clear();
            this.f44669b.m92114b();
        }
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: d */
    public void mo72961d(Collection<T> collection) {
        for (T t : collection) {
            mo72962c(t);
        }
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: e */
    public void mo72960e(T t) {
        C9681a<T> c9681a = new C9681a<>(t);
        synchronized (this.f44669b) {
            this.f44668a.remove(c9681a);
            this.f44669b.m92111e(c9681a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2175F9
    /* renamed from: f */
    public Set<? extends InterfaceC32414Dl0<T>> mo72959f(double d) {
        Collection<C9681a<T>> m92110f;
        double pow = (100.0d / Math.pow(2.0d, (int) d)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.f44669b) {
            for (C9681a<T> c9681a : this.f44668a) {
                if (!hashSet.contains(c9681a)) {
                    if (!c9681a.f44670a.shouldCluster()) {
                        m92110f = Collections.singleton(c9681a);
                    } else {
                        m92110f = this.f44669b.m92110f(m75551h(c9681a.mo75547c(), pow));
                    }
                    if (m92110f.size() == 1) {
                        hashSet2.add(c9681a);
                        hashSet.add(c9681a);
                        hashMap.put(c9681a, Double.valueOf(0.0d));
                    } else {
                        NP5 np5 = new NP5(c9681a.f44670a.getPosition());
                        hashSet2.add(np5);
                        for (C9681a<T> c9681a2 : m92110f) {
                            Double d2 = (Double) hashMap.get(c9681a2);
                            double d3 = pow;
                            double m75550i = m75550i(c9681a2.mo75547c(), c9681a.mo75547c());
                            if (d2 != null) {
                                if (c9681a2.f44670a.shouldCluster() && d2.doubleValue() >= m75550i) {
                                    NP5 np52 = (NP5) hashMap2.get(c9681a2);
                                    if (np52 != 0) {
                                        np52.m93921d(c9681a2.f44670a);
                                    }
                                }
                                pow = d3;
                            }
                            hashMap.put(c9681a2, Double.valueOf(m75550i));
                            np5.m93922c(c9681a2.f44670a);
                            hashMap2.put(c9681a2, np5);
                            pow = d3;
                        }
                        hashSet.addAll(m92110f);
                        pow = pow;
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: g */
    public void mo72958g(T t) {
        C9681a<T> c9681a = new C9681a<>(t);
        synchronized (this.f44669b) {
            this.f44668a.remove(c9681a);
            this.f44669b.m92111e(c9681a);
            this.f44668a.add(c9681a);
            this.f44669b.m92115a(c9681a);
        }
    }

    /* renamed from: h */
    public final C51351x00 m75551h(GW3 gw3, double d) {
        double d2 = d / 2.0d;
        double d3 = gw3.f12013a;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = gw3.f12014b;
        return new C51351x00(d4, d5, d6 - d2, d6 + d2);
    }

    /* renamed from: i */
    public final double m75550i(GW3 gw3, GW3 gw32) {
        double d = gw3.f12013a;
        double d2 = gw32.f12013a;
        double d3 = (d - d2) * (d - d2);
        double d4 = gw3.f12014b;
        double d5 = gw32.f12014b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }
}
