package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: k52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43696k52 extends HttpsURLConnection {

    /* renamed from: a */
    public final C44289l52 f93883a;

    /* renamed from: b */
    public final HttpsURLConnection f93884b;

    public C43696k52(HttpsURLConnection httpsURLConnection, Timer timer, M73 m73) {
        super(httpsURLConnection.getURL());
        this.f93884b = httpsURLConnection;
        this.f93883a = new C44289l52(httpsURLConnection, timer, m73);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f93883a.m27912a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f93883a.m27910b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f93883a.m27908c();
    }

    public boolean equals(Object obj) {
        return this.f93883a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f93883a.m27907d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f93884b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f93883a.m27906e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f93883a.m27905f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f93883a.m27903h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f93883a.m27902i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f93883a.m27901j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f93883a.m27900k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f93883a.m27899l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f93883a.m27898m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f93883a.m27897n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f93883a.m27896o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f93883a.m27895p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f93883a.m27894q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f93883a.m27893r(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f93883a.m27891t(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f93883a.m27890u(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f93883a.m27889v(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.f93883a.m27888w(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f93883a.m27887x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f93884b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f93883a.m27886y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f93883a.m27885z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f93883a.m27938A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f93883a.m27937B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f93884b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f93884b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f93883a.m27936C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f93884b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f93883a.m27935D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f93883a.m27934E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f93883a.m27933F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f93883a.m27932G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f93883a.m27931H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f93883a.m27930I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f93883a.m27929J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f93884b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f93884b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f93883a.m27928K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f93883a.m27927L();
    }

    public int hashCode() {
        return this.f93883a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f93883a.m27926M(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.f93883a.m27925N(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f93883a.m27924O(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f93883a.m27923P(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f93883a.m27922Q(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f93883a.m27921R(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.f93883a.m27920S(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f93884b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f93883a.m27918U(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.f93883a.m27917V(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f93883a.m27916W(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f93883a.m27915X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f93883a.m27914Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f93884b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f93883a.m27913Z(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f93883a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f93883a.m27909b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f93883a.m27904g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f93883a.m27892s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.f93883a.m27919T(j);
    }
}
