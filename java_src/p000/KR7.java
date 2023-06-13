package p000;

import android.content.Context;
/* renamed from: KR7 */
/* loaded from: classes5.dex */
public final class KR7 extends AbstractC49887uX7 {

    /* renamed from: a */
    public final Context f19596a;

    /* renamed from: b */
    public final G08<AbstractC38891c08<MU7>> f19597b;

    public KR7(Context context, G08<AbstractC38891c08<MU7>> g08) {
        if (context != null) {
            this.f19596a = context;
            this.f19597b = g08;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override // p000.AbstractC49887uX7
    /* renamed from: a */
    public final Context mo10098a() {
        return this.f19596a;
    }

    @Override // p000.AbstractC49887uX7
    /* renamed from: b */
    public final G08<AbstractC38891c08<MU7>> mo10097b() {
        return this.f19597b;
    }

    public final boolean equals(Object obj) {
        G08<AbstractC38891c08<MU7>> g08;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC49887uX7) {
            AbstractC49887uX7 abstractC49887uX7 = (AbstractC49887uX7) obj;
            if (this.f19596a.equals(abstractC49887uX7.mo10098a()) && ((g08 = this.f19597b) != null ? g08.equals(abstractC49887uX7.mo10097b()) : abstractC49887uX7.mo10097b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f19596a.hashCode() ^ 1000003) * 1000003;
        G08<AbstractC38891c08<MU7>> g08 = this.f19597b;
        if (g08 == null) {
            hashCode = 0;
        } else {
            hashCode = g08.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19596a);
        String valueOf2 = String.valueOf(this.f19597b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
