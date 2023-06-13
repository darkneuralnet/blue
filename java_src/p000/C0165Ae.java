package p000;

import android.graphics.PointF;
import java.util.List;
/* renamed from: Ae */
/* loaded from: classes2.dex */
public class C0165Ae implements InterfaceC2901Ge<PointF, PointF> {

    /* renamed from: a */
    public final C27640qe f890a;

    /* renamed from: b */
    public final C27640qe f891b;

    public C0165Ae(C27640qe c27640qe, C27640qe c27640qe2) {
        this.f890a = c27640qe;
        this.f891b = c27640qe2;
    }

    @Override // p000.InterfaceC2901Ge
    /* renamed from: a */
    public AbstractC26856oB<PointF, PointF> mo951a() {
        return new C38521bO5(this.f890a.mo951a(), this.f891b.mo951a());
    }

    @Override // p000.InterfaceC2901Ge
    /* renamed from: b */
    public List<C41125fl2<PointF>> mo950b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p000.InterfaceC2901Ge
    public boolean isStatic() {
        return this.f890a.isStatic() && this.f891b.isStatic();
    }
}
