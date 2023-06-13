package com.stripe.android.financialconnections.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 H2\u00020\u0001:\u0002IHB]\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bB\u0010CB\u007f\b\u0017\u0012\u0006\u0010D\u001a\u00020\u0012\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0001\u0010\u001a\u001a\u00020\f\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bB\u0010GJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014Jn\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0010HÖ\u0001J\t\u0010$\u001a\u00020\u0012HÖ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010\u001a\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R \u0010\u001c\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00108\u0012\u0004\b:\u0010+\u001a\u0004\b9\u0010\u0014R\"\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010;\u0012\u0004\b=\u0010+\u001a\u0004\b<\u0010\u0016R\"\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010;\u0012\u0004\b?\u0010+\u001a\u0004\b>\u0010\u0016R\"\u0010 \u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00108\u0012\u0004\bA\u0010+\u001a\u0004\b@\u0010\u0014¨\u0006J"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "component1", "", "component2", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component3", "", "component4", "", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", MessageExtension.FIELD_DATA, "hasMore", "nextPane", "url", "count", "repairAuthorizationEnabled", "skipAccountSelection", "totalCount", "copy", "(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getData$annotations", "()V", "Z", "getHasMore", "()Z", "getHasMore$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getUrl$annotations", "Ljava/lang/Integer;", "getCount", "getCount$annotations", "Ljava/lang/Boolean;", "getRepairAuthorizationEnabled", "getRepairAuthorizationEnabled$annotations", "getSkipAccountSelection", "getSkipAccountSelection$annotations", "getTotalCount", "getTotalCount$annotations", "<init>", "(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PartnerAccountsList {
    public static final Companion Companion = new Companion(null);
    private final Integer count;
    private final List<PartnerAccount> data;
    private final boolean hasMore;
    private final FinancialConnectionsSessionManifest.Pane nextPane;
    private final Boolean repairAuthorizationEnabled;
    private final Boolean skipAccountSelection;
    private final Integer totalCount;
    private final String url;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<PartnerAccountsList> serializer() {
            return PartnerAccountsList$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PartnerAccountsList(int i, @InterfaceC36694Vs5("data") List list, @InterfaceC36694Vs5("has_more") boolean z, @InterfaceC36694Vs5("next_pane") FinancialConnectionsSessionManifest.Pane pane, @InterfaceC36694Vs5("url") String str, @InterfaceC36694Vs5("count") Integer num, @InterfaceC36694Vs5("repair_authorization_enabled") Boolean bool, @InterfaceC36694Vs5("skip_account_selection") Boolean bool2, @InterfaceC36694Vs5("total_count") Integer num2, C38819bt5 c38819bt5) {
        if (15 != (i & 15)) {
            C52838zW3.m1275b(i, 15, PartnerAccountsList$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
        this.hasMore = z;
        this.nextPane = pane;
        this.url = str;
        if ((i & 16) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i & 32) == 0) {
            this.repairAuthorizationEnabled = null;
        } else {
            this.repairAuthorizationEnabled = bool;
        }
        if ((i & 64) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool2;
        }
        if ((i & 128) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = num2;
        }
    }

    @InterfaceC36694Vs5("count")
    public static /* synthetic */ void getCount$annotations() {
    }

    @InterfaceC36694Vs5(MessageExtension.FIELD_DATA)
    public static /* synthetic */ void getData$annotations() {
    }

    @InterfaceC36694Vs5("has_more")
    public static /* synthetic */ void getHasMore$annotations() {
    }

    @InterfaceC36694Vs5("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    @InterfaceC36694Vs5("repair_authorization_enabled")
    public static /* synthetic */ void getRepairAuthorizationEnabled$annotations() {
    }

    @InterfaceC36694Vs5("skip_account_selection")
    public static /* synthetic */ void getSkipAccountSelection$annotations() {
    }

    @InterfaceC36694Vs5("total_count")
    public static /* synthetic */ void getTotalCount$annotations() {
    }

    @InterfaceC36694Vs5("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @JvmStatic
    public static final void write$Self(PartnerAccountsList self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z4 = false;
        output.mo1126y(serialDesc, 0, new C27999ro(PartnerAccount$$serializer.INSTANCE), self.data);
        output.mo1129v(serialDesc, 1, self.hasMore);
        output.mo1126y(serialDesc, 2, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPane);
        output.mo1128w(serialDesc, 3, self.url);
        if (output.mo1132s(serialDesc, 4) || self.count != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 4, F52.f8705a, self.count);
        }
        if (output.mo1132s(serialDesc, 5) || self.repairAuthorizationEnabled != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 5, C9804YY.f45990a, self.repairAuthorizationEnabled);
        }
        if (output.mo1132s(serialDesc, 6) || self.skipAccountSelection != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo1173E(serialDesc, 6, C9804YY.f45990a, self.skipAccountSelection);
        }
        if (output.mo1132s(serialDesc, 7) || self.totalCount != null) {
            z4 = true;
        }
        if (z4) {
            output.mo1173E(serialDesc, 7, F52.f8705a, self.totalCount);
        }
    }

    public final List<PartnerAccount> component1() {
        return this.data;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final FinancialConnectionsSessionManifest.Pane component3() {
        return this.nextPane;
    }

    public final String component4() {
        return this.url;
    }

    public final Integer component5() {
        return this.count;
    }

    public final Boolean component6() {
        return this.repairAuthorizationEnabled;
    }

    public final Boolean component7() {
        return this.skipAccountSelection;
    }

    public final Integer component8() {
        return this.totalCount;
    }

    public final PartnerAccountsList copy(List<PartnerAccount> data, boolean z, FinancialConnectionsSessionManifest.Pane nextPane, String url, Integer num, Boolean bool, Boolean bool2, Integer num2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        Intrinsics.checkNotNullParameter(url, "url");
        return new PartnerAccountsList(data, z, nextPane, url, num, bool, bool2, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerAccountsList) {
            PartnerAccountsList partnerAccountsList = (PartnerAccountsList) obj;
            return Intrinsics.areEqual(this.data, partnerAccountsList.data) && this.hasMore == partnerAccountsList.hasMore && this.nextPane == partnerAccountsList.nextPane && Intrinsics.areEqual(this.url, partnerAccountsList.url) && Intrinsics.areEqual(this.count, partnerAccountsList.count) && Intrinsics.areEqual(this.repairAuthorizationEnabled, partnerAccountsList.repairAuthorizationEnabled) && Intrinsics.areEqual(this.skipAccountSelection, partnerAccountsList.skipAccountSelection) && Intrinsics.areEqual(this.totalCount, partnerAccountsList.totalCount);
        }
        return false;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final List<PartnerAccount> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public final Boolean getRepairAuthorizationEnabled() {
        return this.repairAuthorizationEnabled;
    }

    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.nextPane.hashCode()) * 31) + this.url.hashCode()) * 31;
        Integer num = this.count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.repairAuthorizationEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipAccountSelection;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        List<PartnerAccount> list = this.data;
        boolean z = this.hasMore;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        String str = this.url;
        Integer num = this.count;
        Boolean bool = this.repairAuthorizationEnabled;
        Boolean bool2 = this.skipAccountSelection;
        Integer num2 = this.totalCount;
        return "PartnerAccountsList(data=" + list + ", hasMore=" + z + ", nextPane=" + pane + ", url=" + str + ", count=" + num + ", repairAuthorizationEnabled=" + bool + ", skipAccountSelection=" + bool2 + ", totalCount=" + num2 + ")";
    }

    public PartnerAccountsList(List<PartnerAccount> data, boolean z, FinancialConnectionsSessionManifest.Pane nextPane, String url, Integer num, Boolean bool, Boolean bool2, Integer num2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        Intrinsics.checkNotNullParameter(url, "url");
        this.data = data;
        this.hasMore = z;
        this.nextPane = nextPane;
        this.url = url;
        this.count = num;
        this.repairAuthorizationEnabled = bool;
        this.skipAccountSelection = bool2;
        this.totalCount = num2;
    }

    public /* synthetic */ PartnerAccountsList(List list, boolean z, FinancialConnectionsSessionManifest.Pane pane, String str, Integer num, Boolean bool, Boolean bool2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, pane, str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : num2);
    }
}
