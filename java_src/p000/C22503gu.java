package p000;

import p000.GP5;
/* renamed from: gu */
/* loaded from: classes.dex */
public final class C22503gu extends GP5.AbstractC2844a {

    /* renamed from: a */
    public final Throwable f84416a;

    public C22503gu(Throwable th) {
        if (th != null) {
            this.f84416a = th;
            return;
        }
        throw new NullPointerException("Null error");
    }

    @Override // p000.GP5.AbstractC2844a
    /* renamed from: a */
    public Throwable mo37354a() {
        return this.f84416a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GP5.AbstractC2844a) {
            return this.f84416a.equals(((GP5.AbstractC2844a) obj).mo37354a());
        }
        return false;
    }

    public int hashCode() {
        return this.f84416a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f84416a + "}";
    }
}
