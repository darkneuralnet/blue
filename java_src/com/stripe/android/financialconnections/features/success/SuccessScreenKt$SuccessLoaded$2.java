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
public final class SuccessScreenKt$SuccessLoaded$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ AccessibleDataCalloutModel $accessibleDataModel;
    final /* synthetic */ List<PartnerAccount> $accounts;
    final /* synthetic */ String $businessName;
    final /* synthetic */ String $disconnectUrl;
    final /* synthetic */ FinancialConnectionsInstitution $institution;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ Function0<Unit> $onDisconnectLinkClick;
    final /* synthetic */ Function0<Unit> $onDoneClick;
    final /* synthetic */ Function0<Unit> $onLearnMoreAboutDataAccessClick;
    final /* synthetic */ Function0<Unit> $onLinkAnotherAccountClick;
    final /* synthetic */ C37135Xp5 $scrollState;
    final /* synthetic */ boolean $showLinkAnotherAccount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessScreenKt$SuccessLoaded$2(C37135Xp5 c37135Xp5, String str, List<PartnerAccount> list, AccessibleDataCalloutModel accessibleDataCalloutModel, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i, int i2) {
        super(2);
        this.$scrollState = c37135Xp5;
        this.$businessName = str;
        this.$accounts = list;
        this.$accessibleDataModel = accessibleDataCalloutModel;
        this.$disconnectUrl = str2;
        this.$institution = financialConnectionsInstitution;
        this.$loading = z;
        this.$showLinkAnotherAccount = z2;
        this.$onLearnMoreAboutDataAccessClick = function0;
        this.$onDisconnectLinkClick = function02;
        this.$onLinkAnotherAccountClick = function03;
        this.$onDoneClick = function04;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SuccessScreenKt.SuccessLoaded(this.$scrollState, this.$businessName, this.$accounts, this.$accessibleDataModel, this.$disconnectUrl, this.$institution, this.$loading, this.$showLinkAnotherAccount, this.$onLearnMoreAboutDataAccessClick, this.$onDisconnectLinkClick, this.$onLinkAnotherAccountClick, this.$onDoneClick, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
