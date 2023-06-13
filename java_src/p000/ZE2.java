package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p000.InterfaceC52235yV2;
import p000.J24;
/* renamed from: ZE2 */
/* loaded from: classes6.dex */
public class ZE2 implements K24<VE2, VE2> {

    /* renamed from: a */
    public static final Logger f48018a = Logger.getLogger(ZE2.class.getName());

    /* renamed from: b */
    public static final byte[] f48019b = {0};

    /* renamed from: ZE2$b */
    /* loaded from: classes6.dex */
    public static class C10162b implements VE2 {

        /* renamed from: a */
        public final J24<VE2> f48020a;

        /* renamed from: b */
        public final InterfaceC52235yV2.InterfaceC30599a f48021b;

        /* renamed from: c */
        public final InterfaceC52235yV2.InterfaceC30599a f48022c;

        @Override // p000.VE2
        /* renamed from: a */
        public void mo18275a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3;
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (J24.C3872c<VE2> c3872c : this.f48020a.m101277f(copyOf)) {
                    if (c3872c.m101264d().equals(EnumC40189eA3.LEGACY)) {
                        bArr3 = T70.m84297a(bArr2, ZE2.f48019b);
                    } else {
                        bArr3 = bArr2;
                    }
                    try {
                        c3872c.m101262f().mo18275a(copyOfRange, bArr3);
                        this.f48022c.mo3443b(c3872c.m101265c(), bArr3.length);
                        return;
                    } catch (GeneralSecurityException e) {
                        Logger logger = ZE2.f48018a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e);
                    }
                }
                for (J24.C3872c<VE2> c3872c2 : this.f48020a.m101275h()) {
                    try {
                        c3872c2.m101262f().mo18275a(bArr, bArr2);
                        this.f48022c.mo3443b(c3872c2.m101265c(), bArr2.length);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                this.f48022c.mo3444a();
                throw new GeneralSecurityException("invalid MAC");
            }
            this.f48022c.mo3444a();
            throw new GeneralSecurityException("tag too short");
        }

        @Override // p000.VE2
        /* renamed from: b */
        public byte[] mo18274b(byte[] bArr) throws GeneralSecurityException {
            if (this.f48020a.m101278e().m101264d().equals(EnumC40189eA3.LEGACY)) {
                bArr = T70.m84297a(bArr, ZE2.f48019b);
            }
            try {
                byte[] m84297a = T70.m84297a(this.f48020a.m101278e().m101267a(), this.f48020a.m101278e().m101262f().mo18274b(bArr));
                this.f48021b.mo3443b(this.f48020a.m101278e().m101265c(), bArr.length);
                return m84297a;
            } catch (GeneralSecurityException e) {
                this.f48021b.mo3444a();
                throw e;
            }
        }

        public C10162b(J24<VE2> j24) {
            this.f48020a = j24;
            if (j24.m101274i()) {
                InterfaceC52235yV2 m6702a = C51067wX2.m6701b().m6702a();
                C52828zV2 m115715a = AV2.m115715a(j24);
                this.f48021b = m6702a.mo3445a(m115715a, "mac", "compute");
                this.f48022c = m6702a.mo3445a(m115715a, "mac", "verify");
                return;
            }
            InterfaceC52235yV2.InterfaceC30599a interfaceC30599a = AV2.f637a;
            this.f48021b = interfaceC30599a;
            this.f48022c = interfaceC30599a;
        }
    }

    /* renamed from: f */
    public static void m73521f() throws GeneralSecurityException {
        C34830Nt4.m93221m(new ZE2());
    }

    @Override // p000.K24
    /* renamed from: a */
    public Class<VE2> mo16453a() {
        return VE2.class;
    }

    @Override // p000.K24
    /* renamed from: b */
    public Class<VE2> mo16452b() {
        return VE2.class;
    }

    /* renamed from: g */
    public final void m73520g(J24<VE2> j24) throws GeneralSecurityException {
        for (List<J24.C3872c<VE2>> list : j24.m101280c()) {
            for (J24.C3872c<VE2> c3872c : list) {
                if (c3872c.m101266b() instanceof XE2) {
                    XE2 xe2 = (XE2) c3872c.m101266b();
                    Q70 m88906a = Q70.m88906a(c3872c.m101267a());
                    if (!m88906a.equals(xe2.mo13030b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + xe2.mo13031a() + " has wrong output prefix (" + xe2.mo13030b() + ") instead of (" + m88906a + ")");
                    }
                }
            }
        }
    }

    @Override // p000.K24
    /* renamed from: h */
    public VE2 mo16451c(J24<VE2> j24) throws GeneralSecurityException {
        m73520g(j24);
        return new C10162b(j24);
    }
}
