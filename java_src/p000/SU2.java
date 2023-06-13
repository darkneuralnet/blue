package p000;

import java.util.Queue;
/* renamed from: SU2 */
/* loaded from: classes5.dex */
public class SU2<A, B> {

    /* renamed from: a */
    public final C49711uE2<C7462b<A>, B> f33775a;

    /* renamed from: SU2$a */
    /* loaded from: classes5.dex */
    public class C7461a extends C49711uE2<C7462b<A>, B> {
        public C7461a(long j) {
            super(j);
        }

        @Override // p000.C49711uE2
        /* renamed from: n */
        public void mo3791j(C7462b<A> c7462b, B b) {
            c7462b.m85367c();
        }
    }

    /* renamed from: SU2$b */
    /* loaded from: classes5.dex */
    public static final class C7462b<A> {

        /* renamed from: d */
        public static final Queue<C7462b<?>> f33777d = C47029pi6.m18920f(0);

        /* renamed from: a */
        public int f33778a;

        /* renamed from: b */
        public int f33779b;

        /* renamed from: c */
        public A f33780c;

        private C7462b() {
        }

        /* renamed from: a */
        public static <A> C7462b<A> m85369a(A a, int i, int i2) {
            C7462b<A> c7462b;
            Queue<C7462b<?>> queue = f33777d;
            synchronized (queue) {
                c7462b = (C7462b<A>) queue.poll();
            }
            if (c7462b == null) {
                c7462b = new C7462b<>();
            }
            c7462b.m85368b(a, i, i2);
            return c7462b;
        }

        /* renamed from: b */
        public final void m85368b(A a, int i, int i2) {
            this.f33780c = a;
            this.f33779b = i;
            this.f33778a = i2;
        }

        /* renamed from: c */
        public void m85367c() {
            Queue<C7462b<?>> queue = f33777d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7462b)) {
                return false;
            }
            C7462b c7462b = (C7462b) obj;
            if (this.f33779b != c7462b.f33779b || this.f33778a != c7462b.f33778a || !this.f33780c.equals(c7462b.f33780c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f33778a * 31) + this.f33779b) * 31) + this.f33780c.hashCode();
        }
    }

    public SU2() {
        this(250L);
    }

    /* renamed from: a */
    public B m85372a(A a, int i, int i2) {
        C7462b<A> m85369a = C7462b.m85369a(a, i, i2);
        B m10525g = this.f33775a.m10525g(m85369a);
        m85369a.m85367c();
        return m10525g;
    }

    /* renamed from: b */
    public void m85371b(A a, int i, int i2, B b) {
        this.f33775a.m10523k(C7462b.m85369a(a, i, i2), b);
    }

    public SU2(long j) {
        this.f33775a = new C7461a(j);
    }
}
