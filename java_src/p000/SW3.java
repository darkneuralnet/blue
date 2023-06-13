package p000;

import co.bird.android.feature.rider.impl.PointRadiusDataManagerImpl;
/* renamed from: SW3 */
/* loaded from: classes3.dex */
public final class SW3 implements RW3 {

    /* renamed from: a */
    public final TW3 f33835a;

    public SW3(TW3 tw3) {
        this.f33835a = tw3;
    }

    /* renamed from: b */
    public static Y94<RW3> m85315b(TW3 tw3) {
        return C39546d52.m44621a(new SW3(tw3));
    }

    @Override // p000.RW3
    /* renamed from: a */
    public PointRadiusDataManagerImpl mo85316a(InterfaceC50693vt4 interfaceC50693vt4) {
        return this.f33835a.m83487b(interfaceC50693vt4);
    }
}
