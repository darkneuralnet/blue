package p000;

import com.github.davidmoten.guavamini.Optional;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* renamed from: SN4 */
/* loaded from: classes5.dex */
public final class SN4 {

    /* renamed from: a */
    public static InterfaceC23480c<Throwable, Long, C7417g> f33565a = new C7412d();

    /* renamed from: SN4$a */
    /* loaded from: classes5.dex */
    public static class C7409a implements InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<Object>> {

        /* renamed from: b */
        public final /* synthetic */ AbstractC24490k f33566b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC23492o f33567c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC23484g f33568d;

        /* renamed from: e */
        public final /* synthetic */ AbstractC23437E f33569e;

        public C7409a(AbstractC24490k abstractC24490k, InterfaceC23492o interfaceC23492o, InterfaceC23484g interfaceC23484g, AbstractC23437E abstractC23437E) {
            this.f33566b = abstractC24490k;
            this.f33567c = interfaceC23492o;
            this.f33568d = interfaceC23484g;
            this.f33569e = abstractC23437E;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public AbstractC24490k<Object> apply(AbstractC24490k<? extends Throwable> abstractC24490k) {
            return abstractC24490k.m32099w1(this.f33566b.m32112s(AbstractC24490k.m32123o0(-1L)), SN4.f33565a).m32167W(this.f33567c).m32191K(SN4.m85599e(this.f33568d)).m32167W(SN4.m85596h(this.f33569e));
        }
    }

    /* renamed from: SN4$b */
    /* loaded from: classes5.dex */
    public static class C7410b implements InterfaceC23484g<C7417g> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC23484g f33570b;

        public C7410b(InterfaceC23484g interfaceC23484g) {
            this.f33570b = interfaceC23484g;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(C7417g c7417g) throws Exception {
            if (c7417g.m85573a() != -1) {
                this.f33570b.accept(c7417g);
            }
        }
    }

    /* renamed from: SN4$c */
    /* loaded from: classes5.dex */
    public static class C7411c implements InterfaceC23492o<C7417g, AbstractC24490k<C7417g>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC23494q f33571b;

        /* renamed from: c */
        public final /* synthetic */ List f33572c;

        /* renamed from: d */
        public final /* synthetic */ List f33573d;

        public C7411c(InterfaceC23494q interfaceC23494q, List list, List list2) {
            this.f33571b = interfaceC23494q;
            this.f33572c = list;
            this.f33573d = list2;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public AbstractC24490k<C7417g> apply(C7417g c7417g) throws Exception {
            if (!this.f33571b.test(c7417g.m85572b())) {
                return AbstractC24490k.m32179Q(c7417g.m85572b());
            }
            for (Class<?> cls : this.f33572c) {
                if (c7417g.m85572b().getClass().isAssignableFrom(cls)) {
                    return AbstractC24490k.m32179Q(c7417g.m85572b());
                }
            }
            if (this.f33573d.size() > 0) {
                for (Class<?> cls2 : this.f33573d) {
                    if (c7417g.m85572b().getClass().isAssignableFrom(cls2)) {
                        return AbstractC24490k.m32123o0(c7417g);
                    }
                }
                return AbstractC24490k.m32179Q(c7417g.m85572b());
            }
            return AbstractC24490k.m32123o0(c7417g);
        }
    }

    /* renamed from: SN4$d */
    /* loaded from: classes5.dex */
    public static class C7412d implements InterfaceC23480c<Throwable, Long, C7417g> {
        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public C7417g apply(Throwable th, Long l) {
            return new C7417g(th, l.longValue());
        }
    }

    /* renamed from: SN4$e */
    /* loaded from: classes5.dex */
    public static class C7413e implements InterfaceC23492o<C7417g, AbstractC24490k<C7417g>> {

        /* renamed from: b */
        public final /* synthetic */ AbstractC23437E f33574b;

