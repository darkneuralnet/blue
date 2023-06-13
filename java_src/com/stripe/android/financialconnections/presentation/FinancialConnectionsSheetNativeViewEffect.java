package com.stripe.android.financialconnections.presentation;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", "", "Finish", "OpenUrl", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$Finish;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$OpenUrl;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsSheetNativeViewEffect {

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$Finish;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V", "getResult", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Finish implements FinancialConnectionsSheetNativeViewEffect {
        public static final int $stable = 0;
        private final FinancialConnectionsSheetActivityResult result;

        public Finish(FinancialConnectionsSheetActivityResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ Finish copy$default(Finish finish, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetActivityResult = finish.result;
            }
            return finish.copy(financialConnectionsSheetActivityResult);
        }

        public final FinancialConnectionsSheetActivityResult component1() {
            return this.result;
        }

        public final Finish copy(FinancialConnectionsSheetActivityResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Finish(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Finish) && Intrinsics.areEqual(this.result, ((Finish) obj).result);
        }

        public final FinancialConnectionsSheetActivityResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = this.result;
            return "Finish(result=" + financialConnectionsSheetActivityResult + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class OpenUrl implements FinancialConnectionsSheetNativeViewEffect {
        public static final int $stable = 0;
        private final String url;

        public OpenUrl(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openUrl.url;
            }
            return openUrl.copy(str);
        }

        public final String component1() {
            return this.url;
        }

        public final OpenUrl copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenUrl(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            String str = this.url;
            return "OpenUrl(url=" + str + ")";
        }
    }
}
