package com.stripe.android.uicore.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt$Html$remoteImages$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ EX2<Boolean> $remoteImagesLoaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$Html$remoteImages$1$1(EX2<Boolean> ex2) {
        super(0);
        this.$remoteImagesLoaded = ex2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$remoteImagesLoaded.setValue(Boolean.TRUE);
    }
}