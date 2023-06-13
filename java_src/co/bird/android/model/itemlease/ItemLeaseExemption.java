package co.bird.android.model.itemlease;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.itemlease.p022enum.ItemLeaseExemptionType;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.Config;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u0010\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u0019J\t\u0010#\u001a\u00020$HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006+"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLeaseExemption;", "Landroid/os/Parcelable;", "bird", "Lco/bird/android/model/wire/WireBird;", "leaseType", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "exception", "Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;", "createdAt", "Lorg/joda/time/DateTime;", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getException", "()Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;", "getLeaseType", "()Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "isValid", "config", "Lco/bird/android/model/wire/configs/Config;", "ttlSeconds", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLeaseExemption implements Parcelable {
    private static final int DEFAULT_EXEMPTION_EXPIRY_SECONDS = 1800;
    private final WireBird bird;
    private final DateTime createdAt;
    private final ItemLeaseExemptionType exception;
    private final ItemLeaseType leaseType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ItemLeaseExemption> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLeaseExemption$Companion;", "", "()V", "DEFAULT_EXEMPTION_EXPIRY_SECONDS", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ItemLeaseExemption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseExemption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ItemLeaseExemption((WireBird) parcel.readParcelable(ItemLeaseExemption.class.getClassLoader()), ItemLeaseType.CREATOR.createFromParcel(parcel), ItemLeaseExemptionType.CREATOR.createFromParcel(parcel), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseExemption[] newArray(int i) {
            return new ItemLeaseExemption[i];
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemLeaseType.values().length];
            try {
                iArr[ItemLeaseType.HELMET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ItemLeaseExemption(WireBird bird, ItemLeaseType leaseType, ItemLeaseExemptionType exception, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.bird = bird;
        this.leaseType = leaseType;
        this.exception = exception;
        this.createdAt = createdAt;
    }

    public static /* synthetic */ ItemLeaseExemption copy$default(ItemLeaseExemption itemLeaseExemption, WireBird wireBird, ItemLeaseType itemLeaseType, ItemLeaseExemptionType itemLeaseExemptionType, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = itemLeaseExemption.bird;
        }
        if ((i & 2) != 0) {
            itemLeaseType = itemLeaseExemption.leaseType;
        }
        if ((i & 4) != 0) {
            itemLeaseExemptionType = itemLeaseExemption.exception;
        }
        if ((i & 8) != 0) {
            dateTime = itemLeaseExemption.createdAt;
        }
        return itemLeaseExemption.copy(wireBird, itemLeaseType, itemLeaseExemptionType, dateTime);
    }

    public static /* synthetic */ boolean isValid$default(ItemLeaseExemption itemLeaseExemption, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = DEFAULT_EXEMPTION_EXPIRY_SECONDS;
        }
        return itemLeaseExemption.isValid(i);
    }

    public final WireBird component1() {
        return this.bird;
    }

    public final ItemLeaseType component2() {
        return this.leaseType;
    }

    public final ItemLeaseExemptionType component3() {
        return this.exception;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final ItemLeaseExemption copy(WireBird bird, ItemLeaseType leaseType, ItemLeaseExemptionType exception, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new ItemLeaseExemption(bird, leaseType, exception, createdAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ItemLeaseExemption) {
            ItemLeaseExemption itemLeaseExemption = (ItemLeaseExemption) obj;
            return Intrinsics.areEqual(this.bird, itemLeaseExemption.bird) && this.leaseType == itemLeaseExemption.leaseType && this.exception == itemLeaseExemption.exception && Intrinsics.areEqual(this.createdAt, itemLeaseExemption.createdAt);
        }
        return false;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final ItemLeaseExemptionType getException() {
        return this.exception;
    }

    public final ItemLeaseType getLeaseType() {
        return this.leaseType;
    }

    public int hashCode() {
        return (((((this.bird.hashCode() * 31) + this.leaseType.hashCode()) * 31) + this.exception.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public final boolean isValid(int i) {
        return this.createdAt.plusSeconds(i).isAfterNow();
    }

    public String toString() {
        WireBird wireBird = this.bird;
        ItemLeaseType itemLeaseType = this.leaseType;
        ItemLeaseExemptionType itemLeaseExemptionType = this.exception;
        DateTime dateTime = this.createdAt;
        return "ItemLeaseExemption(bird=" + wireBird + ", leaseType=" + itemLeaseType + ", exception=" + itemLeaseExemptionType + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.bird, i);
        this.leaseType.writeToParcel(out, i);
        this.exception.writeToParcel(out, i);
        out.writeSerializable(this.createdAt);
    }

    public final boolean isValid(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return isValid(WhenMappings.$EnumSwitchMapping$0[this.leaseType.ordinal()] == 1 ? config.getLeaseConfig().getLeaseTypes().getHelmet().getLeaseExemptionDurationSeconds() : DEFAULT_EXEMPTION_EXPIRY_SECONDS);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ItemLeaseExemption(WireBird wireBird, ItemLeaseType itemLeaseType, ItemLeaseExemptionType itemLeaseExemptionType, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireBird, itemLeaseType, itemLeaseExemptionType, dateTime);
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
