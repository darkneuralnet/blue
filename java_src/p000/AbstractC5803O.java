package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: O */
/* loaded from: classes8.dex */
public abstract class AbstractC5803O extends AbstractC7305S implements InterfaceC6215P {

    /* renamed from: b */
    public byte[] f25500b;

    public AbstractC5803O(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f25500b = bArr;
    }

    /* renamed from: A */
    public static AbstractC5803O m93018A(Object obj) {
        if (obj == null || (obj instanceof AbstractC5803O)) {
            return (AbstractC5803O) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m93018A(AbstractC7305S.m86134v((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof InterfaceC1693E) {
            AbstractC7305S mo13850c = ((InterfaceC1693E) obj).mo13850c();
            if (mo13850c instanceof AbstractC5803O) {
                return (AbstractC5803O) mo13850c;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: z */
    public static AbstractC5803O m93016z(AbstractC10088Z abstractC10088Z, boolean z) {
        if (z) {
            if (abstractC10088Z.m73927D()) {
                return m93018A(abstractC10088Z.m73929A());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC7305S m73929A = abstractC10088Z.m73929A();
        if (abstractC10088Z.m73927D()) {
            AbstractC5803O m93018A = m93018A(m73929A);
            return abstractC10088Z instanceof C7001Qv ? new C3812Iv(new AbstractC5803O[]{m93018A}) : (AbstractC5803O) new C3812Iv(new AbstractC5803O[]{m93018A}).mo16142y();
        } else if (m73929A instanceof AbstractC5803O) {
            AbstractC5803O abstractC5803O = (AbstractC5803O) m73929A;
            return abstractC10088Z instanceof C7001Qv ? abstractC5803O : (AbstractC5803O) abstractC5803O.mo16142y();
        } else if (m73929A instanceof AbstractC8166U) {
            AbstractC8166U abstractC8166U = (AbstractC8166U) m73929A;
            return abstractC10088Z instanceof C7001Qv ? C3812Iv.m101483F(abstractC8166U) : (AbstractC5803O) C3812Iv.m101483F(abstractC8166U).mo16142y();
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + abstractC10088Z.getClass().getName());
        }
    }

    /* renamed from: C */
    public byte[] m93017C() {
        return this.f25500b;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() {
        return mo13850c();
    }

    @Override // p000.InterfaceC6215P
    /* renamed from: b */
    public InputStream mo78678b() {
        return new ByteArrayInputStream(this.f25500b);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(m93017C());
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof AbstractC5803O) {
            return C0210Ao.m115254a(this.f25500b, ((AbstractC5803O) abstractC7305S).f25500b);
        }
        return false;
    }

    public String toString() {
        return "#" + C46876pS5.m19298b(LL1.m97054a(this.f25500b));
    }

    @Override // p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return new VF0(this.f25500b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return new VF0(this.f25500b);
    }
}
