package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p000.InterfaceC52235yV2;
import p000.J24;
/* renamed from: r8 */
/* loaded from: classes6.dex */
public class C27852r8 implements K24<InterfaceC27152p8, InterfaceC27152p8> {

    /* renamed from: a */
    public static final Logger f106506a = Logger.getLogger(C27852r8.class.getName());

    /* renamed from: r8$b */
    /* loaded from: classes6.dex */
    public static class C27854b implements InterfaceC27152p8 {

        /* renamed from: a */
        public final J24<InterfaceC27152p8> f106507a;

        /* renamed from: b */
        public final InterfaceC52235yV2.InterfaceC30599a f106508b;

        /* renamed from: c */
        public final InterfaceC52235yV2.InterfaceC30599a f106509c;

        @Override // p000.InterfaceC27152p8
        /* renamed from: a */
        public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] m84297a = T70.m84297a(this.f106507a.m101278e().m101267a(), this.f106507a.m101278e().m101262f().mo3716a(bArr, bArr2));
                this.f106508b.mo3443b(this.f106507a.m101278e().m101265c(), bArr.length);
                return m84297a;
            } catch (GeneralSecurityException e) {
                this.f106508b.mo3444a();
                throw e;
            }
        }

        @Override // p000.InterfaceC27152p8
        /* renamed from: b */
        public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (J24.C3872c<InterfaceC27152p8> c3872c : this.f106507a.m101277f(copyOf)) {
                    try {
                        byte[] mo3715b = c3872c.m101262f().mo3715b(copyOfRange, bArr2);
                        this.f106509c.mo3443b(c3872c.m101265c(), copyOfRange.length);
                        return mo3715b;
                    } catch (GeneralSecurityException e) {
                        Logger logger = C27852r8.f106506a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            for (J24.C3872c<InterfaceC27152p8> c3872c2 : this.f106507a.m101275h()) {
                try {
                    byte[] mo3715b2 = c3872c2.m101262f().mo3715b(bArr, bArr2);
                    this.f106509c.mo3443b(c3872c2.m101265c(), bArr.length);
                    return mo3715b2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f106509c.mo3444a();
            throw new GeneralSecurityException("decryption failed");
        }

        public C27854b(J24<InterfaceC27152p8> j24) {
            this.f106507a = j24;
            if (j24.m101274i()) {
                InterfaceC52235yV2 m6702a = C51067wX2.m6701b().m6702a();
                C52828zV2 m115715a = AV2.m115715a(j24);
                this.f106508b = m6702a.mo3445a(m115715a, "aead", "encrypt");
                this.f106509c = m6702a.mo3445a(m115715a, "aead", "decrypt");
                return;
            }
            InterfaceC52235yV2.InterfaceC30599a interfaceC30599a = AV2.f637a;
            this.f106508b = interfaceC30599a;
            this.f106509c = interfaceC30599a;
        }
    }

    /* renamed from: e */
    public static void m16449e() throws GeneralSecurityException {
        C34830Nt4.m93221m(new C27852r8());
    }

    @Override // p000.K24
    /* renamed from: a */
    public Class<InterfaceC27152p8> mo16453a() {
        return InterfaceC27152p8.class;
    }

    @Override // p000.K24
    /* renamed from: b */
    public Class<InterfaceC27152p8> mo16452b() {
        return InterfaceC27152p8.class;
    }

    @Override // p000.K24
    /* renamed from: f */
    public InterfaceC27152p8 mo16451c(J24<InterfaceC27152p8> j24) throws GeneralSecurityException {
        return new C27854b(j24);
    }
}
