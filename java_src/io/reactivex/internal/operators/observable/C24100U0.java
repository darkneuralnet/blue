package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.disposables.InterfaceC23504g;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24551b;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.U0 */
/* loaded from: classes6.dex */
public final class C24100U0<T> extends AbstractC24495a<T> implements InterfaceC23504g {

    /* renamed from: f */
    public static final InterfaceC24102b f89948f = new C24115o();

    /* renamed from: b */
    public final InterfaceC23434B<T> f89949b;

    /* renamed from: c */
    public final AtomicReference<C24110j<T>> f89950c;

    /* renamed from: d */
    public final InterfaceC24102b<T> f89951d;

    /* renamed from: e */
    public final InterfaceC23434B<T> f89952e;

    /* renamed from: io.reactivex.internal.operators.observable.U0$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC24101a<T> extends AtomicReference<C24106f> implements InterfaceC24108h<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: b */
        public C24106f f89953b;

        /* renamed from: c */
        public int f89954c;

        public AbstractC24101a() {
            C24106f c24106f = new C24106f(null);
            this.f89953b = c24106f;
            set(c24106f);
        }

        /* renamed from: a */
        public final void m32590a(C24106f c24106f) {
            this.f89953b.set(c24106f);
            this.f89953b = c24106f;
            this.f89954c++;
        }

        /* renamed from: b */
        public Object mo32580b(Object obj) {
            return obj;
        }

        /* renamed from: c */
        public C24106f mo32579c() {
            return get();
        }

