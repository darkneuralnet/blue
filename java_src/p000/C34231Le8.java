package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* renamed from: Le8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34231Le8 extends AbstractC34072Kn2 {

    /* renamed from: b */
    public final C52226yU2 f21873b;

    public C34231Le8(C52226yU2 c52226yU2) {
        this.f21873b = c52226yU2;
    }

    @Override // p000.AbstractC34072Kn2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11764a(Object obj) {
        InterfaceC41443gH8 it8;
        C9555Xx c9555Xx = (C9555Xx) obj;
        Context m3452b = this.f21873b.m3452b();
        C40559en9 m26787b = C44720lo9.m26787b(CC7.m112615d());
        if (!IT8.m102058b(m3452b) && GoogleApiAvailabilityLight.getInstance().getApkVersion(m3452b) < 204500000) {
            it8 = new W49(m3452b, c9555Xx, m26787b);
        } else {
            it8 = new IT8(m3452b, c9555Xx, m26787b);
        }
        return new BA8(this.f21873b, c9555Xx, it8, m26787b);
    }
}
