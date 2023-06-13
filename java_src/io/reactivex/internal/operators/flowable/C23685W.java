package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscriptions.AbstractC24458b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.W */
/* loaded from: classes6.dex */
public final class C23685W extends AbstractC24490k<Integer> {

    /* renamed from: c */
    public final int f88606c;

    /* renamed from: d */
    public final int f88607d;

    /* renamed from: io.reactivex.internal.operators.flowable.W$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23686a extends AbstractC24458b<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b */
        public final int f88608b;

        /* renamed from: c */
        public int f88609c;

        /* renamed from: d */
        public volatile boolean f88610d;

        public AbstractC23686a(int i, int i2) {
            this.f88609c = i;
            this.f88608b = i2;
        }

        /* renamed from: a */
        public abstract void mo32862a();

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public final int mo31868b(int i) {
            return i & 1;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        /* renamed from: c */
        public final Integer poll() {
            int i = this.f88609c;
            if (i == this.f88608b) {
                return null;
            }
            this.f88609c = i + 1;
            return Integer.valueOf(i);
        }

        @Override // p000.InterfaceC46292oT5
        public final void cancel() {
            this.f88610d = true;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final void clear() {
            this.f88609c = this.f88608b;
        }

        /* renamed from: d */
        public abstract void mo32861d(long j);

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final boolean isEmpty() {
            return this.f88609c == this.f88608b;
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public final void mo21023o(long j) {
            if (EnumC24463g.m32287h(j) && C24468d.m32274a(this, j) == 0) {
                if (j == LongCompanionObject.MAX_VALUE) {
                    mo32862a();
                } else {
                    mo32861d(j);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.W$b */
    /* loaded from: classes6.dex */
    public static final class C23687b extends AbstractC23686a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e */
        public final InterfaceC23546a<? super Integer> f88611e;

        public C23687b(InterfaceC23546a<? super Integer> interfaceC23546a, int i, int i2) {
            super(i, i2);
            this.f88611e = interfaceC23546a;
        }

        @Override // io.reactivex.internal.operators.flowable.C23685W.AbstractC23686a
        /* renamed from: a */
        public void mo32862a() {
            int i = this.f88608b;
            InterfaceC23546a<? super Integer> interfaceC23546a = this.f88611e;
            for (int i2 = this.f88609c; i2 != i; i2++) {
                if (this.f88610d) {
                    return;
                }
                interfaceC23546a.mo32761h(Integer.valueOf(i2));
            }
            if (this.f88610d) {
                return;
            }
            interfaceC23546a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.C23685W.AbstractC23686a
        /* renamed from: d */
        public void mo32861d(long j) {
            int i = this.f88608b;
            int i2 = this.f88609c;
            InterfaceC23546a<? super Integer> interfaceC23546a = this.f88611e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j && i2 != i) {
                        if (this.f88610d) {
                            return;
                        }
                        if (interfaceC23546a.mo32761h(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    } else if (i2 == i) {
                        if (!this.f88610d) {
                            interfaceC23546a.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            this.f88609c = i2;
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.W$c */
    /* loaded from: classes6.dex */
    public static final class C23688c extends AbstractC23686a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e */
        public final InterfaceC42141hT5<? super Integer> f88612e;

        public C23688c(InterfaceC42141hT5<? super Integer> interfaceC42141hT5, int i, int i2) {
            super(i, i2);
            this.f88612e = interfaceC42141hT5;
        }

        @Override // io.reactivex.internal.operators.flowable.C23685W.AbstractC23686a
        /* renamed from: a */
        public void mo32862a() {
            int i = this.f88608b;
            InterfaceC42141hT5<? super Integer> interfaceC42141hT5 = this.f88612e;
            for (int i2 = this.f88609c; i2 != i; i2++) {
                if (this.f88610d) {
                    return;
                }
                interfaceC42141hT5.onNext(Integer.valueOf(i2));
            }
            if (this.f88610d) {
                return;
            }
            interfaceC42141hT5.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.C23685W.AbstractC23686a
        /* renamed from: d */
        public void mo32861d(long j) {
            int i = this.f88608b;
            int i2 = this.f88609c;
            InterfaceC42141hT5<? super Integer> interfaceC42141hT5 = this.f88612e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j && i2 != i) {
                        if (this.f88610d) {
                            return;
                        }
                        interfaceC42141hT5.onNext(Integer.valueOf(i2));
                        j2++;
                        i2++;
                    } else if (i2 == i) {
                        if (!this.f88610d) {
                            interfaceC42141hT5.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            this.f88609c = i2;
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public C23685W(int i, int i2) {
        this.f88606c = i;
        this.f88607d = i + i2;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super Integer> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            interfaceC42141hT5.mo31867a(new C23687b((InterfaceC23546a) interfaceC42141hT5, this.f88606c, this.f88607d));
        } else {
            interfaceC42141hT5.mo31867a(new C23688c(interfaceC42141hT5, this.f88606c, this.f88607d));
        }
    }
}
