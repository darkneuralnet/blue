package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002?>B=\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b8\u00109B[\b\u0017\u0012\u0006\u0010:\u001a\u00020\u0011\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0001\u0010\u0016\u001a\u00020\r\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b8\u0010=J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JL\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0011HÖ\u0001J\u0013\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010!\u001a\u00020\u0011HÖ\u0001J\u0019\u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0011HÖ\u0001R&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R \u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00103\u0012\u0004\b5\u0010*\u001a\u0004\b4\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00103\u0012\u0004\b7\u0010*\u001a\u0004\b6\u0010\u0013¨\u0006@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "component1", "", "component2", "", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", MessageExtension.FIELD_DATA, "hasMore", "url", "count", "totalCount", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getData$annotations", "()V", "Z", "getHasMore", "()Z", "getHasMore$annotations", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getUrl$annotations", "Ljava/lang/Integer;", "getCount", "getCount$annotations", "getTotalCount", "getTotalCount$annotations", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsAccountList implements StripeModel, Parcelable {
    private final Integer count;
    private final List<FinancialConnectionsAccount> data;
    private final boolean hasMore;
    private final Integer totalCount;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FinancialConnectionsAccountList> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FinancialConnectionsAccountList> serializer() {
            return FinancialConnectionsAccountList$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsAccountList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccountList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(FinancialConnectionsAccount.CREATOR.createFromParcel(parcel));
            }
            return new FinancialConnectionsAccountList(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccountList[] newArray(int i) {
            return new FinancialConnectionsAccountList[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FinancialConnectionsAccountList(int i, @InterfaceC36694Vs5("data") List list, @InterfaceC36694Vs5("has_more") boolean z, @InterfaceC36694Vs5("url") String str, @InterfaceC36694Vs5("count") Integer num, @InterfaceC36694Vs5("total_count") Integer num2, C38819bt5 c38819bt5) {
        if (7 != (i & 7)) {
            C52838zW3.m1275b(i, 7, FinancialConnectionsAccountList$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
        this.hasMore = z;
        this.url = str;
        if ((i & 8) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i & 16) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = num2;
        }
    }

    public static /* synthetic */ FinancialConnectionsAccountList copy$default(FinancialConnectionsAccountList financialConnectionsAccountList, List list, boolean z, String str, Integer num, Integer num2, int i, Object obj) {
        List<FinancialConnectionsAccount> list2 = list;
        if ((i & 1) != 0) {
            list2 = financialConnectionsAccountList.data;
        }
        if ((i & 2) != 0) {
            z = financialConnectionsAccountList.hasMore;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = financialConnectionsAccountList.url;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            num = financialConnectionsAccountList.count;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = financialConnectionsAccountList.totalCount;
        }
        return financialConnectionsAccountList.copy(list2, z2, str2, num3, num2);
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

    @InterfaceC36694Vs5("total_count")
    public static /* synthetic */ void getTotalCount$annotations() {
    }

    @InterfaceC36694Vs5("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FinancialConnectionsAccountList self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo1126y(serialDesc, 0, new C27999ro(FinancialConnectionsAccount$$serializer.INSTANCE), self.data);
        output.mo1129v(serialDesc, 1, self.hasMore);
        output.mo1128w(serialDesc, 2, self.url);
        if (output.mo1132s(serialDesc, 3) || self.count != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 3, F52.f8705a, self.count);
        }
        if (output.mo1132s(serialDesc, 4) || self.totalCount != null) {
            z2 = true;
        }
        if (z2) {
            output.mo1173E(serialDesc, 4, F52.f8705a, self.totalCount);
        }
    }

    public final List<FinancialConnectionsAccount> component1() {
        return this.data;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final String component3() {
        return this.url;
    }

    public final Integer component4() {
        return this.count;
    }

    public final Integer component5() {
        return this.totalCount;
    }

    public final FinancialConnectionsAccountList copy(List<FinancialConnectionsAccount> data, boolean z, String url, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(url, "url");
        return new FinancialConnectionsAccountList(data, z, url, num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsAccountList) {
            FinancialConnectionsAccountList financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
            return Intrinsics.areEqual(this.data, financialConnectionsAccountList.data) && this.hasMore == financialConnectionsAccountList.hasMore && Intrinsics.areEqual(this.url, financialConnectionsAccountList.url) && Intrinsics.areEqual(this.count, financialConnectionsAccountList.count) && Intrinsics.areEqual(this.totalCount, financialConnectionsAccountList.totalCount);
        }
        return false;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final List<FinancialConnectionsAccount> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.url.hashCode()) * 31;
        Integer num = this.count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        List<FinancialConnectionsAccount> list = this.data;
        boolean z = this.hasMore;
        String str = this.url;
        Integer num = this.count;
        Integer num2 = this.totalCount;
        return "FinancialConnectionsAccountList(data=" + list + ", hasMore=" + z + ", url=" + str + ", count=" + num + ", totalCount=" + num2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<FinancialConnectionsAccount> list = this.data;
        out.writeInt(list.size());
        for (FinancialConnectionsAccount financialConnectionsAccount : list) {
            financialConnectionsAccount.writeToParcel(out, i);
        }
        out.writeInt(this.hasMore ? 1 : 0);
        out.writeString(this.url);
        Integer num = this.count;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.totalCount;
        if (num2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num2.intValue());
    }

    public FinancialConnectionsAccountList(List<FinancialConnectionsAccount> data, boolean z, String url, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(url, "url");
        this.data = data;
        this.hasMore = z;
        this.url = url;
        this.count = num;
        this.totalCount = num2;
    }

    public /* synthetic */ FinancialConnectionsAccountList(List list, boolean z, String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
