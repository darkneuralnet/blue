package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes6.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ U96 lambda$getComponents$0(InterfaceC35051Os0 interfaceC35051Os0) {
        C42798ia6.m33786f((Context) interfaceC35051Os0.get(Context.class));
        return C42798ia6.m33789c().m33785g(W70.f40432h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108309e(U96.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(Context.class)).m108288f(new InterfaceC36455Us0() { // from class: ha6
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                U96 lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC35051Os0);
                return lambda$getComponents$0;
            }
        }).m108290d(), C50661vq2.m7933b(LIBRARY_NAME, "18.1.8"));
    }
}
