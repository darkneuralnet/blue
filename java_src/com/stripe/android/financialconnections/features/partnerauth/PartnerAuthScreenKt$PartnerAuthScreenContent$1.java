package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPartnerAuthScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,538:1\n154#2:539\n*S KotlinDebug\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$1\n*L\n169#1:539\n*E\n"})
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreenContent$1 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onConfirmModalClick;
    final /* synthetic */ PartnerAuthState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAuthScreenKt$PartnerAuthScreenContent$1(PartnerAuthState partnerAuthState, Function1<? super String, Unit> function1, Function0<Unit> function0, int i) {
        super(3);
        this.$state = partnerAuthState;
        this.$onClickableTextClick = function1;
        this.$onConfirmModalClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 ModalBottomSheetLayout, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Unit unit;
        Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-800417298, i, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenContent.<anonymous> (PartnerAuthScreen.kt:161)");
        }
        DataAccessNotice dataAccess = this.$state.getDataAccess();
        interfaceC32720Et0.mo89638F(-1295750456);
        if (dataAccess == null) {
            unit = null;
        } else {
            Function1<String, Unit> function1 = this.$onClickableTextClick;
            Function0<Unit> function0 = this.$onConfirmModalClick;
            int i2 = this.$$dirty;
            ModalBottomSheetContentKt.DataAccessBottomSheetContent(dataAccess, function1, function0, interfaceC32720Et0, ((i2 >> 18) & 896) | ((i2 >> 9) & 112) | 8);
            unit = Unit.INSTANCE;
        }
        interfaceC32720Et0.mo89605Q();
        if (unit == null) {
            DN5.m110552a(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(16)), interfaceC32720Et0, 6);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
