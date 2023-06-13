package com.stripe.android.financialconnections.features.attachpayment;

import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AttachPaymentScreenKt$AttachPaymentContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ AbstractC19862dp<LinkAccountSessionPaymentAccount> $attachPayment;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ AbstractC19862dp<AttachPaymentState.Payload> $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttachPaymentScreenKt$AttachPaymentContent$2(AbstractC19862dp<AttachPaymentState.Payload> abstractC19862dp, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, int i) {
        super(3);
        this.$payload = abstractC19862dp;
        this.$attachPayment = abstractC19862dp2;
        this.$onSelectAnotherBank = function0;
        this.$onEnterDetailsManually = function02;
        this.$onCloseFromErrorClick = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String m41311b;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(887265878, i, -1, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentContent.<anonymous> (AttachPaymentScreen.kt:59)");
        }
        AbstractC19862dp<AttachPaymentState.Payload> abstractC19862dp = this.$payload;
        if (Intrinsics.areEqual(abstractC19862dp, C34454Md6.f23316e) ? true : abstractC19862dp instanceof C31786At2) {
            interfaceC32720Et0.mo89638F(-2104116176);
            LoadingContentKt.LoadingContent(null, null, null, interfaceC32720Et0, 0, 7);
            interfaceC32720Et0.mo89605Q();
        } else if (abstractC19862dp instanceof C51034wT5) {
            interfaceC32720Et0.mo89638F(-2104116133);
            AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2 = this.$attachPayment;
            if (abstractC19862dp2 instanceof C31786At2 ? true : abstractC19862dp2 instanceof C34454Md6 ? true : abstractC19862dp2 instanceof C51034wT5) {
                interfaceC32720Et0.mo89638F(-2104116018);
                String m41312a = C40946fS5.m41312a(C18634R.plurals.stripe_attachlinkedpaymentaccount_title, ((AttachPaymentState.Payload) ((C51034wT5) this.$payload).mo6788a()).getAccountsCount(), interfaceC32720Et0, 0);
                String businessName = ((AttachPaymentState.Payload) ((C51034wT5) this.$payload).mo6788a()).getBusinessName();
                if (businessName == null) {
                    m41311b = C40946fS5.m41312a(C18634R.plurals.stripe_attachlinkedpaymentaccount_desc, ((AttachPaymentState.Payload) ((C51034wT5) this.$payload).mo6788a()).getAccountsCount(), interfaceC32720Et0, 0);
                } else {
                    m41311b = C40946fS5.m41311b(C18634R.plurals.stripe_attachlinkedpaymentaccount_desc, ((AttachPaymentState.Payload) ((C51034wT5) this.$payload).mo6788a()).getAccountsCount(), new Object[]{businessName}, interfaceC32720Et0, 512);
                }
                LoadingContentKt.LoadingContent(null, m41312a, m41311b, interfaceC32720Et0, 0, 1);
                interfaceC32720Et0.mo89605Q();
            } else if (abstractC19862dp2 instanceof C32163Cj1) {
                interfaceC32720Et0.mo89638F(-2104115156);
                Throwable m111793b = ((C32163Cj1) this.$attachPayment).m111793b();
                Function0<Unit> function0 = this.$onSelectAnotherBank;
                Function0<Unit> function02 = this.$onEnterDetailsManually;
                Function1<Throwable, Unit> function1 = this.$onCloseFromErrorClick;
                int i2 = this.$$dirty;
                AttachPaymentScreenKt.ErrorContent(m111793b, function0, function02, function1, interfaceC32720Et0, ((i2 >> 3) & 112) | 8 | ((i2 >> 3) & 896) | ((i2 >> 6) & 7168));
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(-2104114864);
                interfaceC32720Et0.mo89605Q();
            }
            interfaceC32720Et0.mo89605Q();
        } else if (abstractC19862dp instanceof C32163Cj1) {
            interfaceC32720Et0.mo89638F(-2104114839);
            Throwable m111793b2 = ((C32163Cj1) this.$payload).m111793b();
            Function0<Unit> function03 = this.$onSelectAnotherBank;
            Function0<Unit> function04 = this.$onEnterDetailsManually;
            Function1<Throwable, Unit> function12 = this.$onCloseFromErrorClick;
            int i3 = this.$$dirty;
            AttachPaymentScreenKt.ErrorContent(m111793b2, function03, function04, function12, interfaceC32720Et0, ((i3 >> 3) & 112) | 8 | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168));
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-2104114577);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
