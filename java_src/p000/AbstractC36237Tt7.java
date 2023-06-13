package p000;

import java.util.Map;
import java.util.Set;
/* renamed from: Tt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36237Tt7 implements InterfaceC38559bS7 {

    /* renamed from: b */
    public transient Set f36420b;

    /* renamed from: c */
    public transient Map f36421c;

    /* renamed from: b */
    abstract Map mo74090b();

    /* renamed from: c */
    abstract Set mo74089c();

    @Override // p000.InterfaceC38559bS7
    /* renamed from: e */
    public final Map mo64523e() {
        Map map = this.f36421c;
        if (map == null) {
            Map mo74090b = mo74090b();
            this.f36421c = mo74090b;
            return mo74090b;
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC38559bS7)) {
            return false;
        }
        return mo64523e().equals(((InterfaceC38559bS7) obj).mo64523e());
    }

    @Override // p000.InterfaceC38559bS7
    /* renamed from: f */
    public final Set mo64522f() {
        Set set = this.f36420b;
        if (set == null) {
            Set mo74089c = mo74089c();
            this.f36420b = mo74089c;
            return mo74089c;
        }
        return set;
    }

    public final int hashCode() {
        return mo64523e().hashCode();
    }

    public final String toString() {
        return mo64523e().toString();
    }
}
