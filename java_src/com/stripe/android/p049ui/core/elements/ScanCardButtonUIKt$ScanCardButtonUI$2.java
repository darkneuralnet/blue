package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.stripe.android.p049ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.ScanCardButtonUIKt$ScanCardButtonUI$2 */
/* loaded from: classes7.dex */
public final class ScanCardButtonUIKt$ScanCardButtonUI$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TH2<Intent, ActivityResult> $cardScanLauncher;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanCardButtonUIKt$ScanCardButtonUI$2(TH2<Intent, ActivityResult> th2, Context context) {
        super(0);
        this.$cardScanLauncher = th2;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$cardScanLauncher.m114705a(new Intent(this.$context, CardScanActivity.class));
    }
}
