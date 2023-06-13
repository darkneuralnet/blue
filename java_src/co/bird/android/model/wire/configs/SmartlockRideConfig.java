package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJz\u0010\u001d\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/wire/configs/SmartlockRideConfig;", "Landroid/os/Parcelable;", "unlockAvailablePostRideByPurposeSeconds", "", "", "", "zendeskArticleIdByPurpose", "", "enableMechanicalCableLock", "", "openAttemptCount", "enableV2", "enableSolebeLocks", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnableMechanicalCableLock", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableSolebeLocks", "getEnableV2", "getOpenAttemptCount", "()Ljava/util/Map;", "getUnlockAvailablePostRideByPurposeSeconds", "getZendeskArticleIdByPurpose", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lco/bird/android/model/wire/configs/SmartlockRideConfig;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SmartlockRideConfig implements Parcelable {
    public static final Parcelable.Creator<SmartlockRideConfig> CREATOR = new Creator();
    @JsonProperty("enable_mechanical_cable_lock")
    @InterfaceC41208ft5("enable_mechanical_cable_lock")
    private final Boolean enableMechanicalCableLock;
    @JsonProperty("enable_solebe_locks")
    @JsonAlias({"enable_solebe_lock"})
    @InterfaceC41208ft5(alternate = {"enable_solebe_lock"}, value = "enable_solebe_locks")
    private final Boolean enableSolebeLocks;
    @JsonProperty("enable_v2")
    @InterfaceC41208ft5("enable_v2")
    private final Boolean enableV2;
    @JsonProperty("open_attempt_count")
    @InterfaceC41208ft5("open_attempt_count")
    private final Map<String, Integer> openAttemptCount;
    @JsonProperty("unlock_available_post_ride_by_purpose_seconds")
    @InterfaceC41208ft5("unlock_available_post_ride_by_purpose_seconds")
    private final Map<String, Integer> unlockAvailablePostRideByPurposeSeconds;
    @JsonProperty("zendesk_article_id_by_purpose")
    @InterfaceC41208ft5("zendesk_article_id_by_purpose")
    private final Map<String, Long> zendeskArticleIdByPurpose;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<SmartlockRideConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartlockRideConfig createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap4.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap = linkedHashMap4;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap5.put(parcel.readString(), Long.valueOf(parcel.readLong()));
                }
                linkedHashMap2 = linkedHashMap5;
            }
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    linkedHashMap6.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap3 = linkedHashMap6;
            }
            return new SmartlockRideConfig(linkedHashMap, linkedHashMap2, valueOf, linkedHashMap3, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartlockRideConfig[] newArray(int i) {
            return new SmartlockRideConfig[i];
        }
    }

    public SmartlockRideConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SmartlockRideConfig copy$default(SmartlockRideConfig smartlockRideConfig, Map map, Map map2, Boolean bool, Map map3, Boolean bool2, Boolean bool3, int i, Object obj) {
        Map<String, Integer> map4 = map;
        if ((i & 1) != 0) {
            map4 = smartlockRideConfig.unlockAvailablePostRideByPurposeSeconds;
        }
        Map<String, Long> map5 = map2;
        if ((i & 2) != 0) {
            map5 = smartlockRideConfig.zendeskArticleIdByPurpose;
        }
        Map map6 = map5;
        if ((i & 4) != 0) {
            bool = smartlockRideConfig.enableMechanicalCableLock;
        }
        Boolean bool4 = bool;
        Map<String, Integer> map7 = map3;
        if ((i & 8) != 0) {
            map7 = smartlockRideConfig.openAttemptCount;
        }
        Map map8 = map7;
        if ((i & 16) != 0) {
            bool2 = smartlockRideConfig.enableV2;
        }
        Boolean bool5 = bool2;
        if ((i & 32) != 0) {
            bool3 = smartlockRideConfig.enableSolebeLocks;
        }
        return smartlockRideConfig.copy(map4, map6, bool4, map8, bool5, bool3);
    }

    public final Map<String, Integer> component1() {
        return this.unlockAvailablePostRideByPurposeSeconds;
    }

    public final Map<String, Long> component2() {
        return this.zendeskArticleIdByPurpose;
    }

    public final Boolean component3() {
        return this.enableMechanicalCableLock;
    }

    public final Map<String, Integer> component4() {
        return this.openAttemptCount;
    }

    public final Boolean component5() {
        return this.enableV2;
    }

    public final Boolean component6() {
        return this.enableSolebeLocks;
    }

    public final SmartlockRideConfig copy(Map<String, Integer> map, Map<String, Long> map2, Boolean bool, Map<String, Integer> map3, Boolean bool2, Boolean bool3) {
        return new SmartlockRideConfig(map, map2, bool, map3, bool2, bool3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartlockRideConfig) {
            SmartlockRideConfig smartlockRideConfig = (SmartlockRideConfig) obj;
            return Intrinsics.areEqual(this.unlockAvailablePostRideByPurposeSeconds, smartlockRideConfig.unlockAvailablePostRideByPurposeSeconds) && Intrinsics.areEqual(this.zendeskArticleIdByPurpose, smartlockRideConfig.zendeskArticleIdByPurpose) && Intrinsics.areEqual(this.enableMechanicalCableLock, smartlockRideConfig.enableMechanicalCableLock) && Intrinsics.areEqual(this.openAttemptCount, smartlockRideConfig.openAttemptCount) && Intrinsics.areEqual(this.enableV2, smartlockRideConfig.enableV2) && Intrinsics.areEqual(this.enableSolebeLocks, smartlockRideConfig.enableSolebeLocks);
        }
        return false;
    }

    public final Boolean getEnableMechanicalCableLock() {
        return this.enableMechanicalCableLock;
    }

    public final Boolean getEnableSolebeLocks() {
        return this.enableSolebeLocks;
    }

    public final Boolean getEnableV2() {
        return this.enableV2;
    }

    public final Map<String, Integer> getOpenAttemptCount() {
        return this.openAttemptCount;
    }

    public final Map<String, Integer> getUnlockAvailablePostRideByPurposeSeconds() {
        return this.unlockAvailablePostRideByPurposeSeconds;
    }

    public final Map<String, Long> getZendeskArticleIdByPurpose() {
        return this.zendeskArticleIdByPurpose;
    }

    public int hashCode() {
        Map<String, Integer> map = this.unlockAvailablePostRideByPurposeSeconds;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Long> map2 = this.zendeskArticleIdByPurpose;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.enableMechanicalCableLock;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Integer> map3 = this.openAttemptCount;
        int hashCode4 = (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Boolean bool2 = this.enableV2;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableSolebeLocks;
        return hashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        Map<String, Integer> map = this.unlockAvailablePostRideByPurposeSeconds;
        Map<String, Long> map2 = this.zendeskArticleIdByPurpose;
        Boolean bool = this.enableMechanicalCableLock;
        Map<String, Integer> map3 = this.openAttemptCount;
        Boolean bool2 = this.enableV2;
        Boolean bool3 = this.enableSolebeLocks;
        return "SmartlockRideConfig(unlockAvailablePostRideByPurposeSeconds=" + map + ", zendeskArticleIdByPurpose=" + map2 + ", enableMechanicalCableLock=" + bool + ", openAttemptCount=" + map3 + ", enableV2=" + bool2 + ", enableSolebeLocks=" + bool3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Map<String, Integer> map = this.unlockAvailablePostRideByPurposeSeconds;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeInt(entry.getValue().intValue());
            }
        }
        Map<String, Long> map2 = this.zendeskArticleIdByPurpose;
        if (map2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map2.size());
            for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
                out.writeString(entry2.getKey());
                out.writeLong(entry2.getValue().longValue());
            }
        }
        Boolean bool = this.enableMechanicalCableLock;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Map<String, Integer> map3 = this.openAttemptCount;
        if (map3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map3.size());
            for (Map.Entry<String, Integer> entry3 : map3.entrySet()) {
                out.writeString(entry3.getKey());
                out.writeInt(entry3.getValue().intValue());
            }
        }
        Boolean bool2 = this.enableV2;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.enableSolebeLocks;
        if (bool3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool3.booleanValue() ? 1 : 0);
    }

    public SmartlockRideConfig(Map<String, Integer> map, Map<String, Long> map2, Boolean bool, Map<String, Integer> map3, Boolean bool2, Boolean bool3) {
        this.unlockAvailablePostRideByPurposeSeconds = map;
        this.zendeskArticleIdByPurpose = map2;
        this.enableMechanicalCableLock = bool;
        this.openAttemptCount = map3;
        this.enableV2 = bool2;
        this.enableSolebeLocks = bool3;
    }

    public /* synthetic */ SmartlockRideConfig(Map map, Map map2, Boolean bool, Map map3, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : map3, (i & 16) != 0 ? null : bool2, (i & 32) == 0 ? bool3 : null);
    }
}
