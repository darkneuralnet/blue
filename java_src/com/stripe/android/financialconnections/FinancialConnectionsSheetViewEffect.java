package com.stripe.android.financialconnections;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "", "()V", "FinishWithResult", "OpenAuthFlowWithUrl", "OpenNativeAuthFlow", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class FinancialConnectionsSheetViewEffect {

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V", "getResult", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class FinishWithResult extends FinancialConnectionsSheetViewEffect {
        public static final int $stable = 0;
        private final FinancialConnectionsSheetActivityResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(FinancialConnectionsSheetActivityResult result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ FinishWithResult copy$default(FinishWithResult finishWithResult, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetActivityResult = finishWithResult.result;
            }
            return finishWithResult.copy(financialConnectionsSheetActivityResult);
        }

        public final FinancialConnectionsSheetActivityResult component1() {
            return this.result;
        }

        public final FinishWithResult copy(FinancialConnectionsSheetActivityResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new FinishWithResult(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishWithResult) && Intrinsics.areEqual(this.result, ((FinishWithResult) obj).result);
        }

        public final FinancialConnectionsSheetActivityResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = this.result;
            return "FinishWithResult(result=" + financialConnectionsSheetActivityResult + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class OpenAuthFlowWithUrl extends FinancialConnectionsSheetViewEffect {
        public static final int $stable = 0;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenAuthFlowWithUrl(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenAuthFlowWithUrl copy$default(OpenAuthFlowWithUrl openAuthFlowWithUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openAuthFlowWithUrl.url;
            }
            return openAuthFlowWithUrl.copy(str);
        }

        public final String component1() {
            return this.url;
        }

        public final OpenAuthFlowWithUrl copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenAuthFlowWithUrl(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAuthFlowWithUrl) && Intrinsics.areEqual(this.url, ((OpenAuthFlowWithUrl) obj).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            String str = this.url;
            return "OpenAuthFlowWithUrl(url=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "initialSyncResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "getInitialSyncResponse", "()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class OpenNativeAuthFlow extends FinancialConnectionsSheetViewEffect {
        public static final int $stable = 8;
        private final FinancialConnectionsSheet.Configuration configuration;
        private final SynchronizeSessionResponse initialSyncResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenNativeAuthFlow(FinancialConnectionsSheet.Configuration configuration, SynchronizeSessionResponse initialSyncResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
            this.configuration = configuration;
            this.initialSyncResponse = initialSyncResponse;
        }

        public static /* synthetic */ OpenNativeAuthFlow copy$default(OpenNativeAuthFlow openNativeAuthFlow, FinancialConnectionsSheet.Configuration configuration, SynchronizeSessionResponse synchronizeSessionResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = openNativeAuthFlow.configuration;
            }
            if ((i & 2) != 0) {
                synchronizeSessionResponse = openNativeAuthFlow.initialSyncResponse;
            }
            return openNativeAuthFlow.copy(configuration, synchronizeSessionResponse);
        }

        public final FinancialConnectionsSheet.Configuration component1() {
            return this.configuration;
        }

        public final SynchronizeSessionResponse component2() {
            return this.initialSyncResponse;
        }

        public final OpenNativeAuthFlow copy(FinancialConnectionsSheet.Configuration configuration, SynchronizeSessionResponse initialSyncResponse) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
            return new OpenNativeAuthFlow(configuration, initialSyncResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenNativeAuthFlow) {
                OpenNativeAuthFlow openNativeAuthFlow = (OpenNativeAuthFlow) obj;
                return Intrinsics.areEqual(this.configuration, openNativeAuthFlow.configuration) && Intrinsics.areEqual(this.initialSyncResponse, openNativeAuthFlow.initialSyncResponse);
            }
            return false;
        }

        public final FinancialConnectionsSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public final SynchronizeSessionResponse getInitialSyncResponse() {
            return this.initialSyncResponse;
        }

        public int hashCode() {
            return (this.configuration.hashCode() * 31) + this.initialSyncResponse.hashCode();
        }

        public String toString() {
            FinancialConnectionsSheet.Configuration configuration = this.configuration;
            SynchronizeSessionResponse synchronizeSessionResponse = this.initialSyncResponse;
            return "OpenNativeAuthFlow(configuration=" + configuration + ", initialSyncResponse=" + synchronizeSessionResponse + ")";
        }
    }

    public /* synthetic */ FinancialConnectionsSheetViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FinancialConnectionsSheetViewEffect() {
    }
}
