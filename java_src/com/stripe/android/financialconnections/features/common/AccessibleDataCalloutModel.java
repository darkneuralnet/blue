package com.stripe.android.financialconnections.features.common;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.features.consent.ConsentTextBuilder;
import com.stripe.android.financialconnections.features.consent.FinancialConnectionsUrlResolver;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "", "businessName", "", "permissions", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "isStripeDirect", "", "isNetworking", "dataPolicyUrl", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;)V", "getBusinessName", "()Ljava/lang/String;", "getDataPolicyUrl", "()Z", "getPermissions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccessibleDataCalloutModel {
    public static final Companion Companion = new Companion(null);
    private final String businessName;
    private final String dataPolicyUrl;
    private final boolean isNetworking;
    private final boolean isStripeDirect;
    private final List<FinancialConnectionsAccount.Permissions> permissions;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;", "", "()V", "fromManifest", "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessibleDataCalloutModel fromManifest(FinancialConnectionsSessionManifest manifest) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            String businessName = ConsentTextBuilder.INSTANCE.getBusinessName(manifest);
            List<FinancialConnectionsAccount.Permissions> permissions = manifest.getPermissions();
            Boolean isNetworkingUserFlow = manifest.isNetworkingUserFlow();
            if (isNetworkingUserFlow != null) {
                z = isNetworkingUserFlow.booleanValue();
            } else {
                z = false;
            }
            Boolean isStripeDirect = manifest.isStripeDirect();
            if (isStripeDirect != null) {
                z2 = isStripeDirect.booleanValue();
            } else {
                z2 = false;
            }
            return new AccessibleDataCalloutModel(businessName, permissions, z2, z, FinancialConnectionsUrlResolver.INSTANCE.getDataPolicyUrl(manifest));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessibleDataCalloutModel(String str, List<? extends FinancialConnectionsAccount.Permissions> permissions, boolean z, boolean z2, String dataPolicyUrl) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(dataPolicyUrl, "dataPolicyUrl");
        this.businessName = str;
        this.permissions = permissions;
        this.isStripeDirect = z;
        this.isNetworking = z2;
        this.dataPolicyUrl = dataPolicyUrl;
    }

    public static /* synthetic */ AccessibleDataCalloutModel copy$default(AccessibleDataCalloutModel accessibleDataCalloutModel, String str, List list, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessibleDataCalloutModel.businessName;
        }
        List<FinancialConnectionsAccount.Permissions> list2 = list;
        if ((i & 2) != 0) {
            list2 = accessibleDataCalloutModel.permissions;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            z = accessibleDataCalloutModel.isStripeDirect;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = accessibleDataCalloutModel.isNetworking;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str2 = accessibleDataCalloutModel.dataPolicyUrl;
        }
        return accessibleDataCalloutModel.copy(str, list3, z3, z4, str2);
    }

    public final String component1() {
        return this.businessName;
    }

    public final List<FinancialConnectionsAccount.Permissions> component2() {
        return this.permissions;
    }

    public final boolean component3() {
        return this.isStripeDirect;
    }

    public final boolean component4() {
        return this.isNetworking;
    }

    public final String component5() {
        return this.dataPolicyUrl;
    }

    public final AccessibleDataCalloutModel copy(String str, List<? extends FinancialConnectionsAccount.Permissions> permissions, boolean z, boolean z2, String dataPolicyUrl) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(dataPolicyUrl, "dataPolicyUrl");
        return new AccessibleDataCalloutModel(str, permissions, z, z2, dataPolicyUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibleDataCalloutModel) {
            AccessibleDataCalloutModel accessibleDataCalloutModel = (AccessibleDataCalloutModel) obj;
            return Intrinsics.areEqual(this.businessName, accessibleDataCalloutModel.businessName) && Intrinsics.areEqual(this.permissions, accessibleDataCalloutModel.permissions) && this.isStripeDirect == accessibleDataCalloutModel.isStripeDirect && this.isNetworking == accessibleDataCalloutModel.isNetworking && Intrinsics.areEqual(this.dataPolicyUrl, accessibleDataCalloutModel.dataPolicyUrl);
        }
        return false;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final String getDataPolicyUrl() {
        return this.dataPolicyUrl;
    }

    public final List<FinancialConnectionsAccount.Permissions> getPermissions() {
        return this.permissions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.businessName;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.permissions.hashCode()) * 31;
        boolean z = this.isStripeDirect;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isNetworking;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.dataPolicyUrl.hashCode();
    }

    public final boolean isNetworking() {
        return this.isNetworking;
    }

    public final boolean isStripeDirect() {
        return this.isStripeDirect;
    }

    public String toString() {
        String str = this.businessName;
        List<FinancialConnectionsAccount.Permissions> list = this.permissions;
        boolean z = this.isStripeDirect;
        boolean z2 = this.isNetworking;
        String str2 = this.dataPolicyUrl;
        return "AccessibleDataCalloutModel(businessName=" + str + ", permissions=" + list + ", isStripeDirect=" + z + ", isNetworking=" + z2 + ", dataPolicyUrl=" + str2 + ")";
    }
}
