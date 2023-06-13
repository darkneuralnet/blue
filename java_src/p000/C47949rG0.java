package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
/* renamed from: rG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47949rG0 extends AbstractC10088Z {
    public C47949rG0(boolean z, int i, InterfaceC1693E interfaceC1693E) {
        super(z, i, interfaceC1693E);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        AbstractC7305S mo16142y = this.f47717d.mo13850c().mo16142y();
        c6617q.m89152v(z, (this.f47716c || mo16142y.mo16143w()) ? SyslogConstants.LOG_LOCAL4 : 128, this.f47715b);
        if (this.f47716c) {
            c6617q.m89155r(mo16142y.mo16144s());
        }
        c6617q.mo27601e().mo27600u(mo16142y, this.f47716c);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int m109016b;
        int mo16144s = this.f47717d.mo13850c().mo16142y().mo16144s();
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
        return this.f47716c || this.f47717d.mo13850c().mo16142y().mo16143w();
    }

    @Override // p000.AbstractC10088Z, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }
}
