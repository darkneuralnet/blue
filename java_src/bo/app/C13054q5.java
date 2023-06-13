package bo.app;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016¨\u0006\u0017"}, m28432d2 = {"Lbo/app/q5;", "Ljavax/net/ssl/SSLSocketFactory;", "Ljava/net/Socket;", "socket", C17296a.f69688o, "", "", "getDefaultCipherSuites", "()[Ljava/lang/String;", "getSupportedCipherSuites", "createSocket", "host", "", "port", "", "autoClose", "Ljava/net/InetAddress;", "localHost", "localPort", PaymentMethod.BillingDetails.PARAM_ADDRESS, "localAddress", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.q5 */
/* loaded from: classes.dex */
public final class C13054q5 extends SSLSocketFactory {

    /* renamed from: b */
    public static final C13055a f59132b = new C13055a(null);

    /* renamed from: a */
    private SSLSocketFactory f59133a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbo/app/q5$a;", "", "", "SSL_V3_PROTOCOL", "Ljava/lang/String;", "TLS_PROTOCOL", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q5$a */
    /* loaded from: classes.dex */
    public static final class C13055a {
        public /* synthetic */ C13055a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13055a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q5$b */
    /* loaded from: classes.dex */
    public static final class C13056b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ List<String> f59134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13056b(List<String> list) {
            super(0);
            this.f59134b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Enabling SSL protocols: ", this.f59134b);
        }
    }

    public C13054q5() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "sslContext.socketFactory");
        this.f59133a = socketFactory;
    }

    /* renamed from: a */
    private final Socket m63090a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            Intrinsics.checkNotNullExpressionValue(supportedProtocols, "socket.supportedProtocols");
            int length = supportedProtocols.length;
            int i = 0;
            while (i < length) {
                String protocol = supportedProtocols[i];
                i++;
                if (!Intrinsics.areEqual(protocol, "SSLv3")) {
                    Intrinsics.checkNotNullExpressionValue(protocol, "protocol");
                    arrayList.add(protocol);
                }
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13056b(arrayList), 6, null);
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                sSLSocket.setEnabledProtocols((String[]) array);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = this.f59133a.createSocket();
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket()");
        return m63090a(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f59133a.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f59133a.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String host, int i, boolean z) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f59133a.createSocket(socket, host, i, z);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory…t, host, port, autoClose)");
        return m63090a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f59133a.createSocket(host, i);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return m63090a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i, InetAddress localHost, int i2) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket createSocket = this.f59133a.createSocket(host, i, localHost, i2);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return m63090a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i) {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket createSocket = this.f59133a.createSocket(host, i);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return m63090a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i, InetAddress localAddress, int i2) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket createSocket = this.f59133a.createSocket(address, i, localAddress, i2);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return m63090a(createSocket);
    }
}
