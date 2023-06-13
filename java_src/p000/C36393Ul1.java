package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: Ul1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36393Ul1<K, V> extends C35925Sl1<K, V> implements InterfaceC37563Zl1<K, V> {
    public C36393Ul1(InterfaceC37423Yv5<K, V> interfaceC37423Yv5, IZ3<? super Map.Entry<K, V>> iz3) {
        super(interfaceC37423Yv5, iz3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C35925Sl1, p000.InterfaceC41581gX2
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((C36393Ul1<K, V>) obj);
    }

    @Override // p000.C35925Sl1, p000.AbstractC9263X0
    /* renamed from: t */
    public Set<Map.Entry<K, V>> mo74915i() {
        return C40052dw5.m43493b(mo72552a().mo24584b(), mo76375c());
    }

    @Override // p000.C35925Sl1, p000.InterfaceC37095Xl1
    /* renamed from: a */
    public InterfaceC37423Yv5<K, V> mo72552a() {
        return (InterfaceC37423Yv5) this.f34219g;
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo24584b() {
        return (Set) super.mo24584b();
    }

    @Override // p000.C35925Sl1, p000.InterfaceC41581gX2
    public Set<V> get(K k) {
        return (Set) super.get((C36393Ul1<K, V>) k);
    }
}
