package com.stripe.android.financialconnections.features.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsentScreenKt$ContentPreview$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ ConsentState $state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentPreview$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187331 extends Lambda implements Function0<Unit> {
        public static final C187331 INSTANCE = new C187331();

        public C187331() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentPreview$1$2 */
    /* loaded from: classes7.dex */
    public static final class C187342 extends Lambda implements Function1<String, Unit> {
        public static final C187342 INSTANCE = new C187342();

        public C187342() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentPreview$1$3 */
    /* loaded from: classes7.dex */
    public static final class C187353 extends Lambda implements Function0<Unit> {
        public static final C187353 INSTANCE = new C187353();

        public C187353() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentPreview$1$4 */
    /* loaded from: classes7.dex */
    public static final class C187364 extends Lambda implements Function0<Unit> {
        public static final C187364 INSTANCE = new C187364();

        public C187364() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreenKt$ContentPreview$1(ConsentState consentState) {
        super(2);
        this.$state = consentState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(462652352, i, -1, "com.stripe.android.financialconnections.features.consent.ContentPreview.<anonymous> (ConsentScreen.kt:432)");
        }
        ConsentScreenKt.ConsentContent(this.$state, FU2.m107098p(HU2.Hidden, null, true, null, interfaceC32720Et0, 390, 10), C187331.INSTANCE, C187342.INSTANCE, C187353.INSTANCE, C187364.INSTANCE, interfaceC32720Et0, 224648);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
