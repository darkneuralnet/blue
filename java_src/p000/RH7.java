package p000;

import java.util.Map;
import java.util.Set;
/* renamed from: RH7 */
/* loaded from: classes5.dex */
public abstract class RH7 implements InterfaceC41568gV7 {

    /* renamed from: b */
    public transient Set f31797b;

    /* renamed from: c */
    public transient Map f31798c;

    /* renamed from: b */
    abstract Map mo34273b();

    /* renamed from: c */
    abstract Set mo34272c();

    @Override // p000.InterfaceC41568gV7
    /* renamed from: e */
    public final Map mo39239e() {
        Map map = this.f31798c;
        if (map == null) {
            Map mo34273b = mo34273b();
            this.f31798c = mo34273b;
            return mo34273b;
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC41568gV7)) {
            return false;
        }
        return mo39239e().equals(((InterfaceC41568gV7) obj).mo39239e());
    }

    @Override // p000.InterfaceC41568gV7
    /* renamed from: f */
    public final Set mo39238f() {
        Set set = this.f31797b;
        if (set == null) {
            Set mo34272c = mo34272c();
            this.f31797b = mo34272c;
            return mo34272c;
        }
        return set;
    }

    public final int hashCode() {
        return mo39239e().hashCode();
    }

    public final String toString() {
        return mo39239e().toString();
    }
}
