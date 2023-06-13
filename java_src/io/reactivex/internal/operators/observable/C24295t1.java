package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.queue.C24409c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.observable.t1 */
/* loaded from: classes6.dex */
public final class C24295t1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f90585c;

    /* renamed from: d */
    public final long f90586d;

    /* renamed from: e */
    public final TimeUnit f90587e;

    /* renamed from: f */
    public final AbstractC23437E f90588f;

    /* renamed from: g */
    public final int f90589g;

    /* renamed from: h */
    public final boolean f90590h;

    /* renamed from: io.reactivex.internal.operators.observable.t1$a */
    /* loaded from: classes6.dex */
    public static final class C24296a<T> extends AtomicBoolean implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90591b;

        /* renamed from: c */
        public final long f90592c;

        /* renamed from: d */
        public final long f90593d;

        /* renamed from: e */
        public final TimeUnit f90594e;

        /* renamed from: f */
        public final AbstractC23437E f90595f;

        /* renamed from: g */
        public final C24409c<Object> f90596g;

        /* renamed from: h */
        public final boolean f90597h;

        /* renamed from: i */
        public InterfaceC23465c f90598i;

        /* renamed from: j */
        public volatile boolean f90599j;

        /* renamed from: k */
        public Throwable f90600k;

        public C24296a(InterfaceC23436D<? super T> interfaceC23436D, long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i, boolean z) {
            this.f90591b = interfaceC23436D;
            this.f90592c = j;
            this.f90593d = j2;
            this.f90594e = timeUnit;
            this.f90595f = abstractC23437E;
            this.f90596g = new C24409c<>(i);
            this.f90597h = z;
        }

        /* renamed from: a */
        public void m32426a() {
            boolean z;
            Throwable th;
            if (!compareAndSet(false, true)) {
                return;
            }
            InterfaceC23436D<? super T> interfaceC23436D = this.f90591b;
            C24409c<Object> c24409c = this.f90596g;
            boolean z2 = this.f90597h;
            long m33168c = this.f90595f.m33168c(this.f90594e) - this.f90593d;
            while (!this.f90599j) {
                if (!z2 && (th = this.f90600k) != null) {
                    c24409c.clear();
                    interfaceC23436D.onError(th);
                    return;
                }
                Object poll = c24409c.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Throwable th2 = this.f90600k;
                    if (th2 != null) {
                        interfaceC23436D.onError(th2);
                        return;
                    } else {
                        interfaceC23436D.onComplete();
                        return;
                    }
                }
                Object poll2 = c24409c.poll();
                if (((Long) poll).longValue() >= m33168c) {
                    interfaceC23436D.onNext(poll2);
                }
            }
            c24409c.clear();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90599j) {
                this.f90599j = true;
                this.f90598i.dispose();
                if (compareAndSet(false, true)) {
                    this.f90596g.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90599j;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            m32426a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90600k = th;
            m32426a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            boolean z;
            C24409c<Object> c24409c = this.f90596g;
            long m33168c = this.f90595f.m33168c(this.f90594e);
            long j = this.f90593d;
            long j2 = this.f90592c;
            if (j2 == LongCompanionObject.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            c24409c.m32365m(Long.valueOf(m33168c), t);
            while (!c24409c.isEmpty()) {
                if (((Long) c24409c.m32364n()).longValue() <= m33168c - j || (!z && (c24409c.m32362p() >> 1) > j2)) {
                    c24409c.poll();
                    c24409c.poll();
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90598i, interfaceC23465c)) {
                this.f90598i = interfaceC23465c;
                this.f90591b.onSubscribe(this);
            }
        }
    }

    public C24295t1(InterfaceC23434B<T> interfaceC23434B, long j, long j2, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i, boolean z) {
        super(interfaceC23434B);
        this.f90585c = j;
        this.f90586d = j2;
        this.f90587e = timeUnit;
        this.f90588f = abstractC23437E;
        this.f90589g = i;
        this.f90590h = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24296a(interfaceC23436D, this.f90585c, this.f90586d, this.f90587e, this.f90588f, this.f90589g, this.f90590h));
    }
}
