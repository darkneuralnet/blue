package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.reactivex.internal.operators.observable.m */
/* loaded from: classes6.dex */
public final class C24224m<T, U extends Collection<? super T>> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final int f90347c;

    /* renamed from: d */
    public final int f90348d;

    /* renamed from: e */
    public final Callable<U> f90349e;

    /* renamed from: io.reactivex.internal.operators.observable.m$a */
    /* loaded from: classes6.dex */
    public static final class C24225a<T, U extends Collection<? super T>> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super U> f90350b;

        /* renamed from: c */
        public final int f90351c;

        /* renamed from: d */
        public final Callable<U> f90352d;

        /* renamed from: e */
        public U f90353e;

        /* renamed from: f */
        public int f90354f;

        /* renamed from: g */
        public InterfaceC23465c f90355g;

        public C24225a(InterfaceC23436D<? super U> interfaceC23436D, int i, Callable<U> callable) {
            this.f90350b = interfaceC23436D;
            this.f90351c = i;
            this.f90352d = callable;
        }

        /* renamed from: a */
        public boolean m32490a() {
            try {
                this.f90353e = (U) C23544b.m32923e(this.f90352d.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90353e = null;
                InterfaceC23465c interfaceC23465c = this.f90355g;
                if (interfaceC23465c == null) {
                    EnumC23502e.m32987i(th, this.f90350b);
                    return false;
                }
                interfaceC23465c.dispose();
                this.f90350b.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90355g.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90355g.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            U u = this.f90353e;
            if (u != null) {
                this.f90353e = null;
                if (!u.isEmpty()) {
                    this.f90350b.onNext(u);
                }
                this.f90350b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90353e = null;
            this.f90350b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            U u = this.f90353e;
            if (u != null) {
                u.add(t);
                int i = this.f90354f + 1;
                this.f90354f = i;
                if (i >= this.f90351c) {
                    this.f90350b.onNext(u);
                    this.f90354f = 0;
                    m32490a();
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90355g, interfaceC23465c)) {
                this.f90355g = interfaceC23465c;
                this.f90350b.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.m$b */
    /* loaded from: classes6.dex */
    public static final class C24226b<T, U extends Collection<? super T>> extends AtomicBoolean implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -8223395059921494546L;

        /* renamed from: b */
        public final InterfaceC23436D<? super U> f90356b;

        /* renamed from: c */
        public final int f90357c;

        /* renamed from: d */
        public final int f90358d;

        /* renamed from: e */
        public final Callable<U> f90359e;

        /* renamed from: f */
        public InterfaceC23465c f90360f;

        /* renamed from: g */
        public final ArrayDeque<U> f90361g = new ArrayDeque<>();

        /* renamed from: h */
        public long f90362h;

        public C24226b(InterfaceC23436D<? super U> interfaceC23436D, int i, int i2, Callable<U> callable) {
            this.f90356b = interfaceC23436D;
            this.f90357c = i;
            this.f90358d = i2;
            this.f90359e = callable;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90360f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90360f.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            while (!this.f90361g.isEmpty()) {
                this.f90356b.onNext(this.f90361g.poll());
            }
            this.f90356b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90361g.clear();
            this.f90356b.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            long j = this.f90362h;
            this.f90362h = 1 + j;
            if (j % this.f90358d == 0) {
                try {
                    this.f90361g.offer((Collection) C23544b.m32923e(this.f90359e.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.f90361g.clear();
                    this.f90360f.dispose();
                    this.f90356b.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.f90361g.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.f90357c <= next.size()) {
                    it.remove();
                    this.f90356b.onNext(next);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90360f, interfaceC23465c)) {
                this.f90360f = interfaceC23465c;
                this.f90356b.onSubscribe(this);
            }
        }
    }

    public C24224m(InterfaceC23434B<T> interfaceC23434B, int i, int i2, Callable<U> callable) {
        super(interfaceC23434B);
        this.f90347c = i;
        this.f90348d = i2;
        this.f90349e = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        int i = this.f90348d;
        int i2 = this.f90347c;
        if (i == i2) {
            C24225a c24225a = new C24225a(interfaceC23436D, i2, this.f90349e);
            if (c24225a.m32490a()) {
                this.f90078b.subscribe(c24225a);
                return;
            }
            return;
        }
        this.f90078b.subscribe(new C24226b(interfaceC23436D, this.f90347c, this.f90348d, this.f90349e));
    }
}