        public C7413e(AbstractC23437E abstractC23437E) {
            this.f33574b = abstractC23437E;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public AbstractC24490k<C7417g> apply(C7417g c7417g) {
            if (c7417g.m85573a() == -1) {
                return AbstractC24490k.m32179Q(c7417g.m85572b());
            }
            return AbstractC24490k.m32119p1(c7417g.m85573a(), TimeUnit.MILLISECONDS, this.f33574b).m32117q0(C52045yA1.m4007a(c7417g));
        }
    }

    /* renamed from: SN4$f */
    /* loaded from: classes5.dex */
    public static final class C7414f {

        /* renamed from: a */
        public final List<Class<? extends Throwable>> f33575a;

        /* renamed from: b */
        public final List<Class<? extends Throwable>> f33576b;

        /* renamed from: c */
        public InterfaceC23494q<? super Throwable> f33577c;

        /* renamed from: d */
        public AbstractC24490k<Long> f33578d;

        /* renamed from: e */
        public Optional<Integer> f33579e;

        /* renamed from: f */
        public Optional<AbstractC23437E> f33580f;

        /* renamed from: g */
        public InterfaceC23484g<? super C7417g> f33581g;

        /* renamed from: SN4$f$a */
        /* loaded from: classes5.dex */
        public static class C7415a implements InterfaceC23492o<Long, Long> {

            /* renamed from: b */
            public final /* synthetic */ TimeUnit f33582b;

            public C7415a(TimeUnit timeUnit) {
                this.f33582b = timeUnit;
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public Long apply(Long l) {
                return Long.valueOf(this.f33582b.toMillis(l.longValue()));
            }
        }

        /* renamed from: SN4$f$b */
        /* loaded from: classes5.dex */
        public class C7416b implements InterfaceC23492o<Integer, Long> {

            /* renamed from: b */
            public final /* synthetic */ double f33583b;

            /* renamed from: c */
            public final /* synthetic */ TimeUnit f33584c;

            /* renamed from: d */
            public final /* synthetic */ long f33585d;

            /* renamed from: e */
            public final /* synthetic */ long f33586e;

            public C7416b(double d, TimeUnit timeUnit, long j, long j2) {
                this.f33583b = d;
                this.f33584c = timeUnit;
                this.f33585d = j;
                this.f33586e = j2;
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public Long apply(Integer num) {
                long round = Math.round(Math.pow(this.f33583b, num.intValue() - 1) * this.f33584c.toMillis(this.f33585d));
                long j = this.f33586e;
                if (j == -1) {
                    return Long.valueOf(round);
                }
                return Long.valueOf(Math.min(this.f33584c.toMillis(j), round));
            }
        }

        public /* synthetic */ C7414f(C7409a c7409a) {
            this();
        }

        /* renamed from: j */
        public static InterfaceC23492o<Long, Long> m85576j(TimeUnit timeUnit) {
            return new C7415a(timeUnit);
        }

        /* renamed from: a */
        public InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<Object>> m85585a() {
            AZ3.m115551a(this.f33578d);
            if (this.f33579e.m52062c()) {
                this.f33578d = this.f33578d.m32145g1(this.f33579e.m52063b().intValue());
            }
            return SN4.m85593k(this.f33578d, this.f33580f.m52063b(), this.f33581g, this.f33575a, this.f33576b, this.f33577c);
        }

        /* renamed from: b */
        public C7414f m85584b(Long l, TimeUnit timeUnit) {
            this.f33578d = AbstractC24490k.m32123o0(l).m32117q0(m85576j(timeUnit)).m32198G0();
            return this;
        }

        /* renamed from: c */
        public C7414f m85583c(long j, long j2, TimeUnit timeUnit, double d) {
            this.f33578d = AbstractC24490k.m32200F0(1, Integer.MAX_VALUE).m32117q0(new C7416b(d, timeUnit, j, j2));
            return this;
        }

        /* renamed from: d */
        public C7414f m85582d(long j, TimeUnit timeUnit) {
            return m85581e(j, timeUnit, 2.0d);
        }

        /* renamed from: e */
        public C7414f m85581e(long j, TimeUnit timeUnit, double d) {
            return m85583c(j, -1L, timeUnit, d);
        }

