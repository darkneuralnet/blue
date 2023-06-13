package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ManualEntryScreenKt$ManualEntryScreen$3 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public ManualEntryScreenKt$ManualEntryScreen$3(Object obj) {
        super(1, obj, ManualEntryViewModel.class, "onAccountConfirmEntered", "onAccountConfirmEntered(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ManualEntryViewModel) this.receiver).onAccountConfirmEntered(p0);
    }
}
