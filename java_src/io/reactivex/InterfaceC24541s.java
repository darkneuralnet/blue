package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
/* renamed from: io.reactivex.s */
/* loaded from: classes6.dex */
public interface InterfaceC24541s<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(InterfaceC23465c interfaceC23465c);

    void onSuccess(T t);
}
