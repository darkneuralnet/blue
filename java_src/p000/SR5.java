package p000;

import java.io.IOException;
/* renamed from: SR5 */
/* loaded from: classes8.dex */
public class SR5 extends AbstractC30923zA {

    /* renamed from: a */
    public final Appendable f33677a;

    public SR5() {
        this(new StringBuilder());
    }

    /* renamed from: k */
    public static String m85472k(InterfaceC37153Xr5 interfaceC37153Xr5) {
        return m85471l(interfaceC37153Xr5);
    }

    /* renamed from: l */
    public static String m85471l(InterfaceC37153Xr5 interfaceC37153Xr5) {
        return new SR5().mo1734c(interfaceC37153Xr5).toString();
    }

    @Override // p000.AbstractC30923zA
    /* renamed from: d */
    public void mo1733d(char c) {
        try {
            this.f33677a.append(c);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    @Override // p000.AbstractC30923zA
    /* renamed from: e */
    public void mo1732e(String str) {
        try {
            this.f33677a.append(str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public String toString() {
        return this.f33677a.toString();
    }

    public SR5(Appendable appendable) {
        this.f33677a = appendable;
    }
}
