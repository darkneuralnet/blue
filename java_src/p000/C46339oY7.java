package p000;
/* renamed from: oY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46339oY7 extends AbstractC49533tv9 {

    /* renamed from: a */
    public String f102138a;

    @Override // p000.AbstractC49533tv9
    /* renamed from: a */
    public final AbstractC49533tv9 mo11199a(String str) {
        this.f102138a = str;
        return this;
    }

    @Override // p000.AbstractC49533tv9
    /* renamed from: b */
    public final W52 mo11198b() {
        String str = this.f102138a;
        if (str != null) {
            return new C32827Fe8(str, null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
