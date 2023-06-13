package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddressElementPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,84:1\n76#2:85\n*S KotlinDebug\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1$1$1\n*L\n77#1:85\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1$1$1 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $onBackground;
    final /* synthetic */ String $text;
    final /* synthetic */ G26 $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1$1$1(String str, long j, G26 g26, int i) {
        super(3);
        this.$text = str;
        this.$onBackground = j;
        this.$textStyle = g26;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 TextButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1203725918, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementPrimaryButton.<anonymous>.<anonymous>.<anonymous> (AddressElementPrimaryButton.kt:73)");
        }
        C38909c26.m62000e(this.$text, null, C47063pm0.m18743m(this.$onBackground, ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, this.$textStyle, interfaceC32720Et0, (this.$$dirty >> 3) & 14, 0, 32762);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
