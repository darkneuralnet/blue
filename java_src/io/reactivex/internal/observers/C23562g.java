package io.reactivex.internal.observers;
/* renamed from: io.reactivex.internal.observers.g */
/* loaded from: classes6.dex */
public final class C23562g<T> extends AbstractC23560e<T> {
    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        this.f88294b = null;
        this.f88295c = th;
        countDown();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        this.f88294b = t;
    }
}
