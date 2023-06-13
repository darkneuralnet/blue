package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.plugins.C24508a;
import retrofit2.adapter.rxjava2.HttpException;
/* renamed from: RY */
/* loaded from: classes8.dex */
public final class C7189RY<T> extends Observable<T> {

    /* renamed from: b */
    public final Observable<HM4<T>> f32159b;

    /* renamed from: RY$a */
    /* loaded from: classes8.dex */
    public static class C7190a<R> implements InterfaceC23436D<HM4<R>> {

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f32160b;

        /* renamed from: c */
        public boolean f32161c;

        public C7190a(InterfaceC23436D<? super R> interfaceC23436D) {
            this.f32160b = interfaceC23436D;
        }

        @Override // io.reactivex.InterfaceC23436D
        /* renamed from: a */
        public void onNext(HM4<R> hm4) {
            if (hm4.m103939f()) {
                this.f32160b.onNext(hm4.m103944a());
                return;
            }
            this.f32161c = true;
            HttpException httpException = new HttpException(hm4);
            try {
                this.f32160b.onError(httpException);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(new CompositeException(httpException, th));
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f32161c) {
                this.f32160b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (!this.f32161c) {
                this.f32160b.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C24508a.m31988u(assertionError);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f32160b.onSubscribe(interfaceC23465c);
        }
    }

    public C7189RY(Observable<HM4<T>> observable) {
        this.f32159b = observable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f32159b.subscribe(new C7190a(interfaceC23436D));
    }
}
