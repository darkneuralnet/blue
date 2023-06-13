package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.ArrayDeque;
/* renamed from: io.reactivex.internal.operators.observable.r1 */
/* loaded from: classes6.dex */
public final class C24284r1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final int f90540c;

    /* renamed from: io.reactivex.internal.operators.observable.r1$a */
    /* loaded from: classes6.dex */
    public static final class C24285a<T> extends ArrayDeque<T> implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 7240042530241604978L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90541b;

        /* renamed from: c */
        public final int f90542c;

        /* renamed from: d */
        public InterfaceC23465c f90543d;

        /* renamed from: e */
        public volatile boolean f90544e;

        public C24285a(InterfaceC23436D<? super T> interfaceC23436D, int i) {
            this.f90541b = interfaceC23436D;
            this.f90542c = i;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90544e) {
                this.f90544e = true;
                this.f90543d.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90544e;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            InterfaceC23436D<? super T> interfaceC23436D = this.f90541b;
            while (!this.f90544e) {
                Object obj = (T) poll();
                if (obj == null) {
                    if (!this.f90544e) {
                        interfaceC23436D.onComplete();
                        return;
                    }
                    return;
                }
                interfaceC23436D.onNext(obj);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90541b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90542c == size()) {
                poll();
            }
            offer(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90543d, interfaceC23465c)) {
                this.f90543d = interfaceC23465c;
                this.f90541b.onSubscribe(this);
            }
        }
    }

    public C24284r1(InterfaceC23434B<T> interfaceC23434B, int i) {
        super(interfaceC23434B);
        this.f90540c = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24285a(interfaceC23436D, this.f90540c));
    }
}
