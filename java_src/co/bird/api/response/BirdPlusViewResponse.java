package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JW\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m28432d2 = {"Lco/bird/api/response/BirdPlusViewResponse;", "", "available", "", "Lco/bird/api/response/WireBirdPlusView;", "active", "ineligible", "display", "Lco/bird/api/response/WireBirdPlusDisplay;", "zendeskArticleId", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/api/response/WireBirdPlusDisplay;Ljava/lang/String;)V", "getActive", "()Ljava/util/List;", "getAvailable", "getDisplay", "()Lco/bird/api/response/WireBirdPlusDisplay;", "getIneligible", "getZendeskArticleId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusViewResponse {
    @JsonProperty("active")
    @InterfaceC41208ft5("active")
    private final List<WireBirdPlusView> active;
    @JsonProperty("available")
    @InterfaceC41208ft5("available")
    private final List<WireBirdPlusView> available;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final WireBirdPlusDisplay display;
    @JsonProperty("ineligible")
    @InterfaceC41208ft5("ineligible")
    private final List<WireBirdPlusView> ineligible;
    @JsonProperty("zendesk_article_id")
    @InterfaceC41208ft5("zendesk_article_id")
    private final String zendeskArticleId;

    public BirdPlusViewResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BirdPlusViewResponse copy$default(BirdPlusViewResponse birdPlusViewResponse, List list, List list2, List list3, WireBirdPlusDisplay wireBirdPlusDisplay, String str, int i, Object obj) {
        List<WireBirdPlusView> list4 = list;
        if ((i & 1) != 0) {
            list4 = birdPlusViewResponse.available;
        }
        List<WireBirdPlusView> list5 = list2;
        if ((i & 2) != 0) {
            list5 = birdPlusViewResponse.active;
        }
        List list6 = list5;
        List<WireBirdPlusView> list7 = list3;
        if ((i & 4) != 0) {
            list7 = birdPlusViewResponse.ineligible;
        }
        List list8 = list7;
        if ((i & 8) != 0) {
            wireBirdPlusDisplay = birdPlusViewResponse.display;
        }
        WireBirdPlusDisplay wireBirdPlusDisplay2 = wireBirdPlusDisplay;
        if ((i & 16) != 0) {
            str = birdPlusViewResponse.zendeskArticleId;
        }
        return birdPlusViewResponse.copy(list4, list6, list8, wireBirdPlusDisplay2, str);
    }

    public final List<WireBirdPlusView> component1() {
        return this.available;
    }

    public final List<WireBirdPlusView> component2() {
        return this.active;
    }

    public final List<WireBirdPlusView> component3() {
        return this.ineligible;
    }

    public final WireBirdPlusDisplay component4() {
        return this.display;
    }

    public final String component5() {
        return this.zendeskArticleId;
    }

    public final BirdPlusViewResponse copy(List<WireBirdPlusView> list, List<WireBirdPlusView> list2, List<WireBirdPlusView> list3, WireBirdPlusDisplay wireBirdPlusDisplay, String str) {
        return new BirdPlusViewResponse(list, list2, list3, wireBirdPlusDisplay, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPlusViewResponse) {
            BirdPlusViewResponse birdPlusViewResponse = (BirdPlusViewResponse) obj;
            return Intrinsics.areEqual(this.available, birdPlusViewResponse.available) && Intrinsics.areEqual(this.active, birdPlusViewResponse.active) && Intrinsics.areEqual(this.ineligible, birdPlusViewResponse.ineligible) && Intrinsics.areEqual(this.display, birdPlusViewResponse.display) && Intrinsics.areEqual(this.zendeskArticleId, birdPlusViewResponse.zendeskArticleId);
        }
        return false;
    }

    public final List<WireBirdPlusView> getActive() {
        return this.active;
    }

    public final List<WireBirdPlusView> getAvailable() {
        return this.available;
    }

    public final WireBirdPlusDisplay getDisplay() {
        return this.display;
    }

    public final List<WireBirdPlusView> getIneligible() {
        return this.ineligible;
    }

    public final String getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        List<WireBirdPlusView> list = this.available;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<WireBirdPlusView> list2 = this.active;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<WireBirdPlusView> list3 = this.ineligible;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WireBirdPlusDisplay wireBirdPlusDisplay = this.display;
        int hashCode4 = (hashCode3 + (wireBirdPlusDisplay == null ? 0 : wireBirdPlusDisplay.hashCode())) * 31;
        String str = this.zendeskArticleId;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<WireBirdPlusView> list = this.available;
        List<WireBirdPlusView> list2 = this.active;
        List<WireBirdPlusView> list3 = this.ineligible;
        WireBirdPlusDisplay wireBirdPlusDisplay = this.display;
        String str = this.zendeskArticleId;
        return "BirdPlusViewResponse(available=" + list + ", active=" + list2 + ", ineligible=" + list3 + ", display=" + wireBirdPlusDisplay + ", zendeskArticleId=" + str + ")";
    }

    public BirdPlusViewResponse(List<WireBirdPlusView> list, List<WireBirdPlusView> list2, List<WireBirdPlusView> list3, WireBirdPlusDisplay wireBirdPlusDisplay, String str) {
        this.available = list;
        this.active = list2;
        this.ineligible = list3;
        this.display = wireBirdPlusDisplay;
        this.zendeskArticleId = str;
    }

    public /* synthetic */ BirdPlusViewResponse(List list, List list2, List list3, WireBirdPlusDisplay wireBirdPlusDisplay, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : wireBirdPlusDisplay, (i & 16) != 0 ? null : str);
    }
}
