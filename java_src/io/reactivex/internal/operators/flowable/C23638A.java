package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscriptions.AbstractC24458b;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import java.util.Iterator;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.A */
/* loaded from: classes6.dex */
public final class C23638A<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final Iterable<? extends T> f88463c;

    /* renamed from: io.reactivex.internal.operators.flowable.A$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23639a<T> extends AbstractC24458b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b */
        public Iterator<? extends T> f88464b;

        /* renamed from: c */
        public volatile boolean f88465c;

        /* renamed from: d */
        public boolean f88466d;

        public AbstractC23639a(Iterator<? extends T> it) {
            this.f88464b = it;
        }

        /* renamed from: a */
        public abstract void mo32891a();

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public final int mo31868b(int i) {
            return i & 1;
        }

        /* renamed from: c */
        public abstract void mo32890c(long j);

        @Override // p000.InterfaceC46292oT5
        public final void cancel() {
            this.f88465c = true;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final void clear() {
            this.f88464b = null;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f88464b;
            return it == null || !it.hasNext();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public final void mo21023o(long j) {
            if (EnumC24463g.m32287h(j) && C24468d.m32274a(this, j) == 0) {
                if (j == LongCompanionObject.MAX_VALUE) {
                    mo32891a();
                } else {
                    mo32890c(j);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final T poll() {
            Iterator<? extends T> it = this.f88464b;
            if (it == null) {
                return null;
            }
            if (!this.f88466d) {
                this.f88466d = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) C23544b.m32923e(this.f88464b.next(), "Iterator.next() returned a null value");
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.A$b */
    /* loaded from: classes6.dex */
    public static final class C23640b<T> extends AbstractC23639a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: e */
        public final InterfaceC23546a<? super T> f88467e;

        public C23640b(InterfaceC23546a<? super T> interfaceC23546a, Iterator<? extends T> it) {
            super(it);
            this.f88467e = interfaceC23546a;
        }

        @Override // io.reactivex.internal.operators.flowable.C23638A.AbstractC23639a
        /* renamed from: a */
        public void mo32891a() {
            Iterator<? extends T> it = this.f88464b;
            InterfaceC23546a<? super T> interfaceC23546a = this.f88467e;
            while (!this.f88465c) {
                try {
                    Object obj = (T) it.next();
                    if (this.f88465c) {
                        return;
                    }
                    if (obj == null) {
                        interfaceC23546a.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC23546a.mo32761h(obj);
                    if (this.f88465c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.f88465c) {
                                interfaceC23546a.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        interfaceC23546a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    interfaceC23546a.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23638A.AbstractC23639a
        /* renamed from: c */
        public void mo32890c(long j) {
            Iterator<? extends T> it = this.f88464b;
            InterfaceC23546a<? super T> interfaceC23546a = this.f88467e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.f88465c) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.f88465c) {
                                return;
                            }
                            if (obj == null) {
                                interfaceC23546a.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean mo32761h = interfaceC23546a.mo32761h(obj);
                            if (this.f88465c) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (!this.f88465c) {
                                        interfaceC23546a.onComplete();
                                        return;
                                    }
                                    return;
                                } else if (mo32761h) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                C23475a.m33009b(th);
                                interfaceC23546a.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C23475a.m33009b(th2);
                            interfaceC23546a.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.A$c */
    /* loaded from: classes6.dex */
    public static final class C23641c<T> extends AbstractC23639a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: e */
        public final InterfaceC42141hT5<? super T> f88468e;

        public C23641c(InterfaceC42141hT5<? super T> interfaceC42141hT5, Iterator<? extends T> it) {
            super(it);
            this.f88468e = interfaceC42141hT5;
        }

        @Override // io.reactivex.internal.operators.flowable.C23638A.AbstractC23639a
        /* renamed from: a */
        public void mo32891a() {
            Iterator<? extends T> it = this.f88464b;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88468e;
            while (!this.f88465c) {
                try {
                    Object obj = (T) it.next();
                    if (this.f88465c) {
                        return;
                    }
                    if (obj == null) {
                        interfaceC42141hT5.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC42141hT5.onNext(obj);
                    if (this.f88465c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.f88465c) {
                                interfaceC42141hT5.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        interfaceC42141hT5.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    interfaceC42141hT5.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23638A.AbstractC23639a
        /* renamed from: c */
        public void mo32890c(long j) {
            Iterator<? extends T> it = this.f88464b;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88468e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.f88465c) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.f88465c) {
                                return;
                            }
                            if (obj == null) {
                                interfaceC42141hT5.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            interfaceC42141hT5.onNext(obj);
                            if (this.f88465c) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (!this.f88465c) {
                                        interfaceC42141hT5.onComplete();
                                        return;
                                    }
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                C23475a.m33009b(th);
                                interfaceC42141hT5.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C23475a.m33009b(th2);
                            interfaceC42141hT5.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public C23638A(Iterable<? extends T> iterable) {
        this.f88463c = iterable;
    }

    /* renamed from: x1 */
    public static <T> void m32892x1(InterfaceC42141hT5<? super T> interfaceC42141hT5, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EnumC24460d.m32301a(interfaceC42141hT5);
            } else if (interfaceC42141hT5 instanceof InterfaceC23546a) {
                interfaceC42141hT5.mo31867a(new C23640b((InterfaceC23546a) interfaceC42141hT5, it));
            } else {
                interfaceC42141hT5.mo31867a(new C23641c(interfaceC42141hT5, it));
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC24460d.m32300c(th, interfaceC42141hT5);
        }
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        try {
            m32892x1(interfaceC42141hT5, this.f88463c.iterator());
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC24460d.m32300c(th, interfaceC42141hT5);
        }
    }
}
