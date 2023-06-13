package p000;

import android.graphics.PointF;
import java.util.List;
/* renamed from: ve */
/* loaded from: classes2.dex */
public class C29600ve implements InterfaceC2901Ge<PointF, PointF> {

    /* renamed from: a */
    public final List<C41125fl2<PointF>> f114424a;

    public C29600ve(List<C41125fl2<PointF>> list) {
        this.f114424a = list;
    }

    @Override // p000.InterfaceC2901Ge
    /* renamed from: a */
    public AbstractC26856oB<PointF, PointF> mo951a() {
        if (this.f114424a.get(0).m40899i()) {
            return new KW3(this.f114424a);
        }
        return new C45014mJ3(this.f114424a);
    }

    @Override // p000.InterfaceC2901Ge
    /* renamed from: b */
    public List<C41125fl2<PointF>> mo950b() {
        return this.f114424a;
    }

    @Override // p000.InterfaceC2901Ge
    public boolean isStatic() {
        return this.f114424a.size() == 1 && this.f114424a.get(0).m40899i();
    }
}
