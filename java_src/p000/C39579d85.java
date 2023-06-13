package p000;

import android.view.View;
import co.bird.android.model.FlightBannerNode;
/* renamed from: d85  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39579d85 implements InterfaceC38968c85 {

    /* renamed from: a */
    public final C40171e85 f76165a;

    public C39579d85(C40171e85 c40171e85) {
        this.f76165a = c40171e85;
    }

    /* renamed from: b */
    public static Y94<InterfaceC38968c85> m44581b(C40171e85 c40171e85) {
        return C39546d52.m44621a(new C39579d85(c40171e85));
    }

    @Override // p000.InterfaceC38968c85
    /* renamed from: a */
    public C38375b85 mo44582a(FlightBannerNode.RiderBarType riderBarType, View view, boolean z) {
        return this.f76165a.m43190b(riderBarType, view, z);
    }
}
