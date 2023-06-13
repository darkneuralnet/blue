package p000;

import p000.AbstractC33575Ik0;
/* renamed from: st */
/* loaded from: classes5.dex */
public final class C28418st extends AbstractC33575Ik0 {

    /* renamed from: a */
    public final AbstractC33575Ik0.EnumC3749b f109444a;

    /* renamed from: b */
    public final AbstractC13605cc f109445b;

    /* renamed from: st$b */
    /* loaded from: classes5.dex */
    public static final class C28420b extends AbstractC33575Ik0.AbstractC3748a {

        /* renamed from: a */
        public AbstractC33575Ik0.EnumC3749b f109446a;

        /* renamed from: b */
        public AbstractC13605cc f109447b;

        @Override // p000.AbstractC33575Ik0.AbstractC3748a
        /* renamed from: a */
        public AbstractC33575Ik0 mo13553a() {
            return new C28418st(this.f109446a, this.f109447b);
        }

        @Override // p000.AbstractC33575Ik0.AbstractC3748a
        /* renamed from: b */
        public AbstractC33575Ik0.AbstractC3748a mo13552b(AbstractC13605cc abstractC13605cc) {
            this.f109447b = abstractC13605cc;
            return this;
        }

        @Override // p000.AbstractC33575Ik0.AbstractC3748a
        /* renamed from: c */
        public AbstractC33575Ik0.AbstractC3748a mo13551c(AbstractC33575Ik0.EnumC3749b enumC3749b) {
            this.f109446a = enumC3749b;
            return this;
        }
    }

    @Override // p000.AbstractC33575Ik0
    /* renamed from: b */
    public AbstractC13605cc mo13555b() {
        return this.f109445b;
    }

    @Override // p000.AbstractC33575Ik0
    /* renamed from: c */
    public AbstractC33575Ik0.EnumC3749b mo13554c() {
        return this.f109444a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC33575Ik0)) {
            return false;
        }
        AbstractC33575Ik0 abstractC33575Ik0 = (AbstractC33575Ik0) obj;
        AbstractC33575Ik0.EnumC3749b enumC3749b = this.f109444a;
        if (enumC3749b != null ? enumC3749b.equals(abstractC33575Ik0.mo13554c()) : abstractC33575Ik0.mo13554c() == null) {
            AbstractC13605cc abstractC13605cc = this.f109445b;
            if (abstractC13605cc == null) {
                if (abstractC33575Ik0.mo13555b() == null) {
                    return true;
                }
            } else if (abstractC13605cc.equals(abstractC33575Ik0.mo13555b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC33575Ik0.EnumC3749b enumC3749b = this.f109444a;
        int i = 0;
        if (enumC3749b == null) {
            hashCode = 0;
        } else {
            hashCode = enumC3749b.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AbstractC13605cc abstractC13605cc = this.f109445b;
        if (abstractC13605cc != null) {
            i = abstractC13605cc.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f109444a + ", androidClientInfo=" + this.f109445b + "}";
    }

    public C28418st(AbstractC33575Ik0.EnumC3749b enumC3749b, AbstractC13605cc abstractC13605cc) {
        this.f109444a = enumC3749b;
        this.f109445b = abstractC13605cc;
    }
}
