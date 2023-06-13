package com.stripe.android.uicore.text;

import com.stripe.android.uicore.text.EmbeddableImage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt$rememberBitmapImages$1$1 extends Lambda implements Function3<String, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ EmbeddableImage.Bitmap $image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$rememberBitmapImages$1$1(EmbeddableImage.Bitmap bitmap) {
        super(3);
        this.$image = bitmap;
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
            C35528Qt0.m87816Z(-560842123, i, -1, "com.stripe.android.uicore.text.rememberBitmapImages.<anonymous>.<anonymous> (Html.kt:128)");
        }
        C51659xX1.m5068b(C6809Qc.m88362c(this.$image.getBitmap()), null, null, null, null, 0.0f, null, 0, interfaceC32720Et0, 56, 252);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
