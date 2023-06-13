package p000;
/* renamed from: i80  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42538i80<K, V> extends C28385so<K, V> {

    /* renamed from: l */
    public int f86797l;

    @Override // p000.NA5, java.util.Map
    public void clear() {
        this.f86797l = 0;
        super.clear();
    }

    @Override // p000.NA5, java.util.Map
    public int hashCode() {
        if (this.f86797l == 0) {
            this.f86797l = super.hashCode();
        }
        return this.f86797l;
    }

    @Override // p000.NA5
    /* renamed from: j */
    public void mo34406j(NA5<? extends K, ? extends V> na5) {
        this.f86797l = 0;
        super.mo34406j(na5);
    }

    @Override // p000.NA5
    /* renamed from: k */
    public V mo34405k(int i) {
        this.f86797l = 0;
        return (V) super.mo34405k(i);
    }

    @Override // p000.NA5
    /* renamed from: l */
    public V mo34404l(int i, V v) {
        this.f86797l = 0;
        return (V) super.mo34404l(i, v);
    }

    @Override // p000.NA5, java.util.Map
    public V put(K k, V v) {
        this.f86797l = 0;
        return (V) super.put(k, v);
    }
}
