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
/* renamed from: j52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43103j52 extends HttpURLConnection {

    /* renamed from: a */
    public final C44289l52 f92123a;

    public C43103j52(HttpURLConnection httpURLConnection, Timer timer, M73 m73) {
        super(httpURLConnection.getURL());
        this.f92123a = new C44289l52(httpURLConnection, timer, m73);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f92123a.m27912a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f92123a.m27910b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f92123a.m27908c();
    }

    public boolean equals(Object obj) {
        return this.f92123a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f92123a.m27907d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f92123a.m27906e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f92123a.m27905f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f92123a.m27903h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f92123a.m27902i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f92123a.m27901j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f92123a.m27900k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f92123a.m27899l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f92123a.m27898m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f92123a.m27897n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f92123a.m27896o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f92123a.m27895p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f92123a.m27894q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f92123a.m27893r(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f92123a.m27891t(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f92123a.m27890u(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f92123a.m27889v(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.f92123a.m27888w(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f92123a.m27887x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f92123a.m27886y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f92123a.m27885z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f92123a.m27938A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f92123a.m27937B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f92123a.m27936C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f92123a.m27935D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f92123a.m27934E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f92123a.m27933F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f92123a.m27932G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f92123a.m27931H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f92123a.m27930I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f92123a.m27929J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f92123a.m27928K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f92123a.m27927L();
    }

    public int hashCode() {
        return this.f92123a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f92123a.m27926M(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.f92123a.m27925N(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f92123a.m27924O(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f92123a.m27923P(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f92123a.m27922Q(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f92123a.m27921R(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.f92123a.m27920S(i);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f92123a.m27918U(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.f92123a.m27917V(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f92123a.m27916W(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f92123a.m27915X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f92123a.m27914Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f92123a.m27913Z(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f92123a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f92123a.m27909b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f92123a.m27904g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f92123a.m27892s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.f92123a.m27919T(j);
    }
}
