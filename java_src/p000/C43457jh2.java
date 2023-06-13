package p000;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.JOSEException;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: jh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43457jh2 extends AbstractC32839Fg2 {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    public final C42864ih2 f93176d;

    /* renamed from: e */
    public final String f93177e;

    /* renamed from: f */
    public C3824Iy f93178f;

    /* renamed from: g */
    public final AtomicReference<EnumC24986a> f93179g;

    /* renamed from: jh2$a */
    /* loaded from: classes6.dex */
    public enum EnumC24986a {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public C43457jh2(C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3) throws ParseException {
        this(c3824Iy, new C50367vL3(c3824Iy2), c3824Iy3);
    }

    /* renamed from: k */
    public static C43457jh2 m30098k(String str) throws ParseException {
        C3824Iy[] m106752e = AbstractC32839Fg2.m106752e(str);
        if (m106752e.length == 3) {
            return new C43457jh2(m106752e[0], m106752e[1], m106752e[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    /* renamed from: f */
    public final String m30103f() {
        if (this.f93176d.m33575t()) {
            return m30101h().m3723h().toString() + CoreConstants.DOT + m106754b().m8885c().toString();
        }
        return m30101h().m3723h().toString() + CoreConstants.DOT + m106754b().toString();
    }

    /* renamed from: g */
    public final void m30102g() {
        if (this.f93179g.get() != EnumC24986a.SIGNED && this.f93179g.get() != EnumC24986a.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    /* renamed from: h */
    public C42864ih2 m30101h() {
        return this.f93176d;
    }

    /* renamed from: i */
    public C3824Iy m30100i() {
        return this.f93178f;
    }

    /* renamed from: j */
    public byte[] m30099j() {
        return this.f93177e.getBytes(C48618sO5.f108725a);
    }

    /* renamed from: l */
    public String m30097l() {
        return m30096m(false);
    }

    /* renamed from: m */
    public String m30096m(boolean z) {
        m30102g();
        if (z) {
            return this.f93176d.m3723h().toString() + CoreConstants.DOT + CoreConstants.DOT + this.f93178f.toString();
        }
        return this.f93177e + CoreConstants.DOT + this.f93178f.toString();
    }

    /* renamed from: n */
    public synchronized boolean m30095n(InterfaceC44050kh2 interfaceC44050kh2) throws JOSEException {
        boolean mo15406b;
        m30102g();
        try {
            mo15406b = interfaceC44050kh2.mo15406b(m30101h(), m30099j(), m30100i());
            if (mo15406b) {
                this.f93179g.set(EnumC24986a.VERIFIED);
            }
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
        return mo15406b;
    }

    public C43457jh2(C3824Iy c3824Iy, C50367vL3 c50367vL3, C3824Iy c3824Iy2) throws ParseException {
        AtomicReference<EnumC24986a> atomicReference = new AtomicReference<>();
        this.f93179g = atomicReference;
        if (c3824Iy != null) {
            try {
                this.f93176d = C42864ih2.m33574u(c3824Iy);
                if (c50367vL3 != null) {
                    mo97635d(c50367vL3);
                    this.f93177e = m30103f();
                    if (c3824Iy2 != null) {
                        this.f93178f = c3824Iy2;
                        atomicReference.set(EnumC24986a.SIGNED);
                        if (m30101h().m33575t()) {
                            m106753c(c3824Iy, c50367vL3.m8885c(), c3824Iy2);
                            return;
                        } else {
                            m106753c(c3824Iy, new C3824Iy(""), c3824Iy2);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("The third part must not be null");
                }
                throw new IllegalArgumentException("The payload (second part) must not be null");
            } catch (ParseException e) {
                throw new ParseException("Invalid JWS header: " + e.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
