package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "Landroid/os/Parcelable;", "acsUrl", "", DefaultAcsDataParser.FIELD_ACS_EPHEM_PUB_KEY, "Ljava/security/interfaces/ECPublicKey;", DefaultAcsDataParser.FIELD_SDK_EPHEM_PUB_KEY, "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)V", "getAcsEphemPubKey", "()Ljava/security/interfaces/ECPublicKey;", "getAcsUrl", "()Ljava/lang/String;", "getSdkEphemPubKey", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AcsData implements Parcelable {
    public static final Parcelable.Creator<AcsData> CREATOR = new Creator();
    private final ECPublicKey acsEphemPubKey;
    private final String acsUrl;
    private final ECPublicKey sdkEphemPubKey;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AcsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcsData(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcsData[] newArray(int i) {
            return new AcsData[i];
        }
    }

    public AcsData(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
        Intrinsics.checkNotNullParameter(acsEphemPubKey, "acsEphemPubKey");
        Intrinsics.checkNotNullParameter(sdkEphemPubKey, "sdkEphemPubKey");
        this.acsUrl = acsUrl;
        this.acsEphemPubKey = acsEphemPubKey;
        this.sdkEphemPubKey = sdkEphemPubKey;
    }

    public static /* synthetic */ AcsData copy$default(AcsData acsData, String str, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acsData.acsUrl;
        }
        if ((i & 2) != 0) {
            eCPublicKey = acsData.acsEphemPubKey;
        }
        if ((i & 4) != 0) {
            eCPublicKey2 = acsData.sdkEphemPubKey;
        }
        return acsData.copy(str, eCPublicKey, eCPublicKey2);
    }

    public final String component1() {
        return this.acsUrl;
    }

    public final ECPublicKey component2() {
        return this.acsEphemPubKey;
    }

    public final ECPublicKey component3() {
        return this.sdkEphemPubKey;
    }

    public final AcsData copy(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
        Intrinsics.checkNotNullParameter(acsEphemPubKey, "acsEphemPubKey");
        Intrinsics.checkNotNullParameter(sdkEphemPubKey, "sdkEphemPubKey");
        return new AcsData(acsUrl, acsEphemPubKey, sdkEphemPubKey);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcsData) {
            AcsData acsData = (AcsData) obj;
            return Intrinsics.areEqual(this.acsUrl, acsData.acsUrl) && Intrinsics.areEqual(this.acsEphemPubKey, acsData.acsEphemPubKey) && Intrinsics.areEqual(this.sdkEphemPubKey, acsData.sdkEphemPubKey);
        }
        return false;
    }

    public final ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final ECPublicKey getSdkEphemPubKey() {
        return this.sdkEphemPubKey;
    }

    public int hashCode() {
        return (((this.acsUrl.hashCode() * 31) + this.acsEphemPubKey.hashCode()) * 31) + this.sdkEphemPubKey.hashCode();
    }

    public String toString() {
        return "AcsData(acsUrl=" + this.acsUrl + ", acsEphemPubKey=" + this.acsEphemPubKey + ", sdkEphemPubKey=" + this.sdkEphemPubKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.acsUrl);
        out.writeSerializable(this.acsEphemPubKey);
        out.writeSerializable(this.sdkEphemPubKey);
    }
}
