package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: Bv9 */
/* loaded from: classes5.dex */
public final class Bv9 extends AbstractC40557en7 {

    /* renamed from: d */
    public final C46780pH8 f3049d;

    /* renamed from: e */
    public final Map f3050e;

    public Bv9(C46780pH8 c46780pH8) {
        super("require");
        this.f3050e = new HashMap();
        this.f3049d = c46780pH8;
    }

    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        InterfaceC37164Xs7 interfaceC37164Xs7;
        C38822bt8.m62176h("require", 1, list);
        String zzi = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi();
        if (this.f3050e.containsKey(zzi)) {
            return (InterfaceC37164Xs7) this.f3050e.get(zzi);
        }
        C46780pH8 c46780pH8 = this.f3049d;
        if (c46780pH8.f103434a.containsKey(zzi)) {
            try {
                interfaceC37164Xs7 = (InterfaceC37164Xs7) ((Callable) c46780pH8.f103434a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            interfaceC37164Xs7 = InterfaceC37164Xs7.f44125h0;
        }
        if (interfaceC37164Xs7 instanceof AbstractC40557en7) {
            this.f3050e.put(zzi, (AbstractC40557en7) interfaceC37164Xs7);
        }
        return interfaceC37164Xs7;
    }
}
