package com.uber.autodispose;

import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23484g;
/* loaded from: classes7.dex */
public interface SingleSubscribeProxy<T> {
    /* renamed from: a */
    void mo45205a(InterfaceC23445I<? super T> interfaceC23445I);

    /* renamed from: b */
    InterfaceC23465c mo45204b(InterfaceC23479b<? super T, ? super Throwable> interfaceC23479b);

    InterfaceC23465c subscribe();

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g);

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2);
}
