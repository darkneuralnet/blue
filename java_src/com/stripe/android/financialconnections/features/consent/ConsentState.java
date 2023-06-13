package com.stripe.android.financialconnections.features.consent;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.ConsentPane;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001:\u0003*+,BM\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "LAN2;", "Ldp;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;", "component1", "", "", "component2", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;", "component3", "", "component4", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "component5", "consent", "merchantLogos", "currentBottomSheet", "acceptConsent", "viewEffect", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ldp;", "getConsent", "()Ldp;", "Ljava/util/List;", "getMerchantLogos", "()Ljava/util/List;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;", "getCurrentBottomSheet", "()Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;", "getAcceptConsent", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "<init>", "(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)V", "BottomSheetContent", "Payload", "ViewEffect", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ConsentState implements AN2 {
    private final AbstractC19862dp<Unit> acceptConsent;
    private final AbstractC19862dp<Payload> consent;
    private final BottomSheetContent currentBottomSheet;
    private final List<String> merchantLogos;
    private final ViewEffect viewEffect;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;", "", "(Ljava/lang/String;I)V", "LEGAL", "DATA", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum BottomSheetContent {
        LEGAL,
        DATA
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;", "", "consent", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "merchantLogos", "", "", "shouldShowMerchantLogos", "", "(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;Z)V", "getConsent", "()Lcom/stripe/android/financialconnections/model/ConsentPane;", "getMerchantLogos", "()Ljava/util/List;", "getShouldShowMerchantLogos", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Payload {
        public static final int $stable = 8;
        private final ConsentPane consent;
        private final List<String> merchantLogos;
        private final boolean shouldShowMerchantLogos;

        public Payload(ConsentPane consent, List<String> merchantLogos, boolean z) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
            this.consent = consent;
            this.merchantLogos = merchantLogos;
            this.shouldShowMerchantLogos = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, ConsentPane consentPane, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                consentPane = payload.consent;
            }
            if ((i & 2) != 0) {
                list = payload.merchantLogos;
            }
            if ((i & 4) != 0) {
                z = payload.shouldShowMerchantLogos;
            }
            return payload.copy(consentPane, list, z);
        }

        public final ConsentPane component1() {
            return this.consent;
        }

        public final List<String> component2() {
            return this.merchantLogos;
        }

        public final boolean component3() {
            return this.shouldShowMerchantLogos;
        }

        public final Payload copy(ConsentPane consent, List<String> merchantLogos, boolean z) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
            return new Payload(consent, merchantLogos, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                return Intrinsics.areEqual(this.consent, payload.consent) && Intrinsics.areEqual(this.merchantLogos, payload.merchantLogos) && this.shouldShowMerchantLogos == payload.shouldShowMerchantLogos;
            }
            return false;
        }

        public final ConsentPane getConsent() {
            return this.consent;
        }

        public final List<String> getMerchantLogos() {
            return this.merchantLogos;
        }

        public final boolean getShouldShowMerchantLogos() {
            return this.shouldShowMerchantLogos;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.consent.hashCode() * 31) + this.merchantLogos.hashCode()) * 31;
            boolean z = this.shouldShowMerchantLogos;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            ConsentPane consentPane = this.consent;
            List<String> list = this.merchantLogos;
            boolean z = this.shouldShowMerchantLogos;
            return "Payload(consent=" + consentPane + ", merchantLogos=" + list + ", shouldShowMerchantLogos=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "", "()V", "OpenBottomSheet", "OpenUrl", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenBottomSheet;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenUrl;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class ViewEffect {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenBottomSheet;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class OpenBottomSheet extends ViewEffect {
            public static final int $stable = 0;

            /* renamed from: id */
            private final long f75302id;

            public OpenBottomSheet(long j) {
                super(null);
                this.f75302id = j;
            }

            public static /* synthetic */ OpenBottomSheet copy$default(OpenBottomSheet openBottomSheet, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = openBottomSheet.f75302id;
                }
                return openBottomSheet.copy(j);
            }

            public final long component1() {
                return this.f75302id;
            }

            public final OpenBottomSheet copy(long j) {
                return new OpenBottomSheet(j);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenBottomSheet) && this.f75302id == ((OpenBottomSheet) obj).f75302id;
            }

            public final long getId() {
                return this.f75302id;
            }

            public int hashCode() {
                return Long.hashCode(this.f75302id);
            }

            public String toString() {
                long j = this.f75302id;
                return "OpenBottomSheet(id=" + j + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "url", "", "id", "", "(Ljava/lang/String;J)V", "getId", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class OpenUrl extends ViewEffect {
            public static final int $stable = 0;

            /* renamed from: id */
            private final long f75303id;
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrl(String url, long j) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.f75303id = j;
            }

            public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openUrl.url;
                }
                if ((i & 2) != 0) {
                    j = openUrl.f75303id;
                }
                return openUrl.copy(str, j);
            }

            public final String component1() {
                return this.url;
            }

            public final long component2() {
                return this.f75303id;
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
                    return Intrinsics.areEqual(this.url, openUrl.url) && this.f75303id == openUrl.f75303id;
                }
                return false;
            }

            public final long getId() {
                return this.f75303id;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Long.hashCode(this.f75303id);
            }

            public String toString() {
                String str = this.url;
                long j = this.f75303id;
                return "OpenUrl(url=" + str + ", id=" + j + ")";
            }
        }

        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ViewEffect() {
        }
    }

    public ConsentState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ConsentState copy$default(ConsentState consentState, AbstractC19862dp abstractC19862dp, List list, BottomSheetContent bottomSheetContent, AbstractC19862dp abstractC19862dp2, ViewEffect viewEffect, int i, Object obj) {
        AbstractC19862dp<Payload> abstractC19862dp3 = abstractC19862dp;
        if ((i & 1) != 0) {
            abstractC19862dp3 = consentState.consent;
        }
        List<String> list2 = list;
        if ((i & 2) != 0) {
            list2 = consentState.merchantLogos;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            bottomSheetContent = consentState.currentBottomSheet;
        }
        BottomSheetContent bottomSheetContent2 = bottomSheetContent;
        AbstractC19862dp<Unit> abstractC19862dp4 = abstractC19862dp2;
        if ((i & 8) != 0) {
            abstractC19862dp4 = consentState.acceptConsent;
        }
        AbstractC19862dp abstractC19862dp5 = abstractC19862dp4;
        if ((i & 16) != 0) {
            viewEffect = consentState.viewEffect;
        }
        return consentState.copy(abstractC19862dp3, list3, bottomSheetContent2, abstractC19862dp5, viewEffect);
    }

    public final AbstractC19862dp<Payload> component1() {
        return this.consent;
    }

    public final List<String> component2() {
        return this.merchantLogos;
    }

    public final BottomSheetContent component3() {
        return this.currentBottomSheet;
    }

    public final AbstractC19862dp<Unit> component4() {
        return this.acceptConsent;
    }

    public final ViewEffect component5() {
        return this.viewEffect;
    }

    public final ConsentState copy(AbstractC19862dp<Payload> consent, List<String> merchantLogos, BottomSheetContent currentBottomSheet, AbstractC19862dp<Unit> acceptConsent, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        Intrinsics.checkNotNullParameter(currentBottomSheet, "currentBottomSheet");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        return new ConsentState(consent, merchantLogos, currentBottomSheet, acceptConsent, viewEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentState) {
            ConsentState consentState = (ConsentState) obj;
            return Intrinsics.areEqual(this.consent, consentState.consent) && Intrinsics.areEqual(this.merchantLogos, consentState.merchantLogos) && this.currentBottomSheet == consentState.currentBottomSheet && Intrinsics.areEqual(this.acceptConsent, consentState.acceptConsent) && Intrinsics.areEqual(this.viewEffect, consentState.viewEffect);
        }
        return false;
    }

    public final AbstractC19862dp<Unit> getAcceptConsent() {
        return this.acceptConsent;
    }

    public final AbstractC19862dp<Payload> getConsent() {
        return this.consent;
    }

    public final BottomSheetContent getCurrentBottomSheet() {
        return this.currentBottomSheet;
    }

    public final List<String> getMerchantLogos() {
        return this.merchantLogos;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public int hashCode() {
        int hashCode = ((((((this.consent.hashCode() * 31) + this.merchantLogos.hashCode()) * 31) + this.currentBottomSheet.hashCode()) * 31) + this.acceptConsent.hashCode()) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return hashCode + (viewEffect == null ? 0 : viewEffect.hashCode());
    }

    public String toString() {
        AbstractC19862dp<Payload> abstractC19862dp = this.consent;
        List<String> list = this.merchantLogos;
        BottomSheetContent bottomSheetContent = this.currentBottomSheet;
        AbstractC19862dp<Unit> abstractC19862dp2 = this.acceptConsent;
        ViewEffect viewEffect = this.viewEffect;
        return "ConsentState(consent=" + abstractC19862dp + ", merchantLogos=" + list + ", currentBottomSheet=" + bottomSheetContent + ", acceptConsent=" + abstractC19862dp2 + ", viewEffect=" + viewEffect + ")";
    }

    public ConsentState(AbstractC19862dp<Payload> consent, List<String> merchantLogos, BottomSheetContent currentBottomSheet, AbstractC19862dp<Unit> acceptConsent, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        Intrinsics.checkNotNullParameter(currentBottomSheet, "currentBottomSheet");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        this.consent = consent;
        this.merchantLogos = merchantLogos;
        this.currentBottomSheet = currentBottomSheet;
        this.acceptConsent = acceptConsent;
        this.viewEffect = viewEffect;
    }

    public /* synthetic */ ConsentState(AbstractC19862dp abstractC19862dp, List list, BottomSheetContent bottomSheetContent, AbstractC19862dp abstractC19862dp2, ViewEffect viewEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C34454Md6.f23316e : abstractC19862dp, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? BottomSheetContent.DATA : bottomSheetContent, (i & 8) != 0 ? C34454Md6.f23316e : abstractC19862dp2, (i & 16) != 0 ? null : viewEffect);
    }
}
