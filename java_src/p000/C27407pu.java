package p000;

import p000.AbstractC48443s56;
/* renamed from: pu */
/* loaded from: classes6.dex */
public final class C27407pu extends AbstractC48443s56 {

    /* renamed from: a */
    public final String f104269a;

    /* renamed from: b */
    public final long f104270b;

    /* renamed from: c */
    public final AbstractC48443s56.EnumC28177b f104271c;

    /* renamed from: pu$b */
    /* loaded from: classes6.dex */
    public static final class C27409b extends AbstractC48443s56.AbstractC28176a {

        /* renamed from: a */
        public String f104272a;

        /* renamed from: b */
        public Long f104273b;

        /* renamed from: c */
        public AbstractC48443s56.EnumC28177b f104274c;

        @Override // p000.AbstractC48443s56.AbstractC28176a
        /* renamed from: a */
        public AbstractC48443s56 mo14789a() {
            String str = "";
            if (this.f104273b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C27407pu(this.f104272a, this.f104273b.longValue(), this.f104274c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC48443s56.AbstractC28176a
        /* renamed from: b */
        public AbstractC48443s56.AbstractC28176a mo14788b(AbstractC48443s56.EnumC28177b enumC28177b) {
            this.f104274c = enumC28177b;
            return this;
        }

        @Override // p000.AbstractC48443s56.AbstractC28176a
        /* renamed from: c */
        public AbstractC48443s56.AbstractC28176a mo14787c(String str) {
            this.f104272a = str;
            return this;
        }

        @Override // p000.AbstractC48443s56.AbstractC28176a
        /* renamed from: d */
        public AbstractC48443s56.AbstractC28176a mo14786d(long j) {
            this.f104273b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC48443s56
    /* renamed from: b */
    public AbstractC48443s56.EnumC28177b mo14792b() {
        return this.f104271c;
    }

    @Override // p000.AbstractC48443s56
    /* renamed from: c */
    public String mo14791c() {
        return this.f104269a;
    }

    @Override // p000.AbstractC48443s56
    /* renamed from: d */
    public long mo14790d() {
        return this.f104270b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC48443s56)) {
            return false;
        }
        AbstractC48443s56 abstractC48443s56 = (AbstractC48443s56) obj;
        String str = this.f104269a;
        if (str != null ? str.equals(abstractC48443s56.mo14791c()) : abstractC48443s56.mo14791c() == null) {
            if (this.f104270b == abstractC48443s56.mo14790d()) {
                AbstractC48443s56.EnumC28177b enumC28177b = this.f104271c;
                if (enumC28177b == null) {
                    if (abstractC48443s56.mo14792b() == null) {
                        return true;
                    }
                } else if (enumC28177b.equals(abstractC48443s56.mo14792b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f104269a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f104270b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC48443s56.EnumC28177b enumC28177b = this.f104271c;
        if (enumC28177b != null) {
            i = enumC28177b.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f104269a + ", tokenExpirationTimestamp=" + this.f104270b + ", responseCode=" + this.f104271c + "}";
    }

    public C27407pu(String str, long j, AbstractC48443s56.EnumC28177b enumC28177b) {
        this.f104269a = str;
        this.f104270b = j;
        this.f104271c = enumC28177b;
    }
}
