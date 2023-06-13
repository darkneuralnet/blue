package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccessibleDataCalloutKt$AccessibleDataCallout$1 extends Lambda implements Function3<InterfaceC40096e10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ AccessibleDataCalloutModel $model;
    final /* synthetic */ Function0<Unit> $onLearnMoreClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibleDataCalloutKt$AccessibleDataCallout$1(AccessibleDataCalloutModel accessibleDataCalloutModel, Function0<Unit> function0, int i) {
        super(3);
        this.$model = accessibleDataCalloutModel;
        this.$onLearnMoreClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40096e10 interfaceC40096e10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC40096e10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC40096e10 AccessibleDataCalloutBox, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(AccessibleDataCalloutBox, "$this$AccessibleDataCalloutBox");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1459459175, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCallout.<anonymous> (AccessibleDataCallout.kt:49)");
        }
        AccessibleDataCalloutKt.AccessibleDataText(this.$model, this.$onLearnMoreClick, interfaceC32720Et0, (this.$$dirty & 112) | 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
