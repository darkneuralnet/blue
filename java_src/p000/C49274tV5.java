package p000;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C4240Jo;
/* renamed from: tV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49274tV5 {

    /* renamed from: a */
    public final int f110552a;

    /* renamed from: b */
    public final int f110553b;

    /* renamed from: c */
    public final Rational f110554c;

    /* renamed from: d */
    public final boolean f110555d;

    public C49274tV5(InterfaceC33962Kb0 interfaceC33962Kb0, Rational rational) {
        this.f110552a = interfaceC33962Kb0.mo100135i();
        this.f110553b = interfaceC33962Kb0.mo100139b();
        this.f110554c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.f110555d = z;
    }

    /* renamed from: a */
    public static Size m12276a(Size size, int i, int i2, int i3) {
        if (size != null && m12272e(i, i2, i3)) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    /* renamed from: b */
    public static Rational m12275b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : C48681sV5.m14132e(list)) {
            if (C4240Jo.m99687a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: e */
    public static boolean m12272e(int i, int i2, int i3) {
        boolean z;
        int m71099b = C38051ac0.m71099b(i);
        if (1 == i2) {
            z = true;
        } else {
            z = false;
        }
        int m71100a = C38051ac0.m71100a(m71099b, i3, z);
        if (m71100a != 90 && m71100a != 270) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final Rational m12274c(InterfaceC11206k interfaceC11206k, List<Size> list) {
        if (interfaceC11206k.m69384G()) {
            return C48681sV5.m14130g(interfaceC11206k.m69383I(), this.f110555d);
        }
        Size m12273d = m12273d(interfaceC11206k);
        if (m12273d != null) {
            return m12275b(m12273d, list);
        }
        return null;
    }

    /* renamed from: d */
    public final Size m12273d(InterfaceC11206k interfaceC11206k) {
        return m12276a(interfaceC11206k.m69376u(null), interfaceC11206k.m69378s(0), this.f110553b, this.f110552a);
    }

    /* renamed from: f */
    public List<Size> m12271f(List<Size> list, InterfaceC11225s<?> interfaceC11225s) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C36194Tp0(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC11206k interfaceC11206k = (InterfaceC11206k) interfaceC11225s;
        Size m69381i = interfaceC11206k.m69381i(null);
        Size size = (Size) arrayList.get(0);
        if (m69381i == null || IB5.m102817a(size) < IB5.m102817a(m69381i)) {
            m69381i = size;
        }
        Size m12273d = m12273d(interfaceC11206k);
        Size size2 = IB5.f14643c;
        int m102817a = IB5.m102817a(size2);
        if (IB5.m102817a(m69381i) < m102817a) {
            size2 = IB5.f14641a;
        } else if (m12273d != null && IB5.m102817a(m12273d) < m102817a) {
            size2 = m12273d;
        }
        for (Size size3 : arrayList) {
            if (IB5.m102817a(size3) <= IB5.m102817a(m69381i) && IB5.m102817a(size3) >= IB5.m102817a(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (!arrayList2.isEmpty()) {
            Rational m12274c = m12274c(interfaceC11206k, arrayList2);
            if (m12273d == null) {
                m12273d = interfaceC11206k.m69382J(null);
            }
            ArrayList arrayList3 = new ArrayList();
            new HashMap();
            if (m12274c == null) {
                arrayList3.addAll(arrayList2);
                if (m12273d != null) {
                    return C48681sV5.m14125l(arrayList3, m12273d);
                }
                return arrayList3;
            }
            Map<Rational, List<Size>> m14129h = C48681sV5.m14129h(arrayList2);
            if (m12273d != null) {
                for (Rational rational : m14129h.keySet()) {
                    m14129h.put(rational, C48681sV5.m14125l(m14129h.get(rational), m12273d));
                }
            }
            ArrayList<Rational> arrayList4 = new ArrayList(m14129h.keySet());
            Collections.sort(arrayList4, new C4240Jo.C4241a(m12274c, this.f110554c));
            for (Rational rational2 : arrayList4) {
                for (Size size4 : m14129h.get(rational2)) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
            return arrayList3;
        }
        throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings.");
    }
}
