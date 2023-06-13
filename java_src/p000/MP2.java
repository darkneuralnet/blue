package p000;

import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;
/* renamed from: MP2 */
/* loaded from: classes.dex */
public class MP2<T> extends C49882uX2<T> {

    /* renamed from: a */
    public C47018ph5<LiveData<?>, C5290a<?>> f23105a = new C47018ph5<>();

    /* renamed from: MP2$a */
    /* loaded from: classes.dex */
    public static class C5290a<V> implements InterfaceC41056fe3<V> {

        /* renamed from: b */
        public final LiveData<V> f23106b;

        /* renamed from: c */
        public final InterfaceC41056fe3<? super V> f23107c;

        /* renamed from: d */
        public int f23108d = -1;

        public C5290a(LiveData<V> liveData, InterfaceC41056fe3<? super V> interfaceC41056fe3) {
            this.f23106b = liveData;
            this.f23107c = interfaceC41056fe3;
        }

        /* renamed from: a */
        public void m95313a() {
            this.f23106b.observeForever(this);
        }

        /* renamed from: b */
        public void m95312b() {
            this.f23106b.removeObserver(this);
        }

        @Override // p000.InterfaceC41056fe3
        public void onChanged(V v) {
            if (this.f23108d != this.f23106b.getVersion()) {
                this.f23108d = this.f23106b.getVersion();
                this.f23107c.onChanged(v);
            }
        }
    }

    /* renamed from: b */
    public <S> void mo95315b(LiveData<S> liveData, InterfaceC41056fe3<? super S> interfaceC41056fe3) {
        if (liveData != null) {
            C5290a<?> c5290a = new C5290a<>(liveData, interfaceC41056fe3);
            C5290a<?> mo18966h = this.f23105a.mo18966h(liveData, c5290a);
            if (mo18966h != null && mo18966h.f23107c != interfaceC41056fe3) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (mo18966h == null && hasActiveObservers()) {
                c5290a.m95313a();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }

    /* renamed from: c */
    public <S> void m95314c(LiveData<S> liveData) {
        C5290a<?> mo18965j = this.f23105a.mo18965j(liveData);
        if (mo18965j != null) {
            mo18965j.m95312b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, C5290a<?>>> it = this.f23105a.iterator();
        while (it.hasNext()) {
            it.next().getValue().m95313a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, C5290a<?>>> it = this.f23105a.iterator();
        while (it.hasNext()) {
            it.next().getValue().m95312b();
        }
    }
}
