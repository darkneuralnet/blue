package p000;

import java.util.Map;
import p000.AbstractC33774Jg1;
/* renamed from: zt */
/* loaded from: classes5.dex */
public final class C31583zt extends AbstractC33774Jg1 {

    /* renamed from: a */
    public final String f122416a;

    /* renamed from: b */
    public final Integer f122417b;

    /* renamed from: c */
    public final C43989kb1 f122418c;

    /* renamed from: d */
    public final long f122419d;

    /* renamed from: e */
    public final long f122420e;

    /* renamed from: f */
    public final Map<String, String> f122421f;

    /* renamed from: zt$b */
    /* loaded from: classes5.dex */
    public static final class C31585b extends AbstractC33774Jg1.AbstractC4179a {

        /* renamed from: a */
        public String f122422a;

        /* renamed from: b */
        public Integer f122423b;

        /* renamed from: c */
        public C43989kb1 f122424c;

        /* renamed from: d */
        public Long f122425d;

        /* renamed from: e */
        public Long f122426e;

        /* renamed from: f */
        public Map<String, String> f122427f;

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: d */
        public AbstractC33774Jg1 mo181d() {
            String str = "";
            if (this.f122422a == null) {
                str = " transportName";
            }
            if (this.f122424c == null) {
                str = str + " encodedPayload";
            }
            if (this.f122425d == null) {
                str = str + " eventMillis";
            }
            if (this.f122426e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f122427f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C31583zt(this.f122422a, this.f122423b, this.f122424c, this.f122425d.longValue(), this.f122426e.longValue(), this.f122427f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: e */
        public Map<String, String> mo180e() {
            Map<String, String> map = this.f122427f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: f */
        public AbstractC33774Jg1.AbstractC4179a mo179f(Map<String, String> map) {
            if (map != null) {
                this.f122427f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: g */
        public AbstractC33774Jg1.AbstractC4179a mo178g(Integer num) {
            this.f122423b = num;
            return this;
        }

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: h */
        public AbstractC33774Jg1.AbstractC4179a mo177h(C43989kb1 c43989kb1) {
            if (c43989kb1 != null) {
                this.f122424c = c43989kb1;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: i */
        public AbstractC33774Jg1.AbstractC4179a mo176i(long j) {
            this.f122425d = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: j */
        public AbstractC33774Jg1.AbstractC4179a mo175j(String str) {
            if (str != null) {
                this.f122422a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // p000.AbstractC33774Jg1.AbstractC4179a
        /* renamed from: k */
        public AbstractC33774Jg1.AbstractC4179a mo174k(long j) {
            this.f122426e = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC33774Jg1
    /* renamed from: c */
    public Map<String, String> mo187c() {
        return this.f122421f;
    }

    @Override // p000.AbstractC33774Jg1
    /* renamed from: d */
    public Integer mo186d() {
        return this.f122417b;
    }

    @Override // p000.AbstractC33774Jg1
    /* renamed from: e */
    public C43989kb1 mo185e() {
        return this.f122418c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC33774Jg1)) {
            return false;
        }
        AbstractC33774Jg1 abstractC33774Jg1 = (AbstractC33774Jg1) obj;
        if (this.f122416a.equals(abstractC33774Jg1.mo183j()) && ((num = this.f122417b) != null ? num.equals(abstractC33774Jg1.mo186d()) : abstractC33774Jg1.mo186d() == null) && this.f122418c.equals(abstractC33774Jg1.mo185e()) && this.f122419d == abstractC33774Jg1.mo184f() && this.f122420e == abstractC33774Jg1.mo182k() && this.f122421f.equals(abstractC33774Jg1.mo187c())) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC33774Jg1
    /* renamed from: f */
    public long mo184f() {
        return this.f122419d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f122416a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f122417b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.f122419d;
        long j2 = this.f122420e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f122418c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f122421f.hashCode();
    }

    @Override // p000.AbstractC33774Jg1
    /* renamed from: j */
    public String mo183j() {
        return this.f122416a;
    }

    @Override // p000.AbstractC33774Jg1
    /* renamed from: k */
    public long mo182k() {
        return this.f122420e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f122416a + ", code=" + this.f122417b + ", encodedPayload=" + this.f122418c + ", eventMillis=" + this.f122419d + ", uptimeMillis=" + this.f122420e + ", autoMetadata=" + this.f122421f + "}";
    }

    public C31583zt(String str, Integer num, C43989kb1 c43989kb1, long j, long j2, Map<String, String> map) {
        this.f122416a = str;
        this.f122417b = num;
        this.f122418c = c43989kb1;
        this.f122419d = j;
        this.f122420e = j2;
        this.f122421f = map;
    }
}
