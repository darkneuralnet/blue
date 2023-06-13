package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeImageKt$StripeImage$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C48841sm0 $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ BA0 $contentScale;
    final /* synthetic */ AbstractC45562nE3 $debugPainter;
    final /* synthetic */ Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> $errorContent;
    final /* synthetic */ StripeImageLoader $imageLoader;
    final /* synthetic */ Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> $loadingContent;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StripeImageKt$StripeImage$2(String str, StripeImageLoader stripeImageLoader, String str2, InterfaceC41563gV2 interfaceC41563gV2, BA0 ba0, C48841sm0 c48841sm0, AbstractC45562nE3 abstractC45562nE3, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, int i, int i2) {
        super(2);
        this.$url = str;
        this.$imageLoader = stripeImageLoader;
        this.$contentDescription = str2;
        this.$modifier = interfaceC41563gV2;
        this.$contentScale = ba0;
        this.$colorFilter = c48841sm0;
        this.$debugPainter = abstractC45562nE3;
        this.$errorContent = function3;
        this.$loadingContent = function32;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        StripeImageKt.StripeImage(this.$url, this.$imageLoader, this.$contentDescription, this.$modifier, this.$contentScale, this.$colorFilter, this.$debugPainter, this.$errorContent, this.$loadingContent, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
