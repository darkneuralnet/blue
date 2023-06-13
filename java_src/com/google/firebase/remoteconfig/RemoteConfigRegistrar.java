package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
@Keep
/* loaded from: classes6.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C36486Uv4 lambda$getComponents$0(C52292yb4 c52292yb4, InterfaceC35051Os0 interfaceC35051Os0) {
        return new C36486Uv4((Context) interfaceC35051Os0.get(Context.class), (ScheduledExecutorService) interfaceC35051Os0.mo85623c(c52292yb4), (C31722Am1) interfaceC35051Os0.get(C31722Am1.class), (InterfaceC35934Sm1) interfaceC35051Os0.get(InterfaceC35934Sm1.class), ((C30017x1) interfaceC35051Os0.get(C30017x1.class)).m5982b("frc"), interfaceC35051Os0.mo85622d(InterfaceC12447ba.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        final C52292yb4 m3203a = C52292yb4.m3203a(InterfaceC8305UW.class, ScheduledExecutorService.class);
        return Arrays.asList(C32711Es0.m108309e(C36486Uv4.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(Context.class)).m108292b(C43645k01.m29484j(m3203a)).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29483k(InterfaceC35934Sm1.class)).m108292b(C43645k01.m29483k(C30017x1.class)).m108292b(C43645k01.m29485i(InterfaceC12447ba.class)).m108288f(new InterfaceC36455Us0() { // from class: Xv4
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                C36486Uv4 lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(C52292yb4.this, interfaceC35051Os0);
                return lambda$getComponents$0;
            }
        }).m108289e().m108290d(), C50661vq2.m7933b(LIBRARY_NAME, "21.4.0"));
    }
}
