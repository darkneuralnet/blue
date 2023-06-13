package p000;

import java.util.Arrays;
import p000.AbstractC45989nx2;
/* renamed from: Lt */
/* loaded from: classes5.dex */
public final class C5107Lt extends AbstractC45989nx2 {

    /* renamed from: a */
    public final long f22182a;

    /* renamed from: b */
    public final Integer f22183b;

    /* renamed from: c */
    public final long f22184c;

    /* renamed from: d */
    public final byte[] f22185d;

    /* renamed from: e */
    public final String f22186e;

    /* renamed from: f */
    public final long f22187f;

    /* renamed from: g */
    public final B73 f22188g;

    /* renamed from: Lt$b */
    /* loaded from: classes5.dex */
    public static final class C5109b extends AbstractC45989nx2.AbstractC26744a {

        /* renamed from: a */
        public Long f22189a;

        /* renamed from: b */
        public Integer f22190b;

        /* renamed from: c */
        public Long f22191c;

        /* renamed from: d */
        public byte[] f22192d;

        /* renamed from: e */
        public String f22193e;

        /* renamed from: f */
        public Long f22194f;

        /* renamed from: g */
        public B73 f22195g;

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: a */
        public AbstractC45989nx2 mo22145a() {
            String str = "";
            if (this.f22189a == null) {
                str = " eventTimeMs";
            }
            if (this.f22191c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f22194f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C5107Lt(this.f22189a.longValue(), this.f22190b, this.f22191c.longValue(), this.f22192d, this.f22193e, this.f22194f.longValue(), this.f22195g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: b */
        public AbstractC45989nx2.AbstractC26744a mo22144b(Integer num) {
            this.f22190b = num;
            return this;
        }

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: c */
        public AbstractC45989nx2.AbstractC26744a mo22143c(long j) {
            this.f22189a = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: d */
        public AbstractC45989nx2.AbstractC26744a mo22142d(long j) {
            this.f22191c = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: e */
        public AbstractC45989nx2.AbstractC26744a mo22141e(B73 b73) {
            this.f22195g = b73;
            return this;
        }

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: f */
        public AbstractC45989nx2.AbstractC26744a mo22140f(byte[] bArr) {
            this.f22192d = bArr;
            return this;
        }

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: g */
        public AbstractC45989nx2.AbstractC26744a mo22139g(String str) {
            this.f22193e = str;
            return this;
        }

        @Override // p000.AbstractC45989nx2.AbstractC26744a
        /* renamed from: h */
        public AbstractC45989nx2.AbstractC26744a mo22138h(long j) {
            this.f22194f = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC45989nx2
    /* renamed from: b */
    public Integer mo22154b() {
        return this.f22183b;
    }

    @Override // p000.AbstractC45989nx2
    /* renamed from: c */
    public long mo22153c() {
        return this.f22182a;
    }

    @Override // p000.AbstractC45989nx2
    /* renamed from: d */
    public long mo22152d() {
        return this.f22184c;
    }

    @Override // p000.AbstractC45989nx2
    /* renamed from: e */
    public B73 mo22151e() {
        return this.f22188g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] mo22150f;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC45989nx2)) {
            return false;
        }
        AbstractC45989nx2 abstractC45989nx2 = (AbstractC45989nx2) obj;
        if (this.f22182a == abstractC45989nx2.mo22153c() && ((num = this.f22183b) != null ? num.equals(abstractC45989nx2.mo22154b()) : abstractC45989nx2.mo22154b() == null) && this.f22184c == abstractC45989nx2.mo22152d()) {
            byte[] bArr = this.f22185d;
            if (abstractC45989nx2 instanceof C5107Lt) {
                mo22150f = ((C5107Lt) abstractC45989nx2).f22185d;
            } else {
                mo22150f = abstractC45989nx2.mo22150f();
            }
            if (Arrays.equals(bArr, mo22150f) && ((str = this.f22186e) != null ? str.equals(abstractC45989nx2.mo22149g()) : abstractC45989nx2.mo22149g() == null) && this.f22187f == abstractC45989nx2.mo22148h()) {
                B73 b73 = this.f22188g;
                if (b73 == null) {
                    if (abstractC45989nx2.mo22151e() == null) {
                        return true;
                    }
                } else if (b73.equals(abstractC45989nx2.mo22151e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC45989nx2
    /* renamed from: f */
    public byte[] mo22150f() {
        return this.f22185d;
    }

    @Override // p000.AbstractC45989nx2
    /* renamed from: g */
    public String mo22149g() {
        return this.f22186e;
    }

    @Override // p000.AbstractC45989nx2
    /* renamed from: h */
    public long mo22148h() {
        return this.f22187f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f22182a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f22183b;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.f22184c;
        int hashCode3 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f22185d)) * 1000003;
        String str = this.f22186e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j3 = this.f22187f;
        int i3 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        B73 b73 = this.f22188g;
        if (b73 != null) {
            i2 = b73.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f22182a + ", eventCode=" + this.f22183b + ", eventUptimeMs=" + this.f22184c + ", sourceExtension=" + Arrays.toString(this.f22185d) + ", sourceExtensionJsonProto3=" + this.f22186e + ", timezoneOffsetSeconds=" + this.f22187f + ", networkConnectionInfo=" + this.f22188g + "}";
    }

    public C5107Lt(long j, Integer num, long j2, byte[] bArr, String str, long j3, B73 b73) {
        this.f22182a = j;
        this.f22183b = num;
        this.f22184c = j2;
        this.f22185d = bArr;
        this.f22186e = str;
        this.f22187f = j3;
        this.f22188g = b73;
    }
}
