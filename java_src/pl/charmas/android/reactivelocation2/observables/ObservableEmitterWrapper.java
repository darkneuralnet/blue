package pl.charmas.android.reactivelocation2.observables;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24578y;
import io.reactivex.disposables.InterfaceC23465c;
/* loaded from: classes8.dex */
public class ObservableEmitterWrapper<T> implements InterfaceC23436D<T> {
    private final InterfaceC24578y<T> emitter;

    public ObservableEmitterWrapper(InterfaceC24578y<T> interfaceC24578y) {
        this.emitter = interfaceC24578y;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (!this.emitter.mo1769e()) {
            this.emitter.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (!this.emitter.mo1769e()) {
            this.emitter.onError(th);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (!this.emitter.mo1769e()) {
            this.emitter.onNext(t);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
    }
}
