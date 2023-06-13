package p000;

import java.io.Serializable;
/* renamed from: Xs5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37162Xs5<T> extends AbstractC0919CB<T> implements Serializable {

    /* renamed from: b */
    public final String f44117b;

    public C37162Xs5(InterfaceC52747zM2<T> interfaceC52747zM2) {
        this.f44117b = SR5.m85472k(interfaceC52747zM2);
    }

    /* renamed from: b */
    public static <T> InterfaceC52747zM2<T> m76180b(InterfaceC52747zM2<T> interfaceC52747zM2) {
        if (interfaceC52747zM2 != null && !(interfaceC52747zM2 instanceof Serializable)) {
            return new C37162Xs5(interfaceC52747zM2);
        }
        return interfaceC52747zM2;
    }

    @Override // p000.InterfaceC37153Xr5
    /* renamed from: a */
    public void mo20420a(InterfaceC50759w01 interfaceC50759w01) {
        interfaceC50759w01.mo1736a(this.f44117b);
    }
}
