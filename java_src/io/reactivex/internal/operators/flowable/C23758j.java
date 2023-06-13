package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.subscriptions.AbstractC24457a;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.flowable.j */
/* loaded from: classes6.dex */
public final class C23758j<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23478a f88829d;

    /* renamed from: io.reactivex.internal.operators.flowable.j$a */
    /* loaded from: classes6.dex */
    public static final class C23759a<T> extends AbstractC24457a<T> implements InterfaceC23546a<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b */
        public final InterfaceC23546a<? super T> f88830b;

        /* renamed from: c */
        public final InterfaceC23478a f88831c;

        /* renamed from: d */
        public InterfaceC46292oT5 f88832d;

        /* renamed from: e */
        public InterfaceC23552g<T> f88833e;

        /* renamed from: f */
        public boolean f88834f;

        public C23759a(InterfaceC23546a<? super T> interfaceC23546a, InterfaceC23478a interfaceC23478a) {
            this.f88830b = interfaceC23546a;
            this.f88831c = interfaceC23478a;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88832d, interfaceC46292oT5)) {
                this.f88832d = interfaceC46292oT5;
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    this.f88833e = (InterfaceC23552g) interfaceC46292oT5;
                }
                this.f88830b.mo31867a(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            InterfaceC23552g<T> interfaceC23552g = this.f88833e;
            boolean z = false;
            if (interfaceC23552g == null || (i & 4) != 0) {
                return 0;
            }
            int mo31868b = interfaceC23552g.mo31868b(i);
            if (mo31868b != 0) {
                if (mo31868b == 1) {
                    z = true;
                }
                this.f88834f = z;
            }
            return mo31868b;
        }

        /* renamed from: c */
        public void m32798c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f88831c.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88832d.cancel();
            m32798c();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f88833e.clear();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23546a
        /* renamed from: h */
        public boolean mo32761h(T t) {
            return this.f88830b.mo32761h(t);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f88833e.isEmpty();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            this.f88832d.mo21023o(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88830b.onComplete();
            m32798c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88830b.onError(th);
            m32798c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88830b.onNext(t);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f88833e.poll();
            if (poll == null && this.f88834f) {
                m32798c();
            }
            return poll;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.j$b */
    /* loaded from: classes6.dex */
    public static final class C23760b<T> extends AbstractC24457a<T> implements InterfaceC24494o<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88835b;

        /* renamed from: c */
        public final InterfaceC23478a f88836c;

        /* renamed from: d */
        public InterfaceC46292oT5 f88837d;

        /* renamed from: e */
        public InterfaceC23552g<T> f88838e;

        /* renamed from: f */
        public boolean f88839f;

        public C23760b(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23478a interfaceC23478a) {
            this.f88835b = interfaceC42141hT5;
            this.f88836c = interfaceC23478a;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88837d, interfaceC46292oT5)) {
                this.f88837d = interfaceC46292oT5;
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    this.f88838e = (InterfaceC23552g) interfaceC46292oT5;
                }
                this.f88835b.mo31867a(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            InterfaceC23552g<T> interfaceC23552g = this.f88838e;
            boolean z = false;
            if (interfaceC23552g == null || (i & 4) != 0) {
                return 0;
            }
            int mo31868b = interfaceC23552g.mo31868b(i);
            if (mo31868b != 0) {
                if (mo31868b == 1) {
                    z = true;
                }
                this.f88839f = z;
            }
            return mo31868b;
        }

        /* renamed from: c */
        public void m32797c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f88836c.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88837d.cancel();
            m32797c();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f88838e.clear();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f88838e.isEmpty();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            this.f88837d.mo21023o(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88835b.onComplete();
            m32797c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88835b.onError(th);
            m32797c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88835b.onNext(t);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f88838e.poll();
            if (poll == null && this.f88839f) {
                m32797c();
            }
            return poll;
        }
    }

    public C23758j(AbstractC24490k<T> abstractC24490k, InterfaceC23478a interfaceC23478a) {
        super(abstractC24490k);
        this.f88829d = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            this.f88638c.m32166W0(new C23759a((InterfaceC23546a) interfaceC42141hT5, this.f88829d));
        } else {
            this.f88638c.m32166W0(new C23760b(interfaceC42141hT5, this.f88829d));
        }
    }
}
