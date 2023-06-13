package com.stripe.android.financialconnections.features.partnerauth;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.domain.Display;
import com.stripe.android.financialconnections.domain.OauthPrepane;
import com.stripe.android.financialconnections.domain.Text;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001:\u0003$%&B3\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J5\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "LAN2;", "Ldp;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;", "component1", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;", "component2", "", "component3", "payload", "viewEffect", "authenticationStatus", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ldp;", "getPayload", "()Ldp;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;", "getAuthenticationStatus", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getDataAccess", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "dataAccess", "getCanNavigateBack", "()Z", "canNavigateBack", "<init>", "(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)V", "ClickableText", "Payload", "ViewEffect", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PartnerAuthState implements AN2 {
    private final AbstractC19862dp<String> authenticationStatus;
    private final AbstractC19862dp<Payload> payload;
    private final ViewEffect viewEffect;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ClickableText;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum ClickableText {
        DATA("stripe://data-access-notice");
        
        private final String value;

        ClickableText(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;", "", "isStripeDirect", "", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "authSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "getAuthSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Payload {
        public static final int $stable = 8;
        private final FinancialConnectionsAuthorizationSession authSession;
        private final FinancialConnectionsInstitution institution;
        private final boolean isStripeDirect;

        public Payload(boolean z, FinancialConnectionsInstitution institution, FinancialConnectionsAuthorizationSession authSession) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            Intrinsics.checkNotNullParameter(authSession, "authSession");
            this.isStripeDirect = z;
            this.institution = institution;
            this.authSession = authSession;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payload.isStripeDirect;
            }
            if ((i & 2) != 0) {
                financialConnectionsInstitution = payload.institution;
            }
            if ((i & 4) != 0) {
                financialConnectionsAuthorizationSession = payload.authSession;
            }
            return payload.copy(z, financialConnectionsInstitution, financialConnectionsAuthorizationSession);
        }

        public final boolean component1() {
            return this.isStripeDirect;
        }

        public final FinancialConnectionsInstitution component2() {
            return this.institution;
        }

        public final FinancialConnectionsAuthorizationSession component3() {
            return this.authSession;
        }

        public final Payload copy(boolean z, FinancialConnectionsInstitution institution, FinancialConnectionsAuthorizationSession authSession) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            Intrinsics.checkNotNullParameter(authSession, "authSession");
            return new Payload(z, institution, authSession);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                return this.isStripeDirect == payload.isStripeDirect && Intrinsics.areEqual(this.institution, payload.institution) && Intrinsics.areEqual(this.authSession, payload.authSession);
            }
            return false;
        }

        public final FinancialConnectionsAuthorizationSession getAuthSession() {
            return this.authSession;
        }

        public final FinancialConnectionsInstitution getInstitution() {
            return this.institution;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.isStripeDirect;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.institution.hashCode()) * 31) + this.authSession.hashCode();
        }

        public final boolean isStripeDirect() {
            return this.isStripeDirect;
        }

        public String toString() {
            boolean z = this.isStripeDirect;
            FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.authSession;
            return "Payload(isStripeDirect=" + z + ", institution=" + financialConnectionsInstitution + ", authSession=" + financialConnectionsAuthorizationSession + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;", "", "OpenBottomSheet", "OpenPartnerAuth", "OpenUrl", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenBottomSheet;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenPartnerAuth;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenUrl;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface ViewEffect {

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenBottomSheet;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class OpenBottomSheet implements ViewEffect {
            public static final int $stable = 0;

            /* renamed from: id */
            private final long f75304id;

            public OpenBottomSheet(long j) {
                this.f75304id = j;
            }

            public static /* synthetic */ OpenBottomSheet copy$default(OpenBottomSheet openBottomSheet, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = openBottomSheet.f75304id;
                }
                return openBottomSheet.copy(j);
            }

            public final long component1() {
                return this.f75304id;
            }

            public final OpenBottomSheet copy(long j) {
                return new OpenBottomSheet(j);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenBottomSheet) && this.f75304id == ((OpenBottomSheet) obj).f75304id;
            }

            public final long getId() {
                return this.f75304id;
            }

            public int hashCode() {
                return Long.hashCode(this.f75304id);
            }

            public String toString() {
                long j = this.f75304id;
                return "OpenBottomSheet(id=" + j + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenPartnerAuth;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class OpenPartnerAuth implements ViewEffect {
            public static final int $stable = 0;
            private final String url;

            public OpenPartnerAuth(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public static /* synthetic */ OpenPartnerAuth copy$default(OpenPartnerAuth openPartnerAuth, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openPartnerAuth.url;
                }
                return openPartnerAuth.copy(str);
            }

            public final String component1() {
                return this.url;
            }

            public final OpenPartnerAuth copy(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenPartnerAuth(url);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenPartnerAuth) && Intrinsics.areEqual(this.url, ((OpenPartnerAuth) obj).url);
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                String str = this.url;
                return "OpenPartnerAuth(url=" + str + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;", "url", "", "id", "", "(Ljava/lang/String;J)V", "getId", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class OpenUrl implements ViewEffect {
            public static final int $stable = 0;

            /* renamed from: id */
            private final long f75305id;
            private final String url;

            public OpenUrl(String url, long j) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.f75305id = j;
            }

            public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openUrl.url;
                }
                if ((i & 2) != 0) {
                    j = openUrl.f75305id;
                }
                return openUrl.copy(str, j);
            }

            public final String component1() {
                return this.url;
            }

            public final long component2() {
                return this.f75305id;
            }

            public final OpenUrl copy(String url, long j) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenUrl(url, j);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenUrl) {
                    OpenUrl openUrl = (OpenUrl) obj;
                    return Intrinsics.areEqual(this.url, openUrl.url) && this.f75305id == openUrl.f75305id;
                }
                return false;
            }

            public final long getId() {
                return this.f75305id;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Long.hashCode(this.f75305id);
            }

            public String toString() {
                String str = this.url;
                long j = this.f75305id;
                return "OpenUrl(url=" + str + ", id=" + j + ")";
            }
        }
    }

    public PartnerAuthState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerAuthState copy$default(PartnerAuthState partnerAuthState, AbstractC19862dp abstractC19862dp, ViewEffect viewEffect, AbstractC19862dp abstractC19862dp2, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC19862dp = partnerAuthState.payload;
        }
        if ((i & 2) != 0) {
            viewEffect = partnerAuthState.viewEffect;
        }
        if ((i & 4) != 0) {
            abstractC19862dp2 = partnerAuthState.authenticationStatus;
        }
        return partnerAuthState.copy(abstractC19862dp, viewEffect, abstractC19862dp2);
    }

    public final AbstractC19862dp<Payload> component1() {
        return this.payload;
    }

    public final ViewEffect component2() {
        return this.viewEffect;
    }

    public final AbstractC19862dp<String> component3() {
        return this.authenticationStatus;
    }

    public final PartnerAuthState copy(AbstractC19862dp<Payload> payload, ViewEffect viewEffect, AbstractC19862dp<String> authenticationStatus) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(authenticationStatus, "authenticationStatus");
        return new PartnerAuthState(payload, viewEffect, authenticationStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerAuthState) {
            PartnerAuthState partnerAuthState = (PartnerAuthState) obj;
            return Intrinsics.areEqual(this.payload, partnerAuthState.payload) && Intrinsics.areEqual(this.viewEffect, partnerAuthState.viewEffect) && Intrinsics.areEqual(this.authenticationStatus, partnerAuthState.authenticationStatus);
        }
        return false;
    }

    public final AbstractC19862dp<String> getAuthenticationStatus() {
        return this.authenticationStatus;
    }

    public final boolean getCanNavigateBack() {
        AbstractC19862dp<String> abstractC19862dp = this.authenticationStatus;
        if (!(abstractC19862dp instanceof C31786At2) && !(abstractC19862dp instanceof C51034wT5) && !(this.payload instanceof C32163Cj1)) {
            return true;
        }
        return false;
    }

    public final DataAccessNotice getDataAccess() {
        FinancialConnectionsAuthorizationSession authSession;
        Display display;
        Text text;
        OauthPrepane oauthPrepane;
        Payload mo6788a = this.payload.mo6788a();
        if (mo6788a == null || (authSession = mo6788a.getAuthSession()) == null || (display = authSession.getDisplay()) == null || (text = display.getText()) == null || (oauthPrepane = text.getOauthPrepane()) == null) {
            return null;
        }
        return oauthPrepane.getDataAccessNotice();
    }

    public final AbstractC19862dp<Payload> getPayload() {
        return this.payload;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public int hashCode() {
        int hashCode = this.payload.hashCode() * 31;
        ViewEffect viewEffect = this.viewEffect;
        return ((hashCode + (viewEffect == null ? 0 : viewEffect.hashCode())) * 31) + this.authenticationStatus.hashCode();
    }

    public String toString() {
        AbstractC19862dp<Payload> abstractC19862dp = this.payload;
        ViewEffect viewEffect = this.viewEffect;
        AbstractC19862dp<String> abstractC19862dp2 = this.authenticationStatus;
        return "PartnerAuthState(payload=" + abstractC19862dp + ", viewEffect=" + viewEffect + ", authenticationStatus=" + abstractC19862dp2 + ")";
    }

    public PartnerAuthState(AbstractC19862dp<Payload> payload, ViewEffect viewEffect, AbstractC19862dp<String> authenticationStatus) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(authenticationStatus, "authenticationStatus");
        this.payload = payload;
        this.viewEffect = viewEffect;
        this.authenticationStatus = authenticationStatus;
    }

    public /* synthetic */ PartnerAuthState(AbstractC19862dp abstractC19862dp, ViewEffect viewEffect, AbstractC19862dp abstractC19862dp2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C34454Md6.f23316e : abstractC19862dp, (i & 2) != 0 ? null : viewEffect, (i & 4) != 0 ? C34454Md6.f23316e : abstractC19862dp2);
    }
}
