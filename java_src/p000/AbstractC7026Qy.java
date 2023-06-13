package p000;

import java.util.Arrays;
import java.util.List;
/* renamed from: Qy */
/* loaded from: classes2.dex */
public abstract class AbstractC7026Qy<V, O> implements InterfaceC2901Ge<V, O> {

    /* renamed from: a */
    public final List<C41125fl2<V>> f31316a;

    public AbstractC7026Qy(List<C41125fl2<V>> list) {
        this.f31316a = list;
    }

    @Override // p000.InterfaceC2901Ge
    /* renamed from: b */
    public List<C41125fl2<V>> mo950b() {
        return this.f31316a;
    }

    @Override // p000.InterfaceC2901Ge
    public boolean isStatic() {
        if (this.f31316a.isEmpty()) {
            return true;
        }
        return this.f31316a.size() == 1 && this.f31316a.get(0).m40899i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f31316a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f31316a.toArray()));
        }
        return sb.toString();
    }
}
