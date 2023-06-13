package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/Link;", "Landroid/os/Parcelable;", "id", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "userId", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCode", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "setCreatedAt", "(Lorg/joda/time/DateTime;)V", "getId", "getUserId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Link implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Creator();
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66602id;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Link> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Link createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Link(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Link[] newArray(int i) {
            return new Link[i];
        }
    }

    public Link() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = link.f66602id;
        }
        if ((i & 2) != 0) {
            str2 = link.code;
        }
        if ((i & 4) != 0) {
            str3 = link.userId;
        }
        if ((i & 8) != 0) {
            dateTime = link.createdAt;
        }
        return link.copy(str, str2, str3, dateTime);
    }

    public final String component1() {
        return this.f66602id;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.userId;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final Link copy(String id, String code, String str, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        return new Link(id, code, str, dateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Link) {
            Link link = (Link) obj;
            return Intrinsics.areEqual(this.f66602id, link.f66602id) && Intrinsics.areEqual(this.code, link.code) && Intrinsics.areEqual(this.userId, link.userId) && Intrinsics.areEqual(this.createdAt, link.createdAt);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66602id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((this.f66602id.hashCode() * 31) + this.code.hashCode()) * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        return hashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final void setCreatedAt(DateTime dateTime) {
        this.createdAt = dateTime;
    }

    public String toString() {
        String str = this.f66602id;
        String str2 = this.code;
        String str3 = this.userId;
        DateTime dateTime = this.createdAt;
        return "Link(id=" + str + ", code=" + str2 + ", userId=" + str3 + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66602id);
        out.writeString(this.code);
        out.writeString(this.userId);
        out.writeSerializable(this.createdAt);
    }

    public Link(String id, String code, String str, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f66602id = id;
        this.code = code;
        this.userId = str;
        this.createdAt = dateTime;
    }

    public /* synthetic */ Link(String str, String str2, String str3, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : dateTime);
    }
}
