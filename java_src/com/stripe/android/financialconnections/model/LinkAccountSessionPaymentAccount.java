package com.stripe.android.financialconnections.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 72\u00020\u0001:\u0003879B=\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b1\u00102BW\b\u0017\u0012\u0006\u00103\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b1\u00106J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\rR \u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b(\u0010)R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010$\u0012\u0004\b,\u0010#\u001a\u0004\b+\u0010\rR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010-\u0012\u0004\b0\u0010#\u001a\u0004\b.\u0010/¨\u0006:"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Boolean;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "component3", "component4", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component5", "id", "eligibleForNetworking", "microdepositVerificationMethod", "networkingSuccessful", "nextPane", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "Ljava/lang/Boolean;", "getEligibleForNetworking", "getEligibleForNetworking$annotations", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "getMicrodepositVerificationMethod", "()Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "getMicrodepositVerificationMethod$annotations", "getNetworkingSuccessful", "getNetworkingSuccessful$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lbt5;)V", "Companion", "$serializer", "MicrodepositVerificationMethod", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class LinkAccountSessionPaymentAccount {
    public static final Companion Companion = new Companion(null);
    private final Boolean eligibleForNetworking;

    /* renamed from: id */
    private final String f75312id;
    private final MicrodepositVerificationMethod microdepositVerificationMethod;
    private final Boolean networkingSuccessful;
    private final FinancialConnectionsSessionManifest.Pane nextPane;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<LinkAccountSessionPaymentAccount> serializer() {
            return LinkAccountSessionPaymentAccount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AMOUNTS", "DESCRIPTOR_CODE", "UNKNOWN", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public enum MicrodepositVerificationMethod {
        AMOUNTS("amounts"),
        DESCRIPTOR_CODE("descriptor_code"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return MicrodepositVerificationMethod.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<MicrodepositVerificationMethod> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18889x9545810a.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        MicrodepositVerificationMethod(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LinkAccountSessionPaymentAccount(int i, @InterfaceC36694Vs5("id") String str, @InterfaceC36694Vs5("eligible_for_networking") Boolean bool, @InterfaceC36694Vs5("microdeposit_verification_method") MicrodepositVerificationMethod microdepositVerificationMethod, @InterfaceC36694Vs5("networking_successful") Boolean bool2, @InterfaceC36694Vs5("next_pane") FinancialConnectionsSessionManifest.Pane pane, C38819bt5 c38819bt5) {
        if (1 != (i & 1)) {
            C52838zW3.m1275b(i, 1, LinkAccountSessionPaymentAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.f75312id = str;
        if ((i & 2) == 0) {
            this.eligibleForNetworking = null;
        } else {
            this.eligibleForNetworking = bool;
        }
        if ((i & 4) == 0) {
            this.microdepositVerificationMethod = MicrodepositVerificationMethod.UNKNOWN;
        } else {
            this.microdepositVerificationMethod = microdepositVerificationMethod;
        }
        if ((i & 8) == 0) {
            this.networkingSuccessful = null;
        } else {
            this.networkingSuccessful = bool2;
        }
        if ((i & 16) == 0) {
            this.nextPane = null;
        } else {
            this.nextPane = pane;
        }
    }

    public static /* synthetic */ LinkAccountSessionPaymentAccount copy$default(LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount, String str, Boolean bool, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool2, FinancialConnectionsSessionManifest.Pane pane, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkAccountSessionPaymentAccount.f75312id;
        }
        if ((i & 2) != 0) {
            bool = linkAccountSessionPaymentAccount.eligibleForNetworking;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            microdepositVerificationMethod = linkAccountSessionPaymentAccount.microdepositVerificationMethod;
        }
        MicrodepositVerificationMethod microdepositVerificationMethod2 = microdepositVerificationMethod;
        if ((i & 8) != 0) {
            bool2 = linkAccountSessionPaymentAccount.networkingSuccessful;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            pane = linkAccountSessionPaymentAccount.nextPane;
        }
        return linkAccountSessionPaymentAccount.copy(str, bool3, microdepositVerificationMethod2, bool4, pane);
    }

    @InterfaceC36694Vs5("eligible_for_networking")
    public static /* synthetic */ void getEligibleForNetworking$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("microdeposit_verification_method")
    public static /* synthetic */ void getMicrodepositVerificationMethod$annotations() {
    }

    @InterfaceC36694Vs5("networking_successful")
    public static /* synthetic */ void getNetworkingSuccessful$annotations() {
    }

    @InterfaceC36694Vs5("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    @JvmStatic
    public static final void write$Self(LinkAccountSessionPaymentAccount self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z4 = false;
        output.mo1128w(serialDesc, 0, self.f75312id);
        if (output.mo1132s(serialDesc, 1) || self.eligibleForNetworking != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 1, C9804YY.f45990a, self.eligibleForNetworking);
        }
        if (output.mo1132s(serialDesc, 2) || self.microdepositVerificationMethod != MicrodepositVerificationMethod.UNKNOWN) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1126y(serialDesc, 2, MicrodepositVerificationMethod.Companion.serializer(), self.microdepositVerificationMethod);
        }
        if (output.mo1132s(serialDesc, 3) || self.networkingSuccessful != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo1173E(serialDesc, 3, C9804YY.f45990a, self.networkingSuccessful);
        }
        if (output.mo1132s(serialDesc, 4) || self.nextPane != null) {
            z4 = true;
        }
        if (z4) {
            output.mo1173E(serialDesc, 4, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPane);
        }
    }

    public final String component1() {
        return this.f75312id;
    }

    public final Boolean component2() {
        return this.eligibleForNetworking;
    }

    public final MicrodepositVerificationMethod component3() {
        return this.microdepositVerificationMethod;
    }

    public final Boolean component4() {
        return this.networkingSuccessful;
    }

    public final FinancialConnectionsSessionManifest.Pane component5() {
        return this.nextPane;
    }

    public final LinkAccountSessionPaymentAccount copy(String id, Boolean bool, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool2, FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
        return new LinkAccountSessionPaymentAccount(id, bool, microdepositVerificationMethod, bool2, pane);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkAccountSessionPaymentAccount) {
            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) obj;
            return Intrinsics.areEqual(this.f75312id, linkAccountSessionPaymentAccount.f75312id) && Intrinsics.areEqual(this.eligibleForNetworking, linkAccountSessionPaymentAccount.eligibleForNetworking) && this.microdepositVerificationMethod == linkAccountSessionPaymentAccount.microdepositVerificationMethod && Intrinsics.areEqual(this.networkingSuccessful, linkAccountSessionPaymentAccount.networkingSuccessful) && this.nextPane == linkAccountSessionPaymentAccount.nextPane;
        }
        return false;
    }

    public final Boolean getEligibleForNetworking() {
        return this.eligibleForNetworking;
    }

    public final String getId() {
        return this.f75312id;
    }

    public final MicrodepositVerificationMethod getMicrodepositVerificationMethod() {
        return this.microdepositVerificationMethod;
    }

    public final Boolean getNetworkingSuccessful() {
        return this.networkingSuccessful;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public int hashCode() {
        int hashCode = this.f75312id.hashCode() * 31;
        Boolean bool = this.eligibleForNetworking;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.microdepositVerificationMethod.hashCode()) * 31;
        Boolean bool2 = this.networkingSuccessful;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        return hashCode3 + (pane != null ? pane.hashCode() : 0);
    }

    public String toString() {
        String str = this.f75312id;
        Boolean bool = this.eligibleForNetworking;
        MicrodepositVerificationMethod microdepositVerificationMethod = this.microdepositVerificationMethod;
        Boolean bool2 = this.networkingSuccessful;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        return "LinkAccountSessionPaymentAccount(id=" + str + ", eligibleForNetworking=" + bool + ", microdepositVerificationMethod=" + microdepositVerificationMethod + ", networkingSuccessful=" + bool2 + ", nextPane=" + pane + ")";
    }

    public LinkAccountSessionPaymentAccount(String id, Boolean bool, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool2, FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
        this.f75312id = id;
        this.eligibleForNetworking = bool;
        this.microdepositVerificationMethod = microdepositVerificationMethod;
        this.networkingSuccessful = bool2;
        this.nextPane = pane;
    }

    public /* synthetic */ LinkAccountSessionPaymentAccount(String str, Boolean bool, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool2, FinancialConnectionsSessionManifest.Pane pane, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? MicrodepositVerificationMethod.UNKNOWN : microdepositVerificationMethod, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : pane);
    }
}
