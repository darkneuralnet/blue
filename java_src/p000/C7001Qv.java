package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Exception;
/* renamed from: Qv */
/* loaded from: classes8.dex */
public class C7001Qv extends AbstractC10088Z {
    public C7001Qv(boolean z, int i, InterfaceC1693E interfaceC1693E) {
        super(z, i, interfaceC1693E);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        Enumeration m79013D;
        c6617q.m89152v(z, SyslogConstants.LOG_LOCAL4, this.f47715b);
        c6617q.m89167f(128);
        if (this.f47716c) {
            c6617q.mo27600u(this.f47717d.mo13850c(), true);
        } else {
            InterfaceC1693E interfaceC1693E = this.f47717d;
            if (interfaceC1693E instanceof AbstractC5803O) {
                m79013D = interfaceC1693E instanceof C3812Iv ? ((C3812Iv) interfaceC1693E).m101482G() : new C3812Iv(((AbstractC5803O) interfaceC1693E).m93017C()).m101482G();
            } else if (interfaceC1693E instanceof AbstractC8166U) {
                m79013D = ((AbstractC8166U) interfaceC1693E).mo35871C();
            } else if (!(interfaceC1693E instanceof AbstractC8888W)) {
                throw new ASN1Exception("not implemented: " + this.f47717d.getClass().getName());
            } else {
                m79013D = ((AbstractC8888W) interfaceC1693E).m79013D();
            }
            c6617q.m89165h(m79013D);
        }
        c6617q.m89167f(0);
        c6617q.m89167f(0);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int m109016b;
        int mo16144s = this.f47717d.mo13850c().mo16144s();
        if (this.f47716c) {
            m109016b = ER5.m109016b(this.f47715b) + ER5.m109017a(mo16144s);
        } else {
            mo16144s--;
            m109016b = ER5.m109016b(this.f47715b);
        }
        return m109016b + mo16144s;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return this.f47716c || this.f47717d.mo13850c().mo16143w();
    }
}
