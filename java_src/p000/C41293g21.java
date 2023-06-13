package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p000.InterfaceC52235yV2;
import p000.J24;
/* renamed from: g21  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41293g21 implements K24<InterfaceC40107e21, InterfaceC40107e21> {

    /* renamed from: a */
    public static final Logger f81420a = Logger.getLogger(C41293g21.class.getName());

    /* renamed from: g21$a */
    /* loaded from: classes6.dex */
    public static class C20695a implements InterfaceC40107e21 {

        /* renamed from: a */
        public final J24<InterfaceC40107e21> f81421a;

        /* renamed from: b */
        public final InterfaceC52235yV2.InterfaceC30599a f81422b;

        /* renamed from: c */
        public final InterfaceC52235yV2.InterfaceC30599a f81423c;

        public C20695a(J24<InterfaceC40107e21> j24) {
            this.f81421a = j24;
            if (j24.m101274i()) {
                InterfaceC52235yV2 m6702a = C51067wX2.m6701b().m6702a();
                C52828zV2 m115715a = AV2.m115715a(j24);
                this.f81422b = m6702a.mo3445a(m115715a, "daead", "encrypt");
                this.f81423c = m6702a.mo3445a(m115715a, "daead", "decrypt");
                return;
            }
            InterfaceC52235yV2.InterfaceC30599a interfaceC30599a = AV2.f637a;
            this.f81422b = interfaceC30599a;
            this.f81423c = interfaceC30599a;
        }

        @Override // p000.InterfaceC40107e21
        /* renamed from: a */
        public byte[] mo40276a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (J24.C3872c<InterfaceC40107e21> c3872c : this.f81421a.m101277f(copyOf)) {
                    try {
                        byte[] mo40276a = c3872c.m101262f().mo40276a(copyOfRange, bArr2);
                        this.f81423c.mo3443b(c3872c.m101265c(), copyOfRange.length);
                        return mo40276a;
                    } catch (GeneralSecurityException e) {
                        Logger logger = C41293g21.f81420a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            for (J24.C3872c<InterfaceC40107e21> c3872c2 : this.f81421a.m101275h()) {
                try {
                    byte[] mo40276a2 = c3872c2.m101262f().mo40276a(bArr, bArr2);
                    this.f81423c.mo3443b(c3872c2.m101265c(), bArr.length);
                    return mo40276a2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f81423c.mo3444a();
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // p000.InterfaceC40107e21
        /* renamed from: b */
        public byte[] mo40275b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] m84297a = T70.m84297a(this.f81421a.m101278e().m101267a(), this.f81421a.m101278e().m101262f().mo40275b(bArr, bArr2));
                this.f81422b.mo3443b(this.f81421a.m101278e().m101265c(), bArr.length);
                return m84297a;
            } catch (GeneralSecurityException e) {
                this.f81422b.mo3444a();
                throw e;
            }
        }
    }

    /* renamed from: e */
    public static void m40278e() throws GeneralSecurityException {
        C34830Nt4.m93221m(new C41293g21());
    }

    @Override // p000.K24
    /* renamed from: a */
    public Class<InterfaceC40107e21> mo16453a() {
        return InterfaceC40107e21.class;
    }

    @Override // p000.K24
    /* renamed from: b */
    public Class<InterfaceC40107e21> mo16452b() {
        return InterfaceC40107e21.class;
    }

    @Override // p000.K24
    /* renamed from: f */
    public InterfaceC40107e21 mo16451c(J24<InterfaceC40107e21> j24) {
        return new C20695a(j24);
    }
}
