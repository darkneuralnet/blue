package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntrySuccessScreenKt$ManualEntrySuccessContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $last4;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod $microdepositVerificationMethod;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onDoneClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntrySuccessScreenKt$ManualEntrySuccessContent$3(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod, String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$microdepositVerificationMethod = microdepositVerificationMethod;
        this.$last4 = str;
        this.$loading = z;
        this.$onCloseClick = function0;
        this.$onDoneClick = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ManualEntrySuccessScreenKt.ManualEntrySuccessContent(this.$microdepositVerificationMethod, this.$last4, this.$loading, this.$onCloseClick, this.$onDoneClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
