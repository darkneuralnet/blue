package com.stripe.android.financialconnections.p041ui.components;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.TopAppBarKt$FinancialConnectionsTopAppBar$1 */
/* loaded from: classes7.dex */
public final class TopAppBarKt$FinancialConnectionsTopAppBar$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ OnBackPressedDispatcher $localBackPressed;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.components.TopAppBarKt$FinancialConnectionsTopAppBar$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189361 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OnBackPressedDispatcher $localBackPressed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189361(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.$localBackPressed = onBackPressedDispatcher;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.$localBackPressed;
            if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.m70494f();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$FinancialConnectionsTopAppBar$1(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(2);
        this.$localBackPressed = onBackPressedDispatcher;
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
            C35528Qt0.m87816Z(-1359544719, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:48)");
        }
        C47438qP1.m17541a(new C189361(this.$localBackPressed), null, false, null, ComposableSingletons$TopAppBarKt.INSTANCE.m116426getLambda3$financial_connections_release(), interfaceC32720Et0, 24576, 14);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
