package p000;
/* renamed from: KY8 */
/* loaded from: classes5.dex */
public final class KY8 extends AbstractC46025o09 {

    /* renamed from: a */
    public String f19854a;

    /* renamed from: b */
    public boolean f19855b;

    /* renamed from: c */
    public int f19856c;

    /* renamed from: d */
    public byte f19857d;

    @Override // p000.AbstractC46025o09
    /* renamed from: a */
    public final AbstractC46025o09 mo21995a(boolean z) {
        this.f19855b = true;
        this.f19857d = (byte) (1 | this.f19857d);
        return this;
    }

    @Override // p000.AbstractC46025o09
    /* renamed from: b */
    public final AbstractC46025o09 mo21994b(int i) {
        this.f19856c = 1;
        this.f19857d = (byte) (this.f19857d | 2);
        return this;
    }

    @Override // p000.AbstractC46025o09
    /* renamed from: c */
    public final AbstractC51360x09 mo21993c() {
        String str;
        if (this.f19857d == 3 && (str = this.f19854a) != null) {
            return new LZ8(str, this.f19855b, this.f19856c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19854a == null) {
            sb.append(" libraryName");
        }
        if ((this.f19857d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f19857d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final AbstractC46025o09 m98760d(String str) {
        this.f19854a = "vision-common";
        return this;
    }
}
