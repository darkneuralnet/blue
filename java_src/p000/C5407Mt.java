package p000;

import java.util.List;
import p000.AbstractC47768qx2;
/* renamed from: Mt */
/* loaded from: classes5.dex */
public final class C5407Mt extends AbstractC47768qx2 {

    /* renamed from: a */
    public final long f23715a;

    /* renamed from: b */
    public final long f23716b;

    /* renamed from: c */
    public final AbstractC33575Ik0 f23717c;

    /* renamed from: d */
    public final Integer f23718d;

    /* renamed from: e */
    public final String f23719e;

    /* renamed from: f */
    public final List<AbstractC45989nx2> f23720f;

    /* renamed from: g */
    public final EnumC50513vb4 f23721g;

    /* renamed from: Mt$b */
    /* loaded from: classes5.dex */
    public static final class C5409b extends AbstractC47768qx2.AbstractC27743a {

        /* renamed from: a */
        public Long f23722a;

        /* renamed from: b */
        public Long f23723b;

        /* renamed from: c */
        public AbstractC33575Ik0 f23724c;

        /* renamed from: d */
        public Integer f23725d;

        /* renamed from: e */
        public String f23726e;

        /* renamed from: f */
        public List<AbstractC45989nx2> f23727f;

        /* renamed from: g */
        public EnumC50513vb4 f23728g;

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: a */
        public AbstractC47768qx2 mo16740a() {
            String str = "";
            if (this.f23722a == null) {
                str = " requestTimeMs";
            }
            if (this.f23723b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C5407Mt(this.f23722a.longValue(), this.f23723b.longValue(), this.f23724c, this.f23725d, this.f23726e, this.f23727f, this.f23728g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: b */
        public AbstractC47768qx2.AbstractC27743a mo16739b(AbstractC33575Ik0 abstractC33575Ik0) {
            this.f23724c = abstractC33575Ik0;
            return this;
        }

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: c */
        public AbstractC47768qx2.AbstractC27743a mo16738c(List<AbstractC45989nx2> list) {
            this.f23727f = list;
            return this;
        }

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: d */
        public AbstractC47768qx2.AbstractC27743a mo16737d(Integer num) {
            this.f23725d = num;
            return this;
        }

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: e */
        public AbstractC47768qx2.AbstractC27743a mo16736e(String str) {
            this.f23726e = str;
            return this;
        }

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: f */
        public AbstractC47768qx2.AbstractC27743a mo16735f(EnumC50513vb4 enumC50513vb4) {
            this.f23728g = enumC50513vb4;
            return this;
        }

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: g */
        public AbstractC47768qx2.AbstractC27743a mo16734g(long j) {
            this.f23722a = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC47768qx2.AbstractC27743a
        /* renamed from: h */
        public AbstractC47768qx2.AbstractC27743a mo16733h(long j) {
            this.f23723b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC47768qx2
    /* renamed from: b */
    public AbstractC33575Ik0 mo16747b() {
        return this.f23717c;
    }

    @Override // p000.AbstractC47768qx2
    /* renamed from: c */
    public List<AbstractC45989nx2> mo16746c() {
        return this.f23720f;
    }

    @Override // p000.AbstractC47768qx2
    /* renamed from: d */
    public Integer mo16745d() {
        return this.f23718d;
    }

    @Override // p000.AbstractC47768qx2
    /* renamed from: e */
    public String mo16744e() {
        return this.f23719e;
    }

    public boolean equals(Object obj) {
        AbstractC33575Ik0 abstractC33575Ik0;
        Integer num;
        String str;
        List<AbstractC45989nx2> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC47768qx2)) {
            return false;
        }
        AbstractC47768qx2 abstractC47768qx2 = (AbstractC47768qx2) obj;
        if (this.f23715a == abstractC47768qx2.mo16742g() && this.f23716b == abstractC47768qx2.mo16741h() && ((abstractC33575Ik0 = this.f23717c) != null ? abstractC33575Ik0.equals(abstractC47768qx2.mo16747b()) : abstractC47768qx2.mo16747b() == null) && ((num = this.f23718d) != null ? num.equals(abstractC47768qx2.mo16745d()) : abstractC47768qx2.mo16745d() == null) && ((str = this.f23719e) != null ? str.equals(abstractC47768qx2.mo16744e()) : abstractC47768qx2.mo16744e() == null) && ((list = this.f23720f) != null ? list.equals(abstractC47768qx2.mo16746c()) : abstractC47768qx2.mo16746c() == null)) {
            EnumC50513vb4 enumC50513vb4 = this.f23721g;
            if (enumC50513vb4 == null) {
                if (abstractC47768qx2.mo16743f() == null) {
                    return true;
                }
            } else if (enumC50513vb4.equals(abstractC47768qx2.mo16743f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC47768qx2
    /* renamed from: f */
    public EnumC50513vb4 mo16743f() {
        return this.f23721g;
    }

    @Override // p000.AbstractC47768qx2
    /* renamed from: g */
    public long mo16742g() {
        return this.f23715a;
    }

    @Override // p000.AbstractC47768qx2
    /* renamed from: h */
    public long mo16741h() {
        return this.f23716b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.f23715a;
        long j2 = this.f23716b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC33575Ik0 abstractC33575Ik0 = this.f23717c;
        int i2 = 0;
        if (abstractC33575Ik0 == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC33575Ik0.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        Integer num = this.f23718d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.f23719e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        List<AbstractC45989nx2> list = this.f23720f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        EnumC50513vb4 enumC50513vb4 = this.f23721g;
        if (enumC50513vb4 != null) {
            i2 = enumC50513vb4.hashCode();
        }
        return i6 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f23715a + ", requestUptimeMs=" + this.f23716b + ", clientInfo=" + this.f23717c + ", logSource=" + this.f23718d + ", logSourceName=" + this.f23719e + ", logEvents=" + this.f23720f + ", qosTier=" + this.f23721g + "}";
    }

    public C5407Mt(long j, long j2, AbstractC33575Ik0 abstractC33575Ik0, Integer num, String str, List<AbstractC45989nx2> list, EnumC50513vb4 enumC50513vb4) {
        this.f23715a = j;
        this.f23716b = j2;
        this.f23717c = abstractC33575Ik0;
        this.f23718d = num;
        this.f23719e = str;
        this.f23720f = list;
        this.f23721g = enumC50513vb4;
    }
}
