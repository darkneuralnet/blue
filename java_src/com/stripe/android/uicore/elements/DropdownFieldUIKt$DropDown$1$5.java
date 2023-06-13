package com.stripe.android.uicore.elements;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDropdownFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1864#2,3:245\n*S KotlinDebug\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5\n*L\n175#1:245,3\n*E\n"})
/* loaded from: classes7.dex */
public final class DropdownFieldUIKt$DropDown$1$5 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ DropdownFieldController $controller;
    final /* synthetic */ long $currentTextColor;
    final /* synthetic */ EX2<Boolean> $expanded$delegate;
    final /* synthetic */ List<String> $items;
    final /* synthetic */ InterfaceC48627sP5<Integer> $selectedIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$5(List<String> list, long j, InterfaceC48627sP5<Integer> interfaceC48627sP5, DropdownFieldController dropdownFieldController, EX2<Boolean> ex2) {
        super(3);
        this.$items = list;
        this.$currentTextColor = j;
        this.$selectedIndex$delegate = interfaceC48627sP5;
        this.$controller = dropdownFieldController;
        this.$expanded$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 DropdownMenu, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int DropDown$lambda$1;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1670751007, i, -1, "com.stripe.android.uicore.elements.DropDown.<anonymous>.<anonymous> (DropdownFieldUI.kt:173)");
        }
        long j = this.$currentTextColor;
        InterfaceC48627sP5<Integer> interfaceC48627sP5 = this.$selectedIndex$delegate;
        DropdownFieldController dropdownFieldController = this.$controller;
        EX2<Boolean> ex2 = this.$expanded$delegate;
        int i2 = 0;
        for (Object obj : this.$items) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            DropDown$lambda$1 = DropdownFieldUIKt.DropDown$lambda$1(interfaceC48627sP5);
            DropdownFieldUIKt.m116734DropdownMenuItemcf5BqRc(str, i2 == DropDown$lambda$1, j, new DropdownFieldUIKt$DropDown$1$5$1$1(dropdownFieldController, i2, ex2), interfaceC32720Et0, 0, 0);
            i2 = i3;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
