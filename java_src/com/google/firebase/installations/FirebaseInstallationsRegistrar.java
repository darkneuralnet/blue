package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
@Keep
/* loaded from: classes6.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC35934Sm1 lambda$getComponents$0(InterfaceC35051Os0 interfaceC35051Os0) {
        return new C18343a((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), interfaceC35051Os0.mo85622d(InterfaceC49746uI1.class), (ExecutorService) interfaceC35051Os0.mo85623c(C52292yb4.m3203a(InterfaceC10076Yv.class, ExecutorService.class)), C34530Mm1.m94882b((Executor) interfaceC35051Os0.mo85623c(C52292yb4.m3203a(InterfaceC8305UW.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108309e(InterfaceC35934Sm1.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29485i(InterfaceC49746uI1.class)).m108292b(C43645k01.m29484j(C52292yb4.m3203a(InterfaceC10076Yv.class, ExecutorService.class))).m108292b(C43645k01.m29484j(C52292yb4.m3203a(InterfaceC8305UW.class, Executor.class))).m108288f(new InterfaceC36455Us0() { // from class: Tm1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                InterfaceC35934Sm1 lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC35051Os0);
                return lambda$getComponents$0;
            }
        }).m108290d(), C49153tI1.m12526a(), C50661vq2.m7933b(LIBRARY_NAME, "17.1.3"));
    }
}
