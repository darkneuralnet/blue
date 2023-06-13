package p000;

import java.util.Set;
/* renamed from: V96 */
/* loaded from: classes5.dex */
public final class V96 implements U96 {

    /* renamed from: a */
    public final Set<C35142Pc1> f38697a;

    /* renamed from: b */
    public final T96 f38698b;

    /* renamed from: c */
    public final Z96 f38699c;

    public V96(Set<C35142Pc1> set, T96 t96, Z96 z96) {
        this.f38697a = set;
        this.f38698b = t96;
        this.f38699c = z96;
    }

    @Override // p000.U96
    /* renamed from: a */
    public <T> R96<T> mo80270a(String str, Class<T> cls, C35142Pc1 c35142Pc1, C96<T, byte[]> c96) {
        if (this.f38697a.contains(c35142Pc1)) {
            return new X96(this.f38698b, str, c35142Pc1, c96, this.f38699c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c35142Pc1, this.f38697a));
    }

    @Override // p000.U96
    /* renamed from: b */
    public <T> R96<T> mo80269b(String str, Class<T> cls, C96<T, byte[]> c96) {
        return mo80270a(str, cls, C35142Pc1.m90060b("proto"), c96);
    }
}
