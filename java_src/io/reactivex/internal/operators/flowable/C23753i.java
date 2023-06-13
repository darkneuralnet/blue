package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscribers.AbstractC24446a;
import io.reactivex.internal.subscribers.AbstractC24447b;
/* renamed from: io.reactivex.internal.operators.flowable.i */
/* loaded from: classes6.dex */
public final class C23753i<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23484g<? super T> f88821d;

    /* renamed from: io.reactivex.internal.operators.flowable.i$a */
    /* loaded from: classes6.dex */
    public static final class C23754a<T> extends AbstractC24446a<T, T> {

        /* renamed from: g */
        public final InterfaceC23484g<? super T> f88822g;

        public C23754a(InterfaceC23546a<? super T> interfaceC23546a, InterfaceC23484g<? super T> interfaceC23484g) {
            super(interfaceC23546a);
            this.f88822g = interfaceC23484g;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32314f(i);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23546a
        /* renamed from: h */
        public boolean mo32761h(T t) {
            boolean mo32761h = this.f91016b.mo32761h(t);
            try {
                this.f88822g.accept(t);
            } catch (Throwable th) {
                m32315e(th);
            }
            return mo32761h;
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f91016b.onNext(t);
            if (this.f91020f == 0) {
                try {
                    this.f88822g.accept(t);
                } catch (Throwable th) {
                    m32315e(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f91018d.poll();
            if (poll != null) {
                this.f88822g.accept(poll);
            }
            return poll;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.i$b */
    /* loaded from: classes6.dex */
    public static final class C23755b<T> extends AbstractC24447b<T, T> {

        /* renamed from: g */
        public final InterfaceC23484g<? super T> f88823g;

        public C23755b(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23484g<? super T> interfaceC23484g) {
            super(interfaceC42141hT5);
            this.f88823g = interfaceC23484g;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32310f(i);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f91024e) {
                return;
            }
            this.f91021b.onNext(t);
            if (this.f91025f == 0) {
                try {
                    this.f88823g.accept(t);
                } catch (Throwable th) {
                    m32311e(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f91023d.poll();
            if (poll != null) {
                this.f88823g.accept(poll);
            }
            return poll;
        }
    }

    public C23753i(AbstractC24490k<T> abstractC24490k, InterfaceC23484g<? super T> interfaceC23484g) {
        super(abstractC24490k);
        this.f88821d = interfaceC23484g;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            this.f88638c.m32166W0(new C23754a((InterfaceC23546a) interfaceC42141hT5, this.f88821d));
        } else {
            this.f88638c.m32166W0(new C23755b(interfaceC42141hT5, this.f88821d));
        }
    }
}
