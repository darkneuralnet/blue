package p000;
/* renamed from: HS7 */
/* loaded from: classes6.dex */
public final class HS7 extends XT7 {

    /* renamed from: b */
    public final AbstractC50417vQ8<Integer, AbstractC45836nh9> f13416b;

    /* renamed from: c */
    public final C51301wu9 f13417c;

    public HS7(AbstractC50417vQ8<Integer, AbstractC45836nh9> abstractC50417vQ8, C51301wu9 c51301wu9) {
        this.f13416b = abstractC50417vQ8;
        if (c51301wu9 != null) {
            this.f13417c = c51301wu9;
            return;
        }
        throw new NullPointerException("Null mobileDynamicChallengeSignalsResults");
    }

    @Override // p000.XT7
    /* renamed from: a */
    public final AbstractC50417vQ8<Integer, AbstractC45836nh9> mo76968a() {
        return this.f13416b;
    }

    @Override // p000.XT7
    /* renamed from: b */
    public final C51301wu9 mo76967b() {
        return this.f13417c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof XT7) {
            XT7 xt7 = (XT7) obj;
            if (this.f13416b.equals(xt7.mo76968a()) && this.f13417c.equals(xt7.mo76967b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13416b.hashCode() ^ 1000003) * 1000003) ^ this.f13417c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13416b);
        String valueOf2 = String.valueOf(this.f13417c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 78 + valueOf2.length());
        sb.append("OutOfGuardsSignalResults{signalValues=");
        sb.append(valueOf);
        sb.append(", mobileDynamicChallengeSignalsResults=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
