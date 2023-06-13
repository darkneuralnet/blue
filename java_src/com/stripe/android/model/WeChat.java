package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006."}, m28432d2 = {"Lcom/stripe/android/model/WeChat;", "Lcom/stripe/android/core/model/StripeModel;", "statementDescriptor", "", "appId", "nonce", "packageValue", "partnerId", "prepayId", "sign", FraudDetectionData.KEY_TIMESTAMP, "qrCodeUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getNonce", "getPackageValue", "getPartnerId", "getPrepayId", "getQrCodeUrl", "getSign", "getStatementDescriptor", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class WeChat implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WeChat> CREATOR = new Creator();
    private final String appId;
    private final String nonce;
    private final String packageValue;
    private final String partnerId;
    private final String prepayId;
    private final String qrCodeUrl;
    private final String sign;
    private final String statementDescriptor;
    private final String timestamp;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<WeChat> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChat createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeChat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChat[] newArray(int i) {
            return new WeChat[i];
        }
    }

    public WeChat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.statementDescriptor = str;
        this.appId = str2;
        this.nonce = str3;
        this.packageValue = str4;
        this.partnerId = str5;
        this.prepayId = str6;
        this.sign = str7;
        this.timestamp = str8;
        this.qrCodeUrl = str9;
    }

    public final String component1() {
        return this.statementDescriptor;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.nonce;
    }

    public final String component4() {
        return this.packageValue;
    }

    public final String component5() {
        return this.partnerId;
    }

    public final String component6() {
        return this.prepayId;
    }

    public final String component7() {
        return this.sign;
    }

    public final String component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.qrCodeUrl;
    }

    public final WeChat copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new WeChat(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (obj instanceof WeChat) {
            WeChat weChat = (WeChat) obj;
            return Intrinsics.areEqual(this.statementDescriptor, weChat.statementDescriptor) && Intrinsics.areEqual(this.appId, weChat.appId) && Intrinsics.areEqual(this.nonce, weChat.nonce) && Intrinsics.areEqual(this.packageValue, weChat.packageValue) && Intrinsics.areEqual(this.partnerId, weChat.partnerId) && Intrinsics.areEqual(this.prepayId, weChat.prepayId) && Intrinsics.areEqual(this.sign, weChat.sign) && Intrinsics.areEqual(this.timestamp, weChat.timestamp) && Intrinsics.areEqual(this.qrCodeUrl, weChat.qrCodeUrl);
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPackageValue() {
        return this.packageValue;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPrepayId() {
        return this.prepayId;
    }

    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public final String getSign() {
        return this.sign;
    }

    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.statementDescriptor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonce;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.partnerId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.prepayId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sign;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.timestamp;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.qrCodeUrl;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.statementDescriptor;
        String str2 = this.appId;
        String str3 = this.nonce;
        String str4 = this.packageValue;
        String str5 = this.partnerId;
        String str6 = this.prepayId;
        String str7 = this.sign;
        String str8 = this.timestamp;
        String str9 = this.qrCodeUrl;
        return "WeChat(statementDescriptor=" + str + ", appId=" + str2 + ", nonce=" + str3 + ", packageValue=" + str4 + ", partnerId=" + str5 + ", prepayId=" + str6 + ", sign=" + str7 + ", timestamp=" + str8 + ", qrCodeUrl=" + str9 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.statementDescriptor);
        out.writeString(this.appId);
        out.writeString(this.nonce);
        out.writeString(this.packageValue);
        out.writeString(this.partnerId);
        out.writeString(this.prepayId);
        out.writeString(this.sign);
        out.writeString(this.timestamp);
        out.writeString(this.qrCodeUrl);
    }

    public /* synthetic */ WeChat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : str9);
    }
}
