package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
/* renamed from: io.reactivex.D */
/* loaded from: classes6.dex */
public interface InterfaceC23436D<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(InterfaceC23465c interfaceC23465c);
}
