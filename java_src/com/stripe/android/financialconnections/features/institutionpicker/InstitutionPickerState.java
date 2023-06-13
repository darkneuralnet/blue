package com.stripe.android.financialconnections.features.institutionpicker;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001:\u0001 B;\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "LAN2;", "", "component1", "component2", "Ldp;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "component3", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "component4", "searchMode", "allowManualEntry", "payload", "searchInstitutions", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "getSearchMode", "()Z", "getAllowManualEntry", "Ldp;", "getPayload", "()Ldp;", "getSearchInstitutions", "<init>", "(ZZLdp;Ldp;)V", "Payload", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class InstitutionPickerState implements AN2 {
    private final boolean allowManualEntry;
    private final AbstractC19862dp<Payload> payload;
    private final AbstractC19862dp<InstitutionResponse> searchInstitutions;
    private final boolean searchMode;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "", "featuredInstitutions", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "allowManualEntry", "", "searchDisabled", "(Ljava/util/List;ZZ)V", "getAllowManualEntry", "()Z", "getFeaturedInstitutions", "()Ljava/util/List;", "getSearchDisabled", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Payload {
        public static final int $stable = 8;
        private final boolean allowManualEntry;
        private final List<FinancialConnectionsInstitution> featuredInstitutions;
        private final boolean searchDisabled;

        public Payload(List<FinancialConnectionsInstitution> featuredInstitutions, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(featuredInstitutions, "featuredInstitutions");
            this.featuredInstitutions = featuredInstitutions;
            this.allowManualEntry = z;
            this.searchDisabled = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, List list, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = payload.featuredInstitutions;
            }
            if ((i & 2) != 0) {
                z = payload.allowManualEntry;
            }
            if ((i & 4) != 0) {
                z2 = payload.searchDisabled;
            }
            return payload.copy(list, z, z2);
        }

        public final List<FinancialConnectionsInstitution> component1() {
            return this.featuredInstitutions;
        }

        public final boolean component2() {
            return this.allowManualEntry;
        }

        public final boolean component3() {
            return this.searchDisabled;
        }

        public final Payload copy(List<FinancialConnectionsInstitution> featuredInstitutions, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(featuredInstitutions, "featuredInstitutions");
            return new Payload(featuredInstitutions, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                return Intrinsics.areEqual(this.featuredInstitutions, payload.featuredInstitutions) && this.allowManualEntry == payload.allowManualEntry && this.searchDisabled == payload.searchDisabled;
            }
            return false;
        }

        public final boolean getAllowManualEntry() {
            return this.allowManualEntry;
        }

        public final List<FinancialConnectionsInstitution> getFeaturedInstitutions() {
            return this.featuredInstitutions;
        }

        public final boolean getSearchDisabled() {
            return this.searchDisabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.featuredInstitutions.hashCode() * 31;
            boolean z = this.allowManualEntry;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.searchDisabled;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            List<FinancialConnectionsInstitution> list = this.featuredInstitutions;
            boolean z = this.allowManualEntry;
            boolean z2 = this.searchDisabled;
            return "Payload(featuredInstitutions=" + list + ", allowManualEntry=" + z + ", searchDisabled=" + z2 + ")";
        }
    }

    public InstitutionPickerState() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstitutionPickerState copy$default(InstitutionPickerState institutionPickerState, boolean z, boolean z2, AbstractC19862dp abstractC19862dp, AbstractC19862dp abstractC19862dp2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = institutionPickerState.searchMode;
        }
        if ((i & 2) != 0) {
            z2 = institutionPickerState.allowManualEntry;
        }
        if ((i & 4) != 0) {
            abstractC19862dp = institutionPickerState.payload;
        }
        if ((i & 8) != 0) {
            abstractC19862dp2 = institutionPickerState.searchInstitutions;
        }
        return institutionPickerState.copy(z, z2, abstractC19862dp, abstractC19862dp2);
    }

    public final boolean component1() {
        return this.searchMode;
    }

    public final boolean component2() {
        return this.allowManualEntry;
    }

    public final AbstractC19862dp<Payload> component3() {
        return this.payload;
    }

    public final AbstractC19862dp<InstitutionResponse> component4() {
        return this.searchInstitutions;
    }

    public final InstitutionPickerState copy(boolean z, boolean z2, AbstractC19862dp<Payload> payload, AbstractC19862dp<InstitutionResponse> searchInstitutions) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(searchInstitutions, "searchInstitutions");
        return new InstitutionPickerState(z, z2, payload, searchInstitutions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstitutionPickerState) {
            InstitutionPickerState institutionPickerState = (InstitutionPickerState) obj;
            return this.searchMode == institutionPickerState.searchMode && this.allowManualEntry == institutionPickerState.allowManualEntry && Intrinsics.areEqual(this.payload, institutionPickerState.payload) && Intrinsics.areEqual(this.searchInstitutions, institutionPickerState.searchInstitutions);
        }
        return false;
    }

    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    public final AbstractC19862dp<Payload> getPayload() {
        return this.payload;
    }

    public final AbstractC19862dp<InstitutionResponse> getSearchInstitutions() {
        return this.searchInstitutions;
    }

    public final boolean getSearchMode() {
        return this.searchMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.searchMode;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.allowManualEntry;
        return ((((i + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.payload.hashCode()) * 31) + this.searchInstitutions.hashCode();
    }

    public String toString() {
        boolean z = this.searchMode;
        boolean z2 = this.allowManualEntry;
        AbstractC19862dp<Payload> abstractC19862dp = this.payload;
        AbstractC19862dp<InstitutionResponse> abstractC19862dp2 = this.searchInstitutions;
        return "InstitutionPickerState(searchMode=" + z + ", allowManualEntry=" + z2 + ", payload=" + abstractC19862dp + ", searchInstitutions=" + abstractC19862dp2 + ")";
    }

    public InstitutionPickerState(boolean z, boolean z2, AbstractC19862dp<Payload> payload, AbstractC19862dp<InstitutionResponse> searchInstitutions) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(searchInstitutions, "searchInstitutions");
        this.searchMode = z;
        this.allowManualEntry = z2;
        this.payload = payload;
        this.searchInstitutions = searchInstitutions;
    }

    public /* synthetic */ InstitutionPickerState(boolean z, boolean z2, AbstractC19862dp abstractC19862dp, AbstractC19862dp abstractC19862dp2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C34454Md6.f23316e : abstractC19862dp, (i & 8) != 0 ? C34454Md6.f23316e : abstractC19862dp2);
    }
}
