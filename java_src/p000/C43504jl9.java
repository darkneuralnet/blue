package p000;
/* renamed from: jl9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43504jl9 extends AbstractC43514jm9 {

    /* renamed from: a */
    public final String f93304a;

    /* renamed from: b */
    public final boolean f93305b;

    /* renamed from: c */
    public final int f93306c;

    public /* synthetic */ C43504jl9(String str, boolean z, int i, C39947dl9 c39947dl9) {
        this.f93304a = str;
        this.f93305b = z;
        this.f93306c = i;
    }

    @Override // p000.AbstractC43514jm9
    /* renamed from: a */
    public final int mo29940a() {
        return this.f93306c;
    }

    @Override // p000.AbstractC43514jm9
    /* renamed from: b */
    public final String mo29939b() {
        return this.f93304a;
    }

    @Override // p000.AbstractC43514jm9
    /* renamed from: c */
    public final boolean mo29938c() {
        return this.f93305b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC43514jm9) {
            AbstractC43514jm9 abstractC43514jm9 = (AbstractC43514jm9) obj;
            if (this.f93304a.equals(abstractC43514jm9.mo29939b()) && this.f93305b == abstractC43514jm9.mo29938c() && this.f93306c == abstractC43514jm9.mo29940a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f93304a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f93305b ? 1237 : 1231)) * 1000003) ^ this.f93306c;
    }

    public final String toString() {
        String str = this.f93304a;
        boolean z = this.f93305b;
        int i = this.f93306c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
