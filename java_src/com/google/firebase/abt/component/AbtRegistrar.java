package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes6.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C30017x1 lambda$getComponents$0(InterfaceC35051Os0 interfaceC35051Os0) {
        return new C30017x1((Context) interfaceC35051Os0.get(Context.class), interfaceC35051Os0.mo85622d(InterfaceC12447ba.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108309e(C30017x1.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(Context.class)).m108292b(C43645k01.m29485i(InterfaceC12447ba.class)).m108288f(new InterfaceC36455Us0() { // from class: z1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                C30017x1 lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(interfaceC35051Os0);
                return lambda$getComponents$0;
            }
        }).m108290d(), C50661vq2.m7933b(LIBRARY_NAME, "21.1.1"));
    }
}
