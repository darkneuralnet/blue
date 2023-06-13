package p000;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* renamed from: Qc4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35379Qc4 {

    /* renamed from: b */
    public static final Map<C52885zb4, Range<Integer>> f30584b;

    /* renamed from: c */
    public static final Map<Integer, Rational> f30585c;

    /* renamed from: a */
    public final Map<AbstractC6815a, List<Size>> f30586a = new HashMap();

    /* renamed from: Qc4$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6815a {
        /* renamed from: c */
        public static AbstractC6815a m88321c(C52885zb4 c52885zb4, int i) {
            return new C10427Zt(c52885zb4, i);
        }

        /* renamed from: a */
        public abstract int mo72351a();

        /* renamed from: b */
        public abstract C52885zb4 mo72350b();
    }

    static {
        HashMap hashMap = new HashMap();
        f30584b = hashMap;
        hashMap.put(C52885zb4.f121577d, Range.create(2160, 4319));
        hashMap.put(C52885zb4.f121576c, Range.create(1080, 1439));
        hashMap.put(C52885zb4.f121575b, Range.create(720, 1079));
        hashMap.put(C52885zb4.f121574a, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f30585c = hashMap2;
        hashMap2.put(0, C4240Jo.f18254a);
        hashMap2.put(1, C4240Jo.f18256c);
    }

    public C35379Qc4(List<Size> list, Map<C52885zb4, Size> map) {
        for (C52885zb4 c52885zb4 : f30584b.keySet()) {
            this.f30586a.put(AbstractC6815a.m88321c(c52885zb4, -1), new ArrayList());
            for (Integer num : f30585c.keySet()) {
                this.f30586a.put(AbstractC6815a.m88321c(c52885zb4, num.intValue()), new ArrayList());
            }
        }
        m88329b(map);
        m88328c(list);
        m88322i(map);
    }

    /* renamed from: d */
    public static Integer m88327d(Size size) {
        for (Map.Entry<Integer, Rational> entry : f30585c.entrySet()) {
            if (C4240Jo.m99686b(size, entry.getValue(), IB5.f14642b)) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C52885zb4 m88326e(Size size) {
        for (Map.Entry<C52885zb4, Range<Integer>> entry : f30584b.entrySet()) {
            if (entry.getValue().contains((Range<Integer>) Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ int m88323h(int i, Size size, Size size2) {
        return Math.abs(IB5.m102817a(size) - i) - Math.abs(IB5.m102817a(size2) - i);
    }

    /* renamed from: b */
    public final void m88329b(Map<C52885zb4, Size> map) {
        for (Map.Entry<C52885zb4, Size> entry : map.entrySet()) {
            List<Size> m88325f = m88325f(entry.getKey(), -1);
            Objects.requireNonNull(m88325f);
            m88325f.add(entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m88328c(List<Size> list) {
        Integer m88327d;
        for (Size size : list) {
            C52885zb4 m88326e = m88326e(size);
            if (m88326e != null && (m88327d = m88327d(size)) != null) {
                List<Size> m88325f = m88325f(m88326e, m88327d.intValue());
                Objects.requireNonNull(m88325f);
                m88325f.add(size);
            }
        }
    }

    /* renamed from: f */
    public final List<Size> m88325f(C52885zb4 c52885zb4, int i) {
        return this.f30586a.get(AbstractC6815a.m88321c(c52885zb4, i));
    }

    /* renamed from: g */
    public List<Size> m88324g(C52885zb4 c52885zb4, int i) {
        ArrayList arrayList;
        List<Size> m88325f = m88325f(c52885zb4, i);
        if (m88325f != null) {
            arrayList = new ArrayList(m88325f);
        } else {
            arrayList = new ArrayList(0);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void m88322i(Map<C52885zb4, Size> map) {
        for (Map.Entry<AbstractC6815a, List<Size>> entry : this.f30586a.entrySet()) {
            Size size = map.get(entry.getKey().mo72350b());
            if (size != null) {
                final int m102817a = IB5.m102817a(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: Pc4
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m88323h;
                        m88323h = C35379Qc4.m88323h(m102817a, (Size) obj, (Size) obj2);
                        return m88323h;
                    }
                });
            }
        }
    }
}
