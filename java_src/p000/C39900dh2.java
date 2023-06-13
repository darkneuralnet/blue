package p000;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.JOSEException;
import java.text.ParseException;
/* renamed from: dh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39900dh2 extends AbstractC32839Fg2 {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    public C38696bh2 f77043d;

    /* renamed from: e */
    public C3824Iy f77044e;

    /* renamed from: f */
    public C3824Iy f77045f;

    /* renamed from: g */
    public C3824Iy f77046g;

    /* renamed from: h */
    public C3824Iy f77047h;

    /* renamed from: i */
    public EnumC19840a f77048i;

    /* renamed from: dh2$a */
    /* loaded from: classes6.dex */
    public enum EnumC19840a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public C39900dh2(C38696bh2 c38696bh2, C50367vL3 c50367vL3) {
        if (c38696bh2 != null) {
            this.f77043d = c38696bh2;
            if (c50367vL3 != null) {
                mo97635d(c50367vL3);
                this.f77044e = null;
                this.f77046g = null;
                this.f77048i = EnumC19840a.UNENCRYPTED;
                return;
            }
            throw new IllegalArgumentException("The payload must not be null");
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    /* renamed from: q */
    public static C39900dh2 m43885q(String str) throws ParseException {
        C3824Iy[] m106752e = AbstractC32839Fg2.m106752e(str);
        if (m106752e.length == 5) {
            return new C39900dh2(m106752e[0], m106752e[1], m106752e[2], m106752e[3], m106752e[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    /* renamed from: f */
    public synchronized void m43896f(InterfaceC37519Zg2 interfaceC37519Zg2) throws JOSEException {
        m43893i();
        try {
            mo97635d(new C50367vL3(interfaceC37519Zg2.mo43301a(m43887o(), m43888n(), m43886p(), m43889m(), m43890l())));
            this.f77048i = EnumC19840a.DECRYPTED;
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    /* renamed from: g */
    public synchronized void m43895g(InterfaceC38103ah2 interfaceC38103ah2) throws JOSEException {
        m43891k();
        m43892j(interfaceC38103ah2);
        try {
            C37285Yg2 encrypt = interfaceC38103ah2.encrypt(m43887o(), m106754b().m8884d());
            if (encrypt.m74468d() != null) {
                this.f77043d = encrypt.m74468d();
            }
            this.f77044e = encrypt.m74469c();
            this.f77045f = encrypt.m74467e();
            this.f77046g = encrypt.m74470b();
            this.f77047h = encrypt.m74471a();
            this.f77048i = EnumC19840a.ENCRYPTED;
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    /* renamed from: h */
    public final void m43894h() {
        EnumC19840a enumC19840a = this.f77048i;
        if (enumC19840a != EnumC19840a.ENCRYPTED && enumC19840a != EnumC19840a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    /* renamed from: i */
    public final void m43893i() {
        if (this.f77048i == EnumC19840a.ENCRYPTED) {
            return;
        }
        throw new IllegalStateException("The JWE object must be in an encrypted state");
    }

    /* renamed from: j */
    public final void m43892j(InterfaceC38103ah2 interfaceC38103ah2) throws JOSEException {
        if (interfaceC38103ah2.supportedJWEAlgorithms().contains(m43887o().m64169r())) {
            if (interfaceC38103ah2.supportedEncryptionMethods().contains(m43887o().m64167t())) {
                return;
            }
            throw new JOSEException("The " + m43887o().m64167t() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + interfaceC38103ah2.supportedEncryptionMethods());
        }
        throw new JOSEException("The " + m43887o().m64169r() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + interfaceC38103ah2.supportedJWEAlgorithms());
    }

    /* renamed from: k */
    public final void m43891k() {
        if (this.f77048i == EnumC19840a.UNENCRYPTED) {
            return;
        }
        throw new IllegalStateException("The JWE object must be in an unencrypted state");
    }

    /* renamed from: l */
    public C3824Iy m43890l() {
        return this.f77047h;
    }

    /* renamed from: m */
    public C3824Iy m43889m() {
        return this.f77046g;
    }

    /* renamed from: n */
    public C3824Iy m43888n() {
        return this.f77044e;
    }

    /* renamed from: o */
    public C38696bh2 m43887o() {
        return this.f77043d;
    }

    /* renamed from: p */
    public C3824Iy m43886p() {
        return this.f77045f;
    }

    /* renamed from: r */
    public String m43884r() {
        m43894h();
        StringBuilder sb = new StringBuilder(this.f77043d.m3723h().toString());
        sb.append(CoreConstants.DOT);
        C3824Iy c3824Iy = this.f77044e;
        if (c3824Iy != null) {
            sb.append(c3824Iy);
        }
        sb.append(CoreConstants.DOT);
        C3824Iy c3824Iy2 = this.f77045f;
        if (c3824Iy2 != null) {
            sb.append(c3824Iy2);
        }
        sb.append(CoreConstants.DOT);
        sb.append(this.f77046g);
        sb.append(CoreConstants.DOT);
        C3824Iy c3824Iy3 = this.f77047h;
        if (c3824Iy3 != null) {
            sb.append(c3824Iy3);
        }
        return sb.toString();
    }

    public C39900dh2(C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3, C3824Iy c3824Iy4, C3824Iy c3824Iy5) throws ParseException {
        if (c3824Iy != null) {
            try {
                this.f77043d = C38696bh2.m64165v(c3824Iy);
                if (c3824Iy2 != null && !c3824Iy2.toString().isEmpty()) {
                    this.f77044e = c3824Iy2;
                } else {
                    this.f77044e = null;
                }
                if (c3824Iy3 != null && !c3824Iy3.toString().isEmpty()) {
                    this.f77045f = c3824Iy3;
                } else {
                    this.f77045f = null;
                }
                if (c3824Iy4 != null) {
                    this.f77046g = c3824Iy4;
                    if (c3824Iy5 != null && !c3824Iy5.toString().isEmpty()) {
                        this.f77047h = c3824Iy5;
                    } else {
                        this.f77047h = null;
                    }
                    this.f77048i = EnumC19840a.ENCRYPTED;
                    m106753c(c3824Iy, c3824Iy2, c3824Iy3, c3824Iy4, c3824Iy5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e) {
                throw new ParseException("Invalid JWE header: " + e.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
