package p000;

import java.io.IOException;
/* renamed from: H */
/* loaded from: classes8.dex */
public abstract class AbstractC2996H extends AbstractC7305S {

    /* renamed from: b */
    public C5448N f12702b;

    /* renamed from: c */
    public C4295K f12703c;

    /* renamed from: d */
    public AbstractC7305S f12704d;

    /* renamed from: e */
    public int f12705e;

    /* renamed from: f */
    public AbstractC7305S f12706f;

    public AbstractC2996H(C2042F c2042f) {
        int i = 0;
        AbstractC7305S m104513z = m104513z(c2042f, 0);
        if (m104513z instanceof C5448N) {
            this.f12702b = (C5448N) m104513z;
            m104513z = m104513z(c2042f, 1);
            i = 1;
        }
        if (m104513z instanceof C4295K) {
            this.f12703c = (C4295K) m104513z;
            i++;
            m104513z = m104513z(c2042f, i);
        }
        if (!(m104513z instanceof AbstractC10088Z)) {
            this.f12704d = m104513z;
            i++;
            m104513z = m104513z(c2042f, i);
        }
        if (c2042f.m108146f() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(m104513z instanceof AbstractC10088Z)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        AbstractC10088Z abstractC10088Z = (AbstractC10088Z) m104513z;
        m104516D(abstractC10088Z.m73928C());
        this.f12706f = abstractC10088Z.m73929A();
    }

    /* renamed from: A */
    public final void m104518A(AbstractC7305S abstractC7305S) {
        this.f12704d = abstractC7305S;
    }

    /* renamed from: C */
    public final void m104517C(C5448N c5448n) {
        this.f12702b = c5448n;
    }

    /* renamed from: D */
    public final void m104516D(int i) {
        if (i >= 0 && i <= 2) {
            this.f12705e = i;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i);
    }

    /* renamed from: E */
    public final void m104515E(AbstractC7305S abstractC7305S) {
        this.f12706f = abstractC7305S;
    }

    /* renamed from: F */
    public final void m104514F(C4295K c4295k) {
        this.f12703c = c4295k;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        C5448N c5448n = this.f12702b;
        int hashCode = c5448n != null ? c5448n.hashCode() : 0;
        C4295K c4295k = this.f12703c;
        if (c4295k != null) {
            hashCode ^= c4295k.hashCode();
        }
        AbstractC7305S abstractC7305S = this.f12704d;
        if (abstractC7305S != null) {
            hashCode ^= abstractC7305S.hashCode();
        }
        return hashCode ^ this.f12706f.hashCode();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        AbstractC7305S abstractC7305S2;
        C4295K c4295k;
        C5448N c5448n;
        if (abstractC7305S instanceof AbstractC2996H) {
            if (this == abstractC7305S) {
                return true;
            }
            AbstractC2996H abstractC2996H = (AbstractC2996H) abstractC7305S;
            C5448N c5448n2 = this.f12702b;
            if (c5448n2 == null || ((c5448n = abstractC2996H.f12702b) != null && c5448n.m86135u(c5448n2))) {
                C4295K c4295k2 = this.f12703c;
                if (c4295k2 == null || ((c4295k = abstractC2996H.f12703c) != null && c4295k.m86135u(c4295k2))) {
                    AbstractC7305S abstractC7305S3 = this.f12704d;
                    if (abstractC7305S3 == null || ((abstractC7305S2 = abstractC2996H.f12704d) != null && abstractC7305S2.m86135u(abstractC7305S3))) {
                        return this.f12706f.m86135u(abstractC2996H.f12706f);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        return getEncoded().length;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return true;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return new NF0(this.f12702b, this.f12703c, this.f12704d, this.f12705e, this.f12706f);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return new C43205jG0(this.f12702b, this.f12703c, this.f12704d, this.f12705e, this.f12706f);
    }

    /* renamed from: z */
    public final AbstractC7305S m104513z(C2042F c2042f, int i) {
        if (c2042f.m108146f() > i) {
            return c2042f.m108148d(i).mo13850c();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    public AbstractC2996H(C5448N c5448n, C4295K c4295k, AbstractC7305S abstractC7305S, int i, AbstractC7305S abstractC7305S2) {
        m104517C(c5448n);
        m104514F(c4295k);
        m104518A(abstractC7305S);
        m104516D(i);
        m104515E(abstractC7305S2.mo13850c());
    }
}
