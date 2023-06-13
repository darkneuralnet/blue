package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
/* renamed from: AN6 */
/* loaded from: classes8.dex */
public final class AN6 extends SSLSocketFactory {

    /* renamed from: a */
    public TrustManager[] f458a;

    /* renamed from: b */
    public SSLContext f459b;

    /* renamed from: c */
    public SSLSocketFactory f460c;

    /* renamed from: d */
    public TrustManager[] f461d;

    private AN6() {
        try {
            this.f459b = SSLContext.getInstance("TLS");
            TrustManager[] m115838c = m115838c();
            this.f461d = m115838c;
            this.f459b.init(null, m115838c, null);
            this.f460c = this.f459b.getSocketFactory();
        } catch (Exception e) {
            KJ6.m99011b(AN6.class, 3, e);
        }
    }

    /* renamed from: a */
    public static AN6 m115840a() {
        return new AN6();
    }

    /* renamed from: b */
    public final Socket m115839b(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            ArrayList arrayList = new ArrayList(Arrays.asList(sSLSocket.getSupportedProtocols()));
            arrayList.retainAll(Arrays.asList("TLSv1.2", "TLSv1.1", "TLSv1"));
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        return socket;
    }

    /* renamed from: c */
    public final TrustManager[] m115838c() {
        if (this.f458a == null) {
            try {
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                for (Certificate certificate : CertificateFactory.getInstance("X.509").generateCertificates(C43253jL3.m30766a())) {
                    if (certificate instanceof X509Certificate) {
                        keyStore.setCertificateEntry(((X509Certificate) certificate).getSubjectDN().getName(), certificate);
                    }
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                this.f461d = trustManagerFactory.getTrustManagers();
            } catch (Exception e) {
                KJ6.m99011b(AN6.class, 3, e);
            }
            this.f458a = this.f461d;
        }
        return this.f458a;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return m115839b(this.f460c.createSocket(str, i));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f460c.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f460c.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m115839b(this.f460c.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m115839b(this.f460c.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m115839b(this.f460c.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m115839b(this.f460c.createSocket(socket, str, i, z));
    }
}
