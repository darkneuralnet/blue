package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscribers.AbstractC24446a;
import io.reactivex.internal.subscribers.AbstractC24447b;
/* renamed from: io.reactivex.internal.operators.flowable.h */
/* loaded from: classes6.dex */
public final class C23748h<T, K> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, K> f88805d;

    /* renamed from: e */
    public final InterfaceC23481d<? super K, ? super K> f88806e;

    /* renamed from: io.reactivex.internal.operators.flowable.h$a */
    /* loaded from: classes6.dex */
    public static final class C23749a<T, K> extends AbstractC24446a<T, T> {

        /* renamed from: g */
        public final InterfaceC23492o<? super T, K> f88807g;

        /* renamed from: h */
        public final InterfaceC23481d<? super K, ? super K> f88808h;

        /* renamed from: i */
        public K f88809i;

        /* renamed from: j */
        public boolean f88810j;

        public C23749a(InterfaceC23546a<? super T> interfaceC23546a, InterfaceC23492o<? super T, K> interfaceC23492o, InterfaceC23481d<? super K, ? super K> interfaceC23481d) {
            super(interfaceC23546a);
            this.f88807g = interfaceC23492o;
            this.f88808h = interfaceC23481d;
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
                return this.f91016b.mo32761h(t);
            }
            try {
                K apply = this.f88807g.apply(t);
                if (this.f88810j) {
                    boolean test = this.f88808h.test((K) this.f88809i, apply);
                    this.f88809i = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f88810j = true;
                    this.f88809i = apply;
                }
                this.f91016b.onNext(t);
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
            while (true) {
                T poll = this.f91018d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f88807g.apply(poll);
                if (!this.f88810j) {
                    this.f88810j = true;
                    this.f88809i = apply;
                    return poll;
                } else if (!this.f88808h.test((K) this.f88809i, apply)) {
                    this.f88809i = apply;
                    return poll;
                } else {
                    this.f88809i = apply;
                    if (this.f91020f != 1) {
                        this.f91017c.mo21023o(1L);
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.h$b */
    /* loaded from: classes6.dex */
    public static final class C23750b<T, K> extends AbstractC24447b<T, T> implements InterfaceC23546a<T> {

        /* renamed from: g */
        public final InterfaceC23492o<? super T, K> f88811g;

        /* renamed from: h */
        public final InterfaceC23481d<? super K, ? super K> f88812h;

        /* renamed from: i */
        public K f88813i;

        /* renamed from: j */
        public boolean f88814j;

        public C23750b(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23492o<? super T, K> interfaceC23492o, InterfaceC23481d<? super K, ? super K> interfaceC23481d) {
            super(interfaceC42141hT5);
            this.f88811g = interfaceC23492o;
            this.f88812h = interfaceC23481d;
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
                this.f91021b.onNext(t);
                return true;
            }
            try {
                K apply = this.f88811g.apply(t);
                if (this.f88814j) {
                    boolean test = this.f88812h.test((K) this.f88813i, apply);
                    this.f88813i = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f88814j = true;
                    this.f88813i = apply;
                }
                this.f91021b.onNext(t);
                return true;
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
            while (true) {
                T poll = this.f91023d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f88811g.apply(poll);
                if (!this.f88814j) {
                    this.f88814j = true;
                    this.f88813i = apply;
                    return poll;
                } else if (!this.f88812h.test((K) this.f88813i, apply)) {
                    this.f88813i = apply;
                    return poll;
                } else {
                    this.f88813i = apply;
                    if (this.f91025f != 1) {
                        this.f91022c.mo21023o(1L);
                    }
                }
            }
        }
    }

    public C23748h(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, K> interfaceC23492o, InterfaceC23481d<? super K, ? super K> interfaceC23481d) {
        super(abstractC24490k);
        this.f88805d = interfaceC23492o;
        this.f88806e = interfaceC23481d;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            this.f88638c.m32166W0(new C23749a((InterfaceC23546a) interfaceC42141hT5, this.f88805d, this.f88806e));
        } else {
            this.f88638c.m32166W0(new C23750b(interfaceC42141hT5, this.f88805d, this.f88806e));
        }
    }
}
