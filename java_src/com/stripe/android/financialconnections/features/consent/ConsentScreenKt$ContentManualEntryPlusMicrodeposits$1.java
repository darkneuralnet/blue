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
public final class ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ ConsentState $state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187291 extends Lambda implements Function0<Unit> {
        public static final C187291 INSTANCE = new C187291();

        public C187291() {
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
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1$2 */
    /* loaded from: classes7.dex */
    public static final class C187302 extends Lambda implements Function1<String, Unit> {
        public static final C187302 INSTANCE = new C187302();

        public C187302() {
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
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1$3 */
    /* loaded from: classes7.dex */
    public static final class C187313 extends Lambda implements Function0<Unit> {
        public static final C187313 INSTANCE = new C187313();

        public C187313() {
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
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1$4 */
    /* loaded from: classes7.dex */
    public static final class C187324 extends Lambda implements Function0<Unit> {
        public static final C187324 INSTANCE = new C187324();

        public C187324() {
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
    public ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1(ConsentState consentState) {
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
            C35528Qt0.m87816Z(-615193633, i, -1, "com.stripe.android.financialconnections.features.consent.ContentManualEntryPlusMicrodeposits.<anonymous> (ConsentScreen.kt:544)");
        }
        ConsentScreenKt.ConsentContent(this.$state, FU2.m107098p(HU2.Hidden, null, true, null, interfaceC32720Et0, 390, 10), C187291.INSTANCE, C187302.INSTANCE, C187313.INSTANCE, C187324.INSTANCE, interfaceC32720Et0, 224648);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}