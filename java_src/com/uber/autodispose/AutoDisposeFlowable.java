package com.uber.autodispose;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23496h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AutoDisposeFlowable<T> extends AbstractC24490k<T> implements FlowableSubscribeProxy<T> {

    /* renamed from: c */
    public final InterfaceC45761na4<T> f75514c;

    /* renamed from: d */
    public final InterfaceC23496h f75515d;

    public AutoDisposeFlowable(InterfaceC45761na4<T> interfaceC45761na4, InterfaceC23496h interfaceC23496h) {
        this.f75514c = interfaceC45761na4;
        this.f75515d = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f75514c.mo23497c(new AutoDisposingSubscriberImpl(this.f75515d, interfaceC42141hT5));
    }
}
