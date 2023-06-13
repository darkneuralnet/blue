package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* renamed from: j41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43092j41<T> {

    /* renamed from: a */
    public final InterfaceC41591gY3<ArrayList<T>> f92098a = new C42777iY3(10);

    /* renamed from: b */
    public final NA5<T, ArrayList<T>> f92099b = new NA5<>();

    /* renamed from: c */
    public final ArrayList<T> f92100c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f92101d = new HashSet<>();

    /* renamed from: a */
    public void m31184a(T t, T t2) {
        if (this.f92099b.containsKey(t) && this.f92099b.containsKey(t2)) {
            ArrayList<T> arrayList = this.f92099b.get(t);
            if (arrayList == null) {
                arrayList = m31179f();
                this.f92099b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: b */
    public void m31183b(T t) {
        if (!this.f92099b.containsKey(t)) {
            this.f92099b.put(t, null);
        }
    }

    /* renamed from: c */
    public void m31182c() {
        int size = this.f92099b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m94263m = this.f92099b.m94263m(i);
            if (m94263m != null) {
                m31174k(m94263m);
            }
        }
        this.f92099b.clear();
    }

    /* renamed from: d */
    public boolean m31181d(T t) {
        return this.f92099b.containsKey(t);
    }

    /* renamed from: e */
    public final void m31180e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.f92099b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m31180e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: f */
    public final ArrayList<T> m31179f() {
        ArrayList<T> mo9830a = this.f92098a.mo9830a();
        if (mo9830a == null) {
            return new ArrayList<>();
        }
        return mo9830a;
    }

    /* renamed from: g */
    public List m31178g(T t) {
        return this.f92099b.get(t);
    }

    /* renamed from: h */
    public List<T> m31177h(T t) {
        int size = this.f92099b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m94263m = this.f92099b.m94263m(i);
            if (m94263m != null && m94263m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f92099b.m94264i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m31176i() {
        this.f92100c.clear();
        this.f92101d.clear();
        int size = this.f92099b.size();
        for (int i = 0; i < size; i++) {
            m31180e(this.f92099b.m94264i(i), this.f92100c, this.f92101d);
        }
        return this.f92100c;
    }

    /* renamed from: j */
    public boolean m31175j(T t) {
        int size = this.f92099b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m94263m = this.f92099b.m94263m(i);
            if (m94263m != null && m94263m.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void m31174k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f92098a.mo9829b(arrayList);
    }
}
