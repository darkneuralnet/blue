package p000;

import java.util.Set;
/* renamed from: kU7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43931kU7 extends C51629xT7 {

    /* renamed from: b */
    public final NZ7 f94436b = new NZ7();

    /* renamed from: b */
    public final C43931kU7 m28919b(String str) {
        return (C43931kU7) this.f94436b.get("authToken");
    }

    /* renamed from: c */
    public final YU7 m28918c(String str) {
        return (YU7) this.f94436b.get(str);
    }

    /* renamed from: e */
    public final Set m28917e() {
        return this.f94436b.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C43931kU7) && ((C43931kU7) obj).f94436b.equals(this.f94436b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m28916f(String str, C51629xT7 c51629xT7) {
        this.f94436b.put(str, c51629xT7);
    }

    public final int hashCode() {
        return this.f94436b.hashCode();
    }
}
