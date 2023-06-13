package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes6.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-cls";

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics buildCrashlytics(InterfaceC35051Os0 interfaceC35051Os0) {
        return FirebaseCrashlytics.init((C31722Am1) interfaceC35051Os0.get(C31722Am1.class), (InterfaceC35934Sm1) interfaceC35051Os0.get(InterfaceC35934Sm1.class), interfaceC35051Os0.mo85620h(CrashlyticsNativeComponent.class), interfaceC35051Os0.mo85620h(InterfaceC12447ba.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108309e(FirebaseCrashlytics.class).m108286h(LIBRARY_NAME).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29483k(InterfaceC35934Sm1.class)).m108292b(C43645k01.m29493a(CrashlyticsNativeComponent.class)).m108292b(C43645k01.m29493a(InterfaceC12447ba.class)).m108288f(new InterfaceC36455Us0() { // from class: YD0
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                FirebaseCrashlytics buildCrashlytics;
                buildCrashlytics = CrashlyticsRegistrar.this.buildCrashlytics(interfaceC35051Os0);
                return buildCrashlytics;
            }
        }).m108289e().m108290d(), C50661vq2.m7933b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
