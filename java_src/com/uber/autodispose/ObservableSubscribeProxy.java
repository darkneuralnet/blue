package com.uber.autodispose;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
/* loaded from: classes7.dex */
public interface ObservableSubscribeProxy<T> {
    InterfaceC23465c subscribe();

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g);

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2);

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a);

    void subscribe(InterfaceC23436D<? super T> interfaceC23436D);

    <E extends InterfaceC23436D<? super T>> E subscribeWith(E e);
}
