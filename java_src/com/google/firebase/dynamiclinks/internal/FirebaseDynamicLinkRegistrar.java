package com.google.firebase.dynamiclinks.internal;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
@KeepForSdk
/* loaded from: classes6.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC34062Km1 lambda$getComponents$0(InterfaceC35051Os0 interfaceC35051Os0) {
        return new C34296Lm1((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), interfaceC35051Os0.mo85622d(InterfaceC12447ba.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108309e(AbstractC34062Km1.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29485i(InterfaceC12447ba.class)).m108288f(new InterfaceC36455Us0() { // from class: Jm1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                AbstractC34062Km1 lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseDynamicLinkRegistrar.lambda$getComponents$0(interfaceC35051Os0);
                return lambda$getComponents$0;
            }
        }).m108290d(), C50661vq2.m7933b(LIBRARY_NAME, "21.1.0"));
    }
}
