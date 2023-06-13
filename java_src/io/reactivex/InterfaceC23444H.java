package io.reactivex;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23483f;
/* renamed from: io.reactivex.H */
/* loaded from: classes6.dex */
public interface InterfaceC23444H<T> {
    /* renamed from: a */
    void mo4878a(InterfaceC23483f interfaceC23483f);

    /* renamed from: b */
    void mo4877b(InterfaceC23465c interfaceC23465c);

    /* renamed from: c */
    boolean mo4876c(Throwable th);

    /* renamed from: e */
    boolean mo1769e();

    void onError(Throwable th);

    void onSuccess(T t);
}
