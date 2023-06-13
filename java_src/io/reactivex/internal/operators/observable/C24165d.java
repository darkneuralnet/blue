package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.observers.AbstractC24498b;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: io.reactivex.internal.operators.observable.d */
/* loaded from: classes6.dex */
public final class C24165d<T> implements Iterable<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90135b;

    /* renamed from: c */
    public final T f90136c;

    /* renamed from: io.reactivex.internal.operators.observable.d$a */
    /* loaded from: classes6.dex */
    public static final class C24166a<T> extends AbstractC24498b<T> {

        /* renamed from: c */
        public volatile Object f90137c;

        /* renamed from: io.reactivex.internal.operators.observable.d$a$a */
        /* loaded from: classes6.dex */
        public final class C24167a implements Iterator<T> {

            /* renamed from: b */
            public Object f90138b;

            public C24167a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = C24166a.this.f90137c;
                this.f90138b = obj;
                return !EnumC24479n.m32238j(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f90138b == null) {
                        this.f90138b = C24166a.this.f90137c;
                    }
                    if (!EnumC24479n.m32238j(this.f90138b)) {
                        if (!EnumC24479n.m32237k(this.f90138b)) {
                            return (T) EnumC24479n.m32239i(this.f90138b);
                        }
                        throw C24475k.m32256e(EnumC24479n.m32240h(this.f90138b));
                    }
                    throw new NoSuchElementException();
                } finally {
                    this.f90138b = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C24166a(T t) {
            this.f90137c = EnumC24479n.m32236l(t);
        }

        /* renamed from: b */
        public C24166a<T>.C24167a m32525b() {
            return new C24167a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90137c = EnumC24479n.m32243e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90137c = EnumC24479n.m32241g(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90137c = EnumC24479n.m32236l(t);
        }
    }

    public C24165d(InterfaceC23434B<T> interfaceC23434B, T t) {
        this.f90135b = interfaceC23434B;
        this.f90136c = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C24166a c24166a = new C24166a(this.f90136c);
        this.f90135b.subscribe(c24166a);
        return c24166a.m32525b();
    }
}
