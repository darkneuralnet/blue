package p000;
/* renamed from: fk9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41122fk9 extends Ik9 {

    /* renamed from: a */
    public String f80559a;

    /* renamed from: b */
    public boolean f80560b;

    /* renamed from: c */
    public int f80561c;

    /* renamed from: d */
    public byte f80562d;

    @Override // p000.Ik9
    /* renamed from: a */
    public final Ik9 mo40913a(boolean z) {
        this.f80560b = true;
        this.f80562d = (byte) (1 | this.f80562d);
        return this;
    }

    @Override // p000.Ik9
    /* renamed from: b */
    public final Ik9 mo40912b(int i) {
        this.f80561c = 1;
        this.f80562d = (byte) (this.f80562d | 2);
        return this;
    }

    @Override // p000.Ik9
    /* renamed from: c */
    public final Ok9 mo40911c() {
        String str;
        if (this.f80562d == 3 && (str = this.f80559a) != null) {
            return new C48238rk9(str, this.f80560b, this.f80561c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80559a == null) {
            sb.append(" libraryName");
        }
        if ((this.f80562d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f80562d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final Ik9 m40910d(String str) {
        if (str != null) {
            this.f80559a = str;
            return this;
        }
        throw new NullPointerException("Null libraryName");
    }
}
