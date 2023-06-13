package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: Wn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C36885Wn7 {
    /* renamed from: a */
    public static InterfaceC37164Xs7 m77828a(InterfaceC33159Gp7 interfaceC33159Gp7, InterfaceC37164Xs7 interfaceC37164Xs7, C38159am8 c38159am8, List list) {
        if (interfaceC33159Gp7.mo384b(interfaceC37164Xs7.zzi())) {
            InterfaceC37164Xs7 mo385a = interfaceC33159Gp7.mo385a(interfaceC37164Xs7.zzi());
            if (mo385a instanceof AbstractC40557en7) {
                return ((AbstractC40557en7) mo385a).mo4521d(c38159am8, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC37164Xs7.zzi()));
        } else if ("hasOwnProperty".equals(interfaceC37164Xs7.zzi())) {
            C38822bt8.m62176h("hasOwnProperty", 1, list);
            if (interfaceC33159Gp7.mo384b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi())) {
                return InterfaceC37164Xs7.f44130m0;
            }
            return InterfaceC37164Xs7.f44131n0;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC37164Xs7.zzi()));
        }
    }

    /* renamed from: b */
    public static Iterator m77827b(Map map) {
        return new C35724Ro7(map.keySet().iterator());
    }
}
