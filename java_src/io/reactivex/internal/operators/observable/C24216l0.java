package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import io.reactivex.subjects.C24570i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.l0 */
/* loaded from: classes6.dex */
public final class C24216l0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC24145a<TLeft, R> {

    /* renamed from: c */
    public final InterfaceC23434B<? extends TRight> f90310c;

    /* renamed from: d */
    public final InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> f90311d;

    /* renamed from: e */
    public final InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> f90312e;

    /* renamed from: f */
    public final InterfaceC23480c<? super TLeft, ? super Observable<TRight>, ? extends R> f90313f;

    /* renamed from: io.reactivex.internal.operators.observable.l0$a */
    /* loaded from: classes6.dex */
    public static final class C24217a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC23465c, InterfaceC24218b {

        /* renamed from: o */
        public static final Integer f90314o = 1;

        /* renamed from: p */
        public static final Integer f90315p = 2;

        /* renamed from: q */
        public static final Integer f90316q = 3;

        /* renamed from: r */
        public static final Integer f90317r = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90318b;

        /* renamed from: h */
        public final InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> f90324h;

        /* renamed from: i */
        public final InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> f90325i;

        /* renamed from: j */
        public final InterfaceC23480c<? super TLeft, ? super Observable<TRight>, ? extends R> f90326j;

        /* renamed from: l */
        public int f90328l;

        /* renamed from: m */
        public int f90329m;

        /* renamed from: n */
        public volatile boolean f90330n;

        /* renamed from: d */
        public final C23464b f90320d = new C23464b();

        /* renamed from: c */
        public final C24409c<Object> f90319c = new C24409c<>(Observable.bufferSize());

        /* renamed from: e */
        public final Map<Integer, C24570i<TRight>> f90321e = new LinkedHashMap();

        /* renamed from: f */
        public final Map<Integer, TRight> f90322f = new LinkedHashMap();

        /* renamed from: g */
        public final AtomicReference<Throwable> f90323g = new AtomicReference<>();

        /* renamed from: k */
        public final AtomicInteger f90327k = new AtomicInteger(2);

