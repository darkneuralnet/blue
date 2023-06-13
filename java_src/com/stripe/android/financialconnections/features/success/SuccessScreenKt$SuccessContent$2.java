package com.stripe.android.financialconnections.features.success;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SuccessScreenKt$SuccessContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
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
    final /* synthetic */ boolean $skipSuccessPane;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessScreenKt$SuccessContent$2(boolean z, C37135Xp5 c37135Xp5, String str, List<PartnerAccount> list, AccessibleDataCalloutModel accessibleDataCalloutModel, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i, int i2) {
        super(3);
        this.$skipSuccessPane = z;
        this.$scrollState = c37135Xp5;
        this.$businessName = str;
        this.$accounts = list;
        this.$accessibleDataModel = accessibleDataCalloutModel;
        this.$disconnectUrl = str2;
        this.$institution = financialConnectionsInstitution;
        this.$loading = z2;
        this.$showLinkAnotherAccount = z3;
        this.$onLearnMoreAboutDataAccessClick = function0;
        this.$onDisconnectLinkClick = function02;
        this.$onLinkAnotherAccountClick = function03;
        this.$onDoneClick = function04;
        this.$$dirty = i;
        this.$$dirty1 = i2;
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
            C35528Qt0.m87816Z(-664471138, i, -1, "com.stripe.android.financialconnections.features.success.SuccessContent.<anonymous> (SuccessScreen.kt:94)");
        }
        if (this.$skipSuccessPane) {
            interfaceC32720Et0.mo89638F(-1068409297);
            SuccessScreenKt.SuccessLoading(interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-1068409251);
            C37135Xp5 c37135Xp5 = this.$scrollState;
            String str = this.$businessName;
            List<PartnerAccount> list = this.$accounts;
            AccessibleDataCalloutModel accessibleDataCalloutModel = this.$accessibleDataModel;
            String str2 = this.$disconnectUrl;
            FinancialConnectionsInstitution financialConnectionsInstitution = this.$institution;
            boolean z = this.$loading;
            boolean z2 = this.$showLinkAnotherAccount;
            Function0<Unit> function0 = this.$onLearnMoreAboutDataAccessClick;
            Function0<Unit> function02 = this.$onDisconnectLinkClick;
            Function0<Unit> function03 = this.$onLinkAnotherAccountClick;
            Function0<Unit> function04 = this.$onDoneClick;
            int i2 = this.$$dirty;
            int i3 = this.$$dirty1;
            SuccessScreenKt.SuccessLoaded(c37135Xp5, str, list, accessibleDataCalloutModel, str2, financialConnectionsInstitution, z, z2, function0, function02, function03, function04, interfaceC32720Et0, ((i2 >> 9) & 112) | 4608 | ((i2 << 9) & 57344) | ((i2 << 6) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i2 << 3) & 3670016) | ((i2 >> 6) & 29360128) | ((i3 << 24) & 234881024) | ((i3 << 24) & 1879048192), ((i2 >> 24) & 14) | ((i2 >> 18) & 112));
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
