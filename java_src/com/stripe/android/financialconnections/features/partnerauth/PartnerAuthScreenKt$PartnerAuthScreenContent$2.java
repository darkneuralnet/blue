package com.stripe.android.financialconnections.features.partnerauth;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreenContent$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ PartnerAuthState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAuthScreenKt$PartnerAuthScreenContent$2(PartnerAuthState partnerAuthState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Throwable, Unit> function1, Function0<Unit> function04, Function1<? super String, Unit> function12, int i) {
        super(2);
        this.$state = partnerAuthState;
        this.$onCloseClick = function0;
        this.$onSelectAnotherBank = function02;
        this.$onEnterDetailsManually = function03;
        this.$onCloseFromErrorClick = function1;
        this.$onContinueClick = function04;
        this.$onClickableTextClick = function12;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(140181606, i, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenContent.<anonymous> (PartnerAuthScreen.kt:170)");
        }
        PartnerAuthState partnerAuthState = this.$state;
        Function0<Unit> function0 = this.$onCloseClick;
        Function0<Unit> function02 = this.$onSelectAnotherBank;
        Function0<Unit> function03 = this.$onEnterDetailsManually;
        Function1<Throwable, Unit> function1 = this.$onCloseFromErrorClick;
        Function0<Unit> function04 = this.$onContinueClick;
        Function1<String, Unit> function12 = this.$onClickableTextClick;
        int i2 = this.$$dirty;
        PartnerAuthScreenKt.PartnerAuthScreenMainContent(partnerAuthState, function0, function02, function03, function1, function04, function12, interfaceC32720Et0, ((i2 >> 15) & 112) | 8 | ((i2 >> 3) & 896) | ((i2 >> 6) & 7168) | ((i2 >> 9) & 57344) | (458752 & (i2 << 9)) | ((i2 << 6) & 3670016));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
