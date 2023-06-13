package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$3$1 extends Lambda implements Function1<F16, Unit> {
    final /* synthetic */ Function1<F16, Unit> $onQueryChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$3$1(Function1<? super F16, Unit> function1) {
        super(1);
        this.$onQueryChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(F16 f16) {
        invoke2(f16);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(F16 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onQueryChanged.invoke(it);
    }
}
