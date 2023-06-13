package p000;

import p000.AbstractC43405jc0;
/* renamed from: nt */
/* loaded from: classes.dex */
public final class C26735nt extends AbstractC43405jc0 {

    /* renamed from: a */
    public final AbstractC43405jc0.EnumC24957b f100975a;

    /* renamed from: b */
    public final AbstractC43405jc0.AbstractC24956a f100976b;

    public C26735nt(AbstractC43405jc0.EnumC24957b enumC24957b, AbstractC43405jc0.AbstractC24956a abstractC24956a) {
        if (enumC24957b != null) {
            this.f100975a = enumC24957b;
            this.f100976b = abstractC24956a;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // p000.AbstractC43405jc0
    /* renamed from: c */
    public AbstractC43405jc0.AbstractC24956a mo22251c() {
        return this.f100976b;
    }

    @Override // p000.AbstractC43405jc0
    /* renamed from: d */
    public AbstractC43405jc0.EnumC24957b mo22250d() {
        return this.f100975a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC43405jc0)) {
            return false;
        }
        AbstractC43405jc0 abstractC43405jc0 = (AbstractC43405jc0) obj;
        if (this.f100975a.equals(abstractC43405jc0.mo22250d())) {
            AbstractC43405jc0.AbstractC24956a abstractC24956a = this.f100976b;
            if (abstractC24956a == null) {
                if (abstractC43405jc0.mo22251c() == null) {
                    return true;
                }
            } else if (abstractC24956a.equals(abstractC43405jc0.mo22251c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f100975a.hashCode() ^ 1000003) * 1000003;
        AbstractC43405jc0.AbstractC24956a abstractC24956a = this.f100976b;
        if (abstractC24956a == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC24956a.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "CameraState{type=" + this.f100975a + ", error=" + this.f100976b + "}";
    }
}
