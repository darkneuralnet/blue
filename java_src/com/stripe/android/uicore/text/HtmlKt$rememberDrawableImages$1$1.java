package com.stripe.android.uicore.text;

import com.stripe.android.uicore.text.EmbeddableImage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt$rememberDrawableImages$1$1 extends Lambda implements Function3<String, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ AbstractC45562nE3 $painter;
    final /* synthetic */ EmbeddableImage.Drawable $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$rememberDrawableImages$1$1(EmbeddableImage.Drawable drawable, AbstractC45562nE3 abstractC45562nE3) {
        super(3);
        this.$value = drawable;
        this.$painter = abstractC45562nE3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(str, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(String it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-737684954, i, -1, "com.stripe.android.uicore.text.rememberDrawableImages.<anonymous>.<anonymous> (Html.kt:93)");
        }
        InterfaceC41563gV2 m114259j = BB5.m114259j(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0.0f, 1, null);
        C51659xX1.m5069a(this.$painter, C40946fS5.m41310c(this.$value.getContentDescription(), interfaceC32720Et0, 0), m114259j, null, null, 0.0f, this.$value.getColorFilter(), interfaceC32720Et0, 392, 56);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
