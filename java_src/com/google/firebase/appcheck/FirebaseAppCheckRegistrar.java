package com.google.firebase.appcheck;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.appcheck.FirebaseAppCheckRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
@KeepForSdk
/* loaded from: classes6.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public static /* synthetic */ AbstractC31956Bm1 m47373b(C52292yb4 c52292yb4, C52292yb4 c52292yb42, C52292yb4 c52292yb43, C52292yb4 c52292yb44, InterfaceC35051Os0 interfaceC35051Os0) {
        return new C42172hX0((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), interfaceC35051Os0.mo85622d(InterfaceC49746uI1.class), (Executor) interfaceC35051Os0.mo85623c(c52292yb4), (Executor) interfaceC35051Os0.mo85623c(c52292yb42), (Executor) interfaceC35051Os0.mo85623c(c52292yb43), (ScheduledExecutorService) interfaceC35051Os0.mo85623c(c52292yb44));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        final C52292yb4 m3203a = C52292yb4.m3203a(InterfaceC52314yd6.class, Executor.class);
        final C52292yb4 m3203a2 = C52292yb4.m3203a(InterfaceC36673Vq2.class, Executor.class);
        final C52292yb4 m3203a3 = C52292yb4.m3203a(InterfaceC10076Yv.class, Executor.class);
        final C52292yb4 m3203a4 = C52292yb4.m3203a(InterfaceC8305UW.class, ScheduledExecutorService.class);
        return Arrays.asList(C32711Es0.m108308f(AbstractC31956Bm1.class, B62.class).m108286h("fire-app-check").m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29484j(m3203a)).m108292b(C43645k01.m29484j(m3203a2)).m108292b(C43645k01.m29484j(m3203a3)).m108292b(C43645k01.m29484j(m3203a4)).m108292b(C43645k01.m29485i(InterfaceC49746uI1.class)).m108288f(new InterfaceC36455Us0() { // from class: Em1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                AbstractC31956Bm1 m47373b;
                m47373b = FirebaseAppCheckRegistrar.m47373b(C52292yb4.this, m3203a2, m3203a3, m3203a4, interfaceC35051Os0);
                return m47373b;
            }
        }).m108291c().m108290d(), C49153tI1.m12526a(), C50661vq2.m7933b("fire-app-check", "17.0.0"));
    }
}
