package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;
/* renamed from: Y */
/* loaded from: classes8.dex */
public class C9585Y {

    /* renamed from: a */
    public final InputStream f44406a;

    /* renamed from: b */
    public final int f44407b;

    /* renamed from: c */
    public final byte[][] f44408c;

    public C9585Y(InputStream inputStream) {
        this(inputStream, ER5.m109015c(inputStream));
    }

    /* renamed from: a */
    public InterfaceC1693E m75889a(int i) throws IOException {
        if (i != 4) {
            if (i != 8) {
                if (i != 16) {
                    if (i == 17) {
                        return new C6562Pv(this);
                    }
                    throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
                }
                return new C5741Nv(this);
            }
            return new OF0(this);
        }
        return new C4278Jv(this);
    }

    /* renamed from: b */
    public InterfaceC1693E m75888b() throws IOException {
        int read = this.f44406a.read();
        if (read == -1) {
            return null;
        }
        boolean z = false;
        m75885e(false);
        int m101404l = C3828J.m101404l(this.f44406a, read);
        boolean z2 = (read & 32) != 0;
        InputStream inputStream = this.f44406a;
        int i = this.f44407b;
        if (m101404l == 4 || m101404l == 16 || m101404l == 17 || m101404l == 8) {
            z = true;
        }
        int m101406i = C3828J.m101406i(inputStream, i, z);
        if (m101406i < 0) {
            if (z2) {
                C9585Y c9585y = new C9585Y(new C44249l12(this.f44406a, this.f44407b), this.f44407b);
                return (read & 192) == 192 ? new C5126Lv(m101404l, c9585y) : (read & 64) != 0 ? new C2986Gv(m101404l, c9585y) : (read & 128) != 0 ? new C7291Rv(true, m101404l, c9585y) : c9585y.m75889a(m101404l);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C44562lZ0 c44562lZ0 = new C44562lZ0(this.f44406a, m101406i, this.f44407b);
        if ((read & 192) == 192) {
            return new C44984mG0(z2, m101404l, c44562lZ0.m27154f());
        }
        if ((read & 64) != 0) {
            return new C42019hG0(z2, m101404l, c44562lZ0.m27154f());
        }
        if ((read & 128) != 0) {
            return new C7291Rv(z2, m101404l, new C9585Y(c44562lZ0));
        }
        if (!z2) {
            if (m101404l != 4) {
                try {
                    return C3828J.m101411b(m101404l, c44562lZ0, this.f44408c);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            }
            return new WF0(c44562lZ0);
        } else if (m101404l != 4) {
            if (m101404l != 8) {
                if (m101404l != 16) {
                    if (m101404l == 17) {
                        return new C47356qG0(new C9585Y(c44562lZ0));
                    }
                    throw new IOException("unknown tag " + m101404l + " encountered");
                }
                return new C46170oG0(new C9585Y(c44562lZ0));
            }
            return new OF0(new C9585Y(c44562lZ0));
        } else {
            return new C4278Jv(new C9585Y(c44562lZ0));
        }
    }

    /* renamed from: c */
    public AbstractC7305S m75887c(boolean z, int i) throws IOException {
        if (z) {
            C2042F m75886d = m75886d();
            return this.f44406a instanceof C44249l12 ? m75886d.m108146f() == 1 ? new C7001Qv(true, i, m75886d.m108148d(0)) : new C7001Qv(false, i, C3274Hv.m103225a(m75886d)) : m75886d.m108146f() == 1 ? new C47949rG0(true, i, m75886d.m108148d(0)) : new C47949rG0(false, i, C43798kG0.m29115a(m75886d));
        }
        return new C47949rG0(false, i, new VF0(((C44562lZ0) this.f44406a).m27154f()));
    }

    /* renamed from: d */
    public C2042F m75886d() throws IOException {
        InterfaceC1693E m75888b = m75888b();
        if (m75888b == null) {
            return new C2042F(0);
        }
        C2042F c2042f = new C2042F();
        do {
            c2042f.m108151a(m75888b instanceof SZ1 ? ((SZ1) m75888b).mo17712a() : m75888b.mo13850c());
            m75888b = m75888b();
        } while (m75888b != null);
        return c2042f;
    }

    /* renamed from: e */
    public final void m75885e(boolean z) {
        InputStream inputStream = this.f44406a;
        if (inputStream instanceof C44249l12) {
            ((C44249l12) inputStream).m28020d(z);
        }
    }

    public C9585Y(InputStream inputStream, int i) {
        this.f44406a = inputStream;
        this.f44407b = i;
        this.f44408c = new byte[11];
    }
}
