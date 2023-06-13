package com.stripe.android.uicore.elements;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nRowElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowElementUI.kt\ncom/stripe/android/uicore/elements/RowElementUIKt$RowElementUI$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,75:1\n174#2:76\n*S KotlinDebug\n*F\n+ 1 RowElementUI.kt\ncom/stripe/android/uicore/elements/RowElementUIKt$RowElementUI$1$1$1$1\n*L\n57#1:76\n*E\n"})
/* loaded from: classes7.dex */
public final class RowElementUIKt$RowElementUI$1$1$1$1 extends Lambda implements Function1<G52, Unit> {
    final /* synthetic */ EX2<C43705k61> $dividerHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowElementUIKt$RowElementUI$1$1$1$1(EX2<C43705k61> ex2) {
        super(1);
        this.$dividerHeight = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G52 g52) {
        m116745invokeozmzZPI(g52.m105826j());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m116745invokeozmzZPI(long j) {
        this.$dividerHeight.setValue(C43705k61.m29306d(C43705k61.m29303g(G52.m105830f(j) / Resources.getSystem().getDisplayMetrics().density)));
    }
}
