package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010.J\t\u0010/\u001a\u00020\rHÖ\u0001J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\t2\u0006\u00104\u001a\u00020\u0003J\t\u00105\u001a\u00020\rHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006<"}, m28432d2 = {"Lcom/stripe/android/model/Customer;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "defaultSource", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "sources", "", "Lcom/stripe/android/model/CustomerPaymentSource;", "hasMore", "", "totalCount", "", "url", "description", "email", "liveMode", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDefaultSource", "()Ljava/lang/String;", "getDescription", "getEmail", "getHasMore", "()Z", "getId", "getLiveMode", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getSources", "()Ljava/util/List;", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/model/Customer;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "getSourceById", "sourceId", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCustomer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Customer.kt\ncom/stripe/android/model/Customer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n288#2,2:27\n*S KotlinDebug\n*F\n+ 1 Customer.kt\ncom/stripe/android/model/Customer\n*L\n23#1:27,2\n*E\n"})
/* loaded from: classes7.dex */
public final class Customer implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Customer> CREATOR = new Creator();
    private final String defaultSource;
    private final String description;
    private final String email;
    private final boolean hasMore;

    /* renamed from: id */
    private final String f75355id;
    private final boolean liveMode;
    private final ShippingInformation shippingInformation;
    private final List<CustomerPaymentSource> sources;
    private final Integer totalCount;
    private final String url;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Customer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ShippingInformation createFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(Customer.class.getClassLoader()));
            }
            return new Customer(readString, readString2, createFromParcel, arrayList, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer[] newArray(int i) {
            return new Customer[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Customer(String str, String str2, ShippingInformation shippingInformation, List<? extends CustomerPaymentSource> sources, boolean z, Integer num, String str3, String str4, String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.f75355id = str;
        this.defaultSource = str2;
        this.shippingInformation = shippingInformation;
        this.sources = sources;
        this.hasMore = z;
        this.totalCount = num;
        this.url = str3;
        this.description = str4;
        this.email = str5;
        this.liveMode = z2;
    }

    public final String component1() {
        return this.f75355id;
    }

    public final boolean component10() {
        return this.liveMode;
    }

    public final String component2() {
        return this.defaultSource;
    }

    public final ShippingInformation component3() {
        return this.shippingInformation;
    }

    public final List<CustomerPaymentSource> component4() {
        return this.sources;
    }

    public final boolean component5() {
        return this.hasMore;
    }

    public final Integer component6() {
        return this.totalCount;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.email;
    }

    public final Customer copy(String str, String str2, ShippingInformation shippingInformation, List<? extends CustomerPaymentSource> sources, boolean z, Integer num, String str3, String str4, String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        return new Customer(str, str2, shippingInformation, sources, z, num, str3, str4, str5, z2);
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
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return Intrinsics.areEqual(this.f75355id, customer.f75355id) && Intrinsics.areEqual(this.defaultSource, customer.defaultSource) && Intrinsics.areEqual(this.shippingInformation, customer.shippingInformation) && Intrinsics.areEqual(this.sources, customer.sources) && this.hasMore == customer.hasMore && Intrinsics.areEqual(this.totalCount, customer.totalCount) && Intrinsics.areEqual(this.url, customer.url) && Intrinsics.areEqual(this.description, customer.description) && Intrinsics.areEqual(this.email, customer.email) && this.liveMode == customer.liveMode;
        }
        return false;
    }

    public final String getDefaultSource() {
        return this.defaultSource;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getId() {
        return this.f75355id;
    }

    public final boolean getLiveMode() {
        return this.liveMode;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final CustomerPaymentSource getSourceById(String sourceId) {
        Object obj;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Iterator<T> it = this.sources.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((CustomerPaymentSource) obj).getId(), sourceId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (CustomerPaymentSource) obj;
    }

    public final List<CustomerPaymentSource> getSources() {
        return this.sources;
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
        String str = this.f75355id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultSource;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int hashCode3 = (((hashCode2 + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31) + this.sources.hashCode()) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Integer num = this.totalCount;
        int hashCode4 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.url;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z2 = this.liveMode;
        return hashCode7 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f75355id;
        String str2 = this.defaultSource;
        ShippingInformation shippingInformation = this.shippingInformation;
        List<CustomerPaymentSource> list = this.sources;
        boolean z = this.hasMore;
        Integer num = this.totalCount;
        String str3 = this.url;
        String str4 = this.description;
        String str5 = this.email;
        boolean z2 = this.liveMode;
        return "Customer(id=" + str + ", defaultSource=" + str2 + ", shippingInformation=" + shippingInformation + ", sources=" + list + ", hasMore=" + z + ", totalCount=" + num + ", url=" + str3 + ", description=" + str4 + ", email=" + str5 + ", liveMode=" + z2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75355id);
        out.writeString(this.defaultSource);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i);
        }
        List<CustomerPaymentSource> list = this.sources;
        out.writeInt(list.size());
        for (CustomerPaymentSource customerPaymentSource : list) {
            out.writeParcelable(customerPaymentSource, i);
        }
        out.writeInt(this.hasMore ? 1 : 0);
        Integer num = this.totalCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.url);
        out.writeString(this.description);
        out.writeString(this.email);
        out.writeInt(this.liveMode ? 1 : 0);
    }
}
