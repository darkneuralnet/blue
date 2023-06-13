package p000;

import java.util.Set;
/* renamed from: Uv9 */
/* loaded from: classes5.dex */
public final class Uv9 extends Pv9 {

    /* renamed from: b */
    public final C44207kw9 f38285b = new C44207kw9();

    /* renamed from: b */
    public final Uv9 m80612b(String str) {
        return (Uv9) this.f38285b.get("authToken");
    }

    /* renamed from: c */
    public final Xv9 m80611c(String str) {
        return (Xv9) this.f38285b.get(str);
    }

    /* renamed from: e */
    public final Set m80610e() {
        return this.f38285b.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Uv9) && ((Uv9) obj).f38285b.equals(this.f38285b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m80609f(String str, Pv9 pv9) {
        this.f38285b.put(str, pv9);
    }

    public final int hashCode() {
        return this.f38285b.hashCode();
    }
}
