package p000;

import java.util.Map;
import java.util.Set;
/* renamed from: qw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC47765qw9 implements InterfaceC52716zI7 {

    /* renamed from: b */
    public transient Set f106108b;

    /* renamed from: c */
    public transient Map f106109c;

    /* renamed from: a */
    abstract Map mo16771a();

    /* renamed from: b */
    abstract Set mo16770b();

    @Override // p000.InterfaceC52716zI7
    /* renamed from: d */
    public final Map mo1546d() {
        Map map = this.f106109c;
        if (map == null) {
            Map mo16771a = mo16771a();
            this.f106109c = mo16771a;
            return mo16771a;
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC52716zI7)) {
            return false;
        }
        return mo1546d().equals(((InterfaceC52716zI7) obj).mo1546d());
    }

    @Override // p000.InterfaceC52716zI7
    /* renamed from: h */
    public final Set mo1545h() {
        Set set = this.f106108b;
        if (set == null) {
            Set mo16770b = mo16770b();
            this.f106108b = mo16770b;
            return mo16770b;
        }
        return set;
    }

    public final int hashCode() {
        return mo1546d().hashCode();
    }

    public final String toString() {
        return ((I49) mo1546d()).f14460e.toString();
    }
}
