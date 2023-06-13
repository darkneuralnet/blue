package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestPhoto;", "Landroid/os/Parcelable;", "id", "", "url", "tags", "", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getTags", "()Ljava/util/List;", "getUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestPhoto implements Parcelable {
    public static final Parcelable.Creator<WireNestPhoto> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66741id;
    @JsonProperty("tags")
    @InterfaceC41208ft5("tags")
    private final List<String> tags;
    @JsonProperty("url")
    @InterfaceC41208ft5("url")
    private final String url;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireNestPhoto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireNestPhoto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireNestPhoto(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireNestPhoto[] newArray(int i) {
            return new WireNestPhoto[i];
        }
    }

    public WireNestPhoto() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireNestPhoto copy$default(WireNestPhoto wireNestPhoto, String str, String str2, List list, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireNestPhoto.f66741id;
        }
        if ((i & 2) != 0) {
            str2 = wireNestPhoto.url;
        }
        if ((i & 4) != 0) {
            list = wireNestPhoto.tags;
        }
        if ((i & 8) != 0) {
            dateTime = wireNestPhoto.createdAt;
        }
        return wireNestPhoto.copy(str, str2, list, dateTime);
    }

    public final String component1() {
        return this.f66741id;
    }

    public final String component2() {
        return this.url;
    }

    public final List<String> component3() {
        return this.tags;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final WireNestPhoto copy(String id, String url, List<String> tags, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new WireNestPhoto(id, url, tags, createdAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestPhoto) {
            WireNestPhoto wireNestPhoto = (WireNestPhoto) obj;
            return Intrinsics.areEqual(this.f66741id, wireNestPhoto.f66741id) && Intrinsics.areEqual(this.url, wireNestPhoto.url) && Intrinsics.areEqual(this.tags, wireNestPhoto.tags) && Intrinsics.areEqual(this.createdAt, wireNestPhoto.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66741id;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.f66741id.hashCode() * 31) + this.url.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.f66741id;
        String str2 = this.url;
        List<String> list = this.tags;
        DateTime dateTime = this.createdAt;
        return "WireNestPhoto(id=" + str + ", url=" + str2 + ", tags=" + list + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66741id);
        out.writeString(this.url);
        out.writeStringList(this.tags);
        out.writeSerializable(this.createdAt);
    }

    public WireNestPhoto(String id, String url, List<String> tags, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66741id = id;
        this.url = url;
        this.tags = tags;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireNestPhoto(String str, String str2, List list, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, dateTime);
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        list = (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
