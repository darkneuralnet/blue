package io.reactivex.internal.util;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24494o;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.util.h */
/* loaded from: classes8.dex */
public enum EnumC24472h implements InterfaceC24494o<Object>, InterfaceC23436D<Object>, InterfaceC24541s<Object>, InterfaceC23445I<Object>, InterfaceC23476f, InterfaceC46292oT5, InterfaceC23465c {
    INSTANCE;

    /* renamed from: b */
    public static <T> InterfaceC23436D<T> m32265b() {
        return INSTANCE;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        interfaceC46292oT5.cancel();
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return true;
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        C24508a.m31988u(th);
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        interfaceC23465c.dispose();
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSuccess(Object obj) {
    }
}
