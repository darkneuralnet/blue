package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0003J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, m28432d2 = {"Lco/bird/api/response/WireInventory;", "", "sku", "", "name", "description", "defaultImageUrl", "healthyThreshold", "", "quantity", "shopifyLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getDefaultImageUrl", "()Ljava/lang/String;", "getDescription", "getHealthyThreshold", "()I", "getName", "getQuantity", "getShopifyLink", "getSku", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "displayName", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireInventory {
    @JsonProperty("default_image_url")
    @InterfaceC41208ft5("default_image_url")
    private final String defaultImageUrl;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("healthy_threshold")
    @InterfaceC41208ft5("healthy_threshold")
    private final int healthyThreshold;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("shopify_link")
    @InterfaceC41208ft5("shopify_link")
    private final String shopifyLink;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;

    public WireInventory() {
        this(null, null, null, null, 0, 0, null, 127, null);
    }

    public static /* synthetic */ WireInventory copy$default(WireInventory wireInventory, String str, String str2, String str3, String str4, int i, int i2, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = wireInventory.sku;
        }
        if ((i3 & 2) != 0) {
            str2 = wireInventory.name;
        }
        String str6 = str2;
        if ((i3 & 4) != 0) {
            str3 = wireInventory.description;
        }
        String str7 = str3;
        if ((i3 & 8) != 0) {
            str4 = wireInventory.defaultImageUrl;
        }
        String str8 = str4;
        if ((i3 & 16) != 0) {
            i = wireInventory.healthyThreshold;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = wireInventory.quantity;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            str5 = wireInventory.shopifyLink;
        }
        return wireInventory.copy(str, str6, str7, str8, i4, i5, str5);
    }

    public final String component1() {
        return this.sku;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.defaultImageUrl;
    }

    public final int component5() {
        return this.healthyThreshold;
    }

    public final int component6() {
        return this.quantity;
    }

    public final String component7() {
        return this.shopifyLink;
    }

    public final WireInventory copy(String sku, String str, String str2, String str3, int i, int i2, String str4) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new WireInventory(sku, str, str2, str3, i, i2, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String displayName() {
        boolean z;
        boolean z2;
        boolean z3;
        String str = this.name;
        boolean z4 = true;
        if (str != null) {
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z = true;
                if (!z) {
                    return this.name;
                }
                String str2 = this.description;
                if (str2 != null) {
                    if (str2.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                z4 = false;
                if (z4) {
                    return this.description;
                }
                return "";
            }
        }
        z = false;
        if (!z) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireInventory) {
            WireInventory wireInventory = (WireInventory) obj;
            return Intrinsics.areEqual(this.sku, wireInventory.sku) && Intrinsics.areEqual(this.name, wireInventory.name) && Intrinsics.areEqual(this.description, wireInventory.description) && Intrinsics.areEqual(this.defaultImageUrl, wireInventory.defaultImageUrl) && this.healthyThreshold == wireInventory.healthyThreshold && this.quantity == wireInventory.quantity && Intrinsics.areEqual(this.shopifyLink, wireInventory.shopifyLink);
        }
        return false;
    }

    public final String getDefaultImageUrl() {
        return this.defaultImageUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public final String getName() {
        return this.name;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getShopifyLink() {
        return this.shopifyLink;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int hashCode = this.sku.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultImageUrl;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.healthyThreshold)) * 31) + Integer.hashCode(this.quantity)) * 31;
        String str4 = this.shopifyLink;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.sku;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.defaultImageUrl;
        int i = this.healthyThreshold;
        int i2 = this.quantity;
        String str5 = this.shopifyLink;
        return "WireInventory(sku=" + str + ", name=" + str2 + ", description=" + str3 + ", defaultImageUrl=" + str4 + ", healthyThreshold=" + i + ", quantity=" + i2 + ", shopifyLink=" + str5 + ")";
    }

    public WireInventory(String sku, String str, String str2, String str3, int i, int i2, String str4) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.name = str;
        this.description = str2;
        this.defaultImageUrl = str3;
        this.healthyThreshold = i;
        this.quantity = i2;
        this.shopifyLink = str4;
    }

    public /* synthetic */ WireInventory(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0 ? str5 : null);
    }
}
