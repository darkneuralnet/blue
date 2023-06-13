package com.uber.autodispose;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AutoDisposeObservable<T> extends Observable<T> implements ObservableSubscribeProxy<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f75518b;

    /* renamed from: c */
    public final InterfaceC23496h f75519c;

    public AutoDisposeObservable(InterfaceC23434B<T> interfaceC23434B, InterfaceC23496h interfaceC23496h) {
        this.f75518b = interfaceC23434B;
        this.f75519c = interfaceC23496h;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f75518b.subscribe(new AutoDisposingObserverImpl(this.f75519c, interfaceC23436D));
    }
}
