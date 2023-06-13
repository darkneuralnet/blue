package p000;
/* renamed from: po7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47090po7 extends AbstractC49461to7 {

    /* renamed from: a */
    public String f104116a;

    /* renamed from: b */
    public boolean f104117b;

    /* renamed from: c */
    public int f104118c;

    /* renamed from: d */
    public byte f104119d;

    @Override // p000.AbstractC49461to7
    /* renamed from: a */
    public final AbstractC49461to7 mo11748a(boolean z) {
        this.f104117b = true;
        this.f104119d = (byte) (1 | this.f104119d);
        return this;
    }

    @Override // p000.AbstractC49461to7
    /* renamed from: b */
    public final AbstractC49461to7 mo11747b(int i) {
        this.f104118c = 1;
        this.f104119d = (byte) (this.f104119d | 2);
        return this;
    }

    @Override // p000.AbstractC49461to7
    /* renamed from: c */
    public final AbstractC50054uo7 mo11746c() {
        String str;
        if (this.f104119d == 3 && (str = this.f104116a) != null) {
            return new C48276ro7(str, this.f104117b, this.f104118c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f104116a == null) {
            sb.append(" libraryName");
        }
        if ((this.f104119d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f104119d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final AbstractC49461to7 m18670d(String str) {
        this.f104116a = str;
        return this;
    }
}
