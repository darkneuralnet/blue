package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* renamed from: X49 */
/* loaded from: classes6.dex */
public final class X49 extends AbstractC34072Kn2 {

    /* renamed from: b */
    public final C52226yU2 f42626b;

    public X49(C52226yU2 c52226yU2) {
        this.f42626b = c52226yU2;
    }

    @Override // p000.AbstractC34072Kn2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11764a(Object obj) {
        KT8 c48638sQ7;
        InterfaceC51377x26 interfaceC51377x26 = (InterfaceC51377x26) obj;
        C45293mm9 m421b = C53010zn9.m421b(interfaceC51377x26.mo5910b());
        Context m3452b = this.f42626b.m3452b();
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(m3452b) < 204700000 && !interfaceC51377x26.mo5908d()) {
            c48638sQ7 = new AY7(m3452b);
        } else {
            c48638sQ7 = new C48638sQ7(m3452b, interfaceC51377x26, m421b);
        }
        return new C52563z26(m421b, c48638sQ7, interfaceC51377x26);
    }
}
