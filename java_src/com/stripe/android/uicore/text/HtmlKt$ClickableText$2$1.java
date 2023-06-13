package com.stripe.android.uicore.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt$ClickableText$2$1 extends Lambda implements Function1<C42484i26, Unit> {
    final /* synthetic */ EX2<C42484i26> $layoutResult;
    final /* synthetic */ Function1<C42484i26, Unit> $onTextLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlKt$ClickableText$2$1(EX2<C42484i26> ex2, Function1<? super C42484i26, Unit> function1) {
        super(1);
        this.$layoutResult = ex2;
        this.$onTextLayout = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C42484i26 c42484i26) {
        invoke2(c42484i26);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C42484i26 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$layoutResult.setValue(it);
        this.$onTextLayout.invoke(it);
    }
}