        /* renamed from: f */
        public C7414f m85580f(Class<? extends Throwable>... clsArr) {
            this.f33576b.addAll(Arrays.asList(clsArr));
            return this;
        }

        /* renamed from: g */
        public C7414f m85579g(int i) {
            this.f33579e = Optional.m52061d(Integer.valueOf(i));
            return this;
        }

        /* renamed from: h */
        public C7414f m85578h(InterfaceC23494q<Throwable> interfaceC23494q) {
            this.f33577c = interfaceC23494q;
            return this;
        }

        /* renamed from: i */
        public C7414f m85577i(Class<? extends Throwable>... clsArr) {
            this.f33575a.addAll(Arrays.asList(clsArr));
            return this;
        }

        private C7414f() {
            this.f33575a = new ArrayList();
            this.f33576b = new ArrayList();
            this.f33577c = C23506a.m32971c();
            this.f33578d = AbstractC24490k.m32123o0(0L).m32198G0();
            this.f33579e = Optional.m52064a();
            this.f33580f = Optional.m52061d(C24542a.m31934a());
            this.f33581g = C48971sz0.m13293a();
        }
    }

    /* renamed from: SN4$g */
    /* loaded from: classes5.dex */
    public static final class C7417g {

        /* renamed from: a */
        public final Throwable f33588a;

        /* renamed from: b */
        public final long f33589b;

        public C7417g(Throwable th, long j) {
            this.f33588a = th;
            this.f33589b = j;
        }

        /* renamed from: a */
        public long m85573a() {
            return this.f33589b;
        }

        /* renamed from: b */
        public Throwable m85572b() {
            return this.f33588a;
        }
    }

    private SN4() {
    }

    /* renamed from: e */
    public static InterfaceC23484g<C7417g> m85599e(InterfaceC23484g<? super C7417g> interfaceC23484g) {
        return new C7410b(interfaceC23484g);
    }

    /* renamed from: f */
    public static InterfaceC23492o<C7417g, AbstractC24490k<C7417g>> m85598f(List<Class<? extends Throwable>> list, List<Class<? extends Throwable>> list2, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        return new C7411c(interfaceC23494q, list2, list);
    }

    /* renamed from: g */
    public static InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<Object>> m85597g(AbstractC24490k<Long> abstractC24490k, AbstractC23437E abstractC23437E, InterfaceC23484g<? super C7417g> interfaceC23484g, InterfaceC23492o<C7417g, AbstractC24490k<C7417g>> interfaceC23492o) {
        return new C7409a(abstractC24490k, interfaceC23492o, interfaceC23484g, abstractC23437E);
    }

    /* renamed from: h */
    public static InterfaceC23492o<C7417g, AbstractC24490k<C7417g>> m85596h(AbstractC23437E abstractC23437E) {
        return new C7413e(abstractC23437E);
    }

    /* renamed from: i */
    public static C7414f m85595i(long j, TimeUnit timeUnit) {
        return new C7414f(null).m85582d(j, timeUnit);
    }

    /* renamed from: j */
    public static C7414f m85594j(Class<? extends Throwable>... clsArr) {
        return new C7414f(null).m85580f(clsArr);
    }

    /* renamed from: k */
    public static InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<Object>> m85593k(AbstractC24490k<Long> abstractC24490k, AbstractC23437E abstractC23437E, InterfaceC23484g<? super C7417g> interfaceC23484g, List<Class<? extends Throwable>> list, List<Class<? extends Throwable>> list2, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        return m85597g(abstractC24490k, abstractC23437E, interfaceC23484g, m85598f(list, list2, interfaceC23494q));
    }

    /* renamed from: l */
    public static C7414f m85592l(InterfaceC23494q<Throwable> interfaceC23494q) {
        return new C7414f(null).m85578h(interfaceC23494q);
    }

    /* renamed from: m */
    public static C7414f m85591m(Class<? extends Throwable>... clsArr) {
        return new C7414f(null).m85577i(clsArr);
    }
}
