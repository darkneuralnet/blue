package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u000e\u0010\u0019\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001aJ\u000e\u0010\u001b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b$J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000e\u0010&\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b'JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\f\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u00065"}, m28432d2 = {"Lcom/stripe/android/EphemeralKey;", "Lcom/stripe/android/core/model/StripeModel;", "objectId", "", AnalyticsRequestV2.PARAM_CREATED, "", "expires", "id", "isLiveMode", "", "objectType", "secret", "type", "(Ljava/lang/String;JJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreated$payments_core_release", "()J", "getExpires$payments_core_release", "getId$payments_core_release", "()Ljava/lang/String;", "isLiveMode$payments_core_release", "()Z", "getObjectId$payments_core_release", "getObjectType$payments_core_release", "getSecret", "getType$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "component8", "component8$payments_core_release", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class EphemeralKey implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EphemeralKey> CREATOR = new Creator();
    private final long created;
    private final long expires;

    /* renamed from: id */
    private final String f75248id;
    private final boolean isLiveMode;
    private final String objectId;
    private final String objectType;
    private final String secret;
    private final String type;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<EphemeralKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EphemeralKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EphemeralKey(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EphemeralKey[] newArray(int i) {
            return new EphemeralKey[i];
        }
    }

    public EphemeralKey(String objectId, long j, long j2, String id, boolean z, String objectType, String secret, String type) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(type, "type");
        this.objectId = objectId;
        this.created = j;
        this.expires = j2;
        this.f75248id = id;
        this.isLiveMode = z;
        this.objectType = objectType;
        this.secret = secret;
        this.type = type;
    }

    public final String component1$payments_core_release() {
        return this.objectId;
    }

    public final long component2$payments_core_release() {
        return this.created;
    }

    public final long component3$payments_core_release() {
        return this.expires;
    }

    public final String component4$payments_core_release() {
        return this.f75248id;
    }

    public final boolean component5$payments_core_release() {
        return this.isLiveMode;
    }

    public final String component6$payments_core_release() {
        return this.objectType;
    }

    public final String component7() {
        return this.secret;
    }

    public final String component8$payments_core_release() {
        return this.type;
    }

    public final EphemeralKey copy(String objectId, long j, long j2, String id, boolean z, String objectType, String secret, String type) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(type, "type");
        return new EphemeralKey(objectId, j, j2, id, z, objectType, secret, type);
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
        if (obj instanceof EphemeralKey) {
            EphemeralKey ephemeralKey = (EphemeralKey) obj;
            return Intrinsics.areEqual(this.objectId, ephemeralKey.objectId) && this.created == ephemeralKey.created && this.expires == ephemeralKey.expires && Intrinsics.areEqual(this.f75248id, ephemeralKey.f75248id) && this.isLiveMode == ephemeralKey.isLiveMode && Intrinsics.areEqual(this.objectType, ephemeralKey.objectType) && Intrinsics.areEqual(this.secret, ephemeralKey.secret) && Intrinsics.areEqual(this.type, ephemeralKey.type);
        }
        return false;
    }

    public final long getCreated$payments_core_release() {
        return this.created;
    }

    public final long getExpires$payments_core_release() {
        return this.expires;
    }

    public final String getId$payments_core_release() {
        return this.f75248id;
    }

    public final String getObjectId$payments_core_release() {
        return this.objectId;
    }

    public final String getObjectType$payments_core_release() {
        return this.objectType;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final String getType$payments_core_release() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.objectId.hashCode() * 31) + Long.hashCode(this.created)) * 31) + Long.hashCode(this.expires)) * 31) + this.f75248id.hashCode()) * 31;
        boolean z = this.isLiveMode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode + i) * 31) + this.objectType.hashCode()) * 31) + this.secret.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean isLiveMode$payments_core_release() {
        return this.isLiveMode;
    }

    public String toString() {
        String str = this.objectId;
        long j = this.created;
        long j2 = this.expires;
        String str2 = this.f75248id;
        boolean z = this.isLiveMode;
        String str3 = this.objectType;
        String str4 = this.secret;
        String str5 = this.type;
        return "EphemeralKey(objectId=" + str + ", created=" + j + ", expires=" + j2 + ", id=" + str2 + ", isLiveMode=" + z + ", objectType=" + str3 + ", secret=" + str4 + ", type=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.objectId);
        out.writeLong(this.created);
        out.writeLong(this.expires);
        out.writeString(this.f75248id);
        out.writeInt(this.isLiveMode ? 1 : 0);
        out.writeString(this.objectType);
        out.writeString(this.secret);
        out.writeString(this.type);
    }
}
