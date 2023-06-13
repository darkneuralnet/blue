package p000;

import java.io.Serializable;
/* renamed from: SY1 */
/* loaded from: classes6.dex */
public class SY1<K, V> extends AbstractC5804O0<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final K f33866b;

    /* renamed from: c */
    public final V f33867c;

    public SY1(K k, V v) {
        this.f33866b = k;
        this.f33867c = v;
    }

    @Override // p000.AbstractC5804O0, java.util.Map.Entry
    public final K getKey() {
        return this.f33866b;
    }

    @Override // p000.AbstractC5804O0, java.util.Map.Entry
    public final V getValue() {
        return this.f33867c;
    }

    @Override // p000.AbstractC5804O0, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
