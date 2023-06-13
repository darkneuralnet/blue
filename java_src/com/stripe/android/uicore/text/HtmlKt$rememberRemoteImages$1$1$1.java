package com.stripe.android.uicore.text;

import android.graphics.Bitmap;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n174#2:434\n174#2:435\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$1\n*L\n191#1:434\n192#1:435\n*E\n"})
/* loaded from: classes7.dex */
public final class HtmlKt$rememberRemoteImages$1$1$1 extends Lambda implements Function3<String, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ Map.Entry<String, Bitmap> $entry;
    final /* synthetic */ long $size;
    final /* synthetic */ StripeImageLoader $stripeImageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$rememberRemoteImages$1$1$1(Map.Entry<String, Bitmap> entry, StripeImageLoader stripeImageLoader, long j) {
        super(3);
        this.$entry = entry;
        this.$stripeImageLoader = stripeImageLoader;
        this.$size = j;
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
            C35528Qt0.m87816Z(858918421, i, -1, "com.stripe.android.uicore.text.rememberRemoteImages.<anonymous>.<anonymous>.<anonymous> (Html.kt:184)");
        }
        StripeImageKt.StripeImage(this.$entry.getKey(), this.$stripeImageLoader, null, BB5.m114254o(BB5.m114273A(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(C51465xB5.m5730i(this.$size))), C43705k61.m29303g(C51465xB5.m5732g(this.$size))), null, null, null, null, null, interfaceC32720Et0, 448, 496);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
