package p000;

import p000.AbstractC32014Bs5;
/* renamed from: eu */
/* loaded from: classes5.dex */
public final class C20134eu extends AbstractC32014Bs5 {

    /* renamed from: a */
    public final T96 f79078a;

    /* renamed from: b */
    public final String f79079b;

    /* renamed from: c */
    public final AbstractC52339yg1<?> f79080c;

    /* renamed from: d */
    public final C96<?, byte[]> f79081d;

    /* renamed from: e */
    public final C35142Pc1 f79082e;

    /* renamed from: eu$b */
    /* loaded from: classes5.dex */
    public static final class C20136b extends AbstractC32014Bs5.AbstractC0755a {

        /* renamed from: a */
        public T96 f79083a;

        /* renamed from: b */
        public String f79084b;

        /* renamed from: c */
        public AbstractC52339yg1<?> f79085c;

        /* renamed from: d */
        public C96<?, byte[]> f79086d;

        /* renamed from: e */
        public C35142Pc1 f79087e;

        @Override // p000.AbstractC32014Bs5.AbstractC0755a
        /* renamed from: a */
        public AbstractC32014Bs5 mo42423a() {
            String str = "";
            if (this.f79083a == null) {
                str = " transportContext";
            }
            if (this.f79084b == null) {
                str = str + " transportName";
            }
            if (this.f79085c == null) {
                str = str + " event";
            }
            if (this.f79086d == null) {
                str = str + " transformer";
            }
            if (this.f79087e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C20134eu(this.f79083a, this.f79084b, this.f79085c, this.f79086d, this.f79087e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC32014Bs5.AbstractC0755a
        /* renamed from: b */
        public AbstractC32014Bs5.AbstractC0755a mo42422b(C35142Pc1 c35142Pc1) {
            if (c35142Pc1 != null) {
                this.f79087e = c35142Pc1;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // p000.AbstractC32014Bs5.AbstractC0755a
        /* renamed from: c */
        public AbstractC32014Bs5.AbstractC0755a mo42421c(AbstractC52339yg1<?> abstractC52339yg1) {
            if (abstractC52339yg1 != null) {
                this.f79085c = abstractC52339yg1;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // p000.AbstractC32014Bs5.AbstractC0755a
        /* renamed from: d */
        public AbstractC32014Bs5.AbstractC0755a mo42420d(C96<?, byte[]> c96) {
            if (c96 != null) {
                this.f79086d = c96;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // p000.AbstractC32014Bs5.AbstractC0755a
        /* renamed from: e */
        public AbstractC32014Bs5.AbstractC0755a mo42419e(T96 t96) {
            if (t96 != null) {
                this.f79083a = t96;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // p000.AbstractC32014Bs5.AbstractC0755a
        /* renamed from: f */
        public AbstractC32014Bs5.AbstractC0755a mo42418f(String str) {
            if (str != null) {
                this.f79084b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // p000.AbstractC32014Bs5
    /* renamed from: b */
    public C35142Pc1 mo42428b() {
        return this.f79082e;
    }

    @Override // p000.AbstractC32014Bs5
    /* renamed from: c */
    public AbstractC52339yg1<?> mo42427c() {
        return this.f79080c;
    }

    @Override // p000.AbstractC32014Bs5
    /* renamed from: e */
    public C96<?, byte[]> mo42426e() {
        return this.f79081d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC32014Bs5)) {
            return false;
        }
        AbstractC32014Bs5 abstractC32014Bs5 = (AbstractC32014Bs5) obj;
        if (this.f79078a.equals(abstractC32014Bs5.mo42425f()) && this.f79079b.equals(abstractC32014Bs5.mo42424g()) && this.f79080c.equals(abstractC32014Bs5.mo42427c()) && this.f79081d.equals(abstractC32014Bs5.mo42426e()) && this.f79082e.equals(abstractC32014Bs5.mo42428b())) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC32014Bs5
    /* renamed from: f */
    public T96 mo42425f() {
        return this.f79078a;
    }

    @Override // p000.AbstractC32014Bs5
    /* renamed from: g */
    public String mo42424g() {
        return this.f79079b;
    }

    public int hashCode() {
        return ((((((((this.f79078a.hashCode() ^ 1000003) * 1000003) ^ this.f79079b.hashCode()) * 1000003) ^ this.f79080c.hashCode()) * 1000003) ^ this.f79081d.hashCode()) * 1000003) ^ this.f79082e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f79078a + ", transportName=" + this.f79079b + ", event=" + this.f79080c + ", transformer=" + this.f79081d + ", encoding=" + this.f79082e + "}";
    }

    public C20134eu(T96 t96, String str, AbstractC52339yg1<?> abstractC52339yg1, C96<?, byte[]> c96, C35142Pc1 c35142Pc1) {
        this.f79078a = t96;
        this.f79079b = str;
        this.f79080c = abstractC52339yg1;
        this.f79081d = c96;
        this.f79082e = c35142Pc1;
    }
}