        /* renamed from: d */
        public Object mo32578d(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        /* renamed from: e */
        public final void mo32575e() {
            m32590a(new C24106f(mo32580b(EnumC24479n.m32243e())));
            mo32577l();
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        public final void error(Throwable th) {
            m32590a(new C24106f(mo32580b(EnumC24479n.m32241g(th))));
            mo32577l();
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        /* renamed from: f */
        public final void mo32574f(T t) {
            m32590a(new C24106f(mo32580b(EnumC24479n.m32236l(t))));
            mo32576k();
        }

        /* renamed from: g */
        public final void m32589g() {
            this.f89954c--;
            m32588i(get().get());
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        /* renamed from: h */
        public final void mo32573h(C24104d<T> c24104d) {
            if (c24104d.getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            do {
                C24106f c24106f = (C24106f) c24104d.m32585a();
                if (c24106f == null) {
                    c24106f = mo32579c();
                    c24104d.f89958d = c24106f;
                }
                while (!c24104d.mo1769e()) {
                    C24106f c24106f2 = c24106f.get();
                    if (c24106f2 != null) {
                        if (EnumC24479n.m32246b(mo32578d(c24106f2.f89962b), c24104d.f89957c)) {
                            c24104d.f89958d = null;
                            return;
                        }
                        c24106f = c24106f2;
                    } else {
                        c24104d.f89958d = c24106f;
                        i = c24104d.addAndGet(-i);
                    }
                }
                c24104d.f89958d = null;
                return;
            } while (i != 0);
        }

        /* renamed from: i */
        public final void m32588i(C24106f c24106f) {
            set(c24106f);
        }

        /* renamed from: j */
        public final void m32587j() {
            C24106f c24106f = get();
            if (c24106f.f89962b != null) {
                C24106f c24106f2 = new C24106f(null);
                c24106f2.lazySet(c24106f.get());
                set(c24106f2);
            }
        }

        /* renamed from: k */
        public abstract void mo32576k();

        /* renamed from: l */
        public void mo32577l() {
            m32587j();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC24102b<T> {
        InterfaceC24108h<T> call();
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$c */
    /* loaded from: classes6.dex */
    public static final class C24103c<R> implements InterfaceC23484g<InterfaceC23465c> {

        /* renamed from: b */
        public final C24087Q1<R> f89955b;

        public C24103c(C24087Q1<R> c24087q1) {
            this.f89955b = c24087q1;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(InterfaceC23465c interfaceC23465c) {
            this.f89955b.m32605a(interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$d */
    /* loaded from: classes6.dex */
    public static final class C24104d<T> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = 2728361546769921047L;

        /* renamed from: b */
        public final C24110j<T> f89956b;

        /* renamed from: c */
        public final InterfaceC23436D<? super T> f89957c;

        /* renamed from: d */
        public Object f89958d;

        /* renamed from: e */
        public volatile boolean f89959e;

        public C24104d(C24110j<T> c24110j, InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89956b = c24110j;
            this.f89957c = interfaceC23436D;
        }

        /* renamed from: a */
        public <U> U m32585a() {
            return (U) this.f89958d;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f89959e) {
                this.f89959e = true;
                this.f89956b.m32583b(this);
                this.f89958d = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89959e;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$e */
    /* loaded from: classes6.dex */
    public static final class C24105e<R, U> extends Observable<R> {

        /* renamed from: b */
        public final Callable<? extends AbstractC24495a<U>> f89960b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Observable<U>, ? extends InterfaceC23434B<R>> f89961c;

        public C24105e(Callable<? extends AbstractC24495a<U>> callable, InterfaceC23492o<? super Observable<U>, ? extends InterfaceC23434B<R>> interfaceC23492o) {
            this.f89960b = callable;
            this.f89961c = interfaceC23492o;
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
            try {
                AbstractC24495a abstractC24495a = (AbstractC24495a) C23544b.m32923e(this.f89960b.call(), "The connectableFactory returned a null ConnectableObservable");
                InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89961c.apply(abstractC24495a), "The selector returned a null ObservableSource");
                C24087Q1 c24087q1 = new C24087Q1(interfaceC23436D);
                interfaceC23434B.subscribe(c24087q1);
                abstractC24495a.mo32086g(new C24103c(c24087q1));
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32987i(th, interfaceC23436D);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$f */
    /* loaded from: classes6.dex */
    public static final class C24106f extends AtomicReference<C24106f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: b */
        public final Object f89962b;

        public C24106f(Object obj) {
            this.f89962b = obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$g */
    /* loaded from: classes6.dex */
    public static final class C24107g<T> extends AbstractC24495a<T> {

        /* renamed from: b */
        public final AbstractC24495a<T> f89963b;

        /* renamed from: c */
        public final Observable<T> f89964c;

        public C24107g(AbstractC24495a<T> abstractC24495a, Observable<T> observable) {
            this.f89963b = abstractC24495a;
            this.f89964c = observable;
        }

        @Override // io.reactivex.observables.AbstractC24495a
        /* renamed from: g */
        public void mo32086g(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
            this.f89963b.mo32086g(interfaceC23484g);
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89964c.subscribe(interfaceC23436D);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$h */
    /* loaded from: classes6.dex */
    public interface InterfaceC24108h<T> {
        /* renamed from: e */
        void mo32575e();

        void error(Throwable th);

        /* renamed from: f */
        void mo32574f(T t);

        /* renamed from: h */
        void mo32573h(C24104d<T> c24104d);
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$i */
    /* loaded from: classes6.dex */
    public static final class C24109i<T> implements InterfaceC24102b<T> {

        /* renamed from: a */
        public final int f89965a;

        public C24109i(int i) {
            this.f89965a = i;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24102b
        public InterfaceC24108h<T> call() {
            return new C24114n(this.f89965a);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$j */
    /* loaded from: classes6.dex */
    public static final class C24110j<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: f */
        public static final C24104d[] f89966f = new C24104d[0];

        /* renamed from: g */
        public static final C24104d[] f89967g = new C24104d[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* renamed from: b */
        public final InterfaceC24108h<T> f89968b;

        /* renamed from: c */
        public boolean f89969c;

        /* renamed from: d */
        public final AtomicReference<C24104d[]> f89970d = new AtomicReference<>(f89966f);

        /* renamed from: e */
        public final AtomicBoolean f89971e = new AtomicBoolean();

        public C24110j(InterfaceC24108h<T> interfaceC24108h) {
            this.f89968b = interfaceC24108h;
        }

        /* renamed from: a */
        public boolean m32584a(C24104d<T> c24104d) {
            C24104d[] c24104dArr;
            C24104d[] c24104dArr2;
            do {
                c24104dArr = this.f89970d.get();
                if (c24104dArr == f89967g) {
                    return false;
                }
                int length = c24104dArr.length;
                c24104dArr2 = new C24104d[length + 1];
                System.arraycopy(c24104dArr, 0, c24104dArr2, 0, length);
                c24104dArr2[length] = c24104d;
            } while (!C42482i24.m35337a(this.f89970d, c24104dArr, c24104dArr2));
            return true;
        }

        /* renamed from: b */
        public void m32583b(C24104d<T> c24104d) {
            C24104d[] c24104dArr;
            C24104d[] c24104dArr2;
            do {
                c24104dArr = this.f89970d.get();
                int length = c24104dArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c24104dArr[i].equals(c24104d)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c24104dArr2 = f89966f;
                } else {
                    C24104d[] c24104dArr3 = new C24104d[length - 1];
                    System.arraycopy(c24104dArr, 0, c24104dArr3, 0, i);
                    System.arraycopy(c24104dArr, i + 1, c24104dArr3, i, (length - i) - 1);
                    c24104dArr2 = c24104dArr3;
                }
            } while (!C42482i24.m35337a(this.f89970d, c24104dArr, c24104dArr2));
        }

        /* renamed from: c */
        public void m32582c() {
            for (C24104d<T> c24104d : this.f89970d.get()) {
                this.f89968b.mo32573h(c24104d);
            }
        }

        /* renamed from: d */
        public void m32581d() {
            for (C24104d<T> c24104d : this.f89970d.getAndSet(f89967g)) {
                this.f89968b.mo32573h(c24104d);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89970d.set(f89967g);
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89970d.get() == f89967g;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f89969c) {
                this.f89969c = true;
                this.f89968b.mo32575e();
                m32581d();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (!this.f89969c) {
                this.f89969c = true;
                this.f89968b.error(th);
                m32581d();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (!this.f89969c) {
                this.f89968b.mo32574f(t);
                m32582c();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                m32582c();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$k */
    /* loaded from: classes6.dex */
    public static final class C24111k<T> implements InterfaceC23434B<T> {

        /* renamed from: b */
        public final AtomicReference<C24110j<T>> f89972b;

        /* renamed from: c */
        public final InterfaceC24102b<T> f89973c;

        public C24111k(AtomicReference<C24110j<T>> atomicReference, InterfaceC24102b<T> interfaceC24102b) {
            this.f89972b = atomicReference;
            this.f89973c = interfaceC24102b;
        }

        @Override // io.reactivex.InterfaceC23434B
        public void subscribe(InterfaceC23436D<? super T> interfaceC23436D) {
            C24110j<T> c24110j;
            while (true) {
                c24110j = this.f89972b.get();
                if (c24110j != null) {
                    break;
                }
                C24110j<T> c24110j2 = new C24110j<>(this.f89973c.call());
                if (C42482i24.m35337a(this.f89972b, null, c24110j2)) {
                    c24110j = c24110j2;
                    break;
                }
            }
            C24104d<T> c24104d = new C24104d<>(c24110j, interfaceC23436D);
            interfaceC23436D.onSubscribe(c24104d);
            c24110j.m32584a(c24104d);
            if (c24104d.mo1769e()) {
                c24110j.m32583b(c24104d);
            } else {
                c24110j.f89968b.mo32573h(c24104d);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$l */
    /* loaded from: classes6.dex */
    public static final class C24112l<T> implements InterfaceC24102b<T> {

        /* renamed from: a */
        public final int f89974a;

        /* renamed from: b */
        public final long f89975b;

        /* renamed from: c */
        public final TimeUnit f89976c;

        /* renamed from: d */
        public final AbstractC23437E f89977d;

        public C24112l(int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f89974a = i;
            this.f89975b = j;
            this.f89976c = timeUnit;
            this.f89977d = abstractC23437E;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24102b
        public InterfaceC24108h<T> call() {
            return new C24113m(this.f89974a, this.f89975b, this.f89976c, this.f89977d);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$m */
    /* loaded from: classes6.dex */
    public static final class C24113m<T> extends AbstractC24101a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* renamed from: d */
        public final AbstractC23437E f89978d;

        /* renamed from: e */
        public final long f89979e;

        /* renamed from: f */
        public final TimeUnit f89980f;

        /* renamed from: g */
        public final int f89981g;

        public C24113m(int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f89978d = abstractC23437E;
            this.f89981g = i;
            this.f89979e = j;
            this.f89980f = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.AbstractC24101a
        /* renamed from: b */
        public Object mo32580b(Object obj) {
            return new C24551b(obj, this.f89978d.m33168c(this.f89980f), this.f89980f);
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.AbstractC24101a
        /* renamed from: c */
        public C24106f mo32579c() {
            C24106f c24106f;
            long m33168c = this.f89978d.m33168c(this.f89980f) - this.f89979e;
            C24106f c24106f2 = get();
            C24106f c24106f3 = c24106f2.get();
            while (true) {
                C24106f c24106f4 = c24106f3;
                c24106f = c24106f2;
                c24106f2 = c24106f4;
                if (c24106f2 != null) {
                    C24551b c24551b = (C24551b) c24106f2.f89962b;
                    if (EnumC24479n.m32238j(c24551b.m31924b()) || EnumC24479n.m32237k(c24551b.m31924b()) || c24551b.m31925a() > m33168c) {
                        break;
                    }
                    c24106f3 = c24106f2.get();
                } else {
                    break;
                }
            }
            return c24106f;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.AbstractC24101a
        /* renamed from: d */
        public Object mo32578d(Object obj) {
            return ((C24551b) obj).m31924b();
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.AbstractC24101a
        /* renamed from: k */
        public void mo32576k() {
            C24106f c24106f;
            long m33168c = this.f89978d.m33168c(this.f89980f) - this.f89979e;
            C24106f c24106f2 = get();
            C24106f c24106f3 = c24106f2.get();
            int i = 0;
            while (true) {
                C24106f c24106f4 = c24106f3;
                c24106f = c24106f2;
                c24106f2 = c24106f4;
                if (c24106f2 == null) {
                    break;
                }
                int i2 = this.f89954c;
                if (i2 > this.f89981g && i2 > 1) {
                    i++;
                    this.f89954c = i2 - 1;
                    c24106f3 = c24106f2.get();
                } else if (((C24551b) c24106f2.f89962b).m31925a() > m33168c) {
                    break;
                } else {
                    i++;
                    this.f89954c--;
                    c24106f3 = c24106f2.get();
                }
            }
            if (i != 0) {
                m32588i(c24106f);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
            m32588i(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
            return;
         */
        @Override // io.reactivex.internal.operators.observable.C24100U0.AbstractC24101a
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo32577l() {
            long m33168c = this.f89978d.m33168c(this.f89980f) - this.f89979e;
            C24106f c24106f = get();
            C24106f c24106f2 = c24106f.get();
            int i = 0;
            while (true) {
                C24106f c24106f3 = c24106f2;
                C24106f c24106f4 = c24106f;
                c24106f = c24106f3;
                if (c24106f == null || this.f89954c <= 1 || ((C24551b) c24106f.f89962b).m31925a() > m33168c) {
                    break;
                }
                i++;
                this.f89954c--;
                c24106f2 = c24106f.get();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$n */
    /* loaded from: classes6.dex */
    public static final class C24114n<T> extends AbstractC24101a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: d */
        public final int f89982d;

        public C24114n(int i) {
            this.f89982d = i;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.AbstractC24101a
        /* renamed from: k */
        public void mo32576k() {
            if (this.f89954c > this.f89982d) {
                m32589g();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$o */
    /* loaded from: classes6.dex */
    public static final class C24115o implements InterfaceC24102b<Object> {
        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24102b
        public InterfaceC24108h<Object> call() {
            return new C24116p(16);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.U0$p */
    /* loaded from: classes6.dex */
    public static final class C24116p<T> extends ArrayList<Object> implements InterfaceC24108h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: b */
        public volatile int f89983b;

        public C24116p(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        /* renamed from: e */
        public void mo32575e() {
            add(EnumC24479n.m32243e());
            this.f89983b++;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        public void error(Throwable th) {
            add(EnumC24479n.m32241g(th));
            this.f89983b++;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        /* renamed from: f */
        public void mo32574f(T t) {
            add(EnumC24479n.m32236l(t));
            this.f89983b++;
        }

        @Override // io.reactivex.internal.operators.observable.C24100U0.InterfaceC24108h
        /* renamed from: h */
        public void mo32573h(C24104d<T> c24104d) {
            int i;
            if (c24104d.getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super T> interfaceC23436D = c24104d.f89957c;
            int i2 = 1;
            while (!c24104d.mo1769e()) {
                int i3 = this.f89983b;
                Integer num = (Integer) c24104d.m32585a();
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                while (i < i3) {
                    if (EnumC24479n.m32246b(get(i), interfaceC23436D) || c24104d.mo1769e()) {
                        return;
                    }
                    i++;
                }
                c24104d.f89958d = Integer.valueOf(i);
                i2 = c24104d.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }
    }

    public C24100U0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<T> interfaceC23434B2, AtomicReference<C24110j<T>> atomicReference, InterfaceC24102b<T> interfaceC24102b) {
        this.f89952e = interfaceC23434B;
        this.f89949b = interfaceC23434B2;
        this.f89950c = atomicReference;
        this.f89951d = interfaceC24102b;
    }

    /* renamed from: l */
    public static <T> AbstractC24495a<T> m32597l(InterfaceC23434B<T> interfaceC23434B, int i) {
        if (i == Integer.MAX_VALUE) {
            return m32593p(interfaceC23434B);
        }
        return m32594o(interfaceC23434B, new C24109i(i));
    }

    /* renamed from: m */
    public static <T> AbstractC24495a<T> m32596m(InterfaceC23434B<T> interfaceC23434B, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return m32595n(interfaceC23434B, j, timeUnit, abstractC23437E, Integer.MAX_VALUE);
    }

    /* renamed from: n */
    public static <T> AbstractC24495a<T> m32595n(InterfaceC23434B<T> interfaceC23434B, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i) {
        return m32594o(interfaceC23434B, new C24112l(i, j, timeUnit, abstractC23437E));
    }

    /* renamed from: o */
    public static <T> AbstractC24495a<T> m32594o(InterfaceC23434B<T> interfaceC23434B, InterfaceC24102b<T> interfaceC24102b) {
        AtomicReference atomicReference = new AtomicReference();
        return C24508a.m31991r(new C24100U0(new C24111k(atomicReference, interfaceC24102b), interfaceC23434B, atomicReference, interfaceC24102b));
    }

    /* renamed from: p */
    public static <T> AbstractC24495a<T> m32593p(InterfaceC23434B<? extends T> interfaceC23434B) {
        return m32594o(interfaceC23434B, f89948f);
    }

    /* renamed from: q */
    public static <U, R> Observable<R> m32592q(Callable<? extends AbstractC24495a<U>> callable, InterfaceC23492o<? super Observable<U>, ? extends InterfaceC23434B<R>> interfaceC23492o) {
        return C24508a.m31994o(new C24105e(callable, interfaceC23492o));
    }

    /* renamed from: r */
    public static <T> AbstractC24495a<T> m32591r(AbstractC24495a<T> abstractC24495a, AbstractC23437E abstractC23437E) {
        return C24508a.m31991r(new C24107g(abstractC24495a, abstractC24495a.observeOn(abstractC23437E)));
    }

    @Override // io.reactivex.internal.disposables.InterfaceC23504g
    /* renamed from: d */
    public void mo32598d(InterfaceC23465c interfaceC23465c) {
        C42482i24.m35337a(this.f89950c, (C24110j) interfaceC23465c, null);
    }

    @Override // io.reactivex.observables.AbstractC24495a
    /* renamed from: g */
    public void mo32086g(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        C24110j<T> c24110j;
        boolean z;
        while (true) {
            c24110j = this.f89950c.get();
            if (c24110j != null && !c24110j.mo1769e()) {
                break;
            }
            C24110j<T> c24110j2 = new C24110j<>(this.f89951d.call());
            if (C42482i24.m35337a(this.f89950c, c24110j, c24110j2)) {
                c24110j = c24110j2;
                break;
            }
        }
        if (!c24110j.f89971e.get() && c24110j.f89971e.compareAndSet(false, true)) {
            z = true;
        } else {
            z = false;
        }
        try {
            interfaceC23484g.accept(c24110j);
            if (z) {
                this.f89949b.subscribe(c24110j);
            }
        } catch (Throwable th) {
            if (z) {
                c24110j.f89971e.compareAndSet(true, false);
            }
            C23475a.m33009b(th);
            throw C24475k.m32256e(th);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f89952e.subscribe(interfaceC23436D);
    }
}
