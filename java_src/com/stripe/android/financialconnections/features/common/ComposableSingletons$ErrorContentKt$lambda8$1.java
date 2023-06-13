package com.stripe.android.financialconnections.features.common;

import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LPD3;", "it", "", "invoke", "(LPD3;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-8$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ErrorContentKt$lambda8$1 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ErrorContentKt$lambda8$1 INSTANCE = new ComposableSingletons$ErrorContentKt$lambda8$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-8$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187221 extends Lambda implements Function0<Unit> {
        public static final C187221 INSTANCE = new C187221();

        public C187221() {
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
    /* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-8$1$2 */
    /* loaded from: classes7.dex */
    public static final class C187232 extends Lambda implements Function0<Unit> {
        public static final C187232 INSTANCE = new C187232();

        public C187232() {
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
    /* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-8$1$3 */
    /* loaded from: classes7.dex */
    public static final class C187243 extends Lambda implements Function0<Unit> {
        public static final C187243 INSTANCE = new C187243();

        public C187243() {
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

    public ComposableSingletons$ErrorContentKt$lambda8$1() {
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
            C35528Qt0.m87816Z(-347514372, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-8.<anonymous> (ErrorContent.kt:404)");
        }
        ErrorContentKt.NoAccountsAvailableErrorContent(new AccountLoadError(true, true, new FinancialConnectionsInstitution(false, "3", false, "Random Institution", null, null, null, "Random Institution url"), new APIException(null, null, 0, null, null, 31, null)), C187221.INSTANCE, C187232.INSTANCE, C187243.INSTANCE, interfaceC32720Et0, 3504);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
