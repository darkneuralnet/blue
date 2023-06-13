package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
/* renamed from: io.reactivex.I */
/* loaded from: classes6.dex */
public interface InterfaceC23445I<T> {
    void onError(Throwable th);

    void onSubscribe(InterfaceC23465c interfaceC23465c);

    void onSuccess(T t);
}
