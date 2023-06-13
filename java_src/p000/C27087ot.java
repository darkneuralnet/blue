package p000;

import p000.AbstractC43405jc0;
/* renamed from: ot */
/* loaded from: classes.dex */
public final class C27087ot extends AbstractC43405jc0.AbstractC24956a {

    /* renamed from: a */
    public final int f102694a;

    /* renamed from: b */
    public final Throwable f102695b;

    public C27087ot(int i, Throwable th) {
        this.f102694a = i;
        this.f102695b = th;
    }

    @Override // p000.AbstractC43405jc0.AbstractC24956a
    /* renamed from: c */
    public Throwable mo20372c() {
        return this.f102695b;
    }

    @Override // p000.AbstractC43405jc0.AbstractC24956a
    /* renamed from: d */
    public int mo20371d() {
        return this.f102694a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC43405jc0.AbstractC24956a)) {
            return false;
        }
        AbstractC43405jc0.AbstractC24956a abstractC24956a = (AbstractC43405jc0.AbstractC24956a) obj;
        if (this.f102694a == abstractC24956a.mo20371d()) {
            Throwable th = this.f102695b;
            if (th == null) {
                if (abstractC24956a.mo20372c() == null) {
                    return true;
                }
            } else if (th.equals(abstractC24956a.mo20372c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = (this.f102694a ^ 1000003) * 1000003;
        Throwable th = this.f102695b;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return i ^ hashCode;
    }

    public String toString() {
        return "StateError{code=" + this.f102694a + ", cause=" + this.f102695b + "}";
    }
}
