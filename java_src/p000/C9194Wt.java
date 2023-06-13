package p000;

import p000.AbstractC45679nR3;
import p000.C45086mR3;
/* renamed from: Wt */
/* loaded from: classes6.dex */
public final class C9194Wt extends AbstractC45679nR3 {

    /* renamed from: b */
    public final String f42244b;

    /* renamed from: c */
    public final C45086mR3.EnumC26097a f42245c;

    /* renamed from: d */
    public final String f42246d;

    /* renamed from: e */
    public final String f42247e;

    /* renamed from: f */
    public final long f42248f;

    /* renamed from: g */
    public final long f42249g;

    /* renamed from: h */
    public final String f42250h;

    /* renamed from: Wt$b */
    /* loaded from: classes6.dex */
    public static final class C9196b extends AbstractC45679nR3.AbstractC26510a {

        /* renamed from: a */
        public String f42251a;

        /* renamed from: b */
        public C45086mR3.EnumC26097a f42252b;

        /* renamed from: c */
        public String f42253c;

        /* renamed from: d */
        public String f42254d;

        /* renamed from: e */
        public Long f42255e;

        /* renamed from: f */
        public Long f42256f;

        /* renamed from: g */
        public String f42257g;

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: a */
        public AbstractC45679nR3 mo23760a() {
            String str = "";
            if (this.f42252b == null) {
                str = " registrationStatus";
            }
            if (this.f42255e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f42256f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C9194Wt(this.f42251a, this.f42252b, this.f42253c, this.f42254d, this.f42255e.longValue(), this.f42256f.longValue(), this.f42257g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: b */
        public AbstractC45679nR3.AbstractC26510a mo23759b(String str) {
            this.f42253c = str;
            return this;
        }

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: c */
        public AbstractC45679nR3.AbstractC26510a mo23758c(long j) {
            this.f42255e = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: d */
        public AbstractC45679nR3.AbstractC26510a mo23757d(String str) {
            this.f42251a = str;
            return this;
        }

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: e */
        public AbstractC45679nR3.AbstractC26510a mo23756e(String str) {
            this.f42257g = str;
            return this;
        }

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: f */
        public AbstractC45679nR3.AbstractC26510a mo23755f(String str) {
            this.f42254d = str;
            return this;
        }

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: g */
        public AbstractC45679nR3.AbstractC26510a mo23754g(C45086mR3.EnumC26097a enumC26097a) {
            if (enumC26097a != null) {
                this.f42252b = enumC26097a;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // p000.AbstractC45679nR3.AbstractC26510a
        /* renamed from: h */
        public AbstractC45679nR3.AbstractC26510a mo23753h(long j) {
            this.f42256f = Long.valueOf(j);
            return this;
        }

        public C9196b() {
        }

        public C9196b(AbstractC45679nR3 abstractC45679nR3) {
            this.f42251a = abstractC45679nR3.mo23777d();
            this.f42252b = abstractC45679nR3.mo23774g();
            this.f42253c = abstractC45679nR3.mo23779b();
            this.f42254d = abstractC45679nR3.mo23775f();
            this.f42255e = Long.valueOf(abstractC45679nR3.mo23778c());
            this.f42256f = Long.valueOf(abstractC45679nR3.mo23773h());
            this.f42257g = abstractC45679nR3.mo23776e();
        }
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: b */
    public String mo23779b() {
        return this.f42246d;
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: c */
    public long mo23778c() {
        return this.f42248f;
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: d */
    public String mo23777d() {
        return this.f42244b;
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: e */
    public String mo23776e() {
        return this.f42250h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC45679nR3)) {
            return false;
        }
        AbstractC45679nR3 abstractC45679nR3 = (AbstractC45679nR3) obj;
        String str3 = this.f42244b;
        if (str3 != null ? str3.equals(abstractC45679nR3.mo23777d()) : abstractC45679nR3.mo23777d() == null) {
            if (this.f42245c.equals(abstractC45679nR3.mo23774g()) && ((str = this.f42246d) != null ? str.equals(abstractC45679nR3.mo23779b()) : abstractC45679nR3.mo23779b() == null) && ((str2 = this.f42247e) != null ? str2.equals(abstractC45679nR3.mo23775f()) : abstractC45679nR3.mo23775f() == null) && this.f42248f == abstractC45679nR3.mo23778c() && this.f42249g == abstractC45679nR3.mo23773h()) {
                String str4 = this.f42250h;
                if (str4 == null) {
                    if (abstractC45679nR3.mo23776e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC45679nR3.mo23776e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: f */
    public String mo23775f() {
        return this.f42247e;
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: g */
    public C45086mR3.EnumC26097a mo23774g() {
        return this.f42245c;
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: h */
    public long mo23773h() {
        return this.f42249g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f42244b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f42245c.hashCode()) * 1000003;
        String str2 = this.f42246d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f42247e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.f42248f;
        long j2 = this.f42249g;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f42250h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    @Override // p000.AbstractC45679nR3
    /* renamed from: n */
    public AbstractC45679nR3.AbstractC26510a mo23767n() {
        return new C9196b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f42244b + ", registrationStatus=" + this.f42245c + ", authToken=" + this.f42246d + ", refreshToken=" + this.f42247e + ", expiresInSecs=" + this.f42248f + ", tokenCreationEpochInSecs=" + this.f42249g + ", fisError=" + this.f42250h + "}";
    }

    public C9194Wt(String str, C45086mR3.EnumC26097a enumC26097a, String str2, String str3, long j, long j2, String str4) {
        this.f42244b = str;
        this.f42245c = enumC26097a;
        this.f42246d = str2;
        this.f42247e = str3;
        this.f42248f = j;
        this.f42249g = j2;
        this.f42250h = str4;
    }
}
