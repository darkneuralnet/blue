package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.F21;
/* renamed from: D21 */
/* loaded from: classes6.dex */
public class D21 implements Map<String, C21> {

    /* renamed from: b */
    public final HashMap<String, F21> f5102b;

    /* renamed from: c */
    public final F21.InterfaceC2057a f5103c;

    /* renamed from: D21$a */
    /* loaded from: classes6.dex */
    public class C1336a implements F21.InterfaceC2057a {
        @Override // p000.F21.InterfaceC2057a
        /* renamed from: a */
        public F21 mo108088a(C21 c21) {
            return new F21(c21);
        }
    }

    public D21() {
        this(new C1336a());
    }

    /* renamed from: a */
    public final void m111027a() {
        Iterator<Map.Entry<String, F21>> it = this.f5102b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().m108089b()) {
                it.remove();
            }
        }
    }

    @Override // java.util.Map
    /* renamed from: b */
    public C21 get(Object obj) {
        F21 f21 = this.f5102b.get(obj);
        if (f21 != null) {
            return f21.get();
        }
        return null;
    }

    @Override // java.util.Map
    /* renamed from: c */
    public C21 put(String str, C21 c21) {
        this.f5102b.put(str, this.f5103c.mo108088a(c21));
        m111027a();
        return c21;
    }

    @Override // java.util.Map
    public void clear() {
        this.f5102b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5102b.containsKey(obj) && get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        for (F21 f21 : this.f5102b.values()) {
            if (f21.m108090a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: d */
    public C21 remove(Object obj) {
        F21 remove = this.f5102b.remove(obj);
        m111027a();
        if (remove != null) {
            return remove.get();
        }
        return null;
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, C21>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, F21> entry : this.f5102b.entrySet()) {
            F21 value = entry.getValue();
            if (!value.m108089b()) {
                hashSet.add(new C40759f80(entry.getKey(), this.f5103c.mo108088a(value.get())));
            }
        }
        return hashSet;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        m111027a();
        return this.f5102b.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.f5102b.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends C21> map) {
        for (Map.Entry<? extends String, ? extends C21> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        m111027a();
        return this.f5102b.size();
    }

    @Override // java.util.Map
    public Collection<C21> values() {
        ArrayList arrayList = new ArrayList();
        for (F21 f21 : this.f5102b.values()) {
            if (!f21.m108089b()) {
                arrayList.add(f21.get());
            }
        }
        return arrayList;
    }

    public D21(F21.InterfaceC2057a interfaceC2057a) {
        this.f5102b = new HashMap<>();
        this.f5103c = interfaceC2057a;
    }
}
