package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.subscribers.AbstractC24446a;
import io.reactivex.internal.subscribers.AbstractC24447b;
/* renamed from: io.reactivex.internal.operators.flowable.r */
/* loaded from: classes6.dex */
public final class C23792r<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23494q<? super T> f88970d;

    /* renamed from: io.reactivex.internal.operators.flowable.r$a */
    /* loaded from: classes6.dex */
    public static final class C23793a<T> extends AbstractC24446a<T, T> {

        /* renamed from: g */
        public final InterfaceC23494q<? super T> f88971g;

        public C23793a(InterfaceC23546a<? super T> interfaceC23546a, InterfaceC23494q<? super T> interfaceC23494q) {
            super(interfaceC23546a);
            this.f88971g = interfaceC23494q;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32314f(i);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23546a
        /* renamed from: h */
        public boolean mo32761h(T t) {
            if (this.f91019e) {
                return false;
            }
            if (this.f91020f != 0) {
                return this.f91016b.mo32761h(null);
            }
            try {
                if (!this.f88971g.test(t) || !this.f91016b.mo32761h(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                m32315e(th);
                return true;
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!mo32761h(t)) {
                this.f91017c.mo21023o(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            InterfaceC23552g<T> interfaceC23552g = this.f91018d;
            InterfaceC23494q<? super T> interfaceC23494q = this.f88971g;
            while (true) {
                T poll = interfaceC23552g.poll();
                if (poll == null) {
                    return null;
                }
                if (interfaceC23494q.test(poll)) {
                    return poll;
                }
                if (this.f91020f == 2) {
                    interfaceC23552g.mo21023o(1L);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.r$b */
    /* loaded from: classes6.dex */
    public static final class C23794b<T> extends AbstractC24447b<T, T> implements InterfaceC23546a<T> {

        /* renamed from: g */
        public final InterfaceC23494q<? super T> f88972g;

        public C23794b(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23494q<? super T> interfaceC23494q) {
            super(interfaceC42141hT5);
            this.f88972g = interfaceC23494q;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32310f(i);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23546a
        /* renamed from: h */
        public boolean mo32761h(T t) {
            if (this.f91024e) {
                return false;
            }
            if (this.f91025f != 0) {
                this.f91021b.onNext(null);
                return true;
            }
            try {
                boolean test = this.f88972g.test(t);
                if (test) {
                    this.f91021b.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                m32311e(th);
                return true;
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!mo32761h(t)) {
                this.f91022c.mo21023o(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            InterfaceC23552g<T> interfaceC23552g = this.f91023d;
            InterfaceC23494q<? super T> interfaceC23494q = this.f88972g;
            while (true) {
                T poll = interfaceC23552g.poll();
                if (poll == null) {
                    return null;
                }
                if (interfaceC23494q.test(poll)) {
                    return poll;
                }
                if (this.f91025f == 2) {
                    interfaceC23552g.mo21023o(1L);
                }
            }
        }
    }

    public C23792r(AbstractC24490k<T> abstractC24490k, InterfaceC23494q<? super T> interfaceC23494q) {
        super(abstractC24490k);
        this.f88970d = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            this.f88638c.m32166W0(new C23793a((InterfaceC23546a) interfaceC42141hT5, this.f88970d));
        } else {
            this.f88638c.m32166W0(new C23794b(interfaceC42141hT5, this.f88970d));
        }
    }
}
