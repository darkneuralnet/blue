package com.stripe.android.financialconnections.p040di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lhi2;", "", "invoke", "(Lhi2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule$providesJson$1 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetSharedModule$providesJson$1 extends Lambda implements Function1<C42281hi2, Unit> {
    public static final FinancialConnectionsSheetSharedModule$providesJson$1 INSTANCE = new FinancialConnectionsSheetSharedModule$providesJson$1();

    public FinancialConnectionsSheetSharedModule$providesJson$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C42281hi2 c42281hi2) {
        invoke2(c42281hi2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C42281hi2 Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.m36082d(true);
        Json.m36080f(true);
        Json.m36079g(true);
        Json.m36081e(true);
    }
}
