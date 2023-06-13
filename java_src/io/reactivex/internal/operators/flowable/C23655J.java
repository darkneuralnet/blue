package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscribers.AbstractC24446a;
import io.reactivex.internal.subscribers.AbstractC24447b;
/* renamed from: io.reactivex.internal.operators.flowable.J */
/* loaded from: classes6.dex */
public final class C23655J<T, U> extends AbstractC23695a<T, U> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends U> f88494d;

    /* renamed from: io.reactivex.internal.operators.flowable.J$a */
    /* loaded from: classes6.dex */
    public static final class C23656a<T, U> extends AbstractC24446a<T, U> {

        /* renamed from: g */
        public final InterfaceC23492o<? super T, ? extends U> f88495g;

        public C23656a(InterfaceC23546a<? super U> interfaceC23546a, InterfaceC23492o<? super T, ? extends U> interfaceC23492o) {
            super(interfaceC23546a);
            this.f88495g = interfaceC23492o;
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
            try {
                return this.f91016b.mo32761h(C23544b.m32923e(this.f88495g.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m32315e(th);
                return true;
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f91019e) {
                return;
            }
            if (this.f91020f != 0) {
                this.f91016b.onNext(null);
                return;
            }
            try {
                this.f91016b.onNext(C23544b.m32923e(this.f88495g.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m32315e(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public U poll() throws Exception {
            T poll = this.f91018d.poll();
            if (poll != null) {
                return (U) C23544b.m32923e(this.f88495g.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.J$b */
    /* loaded from: classes6.dex */
    public static final class C23657b<T, U> extends AbstractC24447b<T, U> {

        /* renamed from: g */
        public final InterfaceC23492o<? super T, ? extends U> f88496g;

        public C23657b(InterfaceC42141hT5<? super U> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends U> interfaceC23492o) {
            super(interfaceC42141hT5);
            this.f88496g = interfaceC23492o;
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
            if (this.f91025f != 0) {
                this.f91021b.onNext(null);
                return;
            }
            try {
                this.f91021b.onNext(C23544b.m32923e(this.f88496g.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m32311e(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public U poll() throws Exception {
            T poll = this.f91023d.poll();
            if (poll != null) {
                return (U) C23544b.m32923e(this.f88496g.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public C23655J(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends U> interfaceC23492o) {
        super(abstractC24490k);
        this.f88494d = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super U> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            this.f88638c.m32166W0(new C23656a((InterfaceC23546a) interfaceC42141hT5, this.f88494d));
        } else {
            this.f88638c.m32166W0(new C23657b(interfaceC42141hT5, this.f88494d));
        }
    }
}
