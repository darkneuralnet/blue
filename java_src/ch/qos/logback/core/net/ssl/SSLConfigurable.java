package ch.qos.logback.core.net.ssl;
/* loaded from: classes.dex */
public interface SSLConfigurable {
    String[] getDefaultCipherSuites();

    String[] getDefaultProtocols();

    String[] getSupportedCipherSuites();

    String[] getSupportedProtocols();

    void setEnabledCipherSuites(String[] strArr);

    void setEnabledProtocols(String[] strArr);

    void setHostnameVerification(boolean z);

    void setNeedClientAuth(boolean z);

    void setWantClientAuth(boolean z);
}
