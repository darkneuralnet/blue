package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreenMainContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ PartnerAuthState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAuthScreenKt$PartnerAuthScreenMainContent$2(PartnerAuthState partnerAuthState, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, int i, Function0<Unit> function03, Function1<? super String, Unit> function12) {
        super(3);
        this.$state = partnerAuthState;
        this.$onSelectAnotherBank = function0;
        this.$onEnterDetailsManually = function02;
        this.$onCloseFromErrorClick = function1;
        this.$$dirty = i;
        this.$onContinueClick = function03;
        this.$onClickableTextClick = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1372492670, i, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenMainContent.<anonymous> (PartnerAuthScreen.kt:201)");
        }
        AbstractC19862dp<PartnerAuthState.Payload> payload = this.$state.getPayload();
        if (Intrinsics.areEqual(payload, C34454Md6.f23316e) ? true : payload instanceof C31786At2) {
            interfaceC32720Et0.mo89638F(-774904425);
            LoadingContentKt.LoadingContent(null, C40946fS5.m41310c(C18634R.string.stripe_partnerauth_loading_title, interfaceC32720Et0, 0), C40946fS5.m41310c(C18634R.string.stripe_partnerauth_loading_desc, interfaceC32720Et0, 0), interfaceC32720Et0, 0, 1);
            interfaceC32720Et0.mo89605Q();
        } else if (payload instanceof C32163Cj1) {
            interfaceC32720Et0.mo89638F(-774904195);
            Throwable m111793b = ((C32163Cj1) payload).m111793b();
            Function0<Unit> function0 = this.$onSelectAnotherBank;
            Function0<Unit> function02 = this.$onEnterDetailsManually;
            Function1<Throwable, Unit> function1 = this.$onCloseFromErrorClick;
            int i2 = this.$$dirty;
            PartnerAuthScreenKt.ErrorContent(m111793b, function0, function02, function1, interfaceC32720Et0, ((i2 >> 3) & 112) | 8 | ((i2 >> 3) & 896) | ((i2 >> 3) & 7168));
            interfaceC32720Et0.mo89605Q();
        } else if (payload instanceof C51034wT5) {
            interfaceC32720Et0.mo89638F(-774903915);
            AbstractC19862dp<String> authenticationStatus = this.$state.getAuthenticationStatus();
            PartnerAuthState.Payload payload2 = (PartnerAuthState.Payload) ((C51034wT5) payload).mo6788a();
            Function0<Unit> function03 = this.$onContinueClick;
            Function0<Unit> function04 = this.$onSelectAnotherBank;
            Function1<String, Unit> function12 = this.$onClickableTextClick;
            int i3 = this.$$dirty;
            PartnerAuthScreenKt.LoadedContent(authenticationStatus, payload2, function03, function04, function12, interfaceC32720Et0, ((i3 >> 9) & 896) | 72 | ((i3 << 3) & 7168) | ((i3 >> 6) & 57344));
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-774903602);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
