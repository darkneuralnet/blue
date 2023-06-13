package com.stripe.android.financialconnections.presentation;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.VisualUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b.\u00102J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003JW\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b'\u0010\"R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-¨\u00063"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "LAN2;", "Ldp;", "", "component1", "", "component2", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "component3", "component4", "component5", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", "component6", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component7", "webAuthFlow", "firstInit", "configuration", "showCloseDialog", "reducedBranding", "viewEffect", "initialPane", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ldp;", "getWebAuthFlow", "()Ldp;", "Z", "getFirstInit", "()Z", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "getShowCloseDialog", "getReducedBranding", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", "getViewEffect", "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getInitialPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Ldp;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "args", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeState implements AN2 {
    private final FinancialConnectionsSheet.Configuration configuration;
    private final boolean firstInit;
    private final FinancialConnectionsSessionManifest.Pane initialPane;
    private final boolean reducedBranding;
    private final boolean showCloseDialog;
    private final FinancialConnectionsSheetNativeViewEffect viewEffect;
    private final AbstractC19862dp<String> webAuthFlow;

    public FinancialConnectionsSheetNativeState(AbstractC19862dp<String> webAuthFlow, @InterfaceC42714iR3 boolean z, FinancialConnectionsSheet.Configuration configuration, boolean z2, boolean z3, FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, FinancialConnectionsSessionManifest.Pane initialPane) {
        Intrinsics.checkNotNullParameter(webAuthFlow, "webAuthFlow");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialPane, "initialPane");
        this.webAuthFlow = webAuthFlow;
        this.firstInit = z;
        this.configuration = configuration;
        this.showCloseDialog = z2;
        this.reducedBranding = z3;
        this.viewEffect = financialConnectionsSheetNativeViewEffect;
        this.initialPane = initialPane;
    }

    public static /* synthetic */ FinancialConnectionsSheetNativeState copy$default(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, AbstractC19862dp abstractC19862dp, boolean z, FinancialConnectionsSheet.Configuration configuration, boolean z2, boolean z3, FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, FinancialConnectionsSessionManifest.Pane pane, int i, Object obj) {
        AbstractC19862dp<String> abstractC19862dp2 = abstractC19862dp;
        if ((i & 1) != 0) {
            abstractC19862dp2 = financialConnectionsSheetNativeState.webAuthFlow;
        }
        if ((i & 2) != 0) {
            z = financialConnectionsSheetNativeState.firstInit;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            configuration = financialConnectionsSheetNativeState.configuration;
        }
        FinancialConnectionsSheet.Configuration configuration2 = configuration;
        if ((i & 8) != 0) {
            z2 = financialConnectionsSheetNativeState.showCloseDialog;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = financialConnectionsSheetNativeState.reducedBranding;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            financialConnectionsSheetNativeViewEffect = financialConnectionsSheetNativeState.viewEffect;
        }
        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect2 = financialConnectionsSheetNativeViewEffect;
        if ((i & 64) != 0) {
            pane = financialConnectionsSheetNativeState.initialPane;
        }
        return financialConnectionsSheetNativeState.copy(abstractC19862dp2, z4, configuration2, z5, z6, financialConnectionsSheetNativeViewEffect2, pane);
    }

    public final AbstractC19862dp<String> component1() {
        return this.webAuthFlow;
    }

    public final boolean component2() {
        return this.firstInit;
    }

    public final FinancialConnectionsSheet.Configuration component3() {
        return this.configuration;
    }

    public final boolean component4() {
        return this.showCloseDialog;
    }

    public final boolean component5() {
        return this.reducedBranding;
    }

    public final FinancialConnectionsSheetNativeViewEffect component6() {
        return this.viewEffect;
    }

    public final FinancialConnectionsSessionManifest.Pane component7() {
        return this.initialPane;
    }

    public final FinancialConnectionsSheetNativeState copy(AbstractC19862dp<String> webAuthFlow, @InterfaceC42714iR3 boolean z, FinancialConnectionsSheet.Configuration configuration, boolean z2, boolean z3, FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, FinancialConnectionsSessionManifest.Pane initialPane) {
        Intrinsics.checkNotNullParameter(webAuthFlow, "webAuthFlow");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialPane, "initialPane");
        return new FinancialConnectionsSheetNativeState(webAuthFlow, z, configuration, z2, z3, financialConnectionsSheetNativeViewEffect, initialPane);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSheetNativeState) {
            FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) obj;
            return Intrinsics.areEqual(this.webAuthFlow, financialConnectionsSheetNativeState.webAuthFlow) && this.firstInit == financialConnectionsSheetNativeState.firstInit && Intrinsics.areEqual(this.configuration, financialConnectionsSheetNativeState.configuration) && this.showCloseDialog == financialConnectionsSheetNativeState.showCloseDialog && this.reducedBranding == financialConnectionsSheetNativeState.reducedBranding && Intrinsics.areEqual(this.viewEffect, financialConnectionsSheetNativeState.viewEffect) && this.initialPane == financialConnectionsSheetNativeState.initialPane;
        }
        return false;
    }

    public final FinancialConnectionsSheet.Configuration getConfiguration() {
        return this.configuration;
    }

    public final boolean getFirstInit() {
        return this.firstInit;
    }

    public final FinancialConnectionsSessionManifest.Pane getInitialPane() {
        return this.initialPane;
    }

    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    public final boolean getShowCloseDialog() {
        return this.showCloseDialog;
    }

    public final FinancialConnectionsSheetNativeViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final AbstractC19862dp<String> getWebAuthFlow() {
        return this.webAuthFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.webAuthFlow.hashCode() * 31;
        boolean z = this.firstInit;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.configuration.hashCode()) * 31;
        boolean z2 = this.showCloseDialog;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.reducedBranding;
        int i4 = (i3 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect = this.viewEffect;
        return ((i4 + (financialConnectionsSheetNativeViewEffect == null ? 0 : financialConnectionsSheetNativeViewEffect.hashCode())) * 31) + this.initialPane.hashCode();
    }

    public String toString() {
        AbstractC19862dp<String> abstractC19862dp = this.webAuthFlow;
        boolean z = this.firstInit;
        FinancialConnectionsSheet.Configuration configuration = this.configuration;
        boolean z2 = this.showCloseDialog;
        boolean z3 = this.reducedBranding;
        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect = this.viewEffect;
        FinancialConnectionsSessionManifest.Pane pane = this.initialPane;
        return "FinancialConnectionsSheetNativeState(webAuthFlow=" + abstractC19862dp + ", firstInit=" + z + ", configuration=" + configuration + ", showCloseDialog=" + z2 + ", reducedBranding=" + z3 + ", viewEffect=" + financialConnectionsSheetNativeViewEffect + ", initialPane=" + pane + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FinancialConnectionsSheetNativeState(FinancialConnectionsSheetNativeActivityArgs args) {
        this(r2, true, args.getConfiguration(), false, r0 != null ? r0.getReducedBranding() : false, null, args.getInitialSyncResponse().getManifest().getNextPane());
        Intrinsics.checkNotNullParameter(args, "args");
        C34454Md6 c34454Md6 = C34454Md6.f23316e;
        VisualUpdate visual = args.getInitialSyncResponse().getVisual();
    }
}
