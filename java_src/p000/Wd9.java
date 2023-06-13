package p000;
/* renamed from: Wd9 */
/* loaded from: classes5.dex */
public final class Wd9 extends AbstractC40479ef9 {

    /* renamed from: a */
    public String f41423a;

    /* renamed from: b */
    public boolean f41424b;

    /* renamed from: c */
    public int f41425c;

    /* renamed from: d */
    public byte f41426d;

    @Override // p000.AbstractC40479ef9
    /* renamed from: a */
    public final AbstractC40479ef9 mo42641a(boolean z) {
        this.f41424b = true;
        this.f41426d = (byte) (1 | this.f41426d);
        return this;
    }

    @Override // p000.AbstractC40479ef9
    /* renamed from: b */
    public final AbstractC40479ef9 mo42640b(int i) {
        this.f41425c = 1;
        this.f41426d = (byte) (this.f41426d | 2);
        return this;
    }

    @Override // p000.AbstractC40479ef9
    /* renamed from: c */
    public final AbstractC45223mf9 mo42639c() {
        String str;
        if (this.f41426d == 3 && (str = this.f41423a) != null) {
            return new C45213me9(str, this.f41424b, this.f41425c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f41423a == null) {
            sb.append(" libraryName");
        }
        if ((this.f41426d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f41426d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final AbstractC40479ef9 m78108d(String str) {
        this.f41423a = "common";
        return this;
    }
}
