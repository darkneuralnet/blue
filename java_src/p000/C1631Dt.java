package p000;
/* renamed from: Dt */
/* loaded from: classes.dex */
public final class C1631Dt extends AbstractC42757iW1 {

    /* renamed from: a */
    public final Object f6458a;

    public C1631Dt(Object obj) {
        if (obj != null) {
            this.f6458a = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // p000.AbstractC42757iW1
    /* renamed from: b */
    public Object mo33851b() {
        return this.f6458a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC42757iW1) {
            return this.f6458a.equals(((AbstractC42757iW1) obj).mo33851b());
        }
        return false;
    }

    public int hashCode() {
        return this.f6458a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f6458a + "}";
    }
}
