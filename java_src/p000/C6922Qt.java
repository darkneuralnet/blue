package p000;

import p000.B73;
/* renamed from: Qt */
/* loaded from: classes5.dex */
public final class C6922Qt extends B73 {

    /* renamed from: a */
    public final B73.EnumC0531c f31040a;

    /* renamed from: b */
    public final B73.EnumC0530b f31041b;

    /* renamed from: Qt$b */
    /* loaded from: classes5.dex */
    public static final class C6924b extends B73.AbstractC0529a {

        /* renamed from: a */
        public B73.EnumC0531c f31042a;

        /* renamed from: b */
        public B73.EnumC0530b f31043b;

        @Override // p000.B73.AbstractC0529a
        /* renamed from: a */
        public B73 mo87844a() {
            return new C6922Qt(this.f31042a, this.f31043b);
        }

        @Override // p000.B73.AbstractC0529a
        /* renamed from: b */
        public B73.AbstractC0529a mo87843b(B73.EnumC0530b enumC0530b) {
            this.f31043b = enumC0530b;
            return this;
        }

        @Override // p000.B73.AbstractC0529a
        /* renamed from: c */
        public B73.AbstractC0529a mo87842c(B73.EnumC0531c enumC0531c) {
            this.f31042a = enumC0531c;
            return this;
        }
    }

    @Override // p000.B73
    /* renamed from: b */
    public B73.EnumC0530b mo87846b() {
        return this.f31041b;
    }

    @Override // p000.B73
    /* renamed from: c */
    public B73.EnumC0531c mo87845c() {
        return this.f31040a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B73)) {
            return false;
        }
        B73 b73 = (B73) obj;
        B73.EnumC0531c enumC0531c = this.f31040a;
        if (enumC0531c != null ? enumC0531c.equals(b73.mo87845c()) : b73.mo87845c() == null) {
            B73.EnumC0530b enumC0530b = this.f31041b;
            if (enumC0530b == null) {
                if (b73.mo87846b() == null) {
                    return true;
                }
            } else if (enumC0530b.equals(b73.mo87846b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        B73.EnumC0531c enumC0531c = this.f31040a;
        int i = 0;
        if (enumC0531c == null) {
            hashCode = 0;
        } else {
            hashCode = enumC0531c.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        B73.EnumC0530b enumC0530b = this.f31041b;
        if (enumC0530b != null) {
            i = enumC0530b.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f31040a + ", mobileSubtype=" + this.f31041b + "}";
    }

    public C6922Qt(B73.EnumC0531c enumC0531c, B73.EnumC0530b enumC0530b) {
        this.f31040a = enumC0531c;
        this.f31041b = enumC0530b;
    }
}
