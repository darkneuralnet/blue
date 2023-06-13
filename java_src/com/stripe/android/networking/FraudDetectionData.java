package com.stripe.android.networking;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0001-B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0014J\u000e\u0010\u0015\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001aJ1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020&J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006."}, m28432d2 = {"Lcom/stripe/android/networking/FraudDetectionData;", "Lcom/stripe/android/core/model/StripeModel;", FraudDetectionData.KEY_GUID, "", FraudDetectionData.KEY_MUID, FraudDetectionData.KEY_SID, FraudDetectionData.KEY_TIMESTAMP, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getGuid$payments_core_release", "()Ljava/lang/String;", "getMuid$payments_core_release", "params", "", "getParams", "()Ljava/util/Map;", "getSid$payments_core_release", "getTimestamp$payments_core_release", "()J", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "isExpired", "currentTime", "toJson", "Lorg/json/JSONObject;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FraudDetectionData implements StripeModel {
    private static final String KEY_GUID = "guid";
    private static final String KEY_MUID = "muid";
    private static final String KEY_SID = "sid";
    public static final String KEY_TIMESTAMP = "timestamp";
    private final String guid;
    private final String muid;
    private final String sid;
    private final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FraudDetectionData> CREATOR = new Creator();
    private static final long TTL = TimeUnit.MINUTES.toMillis(30);

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/networking/FraudDetectionData$Companion;", "", "()V", "KEY_GUID", "", "KEY_MUID", "KEY_SID", "KEY_TIMESTAMP", "TTL", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public static final class Creator implements Parcelable.Creator<FraudDetectionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FraudDetectionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData[] newArray(int i) {
            return new FraudDetectionData[i];
        }
    }

    public FraudDetectionData(String guid, String muid, String sid, long j) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(muid, "muid");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.guid = guid;
        this.muid = muid;
        this.sid = sid;
        this.timestamp = j;
    }

    public static /* synthetic */ FraudDetectionData copy$default(FraudDetectionData fraudDetectionData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fraudDetectionData.guid;
        }
        if ((i & 2) != 0) {
            str2 = fraudDetectionData.muid;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = fraudDetectionData.sid;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = fraudDetectionData.timestamp;
        }
        return fraudDetectionData.copy(str, str4, str5, j);
    }

    public final String component1$payments_core_release() {
        return this.guid;
    }

    public final String component2$payments_core_release() {
        return this.muid;
    }

    public final String component3$payments_core_release() {
        return this.sid;
    }

    public final long component4$payments_core_release() {
        return this.timestamp;
    }

    public final FraudDetectionData copy(String guid, String muid, String sid, long j) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(muid, "muid");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new FraudDetectionData(guid, muid, sid, j);
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
        if (obj instanceof FraudDetectionData) {
            FraudDetectionData fraudDetectionData = (FraudDetectionData) obj;
            return Intrinsics.areEqual(this.guid, fraudDetectionData.guid) && Intrinsics.areEqual(this.muid, fraudDetectionData.muid) && Intrinsics.areEqual(this.sid, fraudDetectionData.sid) && this.timestamp == fraudDetectionData.timestamp;
        }
        return false;
    }

    public final String getGuid$payments_core_release() {
        return this.guid;
    }

    public final String getMuid$payments_core_release() {
        return this.muid;
    }

    public final Map<String, String> getParams() {
        Map<String, String> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(KEY_GUID, this.guid), TuplesKt.m28425to(KEY_MUID, this.muid), TuplesKt.m28425to(KEY_SID, this.sid));
        return mapOf;
    }

    public final String getSid$payments_core_release() {
        return this.sid;
    }

    public final long getTimestamp$payments_core_release() {
        return this.timestamp;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (((((this.guid.hashCode() * 31) + this.muid.hashCode()) * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public final boolean isExpired(long j) {
        return j - this.timestamp > TTL;
    }

    public final JSONObject toJson() {
        JSONObject put = new JSONObject().put(KEY_GUID, this.guid).put(KEY_MUID, this.muid).put(KEY_SID, this.sid).put(KEY_TIMESTAMP, this.timestamp);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …KEY_TIMESTAMP, timestamp)");
        return put;
    }

    public String toString() {
        String str = this.guid;
        String str2 = this.muid;
        String str3 = this.sid;
        long j = this.timestamp;
        return "FraudDetectionData(guid=" + str + ", muid=" + str2 + ", sid=" + str3 + ", timestamp=" + j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.guid);
        out.writeString(this.muid);
        out.writeString(this.sid);
        out.writeLong(this.timestamp);
    }

    public /* synthetic */ FraudDetectionData(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0L : j);
    }
}
