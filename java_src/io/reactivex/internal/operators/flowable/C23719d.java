package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.C24462f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.flowable.d */
/* loaded from: classes6.dex */
public final class C23719d<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final InterfaceC45761na4<? extends T>[] f88738c;

    /* renamed from: d */
    public final boolean f88739d;

    /* renamed from: io.reactivex.internal.operators.flowable.d$a */
    /* loaded from: classes6.dex */
    public static final class C23720a<T> extends C24462f implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -8158322871608889516L;

        /* renamed from: j */
        public final InterfaceC42141hT5<? super T> f88740j;

        /* renamed from: k */
        public final InterfaceC45761na4<? extends T>[] f88741k;

        /* renamed from: l */
        public final boolean f88742l;

        /* renamed from: m */
        public final AtomicInteger f88743m;

        /* renamed from: n */
        public int f88744n;

        /* renamed from: o */
        public List<Throwable> f88745o;

        /* renamed from: p */
        public long f88746p;

        public C23720a(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, boolean z, InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(false);
            this.f88740j = interfaceC42141hT5;
            this.f88741k = interfaceC45761na4Arr;
            this.f88742l = z;
            this.f88743m = new AtomicInteger();
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            m32295f(interfaceC46292oT5);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88743m.getAndIncrement() == 0) {
                InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr = this.f88741k;
                int length = interfaceC45761na4Arr.length;
                int i = this.f88744n;
                while (i != length) {
                    InterfaceC45761na4<? extends T> interfaceC45761na4 = interfaceC45761na4Arr[i];
                    if (interfaceC45761na4 == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.f88742l) {
                            List list = this.f88745o;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.f88745o = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.f88740j.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.f88746p;
                        if (j != 0) {
                            this.f88746p = 0L;
                            m32296e(j);
                        }
                        interfaceC45761na4.mo23497c(this);
                        i++;
                        this.f88744n = i;
                        if (this.f88743m.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.f88745o;
                if (list2 != null) {
                    if (list2.size() == 1) {
                        this.f88740j.onError(list2.get(0));
                        return;
                    } else {
                        this.f88740j.onError(new CompositeException(list2));
                        return;
                    }
                }
                this.f88740j.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88742l) {
                List list = this.f88745o;
                if (list == null) {
                    list = new ArrayList((this.f88741k.length - this.f88744n) + 1);
                    this.f88745o = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.f88740j.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88746p++;
            this.f88740j.onNext(t);
        }
    }

    public C23719d(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, boolean z) {
        this.f88738c = interfaceC45761na4Arr;
        this.f88739d = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C23720a c23720a = new C23720a(this.f88738c, this.f88739d, interfaceC42141hT5);
        interfaceC42141hT5.mo31867a(c23720a);
        c23720a.onComplete();
    }
}
