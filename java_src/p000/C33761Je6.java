package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LJe6;", "", "", "merchantSiteId", "merchantId", "", "open", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getMerchantSiteId", "()Ljava/lang/String;", "getMerchantId", "Z", "getOpen", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Je6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33761Je6 {
    @JsonProperty("merchant_id")
    @InterfaceC41208ft5("merchant_id")
    private final String merchantId;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")
    private final String merchantSiteId;
    @JsonProperty("open")
    @InterfaceC41208ft5("open")
    private final boolean open;

    public C33761Je6() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ C33761Je6 copy$default(C33761Je6 c33761Je6, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33761Je6.merchantSiteId;
        }
        if ((i & 2) != 0) {
            str2 = c33761Je6.merchantId;
        }
        if ((i & 4) != 0) {
            z = c33761Je6.open;
        }
        return c33761Je6.m100054a(str, str2, z);
    }

    /* renamed from: a */
    public final C33761Je6 m100054a(String merchantSiteId, String merchantId, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        return new C33761Je6(merchantSiteId, merchantId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33761Je6) {
            C33761Je6 c33761Je6 = (C33761Je6) obj;
            return Intrinsics.areEqual(this.merchantSiteId, c33761Je6.merchantSiteId) && Intrinsics.areEqual(this.merchantId, c33761Je6.merchantId) && this.open == c33761Je6.open;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.merchantSiteId.hashCode() * 31) + this.merchantId.hashCode()) * 31;
        boolean z = this.open;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.merchantSiteId;
        String str2 = this.merchantId;
        boolean z = this.open;
        return "UpdateMerchantSiteOpenBody(merchantSiteId=" + str + ", merchantId=" + str2 + ", open=" + z + ")";
    }

    public C33761Je6(String merchantSiteId, String merchantId, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        this.merchantSiteId = merchantSiteId;
        this.merchantId = merchantId;
        this.open = z;
    }

    public /* synthetic */ C33761Je6(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}