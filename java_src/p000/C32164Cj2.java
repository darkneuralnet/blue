package p000;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: Cj2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32164Cj2 {

    /* renamed from: c */
    public static final InterfaceC32632Ej2<InterfaceC35881Sg2> f4551c = new C1153j();

    /* renamed from: d */
    public static final InterfaceC32632Ej2<InterfaceC35881Sg2> f4552d = new C1154k();

    /* renamed from: e */
    public static final InterfaceC32632Ej2<InterfaceC34009Kg2> f4553e = new C1155l();

    /* renamed from: f */
    public static final InterfaceC32632Ej2<InterfaceC33775Jg2> f4554f = new C1156m();

    /* renamed from: g */
    public static final InterfaceC32632Ej2<Iterable<? extends Object>> f4555g = new C1157n();

    /* renamed from: h */
    public static final InterfaceC32632Ej2<Enum<?>> f4556h = new C1158o();

    /* renamed from: i */
    public static final InterfaceC32632Ej2<Map<String, ? extends Object>> f4557i = new C1159p();

    /* renamed from: j */
    public static final InterfaceC32632Ej2<Object> f4558j = new C24763jG();

    /* renamed from: k */
    public static final InterfaceC32632Ej2<Object> f4559k = new C23178iG();

    /* renamed from: l */
    public static final InterfaceC32632Ej2<Object> f4560l = new C31506zo();

    /* renamed from: m */
    public static final InterfaceC32632Ej2<Object> f4561m = new C1160q();

    /* renamed from: a */
    public ConcurrentHashMap<Class<?>, InterfaceC32632Ej2<?>> f4562a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public LinkedList<C1162s> f4563b = new LinkedList<>();

    /* renamed from: Cj2$a */
    /* loaded from: classes6.dex */
    public class C1144a implements InterfaceC32632Ej2<Double> {
        public C1144a() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(Double d, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            if (d.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(d.toString());
            }
        }
    }

    /* renamed from: Cj2$b */
    /* loaded from: classes6.dex */
    public class C1145b implements InterfaceC32632Ej2<Date> {
        public C1145b() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(Date date, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            appendable.append('\"');
            C36583Vg2.m79577a(date.toString(), appendable, c36115Tg2);
            appendable.append('\"');
        }
    }

    /* renamed from: Cj2$c */
    /* loaded from: classes6.dex */
    public class C1146c implements InterfaceC32632Ej2<Float> {
        public C1146c() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(Float f, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            if (f.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(f.toString());
            }
        }
    }

    /* renamed from: Cj2$d */
    /* loaded from: classes6.dex */
    public class C1147d implements InterfaceC32632Ej2<int[]> {
        public C1147d() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(int[] iArr, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83200c(appendable);
            boolean z = false;
            for (int i : iArr) {
                if (z) {
                    c36115Tg2.m83190m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Integer.toString(i));
            }
            c36115Tg2.m83199d(appendable);
        }
    }

    /* renamed from: Cj2$e */
    /* loaded from: classes6.dex */
    public class C1148e implements InterfaceC32632Ej2<short[]> {
        public C1148e() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(short[] sArr, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83200c(appendable);
            boolean z = false;
            for (short s : sArr) {
                if (z) {
                    c36115Tg2.m83190m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Short.toString(s));
            }
            c36115Tg2.m83199d(appendable);
        }
    }

    /* renamed from: Cj2$f */
    /* loaded from: classes6.dex */
    public class C1149f implements InterfaceC32632Ej2<long[]> {
        public C1149f() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(long[] jArr, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83200c(appendable);
            boolean z = false;
            for (long j : jArr) {
                if (z) {
                    c36115Tg2.m83190m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Long.toString(j));
            }
            c36115Tg2.m83199d(appendable);
        }
    }

    /* renamed from: Cj2$g */
    /* loaded from: classes6.dex */
    public class C1150g implements InterfaceC32632Ej2<float[]> {
        public C1150g() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(float[] fArr, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83200c(appendable);
            boolean z = false;
            for (float f : fArr) {
                if (z) {
                    c36115Tg2.m83190m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Float.toString(f));
            }
            c36115Tg2.m83199d(appendable);
        }
    }

    /* renamed from: Cj2$h */
    /* loaded from: classes6.dex */
    public class C1151h implements InterfaceC32632Ej2<double[]> {
        public C1151h() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(double[] dArr, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83200c(appendable);
            boolean z = false;
            for (double d : dArr) {
                if (z) {
                    c36115Tg2.m83190m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Double.toString(d));
            }
            c36115Tg2.m83199d(appendable);
        }
    }

    /* renamed from: Cj2$i */
    /* loaded from: classes6.dex */
    public class C1152i implements InterfaceC32632Ej2<boolean[]> {
        public C1152i() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(boolean[] zArr, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83200c(appendable);
            boolean z = false;
            for (boolean z2 : zArr) {
                if (z) {
                    c36115Tg2.m83190m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Boolean.toString(z2));
            }
            c36115Tg2.m83199d(appendable);
        }
    }

    /* renamed from: Cj2$j */
    /* loaded from: classes6.dex */
    public class C1153j implements InterfaceC32632Ej2<InterfaceC35881Sg2> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public <E extends InterfaceC35881Sg2> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            e.mo86451e(appendable);
        }
    }

    /* renamed from: Cj2$k */
    /* loaded from: classes6.dex */
    public class C1154k implements InterfaceC32632Ej2<InterfaceC35881Sg2> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public <E extends InterfaceC35881Sg2> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            e.mo85140h(appendable, c36115Tg2);
        }
    }

    /* renamed from: Cj2$l */
    /* loaded from: classes6.dex */
    public class C1155l implements InterfaceC32632Ej2<InterfaceC34009Kg2> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public <E extends InterfaceC34009Kg2> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            appendable.append(e.mo96485j(c36115Tg2));
        }
    }

    /* renamed from: Cj2$m */
    /* loaded from: classes6.dex */
    public class C1156m implements InterfaceC32632Ej2<InterfaceC33775Jg2> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public <E extends InterfaceC33775Jg2> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            appendable.append(e.mo96487f());
        }
    }

    /* renamed from: Cj2$n */
    /* loaded from: classes6.dex */
    public class C1157n implements InterfaceC32632Ej2<Iterable<? extends Object>> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public <E extends Iterable<? extends Object>> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83200c(appendable);
            boolean z = true;
            for (Object obj : e) {
                if (z) {
                    c36115Tg2.m83198e(appendable);
                    z = false;
                } else {
                    c36115Tg2.m83202a(appendable);
                }
                if (obj == null) {
                    appendable.append("null");
                } else {
                    C36583Vg2.m79576b(obj, appendable, c36115Tg2);
                }
                c36115Tg2.m83201b(appendable);
            }
            c36115Tg2.m83199d(appendable);
        }
    }

    /* renamed from: Cj2$o */
    /* loaded from: classes6.dex */
    public class C1158o implements InterfaceC32632Ej2<Enum<?>> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public <E extends Enum<?>> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83187p(appendable, e.name());
        }
    }

    /* renamed from: Cj2$p */
    /* loaded from: classes6.dex */
    public class C1159p implements InterfaceC32632Ej2<Map<String, ? extends Object>> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public <E extends Map<String, ? extends Object>> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83189n(appendable);
            boolean z = true;
            for (Map.Entry entry : e.entrySet()) {
                Object value = entry.getValue();
                if (value != null || !c36115Tg2.m83196g()) {
                    if (z) {
                        c36115Tg2.m83191l(appendable);
                        z = false;
                    } else {
                        c36115Tg2.m83190m(appendable);
                    }
                    C32164Cj2.m111786g(entry.getKey().toString(), value, appendable, c36115Tg2);
                }
            }
            c36115Tg2.m83188o(appendable);
        }
    }

    /* renamed from: Cj2$q */
    /* loaded from: classes6.dex */
    public class C1160q implements InterfaceC32632Ej2<Object> {
        @Override // p000.InterfaceC32632Ej2
        /* renamed from: a */
        public void mo420a(Object obj, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            appendable.append(obj.toString());
        }
    }

    /* renamed from: Cj2$r */
    /* loaded from: classes6.dex */
    public class C1161r implements InterfaceC32632Ej2<String> {
        public C1161r() {
        }

        @Override // p000.InterfaceC32632Ej2
        /* renamed from: b */
        public void mo420a(String str, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
            c36115Tg2.m83187p(appendable, str);
        }
    }

    /* renamed from: Cj2$s */
    /* loaded from: classes6.dex */
    public static class C1162s {

        /* renamed from: a */
        public Class<?> f4574a;

        /* renamed from: b */
        public InterfaceC32632Ej2<?> f4575b;

        public C1162s(Class<?> cls, InterfaceC32632Ej2<?> interfaceC32632Ej2) {
            this.f4574a = cls;
            this.f4575b = interfaceC32632Ej2;
        }
    }

    public C32164Cj2() {
        m111790c();
    }

    /* renamed from: g */
    public static void m111786g(String str, Object obj, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        if (str == null) {
            appendable.append("null");
        } else if (!c36115Tg2.m83195h(str)) {
            appendable.append(str);
        } else {
            appendable.append('\"');
            C36583Vg2.m79577a(str, appendable, c36115Tg2);
            appendable.append('\"');
        }
        c36115Tg2.m83192k(appendable);
        if (obj instanceof String) {
            c36115Tg2.m83187p(appendable, (String) obj);
        } else {
            C36583Vg2.m79576b(obj, appendable, c36115Tg2);
        }
        c36115Tg2.m83193j(appendable);
    }

    /* renamed from: a */
    public InterfaceC32632Ej2 m111792a(Class cls) {
        return this.f4562a.get(cls);
    }

    /* renamed from: b */
    public InterfaceC32632Ej2 m111791b(Class<?> cls) {
        Iterator<C1162s> it = this.f4563b.iterator();
        while (it.hasNext()) {
            C1162s next = it.next();
            if (next.f4574a.isAssignableFrom(cls)) {
                return next.f4575b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void m111790c() {
        m111789d(new C1161r(), String.class);
        m111789d(new C1144a(), Double.class);
        m111789d(new C1145b(), Date.class);
        m111789d(new C1146c(), Float.class);
        InterfaceC32632Ej2<?> interfaceC32632Ej2 = f4561m;
        m111789d(interfaceC32632Ej2, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        m111789d(interfaceC32632Ej2, Boolean.class);
        m111789d(new C1147d(), int[].class);
        m111789d(new C1148e(), short[].class);
        m111789d(new C1149f(), long[].class);
        m111789d(new C1150g(), float[].class);
        m111789d(new C1151h(), double[].class);
        m111789d(new C1152i(), boolean[].class);
        m111788e(InterfaceC35881Sg2.class, f4552d);
        m111788e(InterfaceC35647Rg2.class, f4551c);
        m111788e(InterfaceC34009Kg2.class, f4553e);
        m111788e(InterfaceC33775Jg2.class, f4554f);
        m111788e(Map.class, f4557i);
        m111788e(Iterable.class, f4555g);
        m111788e(Enum.class, f4556h);
        m111788e(Number.class, interfaceC32632Ej2);
    }

    /* renamed from: d */
    public <T> void m111789d(InterfaceC32632Ej2<T> interfaceC32632Ej2, Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f4562a.put(cls, interfaceC32632Ej2);
        }
    }

    /* renamed from: e */
    public void m111788e(Class<?> cls, InterfaceC32632Ej2<?> interfaceC32632Ej2) {
        m111787f(cls, interfaceC32632Ej2);
    }

    /* renamed from: f */
    public void m111787f(Class<?> cls, InterfaceC32632Ej2<?> interfaceC32632Ej2) {
        this.f4563b.addLast(new C1162s(cls, interfaceC32632Ej2));
    }
}
