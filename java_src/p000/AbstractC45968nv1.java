package p000;

import java.util.Arrays;
import java.util.Iterator;
/* renamed from: nv1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC45968nv1<E> implements Iterable<E> {

    /* renamed from: b */
    public final AbstractC44221ky3<Iterable<E>> f101078b;

    /* renamed from: nv1$a */
    /* loaded from: classes6.dex */
    public class C26739a extends AbstractC45968nv1<E> {

        /* renamed from: c */
        public final /* synthetic */ Iterable f101079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26739a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f101079c = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f101079c.iterator();
        }
    }

    /* renamed from: nv1$b */
    /* loaded from: classes6.dex */
    public class C26740b extends AbstractC45968nv1<T> {

        /* renamed from: c */
        public final /* synthetic */ Iterable[] f101080c;

        /* renamed from: nv1$b$a */
        /* loaded from: classes6.dex */
        public class C26741a extends AbstractC30014x0<Iterator<? extends T>> {
            public C26741a(int i) {
                super(i);
            }

            @Override // p000.AbstractC30014x0
            /* renamed from: b */
            public Iterator<? extends T> mo573a(int i) {
                return C26740b.this.f101080c[i].iterator();
            }
        }

        public C26740b(Iterable[] iterableArr) {
            this.f101080c = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C52933zg2.m594d(new C26741a(this.f101080c.length));
        }
    }

    public AbstractC45968nv1() {
        this.f101078b = AbstractC44221ky3.m28087a();
    }

    /* renamed from: b */
    public static <T> AbstractC45968nv1<T> m22179b(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m22178c(iterable, iterable2);
    }

    /* renamed from: c */
    public static <T> AbstractC45968nv1<T> m22178c(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            EZ3.m108801n(iterable);
        }
        return new C26740b(iterableArr);
    }

    /* renamed from: e */
    public static <E> AbstractC45968nv1<E> m22177e(Iterable<E> iterable) {
        if (iterable instanceof AbstractC45968nv1) {
            return (AbstractC45968nv1) iterable;
        }
        return new C26739a(iterable, iterable);
    }

    /* renamed from: h */
    public static <E> AbstractC45968nv1<E> m22175h(E e, E... eArr) {
        return m22177e(C34819Ns2.m93261a(e, eArr));
    }

    /* renamed from: a */
    public final AbstractC45968nv1<E> m22180a(E... eArr) {
        return m22179b(m22176f(), Arrays.asList(eArr));
    }

    /* renamed from: f */
    public final Iterable<E> m22176f() {
        return this.f101078b.mo28084d(this);
    }

    /* renamed from: j */
    public final VY1<E> m22174j() {
        return VY1.m79768x(m22176f());
    }

    /* renamed from: o */
    public final <T> AbstractC45968nv1<T> m22173o(InterfaceC50859wA1<? super E, T> interfaceC50859wA1) {
        return m22177e(C52340yg2.m2974j(m22176f(), interfaceC50859wA1));
    }

    public String toString() {
        return C52340yg2.m2975i(m22176f());
    }

    public AbstractC45968nv1(Iterable<E> iterable) {
        this.f101078b = AbstractC44221ky3.m28085c(iterable);
    }
}
