package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/request/CreateProvisionalNestBody;", "", "location", "Lco/bird/android/model/wire/WireLocation;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "photoUrls", "", "notes", "(Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getNotes", "getPhotoUrls", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CreateProvisionalNestBody {
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photo_urls")
    @InterfaceC41208ft5("photo_urls")
    private final List<String> photoUrls;

    public CreateProvisionalNestBody(WireLocation location, String str, List<String> photoUrls, String str2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        this.location = location;
        this.address = str;
        this.photoUrls = photoUrls;
        this.notes = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateProvisionalNestBody copy$default(CreateProvisionalNestBody createProvisionalNestBody, WireLocation wireLocation, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = createProvisionalNestBody.location;
        }
        if ((i & 2) != 0) {
            str = createProvisionalNestBody.address;
        }
        if ((i & 4) != 0) {
            list = createProvisionalNestBody.photoUrls;
        }
        if ((i & 8) != 0) {
            str2 = createProvisionalNestBody.notes;
        }
        return createProvisionalNestBody.copy(wireLocation, str, list, str2);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final String component2() {
        return this.address;
    }

    public final List<String> component3() {
        return this.photoUrls;
    }

    public final String component4() {
        return this.notes;
    }

    public final CreateProvisionalNestBody copy(WireLocation location, String str, List<String> photoUrls, String str2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        return new CreateProvisionalNestBody(location, str, photoUrls, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateProvisionalNestBody) {
            CreateProvisionalNestBody createProvisionalNestBody = (CreateProvisionalNestBody) obj;
            return Intrinsics.areEqual(this.location, createProvisionalNestBody.location) && Intrinsics.areEqual(this.address, createProvisionalNestBody.address) && Intrinsics.areEqual(this.photoUrls, createProvisionalNestBody.photoUrls) && Intrinsics.areEqual(this.notes, createProvisionalNestBody.notes);
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

    public final List<String> getPhotoUrls() {
        return this.photoUrls;
    }

    public int hashCode() {
        int hashCode = this.location.hashCode() * 31;
        String str = this.address;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.photoUrls.hashCode()) * 31;
        String str2 = this.notes;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        String str = this.address;
        List<String> list = this.photoUrls;
        String str2 = this.notes;
        return "CreateProvisionalNestBody(location=" + wireLocation + ", address=" + str + ", photoUrls=" + list + ", notes=" + str2 + ")";
    }

    public /* synthetic */ CreateProvisionalNestBody(WireLocation wireLocation, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireLocation, (i & 2) != 0 ? null : str, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str2);
    }
}
