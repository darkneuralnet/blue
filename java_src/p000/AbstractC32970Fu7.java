package p000;

import java.util.Map;
import java.util.Set;
/* renamed from: Fu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC32970Fu7 implements MQ7 {

    /* renamed from: b */
    public transient Set f10508b;

    /* renamed from: c */
    public transient Map f10509c;

    /* renamed from: a */
    abstract Map mo62195a();

    /* renamed from: b */
    abstract Set mo62194b();

    @Override // p000.MQ7
    /* renamed from: d */
    public final Map mo95304d() {
        Map map = this.f10509c;
        if (map == null) {
            Map mo62195a = mo62195a();
            this.f10509c = mo62195a;
            return mo62195a;
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MQ7)) {
            return false;
        }
        return mo95304d().equals(((MQ7) obj).mo95304d());
    }

    @Override // p000.MQ7
    /* renamed from: h */
    public final Set mo95303h() {
        Set set = this.f10508b;
        if (set == null) {
            Set mo62194b = mo62194b();
            this.f10508b = mo62194b;
            return mo62194b;
        }
        return set;
    }

    public final int hashCode() {
        return mo95304d().hashCode();
    }

    public final String toString() {
        return ((C36399Ul7) mo95304d()).f37957e.toString();
    }
}
