package co.bird.api.response;

import co.bird.android.model.wire.WireMerchantSite;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/api/response/MerchantSiteResponse;", "", "merchantSites", "", "Lco/bird/android/model/wire/WireMerchantSite;", "(Ljava/util/List;)V", "getMerchantSites", "()Ljava/util/List;", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MerchantSiteResponse {
    @JsonProperty("merchant_sites")
    @InterfaceC41208ft5("merchant_sites")
    private final List<WireMerchantSite> merchantSites;

    public MerchantSiteResponse() {
        this(null, 1, null);
    }

    public final List<WireMerchantSite> getMerchantSites() {
        return this.merchantSites;
    }

    public MerchantSiteResponse(List<WireMerchantSite> merchantSites) {
        Intrinsics.checkNotNullParameter(merchantSites, "merchantSites");
        this.merchantSites = merchantSites;
    }

    public /* synthetic */ MerchantSiteResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
