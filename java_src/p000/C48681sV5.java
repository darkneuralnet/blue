package p000;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C11240m;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C4240Jo;
/* renamed from: sV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48681sV5 {

    /* renamed from: a */
    public final InterfaceC33962Kb0 f108888a;

    /* renamed from: b */
    public final Rational f108889b;

    /* renamed from: c */
    public final boolean f108890c;

    /* renamed from: d */
    public final C49274tV5 f108891d;

    public C48681sV5(InterfaceC33962Kb0 interfaceC33962Kb0) {
        this.f108888a = interfaceC33962Kb0;
        Rational m14136a = m14136a(interfaceC33962Kb0);
        this.f108889b = m14136a;
        boolean z = true;
        if (m14136a != null && m14136a.getNumerator() < m14136a.getDenominator()) {
            z = false;
        }
        this.f108890c = z;
        this.f108891d = new C49274tV5(interfaceC33962Kb0, m14136a);
    }

    /* renamed from: b */
    public static List<Size> m14135b(List<Size> list, C11240m c11240m) {
        Size m69146a = c11240m.m69146a();
        if (m69146a == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!IB5.m102816b(size, m69146a)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new IllegalArgumentException("Resolution candidate list is empty after filtering out by the settings!");
    }

    /* renamed from: e */
    public static List<Rational> m14132e(List<Size> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4240Jo.f18254a);
        arrayList.add(C4240Jo.f18256c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C4240Jo.m99687a(size, (Rational) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    arrayList.add(rational);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Rational m14130g(int i, boolean z) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    C33928Jx2.m99531c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
                } else if (z) {
                    return C4240Jo.f18256c;
                } else {
                    return C4240Jo.f18257d;
                }
            } else if (z) {
                return C4240Jo.f18254a;
            } else {
                return C4240Jo.f18255b;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static Map<Rational, List<Size>> m14129h(List<Size> list) {
        HashMap hashMap = new HashMap();
        for (Rational rational : m14132e(list)) {
            hashMap.put(rational, new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational2 : hashMap.keySet()) {
                if (C4240Jo.m99687a(size, rational2)) {
                    ((List) hashMap.get(rational2)).add(size);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    public static List<Size> m14125l(List<Size> list, Size size) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = list.get(i);
            if (size2.getWidth() >= size.getWidth() && size2.getHeight() >= size.getHeight()) {
                arrayList.add(0, size2);
            } else {
                arrayList.add(size2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Rational m14136a(InterfaceC33962Kb0 interfaceC33962Kb0) {
        List<Size> mo98715l = interfaceC33962Kb0.mo98715l(256);
        if (mo98715l.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(mo98715l, new C36194Tp0());
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: c */
    public final List<Size> m14134c(int i, InterfaceC11206k interfaceC11206k) {
        Size[] sizeArr;
        List<Pair<Integer, Size[]>> m69380k = interfaceC11206k.m69380k(null);
        if (m69380k != null) {
            for (Pair<Integer, Size[]> pair : m69380k) {
                if (((Integer) pair.first).intValue() == i) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    /* renamed from: d */
    public final List<Size> m14133d(InterfaceC11225s<?> interfaceC11225s) {
        int mo69364l = interfaceC11225s.mo69364l();
        InterfaceC11206k interfaceC11206k = (InterfaceC11206k) interfaceC11225s;
        List<Size> m14134c = m14134c(mo69364l, interfaceC11206k);
        if (m14134c == null) {
            m14134c = this.f108888a.mo98715l(mo69364l);
        }
        if (interfaceC11206k.m69374z(null) != null && interfaceC11206k.m69386A().m69142e()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(m14134c);
            arrayList.addAll(this.f108888a.mo98717j(mo69364l));
            return arrayList;
        }
        return m14134c;
    }

    /* renamed from: f */
    public List<Size> m14131f(InterfaceC11225s<?> interfaceC11225s) {
        InterfaceC11206k interfaceC11206k = (InterfaceC11206k) interfaceC11225s;
        List<Size> m69377t = interfaceC11206k.m69377t(null);
        if (m69377t != null) {
            return m69377t;
        }
        List<Size> m14133d = m14133d(interfaceC11225s);
        C11240m m69374z = interfaceC11206k.m69374z(null);
        if (m69374z == null) {
            return this.f108891d.m12271f(m14133d, interfaceC11225s);
        }
        Size m69144c = m69374z.m69144c();
        if (m69144c == null) {
            m69144c = interfaceC11206k.m69382J(null);
        }
        return m14126k(m14133d, m69374z, m69144c);
    }

    /* renamed from: i */
    public final List<Size> m14128i(List<Size> list, C11240m c11240m, Size size) {
        Rational m14130g = m14130g(c11240m.m69145b(), this.f108890c);
        HZ3.m103730h(m14130g, "ResolutionSelector should also have aspect ratio value.");
        Size m69144c = c11240m.m69144c();
        List<Size> m14127j = m14127j(list, m14130g, size);
        if (m14127j.contains(m69144c)) {
            m14127j.remove(m69144c);
            m14127j.add(0, m69144c);
        }
        return m14127j;
    }

    /* renamed from: j */
    public final List<Size> m14127j(List<Size> list, Rational rational, Size size) {
        Map<Rational, List<Size>> m14129h = m14129h(list);
        if (size != null) {
            for (Rational rational2 : m14129h.keySet()) {
                m14129h.put(rational2, m14125l(m14129h.get(rational2), size));
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(m14129h.keySet());
        Collections.sort(arrayList, new C4240Jo.C4241a(rational, this.f108889b));
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational3 : arrayList) {
            for (Size size2 : m14129h.get(rational3)) {
                if (!arrayList2.contains(size2)) {
                    arrayList2.add(size2);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: k */
    public final List<Size> m14126k(List<Size> list, C11240m c11240m, Size size) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C36194Tp0(true));
        return m14128i(m14135b(arrayList, c11240m), c11240m, size);
    }
}
