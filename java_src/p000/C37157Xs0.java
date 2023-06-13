package p000;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Xs0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37157Xs0 implements InterfaceC37625Zs0 {
    /* renamed from: c */
    public static /* synthetic */ Object m76196c(String str, C32711Es0 c32711Es0, InterfaceC35051Os0 interfaceC35051Os0) {
        try {
            C35943Sn1.m84830b(str);
            return c32711Es0.m108306h().mo1631a(interfaceC35051Os0);
        } finally {
            C35943Sn1.m84831a();
        }
    }

    @Override // p000.InterfaceC37625Zs0
    /* renamed from: a */
    public List<C32711Es0<?>> mo72381a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C32711Es0<?> c32711Es0 : componentRegistrar.getComponents()) {
            final String m108305i = c32711Es0.m108305i();
            if (m108305i != null) {
                c32711Es0 = c32711Es0.m108294t(new InterfaceC36455Us0() { // from class: Ws0
                    @Override // p000.InterfaceC36455Us0
                    /* renamed from: a */
                    public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                        Object m76196c;
                        m76196c = C37157Xs0.m76196c(m108305i, c32711Es0, interfaceC35051Os0);
                        return m76196c;
                    }
                });
            }
            arrayList.add(c32711Es0);
        }
        return arrayList;
    }
}
