package com.uber.autodispose;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AutoDisposeSingle<T> extends AbstractC23442F<T> implements SingleSubscribeProxy<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f75523b;

    /* renamed from: c */
    public final InterfaceC23496h f75524c;

    public AutoDisposeSingle(InterfaceC23447K<T> interfaceC23447K, InterfaceC23496h interfaceC23496h) {
        this.f75523b = interfaceC23447K;
        this.f75524c = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f75523b.mo33096a(new AutoDisposingSingleObserverImpl(this.f75524c, interfaceC23445I));
    }
}
