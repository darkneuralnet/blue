package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.TokenJsonParser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BO\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/model/GooglePayResult;", "Landroid/os/Parcelable;", "token", "Lcom/stripe/android/model/Token;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/model/Address;", "name", "", "email", "phoneNumber", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "(Lcom/stripe/android/model/Token;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getToken", "()Lcom/stripe/android/model/Token;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class GooglePayResult implements Parcelable {
    private final Address address;
    private final String email;
    private final String name;
    private final String phoneNumber;
    private final ShippingInformation shippingInformation;
    private final Token token;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GooglePayResult> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/GooglePayResult$Companion;", "", "()V", "createShippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "paymentDataJson", "Lorg/json/JSONObject;", "fromJson", "Lcom/stripe/android/model/GooglePayResult;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ShippingInformation createShippingInformation(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject != null) {
                String optString = StripeJsonUtils.optString(optJSONObject, "address1");
                String optString2 = StripeJsonUtils.optString(optJSONObject, "address2");
                String optString3 = StripeJsonUtils.optString(optJSONObject, "postalCode");
                return new ShippingInformation(new Address(StripeJsonUtils.optString(optJSONObject, "locality"), StripeJsonUtils.optString(optJSONObject, "countryCode"), optString, optString2, optString3, StripeJsonUtils.optString(optJSONObject, "administrativeArea")), StripeJsonUtils.optString(optJSONObject, "name"), StripeJsonUtils.optString(optJSONObject, "phoneNumber"));
            }
            return null;
        }

        @JvmStatic
        public final GooglePayResult fromJson(JSONObject paymentDataJson) throws JSONException {
            Address address;
            Intrinsics.checkNotNullParameter(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            Token parse = new TokenJsonParser().parse(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject optJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (optJSONObject != null) {
                address = new Address(StripeJsonUtils.optString(optJSONObject, "locality"), StripeJsonUtils.optString(optJSONObject, "countryCode"), StripeJsonUtils.optString(optJSONObject, "address1"), StripeJsonUtils.optString(optJSONObject, "address2"), StripeJsonUtils.optString(optJSONObject, "postalCode"), StripeJsonUtils.optString(optJSONObject, "administrativeArea"));
            } else {
                address = null;
            }
            return new GooglePayResult(parse, address, StripeJsonUtils.optString(optJSONObject, "name"), StripeJsonUtils.optString(paymentDataJson, "email"), StripeJsonUtils.optString(optJSONObject, "phoneNumber"), createShippingInformation(paymentDataJson));
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<GooglePayResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayResult((Token) parcel.readParcelable(GooglePayResult.class.getClassLoader()), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult[] newArray(int i) {
            return new GooglePayResult[i];
        }
    }

    public GooglePayResult() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GooglePayResult copy$default(GooglePayResult googlePayResult, Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i, Object obj) {
        if ((i & 1) != 0) {
            token = googlePayResult.token;
        }
        if ((i & 2) != 0) {
            address = googlePayResult.address;
        }
        Address address2 = address;
        if ((i & 4) != 0) {
            str = googlePayResult.name;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = googlePayResult.email;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = googlePayResult.phoneNumber;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            shippingInformation = googlePayResult.shippingInformation;
        }
        return googlePayResult.copy(token, address2, str4, str5, str6, shippingInformation);
    }

    @JvmStatic
    public static final GooglePayResult fromJson(JSONObject jSONObject) throws JSONException {
        return Companion.fromJson(jSONObject);
    }

    public final Token component1() {
        return this.token;
    }

    public final Address component2() {
        return this.address;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.phoneNumber;
    }

    public final ShippingInformation component6() {
        return this.shippingInformation;
    }

    public final GooglePayResult copy(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation) {
        return new GooglePayResult(token, address, str, str2, str3, shippingInformation);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GooglePayResult) {
            GooglePayResult googlePayResult = (GooglePayResult) obj;
            return Intrinsics.areEqual(this.token, googlePayResult.token) && Intrinsics.areEqual(this.address, googlePayResult.address) && Intrinsics.areEqual(this.name, googlePayResult.name) && Intrinsics.areEqual(this.email, googlePayResult.email) && Intrinsics.areEqual(this.phoneNumber, googlePayResult.phoneNumber) && Intrinsics.areEqual(this.shippingInformation, googlePayResult.shippingInformation);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final Token getToken() {
        return this.token;
    }

    public int hashCode() {
        Token token = this.token;
        int hashCode = (token == null ? 0 : token.hashCode()) * 31;
        Address address = this.address;
        int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        return hashCode5 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
    }

    public String toString() {
        Token token = this.token;
        Address address = this.address;
        String str = this.name;
        String str2 = this.email;
        String str3 = this.phoneNumber;
        ShippingInformation shippingInformation = this.shippingInformation;
        return "GooglePayResult(token=" + token + ", address=" + address + ", name=" + str + ", email=" + str2 + ", phoneNumber=" + str3 + ", shippingInformation=" + shippingInformation + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.token, i);
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        out.writeString(this.name);
        out.writeString(this.email);
        out.writeString(this.phoneNumber);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        shippingInformation.writeToParcel(out, i);
    }

    public GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation) {
        this.token = token;
        this.address = address;
        this.name = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.shippingInformation = shippingInformation;
    }

    public /* synthetic */ GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : token, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : shippingInformation);
    }
}
