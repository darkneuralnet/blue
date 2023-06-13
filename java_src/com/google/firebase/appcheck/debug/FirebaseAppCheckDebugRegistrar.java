package com.google.firebase.appcheck.debug;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.appcheck.debug.FirebaseAppCheckDebugRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
@KeepForSdk
/* loaded from: classes6.dex */
public class FirebaseAppCheckDebugRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public static /* synthetic */ KU0 m47371b(C52292yb4 c52292yb4, C52292yb4 c52292yb42, C52292yb4 c52292yb43, InterfaceC35051Os0 interfaceC35051Os0) {
        return new KU0((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), interfaceC35051Os0.mo85622d(InterfaceC46671p62.class), (Executor) interfaceC35051Os0.mo85623c(c52292yb4), (Executor) interfaceC35051Os0.mo85623c(c52292yb42), (Executor) interfaceC35051Os0.mo85623c(c52292yb43));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        final C52292yb4 m3203a = C52292yb4.m3203a(InterfaceC36673Vq2.class, Executor.class);
        final C52292yb4 m3203a2 = C52292yb4.m3203a(InterfaceC10076Yv.class, Executor.class);
        final C52292yb4 m3203a3 = C52292yb4.m3203a(InterfaceC8305UW.class, Executor.class);
        return Arrays.asList(C32711Es0.m108309e(KU0.class).m108286h("fire-app-check-debug").m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29485i(InterfaceC46671p62.class)).m108292b(C43645k01.m29484j(m3203a)).m108292b(C43645k01.m29484j(m3203a2)).m108292b(C43645k01.m29484j(m3203a3)).m108288f(new InterfaceC36455Us0() { // from class: Cm1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                KU0 m47371b;
                m47371b = FirebaseAppCheckDebugRegistrar.m47371b(C52292yb4.this, m3203a2, m3203a3, interfaceC35051Os0);
                return m47371b;
            }
        }).m108290d(), C50661vq2.m7933b("fire-app-check-debug", "17.0.0"));
    }
}
