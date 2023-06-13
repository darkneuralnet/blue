package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/DeliveryLocationBody;", "", "location", "Lco/bird/android/model/wire/WireLocation;", "photoUrl", "", "notes", PaymentMethod.BillingDetails.PARAM_ADDRESS, "(Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getNotes", "getPhotoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryLocationBody {
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;

    public DeliveryLocationBody(WireLocation wireLocation, String str, String str2, String str3) {
        this.location = wireLocation;
        this.photoUrl = str;
        this.notes = str2;
        this.address = str3;
    }

    public static /* synthetic */ DeliveryLocationBody copy$default(DeliveryLocationBody deliveryLocationBody, WireLocation wireLocation, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = deliveryLocationBody.location;
        }
        if ((i & 2) != 0) {
            str = deliveryLocationBody.photoUrl;
        }
        if ((i & 4) != 0) {
            str2 = deliveryLocationBody.notes;
        }
        if ((i & 8) != 0) {
            str3 = deliveryLocationBody.address;
        }
        return deliveryLocationBody.copy(wireLocation, str, str2, str3);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final String component2() {
        return this.photoUrl;
    }

    public final String component3() {
        return this.notes;
    }

    public final String component4() {
        return this.address;
    }

    public final DeliveryLocationBody copy(WireLocation wireLocation, String str, String str2, String str3) {
        return new DeliveryLocationBody(wireLocation, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeliveryLocationBody) {
            DeliveryLocationBody deliveryLocationBody = (DeliveryLocationBody) obj;
            return Intrinsics.areEqual(this.location, deliveryLocationBody.location) && Intrinsics.areEqual(this.photoUrl, deliveryLocationBody.photoUrl) && Intrinsics.areEqual(this.notes, deliveryLocationBody.notes) && Intrinsics.areEqual(this.address, deliveryLocationBody.address);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        WireLocation wireLocation = this.location;
        int hashCode = (wireLocation == null ? 0 : wireLocation.hashCode()) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notes;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        String str = this.photoUrl;
        String str2 = this.notes;
        String str3 = this.address;
        return "DeliveryLocationBody(location=" + wireLocation + ", photoUrl=" + str + ", notes=" + str2 + ", address=" + str3 + ")";
    }

    public /* synthetic */ DeliveryLocationBody(WireLocation wireLocation, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireLocation, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
