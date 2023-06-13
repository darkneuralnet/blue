package com.stripe.android.financialconnections.navigation;

import android.os.Bundle;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/financialconnections/navigation/NavigationDirections;", "", "()V", "Default", "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;", "getDefault", "()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;", "accountPicker", "getAccountPicker", "attachLinkedPaymentAccount", "getAttachLinkedPaymentAccount", "consent", "getConsent", "institutionPicker", "getInstitutionPicker", "manualEntry", "getManualEntry", "partnerAuth", "getPartnerAuth", "reset", "getReset", "success", "getSuccess", "ManualEntrySuccess", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class NavigationDirections {
    public static final NavigationDirections INSTANCE = new NavigationDirections();
    private static final NavigationCommand institutionPicker = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$institutionPicker$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "bank-picker";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand consent = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$consent$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "bank-intro";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand partnerAuth = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$partnerAuth$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "partner-auth";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand accountPicker = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$accountPicker$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "account-picker";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand success = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$success$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "success";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand manualEntry = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$manualEntry$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "manual_entry";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand attachLinkedPaymentAccount = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$attachLinkedPaymentAccount$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "attach_linked_payment_account";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand reset = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$reset$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "reset";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };
    private static final NavigationCommand Default = new NavigationCommand() { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$Default$1
        private final List<C45148mY2> arguments;
        private final String destination;

        {
            List<C45148mY2> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.arguments = emptyList;
            this.destination = "";
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public List<C45148mY2> getArguments() {
            return this.arguments;
        }

        @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
        public String getDestination() {
            return this.destination;
        }
    };

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bJ\u001f\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0086\u0002R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;", "", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "microdepositVerificationMethod", "", ManualEntrySuccess.KEY_LAST4, "", "argMap", "LAY2;", "backStackEntry", ManualEntrySuccess.KEY_MICRODEPOSITS, "args", "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;", "invoke", "KEY_MICRODEPOSITS", "Ljava/lang/String;", "KEY_LAST4", "route", "", "LmY2;", "arguments", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class ManualEntrySuccess {
        public static final int $stable;
        public static final ManualEntrySuccess INSTANCE = new ManualEntrySuccess();
        private static final String KEY_LAST4 = "last4";
        private static final String KEY_MICRODEPOSITS = "microdeposits";
        private static final List<C45148mY2> arguments;
        public static final String route = "manual_entry_success?microdeposits={microdeposits},last4={last4}";

        static {
            List<C45148mY2> listOf;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C45148mY2[]{C45741nY2.m23553a(KEY_LAST4, NavigationDirections$ManualEntrySuccess$arguments$1.INSTANCE), C45741nY2.m23553a(KEY_MICRODEPOSITS, NavigationDirections$ManualEntrySuccess$arguments$2.INSTANCE)});
            arguments = listOf;
            $stable = 8;
        }

        private ManualEntrySuccess() {
        }

        public final Map<String, Object> argMap(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod, String str) {
            Map<String, Object> mapOf;
            Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(KEY_MICRODEPOSITS, microdepositVerificationMethod), TuplesKt.m28425to(KEY_LAST4, str));
            return mapOf;
        }

        public final List<C45148mY2> getArguments() {
            return arguments;
        }

        public final NavigationCommand invoke(final Map<String, ? extends Object> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new NavigationCommand(args) { // from class: com.stripe.android.financialconnections.navigation.NavigationDirections$ManualEntrySuccess$invoke$1
                private final List<C45148mY2> arguments = NavigationDirections.ManualEntrySuccess.INSTANCE.getArguments();
                private final String destination;
                private final String last4;
                private final LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdeposits;

                {
                    Object value;
                    String str;
                    Object value2;
                    value = MapsKt__MapsKt.getValue(args, "last4");
                    if (value instanceof String) {
                        str = (String) value;
                    } else {
                        str = null;
                    }
                    this.last4 = str;
                    value2 = MapsKt__MapsKt.getValue(args, "microdeposits");
                    LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod = value2 instanceof LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod ? (LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod) value2 : null;
                    this.microdeposits = microdepositVerificationMethod;
                    this.destination = "manual_entry_success?microdeposits=" + microdepositVerificationMethod + ",last4=" + str;
                }

                @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
                public List<C45148mY2> getArguments() {
                    return this.arguments;
                }

                @Override // com.stripe.android.financialconnections.navigation.NavigationCommand
                public String getDestination() {
                    return this.destination;
                }

                public final String getLast4() {
                    return this.last4;
                }

                public final LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod getMicrodeposits() {
                    return this.microdeposits;
                }
            };
        }

        public final String last4(AY2 backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            Bundle m115584d = backStackEntry.m115584d();
            if (m115584d != null) {
                return m115584d.getString(KEY_LAST4);
            }
            return null;
        }

        public final LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdeposits(AY2 backStackEntry) {
            Serializable serializable;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            Bundle m115584d = backStackEntry.m115584d();
            if (m115584d != null) {
                serializable = m115584d.getSerializable(KEY_MICRODEPOSITS);
            } else {
                serializable = null;
            }
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod");
            return (LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod) serializable;
        }
    }

    private NavigationDirections() {
    }

    public final NavigationCommand getAccountPicker() {
        return accountPicker;
    }

    public final NavigationCommand getAttachLinkedPaymentAccount() {
        return attachLinkedPaymentAccount;
    }

    public final NavigationCommand getConsent() {
        return consent;
    }

    public final NavigationCommand getDefault() {
        return Default;
    }

    public final NavigationCommand getInstitutionPicker() {
        return institutionPicker;
    }

    public final NavigationCommand getManualEntry() {
        return manualEntry;
    }

    public final NavigationCommand getPartnerAuth() {
        return partnerAuth;
    }

    public final NavigationCommand getReset() {
        return reset;
    }

    public final NavigationCommand getSuccess() {
        return success;
    }
}
