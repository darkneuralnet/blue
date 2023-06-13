package p000;
/* renamed from: Xk9 */
/* loaded from: classes5.dex */
public final class Xk9 extends AbstractC39956dm9 {

    /* renamed from: a */
    public String f43802a;

    /* renamed from: b */
    public boolean f43803b;

    /* renamed from: c */
    public int f43804c;

    /* renamed from: d */
    public byte f43805d;

    @Override // p000.AbstractC39956dm9
    /* renamed from: a */
    public final AbstractC39956dm9 mo43723a(boolean z) {
        this.f43803b = true;
        this.f43805d = (byte) (1 | this.f43805d);
        return this;
    }

    @Override // p000.AbstractC39956dm9
    /* renamed from: b */
    public final AbstractC39956dm9 mo43722b(int i) {
        this.f43804c = 1;
        this.f43805d = (byte) (this.f43805d | 2);
        return this;
    }

    @Override // p000.AbstractC39956dm9
    /* renamed from: c */
    public final AbstractC43514jm9 mo43721c() {
        String str;
        if (this.f43805d == 3 && (str = this.f43802a) != null) {
            return new C43504jl9(str, this.f43803b, this.f43804c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f43802a == null) {
            sb.append(" libraryName");
        }
        if ((this.f43805d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f43805d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final AbstractC39956dm9 m76458d(String str) {
        this.f43802a = str;
        return this;
    }
}
