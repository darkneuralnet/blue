package p000;

import android.content.Context;
import java.net.URI;
import p000.L73;
/* renamed from: tn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49445tn1 extends AbstractC45077mQ3 {

    /* renamed from: c */
    public static final C10776ad f111009c = C10776ad.m71007e();

    /* renamed from: a */
    public final L73 f111010a;

    /* renamed from: b */
    public final Context f111011b;

    public C49445tn1(L73 l73, Context context) {
        this.f111011b = context;
        this.f111010a = l73;
    }

    @Override // p000.AbstractC45077mQ3
    /* renamed from: c */
    public boolean mo6338c() {
        L73.EnumC4741d enumC4741d;
        if (m11787j(this.f111010a.m97709w0())) {
            C10776ad c10776ad = f111009c;
            c10776ad.m71002j("URL is missing:" + this.f111010a.m97709w0());
            return false;
        }
        URI m11790g = m11790g(this.f111010a.m97709w0());
        if (m11790g == null) {
            f111009c.m71002j("URL cannot be parsed");
            return false;
        } else if (!m11789h(m11790g, this.f111011b)) {
            C10776ad c10776ad2 = f111009c;
            c10776ad2.m71002j("URL fails allowlist rule: " + m11790g);
            return false;
        } else if (!m11786k(m11790g.getHost())) {
            f111009c.m71002j("URL host is null or invalid");
            return false;
        } else if (!m11781p(m11790g.getScheme())) {
            f111009c.m71002j("URL scheme is null or invalid");
            return false;
        } else if (!m11779r(m11790g.getUserInfo())) {
            f111009c.m71002j("URL user info is null");
            return false;
        } else if (!m11782o(m11790g.getPort())) {
            f111009c.m71002j("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.f111010a.m97707y0()) {
                enumC4741d = this.f111010a.m97718n0();
            } else {
                enumC4741d = null;
            }
            if (!m11785l(enumC4741d)) {
                C10776ad c10776ad3 = f111009c;
                c10776ad3.m71002j("HTTP Method is null or invalid: " + this.f111010a.m97718n0());
                return false;
            } else if (this.f111010a.m97706z0() && !m11784m(this.f111010a.m97717o0())) {
                C10776ad c10776ad4 = f111009c;
                c10776ad4.m71002j("HTTP ResponseCode is a negative value:" + this.f111010a.m97717o0());
                return false;
            } else if (this.f111010a.m97754A0() && !m11783n(this.f111010a.m97715q0())) {
                C10776ad c10776ad5 = f111009c;
                c10776ad5.m71002j("Request Payload is a negative value:" + this.f111010a.m97715q0());
                return false;
            } else if (this.f111010a.m97753B0() && !m11783n(this.f111010a.m97713s0())) {
                C10776ad c10776ad6 = f111009c;
                c10776ad6.m71002j("Response Payload is a negative value:" + this.f111010a.m97713s0());
                return false;
            } else if (this.f111010a.m97708x0() && this.f111010a.m97720l0() > 0) {
                if (this.f111010a.m97752C0() && !m11780q(this.f111010a.m97712t0())) {
                    C10776ad c10776ad7 = f111009c;
                    c10776ad7.m71002j("Time to complete the request is a negative value:" + this.f111010a.m97712t0());
                    return false;
                } else if (this.f111010a.m97750E0() && !m11780q(this.f111010a.m97710v0())) {
                    C10776ad c10776ad8 = f111009c;
                    c10776ad8.m71002j("Time from the start of the request to the start of the response is null or a negative value:" + this.f111010a.m97710v0());
                    return false;
                } else if (this.f111010a.m97751D0() && this.f111010a.m97711u0() > 0) {
                    if (!this.f111010a.m97706z0()) {
                        f111009c.m71002j("Did not receive a HTTP Response Code");
                        return false;
                    }
                    return true;
                } else {
                    C10776ad c10776ad9 = f111009c;
                    c10776ad9.m71002j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f111010a.m97711u0());
                    return false;
                }
            } else {
                C10776ad c10776ad10 = f111009c;
                c10776ad10.m71002j("Start time of the request is null, or zero, or a negative value:" + this.f111010a.m97720l0());
                return false;
            }
        }
    }

    /* renamed from: g */
    public final URI m11790g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f111009c.m71001k("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public final boolean m11789h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return C42828id6.m33719a(uri, context);
    }

    /* renamed from: i */
    public final boolean m11788i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: j */
    public final boolean m11787j(String str) {
        return m11788i(str);
    }

    /* renamed from: k */
    public final boolean m11786k(String str) {
        return (str == null || m11788i(str) || str.length() > 255) ? false : true;
    }

    /* renamed from: l */
    public boolean m11785l(L73.EnumC4741d enumC4741d) {
        return (enumC4741d == null || enumC4741d == L73.EnumC4741d.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    /* renamed from: m */
    public final boolean m11784m(int i) {
        return i > 0;
    }

    /* renamed from: n */
    public final boolean m11783n(long j) {
        return j >= 0;
    }

    /* renamed from: o */
    public final boolean m11782o(int i) {
        return i == -1 || i > 0;
    }

    /* renamed from: p */
    public final boolean m11781p(String str) {
        if (str == null) {
            return false;
        }
        if (!"http".equalsIgnoreCase(str) && !"https".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m11780q(long j) {
        return j >= 0;
    }

    /* renamed from: r */
    public final boolean m11779r(String str) {
        return str == null;
    }
}
