package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* renamed from: zy3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC53114zy3<T> implements Comparator<T> {
    /* renamed from: a */
    public static <T> AbstractC53114zy3<T> m60a(Comparator<T> comparator) {
        if (comparator instanceof AbstractC53114zy3) {
            return (AbstractC53114zy3) comparator;
        }
        return new C35960Sp0(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> AbstractC53114zy3<C> m58c() {
        return C51076wY2.f116145b;
    }

    /* renamed from: b */
    public <E extends T> VY1<E> m59b(Iterable<E> iterable) {
        return VY1.m79775M(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    /* renamed from: d */
    public <T2 extends T> AbstractC53114zy3<Map.Entry<T2, ?>> m57d() {
        return (AbstractC53114zy3<Map.Entry<T2, ?>>) m56e(C37907aM2.m71554h());
    }

    /* renamed from: e */
    public <F> AbstractC53114zy3<F> m56e(InterfaceC50859wA1<F, ? extends T> interfaceC50859wA1) {
        return new C44307l70(interfaceC50859wA1, this);
    }

    /* renamed from: f */
    public <S extends T> AbstractC53114zy3<S> mo55f() {
        return new C52767zO4(this);
    }

    /* renamed from: g */
    public <E extends T> List<E> m54g(Iterable<E> iterable) {
        Object[] m2976h = C52340yg2.m2976h(iterable);
        Arrays.sort(m2976h, this);
        return C34819Ns2.m93254h(Arrays.asList(m2976h));
    }
}
