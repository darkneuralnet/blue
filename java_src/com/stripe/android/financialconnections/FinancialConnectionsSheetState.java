package com.stripe.android.financialconnections;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.common.ConstantsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001:\u0001/B;\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b+\u0010,B\u0011\b\u0016\u0012\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b+\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00060"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "LAN2;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "component1", "", "component2", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "component3", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;", "component4", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "component5", "initialArgs", "activityRecreated", "manifest", "webAuthFlowStatus", "viewEffect", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "getInitialArgs", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Z", "getActivityRecreated", "()Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getManifest", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;", "getWebAuthFlowStatus", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "getViewEffect", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "getSessionSecret", "()Ljava/lang/String;", "sessionSecret", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;)V", "args", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)V", "AuthFlowStatus", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetState implements AN2 {
    private final boolean activityRecreated;
    private final FinancialConnectionsSheetActivityArgs initialArgs;
    private final FinancialConnectionsSessionManifest manifest;
    private final FinancialConnectionsSheetViewEffect viewEffect;
    private final AuthFlowStatus webAuthFlowStatus;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;", "", "(Ljava/lang/String;I)V", "ON_EXTERNAL_ACTIVITY", "INTERMEDIATE_DEEPLINK", ConstantsKt.NONE, "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum AuthFlowStatus {
        ON_EXTERNAL_ACTIVITY,
        INTERMEDIATE_DEEPLINK,
        NONE
    }

    public FinancialConnectionsSheetState(FinancialConnectionsSheetActivityArgs initialArgs, boolean z, @InterfaceC42714iR3 FinancialConnectionsSessionManifest financialConnectionsSessionManifest, @InterfaceC42714iR3 AuthFlowStatus webAuthFlowStatus, FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect) {
        Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
        Intrinsics.checkNotNullParameter(webAuthFlowStatus, "webAuthFlowStatus");
        this.initialArgs = initialArgs;
        this.activityRecreated = z;
        this.manifest = financialConnectionsSessionManifest;
        this.webAuthFlowStatus = webAuthFlowStatus;
        this.viewEffect = financialConnectionsSheetViewEffect;
    }

    public static /* synthetic */ FinancialConnectionsSheetState copy$default(FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs, boolean z, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, AuthFlowStatus authFlowStatus, FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSheetActivityArgs = financialConnectionsSheetState.initialArgs;
        }
        if ((i & 2) != 0) {
            z = financialConnectionsSheetState.activityRecreated;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            financialConnectionsSessionManifest = financialConnectionsSheetState.manifest;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
        if ((i & 8) != 0) {
            authFlowStatus = financialConnectionsSheetState.webAuthFlowStatus;
        }
        AuthFlowStatus authFlowStatus2 = authFlowStatus;
        if ((i & 16) != 0) {
            financialConnectionsSheetViewEffect = financialConnectionsSheetState.viewEffect;
        }
        return financialConnectionsSheetState.copy(financialConnectionsSheetActivityArgs, z2, financialConnectionsSessionManifest2, authFlowStatus2, financialConnectionsSheetViewEffect);
    }

    public final FinancialConnectionsSheetActivityArgs component1() {
        return this.initialArgs;
    }

    public final boolean component2() {
        return this.activityRecreated;
    }

    public final FinancialConnectionsSessionManifest component3() {
        return this.manifest;
    }

    public final AuthFlowStatus component4() {
        return this.webAuthFlowStatus;
    }

    public final FinancialConnectionsSheetViewEffect component5() {
        return this.viewEffect;
    }

    public final FinancialConnectionsSheetState copy(FinancialConnectionsSheetActivityArgs initialArgs, boolean z, @InterfaceC42714iR3 FinancialConnectionsSessionManifest financialConnectionsSessionManifest, @InterfaceC42714iR3 AuthFlowStatus webAuthFlowStatus, FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect) {
        Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
        Intrinsics.checkNotNullParameter(webAuthFlowStatus, "webAuthFlowStatus");
        return new FinancialConnectionsSheetState(initialArgs, z, financialConnectionsSessionManifest, webAuthFlowStatus, financialConnectionsSheetViewEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSheetState) {
            FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) obj;
            return Intrinsics.areEqual(this.initialArgs, financialConnectionsSheetState.initialArgs) && this.activityRecreated == financialConnectionsSheetState.activityRecreated && Intrinsics.areEqual(this.manifest, financialConnectionsSheetState.manifest) && this.webAuthFlowStatus == financialConnectionsSheetState.webAuthFlowStatus && Intrinsics.areEqual(this.viewEffect, financialConnectionsSheetState.viewEffect);
        }
        return false;
    }

    public final boolean getActivityRecreated() {
        return this.activityRecreated;
    }

    public final FinancialConnectionsSheetActivityArgs getInitialArgs() {
        return this.initialArgs;
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public final String getSessionSecret() {
        return this.initialArgs.getConfiguration().getFinancialConnectionsSessionClientSecret();
    }

    public final FinancialConnectionsSheetViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final AuthFlowStatus getWebAuthFlowStatus() {
        return this.webAuthFlowStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.initialArgs.hashCode() * 31;
        boolean z = this.activityRecreated;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.manifest;
        int hashCode2 = (((i2 + (financialConnectionsSessionManifest == null ? 0 : financialConnectionsSessionManifest.hashCode())) * 31) + this.webAuthFlowStatus.hashCode()) * 31;
        FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect = this.viewEffect;
        return hashCode2 + (financialConnectionsSheetViewEffect != null ? financialConnectionsSheetViewEffect.hashCode() : 0);
    }

    public String toString() {
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = this.initialArgs;
        boolean z = this.activityRecreated;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.manifest;
        AuthFlowStatus authFlowStatus = this.webAuthFlowStatus;
        FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect = this.viewEffect;
        return "FinancialConnectionsSheetState(initialArgs=" + financialConnectionsSheetActivityArgs + ", activityRecreated=" + z + ", manifest=" + financialConnectionsSessionManifest + ", webAuthFlowStatus=" + authFlowStatus + ", viewEffect=" + financialConnectionsSheetViewEffect + ")";
    }

    public /* synthetic */ FinancialConnectionsSheetState(FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs, boolean z, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, AuthFlowStatus authFlowStatus, FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(financialConnectionsSheetActivityArgs, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : financialConnectionsSessionManifest, (i & 8) != 0 ? AuthFlowStatus.NONE : authFlowStatus, (i & 16) != 0 ? null : financialConnectionsSheetViewEffect);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetState(FinancialConnectionsSheetActivityArgs args) {
        this(args, false, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(args, "args");
    }
}
