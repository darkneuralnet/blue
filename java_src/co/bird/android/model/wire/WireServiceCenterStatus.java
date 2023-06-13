package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ServiceCenterStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jf\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\bHÖ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\bHÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010¨\u00063"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterStatus;", "Landroid/os/Parcelable;", "id", "", "status", "Lco/bird/android/model/constant/ServiceCenterStatus;", "title", "color", "", "requireNotes", "", "requireReview", "singularHintText", "bulkHintText", "(Ljava/lang/String;Lco/bird/android/model/constant/ServiceCenterStatus;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;)V", "getBulkHintText", "()Ljava/lang/String;", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "displayName", "getDisplayName", "getId", "getRequireNotes", "()Z", "getRequireReview", "getSingularHintText", "getStatus", "()Lco/bird/android/model/constant/ServiceCenterStatus;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/ServiceCenterStatus;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireServiceCenterStatus;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireServiceCenterStatus implements Parcelable {
    public static final Parcelable.Creator<WireServiceCenterStatus> CREATOR = new Creator();
    @JsonProperty("bulk_hint_text")
    @InterfaceC41208ft5("bulk_hint_text")
    private final String bulkHintText;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final Integer color;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66762id;
    @JsonProperty("require_notes")
    @InterfaceC41208ft5("require_notes")
    private final boolean requireNotes;
    @JsonProperty("require_review")
    @InterfaceC41208ft5("require_review")
    private final boolean requireReview;
    @JsonProperty("singular_hint_text")
    @InterfaceC41208ft5("singular_hint_text")
    private final String singularHintText;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final ServiceCenterStatus status;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireServiceCenterStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireServiceCenterStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireServiceCenterStatus(parcel.readString(), ServiceCenterStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireServiceCenterStatus[] newArray(int i) {
            return new WireServiceCenterStatus[i];
        }
    }

    public WireServiceCenterStatus() {
        this(null, null, null, null, false, false, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.f66762id;
    }

    public final ServiceCenterStatus component2() {
        return this.status;
    }

    public final String component3() {
        return this.title;
    }

    public final Integer component4() {
        return this.color;
    }

    public final boolean component5() {
        return this.requireNotes;
    }

    public final boolean component6() {
        return this.requireReview;
    }

    public final String component7() {
        return this.singularHintText;
    }

    public final String component8() {
        return this.bulkHintText;
    }

    public final WireServiceCenterStatus copy(String id, ServiceCenterStatus status, String str, Integer num, boolean z, boolean z2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        return new WireServiceCenterStatus(id, status, str, num, z, z2, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireServiceCenterStatus) {
            WireServiceCenterStatus wireServiceCenterStatus = (WireServiceCenterStatus) obj;
            return Intrinsics.areEqual(this.f66762id, wireServiceCenterStatus.f66762id) && this.status == wireServiceCenterStatus.status && Intrinsics.areEqual(this.title, wireServiceCenterStatus.title) && Intrinsics.areEqual(this.color, wireServiceCenterStatus.color) && this.requireNotes == wireServiceCenterStatus.requireNotes && this.requireReview == wireServiceCenterStatus.requireReview && Intrinsics.areEqual(this.singularHintText, wireServiceCenterStatus.singularHintText) && Intrinsics.areEqual(this.bulkHintText, wireServiceCenterStatus.bulkHintText);
        }
        return false;
    }

    public final String getBulkHintText() {
        return this.bulkHintText;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final String getDisplayName() {
        boolean z;
        List split$default;
        String joinToString$default;
        String str = this.title;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) this.status.name(), new String[]{"_"}, false, 0, 6, (Object) null);
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(split$default, " ", null, null, 0, null, WireServiceCenterStatus$displayName$1.INSTANCE, 30, null);
            return joinToString$default;
        }
        return this.title;
    }

    public final String getId() {
        return this.f66762id;
    }

    public final boolean getRequireNotes() {
        return this.requireNotes;
    }

    public final boolean getRequireReview() {
        return this.requireReview;
    }

    public final String getSingularHintText() {
        return this.singularHintText;
    }

    public final ServiceCenterStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66762id.hashCode() * 31) + this.status.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.color;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.requireNotes;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.requireReview;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str2 = this.singularHintText;
        int hashCode4 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bulkHintText;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66762id;
        ServiceCenterStatus serviceCenterStatus = this.status;
        String str2 = this.title;
        Integer num = this.color;
        boolean z = this.requireNotes;
        boolean z2 = this.requireReview;
        String str3 = this.singularHintText;
        String str4 = this.bulkHintText;
        return "WireServiceCenterStatus(id=" + str + ", status=" + serviceCenterStatus + ", title=" + str2 + ", color=" + num + ", requireNotes=" + z + ", requireReview=" + z2 + ", singularHintText=" + str3 + ", bulkHintText=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66762id);
        out.writeString(this.status.name());
        out.writeString(this.title);
        Integer num = this.color;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeInt(this.requireNotes ? 1 : 0);
        out.writeInt(this.requireReview ? 1 : 0);
        out.writeString(this.singularHintText);
        out.writeString(this.bulkHintText);
    }

    public WireServiceCenterStatus(String id, ServiceCenterStatus status, String str, Integer num, boolean z, boolean z2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f66762id = id;
        this.status = status;
        this.title = str;
        this.color = num;
        this.requireNotes = z;
        this.requireReview = z2;
        this.singularHintText = str2;
        this.bulkHintText = str3;
    }

    public /* synthetic */ WireServiceCenterStatus(String str, ServiceCenterStatus serviceCenterStatus, String str2, Integer num, boolean z, boolean z2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ServiceCenterStatus.UNKNOWN : serviceCenterStatus, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? -16777216 : num, (i & 16) != 0 ? false : z, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? null : str3, (i & 128) == 0 ? str4 : null);
    }
}
