package com.stripe.android.p049ui.core.elements.menu;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.F96;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuContent$scale$2 */
/* loaded from: classes7.dex */
public final class MenuKt$DropdownMenuContent$scale$2 extends Lambda implements Function3<F96.InterfaceC2189b<Boolean>, InterfaceC32720Et0, Integer, InterfaceC49435tm1<Float>> {
    public static final MenuKt$DropdownMenuContent$scale$2 INSTANCE = new MenuKt$DropdownMenuContent$scale$2();

    public MenuKt$DropdownMenuContent$scale$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<Boolean> interfaceC2189b, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        return invoke(interfaceC2189b, interfaceC32720Et0, num.intValue());
    }

    public final InterfaceC49435tm1<Float> invoke(F96.InterfaceC2189b<Boolean> animateFloat, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        C49330tb6 m25219k;
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        interfaceC32720Et0.mo89638F(-1463883851);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1463883851, i, -1, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent.<anonymous> (Menu.kt:79)");
        }
        if (animateFloat.m107505a(Boolean.FALSE, Boolean.TRUE)) {
            m25219k = C26160mf.m25219k(120, 0, C42549i91.m34393d(), 2, null);
        } else {
            m25219k = C26160mf.m25219k(1, 74, null, 4, null);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m25219k;
    }
}
