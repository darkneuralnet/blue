package io.reactivex.internal.observers;
/* renamed from: io.reactivex.internal.observers.f */
/* loaded from: classes6.dex */
public final class C23561f<T> extends AbstractC23560e<T> {
    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (this.f88294b == null) {
            this.f88295c = th;
        }
        countDown();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (this.f88294b == null) {
            this.f88294b = t;
            this.f88296d.dispose();
            countDown();
        }
    }
}
