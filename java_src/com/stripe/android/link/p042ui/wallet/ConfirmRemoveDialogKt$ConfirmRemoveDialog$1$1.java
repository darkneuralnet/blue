package com.stripe.android.link.p042ui.wallet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.ConfirmRemoveDialogKt$ConfirmRemoveDialog$1$1 */
/* loaded from: classes7.dex */
public final class ConfirmRemoveDialogKt$ConfirmRemoveDialog$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onDialogDismissed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmRemoveDialogKt$ConfirmRemoveDialog$1$1(Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$onDialogDismissed = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDialogDismissed.invoke(Boolean.FALSE);
    }
}
