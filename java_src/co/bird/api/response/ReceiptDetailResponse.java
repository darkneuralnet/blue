package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JD\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/response/ReceiptDetailResponse;", "", "id", "", "lineItems", "", "Lco/bird/api/response/ReceiptDetailLineItem;", "showDownloadInvoiceButton", "", "title", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLineItems", "()Ljava/util/List;", "getShowDownloadInvoiceButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lco/bird/api/response/ReceiptDetailResponse;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReceiptDetailResponse {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68225id;
    @JsonProperty("line_items")
    @InterfaceC41208ft5("line_items")
    private final List<ReceiptDetailLineItem> lineItems;
    @JsonProperty("show_download_invoice_button")
    @InterfaceC41208ft5("show_download_invoice_button")
    private final Boolean showDownloadInvoiceButton;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public ReceiptDetailResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReceiptDetailResponse copy$default(ReceiptDetailResponse receiptDetailResponse, String str, List list, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receiptDetailResponse.f68225id;
        }
        if ((i & 2) != 0) {
            list = receiptDetailResponse.lineItems;
        }
        if ((i & 4) != 0) {
            bool = receiptDetailResponse.showDownloadInvoiceButton;
        }
        if ((i & 8) != 0) {
            str2 = receiptDetailResponse.title;
        }
        return receiptDetailResponse.copy(str, list, bool, str2);
    }

    public final String component1() {
        return this.f68225id;
    }

    public final List<ReceiptDetailLineItem> component2() {
        return this.lineItems;
    }

    public final Boolean component3() {
        return this.showDownloadInvoiceButton;
    }

    public final String component4() {
        return this.title;
    }

    public final ReceiptDetailResponse copy(String str, List<ReceiptDetailLineItem> list, Boolean bool, String str2) {
        return new ReceiptDetailResponse(str, list, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReceiptDetailResponse) {
            ReceiptDetailResponse receiptDetailResponse = (ReceiptDetailResponse) obj;
            return Intrinsics.areEqual(this.f68225id, receiptDetailResponse.f68225id) && Intrinsics.areEqual(this.lineItems, receiptDetailResponse.lineItems) && Intrinsics.areEqual(this.showDownloadInvoiceButton, receiptDetailResponse.showDownloadInvoiceButton) && Intrinsics.areEqual(this.title, receiptDetailResponse.title);
        }
        return false;
    }

    public final String getId() {
        return this.f68225id;
    }

    public final List<ReceiptDetailLineItem> getLineItems() {
        return this.lineItems;
    }

    public final Boolean getShowDownloadInvoiceButton() {
        return this.showDownloadInvoiceButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.f68225id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReceiptDetailLineItem> list = this.lineItems;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.showDownloadInvoiceButton;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68225id;
        List<ReceiptDetailLineItem> list = this.lineItems;
        Boolean bool = this.showDownloadInvoiceButton;
        String str2 = this.title;
        return "ReceiptDetailResponse(id=" + str + ", lineItems=" + list + ", showDownloadInvoiceButton=" + bool + ", title=" + str2 + ")";
    }

    public ReceiptDetailResponse(String str, List<ReceiptDetailLineItem> list, Boolean bool, String str2) {
        this.f68225id = str;
        this.lineItems = list;
        this.showDownloadInvoiceButton = bool;
        this.title = str2;
    }

    public /* synthetic */ ReceiptDetailResponse(String str, List list, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2);
    }
}
