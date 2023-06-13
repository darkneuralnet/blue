package com.uber.autodispose;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
/* loaded from: classes7.dex */
public interface MaybeSubscribeProxy<T> {
    InterfaceC23465c subscribe();

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g);

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2);

    InterfaceC23465c subscribe(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a);
}