        public C24217a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> interfaceC23492o, InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> interfaceC23492o2, InterfaceC23480c<? super TLeft, ? super Observable<TRight>, ? extends R> interfaceC23480c) {
            this.f90318b = interfaceC23436D;
            this.f90324h = interfaceC23492o;
            this.f90325i = interfaceC23492o2;
            this.f90326j = interfaceC23480c;
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: a */
        public void mo32437a(Throwable th) {
            if (C24475k.m32260a(this.f90323g, th)) {
                this.f90327k.decrementAndGet();
                m32493i();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: b */
        public void mo32436b(boolean z, C24219c c24219c) {
            Integer num;
            synchronized (this) {
                C24409c<Object> c24409c = this.f90319c;
                if (z) {
                    num = f90316q;
                } else {
                    num = f90317r;
                }
                c24409c.m32365m(num, c24219c);
            }
            m32493i();
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: c */
        public void mo32435c(Throwable th) {
            if (C24475k.m32260a(this.f90323g, th)) {
                m32493i();
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: d */
        public void mo32434d(C24220d c24220d) {
            this.f90320d.mo32984b(c24220d);
            this.f90327k.decrementAndGet();
            m32493i();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f90330n) {
                return;
            }
            this.f90330n = true;
            m32494h();
            if (getAndIncrement() == 0) {
                this.f90319c.clear();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90330n;
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: g */
        public void mo32433g(boolean z, Object obj) {
            Integer num;
            synchronized (this) {
                C24409c<Object> c24409c = this.f90319c;
                if (z) {
                    num = f90314o;
                } else {
                    num = f90315p;
                }
                c24409c.m32365m(num, obj);
            }
            m32493i();
        }

        /* renamed from: h */
        public void m32494h() {
            this.f90320d.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: i */
        public void m32493i() {
            boolean z;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            C24409c<?> c24409c = this.f90319c;
            InterfaceC23436D<? super R> interfaceC23436D = this.f90318b;
            int i = 1;
            while (!this.f90330n) {
                if (this.f90323g.get() != null) {
                    c24409c.clear();
                    m32494h();
                    m32492j(interfaceC23436D);
                    return;
                }
                if (this.f90327k.get() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Integer num = (Integer) c24409c.poll();
                if (num == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    for (C24570i<TRight> c24570i : this.f90321e.values()) {
                        c24570i.onComplete();
                    }
                    this.f90321e.clear();
                    this.f90322f.clear();
                    this.f90320d.dispose();
                    interfaceC23436D.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    Object poll = c24409c.poll();
                    if (num == f90314o) {
                        C24570i<TRight> m31877c = C24570i.m31877c();
                        int i2 = this.f90328l;
                        this.f90328l = i2 + 1;
                        this.f90321e.put(Integer.valueOf(i2), m31877c);
                        try {
                            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90324h.apply(poll), "The leftEnd returned a null ObservableSource");
                            C24219c c24219c = new C24219c(this, true, i2);
                            this.f90320d.mo32983c(c24219c);
                            interfaceC23434B.subscribe(c24219c);
                            if (this.f90323g.get() != null) {
                                c24409c.clear();
                                m32494h();
                                m32492j(interfaceC23436D);
                                return;
                            }
                            try {
                                interfaceC23436D.onNext((Object) C23544b.m32923e(this.f90326j.apply(poll, m31877c), "The resultSelector returned a null value"));
                                for (TRight tright : this.f90322f.values()) {
                                    m31877c.onNext(tright);
                                }
                            } catch (Throwable th) {
                                m32491k(th, interfaceC23436D, c24409c);
                                return;
                            }
                        } catch (Throwable th2) {
                            m32491k(th2, interfaceC23436D, c24409c);
                            return;
                        }
                    } else if (num == f90315p) {
                        int i3 = this.f90329m;
                        this.f90329m = i3 + 1;
                        this.f90322f.put(Integer.valueOf(i3), poll);
                        try {
                            InterfaceC23434B interfaceC23434B2 = (InterfaceC23434B) C23544b.m32923e(this.f90325i.apply(poll), "The rightEnd returned a null ObservableSource");
                            C24219c c24219c2 = new C24219c(this, false, i3);
                            this.f90320d.mo32983c(c24219c2);
                            interfaceC23434B2.subscribe(c24219c2);
                            if (this.f90323g.get() != null) {
                                c24409c.clear();
                                m32494h();
                                m32492j(interfaceC23436D);
                                return;
                            }
                            for (C24570i<TRight> c24570i2 : this.f90321e.values()) {
                                c24570i2.onNext(poll);
                            }
                        } catch (Throwable th3) {
                            m32491k(th3, interfaceC23436D, c24409c);
                            return;
                        }
                    } else if (num == f90316q) {
                        C24219c c24219c3 = (C24219c) poll;
                        C24570i<TRight> remove = this.f90321e.remove(Integer.valueOf(c24219c3.f90333d));
                        this.f90320d.mo32985a(c24219c3);
                        if (remove != null) {
                            remove.onComplete();
                        }
                    } else if (num == f90317r) {
                        C24219c c24219c4 = (C24219c) poll;
                        this.f90322f.remove(Integer.valueOf(c24219c4.f90333d));
                        this.f90320d.mo32985a(c24219c4);
                    }
                }
            }
            c24409c.clear();
        }

        /* renamed from: j */
        public void m32492j(InterfaceC23436D<?> interfaceC23436D) {
            Throwable m32259b = C24475k.m32259b(this.f90323g);
            for (C24570i<TRight> c24570i : this.f90321e.values()) {
                c24570i.onError(m32259b);
            }
            this.f90321e.clear();
            this.f90322f.clear();
            interfaceC23436D.onError(m32259b);
        }

        /* renamed from: k */
        public void m32491k(Throwable th, InterfaceC23436D<?> interfaceC23436D, C24409c<?> c24409c) {
            C23475a.m33009b(th);
            C24475k.m32260a(this.f90323g, th);
            c24409c.clear();
            m32494h();
            m32492j(interfaceC23436D);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.l0$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC24218b {
        /* renamed from: a */
        void mo32437a(Throwable th);

        /* renamed from: b */
        void mo32436b(boolean z, C24219c c24219c);

        /* renamed from: c */
        void mo32435c(Throwable th);

        /* renamed from: d */
        void mo32434d(C24220d c24220d);

        /* renamed from: g */
        void mo32433g(boolean z, Object obj);
    }

    /* renamed from: io.reactivex.internal.operators.observable.l0$c */
    /* loaded from: classes6.dex */
    public static final class C24219c extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Object>, InterfaceC23465c {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: b */
        public final InterfaceC24218b f90331b;

        /* renamed from: c */
        public final boolean f90332c;

        /* renamed from: d */
        public final int f90333d;

        public C24219c(InterfaceC24218b interfaceC24218b, boolean z, int i) {
            this.f90331b = interfaceC24218b;
            this.f90332c = z;
            this.f90333d = i;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90331b.mo32436b(this.f90332c, this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90331b.mo32435c(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            if (EnumC23501d.m33000a(this)) {
                this.f90331b.mo32436b(this.f90332c, this);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.l0$d */
    /* loaded from: classes6.dex */
    public static final class C24220d extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Object>, InterfaceC23465c {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: b */
        public final InterfaceC24218b f90334b;

        /* renamed from: c */
        public final boolean f90335c;

        public C24220d(InterfaceC24218b interfaceC24218b, boolean z) {
            this.f90334b = interfaceC24218b;
            this.f90335c = z;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90334b.mo32434d(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90334b.mo32437a(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            this.f90334b.mo32433g(this.f90335c, obj);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    public C24216l0(InterfaceC23434B<TLeft> interfaceC23434B, InterfaceC23434B<? extends TRight> interfaceC23434B2, InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> interfaceC23492o, InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> interfaceC23492o2, InterfaceC23480c<? super TLeft, ? super Observable<TRight>, ? extends R> interfaceC23480c) {
        super(interfaceC23434B);
        this.f90310c = interfaceC23434B2;
        this.f90311d = interfaceC23492o;
        this.f90312e = interfaceC23492o2;
        this.f90313f = interfaceC23480c;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        C24217a c24217a = new C24217a(interfaceC23436D, this.f90311d, this.f90312e, this.f90313f);
        interfaceC23436D.onSubscribe(c24217a);
        C24220d c24220d = new C24220d(c24217a, true);
        c24217a.f90320d.mo32983c(c24220d);
        C24220d c24220d2 = new C24220d(c24217a, false);
        c24217a.f90320d.mo32983c(c24220d2);
        this.f90078b.subscribe(c24220d);
        this.f90310c.subscribe(c24220d2);
    }
}
