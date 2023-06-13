package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.ObjectBuilder;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002+,BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0$H\u0016J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/model/AddressJapanParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", AddressJapanParams.PARAM_CITY, "", "country", AddressJapanParams.PARAM_LINE_1, AddressJapanParams.PARAM_LINE_2, "postalCode", "state", AddressJapanParams.PARAM_TOWN, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getLine1", "getLine2", "getPostalCode", "getState", "getTown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddressJapanParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressJapanParams.kt\ncom/stripe/android/model/AddressJapanParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1789#2,2:142\n1791#2:145\n1#3:144\n*S KotlinDebug\n*F\n+ 1 AddressJapanParams.kt\ncom/stripe/android/model/AddressJapanParams\n*L\n53#1:142,2\n53#1:145\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressJapanParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    @Deprecated
    private static final String PARAM_CITY = "city";
    @Deprecated
    private static final String PARAM_COUNTRY = "country";
    @Deprecated
    private static final String PARAM_LINE_1 = "line1";
    @Deprecated
    private static final String PARAM_LINE_2 = "line2";
    @Deprecated
    private static final String PARAM_POSTAL_CODE = "postal_code";
    @Deprecated
    private static final String PARAM_STATE = "state";
    @Deprecated
    private static final String PARAM_TOWN = "town";
    private final String city;
    private final String country;
    private final String line1;
    private final String line2;
    private final String postalCode;
    private final String state;
    private final String town;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddressJapanParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/model/AddressJapanParams$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AddressJapanParams;", "()V", AddressJapanParams.PARAM_CITY, "", "country", AddressJapanParams.PARAM_LINE_1, AddressJapanParams.PARAM_LINE_2, "postalCode", "state", AddressJapanParams.PARAM_TOWN, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setCity", "setCountry", "setLine1", "setLine2", "setPostalCode", "setState", "setTown", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder implements ObjectBuilder<AddressJapanParams> {
        public static final int $stable = 8;
        private String city;
        private String country;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;
        private String town;

        public final Builder setCity(String str) {
            this.city = str;
            return this;
        }

        public final Builder setCountry(String str) {
            String str2;
            if (str != null) {
                str2 = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str2 = null;
            }
            this.country = str2;
            return this;
        }

        public final Builder setLine1(String str) {
            this.line1 = str;
            return this;
        }

        public final Builder setLine2(String str) {
            this.line2 = str;
            return this;
        }

        public final Builder setPostalCode(String str) {
            this.postalCode = str;
            return this;
        }

        public final Builder setState(String str) {
            this.state = str;
            return this;
        }

        public final Builder setTown(String str) {
            this.town = str;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public AddressJapanParams build() {
            return new AddressJapanParams(this.city, this.country, this.line1, this.line2, this.postalCode, this.state, this.town);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/AddressJapanParams$Companion;", "", "()V", "PARAM_CITY", "", "PARAM_COUNTRY", "PARAM_LINE_1", "PARAM_LINE_2", "PARAM_POSTAL_CODE", "PARAM_STATE", "PARAM_TOWN", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public static final class Creator implements Parcelable.Creator<AddressJapanParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressJapanParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddressJapanParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressJapanParams[] newArray(int i) {
            return new AddressJapanParams[i];
        }
    }

    public AddressJapanParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AddressJapanParams copy$default(AddressJapanParams addressJapanParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressJapanParams.city;
        }
        if ((i & 2) != 0) {
            str2 = addressJapanParams.country;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = addressJapanParams.line1;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = addressJapanParams.line2;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = addressJapanParams.postalCode;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = addressJapanParams.state;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = addressJapanParams.town;
        }
        return addressJapanParams.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.city;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.line1;
    }

    public final String component4() {
        return this.line2;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.state;
    }

    public final String component7() {
        return this.town;
    }

    public final AddressJapanParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new AddressJapanParams(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressJapanParams) {
            AddressJapanParams addressJapanParams = (AddressJapanParams) obj;
            return Intrinsics.areEqual(this.city, addressJapanParams.city) && Intrinsics.areEqual(this.country, addressJapanParams.country) && Intrinsics.areEqual(this.line1, addressJapanParams.line1) && Intrinsics.areEqual(this.line2, addressJapanParams.line2) && Intrinsics.areEqual(this.postalCode, addressJapanParams.postalCode) && Intrinsics.areEqual(this.state, addressJapanParams.state) && Intrinsics.areEqual(this.town, addressJapanParams.town);
        }
        return false;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTown() {
        return this.town;
    }

    public int hashCode() {
        String str = this.city;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.town;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        List<Pair> listOf;
        Map<String, Object> emptyMap;
        Map map;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_CITY, this.city), TuplesKt.m28425to("country", this.country), TuplesKt.m28425to(PARAM_LINE_1, this.line1), TuplesKt.m28425to(PARAM_LINE_2, this.line2), TuplesKt.m28425to(PARAM_POSTAL_CODE, this.postalCode), TuplesKt.m28425to("state", this.state), TuplesKt.m28425to(PARAM_TOWN, this.town)});
        emptyMap = MapsKt__MapsKt.emptyMap();
        for (Pair pair : listOf) {
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            if (str2 != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, str2));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
        }
        return emptyMap;
    }

    public String toString() {
        String str = this.city;
        String str2 = this.country;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.postalCode;
        String str6 = this.state;
        String str7 = this.town;
        return "AddressJapanParams(city=" + str + ", country=" + str2 + ", line1=" + str3 + ", line2=" + str4 + ", postalCode=" + str5 + ", state=" + str6 + ", town=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.city);
        out.writeString(this.country);
        out.writeString(this.line1);
        out.writeString(this.line2);
        out.writeString(this.postalCode);
        out.writeString(this.state);
        out.writeString(this.town);
    }

    public AddressJapanParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
        this.town = str7;
    }

    public /* synthetic */ AddressJapanParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
