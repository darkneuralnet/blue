package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: yg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52340yg2 {

    /* renamed from: yg2$a */
    /* loaded from: classes6.dex */
    public class C30659a extends AbstractC45968nv1<T> {

        /* renamed from: c */
        public final /* synthetic */ Iterable f119967c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC50859wA1 f119968d;

        public C30659a(Iterable iterable, InterfaceC50859wA1 interfaceC50859wA1) {
            this.f119967c = iterable;
            this.f119968d = interfaceC50859wA1;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C52933zg2.m577u(this.f119967c.iterator(), this.f119968d);
        }
    }

    private C52340yg2() {
    }

    /* renamed from: a */
    public static <T> boolean m2983a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        return C52933zg2.m597a(collection, ((Iterable) EZ3.m108801n(iterable)).iterator());
    }

    /* renamed from: b */
    public static <T> boolean m2982b(Iterable<T> iterable, IZ3<? super T> iz3) {
        return C52933zg2.m596b(iterable.iterator(), iz3);
    }

    /* renamed from: c */
    public static <E> Collection<E> m2981c(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C34819Ns2.m93253i(iterable.iterator());
    }

    /* renamed from: d */
    public static <T> T m2980d(Iterable<? extends T> iterable, T t) {
        return (T) C52933zg2.m586l(iterable.iterator(), t);
    }

    /* renamed from: e */
    public static <T> boolean m2979e(Iterable<T> iterable, IZ3<? super T> iz3) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            return m2978f((List) iterable, (IZ3) EZ3.m108801n(iz3));
        }
        return C52933zg2.m582p(iterable.iterator(), iz3);
    }

    /* renamed from: f */
    public static <T> boolean m2978f(List<T> list, IZ3<? super T> iz3) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!iz3.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        m2977g(list, iz3, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m2977g(list, iz3, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static <T> void m2977g(List<T> list, IZ3<? super T> iz3, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (iz3.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* renamed from: h */
    public static Object[] m2976h(Iterable<?> iterable) {
        return m2981c(iterable).toArray();
    }

    /* renamed from: i */
    public static String m2975i(Iterable<?> iterable) {
        return C52933zg2.m578t(iterable.iterator());
    }

    /* renamed from: j */
    public static <F, T> Iterable<T> m2974j(Iterable<F> iterable, InterfaceC50859wA1<? super F, ? extends T> interfaceC50859wA1) {
        EZ3.m108801n(iterable);
        EZ3.m108801n(interfaceC50859wA1);
        return new C30659a(iterable, interfaceC50859wA1);
    }
}
