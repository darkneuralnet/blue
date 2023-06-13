package p000;

import java.util.List;
/* renamed from: Vq9 */
/* loaded from: classes5.dex */
public final class Vq9 extends AbstractC40557en7 {

    /* renamed from: d */
    public final Nl9 f39845d;

    public Vq9(Nl9 nl9) {
        super("internal.logger");
        this.f39845d = nl9;
        this.f78860c.put("log", new Wo9(this, false, true));
        this.f78860c.put("silent", new Cd9(this, "silent"));
        ((AbstractC40557en7) this.f78860c.get("silent")).mo383c("log", new Wo9(this, true, true));
        this.f78860c.put("unmonitored", new Th9(this, "unmonitored"));
        ((AbstractC40557en7) this.f78860c.get("unmonitored")).mo383c("log", new Wo9(this, false, false));
    }

    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        return InterfaceC37164Xs7.f44125h0;
    }
}
