package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
@KeepForSdk
/* loaded from: classes6.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC35051Os0 interfaceC35051Os0) {
        return new FirebaseMessaging((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), (InterfaceC36402Um1) interfaceC35051Os0.get(InterfaceC36402Um1.class), interfaceC35051Os0.mo85622d(InterfaceC42265hg6.class), interfaceC35051Os0.mo85622d(InterfaceC50338vI1.class), (InterfaceC35934Sm1) interfaceC35051Os0.get(InterfaceC35934Sm1.class), (U96) interfaceC35051Os0.get(U96.class), (InterfaceC42734iT5) interfaceC35051Os0.get(InterfaceC42734iT5.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108309e(FirebaseMessaging.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29486h(InterfaceC36402Um1.class)).m108292b(C43645k01.m29485i(InterfaceC42265hg6.class)).m108292b(C43645k01.m29485i(InterfaceC50338vI1.class)).m108292b(C43645k01.m29486h(U96.class)).m108292b(C43645k01.m29483k(InterfaceC35934Sm1.class)).m108292b(C43645k01.m29483k(InterfaceC42734iT5.class)).m108288f(new InterfaceC36455Us0() { // from class: in1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC35051Os0);
                return lambda$getComponents$0;
            }
        }).m108291c().m108290d(), C50661vq2.m7933b(LIBRARY_NAME, "23.1.2"));
    }
}
