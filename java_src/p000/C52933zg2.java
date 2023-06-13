package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: zg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52933zg2 {

    /* renamed from: zg2$a */
    /* loaded from: classes6.dex */
    public class C31470a extends AbstractC48175re6<T> {

        /* renamed from: b */
        public final /* synthetic */ Iterator f122043b;

        public C31470a(Iterator it) {
            this.f122043b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f122043b.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            return this.f122043b.next();
        }
    }

    /* renamed from: zg2$b */
    /* loaded from: classes6.dex */
    public class C31471b extends AbstractC0367B0<T> {

        /* renamed from: d */
        public final /* synthetic */ Iterator f122044d;

        /* renamed from: e */
        public final /* synthetic */ IZ3 f122045e;

        public C31471b(Iterator it, IZ3 iz3) {
            this.f122044d = it;
            this.f122045e = iz3;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
        @Override // p000.AbstractC0367B0
        /* renamed from: a */
        public T mo575a() {
            while (this.f122044d.hasNext()) {
                ?? next = this.f122044d.next();
                if (this.f122045e.apply(next)) {
                    return next;
                }
            }
            return m114802b();
        }
    }

    /* renamed from: zg2$c */
    /* loaded from: classes6.dex */
    public class C31472c extends AbstractC50261v96<F, T> {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC50859wA1 f122046c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31472c(Iterator it, InterfaceC50859wA1 interfaceC50859wA1) {
            super(it);
            this.f122046c = interfaceC50859wA1;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // p000.AbstractC50261v96
        /* renamed from: a */
        public T mo574a(F f) {
            return this.f122046c.apply(f);
        }
    }

    /* renamed from: zg2$d */
    /* loaded from: classes6.dex */
    public class C31473d extends AbstractC48175re6<T> {

        /* renamed from: b */
        public boolean f122047b;

        /* renamed from: c */
        public final /* synthetic */ Object f122048c;

        public C31473d(Object obj) {
            this.f122048c = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f122047b;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            if (!this.f122047b) {
                this.f122047b = true;
                return this.f122048c;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: zg2$e */
    /* loaded from: classes6.dex */
    public static final class C31474e<T> extends AbstractC30014x0<T> {

        /* renamed from: f */
        public static final AbstractC49953ue6<Object> f122049f = new C31474e(new Object[0], 0, 0, 0);

        /* renamed from: d */
        public final T[] f122050d;

        /* renamed from: e */
        public final int f122051e;

        public C31474e(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f122050d = tArr;
            this.f122051e = i;
        }

        @Override // p000.AbstractC30014x0
        /* renamed from: a */
        public T mo573a(int i) {
            return this.f122050d[this.f122051e + i];
        }
    }

    /* renamed from: zg2$f */
    /* loaded from: classes6.dex */
    public static class C31475f<T> implements Iterator<T> {

        /* renamed from: b */
        public Iterator<? extends T> f122052b;

        /* renamed from: c */
        public Iterator<? extends T> f122053c = C52933zg2.m591g();

        /* renamed from: d */
        public Iterator<? extends Iterator<? extends T>> f122054d;

        /* renamed from: e */
        public Deque<Iterator<? extends Iterator<? extends T>>> f122055e;

        public C31475f(Iterator<? extends Iterator<? extends T>> it) {
            this.f122054d = (Iterator) EZ3.m108801n(it);
        }

        /* renamed from: a */
        public final Iterator<? extends Iterator<? extends T>> m572a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f122054d;
                if (it != null && it.hasNext()) {
                    return this.f122054d;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f122055e;
                if (deque != null && !deque.isEmpty()) {
                    this.f122054d = this.f122055e.removeFirst();
                } else {
                    return null;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) EZ3.m108801n(this.f122053c)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> m572a = m572a();
                this.f122054d = m572a;
                if (m572a == null) {
                    return false;
                }
                Iterator<? extends T> next = m572a.next();
                this.f122053c = next;
                if (next instanceof C31475f) {
                    C31475f c31475f = (C31475f) next;
                    this.f122053c = c31475f.f122053c;
                    if (this.f122055e == null) {
                        this.f122055e = new ArrayDeque();
                    }
                    this.f122055e.addFirst(this.f122054d);
                    if (c31475f.f122055e != null) {
                        while (!c31475f.f122055e.isEmpty()) {
                            this.f122055e.addFirst(c31475f.f122055e.removeLast());
                        }
                    }
                    this.f122054d = c31475f.f122054d;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f122053c;
                this.f122052b = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f122052b;
            if (it != null) {
                it.remove();
                this.f122052b = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* renamed from: zg2$g */
    /* loaded from: classes6.dex */
    public enum EnumC31476g implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C39948dm0.m43731d(false);
        }
    }

    private C52933zg2() {
    }

    /* renamed from: a */
    public static <T> boolean m597a(Collection<T> collection, Iterator<? extends T> it) {
        EZ3.m108801n(collection);
        EZ3.m108801n(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static <T> boolean m596b(Iterator<T> it, IZ3<? super T> iz3) {
        return m585m(it, iz3) != -1;
    }

    /* renamed from: c */
    public static void m595c(Iterator<?> it) {
        EZ3.m108801n(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: d */
    public static <T> Iterator<T> m594d(Iterator<? extends Iterator<? extends T>> it) {
        return new C31475f(it);
    }

    /* renamed from: e */
    public static boolean m593e(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m592f(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C37025Xd3.m76748a(it.next(), it2.next())) {
                return false;
            }
            while (it.hasNext()) {
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: g */
    public static <T> AbstractC48175re6<T> m591g() {
        return m590h();
    }

    /* renamed from: h */
    public static <T> AbstractC49953ue6<T> m590h() {
        return (AbstractC49953ue6<T>) C31474e.f122049f;
    }

    /* renamed from: i */
    public static <T> Iterator<T> m589i() {
        return EnumC31476g.INSTANCE;
    }

    /* renamed from: j */
    public static <T> AbstractC48175re6<T> m588j(Iterator<T> it, IZ3<? super T> iz3) {
        EZ3.m108801n(it);
        EZ3.m108801n(iz3);
        return new C31471b(it, iz3);
    }

    /* renamed from: k */
    public static <T> T m587k(Iterator<T> it, IZ3<? super T> iz3) {
        EZ3.m108801n(it);
        EZ3.m108801n(iz3);
        while (it.hasNext()) {
            T next = it.next();
            if (iz3.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static <T> T m586l(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: m */
    public static <T> int m585m(Iterator<T> it, IZ3<? super T> iz3) {
        EZ3.m108800o(iz3, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (iz3.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: n */
    public static <T> T m584n(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m583o(Iterator<?> it, Collection<?> collection) {
        EZ3.m108801n(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p */
    public static <T> boolean m582p(Iterator<T> it, IZ3<? super T> iz3) {
        EZ3.m108801n(iz3);
        boolean z = false;
        while (it.hasNext()) {
            if (iz3.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: q */
    public static boolean m581q(Iterator<?> it, Collection<?> collection) {
        EZ3.m108801n(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: r */
    public static <T> AbstractC48175re6<T> m580r(T t) {
        return new C31473d(t);
    }

    /* renamed from: s */
    public static int m579s(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C41344g72.m39991b(j);
    }

    /* renamed from: t */
    public static String m578t(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public static <F, T> Iterator<T> m577u(Iterator<F> it, InterfaceC50859wA1<? super F, ? extends T> interfaceC50859wA1) {
        EZ3.m108801n(interfaceC50859wA1);
        return new C31472c(it, interfaceC50859wA1);
    }

    /* renamed from: v */
    public static <T> AbstractC48175re6<T> m576v(Iterator<? extends T> it) {
        EZ3.m108801n(it);
        if (it instanceof AbstractC48175re6) {
            return (AbstractC48175re6) it;
        }
        return new C31470a(it);
    }
}
