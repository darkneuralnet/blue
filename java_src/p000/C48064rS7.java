package p000;
/* renamed from: rS7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48064rS7 extends AT7 {

    /* renamed from: b */
    public final ZP8<Au9> f107116b;

    /* renamed from: c */
    public final C48930su9 f107117c;

    public C48064rS7(ZP8<Au9> zp8, C48930su9 c48930su9) {
        if (zp8 != null) {
            this.f107116b = zp8;
            if (c48930su9 != null) {
                this.f107117c = c48930su9;
                return;
            }
            throw new NullPointerException("Null mobileDynamicChallengeSignals");
        }
        throw new NullPointerException("Null requestedSignals");
    }

    @Override // p000.AT7
    /* renamed from: a */
    public final ZP8<Au9> mo15930a() {
        return this.f107116b;
    }

    @Override // p000.AT7
    /* renamed from: b */
    public final C48930su9 mo15929b() {
        return this.f107117c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AT7) {
            AT7 at7 = (AT7) obj;
            if (this.f107116b.equals(at7.mo15930a()) && this.f107117c.equals(at7.mo15929b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f107116b.hashCode() ^ 1000003) * 1000003) ^ this.f107117c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f107116b);
        String valueOf2 = String.valueOf(this.f107117c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 72 + valueOf2.length());
        sb.append("OutOfGuardsSignalData{requestedSignals=");
        sb.append(valueOf);
        sb.append(", mobileDynamicChallengeSignals=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
