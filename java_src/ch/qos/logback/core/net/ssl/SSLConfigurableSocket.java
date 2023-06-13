package ch.qos.logback.core.net.ssl;

import android.annotation.TargetApi;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class SSLConfigurableSocket implements SSLConfigurable {
    private final SSLSocket delegate;

    public SSLConfigurableSocket(SSLSocket sSLSocket) {
        this.delegate = sSLSocket;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getDefaultCipherSuites() {
        return this.delegate.getEnabledCipherSuites();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getDefaultProtocols() {
        return this.delegate.getEnabledProtocols();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public String[] getSupportedProtocols() {
        return this.delegate.getSupportedProtocols();
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setEnabledCipherSuites(String[] strArr) {
        this.delegate.setEnabledCipherSuites(strArr);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setEnabledProtocols(String[] strArr) {
        this.delegate.setEnabledProtocols(strArr);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    @TargetApi(24)
    public void setHostnameVerification(boolean z) {
        if (z) {
            SSLParameters sSLParameters = this.delegate.getSSLParameters();
            sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
            this.delegate.setSSLParameters(sSLParameters);
        }
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setNeedClientAuth(boolean z) {
        this.delegate.setNeedClientAuth(z);
    }

    @Override // ch.qos.logback.core.net.ssl.SSLConfigurable
    public void setWantClientAuth(boolean z) {
        this.delegate.setWantClientAuth(z);
    }
}
