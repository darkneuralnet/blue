package p000;

import p000.Z42;
/* renamed from: Ht */
/* loaded from: classes6.dex */
public final class C3270Ht extends Z42 {

    /* renamed from: a */
    public final String f14127a;

    /* renamed from: b */
    public final String f14128b;

    /* renamed from: c */
    public final String f14129c;

    /* renamed from: d */
    public final AbstractC48443s56 f14130d;

    /* renamed from: e */
    public final Z42.EnumC10112b f14131e;

    /* renamed from: Ht$b */
    /* loaded from: classes6.dex */
    public static final class C3272b extends Z42.AbstractC10111a {

        /* renamed from: a */
        public String f14132a;

        /* renamed from: b */
        public String f14133b;

        /* renamed from: c */
        public String f14134c;

        /* renamed from: d */
        public AbstractC48443s56 f14135d;

        /* renamed from: e */
        public Z42.EnumC10112b f14136e;

        @Override // p000.Z42.AbstractC10111a
        /* renamed from: a */
        public Z42 mo73777a() {
            return new C3270Ht(this.f14132a, this.f14133b, this.f14134c, this.f14135d, this.f14136e);
        }

        @Override // p000.Z42.AbstractC10111a
        /* renamed from: b */
        public Z42.AbstractC10111a mo73776b(AbstractC48443s56 abstractC48443s56) {
            this.f14135d = abstractC48443s56;
            return this;
        }

        @Override // p000.Z42.AbstractC10111a
        /* renamed from: c */
        public Z42.AbstractC10111a mo73775c(String str) {
            this.f14133b = str;
            return this;
        }

        @Override // p000.Z42.AbstractC10111a
        /* renamed from: d */
        public Z42.AbstractC10111a mo73774d(String str) {
            this.f14134c = str;
            return this;
        }

        @Override // p000.Z42.AbstractC10111a
        /* renamed from: e */
        public Z42.AbstractC10111a mo73773e(Z42.EnumC10112b enumC10112b) {
            this.f14136e = enumC10112b;
            return this;
        }

        @Override // p000.Z42.AbstractC10111a
        /* renamed from: f */
        public Z42.AbstractC10111a mo73772f(String str) {
            this.f14132a = str;
            return this;
        }
    }

    @Override // p000.Z42
    /* renamed from: b */
    public AbstractC48443s56 mo73782b() {
        return this.f14130d;
    }

    @Override // p000.Z42
    /* renamed from: c */
    public String mo73781c() {
        return this.f14128b;
    }

    @Override // p000.Z42
    /* renamed from: d */
    public String mo73780d() {
        return this.f14129c;
    }

    @Override // p000.Z42
    /* renamed from: e */
    public Z42.EnumC10112b mo73779e() {
        return this.f14131e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z42)) {
            return false;
        }
        Z42 z42 = (Z42) obj;
        String str = this.f14127a;
        if (str != null ? str.equals(z42.mo73778f()) : z42.mo73778f() == null) {
            String str2 = this.f14128b;
            if (str2 != null ? str2.equals(z42.mo73781c()) : z42.mo73781c() == null) {
                String str3 = this.f14129c;
                if (str3 != null ? str3.equals(z42.mo73780d()) : z42.mo73780d() == null) {
                    AbstractC48443s56 abstractC48443s56 = this.f14130d;
                    if (abstractC48443s56 != null ? abstractC48443s56.equals(z42.mo73782b()) : z42.mo73782b() == null) {
                        Z42.EnumC10112b enumC10112b = this.f14131e;
                        if (enumC10112b == null) {
                            if (z42.mo73779e() == null) {
                                return true;
                            }
                        } else if (enumC10112b.equals(z42.mo73779e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.Z42
    /* renamed from: f */
    public String mo73778f() {
        return this.f14127a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f14127a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f14128b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f14129c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        AbstractC48443s56 abstractC48443s56 = this.f14130d;
        if (abstractC48443s56 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC48443s56.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        Z42.EnumC10112b enumC10112b = this.f14131e;
        if (enumC10112b != null) {
            i = enumC10112b.hashCode();
        }
        return i5 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f14127a + ", fid=" + this.f14128b + ", refreshToken=" + this.f14129c + ", authToken=" + this.f14130d + ", responseCode=" + this.f14131e + "}";
    }

    public C3270Ht(String str, String str2, String str3, AbstractC48443s56 abstractC48443s56, Z42.EnumC10112b enumC10112b) {
        this.f14127a = str;
        this.f14128b = str2;
        this.f14129c = str3;
        this.f14130d = abstractC48443s56;
        this.f14131e = enumC10112b;
    }
}
