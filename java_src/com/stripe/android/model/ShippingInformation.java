package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/model/ShippingInformation;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "address", "Lcom/stripe/android/model/Address;", "name", "", "phone", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getName", "()Ljava/lang/String;", "getPhone", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nShippingInformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShippingInformation.kt\ncom/stripe/android/model/ShippingInformation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1603#2,9:33\n1855#2:42\n1856#2:45\n1612#2:46\n1#3:43\n1#3:44\n*S KotlinDebug\n*F\n+ 1 ShippingInformation.kt\ncom/stripe/android/model/ShippingInformation\n*L\n22#1:33,9\n22#1:42\n22#1:45\n22#1:46\n22#1:44\n*E\n"})
/* loaded from: classes7.dex */
public final class ShippingInformation implements StripeModel, StripeParamsModel {
    public static final int $stable = 0;
    private static final String PARAM_ADDRESS = "address";
    private static final String PARAM_NAME = "name";
    private static final String PARAM_PHONE = "phone";
    private final Address address;
    private final String name;
    private final String phone;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShippingInformation> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/ShippingInformation$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_NAME", "PARAM_PHONE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ShippingInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShippingInformation(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingInformation[] newArray(int i) {
            return new ShippingInformation[i];
        }
    }

    public ShippingInformation() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ShippingInformation copy$default(ShippingInformation shippingInformation, Address address, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            address = shippingInformation.address;
        }
        if ((i & 2) != 0) {
            str = shippingInformation.name;
        }
        if ((i & 4) != 0) {
            str2 = shippingInformation.phone;
        }
        return shippingInformation.copy(address, str, str2);
    }

    public final Address component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.phone;
    }

    public final ShippingInformation copy(Address address, String str, String str2) {
        return new ShippingInformation(address, str, str2);
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
        if (obj instanceof ShippingInformation) {
            ShippingInformation shippingInformation = (ShippingInformation) obj;
            return Intrinsics.areEqual(this.address, shippingInformation.address) && Intrinsics.areEqual(this.name, shippingInformation.name) && Intrinsics.areEqual(this.phone, shippingInformation.phone);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Address address = this.address;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, Object> map;
        List<Pair> listOf;
        Map<String, Object> map2;
        Pair pair;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m28425to("name", this.name);
        pairArr[1] = TuplesKt.m28425to("phone", this.phone);
        Address address = this.address;
        if (address != null) {
            map = address.toParamMap();
        } else {
            map = null;
        }
        pairArr[2] = TuplesKt.m28425to("address", map);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
        ArrayList arrayList = new ArrayList();
        for (Pair pair2 : listOf) {
            String str = (String) pair2.component1();
            Object component2 = pair2.component2();
            if (component2 != null) {
                pair = new Pair(str, component2);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        map2 = MapsKt__MapsKt.toMap(arrayList);
        return map2;
    }

    public String toString() {
        Address address = this.address;
        String str = this.name;
        String str2 = this.phone;
        return "ShippingInformation(address=" + address + ", name=" + str + ", phone=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        out.writeString(this.name);
        out.writeString(this.phone);
    }

    public ShippingInformation(Address address, String str, String str2) {
        this.address = address;
        this.name = str;
        this.phone = str2;
    }

    public /* synthetic */ ShippingInformation(Address address, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
