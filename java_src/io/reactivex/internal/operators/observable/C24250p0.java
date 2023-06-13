package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24489j;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.observables.AbstractC24495a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.internal.operators.observable.p0 */
/* loaded from: classes6.dex */
public final class C24250p0 {

    /* renamed from: io.reactivex.internal.operators.observable.p0$a */
    /* loaded from: classes6.dex */
    public static final class CallableC24251a<T> implements Callable<AbstractC24495a<T>> {

        /* renamed from: b */
        public final Observable<T> f90420b;

        /* renamed from: c */
        public final int f90421c;

        public CallableC24251a(Observable<T> observable, int i) {
            this.f90420b = observable;
            this.f90421c = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC24495a<T> call() {
            return this.f90420b.replay(this.f90421c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$b */
    /* loaded from: classes6.dex */
    public static final class CallableC24252b<T> implements Callable<AbstractC24495a<T>> {

        /* renamed from: b */
        public final Observable<T> f90422b;

        /* renamed from: c */
        public final int f90423c;

        /* renamed from: d */
        public final long f90424d;

        /* renamed from: e */
        public final TimeUnit f90425e;

        /* renamed from: f */
        public final AbstractC23437E f90426f;

        public CallableC24252b(Observable<T> observable, int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f90422b = observable;
            this.f90423c = i;
            this.f90424d = j;
            this.f90425e = timeUnit;
            this.f90426f = abstractC23437E;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC24495a<T> call() {
            return this.f90422b.replay(this.f90423c, this.f90424d, this.f90425e, this.f90426f);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$c */
    /* loaded from: classes6.dex */
    public static final class C24253c<T, U> implements InterfaceC23492o<T, InterfaceC23434B<U>> {

        /* renamed from: b */
        public final InterfaceC23492o<? super T, ? extends Iterable<? extends U>> f90427b;

        public C24253c(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o) {
            this.f90427b = interfaceC23492o;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC23434B<U> apply(T t) throws Exception {
            return new C24186g0((Iterable) C23544b.m32923e(this.f90427b.apply(t), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$d */
    /* loaded from: classes6.dex */
    public static final class C24254d<U, R, T> implements InterfaceC23492o<U, R> {

        /* renamed from: b */
        public final InterfaceC23480c<? super T, ? super U, ? extends R> f90428b;

        /* renamed from: c */
        public final T f90429c;

        public C24254d(InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, T t) {
            this.f90428b = interfaceC23480c;
            this.f90429c = t;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public R apply(U u) throws Exception {
            return this.f90428b.apply((T) this.f90429c, u);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$e */
    /* loaded from: classes6.dex */
    public static final class C24255e<T, R, U> implements InterfaceC23492o<T, InterfaceC23434B<R>> {

        /* renamed from: b */
        public final InterfaceC23480c<? super T, ? super U, ? extends R> f90430b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> f90431c;

        public C24255e(InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o) {
            this.f90430b = interfaceC23480c;
            this.f90431c = interfaceC23492o;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC23434B<R> apply(T t) throws Exception {
            return new C24321x0((InterfaceC23434B) C23544b.m32923e(this.f90431c.apply(t), "The mapper returned a null ObservableSource"), new C24254d(this.f90430b, t));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$f */
    /* loaded from: classes6.dex */
    public static final class C24256f<T, U> implements InterfaceC23492o<T, InterfaceC23434B<T>> {

        /* renamed from: b */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> f90432b;

        public C24256f(InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> interfaceC23492o) {
            this.f90432b = interfaceC23492o;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC23434B<T> apply(T t) throws Exception {
            return new C24277q1((InterfaceC23434B) C23544b.m32923e(this.f90432b.apply(t), "The itemDelay returned a null ObservableSource"), 1L).map(C23506a.m32962l(t)).defaultIfEmpty(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$g */
    /* loaded from: classes6.dex */
    public static final class C24257g<T> implements InterfaceC23478a {

        /* renamed from: b */
        public final InterfaceC23436D<T> f90433b;

        public C24257g(InterfaceC23436D<T> interfaceC23436D) {
            this.f90433b = interfaceC23436D;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() throws Exception {
            this.f90433b.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$h */
    /* loaded from: classes6.dex */
    public static final class C24258h<T> implements InterfaceC23484g<Throwable> {

        /* renamed from: b */
        public final InterfaceC23436D<T> f90434b;

        public C24258h(InterfaceC23436D<T> interfaceC23436D) {
            this.f90434b = interfaceC23436D;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.f90434b.onError(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$i */
    /* loaded from: classes6.dex */
    public static final class C24259i<T> implements InterfaceC23484g<T> {

        /* renamed from: b */
        public final InterfaceC23436D<T> f90435b;

        public C24259i(InterfaceC23436D<T> interfaceC23436D) {
            this.f90435b = interfaceC23436D;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        public void accept(T t) throws Exception {
            this.f90435b.onNext(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$j */
    /* loaded from: classes6.dex */
    public static final class CallableC24260j<T> implements Callable<AbstractC24495a<T>> {

        /* renamed from: b */
        public final Observable<T> f90436b;

        public CallableC24260j(Observable<T> observable) {
            this.f90436b = observable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC24495a<T> call() {
            return this.f90436b.replay();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$k */
    /* loaded from: classes6.dex */
    public static final class C24261k<T, R> implements InterfaceC23492o<Observable<T>, InterfaceC23434B<R>> {

        /* renamed from: b */
        public final InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> f90437b;

        /* renamed from: c */
        public final AbstractC23437E f90438c;

        public C24261k(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, AbstractC23437E abstractC23437E) {
            this.f90437b = interfaceC23492o;
            this.f90438c = abstractC23437E;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC23434B<R> apply(Observable<T> observable) throws Exception {
            return Observable.wrap((InterfaceC23434B) C23544b.m32923e(this.f90437b.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.f90438c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$l */
    /* loaded from: classes6.dex */
    public static final class C24262l<T, S> implements InterfaceC23480c<S, InterfaceC24489j<T>, S> {

        /* renamed from: a */
        public final InterfaceC23479b<S, InterfaceC24489j<T>> f90439a;

        public C24262l(InterfaceC23479b<S, InterfaceC24489j<T>> interfaceC23479b) {
            this.f90439a = interfaceC23479b;
        }

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public S apply(S s, InterfaceC24489j<T> interfaceC24489j) throws Exception {
            this.f90439a.accept(s, interfaceC24489j);
            return s;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$m */
    /* loaded from: classes6.dex */
    public static final class C24263m<T, S> implements InterfaceC23480c<S, InterfaceC24489j<T>, S> {

        /* renamed from: a */
        public final InterfaceC23484g<InterfaceC24489j<T>> f90440a;

        public C24263m(InterfaceC23484g<InterfaceC24489j<T>> interfaceC23484g) {
            this.f90440a = interfaceC23484g;
        }

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public S apply(S s, InterfaceC24489j<T> interfaceC24489j) throws Exception {
            this.f90440a.accept(interfaceC24489j);
            return s;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$n */
    /* loaded from: classes6.dex */
    public static final class CallableC24264n<T> implements Callable<AbstractC24495a<T>> {

        /* renamed from: b */
        public final Observable<T> f90441b;

        /* renamed from: c */
        public final long f90442c;

        /* renamed from: d */
        public final TimeUnit f90443d;

        /* renamed from: e */
        public final AbstractC23437E f90444e;

        public CallableC24264n(Observable<T> observable, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f90441b = observable;
            this.f90442c = j;
            this.f90443d = timeUnit;
            this.f90444e = abstractC23437E;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC24495a<T> call() {
            return this.f90441b.replay(this.f90442c, this.f90443d, this.f90444e);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p0$o */
    /* loaded from: classes6.dex */
    public static final class C24265o<T, R> implements InterfaceC23492o<List<InterfaceC23434B<? extends T>>, InterfaceC23434B<? extends R>> {

        /* renamed from: b */
        public final InterfaceC23492o<? super Object[], ? extends R> f90445b;

        public C24265o(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
            this.f90445b = interfaceC23492o;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC23434B<? extends R> apply(List<InterfaceC23434B<? extends T>> list) {
            return Observable.zipIterable(list, this.f90445b, false, Observable.bufferSize());
        }
    }

    private C24250p0() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, U> InterfaceC23492o<T, InterfaceC23434B<U>> m32478a(InterfaceC23492o<? super T, ? extends Iterable<? extends U>> interfaceC23492o) {
        return new C24253c(interfaceC23492o);
    }

    /* renamed from: b */
    public static <T, U, R> InterfaceC23492o<T, InterfaceC23434B<R>> m32477b(InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        return new C24255e(interfaceC23480c, interfaceC23492o);
    }

    /* renamed from: c */
    public static <T, U> InterfaceC23492o<T, InterfaceC23434B<T>> m32476c(InterfaceC23492o<? super T, ? extends InterfaceC23434B<U>> interfaceC23492o) {
        return new C24256f(interfaceC23492o);
    }

    /* renamed from: d */
    public static <T> InterfaceC23478a m32475d(InterfaceC23436D<T> interfaceC23436D) {
        return new C24257g(interfaceC23436D);
    }

    /* renamed from: e */
    public static <T> InterfaceC23484g<Throwable> m32474e(InterfaceC23436D<T> interfaceC23436D) {
        return new C24258h(interfaceC23436D);
    }

    /* renamed from: f */
    public static <T> InterfaceC23484g<T> m32473f(InterfaceC23436D<T> interfaceC23436D) {
        return new C24259i(interfaceC23436D);
    }

    /* renamed from: g */
    public static <T> Callable<AbstractC24495a<T>> m32472g(Observable<T> observable) {
        return new CallableC24260j(observable);
    }

    /* renamed from: h */
    public static <T> Callable<AbstractC24495a<T>> m32471h(Observable<T> observable, int i) {
        return new CallableC24251a(observable, i);
    }

    /* renamed from: i */
    public static <T> Callable<AbstractC24495a<T>> m32470i(Observable<T> observable, int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return new CallableC24252b(observable, i, j, timeUnit, abstractC23437E);
    }

    /* renamed from: j */
    public static <T> Callable<AbstractC24495a<T>> m32469j(Observable<T> observable, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return new CallableC24264n(observable, j, timeUnit, abstractC23437E);
    }

    /* renamed from: k */
    public static <T, R> InterfaceC23492o<Observable<T>, InterfaceC23434B<R>> m32468k(InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o, AbstractC23437E abstractC23437E) {
        return new C24261k(interfaceC23492o, abstractC23437E);
    }

    /* renamed from: l */
    public static <T, S> InterfaceC23480c<S, InterfaceC24489j<T>, S> m32467l(InterfaceC23479b<S, InterfaceC24489j<T>> interfaceC23479b) {
        return new C24262l(interfaceC23479b);
    }

    /* renamed from: m */
    public static <T, S> InterfaceC23480c<S, InterfaceC24489j<T>, S> m32466m(InterfaceC23484g<InterfaceC24489j<T>> interfaceC23484g) {
        return new C24263m(interfaceC23484g);
    }

    /* renamed from: n */
    public static <T, R> InterfaceC23492o<List<InterfaceC23434B<? extends T>>, InterfaceC23434B<? extends R>> m32465n(InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        return new C24265o(interfaceC23492o);
    }
}
