package com.uber.rxdogtag;

import com.uber.rxdogtag.C19549M;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.InterfaceC24502f;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DogTagObserver<T> implements InterfaceC23436D<T>, InterfaceC24502f {
    private final C19549M.C19551b config;
    private final InterfaceC23436D<T> delegate;

    /* renamed from: t */
    private final Throwable f75585t = new Throwable();

    public DogTagObserver(C19549M.C19551b c19551b, InterfaceC23436D<T> interfaceC23436D) {
        this.config = c19551b;
        this.delegate = interfaceC23436D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        C19549M.m45134w(this.config, this.f75585t, th, "onComplete");
    }

    private /* synthetic */ void lambda$onError$4(Throwable th) {
        C19549M.m45134w(this.config, this.f75585t, th, "onError");
    }

    private /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$2(Throwable th) {
        C19549M.m45134w(this.config, this.f75585t, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$3(Object obj) {
        this.delegate.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        C19549M.m45134w(this.config, this.f75585t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(InterfaceC23465c interfaceC23465c) {
        this.delegate.onSubscribe(interfaceC23465c);
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        InterfaceC23436D<T> interfaceC23436D = this.delegate;
        if ((interfaceC23436D instanceof InterfaceC24502f) && ((InterfaceC24502f) interfaceC23436D).hasCustomOnError()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (this.config.f75604e) {
            C19549M.InterfaceC19554d interfaceC19554d = new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.o
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onComplete$6((Throwable) obj);
                }
            };
            final InterfaceC23436D<T> interfaceC23436D = this.delegate;
            Objects.requireNonNull(interfaceC23436D);
            C19549M.m45144m(interfaceC19554d, new Runnable() { // from class: com.uber.rxdogtag.p
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC23436D.this.onComplete();
                }
            });
            return;
        }
        this.delegate.onComplete();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        C19549M.m45134w(this.config, this.f75585t, th, null);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(final T t) {
        if (this.config.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.q
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onNext$2((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.r
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagObserver.this.lambda$onNext$3(t);
                }
            });
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(final InterfaceC23465c interfaceC23465c) {
        if (this.config.f75604e) {
            C19549M.m45144m(new C19549M.InterfaceC19554d() { // from class: com.uber.rxdogtag.m
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19554d
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: com.uber.rxdogtag.n
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagObserver.this.lambda$onSubscribe$1(interfaceC23465c);
                }
            });
        } else {
            this.delegate.onSubscribe(interfaceC23465c);
        }
    }
}
