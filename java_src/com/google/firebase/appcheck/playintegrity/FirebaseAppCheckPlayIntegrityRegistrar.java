package com.google.firebase.appcheck.playintegrity;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.appcheck.playintegrity.FirebaseAppCheckPlayIntegrityRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
@KeepForSdk
/* loaded from: classes6.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public static /* synthetic */ C51652xW3 m47369b(C52292yb4 c52292yb4, C52292yb4 c52292yb42, InterfaceC35051Os0 interfaceC35051Os0) {
        return new C51652xW3((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), (Executor) interfaceC35051Os0.mo85623c(c52292yb4), (Executor) interfaceC35051Os0.mo85623c(c52292yb42));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        final C52292yb4 m3203a = C52292yb4.m3203a(InterfaceC36673Vq2.class, Executor.class);
        final C52292yb4 m3203a2 = C52292yb4.m3203a(InterfaceC8305UW.class, Executor.class);
        return Arrays.asList(C32711Es0.m108309e(C51652xW3.class).m108286h("fire-app-check-play-integrity").m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29484j(m3203a)).m108292b(C43645k01.m29484j(m3203a2)).m108288f(new InterfaceC36455Us0() { // from class: Dm1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                C51652xW3 m47369b;
                m47369b = FirebaseAppCheckPlayIntegrityRegistrar.m47369b(C52292yb4.this, m3203a2, interfaceC35051Os0);
                return m47369b;
            }
        }).m108290d(), C50661vq2.m7933b("fire-app-check-play-integrity", "17.0.0"));
    }
}
