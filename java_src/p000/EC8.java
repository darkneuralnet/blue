package p000;
/* renamed from: EC8 */
/* loaded from: classes6.dex */
public class EC8 {

    /* renamed from: a */
    public final NA5 f7106a;

    /* renamed from: b */
    public boolean f7107b = false;

    /* renamed from: a */
    public final EC8 m109303a() {
        if (!this.f7107b) {
            this.f7107b = true;
            return this;
        }
        throw new IllegalStateException("Already frozen");
    }

    /* renamed from: b */
    public final boolean m109302b() {
        return this.f7107b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (EC8 ec8 = this; ec8 != null; ec8 = null) {
            for (int i = 0; i < ec8.f7106a.size(); i++) {
                sb.append(this.f7106a.m94263m(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
