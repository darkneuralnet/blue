package p000;

import java.util.Set;
import p000.AbstractC52403ym5;
/* renamed from: du */
/* loaded from: classes5.dex */
public final class C19887du extends AbstractC52403ym5.AbstractC30700b {

    /* renamed from: a */
    public final long f77365a;

    /* renamed from: b */
    public final long f77366b;

    /* renamed from: c */
    public final Set<AbstractC52403ym5.EnumC30702c> f77367c;

    /* renamed from: du$b */
    /* loaded from: classes5.dex */
    public static final class C19889b extends AbstractC52403ym5.AbstractC30700b.AbstractC30701a {

        /* renamed from: a */
        public Long f77368a;

        /* renamed from: b */
        public Long f77369b;

        /* renamed from: c */
        public Set<AbstractC52403ym5.EnumC30702c> f77370c;

        @Override // p000.AbstractC52403ym5.AbstractC30700b.AbstractC30701a
        /* renamed from: a */
        public AbstractC52403ym5.AbstractC30700b mo2606a() {
            String str = "";
            if (this.f77368a == null) {
                str = " delta";
            }
            if (this.f77369b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f77370c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C19887du(this.f77368a.longValue(), this.f77369b.longValue(), this.f77370c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC52403ym5.AbstractC30700b.AbstractC30701a
        /* renamed from: b */
        public AbstractC52403ym5.AbstractC30700b.AbstractC30701a mo2605b(long j) {
            this.f77368a = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC52403ym5.AbstractC30700b.AbstractC30701a
        /* renamed from: c */
        public AbstractC52403ym5.AbstractC30700b.AbstractC30701a mo2604c(Set<AbstractC52403ym5.EnumC30702c> set) {
            if (set != null) {
                this.f77370c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // p000.AbstractC52403ym5.AbstractC30700b.AbstractC30701a
        /* renamed from: d */
        public AbstractC52403ym5.AbstractC30700b.AbstractC30701a mo2603d(long j) {
            this.f77369b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC52403ym5.AbstractC30700b
    /* renamed from: b */
    public long mo2609b() {
        return this.f77365a;
    }

    @Override // p000.AbstractC52403ym5.AbstractC30700b
    /* renamed from: c */
    public Set<AbstractC52403ym5.EnumC30702c> mo2608c() {
        return this.f77367c;
    }

    @Override // p000.AbstractC52403ym5.AbstractC30700b
    /* renamed from: d */
    public long mo2607d() {
        return this.f77366b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC52403ym5.AbstractC30700b)) {
            return false;
        }
        AbstractC52403ym5.AbstractC30700b abstractC30700b = (AbstractC52403ym5.AbstractC30700b) obj;
        if (this.f77365a == abstractC30700b.mo2609b() && this.f77366b == abstractC30700b.mo2607d() && this.f77367c.equals(abstractC30700b.mo2608c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f77365a;
        long j2 = this.f77366b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f77367c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f77365a + ", maxAllowedDelay=" + this.f77366b + ", flags=" + this.f77367c + "}";
    }

    public C19887du(long j, long j2, Set<AbstractC52403ym5.EnumC30702c> set) {
        this.f77365a = j;
        this.f77366b = j2;
        this.f77367c = set;
    }
}
