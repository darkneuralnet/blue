package p000;
/* renamed from: Mc9 */
/* loaded from: classes5.dex */
public final class Mc9 extends Kd9 {

    /* renamed from: a */
    public String f23292a;

    /* renamed from: b */
    public boolean f23293b;

    /* renamed from: c */
    public int f23294c;

    /* renamed from: d */
    public byte f23295d;

    @Override // p000.Kd9
    /* renamed from: a */
    public final Kd9 mo95118a(boolean z) {
        this.f23293b = true;
        this.f23295d = (byte) (1 | this.f23295d);
        return this;
    }

    @Override // p000.Kd9
    /* renamed from: b */
    public final Kd9 mo95117b(int i) {
        this.f23294c = 1;
        this.f23295d = (byte) (this.f23295d | 2);
        return this;
    }

    @Override // p000.Kd9
    /* renamed from: c */
    public final Sd9 mo95116c() {
        String str;
        if (this.f23295d == 3 && (str = this.f23292a) != null) {
            return new C38070ad9(str, this.f23293b, this.f23294c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23292a == null) {
            sb.append(" libraryName");
        }
        if ((this.f23295d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f23295d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final Kd9 m95115d(String str) {
        this.f23292a = str;
        return this;
    }
}
