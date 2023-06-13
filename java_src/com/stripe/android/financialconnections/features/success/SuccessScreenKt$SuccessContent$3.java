package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SuccessScreenKt$SuccessContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ AccessibleDataCalloutModel $accessibleDataModel;
    final /* synthetic */ List<PartnerAccount> $accounts;
    final /* synthetic */ String $businessName;
    final /* synthetic */ String $disconnectUrl;
    final /* synthetic */ FinancialConnectionsInstitution $institution;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onDisconnectLinkClick;
    final /* synthetic */ Function0<Unit> $onDoneClick;
    final /* synthetic */ Function0<Unit> $onLearnMoreAboutDataAccessClick;
    final /* synthetic */ Function0<Unit> $onLinkAnotherAccountClick;
    final /* synthetic */ boolean $showLinkAnotherAccount;
    final /* synthetic */ boolean $skipSuccessPane;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessScreenKt$SuccessContent$3(AccessibleDataCalloutModel accessibleDataCalloutModel, String str, List<PartnerAccount> list, FinancialConnectionsInstitution financialConnectionsInstitution, String str2, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, boolean z3, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i, int i2) {
        super(2);
        this.$accessibleDataModel = accessibleDataCalloutModel;
        this.$disconnectUrl = str;
        this.$accounts = list;
        this.$institution = financialConnectionsInstitution;
        this.$businessName = str2;
        this.$loading = z;
        this.$skipSuccessPane = z2;
        this.$onDoneClick = function0;
        this.$onLinkAnotherAccountClick = function02;
        this.$showLinkAnotherAccount = z3;
        this.$onLearnMoreAboutDataAccessClick = function03;
        this.$onDisconnectLinkClick = function04;
        this.$onCloseClick = function05;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SuccessScreenKt.SuccessContent(this.$accessibleDataModel, this.$disconnectUrl, this.$accounts, this.$institution, this.$businessName, this.$loading, this.$skipSuccessPane, this.$onDoneClick, this.$onLinkAnotherAccountClick, this.$showLinkAnotherAccount, this.$onLearnMoreAboutDataAccessClick, this.$onDisconnectLinkClick, this.$onCloseClick, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
