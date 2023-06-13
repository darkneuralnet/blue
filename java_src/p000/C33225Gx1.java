package p000;

import androidx.lifecycle.LiveData;
/* renamed from: Gx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33225Gx1<T> extends MP2<T> {

    /* renamed from: b */
    public LiveData<T> f12656b;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public void m104569d(LiveData<T> liveData) {
        LiveData liveData2 = (LiveData<T>) this.f12656b;
        if (liveData2 != null) {
            super.m95314c(liveData2);
        }
        this.f12656b = liveData;
        super.mo95315b(liveData, new InterfaceC41056fe3() { // from class: Fx1
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                C33225Gx1.this.setValue(obj);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        LiveData<T> liveData = this.f12656b;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }
}
