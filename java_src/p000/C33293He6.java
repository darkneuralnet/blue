package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LHe6;", "", "", "merchantSiteId", "merchantId", "", "enabled", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getMerchantSiteId", "()Ljava/lang/String;", "getMerchantId", "Z", "getEnabled", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: He6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33293He6 {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("merchant_id")
    @InterfaceC41208ft5("merchant_id")
    private final String merchantId;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")
    private final String merchantSiteId;

    public C33293He6() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ C33293He6 copy$default(C33293He6 c33293He6, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33293He6.merchantSiteId;
        }
        if ((i & 2) != 0) {
            str2 = c33293He6.merchantId;
        }
        if ((i & 4) != 0) {
            z = c33293He6.enabled;
        }
        return c33293He6.m103580a(str, str2, z);
    }

    /* renamed from: a */
    public final C33293He6 m103580a(String merchantSiteId, String merchantId, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        return new C33293He6(merchantSiteId, merchantId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33293He6) {
            C33293He6 c33293He6 = (C33293He6) obj;
            return Intrinsics.areEqual(this.merchantSiteId, c33293He6.merchantSiteId) && Intrinsics.areEqual(this.merchantId, c33293He6.merchantId) && this.enabled == c33293He6.enabled;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.merchantSiteId.hashCode() * 31) + this.merchantId.hashCode()) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.merchantSiteId;
        String str2 = this.merchantId;
        boolean z = this.enabled;
        return "UpdateMerchantAutoLocationEnabledBody(merchantSiteId=" + str + ", merchantId=" + str2 + ", enabled=" + z + ")";
    }

    public C33293He6(String merchantSiteId, String merchantId, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        this.merchantSiteId = merchantSiteId;
        this.merchantId = merchantId;
        this.enabled = z;
    }

    public /* synthetic */ C33293He6(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
