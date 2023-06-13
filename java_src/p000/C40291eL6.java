package p000;

import java.util.Map;
/* renamed from: eL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40291eL6 extends AbstractC7923To {

    /* renamed from: a */
    public final long f78252a;

    /* renamed from: b */
    public final Map<String, AbstractC7546So> f78253b;

    public C40291eL6(long j, Map<String, AbstractC7546So> map) {
        this.f78252a = j;
        this.f78253b = map;
    }

    @Override // p000.AbstractC7923To
    /* renamed from: e */
    public final Map<String, AbstractC7546So> mo43013e() {
        return this.f78253b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7923To) {
            AbstractC7923To abstractC7923To = (AbstractC7923To) obj;
            if (this.f78252a == abstractC7923To.mo43012f() && this.f78253b.equals(abstractC7923To.mo43013e())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC7923To
    /* renamed from: f */
    public final long mo43012f() {
        return this.f78252a;
    }

    public final int hashCode() {
        long j = this.f78252a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f78253b.hashCode();
    }

    public final String toString() {
        long j = this.f78252a;
        String valueOf = String.valueOf(this.f78253b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
