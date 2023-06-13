package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
@Keep
/* loaded from: classes6.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C48260rn1 lambda$getComponents$0(C52292yb4 c52292yb4, InterfaceC35051Os0 interfaceC35051Os0) {
        return new C48260rn1((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), (AbstractC46849pP5) interfaceC35051Os0.mo85622d(AbstractC46849pP5.class).get(), (Executor) interfaceC35051Os0.mo85623c(c52292yb4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C51816xn1 providesFirebasePerformance(InterfaceC35051Os0 interfaceC35051Os0) {
        interfaceC35051Os0.get(C48260rn1.class);
        return C43232jJ0.m30810b().m30807b(new C31731An1((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), (InterfaceC35934Sm1) interfaceC35051Os0.get(InterfaceC35934Sm1.class), interfaceC35051Os0.mo85622d(C36486Uv4.class), interfaceC35051Os0.mo85622d(U96.class))).m30808a().mo2588a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C32711Es0<?>> getComponents() {
        final C52292yb4 m3203a = C52292yb4.m3203a(InterfaceC52314yd6.class, Executor.class);
        return Arrays.asList(C32711Es0.m108309e(C51816xn1.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29482l(C36486Uv4.class)).m108292b(C43645k01.m29483k(InterfaceC35934Sm1.class)).m108292b(C43645k01.m29482l(U96.class)).m108292b(C43645k01.m29483k(C48260rn1.class)).m108288f(new InterfaceC36455Us0() { // from class: un1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                C51816xn1 providesFirebasePerformance;
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(interfaceC35051Os0);
                return providesFirebasePerformance;
            }
        }).m108290d(), C32711Es0.m108309e(C48260rn1.class).m108286h(EARLY_LIBRARY_NAME).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29485i(AbstractC46849pP5.class)).m108292b(C43645k01.m29484j(m3203a)).m108289e().m108288f(new InterfaceC36455Us0() { // from class: vn1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                C48260rn1 lambda$getComponents$0;
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(C52292yb4.this, interfaceC35051Os0);
                return lambda$getComponents$0;
            }
        }).m108290d(), C50661vq2.m7933b(LIBRARY_NAME, "20.3.2"));
    }
}
