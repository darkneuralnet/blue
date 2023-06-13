package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.C18634R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt$ManualEntryLoaded$1$1$4$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ EX2<Integer> $currentCheck$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryScreenKt$ManualEntryLoaded$1$1$4$1(EX2<Integer> ex2) {
        super(0);
        this.$currentCheck$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$currentCheck$delegate.setValue(Integer.valueOf(C18634R.C18635drawable.stripe_check_account));
    }
}
