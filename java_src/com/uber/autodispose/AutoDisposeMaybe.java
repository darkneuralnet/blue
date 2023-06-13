package com.uber.autodispose;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AutoDisposeMaybe<T> extends AbstractC24507p<T> implements MaybeSubscribeProxy<T> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f75516b;

    /* renamed from: c */
    public final InterfaceC23496h f75517c;

    public AutoDisposeMaybe(InterfaceC24574u<T> interfaceC24574u, InterfaceC23496h interfaceC23496h) {
        this.f75516b = interfaceC24574u;
        this.f75517c = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f75516b.mo31865a(new AutoDisposingMaybeObserverImpl(this.f75517c, interfaceC24541s));
    }
}
