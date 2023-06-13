package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
/* renamed from: hn2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42331hn2 extends AbstractC8166U {

    /* renamed from: c */
    public byte[] f85885c;

    public C42331hn2(byte[] bArr) throws IOException {
        this.f85885c = bArr;
    }

    @Override // p000.AbstractC8166U
    /* renamed from: A */
    public synchronized InterfaceC1693E mo35872A(int i) {
        m35869E();
        return super.mo35872A(i);
    }

    @Override // p000.AbstractC8166U
    /* renamed from: C */
    public synchronized Enumeration mo35871C() {
        byte[] bArr = this.f85885c;
        if (bArr != null) {
            return new C40552en2(bArr);
        }
        return super.mo35871C();
    }

    @Override // p000.AbstractC8166U
    /* renamed from: D */
    public InterfaceC1693E[] mo35870D() {
        m35869E();
        return super.mo35870D();
    }

    /* renamed from: E */
    public final void m35869E() {
        if (this.f85885c != null) {
            C2042F c2042f = new C2042F();
            C40552en2 c40552en2 = new C40552en2(this.f85885c);
            while (c40552en2.hasMoreElements()) {
                c2042f.m108151a((AbstractC7305S) c40552en2.nextElement());
            }
            this.f36590b = c2042f.m108145g();
            this.f85885c = null;
        }
    }

    @Override // p000.AbstractC8166U, p000.AbstractC7305S, p000.AbstractC5142M
    public synchronized int hashCode() {
        m35869E();
        return super.hashCode();
    }

    @Override // p000.AbstractC8166U, java.lang.Iterable
    public synchronized Iterator<InterfaceC1693E> iterator() {
        m35869E();
        return super.iterator();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public synchronized void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        byte[] bArr = this.f85885c;
        if (bArr != null) {
            c6617q.m89159n(z, 48, bArr);
        } else {
            super.mo16142y().mo16145o(c6617q, z);
        }
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public synchronized int mo16144s() throws IOException {
        byte[] bArr = this.f85885c;
        if (bArr != null) {
            return ER5.m109017a(bArr.length) + 1 + this.f85885c.length;
        }
        return super.mo16142y().mo16144s();
    }

    @Override // p000.AbstractC8166U
    public synchronized int size() {
        m35869E();
        return super.size();
    }

    @Override // p000.AbstractC8166U, p000.AbstractC7305S
    /* renamed from: x */
    public synchronized AbstractC7305S mo35868x() {
        m35869E();
        return super.mo35868x();
    }

    @Override // p000.AbstractC8166U, p000.AbstractC7305S
    /* renamed from: y */
    public synchronized AbstractC7305S mo16142y() {
        m35869E();
        return super.mo16142y();
    }
}
