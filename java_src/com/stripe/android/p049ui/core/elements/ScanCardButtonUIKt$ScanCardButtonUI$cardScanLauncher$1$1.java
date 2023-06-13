package com.stripe.android.p049ui.core.elements;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1 */
/* loaded from: classes7.dex */
public final class ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1 extends Lambda implements Function1<ActivityResult, Unit> {
    final /* synthetic */ Function1<Intent, Unit> $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1(Function1<? super Intent, Unit> function1) {
        super(1);
        this.$onResult = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent m70486a = it.m70486a();
        if (m70486a != null) {
            this.$onResult.invoke(m70486a);
        }
    }
}
