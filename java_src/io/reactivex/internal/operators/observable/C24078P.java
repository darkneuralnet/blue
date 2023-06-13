package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.observers.C23568m;
/* renamed from: io.reactivex.internal.operators.observable.P */
/* loaded from: classes6.dex */
public final class C24078P<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23484g<? super InterfaceC23465c> f89871c;

    /* renamed from: d */
    public final InterfaceC23478a f89872d;

    public C24078P(Observable<T> observable, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g, InterfaceC23478a interfaceC23478a) {
        super(observable);
        this.f89871c = interfaceC23484g;
        this.f89872d = interfaceC23478a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C23568m(interfaceC23436D, this.f89871c, this.f89872d));
    }
}
