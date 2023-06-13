package p000;

import com.google.android.gms.common.internal.Objects;
/* renamed from: Lk9 */
/* loaded from: classes5.dex */
public final class Lk9 {

    /* renamed from: a */
    public final DR7 f22014a;

    public /* synthetic */ Lk9(Ak9 ak9, Gk9 gk9) {
        DR7 dr7;
        dr7 = ak9.f1022a;
        this.f22014a = dr7;
    }

    @D18(zza = 1)
    /* renamed from: a */
    public final DR7 m96380a() {
        return this.f22014a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Lk9)) {
            return false;
        }
        return Objects.equal(this.f22014a, ((Lk9) obj).f22014a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f22014a);
    }
}
