package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LbT2;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "merchantSite", "", "", "offerDealIds", "", "offerRedeemed", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/wire/WireMerchantSite;", "b", "()Lco/bird/android/model/wire/WireMerchantSite;", "Ljava/util/List;", "getOfferDealIds", "()Ljava/util/List;", "Z", "getOfferRedeemed", "()Z", "<init>", "(Lco/bird/android/model/wire/WireMerchantSite;Ljava/util/List;Z)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bT2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38563bT2 {
    @JsonProperty("merchant_site")
    @InterfaceC41208ft5("merchant_site")
    private final WireMerchantSite merchantSite;
    @JsonProperty("redeemed_offer_deal_ids")
    @InterfaceC41208ft5("redeemed_offer_deal_ids")
    private final List<String> offerDealIds;
    @JsonProperty("offer_redeemed")
    @InterfaceC41208ft5("offer_redeemed")
    private final boolean offerRedeemed;

    public C38563bT2(WireMerchantSite merchantSite, List<String> offerDealIds, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
        Intrinsics.checkNotNullParameter(offerDealIds, "offerDealIds");
        this.merchantSite = merchantSite;
        this.offerDealIds = offerDealIds;
        this.offerRedeemed = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38563bT2 copy$default(C38563bT2 c38563bT2, WireMerchantSite wireMerchantSite, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wireMerchantSite = c38563bT2.merchantSite;
        }
        if ((i & 2) != 0) {
            list = c38563bT2.offerDealIds;
        }
        if ((i & 4) != 0) {
            z = c38563bT2.offerRedeemed;
        }
        return c38563bT2.m64518a(wireMerchantSite, list, z);
    }

    /* renamed from: a */
    public final C38563bT2 m64518a(WireMerchantSite merchantSite, List<String> offerDealIds, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
        Intrinsics.checkNotNullParameter(offerDealIds, "offerDealIds");
        return new C38563bT2(merchantSite, offerDealIds, z);
    }

    /* renamed from: b */
    public final WireMerchantSite m64517b() {
        return this.merchantSite;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38563bT2) {
            C38563bT2 c38563bT2 = (C38563bT2) obj;
            return Intrinsics.areEqual(this.merchantSite, c38563bT2.merchantSite) && Intrinsics.areEqual(this.offerDealIds, c38563bT2.offerDealIds) && this.offerRedeemed == c38563bT2.offerRedeemed;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.merchantSite.hashCode() * 31) + this.offerDealIds.hashCode()) * 31;
        boolean z = this.offerRedeemed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        WireMerchantSite wireMerchantSite = this.merchantSite;
        List<String> list = this.offerDealIds;
        boolean z = this.offerRedeemed;
        return "MerchantScanResponse(merchantSite=" + wireMerchantSite + ", offerDealIds=" + list + ", offerRedeemed=" + z + ")";
    }

    public /* synthetic */ C38563bT2(WireMerchantSite wireMerchantSite, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireMerchantSite, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z);
    }
}
