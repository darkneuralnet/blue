package com.stripe.android.financialconnections.features.common;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LPD3;", "it", "", "invoke", "(LPD3;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-5$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ErrorContentKt$lambda5$1 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ErrorContentKt$lambda5$1 INSTANCE = new ComposableSingletons$ErrorContentKt$lambda5$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-5$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187191 extends Lambda implements Function0<Unit> {
        public static final C187191 INSTANCE = new C187191();

        public C187191() {
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
    /* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-5$1$2 */
    /* loaded from: classes7.dex */
    public static final class C187202 extends Lambda implements Function0<Unit> {
        public static final C187202 INSTANCE = new C187202();

        public C187202() {
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

    public ComposableSingletons$ErrorContentKt$lambda5$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1421624055, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-5.<anonymous> (ErrorContent.kt:373)");
        }
        ErrorContentKt.InstitutionPlannedDowntimeErrorContent(new InstitutionPlannedDowntimeError(new FinancialConnectionsInstitution(false, "3", false, "Random Institution", null, null, null, "Random Institution url"), true, true, AbstractComponentTracker.LINGERING_TIMEOUT, new APIException(null, null, 0, null, null, 31, null)), C187191.INSTANCE, C187202.INSTANCE, interfaceC32720Et0, 432);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
