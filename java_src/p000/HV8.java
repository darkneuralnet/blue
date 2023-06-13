package p000;
/* renamed from: HV8 */
/* loaded from: classes5.dex */
public final class HV8 extends AbstractC43950kW8 {

    /* renamed from: a */
    public String f13478a;

    /* renamed from: b */
    public boolean f13479b;

    /* renamed from: c */
    public int f13480c;

    /* renamed from: d */
    public byte f13481d;

    @Override // p000.AbstractC43950kW8
    /* renamed from: a */
    public final AbstractC43950kW8 mo28874a(boolean z) {
        this.f13479b = true;
        this.f13481d = (byte) (1 | this.f13481d);
        return this;
    }

    @Override // p000.AbstractC43950kW8
    /* renamed from: b */
    public final AbstractC43950kW8 mo28873b(int i) {
        this.f13480c = 1;
        this.f13481d = (byte) (this.f13481d | 2);
        return this;
    }

    @Override // p000.AbstractC43950kW8
    /* renamed from: c */
    public final AbstractC51064wW8 mo28872c() {
        String str;
        if (this.f13481d == 3 && (str = this.f13478a) != null) {
            return new C38003aW8(str, this.f13479b, this.f13480c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13478a == null) {
            sb.append(" libraryName");
        }
        if ((this.f13481d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f13481d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final AbstractC43950kW8 m103803d(String str) {
        this.f13478a = "optional-module-face";
        return this;
    }
}
