package p000;
/* renamed from: BZ0 */
/* loaded from: classes6.dex */
public class BZ0 implements InterfaceC42010hF0 {

    /* renamed from: a */
    public MX3 f2516a;

    /* renamed from: b */
    public C43196jF0 f2517b;

    public BZ0(MX3 mx3, C43196jF0 c43196jF0) {
        this.f2516a = mx3;
        this.f2517b = c43196jF0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BZ0)) {
            return false;
        }
        return this.f2516a.equals(((BZ0) obj).f2516a);
    }

    public int hashCode() {
        return this.f2516a.hashCode();
    }

    @Override // p000.InterfaceC42010hF0
    public void remove() {
        this.f2517b.m30945g(this.f2516a);
        this.f2516a.m95179a();
    }

    public String toString() {
        return this.f2516a.toString();
    }
}
