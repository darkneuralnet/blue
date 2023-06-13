package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.plugins.C24508a;
/* renamed from: eN4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40307eN4<T> extends Observable<C39104cN4<T>> {

    /* renamed from: b */
    public final Observable<HM4<T>> f78286b;

    /* renamed from: eN4$a */
    /* loaded from: classes8.dex */
    public static class C20013a<R> implements InterfaceC23436D<HM4<R>> {

        /* renamed from: b */
        public final InterfaceC23436D<? super C39104cN4<R>> f78287b;

        public C20013a(InterfaceC23436D<? super C39104cN4<R>> interfaceC23436D) {
            this.f78287b = interfaceC23436D;
        }

        @Override // io.reactivex.InterfaceC23436D
        /* renamed from: a */
        public void onNext(HM4<R> hm4) {
            this.f78287b.onNext(C39104cN4.m61510b(hm4));
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f78287b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            try {
                this.f78287b.onNext(C39104cN4.m61511a(th));
                this.f78287b.onComplete();
            } catch (Throwable th2) {
                try {
                    this.f78287b.onError(th2);
                } catch (Throwable th3) {
                    C23475a.m33009b(th3);
                    C24508a.m31988u(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f78287b.onSubscribe(interfaceC23465c);
        }
    }

    public C40307eN4(Observable<HM4<T>> observable) {
        this.f78286b = observable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super C39104cN4<T>> interfaceC23436D) {
        this.f78286b.subscribe(new C20013a(interfaceC23436D));
    }
}
