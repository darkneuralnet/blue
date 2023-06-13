package p000;
/* renamed from: X19 */
/* loaded from: classes5.dex */
public final class X19 extends B29 {

    /* renamed from: a */
    public String f42538a;

    /* renamed from: b */
    public boolean f42539b;

    /* renamed from: c */
    public int f42540c;

    /* renamed from: d */
    public byte f42541d;

    @Override // p000.B29
    /* renamed from: a */
    public final B29 mo77539a(boolean z) {
        this.f42539b = true;
        this.f42541d = (byte) (1 | this.f42541d);
        return this;
    }

    @Override // p000.B29
    /* renamed from: b */
    public final B29 mo77538b(int i) {
        this.f42540c = 1;
        this.f42541d = (byte) (this.f42541d | 2);
        return this;
    }

    @Override // p000.B29
    /* renamed from: c */
    public final L29 mo77537c() {
        String str;
        if (this.f42541d == 3 && (str = this.f42538a) != null) {
            return new C47824r29(str, this.f42539b, this.f42540c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f42538a == null) {
            sb.append(" libraryName");
        }
        if ((this.f42541d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f42541d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final B29 m77536d(String str) {
        this.f42538a = str;
        return this;
    }
}
