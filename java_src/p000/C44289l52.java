package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
/* renamed from: l52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44289l52 {

    /* renamed from: f */
    public static final C10776ad f95456f = C10776ad.m71007e();

    /* renamed from: a */
    public final HttpURLConnection f95457a;

    /* renamed from: b */
    public final M73 f95458b;

    /* renamed from: c */
    public long f95459c = -1;

    /* renamed from: d */
    public long f95460d = -1;

    /* renamed from: e */
    public final Timer f95461e;

    public C44289l52(HttpURLConnection httpURLConnection, Timer timer, M73 m73) {
        this.f95457a = httpURLConnection;
        this.f95458b = m73;
        this.f95461e = timer;
        m73.m95772u(httpURLConnection.getURL().toString());
    }

    /* renamed from: A */
    public boolean m27938A() {
        return this.f95457a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long m27937B() {
        m27911a0();
        return this.f95457a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream m27936C() throws IOException {
        try {
            OutputStream outputStream = this.f95457a.getOutputStream();
            if (outputStream != null) {
                return new C42510i52(outputStream, this.f95458b, this.f95461e);
            }
            return outputStream;
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }

    /* renamed from: D */
    public Permission m27935D() throws IOException {
        try {
            return this.f95457a.getPermission();
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }

    /* renamed from: E */
    public int m27934E() {
        return this.f95457a.getReadTimeout();
    }

    /* renamed from: F */
    public String m27933F() {
        return this.f95457a.getRequestMethod();
    }

    /* renamed from: G */
    public Map<String, List<String>> m27932G() {
        return this.f95457a.getRequestProperties();
    }

    /* renamed from: H */
    public String m27931H(String str) {
        return this.f95457a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int m27930I() throws IOException {
        m27911a0();
        if (this.f95460d == -1) {
            long m47036c = this.f95461e.m47036c();
            this.f95460d = m47036c;
            this.f95458b.m95773t(m47036c);
        }
        try {
            int responseCode = this.f95457a.getResponseCode();
            this.f95458b.m95781l(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }

    /* renamed from: J */
    public String m27929J() throws IOException {
        m27911a0();
        if (this.f95460d == -1) {
            long m47036c = this.f95461e.m47036c();
            this.f95460d = m47036c;
            this.f95458b.m95773t(m47036c);
        }
        try {
            String responseMessage = this.f95457a.getResponseMessage();
            this.f95458b.m95781l(this.f95457a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }

    /* renamed from: K */
    public URL m27928K() {
        return this.f95457a.getURL();
    }

    /* renamed from: L */
    public boolean m27927L() {
        return this.f95457a.getUseCaches();
    }

    /* renamed from: M */
    public void m27926M(boolean z) {
        this.f95457a.setAllowUserInteraction(z);
    }

    /* renamed from: N */
    public void m27925N(int i) {
        this.f95457a.setChunkedStreamingMode(i);
    }

    /* renamed from: O */
    public void m27924O(int i) {
        this.f95457a.setConnectTimeout(i);
    }

    /* renamed from: P */
    public void m27923P(boolean z) {
        this.f95457a.setDefaultUseCaches(z);
    }

    /* renamed from: Q */
    public void m27922Q(boolean z) {
        this.f95457a.setDoInput(z);
    }

    /* renamed from: R */
    public void m27921R(boolean z) {
        this.f95457a.setDoOutput(z);
    }

    /* renamed from: S */
    public void m27920S(int i) {
        this.f95457a.setFixedLengthStreamingMode(i);
    }

    /* renamed from: T */
    public void m27919T(long j) {
        this.f95457a.setFixedLengthStreamingMode(j);
    }

    /* renamed from: U */
    public void m27918U(long j) {
        this.f95457a.setIfModifiedSince(j);
    }

    /* renamed from: V */
    public void m27917V(boolean z) {
        this.f95457a.setInstanceFollowRedirects(z);
    }

    /* renamed from: W */
    public void m27916W(int i) {
        this.f95457a.setReadTimeout(i);
    }

    /* renamed from: X */
    public void m27915X(String str) throws ProtocolException {
        this.f95457a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void m27914Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f95458b.m95771v(str2);
        }
        this.f95457a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void m27913Z(boolean z) {
        this.f95457a.setUseCaches(z);
    }

    /* renamed from: a */
    public void m27912a(String str, String str2) {
        this.f95457a.addRequestProperty(str, str2);
    }

    /* renamed from: a0 */
    public final void m27911a0() {
        if (this.f95459c == -1) {
            this.f95461e.m47032h();
            long m47034e = this.f95461e.m47034e();
            this.f95459c = m47034e;
            this.f95458b.m95778o(m47034e);
        }
        String m27933F = m27933F();
        if (m27933F != null) {
            this.f95458b.m95782k(m27933F);
        } else if (m27896o()) {
            this.f95458b.m95782k("POST");
        } else {
            this.f95458b.m95782k("GET");
        }
    }

    /* renamed from: b */
    public void m27910b() throws IOException {
        if (this.f95459c == -1) {
            this.f95461e.m47032h();
            long m47034e = this.f95461e.m47034e();
            this.f95459c = m47034e;
            this.f95458b.m95778o(m47034e);
        }
        try {
            this.f95457a.connect();
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }

    /* renamed from: b0 */
    public boolean m27909b0() {
        return this.f95457a.usingProxy();
    }

    /* renamed from: c */
    public void m27908c() {
        this.f95458b.m95774s(this.f95461e.m47036c());
        this.f95458b.m95790b();
        this.f95457a.disconnect();
    }

    /* renamed from: d */
    public boolean m27907d() {
        return this.f95457a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int m27906e() {
        return this.f95457a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f95457a.equals(obj);
    }

    /* renamed from: f */
    public Object m27905f() throws IOException {
        m27911a0();
        this.f95458b.m95781l(this.f95457a.getResponseCode());
        try {
            Object content = this.f95457a.getContent();
            if (content instanceof InputStream) {
                this.f95458b.m95777p(this.f95457a.getContentType());
                return new C41917h52((InputStream) content, this.f95458b, this.f95461e);
            }
            this.f95458b.m95777p(this.f95457a.getContentType());
            this.f95458b.m95776q(this.f95457a.getContentLength());
            this.f95458b.m95774s(this.f95461e.m47036c());
            this.f95458b.m95790b();
            return content;
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }

    /* renamed from: g */
    public Object m27904g(Class[] clsArr) throws IOException {
        m27911a0();
        this.f95458b.m95781l(this.f95457a.getResponseCode());
        try {
            Object content = this.f95457a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f95458b.m95777p(this.f95457a.getContentType());
                return new C41917h52((InputStream) content, this.f95458b, this.f95461e);
            }
            this.f95458b.m95777p(this.f95457a.getContentType());
            this.f95458b.m95776q(this.f95457a.getContentLength());
            this.f95458b.m95774s(this.f95461e.m47036c());
            this.f95458b.m95790b();
            return content;
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }

    /* renamed from: h */
    public String m27903h() {
        m27911a0();
        return this.f95457a.getContentEncoding();
    }

    public int hashCode() {
        return this.f95457a.hashCode();
    }

    /* renamed from: i */
    public int m27902i() {
        m27911a0();
        return this.f95457a.getContentLength();
    }

    /* renamed from: j */
    public long m27901j() {
        m27911a0();
        return this.f95457a.getContentLengthLong();
    }

    /* renamed from: k */
    public String m27900k() {
        m27911a0();
        return this.f95457a.getContentType();
    }

    /* renamed from: l */
    public long m27899l() {
        m27911a0();
        return this.f95457a.getDate();
    }

    /* renamed from: m */
    public boolean m27898m() {
        return this.f95457a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean m27897n() {
        return this.f95457a.getDoInput();
    }

    /* renamed from: o */
    public boolean m27896o() {
        return this.f95457a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream m27895p() {
        m27911a0();
        try {
            this.f95458b.m95781l(this.f95457a.getResponseCode());
        } catch (IOException unused) {
            f95456f.m71011a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f95457a.getErrorStream();
        if (errorStream != null) {
            return new C41917h52(errorStream, this.f95458b, this.f95461e);
        }
        return errorStream;
    }

    /* renamed from: q */
    public long m27894q() {
        m27911a0();
        return this.f95457a.getExpiration();
    }

    /* renamed from: r */
    public String m27893r(int i) {
        m27911a0();
        return this.f95457a.getHeaderField(i);
    }

    /* renamed from: s */
    public String m27892s(String str) {
        m27911a0();
        return this.f95457a.getHeaderField(str);
    }

    /* renamed from: t */
    public long m27891t(String str, long j) {
        m27911a0();
        return this.f95457a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.f95457a.toString();
    }

    /* renamed from: u */
    public int m27890u(String str, int i) {
        m27911a0();
        return this.f95457a.getHeaderFieldInt(str, i);
    }

    /* renamed from: v */
    public String m27889v(int i) {
        m27911a0();
        return this.f95457a.getHeaderFieldKey(i);
    }

    /* renamed from: w */
    public long m27888w(String str, long j) {
        m27911a0();
        return this.f95457a.getHeaderFieldLong(str, j);
    }

    /* renamed from: x */
    public Map<String, List<String>> m27887x() {
        m27911a0();
        return this.f95457a.getHeaderFields();
    }

    /* renamed from: y */
    public long m27886y() {
        return this.f95457a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream m27885z() throws IOException {
        m27911a0();
        this.f95458b.m95781l(this.f95457a.getResponseCode());
        this.f95458b.m95777p(this.f95457a.getContentType());
        try {
            InputStream inputStream = this.f95457a.getInputStream();
            if (inputStream != null) {
                return new C41917h52(inputStream, this.f95458b, this.f95461e);
            }
            return inputStream;
        } catch (IOException e) {
            this.f95458b.m95774s(this.f95461e.m47036c());
            N73.m94350d(this.f95458b);
            throw e;
        }
    }
}
