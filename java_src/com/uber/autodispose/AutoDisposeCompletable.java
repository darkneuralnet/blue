package com.uber.autodispose;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AutoDisposeCompletable extends AbstractC23461c implements CompletableSubscribeProxy {

    /* renamed from: b */
    public final AbstractC23461c f75512b;

    /* renamed from: c */
    public final InterfaceC23496h f75513c;

    public AutoDisposeCompletable(AbstractC23461c abstractC23461c, InterfaceC23496h interfaceC23496h) {
        this.f75512b = abstractC23461c;
        this.f75513c = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f75512b.mo33003g(new AutoDisposingCompletableObserverImpl(this.f75513c, interfaceC23476f));
    }
}
