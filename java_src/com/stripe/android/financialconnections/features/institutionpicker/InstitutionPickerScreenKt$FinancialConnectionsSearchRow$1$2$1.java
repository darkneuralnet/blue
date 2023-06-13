package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$2$1 extends Lambda implements Function1<InterfaceC36951Wv1, Unit> {
    final /* synthetic */ Function0<Unit> $onSearchFocused;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$2$1(Function0<Unit> function0) {
        super(1);
        this.$onSearchFocused = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36951Wv1 interfaceC36951Wv1) {
        invoke2(interfaceC36951Wv1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC36951Wv1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.mo76101a()) {
            this.$onSearchFocused.invoke();
        }
    }
}
