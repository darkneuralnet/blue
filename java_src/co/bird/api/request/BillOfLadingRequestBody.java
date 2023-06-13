package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/request/BillOfLadingRequestBody;", "", "id", "", "bolPictureUrls", "", "inbound", "", "(Ljava/lang/String;Ljava/util/List;Z)V", "getBolPictureUrls", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getInbound", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BillOfLadingRequestBody {
    @JsonProperty("bol_picture_urls")
    @InterfaceC41208ft5("bol_picture_urls")
    private final List<String> bolPictureUrls;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68198id;
    @JsonProperty("inbound")
    @InterfaceC41208ft5("inbound")
    private final boolean inbound;

    public BillOfLadingRequestBody(String id, List<String> bolPictureUrls, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bolPictureUrls, "bolPictureUrls");
        this.f68198id = id;
        this.bolPictureUrls = bolPictureUrls;
        this.inbound = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillOfLadingRequestBody copy$default(BillOfLadingRequestBody billOfLadingRequestBody, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billOfLadingRequestBody.f68198id;
        }
        if ((i & 2) != 0) {
            list = billOfLadingRequestBody.bolPictureUrls;
        }
        if ((i & 4) != 0) {
            z = billOfLadingRequestBody.inbound;
        }
        return billOfLadingRequestBody.copy(str, list, z);
    }

    public final String component1() {
        return this.f68198id;
    }

    public final List<String> component2() {
        return this.bolPictureUrls;
    }

    public final boolean component3() {
        return this.inbound;
    }

    public final BillOfLadingRequestBody copy(String id, List<String> bolPictureUrls, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bolPictureUrls, "bolPictureUrls");
        return new BillOfLadingRequestBody(id, bolPictureUrls, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillOfLadingRequestBody) {
            BillOfLadingRequestBody billOfLadingRequestBody = (BillOfLadingRequestBody) obj;
            return Intrinsics.areEqual(this.f68198id, billOfLadingRequestBody.f68198id) && Intrinsics.areEqual(this.bolPictureUrls, billOfLadingRequestBody.bolPictureUrls) && this.inbound == billOfLadingRequestBody.inbound;
        }
        return false;
    }

    public final List<String> getBolPictureUrls() {
        return this.bolPictureUrls;
    }

    public final String getId() {
        return this.f68198id;
    }

    public final boolean getInbound() {
        return this.inbound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f68198id.hashCode() * 31) + this.bolPictureUrls.hashCode()) * 31;
        boolean z = this.inbound;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f68198id;
        List<String> list = this.bolPictureUrls;
        boolean z = this.inbound;
        return "BillOfLadingRequestBody(id=" + str + ", bolPictureUrls=" + list + ", inbound=" + z + ")";
    }
}
